package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uvc {

    /* JADX INFO: renamed from: a */
    public final k5m0 f234418a;

    /* JADX INFO: renamed from: b */
    public final awc f234419b;

    /* JADX INFO: renamed from: c */
    public final es2 f234420c;

    /* JADX INFO: renamed from: d */
    public final wf4 f234421d;

    public uvc(k5m0 k5m0Var, awc awcVar, es2 es2Var, wf4 wf4Var) {
        this.f234418a = k5m0Var;
        this.f234419b = awcVar;
        this.f234420c = es2Var;
        this.f234421d = wf4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m84053a(String str, ibk ibkVar) {
        tvc tvcVar;
        awc awcVar = this.f234419b;
        xre xreVar = awcVar.f20473b;
        hv31 hv31Var = awcVar.f20472a;
        if (ibkVar instanceof tvc) {
            tvcVar = (tvc) ibkVar;
            int i = tvcVar.f224118c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tvcVar.f224118c = i - Integer.MIN_VALUE;
            } else {
                tvcVar = new tvc(this, ibkVar);
            }
        } else {
            tvcVar = new tvc(this, ibkVar);
        }
        Object objM56684z = tvcVar.f224116a;
        int i2 = tvcVar.f224118c;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            boolean zM87948f = this.f234421d.m87948f();
            xvc xvcVar = xvc.f266356a;
            if (!zM87948f) {
                return xvcVar;
            }
            fv31 fv31Var = awc.f20471c;
            long jMo48712g = hv31Var.mo48712g(fv31Var, 0L);
            ((wy3) xreVar).getClass();
            long jCurrentTimeMillis = (System.currentTimeMillis() - jMo48712g) / 86400000;
            if (jMo48712g != 0 && jCurrentTimeMillis < 30) {
                fr0.m42475s((wy3) xreVar, hv31Var.edit(), fv31Var);
                return xvcVar;
            }
            xha xhaVar = new xha(this, str, (fbk) null, 20);
            tvcVar.f224118c = 1;
            objM56684z = kk40.m56684z(xhaVar, tvcVar);
            yuk yukVar = yuk.f276404a;
            if (objM56684z == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56684z);
        }
        ds2 ds2Var = (ds2) objM56684z;
        if (!(ds2Var instanceof bs2)) {
            return wvc.f255464a;
        }
        lv31 lv31VarEdit = hv31Var.edit();
        fv31 fv31Var2 = awc.f20471c;
        ((wy3) xreVar).getClass();
        lv31VarEdit.m60050c(fv31Var2, System.currentTimeMillis());
        lv31VarEdit.m60054g();
        return new vvc(((bs2) ds2Var).m30343b());
    }
}
