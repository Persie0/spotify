package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iq61 implements ifw0 {

    /* JADX INFO: renamed from: a */
    public final xv41 f104646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c851 f104647b;

    public iq61(c851 c851Var) {
        this.f104647b = c851Var;
        this.f104646a = ((a951) c851Var).m25076f(tfw0.class);
    }

    @Override // p204p.ifw0
    /* JADX INFO: renamed from: a */
    public final xv41 mo50456a() {
        return this.f104646a;
    }

    @Override // p204p.ifw0
    /* JADX INFO: renamed from: c */
    public final void mo50457c(String str) {
        ((a951) this.f104647b).m25075e(new qfw0(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ifw0
    /* JADX INFO: renamed from: d */
    public final Object mo50458d(String str, fbk fbkVar) {
        hq61 hq61Var;
        if (fbkVar instanceof hq61) {
            hq61Var = (hq61) fbkVar;
            int i = hq61Var.f94043d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hq61Var.f94043d = i - Integer.MIN_VALUE;
            } else {
                hq61Var = new hq61(this, (ibk) fbkVar);
            }
        } else {
            hq61Var = new hq61(this, (ibk) fbkVar);
        }
        Object objM86756u = hq61Var.f94041b;
        int i2 = hq61Var.f94043d;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            ofw0 ofw0Var = new ofw0(str);
            a951 a951Var = (a951) this.f104647b;
            a951Var.m25075e(ofw0Var);
            f80 f80Var = new f80(a951Var.m25076f(tfw0.class), 10);
            hvi0 hvi0Var = cks.f39079b;
            fbk fbkVar2 = null;
            vjz vjzVar = new vjz(gyf1.m46157w(f80Var, jwg1.m54449D(60, ils.SECONDS)), new ww0(3, 27, fbkVar2), 2);
            moe moeVar = new moe(fbkVar2, str, 6);
            hq61Var.f94040a = str;
            hq61Var.f94043d = 1;
            objM86756u = vyf1.m86756u(vjzVar, moeVar, hq61Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = hq61Var.f94040a;
            bga.m29073P(objM86756u);
        }
        Object obj = ((s6x0) objM86756u).f206218a;
        boolean z = obj instanceof c6x0;
        lcj lcjVar = lcj.f131943a;
        if (!z) {
            ncj ncjVar = (ncj) ((tfw0) obj).f220062a.get(str);
            obj = ncjVar == null ? lcjVar : ncjVar;
        }
        return obj instanceof c6x0 ? lcjVar : obj;
    }
}
