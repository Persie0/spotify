package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class qkh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f189558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vch0 f189559b;

    public qkh0(vch0 vch0Var, int i) {
        String str;
        this.f189559b = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        switch (i) {
            case 1:
                str = "all_fail";
                break;
            case 2:
                str = "all_success";
                break;
            case 3:
                str = "partial";
                break;
            case 4:
                str = "partial_24h";
                break;
            case 5:
                str = "partial_48h";
                break;
            case 6:
                str = "partial_fail";
                break;
            case 7:
                str = "partial_fail_24h";
                break;
            case 8:
                str = "partial_fail_48h";
                break;
            case 9:
                str = "partial_success";
                break;
            case 10:
                str = "successful_fail";
                break;
            case 11:
                str = "successful_partial_fail";
                break;
            default:
                throw null;
        }
        yt91VarM96903c.f276055i.add(new bu91("match_results_banner", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f189558a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f189559b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f189558a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f189558a;
        nu91Var.f248108b = this.f189559b.f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
