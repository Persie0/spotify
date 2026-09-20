package p204p;

import com.spotify.bluetooth.categorizer.CategorizerResponse;
import com.spotify.bluetooth.categorizer.CategorizerResponse$$serializer;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q970 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final q970 f186531a;
    private static final ktz0 descriptor;

    static {
        q970 q970Var = new q970();
        f186531a = q970Var;
        vwp0 vwp0Var = new vwp0("com.spotify.bluetooth.categorizerimpl.KnownBluetoothDevice", q970Var, 2);
        vwp0Var.m86594k("categorizer_response", false);
        vwp0Var.m86594k("last_updated_at", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{CategorizerResponse$$serializer.INSTANCE, u2b0.f226058a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        CategorizerResponse categorizerResponse = null;
        long jMo39227i0 = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                categorizerResponse = (CategorizerResponse) frhVarMo29814b.mo39210A(ktz0Var, 0, CategorizerResponse$$serializer.INSTANCE, categorizerResponse);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new s970(i, categorizerResponse, jMo39227i0);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        s970 s970Var = (s970) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, CategorizerResponse$$serializer.INSTANCE, s970Var.f206879a);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, s970Var.f206880b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
