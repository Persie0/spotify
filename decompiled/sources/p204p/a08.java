package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a08 {

    /* JADX INFO: renamed from: a */
    public String f11008a;

    /* JADX INFO: renamed from: b */
    public int f11009b;

    /* JADX INFO: renamed from: c */
    public int f11010c;

    /* JADX INFO: renamed from: d */
    public boolean f11011d;

    /* JADX INFO: renamed from: e */
    public byte f11012e;

    /* JADX INFO: renamed from: a */
    public final b08 m24328a() {
        String str;
        if (this.f11012e == 7 && (str = this.f11008a) != null) {
            return new b08(str, this.f11009b, this.f11010c, this.f11011d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11008a == null) {
            sb.append(" processName");
        }
        if ((this.f11012e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f11012e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f11012e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }
}
