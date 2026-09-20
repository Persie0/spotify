package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class abp0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final abp0 f14161a;
    private static final ktz0 descriptor;

    static {
        abp0 abp0Var = new abp0();
        f14161a = abp0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.contextplayercoordinatorimpl.model.PlayerState", abp0Var, 17);
        vwp0Var.m86594k("timestamp", false);
        vwp0Var.m86594k("playback_id", true);
        vwp0Var.m86594k("position_as_of_timestamp", true);
        vwp0Var.m86594k("duration", true);
        vwp0Var.m86594k("is_buffering", false);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_PLAYBACK_SPEED, false);
        vwp0Var.m86594k("is_paused", false);
        vwp0Var.m86594k("audio_bitrate", true);
        vwp0Var.m86594k("available_audio_bitrates", true);
        vwp0Var.m86594k("marker", true);
        vwp0Var.m86594k("video_surface", true);
        vwp0Var.m86594k("streaming_type", true);
        vwp0Var.m86594k("playback_stack", true);
        vwp0Var.m86594k("session_id", false);
        vwp0Var.m86594k("is_video_on", false);
        vwp0Var.m86594k("is_background", false);
        vwp0Var.m86594k("former_position", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = kbp0.f121240r;
        u2b0 u2b0Var = u2b0.f226058a;
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(u2b0Var);
        rr60 rr60VarM39700t3 = epv0.m39700t(u2b0Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(e450.f55982a);
        rr60 rr60VarM39700t5 = epv0.m39700t((rr60) fr70VarArr[8].getValue());
        rr60 rr60VarM39700t6 = epv0.m39700t(dbp0.f47346a);
        rr60 rr60VarM39700t7 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t8 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t9 = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t10 = epv0.m39700t(u2b0Var);
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{u2b0Var, rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, l8aVar, yhz.f272997a, l8aVar, rr60VarM39700t4, rr60VarM39700t5, rr60VarM39700t6, rr60VarM39700t7, rr60VarM39700t8, rr60VarM39700t9, ql51Var, l8aVar, l8aVar, rr60VarM39700t10};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        long jMo39227i0;
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = kbp0.f121240r;
        frhVarMo29814b.getClass();
        Integer num = null;
        long j = 0;
        Long l = null;
        List list = null;
        fbp0 fbp0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        String strMo39226f = null;
        float fMo39219Q = 0.0f;
        int i = 0;
        boolean z = true;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        boolean zMo39217M3 = false;
        boolean zMo39217M4 = false;
        String str4 = null;
        while (z) {
            fr70VarArr = fr70VarArr;
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                    i |= 1;
                    j = jMo39227i0;
                    break;
                case 1:
                    jMo39227i0 = j;
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str3);
                    i |= 2;
                    j = jMo39227i0;
                    break;
                case 2:
                    jMo39227i0 = j;
                    l2 = (Long) frhVarMo29814b.mo39211B(ktz0Var, 2, u2b0.f226058a, l2);
                    i |= 4;
                    j = jMo39227i0;
                    break;
                case 3:
                    jMo39227i0 = j;
                    l3 = (Long) frhVarMo29814b.mo39211B(ktz0Var, 3, u2b0.f226058a, l3);
                    i |= 8;
                    j = jMo39227i0;
                    break;
                case 4:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    fMo39219Q = frhVarMo29814b.mo39219Q(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jMo39227i0 = j;
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 7, e450.f55982a, num);
                    i |= 128;
                    j = jMo39227i0;
                    break;
                case 8:
                    jMo39227i0 = j;
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 8, (rr60) fr70VarArr[8].getValue(), list);
                    i |= 256;
                    j = jMo39227i0;
                    break;
                case 9:
                    jMo39227i0 = j;
                    fbp0Var = (fbp0) frhVarMo29814b.mo39211B(ktz0Var, 9, dbp0.f47346a, fbp0Var);
                    i |= 512;
                    j = jMo39227i0;
                    break;
                case 10:
                    jMo39227i0 = j;
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 10, ql51.f189738a, str4);
                    i |= 1024;
                    j = jMo39227i0;
                    break;
                case 11:
                    jMo39227i0 = j;
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 11, ql51.f189738a, str);
                    i |= 2048;
                    j = jMo39227i0;
                    break;
                case 12:
                    jMo39227i0 = j;
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 12, ql51.f189738a, str2);
                    i |= 4096;
                    j = jMo39227i0;
                    break;
                case 13:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 13);
                    i |= 8192;
                    break;
                case 14:
                    zMo39217M3 = frhVarMo29814b.mo39217M(ktz0Var, 14);
                    i |= 16384;
                    break;
                case 15:
                    zMo39217M4 = frhVarMo29814b.mo39217M(ktz0Var, 15);
                    i |= 32768;
                    break;
                case 16:
                    jMo39227i0 = j;
                    l = (Long) frhVarMo29814b.mo39211B(ktz0Var, 16, u2b0.f226058a, l);
                    i |= 65536;
                    j = jMo39227i0;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new kbp0(i, j, str3, l2, l3, zMo39217M, fMo39219Q, zMo39217M2, num, list, fbp0Var, str4, str, str2, strMo39226f, zMo39217M3, zMo39217M4, l);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        kbp0 kbp0Var = (kbp0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = kbp0.f121240r;
        long j = kbp0Var.f121241a;
        List list = kbp0Var.f121249i;
        hrhVarMo35820b.mo44942l(ktz0Var, 0, j);
        String str = kbp0Var.f121242b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        Long l = kbp0Var.f121243c;
        if (l != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, u2b0.f226058a, l);
        }
        Long l2 = kbp0Var.f121244d;
        if (l2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, u2b0.f226058a, l2);
        }
        hrhVarMo35820b.mo44930E(ktz0Var, 4, kbp0Var.f121245e);
        hrhVarMo35820b.mo44936Z(ktz0Var, 5, kbp0Var.f121246f);
        hrhVarMo35820b.mo44930E(ktz0Var, 6, kbp0Var.f121247g);
        Integer num = kbp0Var.f121248h;
        if (num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, e450.f55982a, num);
        }
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, (rr60) fr70VarArr[8].getValue(), list);
        }
        fbp0 fbp0Var = kbp0Var.f121250j;
        if (fbp0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 9, dbp0.f47346a, fbp0Var);
        }
        String str2 = kbp0Var.f121251k;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 10, ql51.f189738a, str2);
        }
        String str3 = kbp0Var.f121252l;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 11, ql51.f189738a, str3);
        }
        String str4 = kbp0Var.f121253m;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 12, ql51.f189738a, str4);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 13, kbp0Var.f121254n);
        hrhVarMo35820b.mo44930E(ktz0Var, 14, kbp0Var.f121255o);
        hrhVarMo35820b.mo44930E(ktz0Var, 15, kbp0Var.f121256p);
        Long l3 = kbp0Var.f121257q;
        if (l3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 16, u2b0.f226058a, l3);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
