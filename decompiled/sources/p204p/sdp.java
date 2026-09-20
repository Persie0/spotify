package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public final class sdp implements th00 {

    /* JADX INFO: renamed from: a */
    public final Activity f208059a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f208060b;

    /* JADX INFO: renamed from: c */
    public final dcm0 f208061c;

    /* JADX INFO: renamed from: d */
    public final yz80 f208062d;

    /* JADX INFO: renamed from: e */
    public final g2q f208063e;

    /* JADX INFO: renamed from: f */
    public final q831 f208064f;

    /* JADX INFO: renamed from: g */
    public final n6q f208065g;

    /* JADX INFO: renamed from: h */
    public final n5f f208066h;

    /* JADX INFO: renamed from: i */
    public final luk f208067i;

    /* JADX INFO: renamed from: t */
    public final luk f208068t;

    public sdp(Activity activity, z9j0 z9j0Var, dcm0 dcm0Var, yz80 yz80Var, g2q g2qVar, q831 q831Var, n6q n6qVar, n5f n5fVar, luk lukVar, luk lukVar2) {
        this.f208059a = activity;
        this.f208060b = z9j0Var;
        this.f208061c = dcm0Var;
        this.f208062d = yz80Var;
        this.f208063e = g2qVar;
        this.f208064f = q831Var;
        this.f208065g = n6qVar;
        this.f208066h = n5fVar;
        this.f208067i = lukVar;
        this.f208068t = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m77876a(sdp sdpVar, String str, ibk ibkVar) throws Throwable {
        qdp qdpVar;
        if (ibkVar instanceof qdp) {
            qdpVar = (qdp) ibkVar;
            int i = qdpVar.f187732c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qdpVar.f187732c = i - Integer.MIN_VALUE;
            } else {
                qdpVar = new qdp(sdpVar, ibkVar);
            }
        } else {
            qdpVar = new qdp(sdpVar, ibkVar);
        }
        Object objM89557A = qdpVar.f187730a;
        int i2 = qdpVar.f187732c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            luk lukVar = sdpVar.f208067i;
            jil jilVar = new jil(sdpVar, str, null, 18);
            qdpVar.f187732c = 1;
            objM89557A = x0h1.m89557A(lukVar, jilVar, qdpVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        return ((s6x0) objM89557A).f206218a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.th00
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(rb31 rb31Var, fbk fbkVar) throws Throwable {
        pdp pdpVar;
        if (fbkVar instanceof pdp) {
            pdpVar = (pdp) fbkVar;
            int i = pdpVar.f176531c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdpVar.f176531c = i - Integer.MIN_VALUE;
            } else {
                pdpVar = new pdp(this, fbkVar);
            }
        } else {
            pdpVar = new pdp(this, fbkVar);
        }
        Object obj = pdpVar.f176529a;
        int i2 = pdpVar.f176531c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (rb31Var.f197433b) {
                String str = rb31Var.f197432a;
                pdpVar.f176531c = 1;
                Object objM89557A = x0h1.m89557A(this.f208068t, new shh(this, str, (fbk) null, 13), pdpVar);
                yuk yukVar = yuk.f276404a;
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f208065g.m63782a(bda.f26063c);
        return w2a1Var;
    }
}
