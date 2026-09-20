package com.spotify.mobius;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_First<M, F> extends First<M, F> {

    /* JADX INFO: renamed from: a */
    public final Object f5529a;

    /* JADX INFO: renamed from: b */
    public final Set f5530b;

    public AutoValue_First(Object obj, Set set) {
        if (obj == null) {
            throw new NullPointerException("Null model");
        }
        this.f5529a = obj;
        if (set == null) {
            throw new NullPointerException("Null effects");
        }
        this.f5530b = set;
    }

    @Override // com.spotify.mobius.First
    /* JADX INFO: renamed from: a */
    public final Set mo15559a() {
        return this.f5530b;
    }

    @Override // com.spotify.mobius.First
    /* JADX INFO: renamed from: d */
    public final Object mo15560d() {
        return this.f5529a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof First) {
            AutoValue_First autoValue_First = (AutoValue_First) ((First) obj);
            if (this.f5529a.equals(autoValue_First.f5529a) && this.f5530b.equals(autoValue_First.f5530b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5529a.hashCode() ^ 1000003) * 1000003) ^ this.f5530b.hashCode();
    }

    public final String toString() {
        return "First{model=" + this.f5529a + ", effects=" + this.f5530b + "}";
    }
}
