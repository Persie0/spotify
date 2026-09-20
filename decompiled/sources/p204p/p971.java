package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p971 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sag0 f175176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r971 f175177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p971(sag0 sag0Var, r971 r971Var, int i) {
        super(0);
        this.f175175a = i;
        this.f175176b = sag0Var;
        this.f175177c = r971Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f175175a) {
            case 0:
                kvy state = this.f175177c.getState();
                if (state == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str = state.f126977a;
                yt91 yt91VarM96903c = this.f175176b.f207208b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("form_field", str, null, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            default:
                kvy state2 = this.f175177c.getState();
                if (state2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str2 = state2.f126977a;
                yt91 yt91VarM96903c2 = this.f175176b.f207208b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("form_field_error", str2, null, null, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = zt91VarM94607a2;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
        }
    }
}
