package p204p;

import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes9.dex */
public final class cvo implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Parcelable f42500c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f42501d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f42502e;

    public cvo(i82 i82Var, String str, int i, d850 d850Var) {
        this.f42498a = 2;
        this.f42499b = i82Var;
        this.f42501d = str;
        this.f42502e = i;
        this.f42500c = d850Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f42498a) {
            case 0:
                evo evoVar = (evo) this.f42499b;
                zm8 zm8Var = (zm8) evoVar.f63290b.f246672b;
                zm8Var.getClass();
                yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("nudge", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("link_account_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                String str = evoVar.f63289a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), zm8Var.f284179b, System.currentTimeMillis()), null).f46380a.f279709a;
                an10 an10Var = evoVar.f63291c;
                vn80 vn80Var = (vn80) this.f42500c;
                String str2 = this.f42501d;
                wj50.m88279p(str2);
                an10Var.m26454a(vn80Var, "Samsung", str2, str, 2, this.f42502e);
                break;
            case 1:
                evo evoVar2 = (evo) this.f42499b;
                zm8 zm8Var2 = (zm8) evoVar2.f63290b.f246672b;
                zm8Var2.getClass();
                yt91 yt91VarM96903c3 = zm8Var2.f284180c.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("nudge", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248108b = zm8Var2.f284179b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                String str3 = evoVar2.f63289a.mo57449i((ou91) nu91Var.m87248a(), null).f283077a.f261762a;
                an10 an10Var2 = evoVar2.f63291c;
                vn80 vn80Var2 = (vn80) this.f42500c;
                String str4 = this.f42501d;
                wj50.m88279p(str4);
                an10Var2.m26457d(this.f42502e, str3, "Samsung", str4, vn80Var2);
                break;
            default:
                nh61 nh61Var = (nh61) ((i82) this.f42499b).f99667c;
                d850 d850Var = (d850) this.f42500c;
                ((tjn0) nh61Var.f153887e).f220969a = this.f42501d;
                h62.m46704b((h62) ((er70) nh61Var.f153885c).get(), new n52(this.f42502e), true, d850Var);
                break;
        }
    }

    public /* synthetic */ cvo(evo evoVar, vn80 vn80Var, String str, int i, int i2) {
        this.f42498a = i2;
        this.f42499b = evoVar;
        this.f42500c = vn80Var;
        this.f42501d = str;
        this.f42502e = i;
    }
}
