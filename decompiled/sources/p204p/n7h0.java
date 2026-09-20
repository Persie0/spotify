package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class n7h0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f151163a;

    /* JADX INFO: renamed from: b */
    public final zt91 f151164b;

    public n7h0(int i, st91 st91Var) {
        String str;
        this.f151163a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-prompt-chip";
        yt91VarM50626j.f276052f = "6.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        switch (i) {
            case 1:
                str = "connect_apps";
                break;
            case 2:
                str = "location";
                break;
            case 3:
                str = "privacy";
                break;
            case 4:
                str = "prompt_assistance";
                break;
            case 5:
                str = "refresh_cadence";
                break;
            case 6:
                str = "upload_file";
                break;
            case 7:
                str = "view_error";
                break;
            case 8:
                str = "voice_picker";
                break;
            default:
                throw null;
        }
        yt91VarM50626j.f276048b = str;
        this.f151164b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m63804a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f151164b, this.f151163a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f151163a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f151164b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f151164b;
        nu91Var.f248108b = this.f151163a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
