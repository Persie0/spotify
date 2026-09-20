package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class wyw0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final wyw0 f256367a;
    private static final ktz0 descriptor;

    static {
        wyw0 wyw0Var = new wyw0();
        f256367a = wyw0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.voiceassistants.voicepartnerproxy.ResolveAndUpdateEndpointRequest", wyw0Var, 7);
        vwp0Var.m86594k("uri", false);
        vwp0Var.m86594k("utterance", false);
        vwp0Var.m86594k("utterance_language", false);
        vwp0Var.m86594k("device", false);
        vwp0Var.m86594k("voice_feature", false);
        vwp0Var.m86594k("initially_paused", false);
        vwp0Var.m86594k("include_alternative_results", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        l8a l8aVar = l8a.f130828a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, zxo0.f287366a, ql51Var, l8aVar, l8aVar};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        int i = 0;
        boolean zMo39217M = false;
        boolean zMo39217M2 = false;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        byo0 byo0Var = null;
        String strMo39226f4 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    byo0Var = (byo0) frhVarMo29814b.mo39210A(ktz0Var, 3, zxo0.f287366a, byo0Var);
                    i |= 8;
                    break;
                case 4:
                    strMo39226f4 = frhVarMo29814b.mo39226f(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zMo39217M2 = frhVarMo29814b.mo39217M(ktz0Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new yyw0(i, strMo39226f, strMo39226f2, strMo39226f3, byo0Var, strMo39226f4, zMo39217M, zMo39217M2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yyw0 yyw0Var = (yyw0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 0, yyw0Var.f277592a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, yyw0Var.f277593b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, yyw0Var.f277594c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, zxo0.f287366a, yyw0Var.f277595d);
        hrhVarMo35820b.mo44931G(ktz0Var, 4, yyw0Var.f277596e);
        hrhVarMo35820b.mo44930E(ktz0Var, 5, yyw0Var.f277597f);
        hrhVarMo35820b.mo44930E(ktz0Var, 6, yyw0Var.f277598g);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
