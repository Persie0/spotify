package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class pef0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qef0 f176744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pef0(qef0 qef0Var, int i) {
        super(0);
        this.f176743a = i;
        this.f176744b = qef0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f176743a;
        lau lauVar = lau.f131415a;
        qef0 qef0Var = this.f176744b;
        switch (i) {
            case 0:
                yt91 yt91VarM96903c = qef0Var.f187921N0.f15692b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("track_information", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                arrayList.add(zt91VarM94607a);
                return new st91(arrayList);
            default:
                yt91 yt91VarM96903c2 = qef0Var.f187921N0.f15692b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("main_controls", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                arrayList2.add(zt91VarM94607a2);
                return new st91(arrayList2);
        }
    }
}
