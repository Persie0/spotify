package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;

/* JADX INFO: loaded from: classes11.dex */
public final class jj20 {

    /* JADX INFO: renamed from: a */
    public final gw4 f112871a = s95.m77551a(0.0f);

    /* JADX INFO: renamed from: b */
    public final gw4 f112872b = s95.m77551a(0.0f);

    /* JADX INFO: renamed from: c */
    public final gw4 f112873c = s95.m77551a(0.0f);

    /* JADX INFO: renamed from: d */
    public final im91 f112874d = jg31.m53259E(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, new yzl(0.0f, 0.0f, 0.2f, 1.0f), 2);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m53492a(xuk xukVar, ibk ibkVar) {
        gj20 gj20Var;
        if (ibkVar instanceof gj20) {
            gj20Var = (gj20) ibkVar;
            int i = gj20Var.f80339d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gj20Var.f80339d = i - Integer.MIN_VALUE;
            } else {
                gj20Var = new gj20(this, ibkVar);
            }
        } else {
            gj20Var = new gj20(this, ibkVar);
        }
        Object obj = gj20Var.f80337b;
        int i2 = gj20Var.f80339d;
        if (i2 == 0) {
            bga.m29073P(obj);
            Float f = new Float(1.0f);
            gj20Var.f80336a = xukVar;
            gj20Var.f80339d = 1;
            Object objM45914g = this.f112873c.m45914g(f, gj20Var);
            yuk yukVar = yuk.f276404a;
            if (objM45914g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xukVar = gj20Var.f80336a;
            bga.m29073P(obj);
        }
        fbk fbkVar = null;
        x0h1.m89578u(xukVar, null, 0, new hj20(this, fbkVar, 0), 3);
        x0h1.m89578u(xukVar, null, 0, new hj20(this, fbkVar, 1), 3);
        x0h1.m89578u(xukVar, null, 0, new hj20(this, fbkVar, 2), 3);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m53493b(xuk xukVar, ibk ibkVar) {
        ij20 ij20Var;
        if (ibkVar instanceof ij20) {
            ij20Var = (ij20) ibkVar;
            int i = ij20Var.f102676d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij20Var.f102676d = i - Integer.MIN_VALUE;
            } else {
                ij20Var = new ij20(this, ibkVar);
            }
        } else {
            ij20Var = new ij20(this, ibkVar);
        }
        Object obj = ij20Var.f102674b;
        int i2 = ij20Var.f102676d;
        if (i2 == 0) {
            bga.m29073P(obj);
            Float f = new Float(1.0f);
            ij20Var.f102673a = xukVar;
            ij20Var.f102676d = 1;
            Object objM45914g = this.f112872b.m45914g(f, ij20Var);
            yuk yukVar = yuk.f276404a;
            if (objM45914g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xukVar = ij20Var.f102673a;
            bga.m29073P(obj);
        }
        fbk fbkVar = null;
        x0h1.m89578u(xukVar, null, 0, new hj20(this, fbkVar, 3), 3);
        x0h1.m89578u(xukVar, null, 0, new hj20(this, fbkVar, 4), 3);
        x0h1.m89578u(xukVar, null, 0, new hj20(this, fbkVar, 5), 3);
        return w2a1.f247311a;
    }
}
