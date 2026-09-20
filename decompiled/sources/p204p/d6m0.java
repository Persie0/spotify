package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d6m0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45727b;

    public /* synthetic */ d6m0(Object obj, int i) {
        this.f45726a = i;
        this.f45727b = obj;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f45726a) {
            case 0:
                qu91 qu91Var = (b7a1) ((WeakReference) ((ihk0) this.f45727b).f102314c).get();
                if (qu91Var != null) {
                    zz8 zz8Var = (zz8) qu91Var;
                    zz8Var.f287915d.reset();
                    c9k c9kVar = zz8Var.f287917f.f79409o;
                    if (c9kVar != null) {
                        kk40.m56680v(c9kVar, null);
                    }
                }
                hc80Var.getLifecycle().mo31988d(this);
                break;
            default:
                ((ovf) ((kq0) this.f45727b).f125181c).mo2820d(e0w0.f55055b);
                break;
        }
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        switch (this.f45726a) {
            case 0:
                ((ihk0) this.f45727b).f102313b = true;
                break;
            default:
                ((ovf) ((kq0) this.f45727b).f125181c).mo2820d(e0w0.f55054a);
                break;
        }
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        switch (this.f45726a) {
            case 0:
                ((ihk0) this.f45727b).f102313b = false;
                break;
            default:
                ((ovf) ((kq0) this.f45727b).f125181c).mo2820d(e0w0.f55056c);
                break;
        }
    }
}
