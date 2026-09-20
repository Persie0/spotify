package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class otp0 {

    /* JADX INFO: renamed from: a */
    public final String f170054a;

    /* JADX INFO: renamed from: b */
    public final String f170055b;

    /* JADX INFO: renamed from: c */
    public final Object f170056c;

    /* JADX INFO: renamed from: d */
    public final Set f170057d;

    /* JADX INFO: renamed from: e */
    public final Set f170058e;

    /* JADX INFO: renamed from: f */
    public final String f170059f;

    /* JADX INFO: renamed from: g */
    public final Boolean f170060g;

    /* JADX INFO: renamed from: h */
    public final String f170061h;

    /* JADX INFO: renamed from: i */
    public final String f170062i;

    /* JADX INFO: renamed from: j */
    public final d850 f170063j;

    /* JADX INFO: renamed from: k */
    public final String f170064k;

    /* JADX INFO: renamed from: l */
    public final boolean f170065l;

    public otp0(String str, String str2, List list, Set set, Set set2, String str3, Boolean bool, String str4, String str5, d850 d850Var, String str6, boolean z) {
        this.f170054a = str;
        this.f170055b = str2;
        this.f170056c = list;
        this.f170057d = set;
        this.f170058e = set2;
        this.f170059f = str3;
        this.f170060g = bool;
        this.f170061h = str4;
        this.f170062i = str5;
        this.f170063j = d850Var;
        this.f170064k = str6;
        this.f170065l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otp0)) {
            return false;
        }
        otp0 otp0Var = (otp0) obj;
        return wj50.m88271j(this.f170054a, otp0Var.f170054a) && this.f170055b.equals(otp0Var.f170055b) && this.f170056c.equals(otp0Var.f170056c) && wj50.m88271j(this.f170057d, otp0Var.f170057d) && wj50.m88271j(this.f170058e, otp0Var.f170058e) && wj50.m88271j(this.f170059f, otp0Var.f170059f) && wj50.m88271j(this.f170060g, otp0Var.f170060g) && wj50.m88271j(this.f170061h, otp0Var.f170061h) && this.f170062i.equals(otp0Var.f170062i) && wj50.m88271j(this.f170063j, otp0Var.f170063j) && this.f170064k.equals(otp0Var.f170064k) && this.f170065l == otp0Var.f170065l;
    }

    public final int hashCode() {
        int iM56830b = klh.m56830b(klh.m56830b(dq60.m36604d(s571.m77243b(this.f170054a.hashCode() * 31, 31, this.f170055b), 31, this.f170056c), 31, this.f170057d), 31, this.f170058e);
        String str = this.f170059f;
        int iHashCode = (iM56830b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f170060g;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f170061h;
        int iM77243b = s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f170062i);
        d850 d850Var = this.f170063j;
        return Boolean.hashCode(this.f170065l) + s571.m77243b((iM77243b + (d850Var != null ? d850Var.hashCode() : 0)) * 31, 31, this.f170064k);
    }
}
