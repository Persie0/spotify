package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class go71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final go71 f82903a;
    private static final ktz0 descriptor;

    static {
        go71 go71Var = new go71();
        f82903a = go71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse.TimeSyncedText", go71Var, 5);
        vwp0Var.m86594k("word", false);
        vwp0Var.m86594k("startTimeMs", false);
        vwp0Var.m86594k("endTimeMs", false);
        vwp0Var.m86594k("speakerId", false);
        vwp0Var.m86594k("segmentId", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        u2b0 u2b0Var = u2b0.f226058a;
        e450 e450Var = e450.f55982a;
        return new rr60[]{ql51.f189738a, u2b0Var, u2b0Var, e450Var, e450Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        String strMo39226f = null;
        long jMo39227i0 = 0;
        long jMo39227i1 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                jMo39227i1 = frhVarMo29814b.mo39227i0(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 4);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new io71(i, strMo39226f, jMo39227i0, jMo39227i1, iMo39229o, iMo39229o2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        io71 io71Var = (io71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, io71Var.f104148a);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, io71Var.f104149b);
        hrhVarMo35820b.mo44942l(ktz0Var, 2, io71Var.f104150c);
        hrhVarMo35820b.mo44938e(3, io71Var.f104151d, ktz0Var);
        hrhVarMo35820b.mo44938e(4, io71Var.f104152e, ktz0Var);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
