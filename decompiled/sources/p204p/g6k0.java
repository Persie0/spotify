package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class g6k0 implements i6k0 {

    /* JADX INFO: renamed from: a */
    public final String f77062a;

    /* JADX INFO: renamed from: b */
    public final String f77063b;

    public g6k0(String str, String str2) {
        this.f77062a = str;
        this.f77063b = str2;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return lau.f131415a;
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
        if (!(obj instanceof g6k0)) {
            return false;
        }
        g6k0 g6k0Var = (g6k0) obj;
        if (!wj50.m88271j(this.f77062a, g6k0Var.f77062a) || !wj50.m88271j(this.f77063b, g6k0Var.f77063b)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar);
    }

    public final int hashCode() {
        return ((this.f77063b.hashCode() + (this.f77062a.hashCode() * 31)) * 31) + 1;
    }
}
