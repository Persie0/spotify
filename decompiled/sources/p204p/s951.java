package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s951 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final s951 f206865a;
    private static final ktz0 descriptor;

    static {
        s951 s951Var = new s951();
        f206865a = s951Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.Stories", s951Var, 3);
        vwp0Var.m86594k("playlist_uri", false);
        vwp0Var.m86594k("intro_story", false);
        vwp0Var.m86594k("stories", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a, cl50.f39189a, u951.f228078d[2].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = u951.f228078d;
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        el50 el50Var = null;
        List list = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                el50Var = (el50) frhVarMo29814b.mo39210A(ktz0Var, 1, cl50.f39189a, el50Var);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new u951(i, strMo39226f, el50Var, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        u951 u951Var = (u951) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = u951.f228078d;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, u951Var.f228079a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, cl50.f39189a, u951Var.f228080b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), u951Var.f228081c);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
