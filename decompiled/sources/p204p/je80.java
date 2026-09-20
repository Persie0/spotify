package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class je80 {

    /* JADX INFO: renamed from: a */
    public final int f111500a;

    /* JADX INFO: renamed from: b */
    public final String f111501b;

    /* JADX INFO: renamed from: c */
    public final String f111502c;

    /* JADX INFO: renamed from: d */
    public final int f111503d;

    /* JADX INFO: renamed from: e */
    public final String f111504e;

    /* JADX INFO: renamed from: f */
    public final wwu f111505f;

    public je80(int i, String str, String str2, int i2, String str3, wwu wwuVar) {
        this.f111500a = i;
        this.f111501b = str;
        this.f111502c = str2;
        this.f111503d = i2;
        this.f111504e = str3;
        this.f111505f = wwuVar;
    }

    /* JADX INFO: renamed from: a */
    public final String m53085a() {
        return this.f111504e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je80)) {
            return false;
        }
        je80 je80Var = (je80) obj;
        return this.f111500a == je80Var.f111500a && this.f111501b.equals(je80Var.f111501b) && this.f111502c.equals(je80Var.f111502c) && this.f111503d == je80Var.f111503d && wj50.m88271j(this.f111504e, je80Var.f111504e) && wj50.m88271j(this.f111505f, je80Var.f111505f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f111500a) * 31, 31, this.f111501b), 31, this.f111502c);
        int i = this.f111503d;
        return this.f111505f.hashCode() + s571.m77243b((iM77243b + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, this.f111504e);
    }
}
