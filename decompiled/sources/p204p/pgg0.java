package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pgg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177329a;

    /* JADX INFO: renamed from: b */
    public final zt91 f177330b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s8g0 f177331c;

    public pgg0(s8g0 s8g0Var, Integer num, String str, String str2, int i) {
        this.f177329a = i;
        switch (i) {
            case 1:
                this.f177331c = s8g0Var;
                yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("connect_device", null, num, str2, str));
                yt91VarM96903c.f276056j = true;
                this.f177330b = yt91VarM96903c.m94607a();
                break;
            case 5:
                this.f177331c = s8g0Var;
                yt91 yt91VarM96903c2 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("local_device", null, num, str2, str));
                yt91VarM96903c2.f276056j = true;
                this.f177330b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f177331c = s8g0Var;
                yt91 yt91VarM96903c3 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("bluetooth_device", null, num, str2, str));
                yt91VarM96903c3.f276056j = true;
                this.f177330b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f177329a;
        zt91 zt91Var = this.f177330b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                break;
            case 1:
                st91 st91Var2 = st91.f213865b;
                break;
            case 2:
                st91 st91Var3 = st91.f213865b;
                break;
            case 3:
                st91 st91Var4 = st91.f213865b;
                break;
            case 4:
                st91 st91Var5 = st91.f213865b;
                break;
            case 5:
                st91 st91Var6 = st91.f213865b;
                break;
            default:
                st91 st91Var7 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f177329a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f177330b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f177330b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f177330b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var3.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var3.m87248a();
            case 3:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f177330b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var4.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var4.m87248a();
            case 4:
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = this.f177330b;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var5.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var5.m87248a();
            case 5:
                nu91 nu91Var6 = new nu91();
                nu91Var6.f248107a = this.f177330b;
                nu91Var6.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var6.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var6.m87248a();
            default:
                nu91 nu91Var7 = new nu91();
                nu91Var7.f248107a = this.f177330b;
                nu91Var7.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var7.f158542f = ((tgg0) this.f177331c.f206644c).f220189b;
                return (ou91) nu91Var7.m87248a();
        }
    }

    public pgg0(s8g0 s8g0Var) {
        this.f177329a = 3;
        this.f177331c = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("groupable_devices_toggle", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f177330b = yt91VarM96903c.m94607a();
    }

    public pgg0(int i, Integer num, String str, s8g0 s8g0Var) {
        this.f177329a = i;
        switch (i) {
            case 4:
                this.f177331c = s8g0Var;
                yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("grouped_device", null, num, str, null));
                yt91VarM96903c.f276056j = true;
                this.f177330b = yt91VarM96903c.m94607a();
                break;
            case 5:
            default:
                this.f177331c = s8g0Var;
                yt91 yt91VarM96903c2 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("groupable_device", null, num, str, null));
                yt91VarM96903c2.f276056j = true;
                this.f177330b = yt91VarM96903c2.m94607a();
                break;
            case 6:
                this.f177331c = s8g0Var;
                yt91 yt91VarM96903c3 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("local_device_speakers", null, num, null, str));
                yt91VarM96903c3.f276056j = true;
                this.f177330b = yt91VarM96903c3.m94607a();
                break;
        }
    }
}
