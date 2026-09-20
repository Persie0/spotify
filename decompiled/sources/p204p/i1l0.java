package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i1l0 implements k330 {

    /* JADX INFO: renamed from: a */
    public final rzd1 f97544a;

    public i1l0(rzd1 rzd1Var) {
        this.f97544a = rzd1Var;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        return Collections.singletonList(new z0l0(b250Var, new b1l0(this.f97544a)));
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
        if (!(obj instanceof i1l0) || !this.f97544a.equals(((i1l0) obj).f97544a)) {
            return false;
        }
        t3x0 t3x0Var = t3x0.f216854d;
        return t3x0Var.equals(t3x0Var);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return t3x0.f216854d;
    }

    @Override // p204p.k330
    public final String getId() {
        return "offline-ready-shelf";
    }

    public final int hashCode() {
        return klh.m56829a(0, 31, 103145323, (this.f97544a.hashCode() - 1150326230) * 31);
    }
}
