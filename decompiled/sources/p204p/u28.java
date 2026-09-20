package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u28 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final u28 f226008a;
    private static final ktz0 descriptor;

    static {
        u28 u28Var = new u28();
        f226008a = u28Var;
        vwp0 vwp0Var = new vwp0("com.spotify.artist.creatorartist.model.Autobiography", u28Var, 3);
        vwp0Var.m86594k("body", true);
        vwp0Var.m86594k("urls", true);
        vwp0Var.m86594k("links", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(ql51.f189738a), w28.f247267d[1].getValue(), epv0.m39700t(bo80.f29041a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = w28.f247267d;
        frhVarMo29814b.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        List list = null;
        do80 do80Var = null;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else if (iMo29816p == 1) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                do80Var = (do80) frhVarMo29814b.mo39211B(ktz0Var, 2, bo80.f29041a, do80Var);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new w28(i, str, list, do80Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        w28 w28Var = (w28) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = w28.f247267d;
        String str = w28Var.f247268a;
        List list = w28Var.f247269b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lau.f131415a)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
        }
        do80 do80Var = w28Var.f247270c;
        if (do80Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, bo80.f29041a, do80Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
