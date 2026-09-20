package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes8.dex */
public final class xas0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yas0 f259757b;

    public /* synthetic */ xas0(yas0 yas0Var, int i) {
        this.f259756a = i;
        this.f259757b = yas0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        switch (this.f259756a) {
            case 0:
                yas0 yas0Var = this.f259757b;
                if (yas0Var.f270997g) {
                    String str = yas0Var.f270998h;
                    if (str != null) {
                        yas0Var.f270991a.f49738a = str;
                    }
                    kv91 kv91Var = yas0Var.f270992b;
                    yt91 yt91VarM96903c = yas0Var.f270993c.f67285a.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("horizontal_layout", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("promotional_label", null, null, null, null));
                    yt91VarM96903c2.f276056j = true;
                    zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                    nu91 nu91Var = new nu91();
                    nu91Var.f248107a = zt91VarM94607a;
                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                }
                yas0Var.m93219b();
                break;
            default:
                yas0 yas0Var2 = this.f259757b;
                ViewGroup viewGroup = yas0Var2.f270994d;
                if (viewGroup != null && (view = yas0Var2.f270995e) != null && (view2 = yas0Var2.f270996f) != null && yas0Var2.f270997g) {
                    o891.m66421a(viewGroup, yas0Var2.m93218a(view, view2));
                    view.setVisibility(4);
                    view2.setVisibility(0);
                }
                break;
        }
    }
}
