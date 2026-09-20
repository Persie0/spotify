package p204p;

import com.spotify.player.model.Suppressions;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vq0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final vq0 f243819a;
    private static final ktz0 descriptor;

    static {
        vq0 vq0Var = new vq0();
        f243819a = vq0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.adonappopen.repository.network.AdOnAppOpenAdResponse", vq0Var, 1);
        vwp0Var.m86594k(Suppressions.Providers.ADS, false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{mq0.f146124a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        uq0 uq0Var = null;
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
                uq0Var = (uq0) frhVarMo29814b.mo39210A(ktz0Var, 0, mq0.f146124a, uq0Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new xq0(i, uq0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, mq0.f146124a, ((xq0) obj).f264789a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
