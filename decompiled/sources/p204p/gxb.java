package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gxb {

    /* JADX INFO: renamed from: a */
    public final String f85246a;

    /* JADX INFO: renamed from: b */
    public final List f85247b;

    public gxb(String str, List list, List list2) {
        this.f85246a = str;
        this.f85247b = list2;
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
        if (!(obj instanceof gxb)) {
            return false;
        }
        gxb gxbVar = (gxb) obj;
        if (!wj50.m88271j(this.f85246a, gxbVar.f85246a)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar) && wj50.m88271j(this.f85247b, gxbVar.f85247b);
    }

    public final int hashCode() {
        String str = this.f85246a;
        return this.f85247b.hashCode() + ((((str == null ? 0 : str.hashCode()) * 31) + 1) * 31);
    }
}
