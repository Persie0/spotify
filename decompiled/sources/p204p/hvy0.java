package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hvy0 implements jvy0 {

    /* JADX INFO: renamed from: a */
    public final String f95819a;

    public hvy0(String str) {
        this.f95819a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvy0) && wj50.m88271j(this.f95819a, ((hvy0) obj).f95819a);
    }

    public final int hashCode() {
        return this.f95819a.hashCode();
    }
}
