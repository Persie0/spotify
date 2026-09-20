package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z840 {

    /* JADX INFO: renamed from: a */
    public final int f280360a;

    /* JADX INFO: renamed from: b */
    public final String f280361b;

    /* JADX INFO: renamed from: c */
    public final String f280362c;

    /* JADX INFO: renamed from: d */
    public final String f280363d;

    /* JADX INFO: renamed from: e */
    public final String f280364e;

    /* JADX INFO: renamed from: f */
    public final x640 f280365f;

    /* JADX INFO: renamed from: g */
    public final String f280366g;

    /* JADX INFO: renamed from: h */
    public final String f280367h;

    /* JADX INFO: renamed from: i */
    public final String f280368i;

    /* JADX INFO: renamed from: j */
    public final String f280369j;

    /* JADX INFO: renamed from: k */
    public final pxj f280370k;

    /* JADX INFO: renamed from: l */
    public final boolean f280371l;

    /* JADX INFO: renamed from: m */
    public final boolean f280372m;

    /* JADX INFO: renamed from: n */
    public final boolean f280373n;

    /* JADX INFO: renamed from: o */
    public final boolean f280374o;

    /* JADX INFO: renamed from: p */
    public final Integer f280375p;

    /* JADX INFO: renamed from: q */
    public final b740 f280376q;

    /* JADX INFO: renamed from: r */
    public final boolean f280377r;

    /* JADX INFO: renamed from: s */
    public final f5u f280378s;

    /* JADX INFO: renamed from: t */
    public final boolean f280379t;

    public z840(int i, String str, String str2, String str3, String str4, x640 x640Var, String str5, String str6, String str7, String str8, pxj pxjVar, boolean z, boolean z2, boolean z3, boolean z4, Integer num, b740 b740Var, boolean z5, f5u f5uVar, boolean z6) {
        this.f280360a = i;
        this.f280361b = str;
        this.f280362c = str2;
        this.f280363d = str3;
        this.f280364e = str4;
        this.f280365f = x640Var;
        this.f280366g = str5;
        this.f280367h = str6;
        this.f280368i = str7;
        this.f280369j = str8;
        this.f280370k = pxjVar;
        this.f280371l = z;
        this.f280372m = z2;
        this.f280373n = z3;
        this.f280374o = z4;
        this.f280375p = num;
        this.f280376q = b740Var;
        this.f280377r = z5;
        this.f280378s = f5uVar;
        this.f280379t = z6;
    }

    /* JADX INFO: renamed from: a */
    public static z840 m95567a(z840 z840Var, Integer num, b740 b740Var, int i) {
        int i2 = z840Var.f280360a;
        String str = z840Var.f280361b;
        String str2 = z840Var.f280362c;
        String str3 = z840Var.f280363d;
        String str4 = z840Var.f280364e;
        x640 x640Var = z840Var.f280365f;
        String str5 = z840Var.f280366g;
        String str6 = z840Var.f280367h;
        String str7 = z840Var.f280368i;
        String str8 = z840Var.f280369j;
        pxj pxjVar = z840Var.f280370k;
        boolean z = z840Var.f280371l;
        boolean z2 = z840Var.f280372m;
        boolean z3 = z840Var.f280373n;
        boolean z4 = z840Var.f280374o;
        Integer num2 = (i & 32768) != 0 ? z840Var.f280375p : num;
        b740 b740Var2 = (i & 65536) != 0 ? z840Var.f280376q : b740Var;
        boolean z5 = z840Var.f280377r;
        f5u f5uVar = z840Var.f280378s;
        boolean z6 = z840Var.f280379t;
        z840Var.getClass();
        return new z840(i2, str, str2, str3, str4, x640Var, str5, str6, str7, str8, pxjVar, z, z2, z3, z4, num2, b740Var2, z5, f5uVar, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z840)) {
            return false;
        }
        z840 z840Var = (z840) obj;
        return this.f280360a == z840Var.f280360a && wj50.m88271j(this.f280361b, z840Var.f280361b) && wj50.m88271j(this.f280362c, z840Var.f280362c) && wj50.m88271j(this.f280363d, z840Var.f280363d) && wj50.m88271j(this.f280364e, z840Var.f280364e) && wj50.m88271j(this.f280365f, z840Var.f280365f) && wj50.m88271j(this.f280366g, z840Var.f280366g) && wj50.m88271j(this.f280367h, z840Var.f280367h) && wj50.m88271j(this.f280368i, z840Var.f280368i) && wj50.m88271j(this.f280369j, z840Var.f280369j) && this.f280370k == z840Var.f280370k && this.f280371l == z840Var.f280371l && this.f280372m == z840Var.f280372m && this.f280373n == z840Var.f280373n && this.f280374o == z840Var.f280374o && wj50.m88271j(this.f280375p, z840Var.f280375p) && wj50.m88271j(this.f280376q, z840Var.f280376q) && this.f280377r == z840Var.f280377r && wj50.m88271j(this.f280378s, z840Var.f280378s) && this.f280379t == z840Var.f280379t;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((this.f280365f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f280360a) * 31, 31, this.f280361b), 31, this.f280362c), 31, this.f280363d), 31, this.f280364e)) * 31, 31, this.f280366g), 31, this.f280367h), 31, this.f280368i), 31, this.f280369j);
        pxj pxjVar = this.f280370k;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (pxjVar == null ? 0 : pxjVar.hashCode())) * 31, 31, this.f280371l), 31, this.f280372m), 31, this.f280373n), 31, this.f280374o);
        Integer num = this.f280375p;
        int iHashCode = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        b740 b740Var = this.f280376q;
        int iM77245d2 = s571.m77245d((iHashCode + (b740Var == null ? 0 : b740Var.hashCode())) * 31, 31, this.f280377r);
        f5u f5uVar = this.f280378s;
        return Boolean.hashCode(this.f280379t) + ((iM77245d2 + (f5uVar != null ? f5uVar.hashCode() : 0)) * 31);
    }

    public /* synthetic */ z840(int i, String str, String str2, String str3, String str4, x640 x640Var, String str5, String str6, String str7, String str8, pxj pxjVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, f5u f5uVar, boolean z6, int i2) {
        this(i, str, str2, str3, str4, x640Var, str5, str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? null : pxjVar, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? false : z3, (i2 & 16384) != 0 ? false : z4, null, null, (131072 & i2) != 0 ? false : z5, (i2 & 262144) != 0 ? null : f5uVar, z6);
    }
}
