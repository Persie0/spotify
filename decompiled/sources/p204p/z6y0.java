package p204p;

import com.google.protobuf.Duration;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto$OnUpdateRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class z6y0 implements dut {

    /* JADX INFO: renamed from: X */
    public final cph f280016X;

    /* JADX INFO: renamed from: a */
    public final qax0 f280017a;

    /* JADX INFO: renamed from: b */
    public final q831 f280018b;

    /* JADX INFO: renamed from: c */
    public final ud80 f280019c;

    /* JADX INFO: renamed from: d */
    public final ndm0 f280020d;

    /* JADX INFO: renamed from: e */
    public final Flowable f280021e;

    /* JADX INFO: renamed from: f */
    public final p8p0 f280022f;

    /* JADX INFO: renamed from: g */
    public final k7k f280023g;

    /* JADX INFO: renamed from: h */
    public final zam0 f280024h;

    /* JADX INFO: renamed from: i */
    public final vb61 f280025i = x2h1.m89738B(new pu0(this, null, 13));

    /* JADX INFO: renamed from: t */
    public final i5x f280026t = mhf1.m61771p(this).m94133b(t4y0.f217167c, t4y0.f217169d);

    public z6y0(qax0 qax0Var, q831 q831Var, ud80 ud80Var, ndm0 ndm0Var, Flowable flowable, p8p0 p8p0Var, k7k k7kVar, zam0 zam0Var) {
        this.f280017a = qax0Var;
        this.f280018b = q831Var;
        this.f280019c = ud80Var;
        this.f280020d = ndm0Var;
        this.f280021e = flowable;
        this.f280022f = p8p0Var;
        this.f280023g = k7kVar;
        this.f280024h = zam0Var;
        fyf fyfVar = o5h.f161970b;
        wpi0 wpi0Var = xwt.f266743a;
        this.f280016X = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m95518e(z6y0 z6y0Var, String str, ibk ibkVar) {
        x6y0 x6y0Var;
        if (ibkVar instanceof x6y0) {
            x6y0Var = (x6y0) ibkVar;
            int i = x6y0Var.f258775d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x6y0Var.f258775d = i - Integer.MIN_VALUE;
            } else {
                x6y0Var = new x6y0(z6y0Var, ibkVar);
            }
        } else {
            x6y0Var = new x6y0(z6y0Var, ibkVar);
        }
        Object objM86755t = x6y0Var.f258773b;
        int i2 = x6y0Var.f258775d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            Flowable flowable = z6y0Var.f280021e;
            d0k[] d0kVarArr = bmu0.f28619a;
            onc oncVar = new onc(flowable);
            x6y0Var.f258772a = str;
            x6y0Var.f258775d = 1;
            objM86755t = vyf1.m86755t(oncVar, x6y0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return w2a1Var;
        }
        str = x6y0Var.f258772a;
        bga.m29073P(objM86755t);
        if (wj50.m88271j(((PlayerState) objM86755t).contextUri(), str)) {
            Single singleMo48412a = z6y0Var.f280022f.mo48412a(new g8p0());
            x6y0Var.f258772a = null;
            x6y0Var.f258775d = 2;
            if (zn91.m96567o(singleMo48412a, x6y0Var) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m95519f(z6y0 z6y0Var, w6y0 w6y0Var, zam0 zam0Var, ibk ibkVar) {
        y6y0 y6y0Var;
        if (ibkVar instanceof y6y0) {
            y6y0Var = (y6y0) ibkVar;
            int i = y6y0Var.f269917c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y6y0Var.f269917c = i - Integer.MIN_VALUE;
            } else {
                y6y0Var = new y6y0(z6y0Var, ibkVar);
            }
        } else {
            y6y0Var = new y6y0(z6y0Var, ibkVar);
        }
        Object obj = y6y0Var.f269915a;
        int i2 = y6y0Var.f269917c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                qax0 qax0Var = z6y0Var.f280017a;
                ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequestM95520g = m95520g(w6y0Var, zam0Var);
                y6y0Var.f269917c = 1;
                Object objM72477a = qax0Var.m72477a(progressPlaybackEsperanto$OnUpdateRequestM95520g, y6y0Var);
                yuk yukVar = yuk.f276404a;
                if (objM72477a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static ProgressPlaybackEsperanto$OnUpdateRequest m95520g(w6y0 w6y0Var, zam0 zam0Var) {
        o6s0 o6s0VarM97834u = ProgressPlaybackEsperanto$OnUpdateRequest.m97834u();
        o6s0VarM97834u.m66357r(zam0Var.path());
        o6s0VarM97834u.m66362w("page_match");
        o6s0VarM97834u.m66356q(w6y0Var.f248486b);
        bks bksVarM1929s = Duration.m1929s();
        bksVarM1929s.m29723q(w6y0Var.f248487c / ((long) 1000));
        o6s0VarM97834u.m66360u(bksVarM1929s);
        o6s0VarM97834u.m66361v(p6s0.REASON_ACTIVATION_PAGE_MATCH);
        return (ProgressPlaybackEsperanto$OnUpdateRequest) o6s0VarM97834u.build();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f280026t;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f280016X;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f280025i;
    }
}
