package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bv2 implements dv2 {

    /* JADX INFO: renamed from: a */
    public final String f31258a;

    public bv2(String str) {
        this.f31258a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv2) && wj50.m88271j(this.f31258a, ((bv2) obj).f31258a);
    }

    public final int hashCode() {
        return this.f31258a.hashCode();
    }
}
