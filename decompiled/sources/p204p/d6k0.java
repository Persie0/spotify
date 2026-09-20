package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d6k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f45715a;

    /* JADX INFO: renamed from: b */
    public final String f45716b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f45717c;

    /* JADX INFO: renamed from: d */
    public final boolean f45718d;

    public d6k0(String str, String str2, ArrayList arrayList, boolean z) {
        this.f45715a = str;
        this.f45716b = str2;
        this.f45717c = arrayList;
        this.f45718d = z;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return lau.f131415a;
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
        if (!(obj instanceof d6k0)) {
            return false;
        }
        d6k0 d6k0Var = (d6k0) obj;
        if (!wj50.m88271j(this.f45715a, d6k0Var.f45715a) || !wj50.m88271j(this.f45716b, d6k0Var.f45716b) || !this.f45717c.equals(d6k0Var.f45717c) || this.f45718d != d6k0Var.f45718d) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar);
    }

    public final int hashCode() {
        int iHashCode = this.f45715a.hashCode() * 31;
        String str = this.f45716b;
        return ((Boolean.hashCode(this.f45718d) + lq51.m59700f(this.f45717c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31) + 1;
    }
}
