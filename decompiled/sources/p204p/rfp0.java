package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rfp0 {

    /* JADX INFO: renamed from: a */
    public final String f198703a;

    /* JADX INFO: renamed from: b */
    public final String f198704b;

    /* JADX INFO: renamed from: c */
    public final String f198705c;

    /* JADX INFO: renamed from: d */
    public final String f198706d;

    /* JADX INFO: renamed from: e */
    public final String f198707e;

    /* JADX INFO: renamed from: f */
    public final boolean f198708f;

    /* JADX INFO: renamed from: g */
    public final boolean f198709g;

    /* JADX INFO: renamed from: h */
    public final String f198710h;

    /* JADX INFO: renamed from: i */
    public final boolean f198711i;

    public rfp0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.f198703a = str;
        this.f198704b = str2;
        this.f198705c = str3;
        this.f198706d = str4;
        this.f198707e = str5;
        this.f198708f = z;
        this.f198709g = z2;
        this.f198710h = str6;
        this.f198711i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfp0)) {
            return false;
        }
        rfp0 rfp0Var = (rfp0) obj;
        return this.f198703a.equals(rfp0Var.f198703a) && this.f198704b.equals(rfp0Var.f198704b) && this.f198705c.equals(rfp0Var.f198705c) && this.f198706d.equals(rfp0Var.f198706d) && this.f198707e.equals(rfp0Var.f198707e) && this.f198708f == rfp0Var.f198708f && this.f198709g == rfp0Var.f198709g && this.f198710h.equals(rfp0Var.f198710h) && this.f198711i == rfp0Var.f198711i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198711i) + s571.m77245d(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f198703a.hashCode() * 961, 31, this.f198704b), 31, this.f198705c), 31, this.f198706d), 31, this.f198707e), 31, this.f198708f), 31, this.f198709g), 31, this.f198710h), 31, true);
    }
}
