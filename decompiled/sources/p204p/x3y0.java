package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class x3y0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final hh3 f257914a;

    /* JADX INFO: renamed from: b */
    public final p481 f257915b;

    /* JADX INFO: renamed from: c */
    public final String f257916c;

    public x3y0(hh3 hh3Var, p481 p481Var, String str) {
        this.f257914a = hh3Var;
        this.f257915b = p481Var;
        this.f257916c = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        hh3 hh3Var = this.f257914a;
        pkh0 pkh0VarM80819d = hh3Var.f91279b.m80819d();
        if (gh3.f79792a[0] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        yt91 yt91VarM96903c = pkh0VarM80819d.f178463b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("tooltip_deprecated", "euterpe", null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = pkh0VarM80819d.f178464c;
        hh3Var.m47495l().mo57449i((ou91) nu91Var.m87248a(), null);
        p481 p481Var = this.f257915b;
        lv31 lv31VarEdit = p481Var.f173868b.mo35842b(p481Var.f173867a, this.f257916c).edit();
        lv31VarEdit.m60048a(q481.f185100a, true);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }
}
