//
// This file generated by rdl 1.4.12. Do not modify!
//

package com.yahoo.athenz.zms;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// Domain - A domain is an independent partition of users, roles, and
// resources. Its name represents the definition of a namespace; the only way a
// new namespace can be created, from the top, is by creating Domains.
// Administration of a domain is governed by the parent domain (using
// reverse-DNS namespaces). The top level domains are governed by the special
// "sys.auth" domain.
//
@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class Domain {
    public String name;
    @RdlOptional
    public Timestamp modified;
    @RdlOptional
    public UUID id;
    @RdlOptional
    public String description;
    @RdlOptional
    public String org;
    @RdlOptional
    public Boolean enabled;
    @RdlOptional
    public Boolean auditEnabled;
    @RdlOptional
    public String account;
    @RdlOptional
    public Integer ypmId;

    public Domain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Domain setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public Domain setId(UUID id) {
        this.id = id;
        return this;
    }
    public UUID getId() {
        return id;
    }
    public Domain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return description;
    }
    public Domain setOrg(String org) {
        this.org = org;
        return this;
    }
    public String getOrg() {
        return org;
    }
    public Domain setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public Domain setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }
    public Domain setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public Domain setYpmId(Integer ypmId) {
        this.ypmId = ypmId;
        return this;
    }
    public Integer getYpmId() {
        return ypmId;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Domain.class) {
                return false;
            }
            Domain a = (Domain) another;
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (id == null ? a.id != null : !id.equals(a.id)) {
                return false;
            }
            if (description == null ? a.description != null : !description.equals(a.description)) {
                return false;
            }
            if (org == null ? a.org != null : !org.equals(a.org)) {
                return false;
            }
            if (enabled == null ? a.enabled != null : !enabled.equals(a.enabled)) {
                return false;
            }
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (ypmId == null ? a.ypmId != null : !ypmId.equals(a.ypmId)) {
                return false;
            }
        }
        return true;
    }

    //
    // sets up the instance according to its default field values, if any
    //
    public Domain init() {
        if (enabled == null) {
            enabled = true;
        }
        if (auditEnabled == null) {
            auditEnabled = false;
        }
        return this;
    }
}
