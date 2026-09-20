package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q1z implements g210 {

    /* JADX INFO: renamed from: a */
    public static final q1z f184431a;
    private static final ktz0 descriptor;

    static {
        q1z q1zVar = new q1z();
        f184431a = q1zVar;
        vwp0 vwp0Var = new vwp0("com.spotify.wear.datalayermessages.FilterDto", q1zVar, 5);
        vwp0Var.m86594k("type", false);
        vwp0Var.m86594k("rowId", true);
        vwp0Var.m86594k("text", true);
        vwp0Var.m86594k("tag", true);
        vwp0Var.m86594k("attributes", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = t1z.f216382f;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t((rr60) fr70VarArr[4].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = t1z.f216382f;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 1, ql51.f189738a, str);
                i |= 2;
            } else if (iMo29816p == 2) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str2);
                i |= 4;
            } else if (iMo29816p == 3) {
                str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str3);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                list = (List) frhVarMo29814b.mo39211B(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new t1z(i, strMo39226f, str, str2, str3, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        t1z t1zVar = (t1z) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = t1z.f216382f;
        String str = t1zVar.f216383a;
        List list = t1zVar.f216387e;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        String str2 = t1zVar.f216384b;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str2);
        }
        String str3 = t1zVar.f216385c;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str3);
        }
        String str4 = t1zVar.f216386d;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str4);
        }
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
