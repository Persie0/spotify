package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vhv0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final vhv0 f241560a;
    private static final ktz0 descriptor;

    static {
        vhv0 vhv0Var = new vhv0();
        f241560a = vhv0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.assistedcuration.content.model.RecsRequest", vhv0Var, 6);
        vwp0Var.m86594k("playlistURI", true);
        vwp0Var.m86594k("numResults", false);
        vwp0Var.m86594k("trackSkipIDs", true);
        vwp0Var.m86594k("trackIDs", true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, true);
        vwp0Var.m86594k("condensed", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = xhv0.f261714g;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), e450.f55982a, epv0.m39700t((rr60) fr70VarArr[2].getValue()), epv0.m39700t((rr60) fr70VarArr[3].getValue()), epv0.m39700t(ql51Var), l8a.f130828a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = xhv0.f261714g;
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        boolean zMo39217M = false;
        String str = null;
        Set set = null;
        Set set2 = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                    i |= 1;
                    break;
                case 1:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    set = (Set) frhVarMo29814b.mo39211B(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), set);
                    i |= 4;
                    break;
                case 3:
                    set2 = (Set) frhVarMo29814b.mo39211B(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), set2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    zMo39217M = frhVarMo29814b.mo39217M(ktz0Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new xhv0(i, str, iMo39229o, set, set2, str2, zMo39217M);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        xhv0 xhv0Var = (xhv0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = xhv0.f261714g;
        String str = xhv0Var.f261715a;
        boolean z = xhv0Var.f261720f;
        Set set = xhv0Var.f261718d;
        Set set2 = xhv0Var.f261717c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44938e(1, xhv0Var.f261716b, ktz0Var);
        if (set2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), set2);
        }
        if (set != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), set);
        }
        String str2 = xhv0Var.f261719e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || !z) {
            hrhVarMo35820b.mo44930E(ktz0Var, 5, z);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
