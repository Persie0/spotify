package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q0k {

    /* JADX INFO: renamed from: a */
    public final String f184016a;

    /* JADX INFO: renamed from: b */
    public final String f184017b;

    /* JADX INFO: renamed from: c */
    public final eh00 f184018c;

    public q0k(String str, String str2, eh00 eh00Var, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        eh00Var = (i & 16) != 0 ? bpj.f29508e : eh00Var;
        this.f184016a = str;
        this.f184017b = str2;
        this.f184018c = eh00Var;
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
        if (!(obj instanceof q0k)) {
            return false;
        }
        q0k q0kVar = (q0k) obj;
        if (!wj50.m88271j(this.f184016a, q0kVar.f184016a) || !wj50.m88271j(this.f184017b, q0kVar.f184017b)) {
            return false;
        }
        a1k a1kVar = a1k.f11431a;
        return a1kVar.equals(a1kVar) && wj50.m88271j(this.f184018c.invoke(), q0kVar.f184018c.invoke());
    }

    public final int hashCode() {
        int iHashCode = this.f184016a.hashCode() * 31;
        String str = this.f184017b;
        return ((q4k) this.f184018c.invoke()).hashCode() + ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) - 1965951071) * 31);
    }
}
