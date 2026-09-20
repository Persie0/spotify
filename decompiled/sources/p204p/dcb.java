package p204p;

import java.util.Locale;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dcb implements g210 {

    /* JADX INFO: renamed from: a */
    public static final dcb f47485a;
    private static final ktz0 descriptor;

    static {
        dcb dcbVar = new dcb();
        f47485a = dcbVar;
        vwp0 vwp0Var = new vwp0("com.spotify.login.phonenumbersignup.callingcode.json.CallingCode", dcbVar, 3);
        vwp0Var.m86594k("countryCode", false);
        vwp0Var.m86594k("callingCode", false);
        vwp0Var.m86594k("countryName", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        String strMo39226f = null;
        boolean z = true;
        int i = 0;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
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
            } else {
                if (iMo29816p != 2) {
                    throw new UnknownFieldException(iMo29816p);
                }
                strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                i |= 4;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gcb(strMo39226f, strMo39226f2, i, strMo39226f3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gcb gcbVar = (gcb) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        String str = gcbVar.f78530a;
        String str2 = gcbVar.f78532c;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, gcbVar.f78531b);
        if (hrhVarMo35820b.mo48399d0()) {
            hrhVarMo35820b.mo44931G(ktz0Var, 2, str2);
        } else {
            gcb.Companion.getClass();
            if (!wj50.m88271j(str2, new Locale("", str).getDisplayCountry())) {
                hrhVarMo35820b.mo44931G(ktz0Var, 2, str2);
            }
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
