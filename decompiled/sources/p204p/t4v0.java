package p204p;

import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t4v0 {

    /* JADX INFO: renamed from: a */
    public final String f217078a;

    /* JADX INFO: renamed from: b */
    public final gf41 f217079b;

    /* JADX INFO: renamed from: c */
    public final String f217080c;

    /* JADX INFO: renamed from: d */
    public final Date f217081d;

    /* JADX INFO: renamed from: e */
    public final s4v0 f217082e;

    /* JADX INFO: renamed from: f */
    public final List f217083f;

    /* JADX INFO: renamed from: g */
    public final vmg1 f217084g;

    /* JADX INFO: renamed from: h */
    public final String f217085h;

    /* JADX INFO: renamed from: i */
    public final String f217086i;

    /* JADX INFO: renamed from: j */
    public final boolean f217087j;

    /* JADX INFO: renamed from: k */
    public final boolean f217088k;

    /* JADX INFO: renamed from: l */
    public final boolean f217089l;

    /* JADX INFO: renamed from: m */
    public final p4v0 f217090m;

    /* JADX INFO: renamed from: n */
    public final Boolean f217091n;

    /* JADX INFO: renamed from: o */
    public final List f217092o;

    /* JADX INFO: renamed from: p */
    public final boolean f217093p;

    /* JADX INFO: renamed from: q */
    public final boolean f217094q;

    /* JADX INFO: renamed from: r */
    public final boolean f217095r;

    /* JADX INFO: renamed from: s */
    public final boolean f217096s;

    /* JADX INFO: renamed from: t */
    public final boolean f217097t;

    /* JADX INFO: renamed from: u */
    public final String f217098u;

    /* JADX INFO: renamed from: v */
    public final q4v0 f217099v;

    /* JADX INFO: renamed from: w */
    public final String f217100w;

    /* JADX INFO: renamed from: x */
    public final ax01 f217101x;

    /* JADX INFO: renamed from: y */
    public final String f217102y;

    /* JADX INFO: renamed from: z */
    public final List f217103z;

    public t4v0(String str, gf41 gf41Var, String str2, Date date, s4v0 s4v0Var, List list, vmg1 vmg1Var, String str3, String str4, boolean z, boolean z2, boolean z3, p4v0 p4v0Var, Boolean bool, List list2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str5, q4v0 q4v0Var, String str6, ax01 ax01Var, String str7, List list3, int i) {
        boolean z9 = (i & 2048) != 0 ? false : z2;
        boolean z10 = (i & 4096) != 0 ? false : z3;
        boolean z11 = (2097152 & i) == 0 ? z8 : false;
        List list4 = (i & 134217728) != 0 ? lau.f131415a : list3;
        this.f217078a = str;
        this.f217079b = gf41Var;
        this.f217080c = str2;
        this.f217081d = date;
        this.f217082e = s4v0Var;
        this.f217083f = list;
        this.f217084g = vmg1Var;
        this.f217085h = str3;
        this.f217086i = str4;
        this.f217087j = z;
        this.f217088k = z9;
        this.f217089l = z10;
        this.f217090m = p4v0Var;
        this.f217091n = bool;
        this.f217092o = list2;
        this.f217093p = z4;
        this.f217094q = z5;
        this.f217095r = z6;
        this.f217096s = z7;
        this.f217097t = z11;
        this.f217098u = str5;
        this.f217099v = q4v0Var;
        this.f217100w = str6;
        this.f217101x = ax01Var;
        this.f217102y = str7;
        this.f217103z = list4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4v0)) {
            return false;
        }
        t4v0 t4v0Var = (t4v0) obj;
        if (!wj50.m88271j(this.f217078a, t4v0Var.f217078a) || !wj50.m88271j(this.f217079b, t4v0Var.f217079b) || !wj50.m88271j(this.f217080c, t4v0Var.f217080c) || !this.f217081d.equals(t4v0Var.f217081d) || this.f217082e != t4v0Var.f217082e || !wj50.m88271j(this.f217083f, t4v0Var.f217083f)) {
            return false;
        }
        x96 x96Var = x96.f259282a;
        if (!x96Var.equals(x96Var) || !wj50.m88271j(this.f217084g, t4v0Var.f217084g) || !wj50.m88271j(this.f217085h, t4v0Var.f217085h) || !wj50.m88271j(this.f217086i, t4v0Var.f217086i) || this.f217087j != t4v0Var.f217087j || this.f217088k != t4v0Var.f217088k || this.f217089l != t4v0Var.f217089l || !wj50.m88271j(this.f217090m, t4v0Var.f217090m) || !this.f217091n.equals(t4v0Var.f217091n) || !this.f217092o.equals(t4v0Var.f217092o)) {
            return false;
        }
        nau nauVar = nau.f152117a;
        return nauVar.equals(nauVar) && this.f217093p == t4v0Var.f217093p && this.f217094q == t4v0Var.f217094q && this.f217095r == t4v0Var.f217095r && this.f217096s == t4v0Var.f217096s && this.f217097t == t4v0Var.f217097t && wj50.m88271j(this.f217098u, t4v0Var.f217098u) && this.f217099v.equals(t4v0Var.f217099v) && wj50.m88271j(this.f217100w, t4v0Var.f217100w) && wj50.m88271j(this.f217101x, t4v0Var.f217101x) && wj50.m88271j(this.f217102y, t4v0Var.f217102y) && wj50.m88271j(this.f217103z, t4v0Var.f217103z);
    }

    public final int hashCode() {
        int iHashCode = this.f217078a.hashCode() * 31;
        gf41 gf41Var = this.f217079b;
        int iHashCode2 = (((this.f217083f.hashCode() + ((this.f217082e.hashCode() + ((this.f217081d.hashCode() + s571.m77243b((iHashCode + (gf41Var == null ? 0 : gf41Var.hashCode())) * 31, 31, this.f217080c)) * 31)) * 31)) * 31) - 1076158992) * 31;
        vmg1 vmg1Var = this.f217084g;
        int iHashCode3 = (iHashCode2 + (vmg1Var == null ? 0 : vmg1Var.hashCode())) * 31;
        String str = this.f217085h;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f217086i;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f217087j), 31, this.f217088k), 31, this.f217089l);
        p4v0 p4v0Var = this.f217090m;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c((this.f217091n.hashCode() + ((iM77245d + (p4v0Var == null ? 0 : p4v0Var.hashCode())) * 31)) * 31, 961, this.f217092o), 31, this.f217093p), 31, this.f217094q), 31, this.f217095r), 31, this.f217096s), 31, this.f217097t);
        String str3 = this.f217098u;
        int iHashCode5 = (this.f217099v.hashCode() + ((iM77245d2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f217100w;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ax01 ax01Var = this.f217101x;
        int iHashCode7 = (iHashCode6 + (ax01Var == null ? 0 : ax01Var.hashCode())) * 31;
        String str5 = this.f217102y;
        return this.f217103z.hashCode() + ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
