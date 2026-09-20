package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f0c1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final f0c1 f64609a;
    private static final ktz0 descriptor;

    static {
        f0c1 f0c1Var = new f0c1();
        f64609a = f0c1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.contextplayercoordinatorimpl.cosmos.VideoPlayerAdvanceReason", f0c1Var, 3);
        vwp0Var.m86594k("reason", false);
        vwp0Var.m86594k("unplayable_reason", true);
        vwp0Var.m86594k("playback_id", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = h0c1.f86217d;
        return new rr60[]{fr70VarArr[0].getValue(), epv0.m39700t((rr60) fr70VarArr[1].getValue()), epv0.m39700t(ql51.f189738a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = h0c1.f86217d;
        frhVarMo29814b.getClass();
        ewu0 ewu0Var = null;
        boolean z = true;
        int i = 0;
        x3a1 x3a1Var = null;
        String str = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                ewu0Var = (ewu0) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), ewu0Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                x3a1Var = (x3a1) frhVarMo29814b.mo39211B(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), x3a1Var);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new h0c1(i, ewu0Var, x3a1Var, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        h0c1 h0c1Var = (h0c1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = h0c1.f86217d;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), h0c1Var.f86218a);
        x3a1 x3a1Var = h0c1Var.f86219b;
        if (x3a1Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), x3a1Var);
        }
        String str = h0c1Var.f86220c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
