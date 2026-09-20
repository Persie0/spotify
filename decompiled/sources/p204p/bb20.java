package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bb20 {

    /* JADX INFO: renamed from: a */
    public final ck81 f25396a;

    /* JADX INFO: renamed from: b */
    public long f25397b;

    /* JADX INFO: renamed from: c */
    public boolean f25398c;

    /* JADX INFO: renamed from: d */
    public int f25399d;

    /* JADX INFO: renamed from: e */
    public long f25400e;

    /* JADX INFO: renamed from: f */
    public boolean f25401f;

    /* JADX INFO: renamed from: g */
    public boolean f25402g;

    /* JADX INFO: renamed from: h */
    public boolean f25403h;

    /* JADX INFO: renamed from: i */
    public boolean f25404i;

    /* JADX INFO: renamed from: j */
    public boolean f25405j;

    /* JADX INFO: renamed from: k */
    public long f25406k;

    /* JADX INFO: renamed from: l */
    public long f25407l;

    /* JADX INFO: renamed from: m */
    public boolean f25408m;

    public bb20(ck81 ck81Var) {
        this.f25396a = ck81Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m28612a(int i) {
        long j = this.f25407l;
        if (j != -9223372036854775807L) {
            long j2 = this.f25397b;
            long j3 = this.f25406k;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.f25396a.mo33088b(j, this.f25408m ? 1 : 0, i2, i, null);
        }
    }
}
