package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ylr0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ylr0 f274080a;
    private static final ktz0 descriptor;

    static {
        ylr0 ylr0Var = new ylr0();
        f274080a = ylr0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.Profile", ylr0Var, 13);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("video_bitrate", true);
        vwp0Var.m86594k("video_codec", true);
        vwp0Var.m86594k("video_resolution", true);
        vwp0Var.m86594k("video_width", true);
        vwp0Var.m86594k("video_height", true);
        vwp0Var.m86594k("audio_bitrate", true);
        vwp0Var.m86594k("audio_codec", true);
        vwp0Var.m86594k("mime_type", false);
        vwp0Var.m86594k("file_type", false);
        vwp0Var.m86594k("max_bitrate", false);
        vwp0Var.m86594k("encryption_index", true);
        vwp0Var.m86594k("encryption_indices", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = cmr0.f39765o;
        e450 e450Var = e450.f55982a;
        rr60 rr60VarM39700t = epv0.m39700t(e450Var);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{u2b0.f226058a, rr60VarM39700t, epv0.m39700t(ql51Var), epv0.m39700t(e450Var), epv0.m39700t(e450Var), epv0.m39700t(e450Var), epv0.m39700t(e450Var), epv0.m39700t(ql51Var), ql51Var, ql51Var, e450Var, epv0.m39700t(e450Var), epv0.m39700t((rr60) fr70VarArr[12].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = cmr0.f39765o;
        frhVarMo29814b.getClass();
        Integer num = null;
        long jMo39227i0 = 0;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        List list = null;
        Integer num4 = null;
        String str2 = null;
        Integer num5 = null;
        Integer num6 = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        int i = 0;
        boolean z = true;
        int iMo39229o = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    num4 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 1, e450.f55982a, num4);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str2);
                    i |= 4;
                    break;
                case 3:
                    num5 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 3, e450.f55982a, num5);
                    i |= 8;
                    break;
                case 4:
                    num6 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 4, e450.f55982a, num6);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 5, e450.f55982a, num);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 6, e450.f55982a, num2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 7, ql51.f189738a, str);
                    i |= 128;
                    break;
                case 8:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    num3 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 11, e450.f55982a, num3);
                    i |= 2048;
                    break;
                case 12:
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 12, (rr60) fr70VarArr[12].getValue(), list);
                    i |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
            fr70VarArr = fr70VarArr;
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new cmr0(i, jMo39227i0, num4, str2, num5, num6, num, num2, str, strMo39226f, strMo39226f2, iMo39229o, num3, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        cmr0 cmr0Var = (cmr0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = cmr0.f39765o;
        long j = cmr0Var.f39766a;
        List list = cmr0Var.f39778m;
        hrhVarMo35820b.mo44942l(ktz0Var, 0, j);
        Integer num = cmr0Var.f39767b;
        if (num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, e450.f55982a, num);
        }
        String str = cmr0Var.f39768c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        Integer num2 = cmr0Var.f39769d;
        if (num2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, e450.f55982a, num2);
        }
        Integer num3 = cmr0Var.f39770e;
        if (num3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, e450.f55982a, num3);
        }
        Integer num4 = cmr0Var.f39771f;
        if (num4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, e450.f55982a, num4);
        }
        Integer num5 = cmr0Var.f39772g;
        if (num5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, e450.f55982a, num5);
        }
        String str2 = cmr0Var.f39773h;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, ql51.f189738a, str2);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 8, cmr0Var.f39774i);
        hrhVarMo35820b.mo44931G(ktz0Var, 9, cmr0Var.f39775j);
        hrhVarMo35820b.mo44938e(10, cmr0Var.f39776k, ktz0Var);
        Integer num6 = cmr0Var.f39777l;
        if (num6 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 11, e450.f55982a, num6);
        }
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 12, (rr60) fr70VarArr[12].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
