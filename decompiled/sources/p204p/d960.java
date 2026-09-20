package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class d960 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46701a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uh8 f46702b;

    public /* synthetic */ d960(uh8 uh8Var, int i) {
        this.f46701a = i;
        this.f46702b = uh8Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f46701a) {
            case 0:
                w860 w860Var = (w860) obj;
                this.f46702b.f230382a.accept(new nh8(w860Var.f248860a, w860Var.f248861b));
                break;
            case 1:
                this.f46702b.m83134a(((z860) obj).f280394a);
                break;
            case 2:
                this.f46702b.f230382a.accept(new rh8(((b960) obj).f24783a));
                break;
            case 3:
                this.f46702b.m83134a(((s960) obj).f206867a);
                break;
            default:
                this.f46702b.f230382a.accept(new rh8(((u960) obj).f228083a));
                break;
        }
    }
}
