package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lsd1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final lsd1 f136508a;
    private static final ktz0 descriptor;

    static {
        lsd1 lsd1Var = new lsd1();
        f136508a = lsd1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.legacy.impl.endpoint.WhereToPlayResponseData", lsd1Var, 4);
        vwp0Var.m86594k("deviceIds", false);
        vwp0Var.m86594k("messageType", true);
        vwp0Var.m86594k("multiOptionBottomSheet", true);
        vwp0Var.m86594k("smartControlNudge", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{nsd1.f157754e[0].getValue(), epv0.m39700t(ql51.f189738a), epv0.m39700t(w6i0.f248389a), epv0.m39700t(jw21.f116562a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = nsd1.f157754e;
        frhVarMo29814b.getClass();
        int i = 0;
        List list = null;
        String str = null;
        y6i0 y6i0Var = null;
        lw21 lw21Var = null;
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
                y6i0Var = (y6i0) frhVarMo29814b.mo39211B(ktz0Var, 2, w6i0.f248389a, y6i0Var);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                lw21Var = (lw21) frhVarMo29814b.mo39211B(ktz0Var, 3, jw21.f116562a, lw21Var);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new nsd1(i, list, str, y6i0Var, lw21Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        nsd1 nsd1Var = (nsd1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) nsd1.f157754e[0].getValue(), nsd1Var.f157755a);
        String str = nsd1Var.f157756b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, ql51.f189738a, str);
        }
        y6i0 y6i0Var = nsd1Var.f157757c;
        if (y6i0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, w6i0.f248389a, y6i0Var);
        }
        lw21 lw21Var = nsd1Var.f157758d;
        if (lw21Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, jw21.f116562a, lw21Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
