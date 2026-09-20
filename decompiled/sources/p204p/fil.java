package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fil implements g210 {

    /* JADX INFO: renamed from: a */
    public static final fil f69914a;
    private static final ktz0 descriptor;

    static {
        fil filVar = new fil();
        f69914a = filVar;
        vwp0 vwp0Var = new vwp0("com.spotify.artist.creatorartist.model.CreatorAboutModel", filVar, 9);
        vwp0Var.m86594k("monthlyListeners", true);
        vwp0Var.m86594k("globalChartPosition", true);
        vwp0Var.m86594k("images", true);
        vwp0Var.m86594k("biography", true);
        vwp0Var.m86594k("name", true);
        vwp0Var.m86594k("mainImageUrl", true);
        vwp0Var.m86594k("autobiography", true);
        vwp0Var.m86594k("isVerified", true);
        vwp0Var.m86594k("artistFacts", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = hil.f91831t;
        e450 e450Var = e450.f55982a;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{e450Var, e450Var, fr70VarArr[2].getValue(), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(u28.f226008a), l8a.f130828a, epv0.m39700t(tw5.f224314a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = hil.f91831t;
        frhVarMo29814b.getClass();
        vw5 vw5Var = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        w28 w28Var = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        boolean zMo39217M = false;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str3);
                    i |= 32;
                    break;
                case 6:
                    w28Var = (w28) frhVarMo29814b.mo39211B(ktz0Var, 6, u28.f226008a, w28Var);
                    i |= 64;
                    break;
                case 7:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    vw5Var = (vw5) frhVarMo29814b.mo39211B(ktz0Var, 8, tw5.f224314a, vw5Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hil(i, iMo39229o, iMo39229o2, list, str, str2, str3, w28Var, zMo39217M, vw5Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        hil hilVar = (hil) obj;
        List list = hilVar.f91834c;
        int i = hilVar.f91833b;
        int i2 = hilVar.f91832a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = hil.f91831t;
        if (hrhVarMo35820b.mo48399d0() || i2 != 0) {
            hrhVarMo35820b.mo44938e(0, i2, ktz0Var);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(1, i, ktz0Var);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lau.f131415a)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
        }
        String str = hilVar.f91835d;
        boolean z = hilVar.f91839h;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str);
        }
        String str2 = hilVar.f91836e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        String str3 = hilVar.f91837f;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str3);
        }
        w28 w28Var = hilVar.f91838g;
        if (w28Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, u28.f226008a, w28Var);
        }
        if (hrhVarMo35820b.mo48399d0() || z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 7, z);
        }
        vw5 vw5Var = hilVar.f91840i;
        if (vw5Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, tw5.f224314a, vw5Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
