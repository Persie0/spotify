package p204p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class p6t implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f174474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c7t f174475c;

    public /* synthetic */ p6t(Consumer consumer, c7t c7tVar, int i) {
        this.f174473a = i;
        this.f174474b = consumer;
        this.f174475c = c7tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f174473a) {
            case 0:
                this.f174474b.accept(l5t.f130000a);
                u5t u5tVar = this.f174475c.f35010e;
                kv91 kv91Var = u5tVar.f227105a;
                xug0 xug0Var = u5tVar.f227106b;
                xug0Var.getClass();
                yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("savebutton", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                break;
            default:
                this.f174474b.accept(g5t.f76766a);
                u5t u5tVar2 = this.f174475c.f35010e;
                kv91 kv91Var2 = u5tVar2.f227105a;
                xug0 xug0Var2 = u5tVar2.f227106b;
                xug0Var2.getClass();
                yt91 yt91VarM96903c3 = xug0Var2.f266109b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("user_image", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                String str2 = kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                break;
        }
    }
}
