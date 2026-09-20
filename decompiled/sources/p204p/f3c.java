package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f3c extends h3c {

    /* JADX INFO: renamed from: a */
    public final String f65450a;

    /* JADX INFO: renamed from: b */
    public final String f65451b;

    /* JADX INFO: renamed from: c */
    public final String f65452c;

    /* JADX INFO: renamed from: d */
    public final String f65453d;

    /* JADX INFO: renamed from: e */
    public final glo f65454e;

    /* JADX INFO: renamed from: f */
    public final boolean f65455f;

    /* JADX INFO: renamed from: g */
    public final boolean f65456g;

    public f3c(String str, String str2, String str3, String str4, glo gloVar, boolean z, boolean z2) {
        this.f65450a = str;
        this.f65451b = str2;
        this.f65452c = str3;
        this.f65453d = str4;
        this.f65454e = gloVar;
        this.f65455f = z;
        this.f65456g = z2;
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
        if (!(obj instanceof f3c)) {
            return false;
        }
        f3c f3cVar = (f3c) obj;
        if (!wj50.m88271j(this.f65450a, f3cVar.f65450a) || !wj50.m88271j(this.f65451b, f3cVar.f65451b) || !this.f65452c.equals(f3cVar.f65452c) || !wj50.m88271j(this.f65453d, f3cVar.f65453d) || !this.f65454e.equals(f3cVar.f65454e)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar) && this.f65455f == f3cVar.f65455f && this.f65456g == f3cVar.f65456g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65456g) + s571.m77245d((((this.f65454e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f65450a.hashCode() * 31, 31, this.f65451b), 31, this.f65452c), 31, this.f65453d)) * 31) + 1) * 31, 31, this.f65455f);
    }
}
