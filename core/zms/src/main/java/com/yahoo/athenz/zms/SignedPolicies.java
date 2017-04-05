//
// This file generated by rdl 1.4.12. Do not modify!
//

package com.yahoo.athenz.zms;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// SignedPolicies - A signed bulk transfer of policies. The data is signed with
// server's private key.
//
@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class SignedPolicies {
    public DomainPolicies contents;
    public String signature;
    public String keyId;

    public SignedPolicies setContents(DomainPolicies contents) {
        this.contents = contents;
        return this;
    }
    public DomainPolicies getContents() {
        return contents;
    }
    public SignedPolicies setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return signature;
    }
    public SignedPolicies setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return keyId;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != SignedPolicies.class) {
                return false;
            }
            SignedPolicies a = (SignedPolicies) another;
            if (contents == null ? a.contents != null : !contents.equals(a.contents)) {
                return false;
            }
            if (signature == null ? a.signature != null : !signature.equals(a.signature)) {
                return false;
            }
            if (keyId == null ? a.keyId != null : !keyId.equals(a.keyId)) {
                return false;
            }
        }
        return true;
    }
}
