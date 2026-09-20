package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x010 implements y010 {

    /* JADX INFO: renamed from: a */
    public final String f256750a;

    /* JADX INFO: renamed from: b */
    public final String f256751b;

    public x010(String str, String str2) {
        this.f256750a = str;
        this.f256751b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m89493a() {
        return this.f256751b;
    }

    /* JADX INFO: renamed from: b */
    public final String m89494b() {
        return this.f256750a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x010)) {
            return false;
        }
        x010 x010Var = (x010) obj;
        return wj50.m88271j(this.f256750a, x010Var.f256750a) && wj50.m88271j(this.f256751b, x010Var.f256751b);
    }

    public final int hashCode() {
        return this.f256751b.hashCode() + s571.m77243b(edb.m38547C(2) * 31, 31, this.f256750a);
    }
}
