package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class exo0 {

    /* JADX INFO: renamed from: a */
    public final dxo0 f63812a;

    public exo0(dxo0 dxo0Var) {
        this.f63812a = dxo0Var;
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
        if (!(obj instanceof exo0)) {
            return false;
        }
        exo0 exo0Var = (exo0) obj;
        cxo0 cxo0Var = cxo0.f43073a;
        return cxo0Var.equals(cxo0Var) && this.f63812a.equals(exo0Var.f63812a);
    }

    public final int hashCode() {
        return this.f63812a.hashCode() + f710.m40938f(2, ((edb.m38547C(1) * 31) + 210175704) * 31, 31);
    }
}
