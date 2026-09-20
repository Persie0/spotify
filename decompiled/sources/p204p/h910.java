package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h910 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final h910 f88857a;
    private static final ktz0 descriptor;

    static {
        h910 h910Var = new h910();
        f88857a = h910Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.members.api.GetInvitation", h910Var, 4);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, false);
        vwp0Var.m86594k("button_text", false);
        vwp0Var.m86594k("invitation_link", false);
        vwp0Var.m86594k("members", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = j910.f110073f;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, fr70VarArr[3].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = j910.f110073f;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                i |= 1;
            } else if (iMo29816p == 1) {
                strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                i |= 2;
            } else if (iMo29816p == 2) {
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new j910(i, strMo39226f, strMo39226f2, strMo39226f3, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        j910 j910Var = (j910) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = j910.f110073f;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, j910Var.f110074b);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, j910Var.f110075c);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, j910Var.f110076d);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), j910Var.f110077e);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
