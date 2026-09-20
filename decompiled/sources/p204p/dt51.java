package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dt51 implements niz {

    /* JADX INFO: renamed from: a */
    public final niz f52733a;

    /* JADX INFO: renamed from: b */
    public final q950 f52734b;

    public dt51(niz nizVar, q950 q950Var) {
        this.f52733a = nizVar;
        this.f52734b = q950Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.ibk] */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.ibk] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
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
    /* JADX INFO: renamed from: b */
    public final Object m36805b(ibk ibkVar) {
        ct51 ct51Var;
        if (ibkVar instanceof ct51) {
            ct51Var = (ct51) ibkVar;
            int i = ct51Var.f41782d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct51Var.f41782d = i - Integer.MIN_VALUE;
            } else {
                ct51Var = new ct51(this, ibkVar);
            }
        } else {
            ct51Var = new ct51(this, ibkVar);
        }
        Object obj = ct51Var.f41780b;
        ?? r1 = ct51Var.f41782d;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f52733a;
        yuk yukVar = yuk.f276404a;
        try {
            if (r1 == 0) {
                bga.m29073P(obj);
                izx0 izx0Var = new izx0(nizVar, ct51Var.getContext());
                q950 q950Var = this.f52734b;
                ct51Var.f41779a = izx0Var;
                ct51Var.f41782d = 1;
                Object objInvoke = q950Var.invoke(izx0Var, ct51Var);
                r1 = izx0Var;
                if (objInvoke != yukVar) {
                }
                return yukVar;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            izx0 izx0Var2 = ct51Var.f41779a;
            bga.m29073P(obj);
            r1 = izx0Var2;
            r1.releaseIntercepted();
            if (nizVar instanceof dt51) {
                ct51Var.f41779a = null;
                ct51Var.f41782d = 2;
                if (((dt51) nizVar).m36805b(ct51Var) == yukVar) {
                    return yukVar;
                }
            }
            return w2a1Var;
        } catch (Throwable th) {
            r1.releaseIntercepted();
            throw th;
        }
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        return this.f52733a.emit(obj, fbkVar);
    }
}
