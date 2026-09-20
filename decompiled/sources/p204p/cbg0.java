package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class cbg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36120a = 0;

    /* JADX INFO: renamed from: b */
    public final zt91 f36121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gag0 f36122c;

    public cbg0(gag0 gag0Var, String str) {
        this.f36122c = gag0Var;
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("shuffle_play_item", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f36121b = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public av91 m32157a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f36121b, this.f36122c.f78049b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f36120a;
        gag0 gag0Var = this.f36122c;
        zt91 zt91Var = this.f36121b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = gag0Var.f78049b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            default:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = gag0Var.f78049b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
        }
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f36120a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f36121b;
                nu91Var.f248108b = this.f36122c.f78049b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f36121b;
                nu91Var2.f248108b = this.f36122c.f78049b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
        }
    }

    /* JADX INFO: renamed from: h */
    public av91 m32158h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f36121b, this.f36122c.f78049b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m32159i(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("shuffle_play", 1, Collections.singletonMap("context_to_be_played", string)), this.f36121b, this.f36122c.f78049b, System.currentTimeMillis());
    }

    public cbg0(gag0 gag0Var, Integer num, String str) {
        this.f36122c = gag0Var;
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("content_item", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f36121b = yt91VarM96903c.m94607a();
    }
}
