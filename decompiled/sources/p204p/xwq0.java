package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xwq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zwq0 f266737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwq0(zwq0 zwq0Var, int i) {
        super(0);
        this.f266736a = i;
        this.f266737b = zwq0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f266736a) {
            case 0:
                j8g0 j8g0Var = this.f266737b.f287051b.f137862b;
                yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("merch_carousel", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = j8g0Var.f109937c;
                return (ou91) nu91Var.m87248a();
            default:
                return (qoc1) this.f266737b.f287052c.get();
        }
    }
}
