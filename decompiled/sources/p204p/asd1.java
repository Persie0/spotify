package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class asd1 implements bsd1 {

    /* JADX INFO: renamed from: a */
    public final String f19398a;

    /* JADX INFO: renamed from: b */
    public final String f19399b;

    /* JADX INFO: renamed from: c */
    public final String f19400c;

    /* JADX INFO: renamed from: d */
    public final String f19401d;

    /* JADX INFO: renamed from: e */
    public final u6r f19402e;

    /* JADX INFO: renamed from: f */
    public final String f19403f;

    public asd1(String str, String str2, String str3, String str4, u6r u6rVar, String str5) {
        this.f19398a = str;
        this.f19399b = str2;
        this.f19400c = str3;
        this.f19401d = str4;
        this.f19402e = u6rVar;
        this.f19403f = str5;
    }

    @Override // p204p.bsd1
    /* JADX INFO: renamed from: a */
    public final String mo27088a() {
        return this.f19400c;
    }

    @Override // p204p.yrd1
    /* JADX INFO: renamed from: b */
    public final String mo27089b() {
        return this.f19403f;
    }

    @Override // p204p.bsd1
    /* JADX INFO: renamed from: c */
    public final String mo27090c() {
        return this.f19399b;
    }

    @Override // p204p.bsd1
    /* JADX INFO: renamed from: d */
    public final String mo27091d() {
        return this.f19401d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asd1)) {
            return false;
        }
        asd1 asd1Var = (asd1) obj;
        return wj50.m88271j(this.f19398a, asd1Var.f19398a) && wj50.m88271j(this.f19399b, asd1Var.f19399b) && wj50.m88271j(this.f19400c, asd1Var.f19400c) && wj50.m88271j(this.f19401d, asd1Var.f19401d) && wj50.m88271j(this.f19402e, asd1Var.f19402e) && wj50.m88271j(this.f19403f, asd1Var.f19403f);
    }

    @Override // p204p.bsd1
    public final String getTitle() {
        return this.f19398a;
    }

    public final int hashCode() {
        return this.f19403f.hashCode() + ((this.f19402e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f19398a.hashCode() * 31, 31, this.f19399b), 31, this.f19400c), 31, this.f19401d)) * 31);
    }

    @Override // p204p.yrd1
    /* JADX INFO: renamed from: m */
    public final u6r mo27092m() {
        return this.f19402e;
    }
}
