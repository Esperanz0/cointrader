package org.cryptocoinpartners.schema;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * @author Tim Olson
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class EntityBase {

    @Id
    @Column(columnDefinition = "BINARY(16)", length = 16, updatable = false, nullable = false)
    public UUID getId() {
        ensureId();
        return id;
    }

    @Version
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        // generated by IDEA
        if (this == o)
            return true;
        if (!(o instanceof EntityBase))
            return false;
        EntityBase that = (EntityBase) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        ensureId();
        return id.hashCode();
    }

    // JPA
    protected EntityBase() {
    }

    protected void setId(UUID id) {
        this.id = id;
    }

    private void ensureId() {
        if (id == null)
            id = UUID.randomUUID();
    }

    private UUID id;
}
