package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class hsg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94692a;

    /* JADX INFO: renamed from: b */
    public final zt91 f94693b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ psg0 f94694c;

    public hsg0(psg0 psg0Var, String str, int i) {
        this.f94692a = i;
        switch (i) {
            case 2:
                this.f94694c = psg0Var;
                yt91 yt91VarM96903c = psg0Var.f180856b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("join_session_failed_full_popup", str, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f94693b = yt91VarM96903c.m94607a();
                break;
            case 3:
                this.f94694c = psg0Var;
                yt91 yt91VarM96903c2 = psg0Var.f180856b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("join_session_failed_generic_popup", str, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f94693b = yt91VarM96903c2.m94607a();
                break;
            case 4:
                this.f94694c = psg0Var;
                yt91 yt91VarM96903c3 = psg0Var.f180856b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("you_were_kicked_popup", str, null, null, null));
                yt91VarM96903c3.f276056j = true;
                this.f94693b = yt91VarM96903c3.m94607a();
                break;
            default:
                this.f94694c = psg0Var;
                yt91 yt91VarM96903c4 = psg0Var.f180856b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("host_ended_session_popup", str, null, null, null));
                yt91VarM96903c4.f276056j = true;
                this.f94693b = yt91VarM96903c4.m94607a();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public av91 m48427a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f94693b, this.f94694c.f180855a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f94692a;
        psg0 psg0Var = this.f94694c;
        zt91 zt91Var = this.f94693b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = psg0Var.f180855a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = psg0Var.f180855a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = psg0Var.f180855a;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = psg0Var.f180855a;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var8 != null) {
                    arrayList4.addAll(st91Var8.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            default:
                st91 st91Var9 = st91.f213865b;
                st91 st91Var10 = psg0Var.f180855a;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var10 != null) {
                    arrayList5.addAll(st91Var10.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
        }
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f94692a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f94693b;
                nu91Var.f248108b = this.f94694c.f180855a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f94693b;
                nu91Var2.f248108b = this.f94694c.f180855a;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f94693b;
                nu91Var3.f248108b = this.f94694c.f180855a;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var3.m87248a();
            case 3:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f94693b;
                nu91Var4.f248108b = this.f94694c.f180855a;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var4.m87248a();
            default:
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = this.f94693b;
                nu91Var5.f248108b = this.f94694c.f180855a;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var5.m87248a();
        }
    }

    /* JADX INFO: renamed from: h */
    public lsg0 m48428h() {
        return new lsg0(this, 0);
    }

    /* JADX INFO: renamed from: i */
    public msg0 m48429i() {
        return new msg0(this, 0);
    }

    /* JADX INFO: renamed from: j */
    public osg0 m48430j() {
        return new osg0(this, 0);
    }

    /* JADX INFO: renamed from: k */
    public isg0 m48431k() {
        return new isg0(this, 0);
    }

    /* JADX INFO: renamed from: l */
    public isg0 m48432l() {
        return new isg0(this, 1);
    }

    /* JADX INFO: renamed from: m */
    public lsg0 m48433m() {
        return new lsg0(this, 1);
    }

    /* JADX INFO: renamed from: n */
    public msg0 m48434n() {
        return new msg0(this, 1);
    }

    /* JADX INFO: renamed from: o */
    public osg0 m48435o() {
        return new osg0(this, 1);
    }

    public hsg0(psg0 psg0Var) {
        this.f94692a = 0;
        this.f94694c = psg0Var;
        yt91 yt91VarM96903c = psg0Var.f180856b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("host_approved_request_nudge", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f94693b = yt91VarM96903c.m94607a();
    }
}
