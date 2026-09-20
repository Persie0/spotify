package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bzy0 {

    /* JADX INFO: renamed from: a */
    public final int f32618a;

    /* JADX INFO: renamed from: b */
    public final long f32619b;

    /* JADX INFO: renamed from: c */
    public final int f32620c;

    /* JADX INFO: renamed from: d */
    public final qe70 f32621d;

    /* JADX INFO: renamed from: e */
    public boolean f32622e;

    /* JADX INFO: renamed from: f */
    public boolean f32623f = false;

    /* JADX WARN: Multi-variable type inference failed */
    public bzy0(int i, long j, int i2, eh00 eh00Var, boolean z) {
        this.f32618a = i;
        this.f32619b = j;
        this.f32620c = i2;
        this.f32621d = (qe70) eh00Var;
        this.f32622e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzy0)) {
            return false;
        }
        bzy0 bzy0Var = (bzy0) obj;
        return this.f32618a == bzy0Var.f32618a && this.f32619b == bzy0Var.f32619b && this.f32620c == bzy0Var.f32620c && this.f32621d.equals(bzy0Var.f32621d) && this.f32622e == bzy0Var.f32622e && this.f32623f == bzy0Var.f32623f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32623f) + s571.m77245d((this.f32621d.hashCode() + mt60.m62800g(this.f32620c, dq60.m36605e(Integer.hashCode(this.f32618a) * 31, this.f32619b, 31), 31)) * 31, 31, this.f32622e);
    }
}
