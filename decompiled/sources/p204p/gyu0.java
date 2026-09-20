package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class gyu0 implements vxu0 {

    /* JADX INFO: renamed from: j */
    public static final PlaylistRequestDecorationPolicy f85742j;

    /* JADX INFO: renamed from: a */
    public final String f85743a;

    /* JADX INFO: renamed from: b */
    public final wt80 f85744b;

    /* JADX INFO: renamed from: c */
    public final yz80 f85745c;

    /* JADX INFO: renamed from: d */
    public final u190 f85746d;

    /* JADX INFO: renamed from: e */
    public final cte f85747e;

    /* JADX INFO: renamed from: f */
    public final jdp0 f85748f;

    /* JADX INFO: renamed from: g */
    public final xre f85749g;

    /* JADX INFO: renamed from: h */
    public final ske f85750h;

    /* JADX INFO: renamed from: i */
    public di41 f85751i;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        amp0VarM18396H.m26440v();
        top0VarM18421v.m81214v(amp0VarM18396H);
        f85742j = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public gyu0(String str, wt80 wt80Var, yz80 yz80Var, u190 u190Var, cte cteVar, jdp0 jdp0Var, xre xreVar, ske skeVar) {
        this.f85743a = str;
        this.f85744b = wt80Var;
        this.f85745c = yz80Var;
        this.f85746d = u190Var;
        this.f85747e = cteVar;
        this.f85748f = jdp0Var;
        this.f85749g = xreVar;
        this.f85750h = skeVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX INFO: renamed from: b */
    public static final cyu0 m46174b(gyu0 gyu0Var, qu80 qu80Var) {
        Object next;
        Map map = qu80Var.f192599e.f271272q;
        String str = (String) map.get("recap.status_code");
        String str2 = (String) map.get("recap.error_type");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 49586) {
                if (iHashCode != 51508) {
                    if (wj50.m88271j(str2, "NOT_ENOUGH_PROGRESS")) {
                        return yxu0.f277328a;
                    }
                    if (wj50.m88271j(str2, "PROGRESS_VS_CONSUMPTION_MISMATCH")) {
                        return zxu0.f287397a;
                    }
                } else {
                    if (wj50.m88271j(str2, "NOT_ENOUGH_PROGRESS")) {
                        return yxu0.f277328a;
                    }
                    if (wj50.m88271j(str2, "PROGRESS_VS_CONSUMPTION_MISMATCH")) {
                        return zxu0.f287397a;
                    }
                }
            } else if (str.equals("200")) {
                Iterator it = qu80Var.f192598d.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!wj50.m88271j(((nw80) next).f159053g.get(ContextTrack.Metadata.KEY_IS_AUDIOBOOK_RECAP), "true"));
                nw80 nw80Var = (nw80) next;
                if (nw80Var != null) {
                    String str3 = nw80Var.f159049c;
                    if (str3.length() > 0) {
                        return new byu0(str3);
                    }
                }
                return xxu0.f267071a;
            }
        }
        return ayu0.f21357a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public static final Object m46175c(gyu0 gyu0Var, ibk ibkVar) {
        fyu0 fyu0Var;
        if (ibkVar instanceof fyu0) {
            fyu0Var = (fyu0) ibkVar;
            int i = fyu0Var.f74858c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyu0Var.f74858c = i - Integer.MIN_VALUE;
            } else {
                fyu0Var = new fyu0(gyu0Var, ibkVar);
            }
        } else {
            fyu0Var = new fyu0(gyu0Var, ibkVar);
        }
        Object objM96567o = fyu0Var.f74856a;
        int i2 = fyu0Var.f74858c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM78369c = ske.m78369c(gyu0Var.f85750h, "audiobooks:recap-finished:v1", null, null, null, null, null, null, null, null, 510);
                fyu0Var.f74858c = 1;
                objM96567o = zn91.m96567o(singleM78369c, fyu0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            MessageResponse messageResponse = (MessageResponse) objM96567o;
            if (!(messageResponse instanceof MessageResponse.Success)) {
                if (!(messageResponse instanceof MessageResponse.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                na6.m63971s("Recap finished trigger discarded: " + ((MessageResponse.Failure) messageResponse).getDiscardReason());
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Exception requesting recap finished trigger", e2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r13.f85746d.m82197c(r1, r14, r0) == r5) goto L26;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46176d(String str, ibk ibkVar) {
        eyu0 eyu0Var;
        if (ibkVar instanceof eyu0) {
            eyu0Var = (eyu0) ibkVar;
            int i = eyu0Var.f64190d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eyu0Var.f64190d = i - Integer.MIN_VALUE;
            } else {
                eyu0Var = new eyu0(this, ibkVar);
            }
        } else {
            eyu0Var = new eyu0(this, ibkVar);
        }
        Object objM56684z = eyu0Var.f64188b;
        int i2 = eyu0Var.f64190d;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            eyu0Var.f64187a = str;
            eyu0Var.f64190d = 1;
            objM56684z = kk40.m56684z(new nxs0(this, fbkVar, 7), eyu0Var);
            if (objM56684z != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = eyu0Var.f64187a;
            bga.m29073P(objM56684z);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56684z);
        }
        di41 di41Var = this.f85751i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f85751i = x0h1.m89578u(this.f85747e, null, 0, new yh9(2, this, new rlv0(), new qlv0(), new qlv0(), new qlv0(), null), 3);
        return txu0.f224770a;
        cyu0 cyu0Var = (cyu0) objM56684z;
        if (!(cyu0Var instanceof byu0)) {
            if (wj50.m88271j(cyu0Var, yxu0.f277328a)) {
                return qxu0.f193750a;
            }
            if (wj50.m88271j(cyu0Var, zxu0.f287397a)) {
                return rxu0.f203735a;
            }
            if (wj50.m88271j(cyu0Var, xxu0.f267071a) || wj50.m88271j(cyu0Var, ayu0.f21357a)) {
                return sxu0.f215057a;
            }
            throw new NoWhenBranchMatchedException();
        }
        j190 j190Var = new j190(((byu0) cyu0Var).f32323a);
        if (str == null) {
            str = "";
        }
        eyu0Var.f64187a = null;
        eyu0Var.f64190d = 2;
    }
}
