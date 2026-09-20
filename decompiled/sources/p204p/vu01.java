package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vu01 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final vu01 f244805a;
    private static final ktz0 descriptor;

    static {
        vu01 vu01Var = new vu01();
        f244805a = vu01Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.ShareMetadata", vu01Var, 6);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_ENTITY_URI, false);
        vwp0Var.m86594k("image", false);
        vwp0Var.m86594k("message", true);
        vwp0Var.m86594k("query_parameters", false);
        vwp0Var.m86594k("message_entity_uri", true);
        vwp0Var.m86594k("item_log_id", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = sv01.f214287g;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{ql51Var, ql51Var, epv0.m39700t(ql51Var), fr70VarArr[3].getValue(), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = sv01.f214287g;
        frhVarMo29814b.getClass();
        int i = 0;
        String strMo39226f = null;
        String strMo39226f2 = null;
        String str = null;
        Map map = null;
        String str2 = null;
        String str3 = null;
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
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 2, ql51.f189738a, str);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) frhVarMo29814b.mo39210A(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), map);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new sv01(i, strMo39226f, strMo39226f2, str, map, str2, str3);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        sv01 sv01Var = (sv01) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = sv01.f214287g;
        hrhVarMo35820b.mo44931G(ktz0Var, 0, sv01Var.f214288a);
        hrhVarMo35820b.mo44931G(ktz0Var, 1, sv01Var.f214289b);
        String str = sv01Var.f214290c;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, ql51.f189738a, str);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), sv01Var.f214291d);
        String str2 = sv01Var.f214292e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        String str3 = sv01Var.f214293f;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str3);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
