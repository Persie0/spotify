package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pbb0 implements qbb0 {

    /* JADX INFO: renamed from: a */
    public final String f175762a;

    /* JADX INFO: renamed from: b */
    public final String f175763b;

    /* JADX INFO: renamed from: c */
    public final String f175764c;

    /* JADX INFO: renamed from: d */
    public final String f175765d;

    public pbb0(String str, String str2, String str3, String str4) {
        this.f175762a = str;
        this.f175763b = str2;
        this.f175764c = str3;
        this.f175765d = str4;
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
        if (!(obj instanceof pbb0)) {
            return false;
        }
        pbb0 pbb0Var = (pbb0) obj;
        shb0 shb0Var = shb0.f209159a;
        return shb0Var.equals(shb0Var) && wj50.m88271j(this.f175762a, pbb0Var.f175762a) && wj50.m88271j(this.f175763b, pbb0Var.f175763b) && wj50.m88271j(this.f175764c, pbb0Var.f175764c) && wj50.m88271j(this.f175765d, pbb0Var.f175765d);
    }

    public final int hashCode() {
        return this.f175765d.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(242872326, 31, this.f175762a), 31, this.f175763b), 31, this.f175764c);
    }
}
