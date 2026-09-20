package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class vea1 {

    /* JADX INFO: renamed from: a */
    public final Uri f240663a;

    /* JADX INFO: renamed from: b */
    public final String f240664b;

    public vea1(Uri uri, String str) {
        this.f240663a = uri;
        this.f240664b = str;
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
        if (!(obj instanceof vea1)) {
            return false;
        }
        vea1 vea1Var = (vea1) obj;
        if (!wj50.m88271j(this.f240663a, vea1Var.f240663a) || !this.f240664b.equals(vea1Var.f240664b)) {
            return false;
        }
        rfa1 rfa1Var = rfa1.f198560a;
        return rfa1Var.equals(rfa1Var);
    }

    public final int hashCode() {
        return ((this.f240664b.hashCode() + (this.f240663a.hashCode() * 31)) * 31) - 1965972587;
    }
}
