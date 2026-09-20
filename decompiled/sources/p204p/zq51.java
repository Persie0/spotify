package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/zq51;", "Lp/ixh0;", "Lp/ar51;", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final /* data */ class zq51 extends ixh0 {

    /* JADX INFO: renamed from: a */
    public final ccs f285316a;

    public zq51(ccs ccsVar) {
        this.f285316a = ccsVar;
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: b */
    public final exh0 mo24706b() {
        return new ar51(ybg1.f271177a, this.f285316a);
    }

    @Override // p204p.ixh0
    /* JADX INFO: renamed from: c */
    public final void mo24707c(exh0 exh0Var) {
        ar51 ar51Var = (ar51) exh0Var;
        km4 km4Var = ar51Var.f67976N0;
        km4 km4Var2 = ybg1.f271177a;
        if (!wj50.m88271j(km4Var, km4Var2)) {
            ar51Var.f67976N0 = km4Var2;
            if (ar51Var.f67977O0) {
                ar51Var.m41282J1();
            }
        }
        ar51Var.f67975M0 = this.f285316a;
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
        if (!(obj instanceof zq51)) {
            return false;
        }
        zq51 zq51Var = (zq51) obj;
        km4 km4Var = ybg1.f271177a;
        return km4Var.equals(km4Var) && wj50.m88271j(this.f285316a, zq51Var.f285316a);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(1022 * 31, 31, false);
        ccs ccsVar = this.f285316a;
        return iM77245d + (ccsVar != null ? ccsVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + ybg1.f271177a + ", overrideDescendants=false, touchBoundsExpansion=" + this.f285316a + ')';
    }
}
