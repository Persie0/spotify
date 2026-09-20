package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class sjb0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ujb0 f209801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f209802c;

    public /* synthetic */ sjb0(ujb0 ujb0Var, String str, String str2, int i) {
        this.f209800a = i;
        this.f209801b = ujb0Var;
        this.f209802c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f209800a) {
            case 0:
                this.f209801b.f230956c.f18029a.m66542d(this.f209802c, (s7f) obj);
                break;
            default:
                this.f209801b.f230956c.f18029a.m66542d(this.f209802c, (s7f) obj);
                break;
        }
    }
}
