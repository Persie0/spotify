package p204p;

import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class z3p0 {

    /* JADX INFO: renamed from: a */
    public final yzo0 f278991a;

    /* JADX INFO: renamed from: b */
    public final long f278992b;

    /* JADX INFO: renamed from: c */
    public final Long f278993c;

    /* JADX INFO: renamed from: d */
    public final Long f278994d;

    /* JADX INFO: renamed from: e */
    public final boolean f278995e;

    /* JADX INFO: renamed from: f */
    public final float f278996f;

    /* JADX INFO: renamed from: g */
    public final boolean f278997g;

    /* JADX INFO: renamed from: h */
    public final Integer f278998h;

    /* JADX INFO: renamed from: i */
    public final List f278999i;

    /* JADX INFO: renamed from: j */
    public final String f279000j;

    /* JADX INFO: renamed from: k */
    public final vk51 f279001k;

    /* JADX INFO: renamed from: l */
    public final int f279002l;

    /* JADX INFO: renamed from: m */
    public final boolean f279003m;

    /* JADX INFO: renamed from: n */
    public final boolean f279004n;

    public z3p0(yzo0 yzo0Var, long j, Long l, Long l2, boolean z, float f, boolean z2, Integer num, List list, String str, vk51 vk51Var, int i, boolean z3, boolean z4) {
        this.f278991a = yzo0Var;
        this.f278992b = j;
        this.f278993c = l;
        this.f278994d = l2;
        this.f278995e = z;
        this.f278996f = f;
        this.f278997g = z2;
        this.f278998h = num;
        this.f278999i = list;
        this.f279000j = str;
        this.f279001k = vk51Var;
        this.f279002l = i;
        this.f279003m = z3;
        this.f279004n = z4;
    }

    /* JADX INFO: renamed from: b */
    public static z3p0 m95286b(z3p0 z3p0Var, long j, Long l, Long l2, boolean z, float f, boolean z2, Integer num, List list, String str, vk51 vk51Var, int i, boolean z3, boolean z4, int i2) {
        yzo0 yzo0Var = z3p0Var.f278991a;
        long j2 = (i2 & 2) != 0 ? z3p0Var.f278992b : j;
        Long l3 = (i2 & 4) != 0 ? z3p0Var.f278993c : l;
        Long l4 = (i2 & 8) != 0 ? z3p0Var.f278994d : l2;
        boolean z5 = (i2 & 16) != 0 ? z3p0Var.f278995e : z;
        float f2 = (i2 & 32) != 0 ? z3p0Var.f278996f : f;
        boolean z6 = (i2 & 64) != 0 ? z3p0Var.f278997g : z2;
        Integer num2 = (i2 & 128) != 0 ? z3p0Var.f278998h : num;
        List list2 = (i2 & 256) != 0 ? z3p0Var.f278999i : list;
        String str2 = (i2 & 512) != 0 ? z3p0Var.f279000j : str;
        vk51 vk51Var2 = (i2 & 1024) != 0 ? z3p0Var.f279001k : vk51Var;
        z3p0Var.getClass();
        int i3 = (i2 & 4096) != 0 ? z3p0Var.f279002l : i;
        boolean z7 = (i2 & 8192) != 0 ? z3p0Var.f279003m : z3;
        boolean z8 = (i2 & 16384) != 0 ? z3p0Var.f279004n : z4;
        z3p0Var.getClass();
        return new z3p0(yzo0Var, j2, l3, l4, z5, f2, z6, num2, list2, str2, vk51Var2, i3, z7, z8);
    }

    /* JADX INFO: renamed from: a */
    public final Long m95287a(long j) {
        boolean z = this.f278995e;
        Long l = this.f278993c;
        if (z || this.f278997g || l == null) {
            return l;
        }
        return Long.valueOf(l.longValue() + ((long) (this.f278996f * (j - this.f278992b))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3p0)) {
            return false;
        }
        z3p0 z3p0Var = (z3p0) obj;
        return this.f278991a.equals(z3p0Var.f278991a) && this.f278992b == z3p0Var.f278992b && wj50.m88271j(this.f278993c, z3p0Var.f278993c) && wj50.m88271j(this.f278994d, z3p0Var.f278994d) && this.f278995e == z3p0Var.f278995e && Float.compare(this.f278996f, z3p0Var.f278996f) == 0 && this.f278997g == z3p0Var.f278997g && wj50.m88271j(this.f278998h, z3p0Var.f278998h) && wj50.m88271j(this.f278999i, z3p0Var.f278999i) && wj50.m88271j(this.f279000j, z3p0Var.f279000j) && this.f279001k == z3p0Var.f279001k && this.f279002l == z3p0Var.f279002l && this.f279003m == z3p0Var.f279003m && this.f279004n == z3p0Var.f279004n;
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(this.f278991a.hashCode() * 31, this.f278992b, 31);
        Long l = this.f278993c;
        int iHashCode = (iM36605e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f278994d;
        int iM77245d = s571.m77245d(AbstractC0000a.m8g(s571.m77245d((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f278995e), 31, this.f278996f), 31, this.f278997g);
        Integer num = this.f278998h;
        int iHashCode2 = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f278999i;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f279000j;
        return Boolean.hashCode(this.f279004n) + s571.m77245d(f710.m40938f(this.f279002l, (((this.f279001k.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31) - 217282188) * 31, 31), 31, this.f279003m);
    }
}
