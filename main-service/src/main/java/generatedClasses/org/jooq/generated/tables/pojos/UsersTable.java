/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String email;
    private String password;
    private LocalDateTime registeredAt;

    public UsersTable() {}

    public UsersTable(UsersTable value) {
        this.id = value.id;
        this.email = value.email;
        this.password = value.password;
        this.registeredAt = value.registeredAt;
    }

    public UsersTable(
        UUID id,
        String email,
        String password,
        LocalDateTime registeredAt
    ) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.registeredAt = registeredAt;
    }

    /**
     * Getter for <code>public.users_table.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.users_table.id</code>.
     */
    public UsersTable setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>public.users_table.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>public.users_table.email</code>.
     */
    public UsersTable setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>public.users_table.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>public.users_table.password</code>.
     */
    public UsersTable setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>public.users_table.registered_at</code>.
     */
    public LocalDateTime getRegisteredAt() {
        return this.registeredAt;
    }

    /**
     * Setter for <code>public.users_table.registered_at</code>.
     */
    public UsersTable setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UsersTable other = (UsersTable) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.registeredAt == null) {
            if (other.registeredAt != null)
                return false;
        }
        else if (!this.registeredAt.equals(other.registeredAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.registeredAt == null) ? 0 : this.registeredAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UsersTable (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(password);
        sb.append(", ").append(registeredAt);

        sb.append(")");
        return sb.toString();
    }
}