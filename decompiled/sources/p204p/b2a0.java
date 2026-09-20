package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class b2a0 {

    /* JADX INFO: renamed from: a */
    public final ujb0 f22549a;

    /* JADX INFO: renamed from: b */
    public final t09 f22550b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f22551c;

    /* JADX INFO: renamed from: d */
    public final boolean f22552d;

    /* JADX INFO: renamed from: e */
    public final zux f22553e;

    /* JADX INFO: renamed from: f */
    public final dk00 f22554f;

    public b2a0(fiz fizVar, ujb0 ujb0Var, t09 t09Var, gcu0 gcu0Var, ron ronVar, boolean z, boolean z2, luk lukVar) {
        this.f22549a = ujb0Var;
        this.f22550b = t09Var;
        this.f22551c = ronVar;
        this.f22552d = z2;
        c9k c9kVarM16o = AbstractC0000a.m16o(lukVar);
        fbk fbkVar = null;
        this.f22553e = new zux(new nzx0(new g090(this, fbkVar, 23)), gcu0Var.m44321c(), new jl0(3, 12, fbkVar), 1);
        dk00 dk00VarM92074U = xtm0.m92074U(z ? mvl0.m62953p(new am90(fizVar, this, 4)) : new am90(mvl0.m62952o(fizVar, uio0.f230744O0), this, 5), new x1a0(fbkVar, this, 0));
        this.f22554f = z2 ? bzf1.m31027s(dk00VarM92074U, c9kVarM16o, new cs41(0L, 0L), 1) : dk00VarM92074U;
    }

    /* JADX INFO: renamed from: a */
    public static final v1a0 m27949a(b2a0 b2a0Var, PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        String strUri = contextTrack != null ? contextTrack.uri() : null;
        if (strUri == null) {
            strUri = "";
        }
        String str = (String) playerState.playbackId().mo49283h();
        String str2 = str != null ? str : "";
        return (contextTrack == null || !Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_HAS_LYRICS)) || str2.length() <= 0 || strUri.length() <= 0) ? u1a0.f225737a : new t1a0(strUri, str2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r9.emit(r0, r6) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r9.emit(p204p.q1a0.f184276a, r6) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (m27950b(r9, r10, r11, null, r6) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        if (r2.emit(r9, r6) == r7) goto L52;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27950b(niz nizVar, String str, String str2, String str3, ibk ibkVar) throws Throwable {
        w1a0 w1a0Var;
        Object c6x0Var;
        if (ibkVar instanceof w1a0) {
            w1a0Var = (w1a0) ibkVar;
            int i = w1a0Var.f247047g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1a0Var.f247047g = i - Integer.MIN_VALUE;
            } else {
                w1a0Var = new w1a0(this, ibkVar);
            }
        } else {
            w1a0Var = new w1a0(this, ibkVar);
        }
        w1a0 w1a0Var2 = w1a0Var;
        Object objM96567o = w1a0Var2.f247045e;
        int i2 = w1a0Var2.f247047g;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM83248c = this.f22549a.m83248c(str, str2, vdb0.NPV, str3);
                w1a0Var2.f247041a = nizVar;
                w1a0Var2.f247042b = str;
                w1a0Var2.f247043c = str2;
                w1a0Var2.f247044d = str3;
                w1a0Var2.f247047g = 1;
                objM96567o = zn91.m96567o(singleM83248c, w1a0Var2);
                if (objM96567o == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                str3 = w1a0Var2.f247044d;
                str2 = w1a0Var2.f247043c;
                str = w1a0Var2.f247042b;
                nizVar = w1a0Var2.f247041a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
            c6x0Var = (s7f) objM96567o;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null) {
            s7f s7fVar = (s7f) c6x0Var;
            wj50.m88279p(s7fVar);
            wab0 wab0Var = s7fVar.f206350a;
            if (wab0Var.f249432b != 2 || wab0Var.f249438h == 3) {
                w1a0Var2.f247041a = null;
                w1a0Var2.f247042b = null;
                w1a0Var2.f247043c = null;
                w1a0Var2.f247044d = null;
                w1a0Var2.f247047g = 3;
            } else {
                Object r1a0Var = new r1a0(str, str2, str3, s7fVar);
                w1a0Var2.f247041a = null;
                w1a0Var2.f247042b = null;
                w1a0Var2.f247043c = null;
                w1a0Var2.f247044d = null;
                w1a0Var2.f247047g = 2;
            }
        } else {
            if (thM77348a instanceof CancellationException) {
                throw thM77348a;
            }
            if (str3 != null) {
                Logger.m3967c(thM77348a, "Error loading translated lyrics from NPV; retrying original lyrics", new Object[0]);
                w1a0Var2.f247041a = null;
                w1a0Var2.f247042b = null;
                w1a0Var2.f247043c = null;
                w1a0Var2.f247044d = null;
                w1a0Var2.f247047g = 4;
            } else {
                niz nizVar2 = nizVar;
                Logger.m3966b("Error loading lyrics from NPV element", thM77348a);
                Object o1a0Var = new o1a0(thM77348a);
                w1a0Var2.f247041a = null;
                w1a0Var2.f247042b = null;
                w1a0Var2.f247043c = null;
                w1a0Var2.f247044d = null;
                w1a0Var2.f247047g = 5;
            }
        }
    }
}
