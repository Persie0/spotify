package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ok11 implements ktx {

    /* JADX INFO: renamed from: a */
    public final azg1 f166213a;

    /* JADX INFO: renamed from: b */
    public final azg1 f166214b;

    /* JADX INFO: renamed from: c */
    public final boolean f166215c;

    /* JADX INFO: renamed from: d */
    public final List f166216d;

    /* JADX INFO: renamed from: e */
    public final List f166217e;

    /* JADX INFO: renamed from: f */
    public final bk11 f166218f;

    /* JADX INFO: renamed from: g */
    public final mk11 f166219g;

    /* JADX INFO: renamed from: h */
    public final ik11 f166220h;

    /* JADX INFO: renamed from: i */
    public final lk11 f166221i;

    /* JADX INFO: renamed from: j */
    public final byte[] f166222j;

    /* JADX INFO: renamed from: k */
    public final jk11 f166223k;

    /* JADX INFO: renamed from: l */
    public final boolean f166224l;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ok11(azg1 azg1Var, ck11 ck11Var, boolean z, ArrayList arrayList, ArrayList arrayList2, mk11 mk11Var, ik11 ik11Var, lk11 lk11Var, byte[] bArr, jk11 jk11Var, boolean z2, int i) {
        azg1 azg1Var2 = (i & 1) != 0 ? null : azg1Var;
        ck11 ck11Var2 = (i & 2) != 0 ? null : ck11Var;
        boolean z3 = (i & 4) != 0 ? false : z;
        int i2 = i & 8;
        lau lauVar = lau.f131415a;
        this(azg1Var2, ck11Var2, z3, i2 != 0 ? lauVar : arrayList, (i & 16) != 0 ? lauVar : arrayList2, (bk11) null, (i & 64) != 0 ? null : mk11Var, (i & 128) != 0 ? null : ik11Var, (i & 256) != 0 ? null : lk11Var, (i & 512) != 0 ? null : bArr, (i & 1024) != 0 ? null : jk11Var, (i & 2048) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok11)) {
            return false;
        }
        ok11 ok11Var = (ok11) obj;
        return wj50.m88271j(this.f166213a, ok11Var.f166213a) && wj50.m88271j(this.f166214b, ok11Var.f166214b) && this.f166215c == ok11Var.f166215c && wj50.m88271j(this.f166216d, ok11Var.f166216d) && wj50.m88271j(this.f166217e, ok11Var.f166217e) && wj50.m88271j(this.f166218f, ok11Var.f166218f) && wj50.m88271j(this.f166219g, ok11Var.f166219g) && wj50.m88271j(this.f166220h, ok11Var.f166220h) && wj50.m88271j(this.f166221i, ok11Var.f166221i) && wj50.m88271j(this.f166222j, ok11Var.f166222j) && wj50.m88271j(this.f166223k, ok11Var.f166223k) && this.f166224l == ok11Var.f166224l;
    }

    public final int hashCode() {
        azg1 azg1Var = this.f166213a;
        int iHashCode = (azg1Var == null ? 0 : azg1Var.hashCode()) * 31;
        azg1 azg1Var2 = this.f166214b;
        int iM77244c = s571.m77244c(s571.m77244c(s571.m77245d((iHashCode + (azg1Var2 == null ? 0 : azg1Var2.hashCode())) * 31, 31, this.f166215c), 31, this.f166216d), 31, this.f166217e);
        bk11 bk11Var = this.f166218f;
        int iHashCode2 = (iM77244c + (bk11Var == null ? 0 : bk11Var.hashCode())) * 31;
        mk11 mk11Var = this.f166219g;
        int iHashCode3 = (iHashCode2 + (mk11Var == null ? 0 : mk11Var.f144471a.hashCode())) * 31;
        ik11 ik11Var = this.f166220h;
        int iHashCode4 = (iHashCode3 + (ik11Var == null ? 0 : ik11Var.hashCode())) * 31;
        lk11 lk11Var = this.f166221i;
        int iHashCode5 = (iHashCode4 + (lk11Var == null ? 0 : lk11Var.hashCode())) * 31;
        byte[] bArr = this.f166222j;
        int iHashCode6 = (iHashCode5 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        jk11 jk11Var = this.f166223k;
        return Boolean.hashCode(this.f166224l) + ((iHashCode6 + (jk11Var != null ? jk11Var.hashCode() : 0)) * 31);
    }

    public ok11(azg1 azg1Var, azg1 azg1Var2, boolean z, List list, List list2, bk11 bk11Var, mk11 mk11Var, ik11 ik11Var, lk11 lk11Var, byte[] bArr, jk11 jk11Var, boolean z2) {
        this.f166213a = azg1Var;
        this.f166214b = azg1Var2;
        this.f166215c = z;
        this.f166216d = list;
        this.f166217e = list2;
        this.f166218f = bk11Var;
        this.f166219g = mk11Var;
        this.f166220h = ik11Var;
        this.f166221i = lk11Var;
        this.f166222j = bArr;
        this.f166223k = jk11Var;
        this.f166224l = z2;
    }
}
