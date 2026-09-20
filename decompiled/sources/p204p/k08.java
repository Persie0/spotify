package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k08 {

    /* JADX INFO: renamed from: a */
    public int f117925a;

    /* JADX INFO: renamed from: b */
    public String f117926b;

    /* JADX INFO: renamed from: c */
    public String f117927c;

    /* JADX INFO: renamed from: d */
    public boolean f117928d;

    /* JADX INFO: renamed from: e */
    public byte f117929e;

    /* JADX INFO: renamed from: a */
    public final l08 m54932a() {
        String str;
        String str2;
        if (this.f117929e == 3 && (str = this.f117926b) != null && (str2 = this.f117927c) != null) {
            return new l08(str, this.f117925a, str2, this.f117928d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f117929e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f117926b == null) {
            sb.append(" version");
        }
        if (this.f117927c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f117929e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }
}
