package com.spotify.mobius;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Next<M, F> extends Next<M, F> {

    /* JADX INFO: renamed from: a */
    public final Object f5531a;

    /* JADX INFO: renamed from: b */
    public final Set f5532b;

    public AutoValue_Next(Object obj, Set set) {
        this.f5531a = obj;
        if (set == null) {
            throw new NullPointerException("Null effects");
        }
        this.f5532b = set;
    }

    @Override // com.spotify.mobius.Next
    /* JADX INFO: renamed from: b */
    public final Set mo15561b() {
        return this.f5532b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Next) {
            Next next = (Next) obj;
            Object obj2 = this.f5531a;
            if (obj2 != null ? obj2.equals(((AutoValue_Next) next).f5531a) : ((AutoValue_Next) next).f5531a == null) {
                if (this.f5532b.equals(((AutoValue_Next) next).f5532b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5531a;
        return (((obj == null ? 0 : obj.hashCode()) ^ 1000003) * 1000003) ^ this.f5532b.hashCode();
    }

    public final String toString() {
        return "Next{model=" + this.f5531a + ", effects=" + this.f5532b + "}";
    }
}
