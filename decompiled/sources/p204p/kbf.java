package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kbf implements ho40 {

    /* JADX INFO: renamed from: a */
    public final ho40 f121196a;

    public kbf(ho40 ho40Var) {
        this.f121196a = ho40Var;
    }

    @Override // p204p.ho40
    /* JADX INFO: renamed from: a */
    public final jlq mo42260a(voi0 voi0Var) {
        return new jbf(this.f121196a.mo42260a(voi0Var), zbp.f281359f.mo42260a(voi0Var));
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
        if (!(obj instanceof kbf) || !wj50.m88271j(this.f121196a, ((kbf) obj).f121196a)) {
            return false;
        }
        zbp zbpVar = zbp.f281359f;
        return zbpVar.equals(zbpVar);
    }

    @Override // p204p.ho40
    public final int hashCode() {
        return (this.f121196a.hashCode() * 31) - 1;
    }
}
