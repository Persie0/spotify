package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c08 {

    /* JADX INFO: renamed from: a */
    public Double f32703a;

    /* JADX INFO: renamed from: b */
    public int f32704b;

    /* JADX INFO: renamed from: c */
    public boolean f32705c;

    /* JADX INFO: renamed from: d */
    public int f32706d;

    /* JADX INFO: renamed from: e */
    public long f32707e;

    /* JADX INFO: renamed from: f */
    public long f32708f;

    /* JADX INFO: renamed from: g */
    public byte f32709g;

    /* JADX INFO: renamed from: a */
    public final d08 m31116a() {
        if (this.f32709g == 31) {
            return new d08(this.f32703a, this.f32704b, this.f32705c, this.f32706d, this.f32707e, this.f32708f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f32709g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f32709g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f32709g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f32709g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f32709g & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m31117b(Double d) {
        this.f32703a = d;
    }

    /* JADX INFO: renamed from: c */
    public final void m31118c(int i) {
        this.f32704b = i;
        this.f32709g = (byte) (this.f32709g | 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m31119d(long j) {
        this.f32708f = j;
        this.f32709g = (byte) (this.f32709g | 16);
    }

    /* JADX INFO: renamed from: e */
    public final void m31120e(int i) {
        this.f32706d = i;
        this.f32709g = (byte) (this.f32709g | 4);
    }

    /* JADX INFO: renamed from: f */
    public final void m31121f(boolean z) {
        this.f32705c = z;
        this.f32709g = (byte) (this.f32709g | 2);
    }

    /* JADX INFO: renamed from: g */
    public final void m31122g(long j) {
        this.f32707e = j;
        this.f32709g = (byte) (this.f32709g | 8);
    }
}
