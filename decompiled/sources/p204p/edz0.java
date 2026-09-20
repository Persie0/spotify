package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class edz0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final edz0 f58628a;
    private static final ktz0 descriptor;

    static {
        edz0 edz0Var = new edz0();
        f58628a = edz0Var;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.SeekPanelVariant", edz0Var, 9);
        vwp0Var.m86594k("id", false);
        vwp0Var.m86594k("template_index", true);
        vwp0Var.m86594k("mime_type", false);
        vwp0Var.m86594k("frame_height", false);
        vwp0Var.m86594k("frame_width", false);
        vwp0Var.m86594k("rows", false);
        vwp0Var.m86594k("columns", false);
        vwp0Var.m86594k("panel_ids", true);
        vwp0Var.m86594k("frames", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = gdz0.f78967j;
        e450 e450Var = e450.f55982a;
        rr60 rr60VarM39700t = epv0.m39700t(e450Var);
        rr60 rr60VarM39700t2 = epv0.m39700t((rr60) fr70VarArr[7].getValue());
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, rr60VarM39700t, ql51Var, e450Var, e450Var, e450Var, e450Var, rr60VarM39700t2, q900.f186444a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = gdz0.f78967j;
        frhVarMo29814b.getClass();
        s900 s900Var = null;
        String strMo39226f = null;
        Integer num = null;
        String strMo39226f2 = null;
        List list = null;
        boolean z = true;
        int i = 0;
        int iMo39229o = 0;
        int iMo39229o2 = 0;
        int iMo39229o3 = 0;
        int iMo39229o4 = 0;
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
                    num = (Integer) frhVarMo29814b.mo39211B(ktz0Var, 1, e450.f55982a, num);
                    i |= 2;
                    break;
                case 2:
                    strMo39226f2 = frhVarMo29814b.mo39226f(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo39229o = frhVarMo29814b.mo39229o(ktz0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo39229o2 = frhVarMo29814b.mo39229o(ktz0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo39229o3 = frhVarMo29814b.mo39229o(ktz0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo39229o4 = frhVarMo29814b.mo39229o(ktz0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    s900Var = (s900) frhVarMo29814b.mo39210A(ktz0Var, 8, q900.f186444a, s900Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new gdz0(i, strMo39226f, num, strMo39226f2, iMo39229o, iMo39229o2, iMo39229o3, iMo39229o4, list, s900Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        gdz0 gdz0Var = (gdz0) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = gdz0.f78967j;
        String str = gdz0Var.f78968a;
        List list = gdz0Var.f78975h;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, str);
        Integer num = gdz0Var.f78969b;
        if (num == null || num.intValue() != 0) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, e450.f55982a, num);
        }
        hrhVarMo35820b.mo44931G(ktz0Var, 2, gdz0Var.f78970c);
        hrhVarMo35820b.mo44938e(3, gdz0Var.f78971d, ktz0Var);
        hrhVarMo35820b.mo44938e(4, gdz0Var.f78972e, ktz0Var);
        hrhVarMo35820b.mo44938e(5, gdz0Var.f78973f, ktz0Var);
        hrhVarMo35820b.mo44938e(6, gdz0Var.f78974g, ktz0Var);
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, (rr60) fr70VarArr[7].getValue(), list);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 8, q900.f186444a, gdz0Var.f78976i);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
