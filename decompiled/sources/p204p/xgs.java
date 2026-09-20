package p204p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: classes5.dex */
public final class xgs {

    /* JADX INFO: renamed from: a */
    public final qbc0 f261371a;

    public xgs(qbc0 qbc0Var) {
        this.f261371a = qbc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m90936a(xgs xgsVar, String str, ibk ibkVar) {
        wgs wgsVar;
        if (ibkVar instanceof wgs) {
            wgsVar = (wgs) ibkVar;
            int i = wgsVar.f251140d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgsVar.f251140d = i - Integer.MIN_VALUE;
            } else {
                wgsVar = new wgs(xgsVar, ibkVar);
            }
        } else {
            wgsVar = new wgs(xgsVar, ibkVar);
        }
        Object objM72491a = wgsVar.f251138b;
        int i2 = wgsVar.f251140d;
        ahw ahwVar = ahw.ERROR_TRANSCODER_DRM_CHECK;
        if (i2 == 0) {
            bga.m29073P(objM72491a);
            String strM93816v = yif1.m93816v(str);
            if (strM93816v == null) {
                throw new BetamaxTranscoderException("Could not extract manifest ID from URL: ".concat(str), null, ahwVar, 2);
            }
            qbc0 qbc0Var = xgsVar.f261371a;
            wgsVar.f251137a = str;
            wgsVar.f251140d = 1;
            objM72491a = qbc0Var.m72491a(strM93816v, wgsVar);
            yuk yukVar = yuk.f276404a;
            if (objM72491a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = wgsVar.f251137a;
            bga.m29073P(objM72491a);
        }
        nd41 nd41Var = (nd41) objM72491a;
        if (nd41Var != null) {
            return Boolean.valueOf(nd41Var.f152653b);
        }
        throw new BetamaxTranscoderException(edb.m38564m("Could not fetch manifest for URL: ", str), null, ahwVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m90937b(String str, ibk ibkVar) throws BetamaxTranscoderException {
        vgs vgsVar;
        if (ibkVar instanceof vgs) {
            vgsVar = (vgs) ibkVar;
            int i = vgsVar.f241308d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgsVar.f241308d = i - Integer.MIN_VALUE;
            } else {
                vgsVar = new vgs(this, ibkVar);
            }
        } else {
            vgsVar = new vgs(this, ibkVar);
        }
        Object objM76980u = vgsVar.f241306b;
        int i2 = vgsVar.f241308d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            lzr lzrVar = new lzr(this, str, fbkVar, 6);
            vgsVar.f241305a = str;
            vgsVar.f241308d = 1;
            objM76980u = s1h1.m76980u(5000L, lzrVar, vgsVar);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = vgsVar.f241305a;
            bga.m29073P(objM76980u);
        }
        Boolean bool = (Boolean) objM76980u;
        if (bool != null) {
            return bool;
        }
        throw new BetamaxTranscoderException(edb.m38564m("Timeout while detecting DRM status for URL: ", str), null, ahw.ERROR_TRANSCODER_DRM_CHECK, 2);
    }
}
