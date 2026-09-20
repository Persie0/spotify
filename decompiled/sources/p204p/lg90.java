package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lg90 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lg90 f133177a;
    private static final ktz0 descriptor;

    static {
        lg90 lg90Var = new lg90();
        f133177a = lg90Var;
        vwp0 vwp0Var = new vwp0("com.spotify.audiobookpremium.listeninghoursrequest.ListeningHoursRequestResponse", lg90Var, 1);
        vwp0Var.m86594k("result", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ng90.f153599b[0].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = ng90.f153599b;
        frhVarMo29814b.getClass();
        pg90 pg90Var = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                pg90Var = (pg90) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), pg90Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new ng90(i, pg90Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) ng90.f153599b[0].getValue(), ((ng90) obj).f153600a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
