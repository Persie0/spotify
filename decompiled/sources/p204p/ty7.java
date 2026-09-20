package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ty7 {

    /* JADX INFO: renamed from: a */
    public String f224856a;

    /* JADX INFO: renamed from: b */
    public String f224857b;

    /* JADX INFO: renamed from: c */
    public int f224858c;

    /* JADX INFO: renamed from: d */
    public String f224859d;

    /* JADX INFO: renamed from: e */
    public String f224860e;

    /* JADX INFO: renamed from: f */
    public String f224861f;

    /* JADX INFO: renamed from: g */
    public String f224862g;

    /* JADX INFO: renamed from: h */
    public String f224863h;

    /* JADX INFO: renamed from: i */
    public String f224864i;

    /* JADX INFO: renamed from: j */
    public f4l f224865j;

    /* JADX INFO: renamed from: k */
    public l3l f224866k;

    /* JADX INFO: renamed from: l */
    public i3l f224867l;

    /* JADX INFO: renamed from: m */
    public byte f224868m;

    /* JADX INFO: renamed from: a */
    public final uy7 m81948a() {
        if (this.f224868m == 1 && this.f224856a != null && this.f224857b != null && this.f224859d != null && this.f224863h != null && this.f224864i != null) {
            return new uy7(this.f224856a, this.f224857b, this.f224858c, this.f224859d, this.f224860e, this.f224861f, this.f224862g, this.f224863h, this.f224864i, this.f224865j, this.f224866k, this.f224867l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224856a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f224857b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f224868m) == 0) {
            sb.append(" platform");
        }
        if (this.f224859d == null) {
            sb.append(" installationUuid");
        }
        if (this.f224863h == null) {
            sb.append(" buildVersion");
        }
        if (this.f224864i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }
}
