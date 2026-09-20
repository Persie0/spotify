package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jz7 {

    /* JADX INFO: renamed from: a */
    public int f117605a;

    /* JADX INFO: renamed from: b */
    public String f117606b;

    /* JADX INFO: renamed from: c */
    public int f117607c;

    /* JADX INFO: renamed from: d */
    public long f117608d;

    /* JADX INFO: renamed from: e */
    public long f117609e;

    /* JADX INFO: renamed from: f */
    public boolean f117610f;

    /* JADX INFO: renamed from: g */
    public int f117611g;

    /* JADX INFO: renamed from: h */
    public String f117612h;

    /* JADX INFO: renamed from: i */
    public String f117613i;

    /* JADX INFO: renamed from: j */
    public byte f117614j;

    /* JADX INFO: renamed from: a */
    public final kz7 m54848a() {
        String str;
        String str2;
        String str3;
        if (this.f117614j == 63 && (str = this.f117606b) != null && (str2 = this.f117612h) != null && (str3 = this.f117613i) != null) {
            return new kz7(this.f117605a, str, this.f117607c, this.f117608d, this.f117609e, this.f117610f, this.f117611g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f117614j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f117606b == null) {
            sb.append(" model");
        }
        if ((this.f117614j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f117614j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f117614j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f117614j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f117614j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f117612h == null) {
            sb.append(" manufacturer");
        }
        if (this.f117613i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }
}
