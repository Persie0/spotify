package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yhd1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272837a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float[] f272838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f272839c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f272840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhd1(int i, float[] fArr, float f, kqi0 kqi0Var) {
        super(1);
        this.f272837a = i;
        this.f272838b = fArr;
        this.f272839c = f;
        this.f272840d = kqi0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        kqi0 kqi0Var = this.f272840d;
        float[] fArr = (float[]) kqi0Var.getValue();
        int i = this.f272837a;
        float[] fArr2 = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            fArr2[i2] = ((this.f272838b[i2] - f) * this.f272839c) + f;
        }
        kqi0Var.setValue(fArr2);
        return w2a1.f247311a;
    }
}
