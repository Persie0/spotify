package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class usx implements g210 {

    /* JADX INFO: renamed from: a */
    public static final usx f233694a;
    private static final ktz0 descriptor;

    static {
        usx usxVar = new usx();
        f233694a = usxVar;
        vwp0 vwp0Var = new vwp0("com.spotify.listuxplatformconsumers.standard.sections.extender.datasource.ExtenderRequest", usxVar, 5);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k("numResults", true);
        vwp0Var.m86594k("playlistURI", false);
        vwp0Var.m86594k("trackIDs", true);
        vwp0Var.m86594k("trackSkipIDs", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = wsx.f254768f;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, e450.f55982a, ql51Var, fr70VarArr[3].getValue(), fr70VarArr[4].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = wsx.f254768f;
        frhVarMo29814b.getClass();
        int i = 0;
        int iMo39229o = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        Set set = null;
        Set set2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else if (iMo29816p == 3) {
                set = (Set) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), set);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                set2 = (Set) frhVarMo29814b.mo39210A(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), set2);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new wsx(i, strMo39226f, iMo39229o, strMo39226f2, set, set2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        wsx wsxVar = (wsx) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = wsx.f254768f;
        String str = wsxVar.f254769a;
        Set set = wsxVar.f254773e;
        Set set2 = wsxVar.f254772d;
        int i = wsxVar.f254770b;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        if (hrhVarMo35820b.mo48399d0() || i != 0) {
            hrhVarMo35820b.mo44938e(1, i, ktz0Var);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 2, wsxVar.f254771c);
        boolean zMo48399d0 = hrhVarMo35820b.mo48399d0();
        gbu gbuVar = gbu.f78413a;
        if (zMo48399d0 || !wj50.m88271j(set2, gbuVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), set2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(set, gbuVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), set);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
