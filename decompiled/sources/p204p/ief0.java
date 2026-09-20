package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ief0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jef0 f101406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ief0(jef0 jef0Var, int i) {
        super(0);
        this.f101405a = i;
        this.f101406b = jef0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f101405a;
        lau lauVar = lau.f131415a;
        jef0 jef0Var = this.f101406b;
        switch (i) {
            case 0:
                yt91 yt91VarM96903c = jef0Var.f111547L0.f15692b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("track_information", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                arrayList.add(zt91VarM94607a);
                return new st91(arrayList);
            default:
                yt91 yt91VarM96903c2 = jef0Var.f111547L0.f15692b.m96903c();
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
