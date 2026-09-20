package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qc90 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f187283a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f187284b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f187285c;

    /* JADX INFO: renamed from: d */
    public final pfm0 f187286d;

    public qc90(voc1 voc1Var, cbm0 cbm0Var, pkh pkhVar, h4t0 h4t0Var, c2n c2nVar, n6q n6qVar, ka70 ka70Var) {
        this.f187283a = pkhVar;
        this.f187284b = h4t0Var;
        this.f187285c = c2nVar;
        this.f187286d = new pfm0(new qfm0[]{new e6m0(true), new sw91(14, true, false, false), new q040(cbm0Var, voc1Var, null), new fda(null, bda.f26062b, null, 0, null, n6qVar, false, false, false, 2013), new q7i0(1, true), new pw71(new p1x0(R.string.listening_activity_details_title)), ka70Var}, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m72525c(qc90 qc90Var, ibk ibkVar) {
        pc90 pc90Var;
        i4t0 i4t0Var = qc90Var.f187285c;
        if (ibkVar instanceof pc90) {
            pc90Var = (pc90) ibkVar;
            int i = pc90Var.f175984c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pc90Var.f175984c = i - Integer.MIN_VALUE;
            } else {
                pc90Var = new pc90(qc90Var, ibkVar);
            }
        } else {
            pc90Var = new pc90(qc90Var, ibkVar);
        }
        Object objM67779m = pc90Var.f175982a;
        int i2 = pc90Var.f175984c;
        if (i2 == 0) {
            bga.m29073P(objM67779m);
            String strM59877a = ((lta1) ((zv41) ((ota1) i4t0Var.get()).m67778k()).getValue()).m59877a();
            ota1 ota1Var = (ota1) i4t0Var.get();
            pc90Var.f175984c = 1;
            objM67779m = ota1Var.m67779m(strM59877a, pc90Var);
            yuk yukVar = yuk.f276404a;
            if (objM67779m == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM67779m);
        }
        return (lta1) objM67779m;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f187286d;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f187283a.m70217a(tky.m81025a(nxf1.m65833l(new g090(this, null, 7))), rkk.m75763o(new hv60(this, 19), true, -690625425), new hlh(null, null, null, false, 63));
    }
}
