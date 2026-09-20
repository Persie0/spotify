package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: classes6.dex */
public final class roa {

    /* JADX INFO: renamed from: a */
    public final String f201198a;

    /* JADX INFO: renamed from: b */
    public final String f201199b;

    /* JADX INFO: renamed from: c */
    public final String f201200c;

    /* JADX INFO: renamed from: d */
    public final String f201201d;

    /* JADX INFO: renamed from: e */
    public final ExternalAccessoryDescription f201202e;

    /* JADX INFO: renamed from: f */
    public final boolean f201203f;

    /* JADX INFO: renamed from: g */
    public final boolean f201204g;

    /* JADX INFO: renamed from: h */
    public final boolean f201205h;

    /* JADX INFO: renamed from: i */
    public final boolean f201206i;

    /* JADX INFO: renamed from: j */
    public final ipm0 f201207j;

    /* JADX INFO: renamed from: k */
    public final int f201208k;

    /* JADX INFO: renamed from: l */
    public final int f201209l;

    /* JADX INFO: renamed from: m */
    public final UbiSpecificationId f201210m;

    /* JADX INFO: renamed from: n */
    public final String f201211n;

    /* JADX INFO: renamed from: o */
    public final boolean f201212o;

    /* JADX INFO: renamed from: p */
    public final boolean f201213p;

    public roa(String str, String str2, String str3, String str4, ExternalAccessoryDescription externalAccessoryDescription, boolean z, boolean z2, boolean z3, boolean z4, ipm0 ipm0Var, int i, int i2, UbiSpecificationId ubiSpecificationId, String str5, boolean z5, boolean z6) {
        this.f201198a = str;
        this.f201199b = str2;
        this.f201200c = str3;
        this.f201201d = str4;
        this.f201202e = externalAccessoryDescription;
        this.f201203f = z;
        this.f201204g = z2;
        this.f201205h = z3;
        this.f201206i = z4;
        this.f201207j = ipm0Var;
        this.f201208k = i;
        this.f201209l = i2;
        this.f201210m = ubiSpecificationId;
        this.f201211n = str5;
        this.f201212o = z5;
        this.f201213p = z6;
    }

    /* JADX INFO: renamed from: a */
    public static roa m76031a(roa roaVar, String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i) {
        String str4 = (i & 1) != 0 ? roaVar.f201198a : str;
        String str5 = (i & 2) != 0 ? roaVar.f201199b : str2;
        String str6 = roaVar.f201200c;
        String str7 = roaVar.f201201d;
        ExternalAccessoryDescription externalAccessoryDescription = roaVar.f201202e;
        roaVar.getClass();
        boolean z4 = roaVar.f201203f;
        boolean z5 = (i & 128) != 0 ? roaVar.f201204g : z;
        boolean z6 = (i & 256) != 0 ? roaVar.f201205h : z2;
        boolean z7 = roaVar.f201206i;
        ipm0 ipm0Var = roaVar.f201207j;
        int i2 = roaVar.f201208k;
        int i3 = roaVar.f201209l;
        UbiSpecificationId ubiSpecificationId = roaVar.f201210m;
        String str8 = (i & 16384) != 0 ? roaVar.f201211n : str3;
        boolean z8 = (i & 32768) != 0 ? roaVar.f201212o : z3;
        boolean z9 = roaVar.f201213p;
        roaVar.getClass();
        return new roa(str4, str5, str6, str7, externalAccessoryDescription, z4, z5, z6, z7, ipm0Var, i2, i3, ubiSpecificationId, str8, z8, z9);
    }

    /* JADX INFO: renamed from: b */
    public final ExternalAccessoryDescription m76032b() {
        return this.f201202e;
    }

    /* JADX INFO: renamed from: c */
    public final String m76033c() {
        return this.f201200c;
    }

    /* JADX INFO: renamed from: d */
    public final ipm0 m76034d() {
        return this.f201207j;
    }

    /* JADX INFO: renamed from: e */
    public final String m76035e() {
        return this.f201199b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roa)) {
            return false;
        }
        roa roaVar = (roa) obj;
        return wj50.m88271j(this.f201198a, roaVar.f201198a) && wj50.m88271j(this.f201199b, roaVar.f201199b) && wj50.m88271j(this.f201200c, roaVar.f201200c) && wj50.m88271j(this.f201201d, roaVar.f201201d) && wj50.m88271j(this.f201202e, roaVar.f201202e) && this.f201203f == roaVar.f201203f && this.f201204g == roaVar.f201204g && this.f201205h == roaVar.f201205h && this.f201206i == roaVar.f201206i && wj50.m88271j(this.f201207j, roaVar.f201207j) && this.f201208k == roaVar.f201208k && this.f201209l == roaVar.f201209l && this.f201210m == roaVar.f201210m && wj50.m88271j(this.f201211n, roaVar.f201211n) && this.f201212o == roaVar.f201212o && this.f201213p == roaVar.f201213p;
    }

    /* JADX INFO: renamed from: f */
    public final int m76036f() {
        return this.f201209l;
    }

    /* JADX INFO: renamed from: g */
    public final String m76037g() {
        return this.f201198a;
    }

    /* JADX INFO: renamed from: h */
    public final UbiSpecificationId m76038h() {
        return this.f201210m;
    }

    public final int hashCode() {
        String str = this.f201198a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f201199b);
        String str2 = this.f201200c;
        int iHashCode = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f201201d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExternalAccessoryDescription externalAccessoryDescription = this.f201202e;
        int iHashCode3 = (this.f201210m.hashCode() + f710.m40938f(this.f201209l, f710.m40938f(this.f201208k, (this.f201207j.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode2 + (externalAccessoryDescription == null ? 0 : externalAccessoryDescription.hashCode())) * 961, 31, this.f201203f), 31, this.f201204g), 31, this.f201205h), 31, this.f201206i)) * 31, 31), 31)) * 31;
        String str4 = this.f201211n;
        return Boolean.hashCode(this.f201213p) + s571.m77245d((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f201212o);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m76039i() {
        return this.f201206i;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m76040j() {
        return this.f201205h;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m76041k() {
        return this.f201204g;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m76042l() {
        return this.f201203f;
    }

    /* JADX INFO: renamed from: m */
    public final qoa m76043m() {
        qoa qoaVar = new qoa(this.f201199b, this.f201208k, this.f201209l, this.f201203f);
        qoaVar.f190877f = this.f201200c;
        qoaVar.f190878g = this.f201201d;
        qoaVar.f190879h = this.f201202e;
        qoaVar.f190876e = this.f201198a;
        qoaVar.f190880i = this.f201204g;
        qoaVar.f190881j = this.f201205h;
        qoaVar.f190882k = this.f201206i;
        qoaVar.f190883l = this.f201207j;
        qoaVar.f190884m = this.f201210m;
        qoaVar.f190885n = this.f201211n;
        qoaVar.f190886o = this.f201212o;
        qoaVar.f190887p = this.f201213p;
        return qoaVar;
    }

    public /* synthetic */ roa(String str, String str2, String str3, String str4, ExternalAccessoryDescription externalAccessoryDescription, boolean z, boolean z2, ipm0 ipm0Var, int i, int i2, UbiSpecificationId ubiSpecificationId, int i3) {
        this((i3 & 1) != 0 ? null : str, str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, externalAccessoryDescription, z, true, (i3 & 256) == 0, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? new ipm0() : ipm0Var, (i3 & 2048) != 0 ? 3 : i, i2, (i3 & 8192) != 0 ? UbiSpecificationId.UNKNOWN : ubiSpecificationId, null, false, (i3 & 65536) != 0);
    }
}
