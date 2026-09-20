package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class of60 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final of60 f164655a;
    private static final ktz0 descriptor;

    static {
        of60 of60Var = new of60();
        f164655a = of60Var;
        vwp0 vwp0Var = new vwp0("com.spotify.inappuserfeedback.issuereporterimpl.JiraPostRequest", of60Var, 6);
        vwp0Var.m86594k("summary", false);
        vwp0Var.m86594k("description", false);
        vwp0Var.m86594k("project_key", false);
        vwp0Var.m86594k("files", false);
        vwp0Var.m86594k("feature", true);
        vwp0Var.m86594k("labels", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = qf60.f188124g;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, ql51Var, fr70VarArr[3].getValue(), epv0.m39700t(ql51Var), epv0.m39700t((rr60) fr70VarArr[5].getValue())};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = qf60.f188124g;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        List list = null;
        String str = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) frhVarMo29814b.mo39211B(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new qf60(i, strMo39226f, strMo39226f2, strMo39226f3, list, str, list2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        qf60 qf60Var = (qf60) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = qf60.f188124g;
        String str = qf60Var.f188125a;
        List list = qf60Var.f188130f;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, qf60Var.f188126b);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, qf60Var.f188127c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), qf60Var.f188128d);
        String str2 = qf60Var.f188129e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
