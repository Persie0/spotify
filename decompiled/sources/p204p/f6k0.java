package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f6k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f66435a;

    /* JADX INFO: renamed from: b */
    public final String f66436b;

    public f6k0(String str, String str2) {
        this.f66435a = str;
        this.f66436b = str2;
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
        if (!(obj instanceof f6k0)) {
            return false;
        }
        f6k0 f6k0Var = (f6k0) obj;
        if (!wj50.m88271j(this.f66435a, f6k0Var.f66435a) || !wj50.m88271j(this.f66436b, f6k0Var.f66436b)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar);
    }

    public final int hashCode() {
        return ((this.f66436b.hashCode() + (this.f66435a.hashCode() * 31)) * 31) + 1;
    }
}
