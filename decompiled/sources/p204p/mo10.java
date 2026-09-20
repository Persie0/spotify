package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class mo10 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145542a;

    /* JADX INFO: renamed from: b */
    public final zt91 f145543b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zm8 f145544c;

    public mo10(zm8 zm8Var, int i) {
        this.f145542a = i;
        switch (i) {
            case 1:
                this.f145544c = zm8Var;
                yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("participant_top_bar", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f145543b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f145544c = zm8Var;
                yt91 yt91VarM96903c2 = zm8Var.f284180c.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("host_top_bar", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f145543b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f145542a;
        zm8 zm8Var = this.f145544c;
        zt91 zt91Var = this.f145543b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = zm8Var.f284179b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            default:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = zm8Var.f284179b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
        }
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f145542a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f145543b;
                nu91Var.f248108b = this.f145544c.f284179b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f145543b;
                nu91Var2.f248108b = this.f145544c.f284179b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
        }
    }
}
