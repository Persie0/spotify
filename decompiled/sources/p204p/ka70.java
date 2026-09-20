package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ka70 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final List f120815a;

    /* JADX INFO: renamed from: b */
    public final List f120816b;

    public ka70(int i, List list, List list2) {
        int i2 = i & 1;
        lau lauVar = lau.f131415a;
        list = i2 != 0 ? lauVar : list;
        list2 = (i & 2) != 0 ? lauVar : list2;
        this.f120815a = list;
        this.f120816b = list2;
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
        if (!(obj instanceof ka70)) {
            return false;
        }
        ka70 ka70Var = (ka70) obj;
        if (!wj50.m88271j(this.f120815a, ka70Var.f120815a) || !wj50.m88271j(this.f120816b, ka70Var.f120816b)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar) && lauVar.equals(lauVar);
    }

    public final int hashCode() {
        return ((((this.f120816b.hashCode() + (this.f120815a.hashCode() * 31)) * 31) + 1) * 31) + 1;
    }
}
