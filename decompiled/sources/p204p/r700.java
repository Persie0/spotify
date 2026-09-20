package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class r700 implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f196405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f196406c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f196407d;

    public /* synthetic */ r700(Object obj, Object obj2, Object obj3, int i) {
        this.f196404a = i;
        this.f196405b = obj;
        this.f196406c = obj2;
        this.f196407d = obj3;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        switch (this.f196404a) {
            case 0:
                l5j0 l5j0Var = (l5j0) this.f196405b;
                s700 s700Var = (s700) this.f196406c;
                l5j0Var.mo58242e(s700Var);
                ((c700) this.f196407d).f34682q.remove(s700Var);
                s700Var.f206253e.clear();
                s700Var.f206249a.clear();
                s700Var.f206250b.clear();
                s700Var.f206251c.clear();
                WeakReference weakReference = s700Var.f206252d;
                if (weakReference != null) {
                    weakReference.clear();
                    return;
                }
                return;
            case 1:
                ((zee0) this.f196405b).f282012c.m92313f((String) this.f196406c, (yee0) this.f196407d);
                return;
            default:
                ((ku51) this.f196406c).f126462a.size();
                ((Disposable) this.f196407d).dispose();
                ku51 ku51Var = (ku51) this.f196406c;
                zs81 zs81Var = (zs81) this.f196405b;
                synchronized (ku51Var) {
                    ku51Var.f126462a.remove(zs81Var);
                    ku51Var.f126462a.size();
                }
                return;
        }
    }

    public r700(String str, zs81 zs81Var, ku51 ku51Var, Disposable disposable) {
        this.f196404a = 2;
        this.f196405b = zs81Var;
        this.f196406c = ku51Var;
        this.f196407d = disposable;
    }
}
