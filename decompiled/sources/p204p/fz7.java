package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fz7 {

    /* JADX INFO: renamed from: a */
    public String f74924a;

    /* JADX INFO: renamed from: b */
    public String f74925b;

    /* JADX INFO: renamed from: c */
    public String f74926c;

    /* JADX INFO: renamed from: d */
    public long f74927d;

    /* JADX INFO: renamed from: e */
    public Long f74928e;

    /* JADX INFO: renamed from: f */
    public boolean f74929f;

    /* JADX INFO: renamed from: g */
    public n3l f74930g;

    /* JADX INFO: renamed from: h */
    public e4l f74931h;

    /* JADX INFO: renamed from: i */
    public d4l f74932i;

    /* JADX INFO: renamed from: j */
    public o3l f74933j;

    /* JADX INFO: renamed from: k */
    public List f74934k;

    /* JADX INFO: renamed from: l */
    public int f74935l;

    /* JADX INFO: renamed from: m */
    public byte f74936m;

    /* JADX INFO: renamed from: a */
    public final gz7 m43171a() {
        String str;
        String str2;
        n3l n3lVar;
        if (this.f74936m == 7 && (str = this.f74924a) != null && (str2 = this.f74925b) != null && (n3lVar = this.f74930g) != null) {
            return new gz7(str, str2, this.f74926c, this.f74927d, this.f74928e, this.f74929f, n3lVar, this.f74931h, this.f74932i, this.f74933j, this.f74934k, this.f74935l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f74924a == null) {
            sb.append(" generator");
        }
        if (this.f74925b == null) {
            sb.append(" identifier");
        }
        if ((this.f74936m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f74936m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f74930g == null) {
            sb.append(" app");
        }
        if ((this.f74936m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }
}
