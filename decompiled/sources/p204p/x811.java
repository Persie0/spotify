package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class x811 {

    /* JADX INFO: renamed from: a */
    public final String f259028a;

    /* JADX INFO: renamed from: b */
    public final String f259029b;

    /* JADX INFO: renamed from: c */
    public final boolean f259030c;

    /* JADX INFO: renamed from: d */
    public final String f259031d;

    public x811(String str, String str2, boolean z, String str3) {
        this.f259028a = str;
        this.f259029b = str2;
        this.f259030c = z;
        this.f259031d = str3;
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
        Object obj2 = 5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x811)) {
            return false;
        }
        x811 x811Var = (x811) obj;
        if (!wj50.m88271j(this.f259028a, x811Var.f259028a) || !wj50.m88271j(this.f259029b, x811Var.f259029b) || this.f259030c != x811Var.f259030c || !wj50.m88271j(this.f259031d, x811Var.f259031d)) {
            return false;
        }
        med1 med1Var = med1.f142685a;
        return med1Var.equals(med1Var) && obj2.equals(obj2);
    }

    public final int hashCode() {
        String str = this.f259028a;
        int iM77245d = s571.m77245d(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f259029b), 31, this.f259030c);
        String str2 = this.f259031d;
        Integer num = 5;
        return (num.hashCode() + ((((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31) + 446599921) * 31)) * 31;
    }
}
