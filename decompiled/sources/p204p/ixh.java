package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ixh {

    /* JADX INFO: renamed from: a */
    public final String f106689a;

    /* JADX INFO: renamed from: b */
    public final String f106690b;

    /* JADX INFO: renamed from: c */
    public final boolean f106691c;

    /* JADX INFO: renamed from: d */
    public final String f106692d;

    /* JADX INFO: renamed from: e */
    public final int f106693e;

    public ixh(int i, int i2, String str, String str2, String str3) {
        str2 = (i2 & 2) != 0 ? null : str2;
        boolean z = (i2 & 4) == 0;
        str3 = (i2 & 8) != 0 ? null : str3;
        this.f106689a = str;
        this.f106690b = str2;
        this.f106691c = z;
        this.f106692d = str3;
        this.f106693e = i;
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
        if (!(obj instanceof ixh)) {
            return false;
        }
        ixh ixhVar = (ixh) obj;
        if (!wj50.m88271j(this.f106689a, ixhVar.f106689a) || !wj50.m88271j(this.f106690b, ixhVar.f106690b) || this.f106691c != ixhVar.f106691c || !wj50.m88271j(this.f106692d, ixhVar.f106692d)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar) && this.f106693e == ixhVar.f106693e;
    }

    public final int hashCode() {
        int iHashCode = this.f106689a.hashCode() * 31;
        String str = this.f106690b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f106691c);
        String str2 = this.f106692d;
        return Integer.hashCode(this.f106693e) + ((((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31) + 1) * 31);
    }
}
