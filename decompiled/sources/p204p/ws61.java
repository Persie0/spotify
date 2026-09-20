package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ws61 {

    /* JADX INFO: renamed from: a */
    public final String f254528a;

    /* JADX INFO: renamed from: b */
    public final String f254529b;

    /* JADX INFO: renamed from: c */
    public final String f254530c;

    /* JADX INFO: renamed from: d */
    public final String f254531d;

    public ws61(String str, String str2, String str3, String str4) {
        this.f254528a = str;
        this.f254529b = str2;
        this.f254530c = str3;
        this.f254531d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws61)) {
            return false;
        }
        ws61 ws61Var = (ws61) obj;
        return wj50.m88271j(this.f254528a, ws61Var.f254528a) && wj50.m88271j(this.f254529b, ws61Var.f254529b) && wj50.m88271j(this.f254530c, ws61Var.f254530c) && wj50.m88271j(this.f254531d, ws61Var.f254531d);
    }

    public final int hashCode() {
        return this.f254531d.hashCode() + s571.m77243b(s571.m77243b(this.f254528a.hashCode() * 31, 31, this.f254529b), 31, this.f254530c);
    }
}
