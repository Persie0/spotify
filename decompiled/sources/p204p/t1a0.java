package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t1a0 implements v1a0 {

    /* JADX INFO: renamed from: a */
    public final String f216204a;

    /* JADX INFO: renamed from: b */
    public final String f216205b;

    public t1a0(String str, String str2) {
        this.f216204a = str;
        this.f216205b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1a0)) {
            return false;
        }
        t1a0 t1a0Var = (t1a0) obj;
        return wj50.m88271j(this.f216204a, t1a0Var.f216204a) && wj50.m88271j(this.f216205b, t1a0Var.f216205b);
    }

    public final int hashCode() {
        return this.f216205b.hashCode() + (this.f216204a.hashCode() * 31);
    }
}
