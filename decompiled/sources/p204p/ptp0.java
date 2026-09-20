package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ptp0 {

    /* JADX INFO: renamed from: a */
    public final String f181221a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f181222b;

    /* JADX INFO: renamed from: c */
    public final String f181223c;

    /* JADX INFO: renamed from: d */
    public final String f181224d;

    /* JADX INFO: renamed from: e */
    public final String f181225e;

    /* JADX INFO: renamed from: f */
    public final voc1 f181226f;

    public ptp0(String str, ArrayList arrayList, String str2, String str3, String str4, voc1 voc1Var) {
        this.f181221a = str;
        this.f181222b = arrayList;
        this.f181223c = str2;
        this.f181224d = str3;
        this.f181225e = str4;
        this.f181226f = voc1Var;
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
        if (!(obj instanceof ptp0)) {
            return false;
        }
        ptp0 ptp0Var = (ptp0) obj;
        if (!wj50.m88271j(this.f181221a, ptp0Var.f181221a) || !this.f181222b.equals(ptp0Var.f181222b) || !wj50.m88271j(this.f181223c, ptp0Var.f181223c) || !wj50.m88271j(this.f181224d, ptp0Var.f181224d)) {
            return false;
        }
        gbu gbuVar = gbu.f78413a;
        return gbuVar.equals(gbuVar) && gbuVar.equals(gbuVar) && wj50.m88271j(this.f181225e, ptp0Var.f181225e) && wj50.m88271j(this.f181226f, ptp0Var.f181226f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(lq51.m59700f(this.f181222b, this.f181221a.hashCode() * 961, 31), 29791, this.f181223c), 29791, this.f181224d);
        String str = this.f181225e;
        return this.f181226f.f243453a.hashCode() + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, false);
    }
}
