package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class dsy implements g210 {

    /* JADX INFO: renamed from: a */
    public static final dsy f52673a;
    private static final ktz0 descriptor;

    static {
        dsy dsyVar = new dsy();
        f52673a = dsyVar;
        vwp0 vwp0Var = new vwp0("com.spotify.yourupdates.data.FetchNotificationsResponse", dsyVar, 4);
        vwp0Var.m86594k("notifications", false);
        vwp0Var.m86594k("latestCursor", true);
        vwp0Var.m86594k("forwardCursor", true);
        vwp0Var.m86594k("requestId", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{fsy.f73003e[0].getValue(), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = fsy.f73003e;
        frhVarMo29814b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String strMo39226f = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), list);
                i |= 1;
            } else if (iMo29816p == 1) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else if (iMo29816p == 2) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str2);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 3);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new fsy(i, str, str2, strMo39226f, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        fsy fsyVar = (fsy) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        rr60 rr60Var = (rr60) fsy.f73003e[0].getValue();
        List list = fsyVar.f73004a;
        String str = fsyVar.f73006c;
        String str2 = fsyVar.f73005b;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, rr60Var, list);
        if (hrhVarMo35820b.mo48399d0() || str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        if (hrhVarMo35820b.mo48399d0() || str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 3, fsyVar.f73007d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
