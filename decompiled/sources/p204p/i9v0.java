package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i9v0 implements j9v0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100089a;

    public i9v0(boolean z) {
        this.f100089a = z;
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
        if (!(obj instanceof i9v0)) {
            return false;
        }
        i9v0 i9v0Var = (i9v0) obj;
        x96 x96Var = x96.f259282a;
        return x96Var.equals(x96Var) && this.f100089a == i9v0Var.f100089a;
    }

    @Override // p204p.j9v0
    /* JADX INFO: renamed from: h */
    public final boolean mo44139h() {
        return this.f100089a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100089a) + 998809616;
    }

    @Override // p204p.j9v0
    /* JADX INFO: renamed from: i */
    public final x96 mo44140i() {
        return x96.f259282a;
    }
}
