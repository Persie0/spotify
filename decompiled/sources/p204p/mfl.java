package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mfl implements nfl {

    /* JADX INFO: renamed from: a */
    public final f1w0 f143084a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f143085b;

    /* JADX INFO: renamed from: c */
    public final kfl f143086c;

    /* JADX INFO: renamed from: d */
    public final ci20 f143087d;

    /* JADX INFO: renamed from: e */
    public final Integer f143088e;

    /* JADX INFO: renamed from: f */
    public final String f143089f;

    /* JADX INFO: renamed from: g */
    public final String f143090g;

    /* JADX INFO: renamed from: h */
    public final String f143091h;

    /* JADX INFO: renamed from: i */
    public final boolean f143092i;

    /* JADX INFO: renamed from: j */
    public final boolean f143093j;

    /* JADX INFO: renamed from: k */
    public final String f143094k;

    /* JADX INFO: renamed from: l */
    public final boolean f143095l;

    public mfl(f1w0 f1w0Var, CharSequence charSequence, kfl kflVar, ci20 ci20Var, Integer num, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
        this.f143084a = f1w0Var;
        this.f143085b = charSequence;
        this.f143086c = kflVar;
        this.f143087d = ci20Var;
        this.f143088e = num;
        this.f143089f = str;
        this.f143090g = str2;
        this.f143091h = str3;
        this.f143092i = z;
        this.f143093j = z2;
        this.f143094k = str4;
        this.f143095l = z3;
    }

    /* JADX INFO: renamed from: a */
    public static mfl m61640a(mfl mflVar, CharSequence charSequence, kfl kflVar, ci20 ci20Var, Integer num, String str, String str2, String str3, boolean z, String str4, boolean z2, int i) {
        f1w0 f1w0Var = mflVar.f143084a;
        if ((i & 2) != 0) {
            charSequence = mflVar.f143085b;
        }
        CharSequence charSequence2 = charSequence;
        kfl kflVar2 = (i & 4) != 0 ? mflVar.f143086c : kflVar;
        ci20 ci20Var2 = (i & 8) != 0 ? mflVar.f143087d : ci20Var;
        Integer num2 = (i & 16) != 0 ? mflVar.f143088e : num;
        String str5 = (i & 32) != 0 ? mflVar.f143089f : str;
        String str6 = (i & 64) != 0 ? mflVar.f143090g : str2;
        String str7 = (i & 128) != 0 ? mflVar.f143091h : str3;
        boolean z3 = (i & 256) != 0 ? mflVar.f143092i : true;
        boolean z4 = (i & 512) != 0 ? mflVar.f143093j : z;
        String str8 = (i & 1024) != 0 ? mflVar.f143094k : str4;
        boolean z5 = (i & 2048) != 0 ? mflVar.f143095l : z2;
        mflVar.getClass();
        return new mfl(f1w0Var, charSequence2, kflVar2, ci20Var2, num2, str5, str6, str7, z3, z4, str8, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfl)) {
            return false;
        }
        mfl mflVar = (mfl) obj;
        return wj50.m88271j(this.f143084a, mflVar.f143084a) && wj50.m88271j(this.f143085b, mflVar.f143085b) && wj50.m88271j(this.f143086c, mflVar.f143086c) && wj50.m88271j(this.f143087d, mflVar.f143087d) && wj50.m88271j(this.f143088e, mflVar.f143088e) && wj50.m88271j(this.f143089f, mflVar.f143089f) && wj50.m88271j(this.f143090g, mflVar.f143090g) && wj50.m88271j(this.f143091h, mflVar.f143091h) && this.f143092i == mflVar.f143092i && this.f143093j == mflVar.f143093j && wj50.m88271j(this.f143094k, mflVar.f143094k) && this.f143095l == mflVar.f143095l;
    }

    public final int hashCode() {
        int iHashCode = this.f143084a.hashCode() * 31;
        CharSequence charSequence = this.f143085b;
        int iHashCode2 = (this.f143087d.hashCode() + ((this.f143086c.hashCode() + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.f143088e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f143089f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f143090g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f143091h;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f143092i), 31, this.f143093j);
        String str4 = this.f143094k;
        return Boolean.hashCode(this.f143095l) + ((iM77245d + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
