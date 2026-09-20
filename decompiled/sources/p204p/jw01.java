package p204p;

import com.spotify.jam.internal.socialconnect.models.BroadcastToken;
import com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class jw01 {

    /* JADX INFO: renamed from: a */
    public final mb80 f116552a;

    /* JADX INFO: renamed from: b */
    public final wfx f116553b;

    /* JADX INFO: renamed from: c */
    public final ib60 f116554c;

    public jw01(mb80 mb80Var, wfx wfxVar, ib60 ib60Var) {
        this.f116552a = mb80Var;
        this.f116553b = wfxVar;
        this.f116554c = ib60Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m54395a(ibk ibkVar) {
        hw01 hw01Var;
        lx50 lx50Var;
        if (ibkVar instanceof hw01) {
            hw01Var = (hw01) ibkVar;
            int i = hw01Var.f95833c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw01Var.f95833c = i - Integer.MIN_VALUE;
            } else {
                hw01Var = new hw01(this, ibkVar);
            }
        } else {
            hw01Var = new hw01(this, ibkVar);
        }
        Object objM54396b = hw01Var.f95831a;
        int i2 = hw01Var.f95833c;
        if (i2 == 0) {
            bga.m29073P(objM54396b);
            lx50Var = ((mx50) this.f116552a.f141819d.mo61351b().getValue()).f147962b.f53856c;
            if (lx50Var == null) {
                hw01Var.f95833c = 1;
                objM54396b = m54396b(hw01Var);
                Object obj = yuk.f276404a;
                if (objM54396b == obj) {
                    return obj;
                }
            }
            if (lx50Var != null) {
                this.f116553b.m87993f(lx50Var);
            } else {
                na6.m63957e("Attempted to share empty session URI");
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM54396b);
        lx50Var = (lx50) objM54396b;
        if (lx50Var != null) {
            this.f116553b.m87993f(lx50Var);
        } else {
            na6.m63957e("Attempted to share empty session URI");
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m54396b(ibk ibkVar) {
        iw01 iw01Var;
        ya60 ya60Var;
        DeviceBroadcastStatus deviceBroadcastStatus;
        BroadcastToken broadcastToken;
        if (ibkVar instanceof iw01) {
            iw01Var = (iw01) ibkVar;
            int i = iw01Var.f106317c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw01Var.f106317c = i - Integer.MIN_VALUE;
            } else {
                iw01Var = new iw01(this, ibkVar);
            }
        } else {
            iw01Var = new iw01(this, ibkVar);
        }
        Object objM50123a = iw01Var.f106315a;
        int i2 = iw01Var.f106317c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM50123a);
                ib60 ib60Var = this.f116554c;
                iw01Var.f106317c = 1;
                objM50123a = ib60Var.m50123a(iw01Var);
                yuk yukVar = yuk.f276404a;
                if (objM50123a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM50123a);
            }
            ya60Var = (ya60) objM50123a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            ya60Var = null;
        }
        String str = (ya60Var == null || (deviceBroadcastStatus = ya60Var.f270815a) == null || (broadcastToken = deviceBroadcastStatus.linkToken) == null) ? null : broadcastToken.token;
        if (str == null) {
            return null;
        }
        String strConcat = "spotify:socialsession:".concat(str);
        return new lx50(strConcat, strConcat);
    }
}
