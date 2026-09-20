package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes9.dex */
public final class bp21 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cp21 f29299b;

    public /* synthetic */ bp21(cp21 cp21Var, int i) {
        this.f29298a = i;
        this.f29299b = cp21Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f29298a) {
            case 0:
                this.f29299b.f40409c.mo68158h((int) 30000, 0.0f);
                break;
            case 1:
                this.f29299b.f40409c.mo68156c();
                break;
            default:
                this.f29299b.f40409c.mo68156c();
                break;
        }
    }
}
