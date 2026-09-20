package p204p;

import com.spotify.player.model.command.SignalCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes5.dex */
public final class dw3 {

    /* JADX INFO: renamed from: a */
    public final xzx f53593a;

    /* JADX INFO: renamed from: b */
    public final fiz f53594b;

    public dw3(xzx xzxVar, fiz fizVar) {
        this.f53593a = xzxVar;
        this.f53594b = fizVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (p204p.zn91.m96567o(r13, r0) == r7) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m37132a(long j, LoggingParams loggingParams, ibk ibkVar) {
        bw3 bw3Var;
        if (ibkVar instanceof bw3) {
            bw3Var = (bw3) ibkVar;
            int i = bw3Var.f31518e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bw3Var.f31518e = i - Integer.MIN_VALUE;
            } else {
                bw3Var = new bw3(this, ibkVar);
            }
        } else {
            bw3Var = new bw3(this, ibkVar);
        }
        Object obj = bw3Var.f31516c;
        int i2 = bw3Var.f31518e;
        xzx xzxVar = this.f53593a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            hvi0 hvi0Var = cks.f39079b;
            long jM54449D = jwg1.m54449D(2, ils.SECONDS);
            C1819em c1819em = new C1819em(this, fbkVar, 26);
            bw3Var.f31515b = loggingParams;
            bw3Var.f31514a = j;
            bw3Var.f31518e = 1;
            if (s1h1.m76981v(jM54449D, c1819em, bw3Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            j = bw3Var.f31514a;
            loggingParams = bw3Var.f31515b;
            bga.m29073P(obj);
        } else if (i2 == 2) {
            j = bw3Var.f31514a;
            loggingParams = bw3Var.f31515b;
            bga.m29073P(obj);
            if (loggingParams == null) {
                loggingParams = LoggingParams.builder().build();
            }
            wj50.m88279p(loggingParams);
            Single singleM31199h = ((c0y) xzxVar).m31199h(loggingParams);
            bw3Var.f31515b = null;
            bw3Var.f31514a = j;
            bw3Var.f31518e = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        c0y c0yVar = (c0y) xzxVar;
        Single singleDoOnSuccess = c0yVar.f32913j.mo48412a(new z7p0(j)).doOnSuccess(new yzx(c0yVar, 2));
        bw3Var.f31515b = loggingParams;
        bw3Var.f31514a = j;
        bw3Var.f31518e = 2;
        if (zn91.m96567o(singleDoOnSuccess, bw3Var) != yukVar) {
            if (loggingParams == null) {
                loggingParams = LoggingParams.builder().build();
            }
            wj50.m88279p(loggingParams);
            Single singleM31199h2 = ((c0y) xzxVar).m31199h(loggingParams);
            bw3Var.f31515b = null;
            bw3Var.f31514a = j;
            bw3Var.f31518e = 3;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (p204p.njg1.m64619l(500, r0) == r4) goto L24;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m37133b(ibk ibkVar) {
        cw3 cw3Var;
        if (ibkVar instanceof cw3) {
            cw3Var = (cw3) ibkVar;
            int i = cw3Var.f42619c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cw3Var.f42619c = i - Integer.MIN_VALUE;
            } else {
                cw3Var = new cw3(this, ibkVar);
            }
        } else {
            cw3Var = new cw3(this, ibkVar);
        }
        Object objM96567o = cw3Var.f42617a;
        int i2 = cw3Var.f42619c;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96567o);
        Single singleMo48412a = ((c0y) this.f53593a).f32913j.mo48412a(h8p0.m46841i(SignalCommand.create("switch-to-full-episode")));
        cw3Var.f42619c = 1;
        objM96567o = zn91.m96567o(singleMo48412a, cw3Var);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar instanceof hcf) {
            m6b.m60995j("[CAL] AndroidAutoChapterPlaybackController: switch-to-full-episode signal failed: ", ((hcf) lcfVar).f89783a);
        }
        cw3Var.f42619c = 2;
    }
}
