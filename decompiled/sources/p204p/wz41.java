package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wz41 implements xz41 {

    /* JADX INFO: renamed from: a */
    public final tz41 f256474a;

    /* JADX INFO: renamed from: b */
    public final String f256475b;

    /* JADX INFO: renamed from: c */
    public final fuz0 f256476c;

    /* JADX INFO: renamed from: d */
    public final List f256477d;

    /* JADX INFO: renamed from: e */
    public final duf f256478e;

    /* JADX INFO: renamed from: f */
    public final String f256479f;

    /* JADX INFO: renamed from: g */
    public final String f256480g;

    /* JADX INFO: renamed from: h */
    public final fuz0 f256481h;

    /* JADX INFO: renamed from: i */
    public final List f256482i;

    /* JADX INFO: renamed from: j */
    public final String f256483j;

    /* JADX INFO: renamed from: k */
    public final boolean f256484k;

    public wz41(tz41 tz41Var, String str, fuz0 fuz0Var, List list, duf dufVar, String str2, String str3, fuz0 fuz0Var2, List list2, String str4, boolean z) {
        this.f256474a = tz41Var;
        this.f256475b = str;
        this.f256476c = fuz0Var;
        this.f256477d = list;
        this.f256478e = dufVar;
        this.f256479f = str2;
        this.f256480g = str3;
        this.f256481h = fuz0Var2;
        this.f256482i = list2;
        this.f256483j = str4;
        this.f256484k = z;
    }

    /* JADX INFO: renamed from: a */
    public static wz41 m89397a(wz41 wz41Var, List list, String str, int i) {
        tz41 tz41Var = wz41Var.f256474a;
        String str2 = wz41Var.f256475b;
        fuz0 fuz0Var = (i & 4) != 0 ? wz41Var.f256476c : null;
        if ((i & 8) != 0) {
            list = wz41Var.f256477d;
        }
        List list2 = list;
        duf dufVar = (i & 16) != 0 ? wz41Var.f256478e : buf.f31129a;
        String str3 = wz41Var.f256480g;
        List list3 = (i & 256) != 0 ? wz41Var.f256482i : lau.f131415a;
        String str4 = wz41Var.f256483j;
        boolean z = wz41Var.f256484k;
        wz41Var.getClass();
        return new wz41(tz41Var, str2, fuz0Var, list2, dufVar, str, str3, null, list3, str4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz41)) {
            return false;
        }
        wz41 wz41Var = (wz41) obj;
        return this.f256474a == wz41Var.f256474a && wj50.m88271j(this.f256475b, wz41Var.f256475b) && wj50.m88271j(this.f256476c, wz41Var.f256476c) && wj50.m88271j(this.f256477d, wz41Var.f256477d) && wj50.m88271j(this.f256478e, wz41Var.f256478e) && wj50.m88271j(this.f256479f, wz41Var.f256479f) && wj50.m88271j(this.f256480g, wz41Var.f256480g) && wj50.m88271j(this.f256481h, wz41Var.f256481h) && wj50.m88271j(this.f256482i, wz41Var.f256482i) && wj50.m88271j(this.f256483j, wz41Var.f256483j) && this.f256484k == wz41Var.f256484k;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f256474a.hashCode() * 31, 31, this.f256475b);
        fuz0 fuz0Var = this.f256476c;
        int iM77243b2 = s571.m77243b(s571.m77243b((this.f256478e.hashCode() + s571.m77244c((iM77243b + (fuz0Var == null ? 0 : Arrays.hashCode(fuz0Var.f73606a))) * 31, 31, this.f256477d)) * 31, 31, this.f256479f), 31, this.f256480g);
        fuz0 fuz0Var2 = this.f256481h;
        return Boolean.hashCode(this.f256484k) + s571.m77243b(s571.m77244c((iM77243b2 + (fuz0Var2 != null ? Arrays.hashCode(fuz0Var2.f73606a) : 0)) * 31, 31, this.f256482i), 31, this.f256483j);
    }

    public /* synthetic */ wz41(tz41 tz41Var, String str, fuz0 fuz0Var, List list, duf dufVar, String str2, String str3, fuz0 fuz0Var2, ArrayList arrayList, String str4, boolean z, int i) {
        this(tz41Var, str, fuz0Var, list, dufVar, str2, str3, (i & 128) != 0 ? null : fuz0Var2, (i & 256) != 0 ? lau.f131415a : arrayList, str4, (i & 1024) != 0 ? false : z);
    }
}
