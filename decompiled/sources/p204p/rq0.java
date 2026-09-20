package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rq0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final rq0 f201674a;
    private static final ktz0 descriptor;

    static {
        rq0 rq0Var = new rq0();
        f201674a = rq0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adonappopen.repository.network.AdOnAppOpenAd.Video", rq0Var, 6);
        vwp0Var.m86594k("bitrate", true);
        vwp0Var.m86594k("durationSec", true);
        vwp0Var.m86594k("height", true);
        vwp0Var.m86594k("width", true);
        vwp0Var.m86594k("mediaFile", true);
        vwp0Var.m86594k("mimetype", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        e450 e450Var = e450.f55982a;
        rr60 rr60VarM39700t = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t2 = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t3 = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t4 = epv0.m39700t(e450Var);
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{rr60VarM39700t, rr60VarM39700t2, rr60VarM39700t3, rr60VarM39700t4, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 0, e450.f55982a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 1, e450.f55982a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 2, e450.f55982a, num3);
                    i |= 4;
                    break;
                case 3:
                    num4 = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 3, e450.f55982a, num4);
                    i |= 8;
                    break;
                case 4:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new tq0(i, num, num2, num3, num4, str, str2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        tq0 tq0Var = (tq0) obj;
        String str = tq0Var.f222634f;
        String str2 = tq0Var.f222633e;
        Integer num = tq0Var.f222632d;
        Integer num2 = tq0Var.f222631c;
        Integer num3 = tq0Var.f222630b;
        Integer num4 = tq0Var.f222629a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        if (hrhVarMo35820b.mo48399d0() || num4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, e450.f55982a, num4);
        }
        if (hrhVarMo35820b.mo48399d0() || num3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, e450.f55982a, num3);
        }
        if (hrhVarMo35820b.mo48399d0() || num2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, e450.f55982a, num2);
        }
        if (hrhVarMo35820b.mo48399d0() || num != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, e450.f55982a, num);
        }
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
