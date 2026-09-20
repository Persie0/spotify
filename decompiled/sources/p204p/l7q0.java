package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l7q0 {

    /* JADX INFO: renamed from: a */
    public final String f130717a;

    /* JADX INFO: renamed from: b */
    public final String f130718b;

    /* JADX INFO: renamed from: c */
    public final String f130719c;

    public l7q0(String str, String str2, String str3) {
        this.f130717a = str;
        this.f130718b = str2;
        this.f130719c = str3;
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
        if (!(obj instanceof l7q0)) {
            return false;
        }
        l7q0 l7q0Var = (l7q0) obj;
        if (!wj50.m88271j(this.f130717a, l7q0Var.f130717a) || !wj50.m88271j(this.f130718b, l7q0Var.f130718b)) {
            return false;
        }
        y3k y3kVar = y3k.f268958b;
        return y3kVar.equals(y3kVar) && wj50.m88271j(this.f130719c, l7q0Var.f130719c);
    }

    public final int hashCode() {
        return this.f130719c.hashCode() + ((((this.f130718b.hashCode() + (this.f130717a.hashCode() * 31)) * 31) - 414161009) * 31);
    }
}
