package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ma41 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ma41 f141462a;
    private static final ktz0 descriptor;

    static {
        ma41 ma41Var = new ma41();
        f141462a = ma41Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adsdisplay.sponsorshipimpl.model.Sponsorships", ma41Var, 1);
        vwp0Var.m86594k("sponsorships", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t((rr60) oa41.f163208c[0].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = oa41.f163208c;
        frhVarMo29814b.getClass();
        List list = null;
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
                list = (List) frhVarMo29814b.mo39211B(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new oa41(i, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44943s(ktz0Var, 0, (rr60) oa41.f163208c[0].getValue(), ((oa41) obj).f163209a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
