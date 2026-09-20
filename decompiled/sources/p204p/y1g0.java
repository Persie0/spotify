package p204p;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y1g0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final y1g0 f268271a;
    private static final ktz0 descriptor;

    static {
        y1g0 y1g0Var = new y1g0();
        f268271a = y1g0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.playlistmixing.messagingimpl.MixingReorderedPlaylistStorageImpl.Data", y1g0Var, 1);
        vwp0Var.m86594k("reorderedPlaylists", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{a2g0.f11670b[0].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = a2g0.f11670b;
        frhVarMo29814b.getClass();
        Map map = null;
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
                map = (Map) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), map);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new a2g0(i, map);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        Map map = ((a2g0) obj).f11671a;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = a2g0.f11670b;
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(map, new LinkedHashMap())) {
            hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), map);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
