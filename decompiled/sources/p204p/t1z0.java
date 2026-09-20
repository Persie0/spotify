package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t1z0 extends v1z0 {

    /* JADX INFO: renamed from: a */
    public final String f216388a;

    /* JADX INFO: renamed from: b */
    public final boolean f216389b;

    public t1z0(String str, boolean z) {
        this.f216388a = str;
        this.f216389b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m79886a() {
        return this.f216388a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m79887b() {
        return this.f216389b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1z0)) {
            return false;
        }
        t1z0 t1z0Var = (t1z0) obj;
        return this.f216388a.equals(t1z0Var.f216388a) && this.f216389b == t1z0Var.f216389b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s571.m77245d(this.f216388a.hashCode() * 31, 31, this.f216389b);
    }
}
