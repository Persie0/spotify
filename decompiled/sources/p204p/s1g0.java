package p204p;

import java.util.Set;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s1g0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final s1g0 f204713a;
    private static final ktz0 descriptor;

    static {
        s1g0 s1g0Var = new s1g0();
        f204713a = s1g0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.playlistmixing.elementsimpl.MixingReorderPlaylistEducationStorageImpl.Data", s1g0Var, 2);
        vwp0Var.m86594k("interactedPlaylists", true);
        vwp0Var.m86594k("globalInteractionCount", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{u1g0.f225816c[0].getValue(), e450.f55982a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = u1g0.f225816c;
        frhVarMo29814b.getClass();
        Set set = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                set = (Set) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), set);
                i |= 1;
            } else {
                if (iMo29816p != 1) {
                    throw new UnknownFieldException(iMo29816p);
                }
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new u1g0(i, iMo39229o, set);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        u1g0 u1g0Var = (u1g0) obj;
        int i = u1g0Var.f225818b;
        Set set = u1g0Var.f225817a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = u1g0.f225816c;
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(set, gbu.f78413a)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), set);
        }
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(1, i, ktz0Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
