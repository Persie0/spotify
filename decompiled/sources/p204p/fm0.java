package p204p;

import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$DetectRequest;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$MapTimestampRequest;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class fm0 implements dm0 {

    /* JADX INFO: renamed from: a */
    public final ul0 f70900a;

    public fm0(ul0 ul0Var) {
        this.f70900a = ul0Var;
    }

    /* JADX INFO: renamed from: d */
    public static int m42039d(zl0 zl0Var) {
        int iOrdinal = zl0Var.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final yab m42040b(String str, String str2) {
        wl0 wl0VarM2266p = AdDetectionOuterClass$DetectRequest.m2266p();
        wl0VarM2266p.m88373m(str);
        wl0VarM2266p.m88374q(str2);
        AdDetectionOuterClass$DetectRequest adDetectionOuterClass$DetectRequest = (AdDetectionOuterClass$DetectRequest) wl0VarM2266p.build();
        wj50.m88279p(adDetectionOuterClass$DetectRequest);
        return k0e1.m54985d(this.f70900a.callStream("spotify.ad_detection.impl.ad_detection_proto.AdDetection", "Detect", adDetectionOuterClass$DetectRequest).map(e8f.f57178d).distinctUntilChanged().map(new pqq0(this)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m42041c(String str, int i, vpl vplVar, ibk ibkVar) {
        em0 em0Var;
        vl0 vl0Var;
        if (ibkVar instanceof em0) {
            em0Var = (em0) ibkVar;
            int i2 = em0Var.f60788c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em0Var.f60788c = i2 - Integer.MIN_VALUE;
            } else {
                em0Var = new em0(this, ibkVar);
            }
        } else {
            em0Var = new em0(this, ibkVar);
        }
        Object objM76980u = em0Var.f60786a;
        int i3 = em0Var.f60788c;
        if (i3 == 0) {
            bga.m29073P(objM76980u);
            int iOrdinal = vplVar.ordinal();
            if (iOrdinal == 0) {
                vl0Var = vl0.CLIENT_PRODUCED;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                vl0Var = vl0.INFERRED;
            }
            yl0 yl0VarM2287q = AdDetectionOuterClass$MapTimestampRequest.m2287q();
            yl0VarM2287q.m94139q(str);
            yl0VarM2287q.m94140r(i);
            yl0VarM2287q.m94138m(vl0Var);
            C2482v4 c2482v4 = new C2482v4(this, yl0VarM2287q, null, 15);
            em0Var.f60788c = 1;
            objM76980u = s1h1.m76980u(1000L, c2482v4, em0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        hjc0 hjc0Var = (hjc0) objM76980u;
        return hjc0Var == null ? gjc0.f80435a : hjc0Var;
    }
}
