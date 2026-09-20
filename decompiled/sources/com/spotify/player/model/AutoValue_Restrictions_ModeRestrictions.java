package com.spotify.player.model;

import java.util.Map;
import p204p.s571;
import p204p.xf40;
import p204p.y85;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_Restrictions_ModeRestrictions extends Restrictions.ModeRestrictions {
    private final xf40 values;

    public static final class Builder extends Restrictions.ModeRestrictions.Builder {
        private xf40 values;

        @Override // com.spotify.player.model.Restrictions.ModeRestrictions.Builder
        public Restrictions.ModeRestrictions build() {
            xf40 xf40Var = this.values;
            if (xf40Var != null) {
                return new AutoValue_Restrictions_ModeRestrictions(xf40Var, 0);
            }
            throw new IllegalStateException("Missing required properties: values");
        }

        @Override // com.spotify.player.model.Restrictions.ModeRestrictions.Builder
        public Restrictions.ModeRestrictions.Builder values(Map<String, Restrictions.RestrictionReasons> map) {
            this.values = xf40.m90451c(map);
            return this;
        }
    }

    public /* synthetic */ AutoValue_Restrictions_ModeRestrictions(xf40 xf40Var, int i) {
        this(xf40Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Restrictions.ModeRestrictions)) {
            return false;
        }
        xf40 xf40Var = this.values;
        xf40 xf40VarValues = ((Restrictions.ModeRestrictions) obj).values();
        xf40Var.getClass();
        return y85.m93065j(xf40VarValues, xf40Var);
    }

    public int hashCode() {
        return this.values.hashCode() ^ 1000003;
    }

    public String toString() {
        return s571.m77251j("ModeRestrictions{values=", String.valueOf(this.values), "}");
    }

    @Override // com.spotify.player.model.Restrictions.ModeRestrictions
    public xf40 values() {
        return this.values;
    }

    private AutoValue_Restrictions_ModeRestrictions(xf40 xf40Var) {
        this.values = xf40Var;
    }
}
