package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rnz {

    /* JADX INFO: renamed from: a */
    public final int f201024a;

    /* JADX INFO: renamed from: b */
    public final int f201025b;

    /* JADX INFO: renamed from: c */
    public final qnz f201026c;

    public rnz(int i, int i2, qnz qnzVar) {
        this.f201024a = i;
        this.f201025b = i2;
        this.f201026c = qnzVar;
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
        if (!(obj instanceof rnz)) {
            return false;
        }
        rnz rnzVar = (rnz) obj;
        if (this.f201024a != rnzVar.f201024a || this.f201025b != rnzVar.f201025b || !this.f201026c.equals(rnzVar.f201026c)) {
            return false;
        }
        pnz pnzVar = pnz.f179544e;
        return pnzVar.equals(pnzVar);
    }

    public final int hashCode() {
        return ((this.f201026c.f190719e.hashCode() + mt60.m62800g(this.f201025b, Integer.hashCode(this.f201024a) * 31, 31)) * 31) + 1120738640;
    }
}
