package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class lgc0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lgc0 f133201a;
    private static final ktz0 descriptor;

    static {
        lgc0 lgc0Var = new lgc0();
        f133201a = lgc0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.puffin.core.data.MapDeviceToFiltersResponse", lgc0Var, 7);
        vwp0Var.m86594k("specificEnabled", true);
        vwp0Var.m86594k("specificDisabled", false);
        vwp0Var.m86594k("externalizationEnabled", false);
        vwp0Var.m86594k("externalizationDisabled", false);
        vwp0Var.m86594k("status", false);
        vwp0Var.m86594k("ambiguousEntityName", true);
        vwp0Var.m86594k("ambiguousEntityType", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = ngc0.f153639h;
        return new rr60[]{epv0.m39700t(ey31.f63933a), ux31.f234817a, h4y.f87673a, b4y.f23430a, fr70VarArr[4].getValue(), epv0.m39700t(ql51.f189738a), epv0.m39700t((rr60) fr70VarArr[6].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = ngc0.f153639h;
        frhVarMo29814b.getClass();
        int i = 0;
        gy31 gy31Var = null;
        wx31 wx31Var = null;
        k4y k4yVar = null;
        d4y d4yVar = null;
        mbr mbrVar = null;
        String str = null;
        ep3 ep3Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    gy31Var = (gy31) frhVarMo29814b.mo39211B(ktz0Var, 0, ey31.f63933a, gy31Var);
                    i |= 1;
                    break;
                case 1:
                    wx31Var = (wx31) frhVarMo29814b.mo39210A(ktz0Var, 1, ux31.f234817a, wx31Var);
                    i |= 2;
                    break;
                case 2:
                    k4yVar = (k4y) frhVarMo29814b.mo39210A(ktz0Var, 2, h4y.f87673a, k4yVar);
                    i |= 4;
                    break;
                case 3:
                    d4yVar = (d4y) frhVarMo29814b.mo39210A(ktz0Var, 3, b4y.f23430a, d4yVar);
                    i |= 8;
                    break;
                case 4:
                    mbrVar = (mbr) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), mbrVar);
                    i |= 16;
                    break;
                case 5:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str);
                    i |= 32;
                    break;
                case 6:
                    ep3Var = (ep3) frhVarMo29814b.mo39211B(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), ep3Var);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ngc0(i, gy31Var, wx31Var, k4yVar, d4yVar, mbrVar, str, ep3Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ngc0 ngc0Var = (ngc0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = ngc0.f153639h;
        gy31 gy31Var = ngc0Var.f153640a;
        ep3 ep3Var = ngc0Var.f153646g;
        if (gy31Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ey31.f63933a, gy31Var);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 1, ux31.f234817a, ngc0Var.f153641b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, h4y.f87673a, ngc0Var.f153642c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, b4y.f23430a, ngc0Var.f153643d);
        hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), ngc0Var.f153644e);
        String str = ngc0Var.f153645f;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str);
        }
        if (ep3Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), ep3Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
