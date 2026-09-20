package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kkt0 {

    /* JADX INFO: renamed from: a */
    public final String f123704a;

    /* JADX INFO: renamed from: b */
    public final String f123705b;

    /* JADX INFO: renamed from: c */
    public final String f123706c;

    /* JADX INFO: renamed from: d */
    public final jkt0 f123707d;

    /* JADX INFO: renamed from: e */
    public final boolean f123708e;

    /* JADX INFO: renamed from: f */
    public final eh00 f123709f;

    /* JADX INFO: renamed from: g */
    public final eh00 f123710g;

    public kkt0(String str, String str2, String str3, jkt0 jkt0Var, boolean z, eh00 eh00Var, eh00 eh00Var2) {
        this.f123704a = str;
        this.f123705b = str2;
        this.f123706c = str3;
        this.f123707d = jkt0Var;
        this.f123708e = z;
        this.f123709f = eh00Var;
        this.f123710g = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkt0)) {
            return false;
        }
        kkt0 kkt0Var = (kkt0) obj;
        return wj50.m88271j(this.f123704a, kkt0Var.f123704a) && wj50.m88271j(this.f123705b, kkt0Var.f123705b) && wj50.m88271j(this.f123706c, kkt0Var.f123706c) && wj50.m88271j(this.f123707d, kkt0Var.f123707d) && this.f123708e == kkt0Var.f123708e && wj50.m88271j(this.f123709f, kkt0Var.f123709f) && wj50.m88271j(this.f123710g, kkt0Var.f123710g);
    }

    public final int hashCode() {
        return this.f123710g.hashCode() + p1v.m68853j(s571.m77245d((this.f123707d.hashCode() + s571.m77243b(s571.m77243b(this.f123704a.hashCode() * 31, 31, this.f123705b), 31, this.f123706c)) * 31, 31, this.f123708e), this.f123709f, 31);
    }
}
