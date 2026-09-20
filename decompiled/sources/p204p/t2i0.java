package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t2i0 implements u2i0 {

    /* JADX INFO: renamed from: a */
    public final String f216568a;

    /* JADX INFO: renamed from: b */
    public final String f216569b;

    /* JADX INFO: renamed from: c */
    public final int f216570c;

    public t2i0(String str, String str2, int i) {
        this.f216568a = str;
        this.f216569b = str2;
        this.f216570c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2i0)) {
            return false;
        }
        t2i0 t2i0Var = (t2i0) obj;
        return wj50.m88271j(this.f216568a, t2i0Var.f216568a) && wj50.m88271j(this.f216569b, t2i0Var.f216569b) && this.f216570c == t2i0Var.f216570c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f216570c) + s571.m77243b(this.f216568a.hashCode() * 31, 31, this.f216569b);
    }
}
