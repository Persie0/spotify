package p204p;

import java.util.Set;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o14 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final o14 f160614a;
    private static final ktz0 descriptor;

    static {
        o14 o14Var = new o14();
        f160614a = o14Var;
        vwp0 vwp0Var = new vwp0("com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.data.AndroidDenylist", o14Var, 2);
        vwp0Var.m86594k("package_names", false);
        vwp0Var.m86594k("app_signatures", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = q14.f184204c;
        return new rr60[]{fr70VarArr[0].getValue(), fr70VarArr[1].getValue()};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = q14.f184204c;
        frhVarMo29814b.getClass();
        Set set = null;
        boolean z = true;
        int i = 0;
        Set set2 = null;
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
                set2 = (Set) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), set2);
                i |= 2;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new q14(i, set, set2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        q14 q14Var = (q14) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = q14.f184204c;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), q14Var.f184205a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), q14Var.f184206b);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
