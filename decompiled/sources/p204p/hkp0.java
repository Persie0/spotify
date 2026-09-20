package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hkp0 implements ikp0 {

    /* JADX INFO: renamed from: a */
    public final String f92468a;

    public hkp0(String str) {
        this.f92468a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkp0) && wj50.m88271j(this.f92468a, ((hkp0) obj).f92468a);
    }

    public final int hashCode() {
        return this.f92468a.hashCode();
    }
}
