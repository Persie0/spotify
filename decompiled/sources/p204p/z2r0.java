package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class z2r0 {

    /* JADX INFO: renamed from: a */
    public final String f278646a;

    /* JADX INFO: renamed from: b */
    public final String f278647b;

    /* JADX INFO: renamed from: c */
    public final String f278648c;

    /* JADX INFO: renamed from: d */
    public final String f278649d;

    /* JADX INFO: renamed from: e */
    public final String f278650e;

    /* JADX INFO: renamed from: f */
    public final String f278651f;

    /* JADX INFO: renamed from: g */
    public final ney0 f278652g;

    /* JADX INFO: renamed from: h */
    public final dsc1 f278653h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f278654i;

    /* JADX INFO: renamed from: j */
    public final ol21 f278655j;

    /* JADX INFO: renamed from: k */
    public final String f278656k;

    /* JADX INFO: renamed from: l */
    public final String f278657l;

    /* JADX INFO: renamed from: m */
    public final String f278658m;

    public z2r0(String str, String str2, String str3, String str4, String str5, String str6, ney0 ney0Var, dsc1 dsc1Var, ArrayList arrayList, ol21 ol21Var, String str7, String str8, String str9) {
        this.f278646a = str;
        this.f278647b = str2;
        this.f278648c = str3;
        this.f278649d = str4;
        this.f278650e = str5;
        this.f278651f = str6;
        this.f278652g = ney0Var;
        this.f278653h = dsc1Var;
        this.f278654i = arrayList;
        this.f278655j = ol21Var;
        this.f278656k = str7;
        this.f278657l = str8;
        this.f278658m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2r0)) {
            return false;
        }
        z2r0 z2r0Var = (z2r0) obj;
        return this.f278646a.equals(z2r0Var.f278646a) && this.f278647b.equals(z2r0Var.f278647b) && this.f278648c.equals(z2r0Var.f278648c) && this.f278649d.equals(z2r0Var.f278649d) && wj50.m88271j(this.f278650e, z2r0Var.f278650e) && this.f278651f.equals(z2r0Var.f278651f) && wj50.m88271j(this.f278652g, z2r0Var.f278652g) && wj50.m88271j(this.f278653h, z2r0Var.f278653h) && this.f278654i.equals(z2r0Var.f278654i) && this.f278655j == z2r0Var.f278655j && this.f278656k.equals(z2r0Var.f278656k) && wj50.m88271j(this.f278657l, z2r0Var.f278657l) && wj50.m88271j(this.f278658m, z2r0Var.f278658m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f278646a.hashCode() * 31, 31, this.f278647b), 31, this.f278648c), 31, this.f278649d);
        String str = this.f278650e;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f278651f);
        ney0 ney0Var = this.f278652g;
        int iHashCode = (iM77243b2 + (ney0Var == null ? 0 : ney0Var.hashCode())) * 31;
        dsc1 dsc1Var = this.f278653h;
        int iM59700f = lq51.m59700f(this.f278654i, (iHashCode + (dsc1Var == null ? 0 : dsc1Var.hashCode())) * 31, 31);
        ol21 ol21Var = this.f278655j;
        int iM77243b3 = s571.m77243b((iM59700f + (ol21Var == null ? 0 : ol21Var.hashCode())) * 31, 31, this.f278656k);
        String str2 = this.f278657l;
        int iHashCode2 = (iM77243b3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f278658m;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
