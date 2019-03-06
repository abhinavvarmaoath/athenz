//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// JWK -
//
public class JWK {
    public String kty;
    public String kid;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String alg;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String use;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String crv;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String x;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String y;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String n;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String e;

    public JWK setKty(String kty) {
        this.kty = kty;
        return this;
    }
    public String getKty() {
        return kty;
    }
    public JWK setKid(String kid) {
        this.kid = kid;
        return this;
    }
    public String getKid() {
        return kid;
    }
    public JWK setAlg(String alg) {
        this.alg = alg;
        return this;
    }
    public String getAlg() {
        return alg;
    }
    public JWK setUse(String use) {
        this.use = use;
        return this;
    }
    public String getUse() {
        return use;
    }
    public JWK setCrv(String crv) {
        this.crv = crv;
        return this;
    }
    public String getCrv() {
        return crv;
    }
    public JWK setX(String x) {
        this.x = x;
        return this;
    }
    public String getX() {
        return x;
    }
    public JWK setY(String y) {
        this.y = y;
        return this;
    }
    public String getY() {
        return y;
    }
    public JWK setN(String n) {
        this.n = n;
        return this;
    }
    public String getN() {
        return n;
    }
    public JWK setE(String e) {
        this.e = e;
        return this;
    }
    public String getE() {
        return e;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != JWK.class) {
                return false;
            }
            JWK a = (JWK) another;
            if (kty == null ? a.kty != null : !kty.equals(a.kty)) {
                return false;
            }
            if (kid == null ? a.kid != null : !kid.equals(a.kid)) {
                return false;
            }
            if (alg == null ? a.alg != null : !alg.equals(a.alg)) {
                return false;
            }
            if (use == null ? a.use != null : !use.equals(a.use)) {
                return false;
            }
            if (crv == null ? a.crv != null : !crv.equals(a.crv)) {
                return false;
            }
            if (x == null ? a.x != null : !x.equals(a.x)) {
                return false;
            }
            if (y == null ? a.y != null : !y.equals(a.y)) {
                return false;
            }
            if (n == null ? a.n != null : !n.equals(a.n)) {
                return false;
            }
            if (e == null ? a.e != null : !e.equals(a.e)) {
                return false;
            }
        }
        return true;
    }
}
