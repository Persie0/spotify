package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rhb0 {

    /* JADX INFO: renamed from: a */
    public final xf81 f199184a;

    public rhb0(xf81 xf81Var) {
        this.f199184a = xf81Var;
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
        if (!(obj instanceof rhb0)) {
            return false;
        }
        rhb0 rhb0Var = (rhb0) obj;
        shb0 shb0Var = shb0.f209159a;
        return shb0Var.equals(shb0Var) && this.f199184a.equals(rhb0Var.f199184a);
    }

    public final int hashCode() {
        return this.f199184a.hashCode() + 242872326;
    }
}
