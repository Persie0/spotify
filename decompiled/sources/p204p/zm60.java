package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class zm60 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bn60 f284169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Throwable f284170c;

    public /* synthetic */ zm60(bn60 bn60Var, Throwable th, int i) {
        this.f284168a = i;
        this.f284169b = bn60Var;
        this.f284170c = th;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f284168a) {
            case 0:
                boolean z = ((tzi) obj) instanceof qzi;
                bn60 bn60Var = this.f284169b;
                if (!z) {
                    bn60.m29927d(bn60Var, "Connection failed to initialize", this.f284170c);
                } else {
                    bn60.m29926c(bn60Var);
                }
                break;
            default:
                bn60.m29927d(this.f284169b, "Connection failed to initialize", this.f284170c);
                break;
        }
    }
}
