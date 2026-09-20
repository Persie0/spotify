package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes10.dex */
public final class f431 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f65659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i431 f65660c;

    public /* synthetic */ f431(int i, String str, i431 i431Var) {
        this.f65658a = i;
        this.f65659b = str;
        this.f65660c = i431Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f65658a) {
            case 0:
                String str = this.f65659b;
                ((wy3) this.f65660c.f98407a).getClass();
                w331 w331Var = new w331(new a431(str, System.currentTimeMillis()));
                if (this.f65660c.f98421o.mo23797a()) {
                    this.f65660c.f98421o.onNext(w331Var);
                    this.f65660c.f98418l.onNext(w2a1.f247311a);
                    return;
                } else {
                    i431 i431Var = this.f65660c;
                    synchronized (i431Var.f98419m) {
                        i431Var.f98420n.add(w331Var);
                    }
                    return;
                }
            default:
                y331 y331Var = new y331(this.f65659b);
                if (this.f65660c.f98421o.mo23797a()) {
                    this.f65660c.f98421o.onNext(y331Var);
                    return;
                }
                i431 i431Var2 = this.f65660c;
                synchronized (i431Var2.f98419m) {
                    i431Var2.f98420n.add(y331Var);
                }
                return;
        }
    }
}
