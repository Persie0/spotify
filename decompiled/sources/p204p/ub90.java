package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ub90 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f228658b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ niz f228659c;

    public /* synthetic */ ub90(niz nizVar, rlv0 rlv0Var, int i) {
        this.f228657a = i;
        this.f228659c = nizVar;
        this.f228658b = rlv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        tb90 tb90Var;
        r8t0 r8t0Var;
        switch (this.f228657a) {
            case 0:
                if (fbkVar instanceof tb90) {
                    tb90Var = (tb90) fbkVar;
                    int i = tb90Var.f218800b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tb90Var.f218800b = i - Integer.MIN_VALUE;
                    } else {
                        tb90Var = new tb90(this, fbkVar);
                    }
                } else {
                    tb90Var = new tb90(this, fbkVar);
                }
                Object obj2 = tb90Var.f218799a;
                int i2 = tb90Var.f218800b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Object obj3 = this.f228658b.f200373a;
                    if (obj3 != null) {
                        tb90Var.f218800b = 1;
                        Object objEmit = this.f228659c.emit(obj3, tb90Var);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                rlv0 rlv0Var = this.f228658b;
                pqm0 pqm0Var = new pqm0(rlv0Var.f200373a, obj);
                rlv0Var.f200373a = obj;
                Object objEmit2 = this.f228659c.emit(pqm0Var, fbkVar);
                return objEmit2 == yuk.f276404a ? objEmit2 : w2a1.f247311a;
            default:
                if (fbkVar instanceof r8t0) {
                    r8t0Var = (r8t0) fbkVar;
                    int i3 = r8t0Var.f196838d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        r8t0Var.f196838d = i3 - Integer.MIN_VALUE;
                    } else {
                        r8t0Var = new r8t0(this, fbkVar);
                    }
                } else {
                    r8t0Var = new r8t0(this, fbkVar);
                }
                Object obj4 = r8t0Var.f196836b;
                int i4 = r8t0Var.f196838d;
                rlv0 rlv0Var2 = this.f228658b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    pqm0 pqm0Var2 = new pqm0(rlv0Var2.f200373a, obj);
                    r8t0Var.f196835a = obj;
                    r8t0Var.f196838d = 1;
                    Object objEmit3 = this.f228659c.emit(pqm0Var2, r8t0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit3 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = r8t0Var.f196835a;
                    bga.m29073P(obj4);
                }
                rlv0Var2.f200373a = obj;
                return w2a1.f247311a;
        }
    }

    public ub90(rlv0 rlv0Var, niz nizVar) {
        this.f228657a = 1;
        this.f228658b = rlv0Var;
        this.f228659c = nizVar;
    }
}
