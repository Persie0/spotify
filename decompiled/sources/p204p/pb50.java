package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class pb50 {

    /* JADX INFO: renamed from: a */
    public final String f175715a;

    /* JADX INFO: renamed from: b */
    public final String f175716b;

    /* JADX INFO: renamed from: c */
    public final String f175717c;

    /* JADX INFO: renamed from: d */
    public final List f175718d;

    /* JADX INFO: renamed from: e */
    public final boolean f175719e;

    public pb50(String str, String str2, boolean z, String str3, List list) {
        this.f175715a = str;
        this.f175716b = str2;
        this.f175717c = str3;
        this.f175718d = list;
        this.f175719e = z;
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
        if (!(obj instanceof pb50)) {
            return false;
        }
        pb50 pb50Var = (pb50) obj;
        if (!wj50.m88271j(this.f175715a, pb50Var.f175715a) || !wj50.m88271j(this.f175716b, pb50Var.f175716b) || !wj50.m88271j(this.f175717c, pb50Var.f175717c)) {
            return false;
        }
        y3k y3kVar = y3k.f268958b;
        return y3kVar.equals(y3kVar) && wj50.m88271j(this.f175718d, pb50Var.f175718d) && this.f175719e == pb50Var.f175719e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175719e) + s571.m77244c((((this.f175717c.hashCode() + s571.m77243b(this.f175715a.hashCode() * 31, 31, this.f175716b)) * 31) - 414161009) * 31, 31, this.f175718d);
    }
}
