package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fkz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ plv0 f70636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70637b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ niz f70638c;

    public fkz(plv0 plv0Var, int i, niz nizVar) {
        this.f70636a = plv0Var;
        this.f70637b = i;
        this.f70638c = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ekz ekzVar;
        if (fbkVar instanceof ekz) {
            ekzVar = (ekz) fbkVar;
            int i = ekzVar.f60547c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekzVar.f60547c = i - Integer.MIN_VALUE;
            } else {
                ekzVar = new ekz(this, fbkVar);
            }
        } else {
            ekzVar = new ekz(this, fbkVar);
        }
        Object obj2 = ekzVar.f60545a;
        int i2 = ekzVar.f60547c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        plv0 plv0Var = this.f70636a;
        int i3 = plv0Var.f178796a;
        if (i3 < this.f70637b) {
            plv0Var.f178796a = i3 + 1;
            return w2a1Var;
        }
        ekzVar.f60547c = 1;
        Object objEmit = this.f70638c.emit(obj, ekzVar);
        yuk yukVar = yuk.f276404a;
        return objEmit == yukVar ? yukVar : w2a1Var;
    }
}
