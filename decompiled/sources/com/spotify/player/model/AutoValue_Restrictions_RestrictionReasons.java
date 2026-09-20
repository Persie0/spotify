package com.spotify.player.model;

import java.util.Set;
import p204p.hg40;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Restrictions_RestrictionReasons extends Restrictions.RestrictionReasons {
    private final hg40 reasons;

    public static final class Builder extends Restrictions.RestrictionReasons.Builder {
        private hg40 reasons;

        @Override // com.spotify.player.model.Restrictions.RestrictionReasons.Builder
        public Restrictions.RestrictionReasons build() {
            hg40 hg40Var = this.reasons;
            if (hg40Var != null) {
                return new AutoValue_Restrictions_RestrictionReasons(hg40Var, 0);
            }
            throw new IllegalStateException("Missing required properties: reasons");
        }

        @Override // com.spotify.player.model.Restrictions.RestrictionReasons.Builder
        public Restrictions.RestrictionReasons.Builder reasons(Set<String> set) {
            this.reasons = hg40.m47406p(set);
            return this;
        }
    }

    public /* synthetic */ AutoValue_Restrictions_RestrictionReasons(hg40 hg40Var, int i) {
        this(hg40Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Restrictions.RestrictionReasons) {
            return this.reasons.equals(((Restrictions.RestrictionReasons) obj).reasons());
        }
        return false;
    }

    public int hashCode() {
        return this.reasons.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.Restrictions.RestrictionReasons
    public hg40 reasons() {
        return this.reasons;
    }

    public String toString() {
        return s571.m77251j("RestrictionReasons{reasons=", String.valueOf(this.reasons), "}");
    }

    private AutoValue_Restrictions_RestrictionReasons(hg40 hg40Var) {
        this.reasons = hg40Var;
    }
}
