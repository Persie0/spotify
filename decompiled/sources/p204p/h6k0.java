package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h6k0 implements i6k0 {

    /* JADX INFO: renamed from: a */
    public final String f88178a;

    /* JADX INFO: renamed from: b */
    public final String f88179b;

    public h6k0(String str, String str2) {
        this.f88178a = str;
        this.f88179b = str2;
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
        if (!(obj instanceof h6k0)) {
            return false;
        }
        h6k0 h6k0Var = (h6k0) obj;
        if (!wj50.m88271j(this.f88178a, h6k0Var.f88178a) || !this.f88179b.equals(h6k0Var.f88179b)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar);
    }

    public final int hashCode() {
        return ((this.f88179b.hashCode() + (this.f88178a.hashCode() * 31)) * 31) + 1;
    }
}
