package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i4c1 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final i4c1 f98510a;
    private static final ktz0 descriptor;

    static {
        i4c1 i4c1Var = new i4c1();
        f98510a = i4c1Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.VideoProfile", i4c1Var, 11);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("bitrate", false);
        vwp0Var.m86594k("codec", false);
        vwp0Var.m86594k("resolution", false);
        vwp0Var.m86594k("width", false);
        vwp0Var.m86594k("height", false);
        vwp0Var.m86594k("mime_type", false);
        vwp0Var.m86594k("key_id", true);
        vwp0Var.m86594k("file_type", false);
        vwp0Var.m86594k("max_bitrate", false);
        vwp0Var.m86594k("encryption_indices", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = k4c1.f119186l;
        ql51 ql51Var = ql51.f189738a;
        rr60 rr60VarM39700t = epv0.m39700t(ql51Var);
        rr60 rr60VarM39700t2 = epv0.m39700t((rr60) fr70VarArr[10].getValue());
        e450 e450Var = e450.f55982a;
        return new rr60[]{u2b0.f226058a, e450Var, ql51Var, e450Var, e450Var, e450Var, ql51Var, rr60VarM39700t, ql51Var, e450Var, rr60VarM39700t2};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = k4c1.f119186l;
        frhVarMo29814b.getClass();
        String str = null;
        long jMo39227i0 = 0;
        List list = null;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String strMo39226f3 = null;
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        int iMo39229o3 = 0;
        int iMo39229o4 = 0;
        int iMo39229o5 = 0;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo39229o3 = frhVarMo29814b.mo39229o(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo39229o4 = frhVarMo29814b.mo39229o(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 7, ql51.f189738a, str);
                    i |= 128;
                    break;
                case 8:
                    strMo39226f3 = frhVarMo29814b.mo39226f(ktz0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iMo39229o5 = frhVarMo29814b.mo39229o(ktz0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 10, (rr60) fr70VarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new k4c1(i, jMo39227i0, iMo39229o, strMo39226f, iMo39229o2, iMo39229o3, iMo39229o4, strMo39226f2, str, strMo39226f3, iMo39229o5, list);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        k4c1 k4c1Var = (k4c1) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = k4c1.f119186l;
        long j = k4c1Var.f119187a;
        List list = k4c1Var.f119197k;
        hrhVarMo35820b.mo44942l(ktz0Var, 0, j);
        hrhVarMo35820b.mo44938e(1, k4c1Var.f119188b, ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 2, k4c1Var.f119189c);
        hrhVarMo35820b.mo44938e(3, k4c1Var.f119190d, ktz0Var);
        hrhVarMo35820b.mo44938e(4, k4c1Var.f119191e, ktz0Var);
        hrhVarMo35820b.mo44938e(5, k4c1Var.f119192f, ktz0Var);
        hrhVarMo35820b.mo44931G(ktz0Var, 6, k4c1Var.f119193g);
        String str = k4c1Var.f119194h;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 8, k4c1Var.f119195i);
        hrhVarMo35820b.mo44938e(9, k4c1Var.f119196j, ktz0Var);
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 10, (rr60) fr70VarArr[10].getValue(), list);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
