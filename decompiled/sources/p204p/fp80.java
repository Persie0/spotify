package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class fp80 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final fp80 f71769a;
    private static final ktz0 descriptor;

    static {
        fp80 fp80Var = new fp80();
        f71769a = fp80Var;
        vwp0 vwp0Var = new vwp0("com.spotify.wear.datalayermessages.ListConfigurationDto", fp80Var, 5);
        vwp0Var.m86594k("sortOrder", true);
        vwp0Var.m86594k("filters", true);
        vwp0Var.m86594k("lenses", true);
        vwp0Var.m86594k("sourceLengthRestriction", true);
        vwp0Var.m86594k("supportedPlaceholderTypes", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = hp80.f93711f;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{epv0.m39700t(ql51Var), fr70VarArr[1].getValue(), fr70VarArr[2].getValue(), epv0.m39700t(ql51Var), epv0.m39700t(x661.f258603a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = hp80.f93711f;
        frhVarMo29814b.getClass();
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        a761 a761Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                str = (String) frhVarMo29814b.mo39211B(ktz0Var, 0, ql51.f189738a, str);
                i |= 1;
            } else if (iMo29816p == 1) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                i |= 2;
            } else if (iMo29816p == 2) {
                list2 = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list2);
                i |= 4;
            } else if (iMo29816p == 3) {
                str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str2);
                i |= 8;
            } else {
                if (iMo29816p != 4) {
                    throw new UnknownFieldException(iMo29816p);
                }
                a761Var = (a761) frhVarMo29814b.mo39211B(ktz0Var, 4, x661.f258603a, a761Var);
                i |= 16;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hp80(i, str, list, list2, str2, a761Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        hp80 hp80Var = (hp80) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = hp80.f93711f;
        String str = hp80Var.f93712a;
        List list = hp80Var.f93714c;
        List list2 = hp80Var.f93713b;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, ql51.f189738a, str);
        }
        boolean zMo48399d0 = hrhVarMo35820b.mo48399d0();
        lau lauVar = lau.f131415a;
        if (zMo48399d0 || !wj50.m88271j(list2, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list2);
        }
        if (hrhVarMo35820b.mo48399d0() || !wj50.m88271j(list, lauVar)) {
            hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
        }
        String str2 = hp80Var.f93715d;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str2);
        }
        a761 a761Var = hp80Var.f93716e;
        if (a761Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, x661.f258603a, a761Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
