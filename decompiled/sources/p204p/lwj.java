package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lwj {

    /* JADX INFO: renamed from: a */
    public final String f137579a;

    /* JADX INFO: renamed from: b */
    public final bc51 f137580b;

    /* JADX INFO: renamed from: c */
    public final boolean f137581c;

    /* JADX INFO: renamed from: d */
    public final boolean f137582d;

    /* JADX INFO: renamed from: e */
    public final gh00 f137583e;

    /* JADX INFO: renamed from: f */
    public final eh00 f137584f;

    /* JADX INFO: renamed from: g */
    public final int f137585g;

    /* JADX INFO: renamed from: h */
    public final int f137586h;

    /* JADX INFO: renamed from: i */
    public final eh00 f137587i;

    public lwj(String str, bc51 bc51Var, boolean z, boolean z2, gh00 gh00Var, eh00 eh00Var, int i, int i2, eh00 eh00Var2) {
        this.f137579a = str;
        this.f137580b = bc51Var;
        this.f137581c = z;
        this.f137582d = z2;
        this.f137583e = gh00Var;
        this.f137584f = eh00Var;
        this.f137585g = i;
        this.f137586h = i2;
        this.f137587i = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwj)) {
            return false;
        }
        lwj lwjVar = (lwj) obj;
        return wj50.m88271j(this.f137579a, lwjVar.f137579a) && wj50.m88271j(this.f137580b, lwjVar.f137580b) && this.f137581c == lwjVar.f137581c && this.f137582d == lwjVar.f137582d && wj50.m88271j(this.f137583e, lwjVar.f137583e) && wj50.m88271j(this.f137584f, lwjVar.f137584f) && this.f137585g == lwjVar.f137585g && this.f137586h == lwjVar.f137586h && wj50.m88271j(this.f137587i, lwjVar.f137587i);
    }

    public final int hashCode() {
        int iM60989d = m6b.m60989d(this.f137583e, s571.m77245d(s571.m77245d((this.f137580b.hashCode() + (this.f137579a.hashCode() * 31)) * 31, 31, this.f137581c), 31, this.f137582d), 31);
        eh00 eh00Var = this.f137584f;
        int iM62800g = mt60.m62800g(this.f137586h, mt60.m62800g(this.f137585g, (iM60989d + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31, 31), 31);
        eh00 eh00Var2 = this.f137587i;
        return iM62800g + (eh00Var2 != null ? eh00Var2.hashCode() : 0);
    }
}
