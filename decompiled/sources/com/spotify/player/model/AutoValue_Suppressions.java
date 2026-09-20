package com.spotify.player.model;

import p204p.hg40;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Suppressions extends Suppressions {
    private final hg40 providers;

    public AutoValue_Suppressions(hg40 hg40Var) {
        if (hg40Var == null) {
            throw new NullPointerException("Null providers");
        }
        this.providers = hg40Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Suppressions) {
            return this.providers.equals(((Suppressions) obj).providers());
        }
        return false;
    }

    public int hashCode() {
        return this.providers.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.Suppressions
    public hg40 providers() {
        return this.providers;
    }

    public String toString() {
        return s571.m77251j("Suppressions{providers=", String.valueOf(this.providers), "}");
    }
}
