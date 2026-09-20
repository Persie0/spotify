package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sm60 {

    /* JADX INFO: renamed from: a */
    public final esw0 f210572a;

    /* JADX INFO: renamed from: b */
    public final esw0 f210573b;

    /* JADX INFO: renamed from: c */
    public final boolean f210574c;

    public sm60(esw0 esw0Var, esw0 esw0Var2) {
        this.f210572a = esw0Var;
        this.f210573b = esw0Var2;
        esw0 esw0Var3 = esw0.f62508a;
        this.f210574c = esw0Var == esw0Var3 && esw0Var2 == esw0Var3;
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
        if (!(obj instanceof sm60)) {
            return false;
        }
        sm60 sm60Var = (sm60) obj;
        if (this.f210572a != sm60Var.f210572a || this.f210573b != sm60Var.f210573b) {
            return false;
        }
        nau nauVar = nau.f152117a;
        return nauVar.equals(nauVar);
    }

    public final int hashCode() {
        int iHashCode = this.f210572a.hashCode() * 31;
        esw0 esw0Var = this.f210573b;
        return (iHashCode + (esw0Var == null ? 0 : esw0Var.hashCode())) * 31;
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f210572a + ", migrationLevel=" + this.f210573b + ", userDefinedLevelForSpecificAnnotation=" + nau.f152117a + ')';
    }
}
