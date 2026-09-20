package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qu80 {

    /* JADX INFO: renamed from: a */
    public final int f192595a;

    /* JADX INFO: renamed from: b */
    public final int f192596b;

    /* JADX INFO: renamed from: c */
    public final boolean f192597c;

    /* JADX INFO: renamed from: d */
    public final List f192598d;

    /* JADX INFO: renamed from: e */
    public final ybv f192599e;

    /* JADX INFO: renamed from: f */
    public final long f192600f;

    /* JADX INFO: renamed from: g */
    public final Integer f192601g;

    /* JADX INFO: renamed from: h */
    public final boolean f192602h;

    /* JADX INFO: renamed from: i */
    public final Map f192603i;

    /* JADX INFO: renamed from: j */
    public final long f192604j;

    /* JADX INFO: renamed from: k */
    public final List f192605k;

    /* JADX INFO: renamed from: l */
    public final int f192606l;

    /* JADX INFO: renamed from: m */
    public final Integer f192607m;

    public qu80(int i, int i2, boolean z, List list, ybv ybvVar, long j, Integer num, boolean z2, Map map, long j2, List list2, int i3, Integer num2) {
        this.f192595a = i;
        this.f192596b = i2;
        this.f192597c = z;
        this.f192598d = list;
        this.f192599e = ybvVar;
        this.f192600f = j;
        this.f192601g = num;
        this.f192602h = z2;
        this.f192603i = map;
        this.f192604j = j2;
        this.f192605k = list2;
        this.f192606l = i3;
        this.f192607m = num2;
    }

    /* JADX INFO: renamed from: a */
    public static qu80 m73886a(qu80 qu80Var, Integer num) {
        return new qu80(qu80Var.f192595a, qu80Var.f192596b, qu80Var.f192597c, qu80Var.f192598d, qu80Var.f192599e, qu80Var.f192600f, qu80Var.f192601g, qu80Var.f192602h, qu80Var.f192603i, qu80Var.f192604j, qu80Var.f192605k, qu80Var.f192606l, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu80)) {
            return false;
        }
        qu80 qu80Var = (qu80) obj;
        return this.f192595a == qu80Var.f192595a && this.f192596b == qu80Var.f192596b && this.f192597c == qu80Var.f192597c && wj50.m88271j(this.f192598d, qu80Var.f192598d) && wj50.m88271j(this.f192599e, qu80Var.f192599e) && this.f192600f == qu80Var.f192600f && wj50.m88271j(this.f192601g, qu80Var.f192601g) && this.f192602h == qu80Var.f192602h && wj50.m88271j(this.f192603i, qu80Var.f192603i) && this.f192604j == qu80Var.f192604j && wj50.m88271j(this.f192605k, qu80Var.f192605k) && this.f192606l == qu80Var.f192606l && wj50.m88271j(this.f192607m, qu80Var.f192607m);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e((this.f192599e.hashCode() + s571.m77244c(s571.m77245d(mt60.m62800g(this.f192596b, Integer.hashCode(this.f192595a) * 31, 31), 31, this.f192597c), 31, this.f192598d)) * 31, this.f192600f, 31);
        Integer num = this.f192601g;
        int iM62800g = mt60.m62800g(this.f192606l, s571.m77244c(dq60.m36605e(edb.m38557f(s571.m77245d((iM36605e + (num == null ? 0 : num.hashCode())) * 31, 31, this.f192602h), 31, this.f192603i), this.f192604j, 31), 31, this.f192605k), 31);
        Integer num2 = this.f192607m;
        return iM62800g + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qu80(int i, int i2, boolean z, List list, ybv ybvVar, long j, Integer num, boolean z2, Map map, long j2, List list2, int i3, int i4) {
        ybv ybvVar2;
        int i5 = (i4 & 1) != 0 ? 0 : i;
        int i6 = (i4 & 2) != 0 ? 0 : i2;
        boolean z3 = (i4 & 4) != 0 ? false : z;
        int i7 = i4 & 8;
        lau lauVar = lau.f131415a;
        List list3 = i7 != 0 ? lauVar : list;
        Object[] objArr = 0;
        if ((i4 & 16) != 0) {
            ybvVar2 = new ybv(objArr == true ? 1 : 0, -1);
        } else {
            ybvVar2 = ybvVar;
        }
        this(i5, i6, z3, list3, ybvVar2, (i4 & 32) != 0 ? 0L : j, (i4 & 64) == 0 ? num : null, (i4 & 128) != 0 ? false : z2, (i4 & 256) != 0 ? nau.f152117a : map, (i4 & 512) == 0 ? j2 : 0L, (i4 & 1024) != 0 ? lauVar : list2, (i4 & 2048) != 0 ? 0 : i3, (Integer) null);
    }
}
