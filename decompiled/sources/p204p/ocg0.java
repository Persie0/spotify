package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ocg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f163923a;

    public ocg0(i8g0 i8g0Var, int i) {
        String str;
        yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
        switch (i) {
            case 1:
                str = "app_started";
                break;
            case 2:
                str = "car";
                break;
            case 3:
                str = "cast";
                break;
            case 4:
                str = "device_picker";
                break;
            case 5:
                str = "headphones";
                break;
            case 6:
                str = "home_devices";
                break;
            case 7:
                str = "invite_sheet";
                break;
            case 8:
                str = "jam_was_joined";
                break;
            case 9:
                str = "settings";
                break;
            case 10:
                str = "speaker";
                break;
            default:
                throw null;
        }
        yt91VarM96903c.f276055i.add(new bu91("onboarding_slate", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f163923a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f163923a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f163923a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
