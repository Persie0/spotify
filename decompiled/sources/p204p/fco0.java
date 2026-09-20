package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fco0 extends mb61 implements bi00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f68211a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f68212b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f68213c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ tdu f68214d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ pqm0 f68215e;

    public fco0(fbk fbkVar) {
        super(6, fbkVar);
    }

    @Override // p204p.bi00
    /* JADX INFO: renamed from: c0 */
    public final Object mo27353c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        fco0 fco0Var = new fco0((fbk) obj6);
        fco0Var.f68211a = zBooleanValue;
        fco0Var.f68212b = zBooleanValue2;
        fco0Var.f68213c = zBooleanValue3;
        fco0Var.f68214d = (tdu) obj4;
        fco0Var.f68215e = (pqm0) obj5;
        return fco0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f68211a;
        boolean z2 = this.f68212b;
        boolean z3 = this.f68213c;
        tdu tduVar = this.f68214d;
        pqm0 pqm0Var = this.f68215e;
        bga.m29073P(obj);
        return new aco0(z, z2, z3, tduVar, ((Boolean) pqm0Var.f180350a).booleanValue(), ((Boolean) pqm0Var.f180351b).booleanValue());
    }
}
