package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tt21 implements k330 {

    /* JADX INFO: renamed from: a */
    public final String f223489a;

    /* JADX INFO: renamed from: b */
    public final tu21 f223490b;

    public tt21(String str, tu21 tu21Var) {
        this.f223489a = str;
        this.f223490b = tu21Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m81491a(String str, b250 b250Var) {
        return Collections.singletonList(new rt21(this.f223489a, b250Var, this.f223490b, str));
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        return m81491a(null, b250Var);
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
        if (!(obj instanceof tt21)) {
            return false;
        }
        tt21 tt21Var = (tt21) obj;
        if (!wj50.m88271j(this.f223489a, tt21Var.f223489a)) {
            return false;
        }
        t3x0 t3x0Var = t3x0.f216854d;
        return t3x0Var.equals(t3x0Var) && this.f223490b == tt21Var.f223490b;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return t3x0.f216854d;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f223489a;
    }

    public final int hashCode() {
        return this.f223490b.hashCode() + (((0 * 31) + 103145323 + (this.f223489a.hashCode() * 29791)) * 31);
    }
}
