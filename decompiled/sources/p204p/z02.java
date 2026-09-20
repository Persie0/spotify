package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class z02 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1766d5 f277936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z02(C1766d5 c1766d5, int i) {
        super(0);
        this.f277935a = i;
        this.f277936b = c1766d5;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f277935a;
        C1766d5 c1766d5 = this.f277936b;
        switch (i) {
            case 0:
                return ((hog0) c1766d5.invoke()).mo24361d();
            case 1:
                hog0 hog0Var = (hog0) c1766d5.invoke();
                yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = hog0Var.f93537b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return nap.m64023p(arrayList, zt91VarM94607a, arrayList);
            default:
                hog0 hog0Var2 = (hog0) c1766d5.invoke();
                yt91 yt91VarM96903c2 = hog0Var2.f93538c.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("main_controls", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = hog0Var2.f93537b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return nap.m64023p(arrayList2, zt91VarM94607a2, arrayList2);
        }
    }
}
