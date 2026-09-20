package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ywq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zwq0 f277028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f277029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywq0(zwq0 zwq0Var, int i, int i2) {
        super(0);
        this.f277027a = i2;
        this.f277028b = zwq0Var;
        this.f277029c = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        String str;
        int i;
        switch (this.f277027a) {
            case 0:
                zwq0 zwq0Var = this.f277028b;
                myq0 myq0Var = (myq0) zwq0Var.f287050a.m53864A(this.f277029c);
                lxq0 lxq0Var = zwq0Var.f287051b;
                int i2 = myq0Var.f148503b;
                if (i2 == 1) {
                    str = "Presave";
                } else if (i2 == 2) {
                    str = "Presaved";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    str = "Listen Now";
                }
                String str2 = str;
                j8g0 j8g0Var = lxq0Var.f137862b;
                yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("presave_button", str2, null, null, str2));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = j8g0Var.f109937c;
                return (ou91) nu91Var.m87248a();
            default:
                zwq0 zwq0Var2 = this.f277028b;
                lh90 lh90Var = (lh90) zwq0Var2.f287050a.m53864A(this.f277029c);
                lxq0 lxq0Var2 = zwq0Var2.f287051b;
                String str3 = lh90Var.f133426a;
                int i3 = lh90Var.f133427b;
                hug0 hug0Var = lxq0Var2.f137863c;
                if (hug0Var == null) {
                    int iM38547C = edb.m38547C(i3);
                    if (iM38547C != 0) {
                        i = 2;
                        if (iM38547C != 1) {
                            if (iM38547C != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = 1;
                        }
                    } else {
                        i = 3;
                    }
                    hug0 hug0Var2 = new hug0(i, null, str3, st91.f213865b);
                    lxq0Var2.f137863c = hug0Var2;
                    hug0Var = hug0Var2;
                }
                return hug0Var.mo29028e().f126193a;
        }
    }
}
