package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jy81 {

    /* JADX INFO: renamed from: a */
    public final List f117329a;

    public jy81(List list) {
        this.f117329a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Media sequence must not be empty.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m54781a() {
        return g6f.m43700N0(lau.f131415a, this.f117329a);
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
        if (!(obj instanceof jy81) || !wj50.m88271j(this.f117329a, ((jy81) obj).f117329a)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar);
    }

    public final int hashCode() {
        return (this.f117329a.hashCode() * 31) + 1;
    }
}
