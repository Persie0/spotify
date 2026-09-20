package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mq7 implements oq7 {

    /* JADX INFO: renamed from: a */
    public final vq7 f146199a;

    /* JADX INFO: renamed from: b */
    public final int f146200b;

    /* JADX INFO: renamed from: c */
    public final xul0 f146201c;

    /* JADX INFO: renamed from: d */
    public final boolean f146202d;

    /* JADX INFO: renamed from: e */
    public final boolean f146203e;

    public mq7(vq7 vq7Var, int i, xul0 xul0Var, boolean z, boolean z2) {
        this.f146199a = vq7Var;
        this.f146200b = i;
        this.f146201c = xul0Var;
        this.f146202d = z;
        this.f146203e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq7)) {
            return false;
        }
        mq7 mq7Var = (mq7) obj;
        return this.f146199a.equals(mq7Var.f146199a) && this.f146200b == mq7Var.f146200b && this.f146201c.equals(mq7Var.f146201c) && this.f146202d == mq7Var.f146202d && this.f146203e == mq7Var.f146203e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146203e) + s571.m77245d((this.f146201c.hashCode() + f710.m40938f(this.f146200b, this.f146199a.hashCode() * 31, 31)) * 31, 31, this.f146202d);
    }
}
