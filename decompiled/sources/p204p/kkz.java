package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kkz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ plv0 f123743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f123744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ niz f123745c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f123746d;

    public kkz(plv0 plv0Var, int i, niz nizVar, Object obj) {
        this.f123743a = plv0Var;
        this.f123744b = i;
        this.f123745c = nizVar;
        this.f123746d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jkz jkzVar;
        if (fbkVar instanceof jkz) {
            jkzVar = (jkz) fbkVar;
            int i = jkzVar.f113440c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkzVar.f113440c = i - Integer.MIN_VALUE;
            } else {
                jkzVar = new jkz(this, fbkVar);
            }
        } else {
            jkzVar = new jkz(this, fbkVar);
        }
        Object obj2 = jkzVar.f113438a;
        int i2 = jkzVar.f113440c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj2);
                return w2a1Var;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        plv0 plv0Var = this.f123743a;
        int i3 = plv0Var.f178796a + 1;
        plv0Var.f178796a = i3;
        int i4 = this.f123744b;
        niz nizVar = this.f123745c;
        yuk yukVar = yuk.f276404a;
        if (i3 < i4) {
            jkzVar.f113440c = 1;
            return nizVar.emit(obj, jkzVar) == yukVar ? yukVar : w2a1Var;
        }
        jkzVar.f113440c = 2;
        ryf1.m76711i(nizVar, obj, this.f123746d, jkzVar);
        return yukVar;
    }
}
