package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ku21 implements k330 {

    /* JADX INFO: renamed from: a */
    public final String f126438a;

    /* JADX INFO: renamed from: b */
    public final tu21 f126439b;

    public ku21(String str, tu21 tu21Var) {
        this.f126438a = str;
        this.f126439b = tu21Var;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        return Collections.singletonList(new iu21(this.f126438a, b250Var, this.f126439b));
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
        if (!(obj instanceof ku21)) {
            return false;
        }
        ku21 ku21Var = (ku21) obj;
        if (!wj50.m88271j(this.f126438a, ku21Var.f126438a)) {
            return false;
        }
        t3x0 t3x0Var = t3x0.f216854d;
        return t3x0Var.equals(t3x0Var) && this.f126439b == ku21Var.f126439b;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return t3x0.f216854d;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f126438a;
    }

    public final int hashCode() {
        return this.f126439b.hashCode() + (((0 * 31) + 103145323 + (this.f126438a.hashCode() * 29791)) * 31);
    }
}
