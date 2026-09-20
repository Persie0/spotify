package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z7l implements b8l {

    /* JADX INFO: renamed from: a */
    public final t221 f280250a;

    /* JADX INFO: renamed from: b */
    public final List f280251b;

    public z7l(t221 t221Var, List list) {
        this.f280250a = t221Var;
        this.f280251b = list;
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
        if (!(obj instanceof z7l)) {
            return false;
        }
        z7l z7lVar = (z7l) obj;
        if (!wj50.m88271j(this.f280250a, z7lVar.f280250a) || !wj50.m88271j(this.f280251b, z7lVar.f280251b)) {
            return false;
        }
        n9l n9lVar = n9l.f151816a;
        return n9lVar.equals(n9lVar);
    }

    public final int hashCode() {
        return ((this.f280251b.hashCode() + (this.f280250a.hashCode() * 31)) * 31) + 996643979;
    }
}
