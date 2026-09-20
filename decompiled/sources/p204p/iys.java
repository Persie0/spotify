package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class iys {

    /* JADX INFO: renamed from: a */
    public final boolean f107052a;

    /* JADX INFO: renamed from: b */
    public final boolean f107053b;

    /* JADX INFO: renamed from: c */
    public final boolean f107054c;

    /* JADX INFO: renamed from: d */
    public final boolean f107055d;

    /* JADX INFO: renamed from: e */
    public final boolean f107056e;

    /* JADX INFO: renamed from: f */
    public final Integer f107057f;

    /* JADX INFO: renamed from: g */
    public final boolean f107058g;

    /* JADX INFO: renamed from: h */
    public final boolean f107059h;

    /* JADX INFO: renamed from: i */
    public final List f107060i;

    /* JADX INFO: renamed from: j */
    public final int f107061j;

    public iys(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, boolean z7, List list, int i) {
        this.f107052a = z;
        this.f107053b = z2;
        this.f107054c = z3;
        this.f107055d = z4;
        this.f107056e = z5;
        this.f107057f = num;
        this.f107058g = z6;
        this.f107059h = z7;
        this.f107060i = list;
        this.f107061j = i;
    }

    /* JADX INFO: renamed from: a */
    public static iys m51960a(iys iysVar, boolean z, boolean z2, boolean z3, Integer num, boolean z4, int i) {
        boolean z5 = iysVar.f107052a;
        if ((i & 2) != 0) {
            z = iysVar.f107053b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = iysVar.f107054c;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = iysVar.f107055d;
        }
        boolean z8 = z3;
        boolean z9 = (i & 16) != 0 ? iysVar.f107056e : false;
        if ((i & 32) != 0) {
            num = iysVar.f107057f;
        }
        Integer num2 = num;
        boolean z10 = (i & 64) != 0 ? iysVar.f107058g : z4;
        boolean z11 = iysVar.f107059h;
        List list = iysVar.f107060i;
        int i2 = iysVar.f107061j;
        iysVar.getClass();
        return new iys(z5, z6, z7, z8, z9, num2, z10, z11, list, i2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51961b() {
        return this.f107058g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m51962c() {
        return this.f107055d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m51963d() {
        return this.f107052a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m51964e() {
        return this.f107054c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iys)) {
            return false;
        }
        iys iysVar = (iys) obj;
        return this.f107052a == iysVar.f107052a && this.f107053b == iysVar.f107053b && this.f107054c == iysVar.f107054c && this.f107055d == iysVar.f107055d && this.f107056e == iysVar.f107056e && wj50.m88271j(this.f107057f, iysVar.f107057f) && this.f107058g == iysVar.f107058g && this.f107059h == iysVar.f107059h && wj50.m88271j(this.f107060i, iysVar.f107060i) && this.f107061j == iysVar.f107061j;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m51965f() {
        return this.f107053b;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f107052a) * 31, 31, this.f107053b), 31, this.f107054c), 31, this.f107055d), 31, this.f107056e);
        Integer num = this.f107057f;
        return Integer.hashCode(this.f107061j) + s571.m77244c(s571.m77245d(s571.m77245d((iM77245d + (num == null ? 0 : num.hashCode())) * 31, 31, this.f107058g), 31, this.f107059h), 31, this.f107060i);
    }

    public /* synthetic */ iys(boolean z, boolean z2, boolean z3, ArrayList arrayList, int i, int i2) {
        this((i2 & 1) != 0 ? false : z, false, false, false, (i2 & 16) != 0 ? false : z2, null, false, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? lau.f131415a : arrayList, (i2 & 512) != 0 ? 10 : i);
    }
}
