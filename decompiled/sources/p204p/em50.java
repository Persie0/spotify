package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class em50 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final em50 f60823a;
    private static final ktz0 descriptor;

    static {
        em50 em50Var = new em50();
        f60823a = em50Var;
        vwp0 vwp0Var = new vwp0("com.spotify.blend.tastematch.api.group.InvitationResponse", em50Var, 9);
        vwp0Var.m86594k("page_type", false);
        vwp0Var.m86594k("members", true);
        vwp0Var.m86594k("recipient", true);
        vwp0Var.m86594k("playlist_uri", true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_TITLE, true);
        vwp0Var.m86594k(ContextTrack.Metadata.KEY_SUBTITLE, true);
        vwp0Var.m86594k("members_title", true);
        vwp0Var.m86594k("button_text", true);
        vwp0Var.m86594k("footnote", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = hm50.f92832j;
        ql51 ql51Var = ql51.f189738a;
        return new rr60[]{fr70VarArr[0].getValue(), epv0.m39700t((rr60) fr70VarArr[1].getValue()), epv0.m39700t(rm9.f200479a), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var), epv0.m39700t(ql51Var)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = hm50.f92832j;
        frhVarMo29814b.getClass();
        String str = null;
        nlm0 nlm0Var = null;
        List list = null;
        vm9 vm9Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    z = false;
                    break;
                case 0:
                    nlm0Var = (nlm0) frhVarMo29814b.mo39210A(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), nlm0Var);
                    i |= 1;
                    break;
                case 1:
                    list = (List) frhVarMo29814b.mo39211B(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    vm9Var = (vm9) frhVarMo29814b.mo39211B(ktz0Var, 2, rm9.f200479a, vm9Var);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) frhVarMo29814b.mo39211B(ktz0Var, 3, ql51.f189738a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) frhVarMo29814b.mo39211B(ktz0Var, 4, ql51.f189738a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) frhVarMo29814b.mo39211B(ktz0Var, 5, ql51.f189738a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) frhVarMo29814b.mo39211B(ktz0Var, 6, ql51.f189738a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) frhVarMo29814b.mo39211B(ktz0Var, 7, ql51.f189738a, str6);
                    i |= 128;
                    break;
                case 8:
                    str = (String) frhVarMo29814b.mo39211B(ktz0Var, 8, ql51.f189738a, str);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new hm50(i, nlm0Var, list, vm9Var, str2, str3, str4, str5, str6, str);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        hm50 hm50Var = (hm50) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = hm50.f92832j;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, (rr60) fr70VarArr[0].getValue(), hm50Var.f92833a);
        List list = hm50Var.f92834b;
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 1, (rr60) fr70VarArr[1].getValue(), list);
        }
        vm9 vm9Var = hm50Var.f92835c;
        if (vm9Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 2, rm9.f200479a, vm9Var);
        }
        String str = hm50Var.f92836d;
        if (str != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, ql51.f189738a, str);
        }
        String str2 = hm50Var.f92837e;
        if (str2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, ql51.f189738a, str2);
        }
        String str3 = hm50Var.f92838f;
        if (str3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, ql51.f189738a, str3);
        }
        String str4 = hm50Var.f92839g;
        if (str4 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 6, ql51.f189738a, str4);
        }
        String str5 = hm50Var.f92840h;
        if (str5 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, ql51.f189738a, str5);
        }
        String str6 = hm50Var.f92841i;
        if (str6 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, ql51.f189738a, str6);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
