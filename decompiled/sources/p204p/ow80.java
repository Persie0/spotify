package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ow80 {

    /* JADX INFO: renamed from: a */
    public final String f170670a;

    /* JADX INFO: renamed from: b */
    public final String f170671b;

    /* JADX INFO: renamed from: c */
    public final String f170672c;

    /* JADX INFO: renamed from: d */
    public final String f170673d;

    public ow80(int i, String str, String str2, String str3, String str4) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "#FFFFFF" : str2;
        str4 = (i & 8) != 0 ? "" : str4;
        this.f170670a = str;
        this.f170671b = str2;
        this.f170672c = str3;
        this.f170673d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow80)) {
            return false;
        }
        ow80 ow80Var = (ow80) obj;
        return wj50.m88271j(this.f170670a, ow80Var.f170670a) && wj50.m88271j(this.f170671b, ow80Var.f170671b) && this.f170672c.equals(ow80Var.f170672c) && wj50.m88271j(this.f170673d, ow80Var.f170673d);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(this.f170670a.hashCode() * 31, 31, this.f170671b), 31, this.f170672c), 31, this.f170673d);
    }
}
