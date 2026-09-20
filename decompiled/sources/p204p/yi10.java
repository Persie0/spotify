package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class yi10 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi10 f273018a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xxi f273019b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sr4 f273020c;

    public yi10(zi10 zi10Var, xxi xxiVar, sr4 sr4Var) {
        this.f273018a = zi10Var;
        this.f273019b = xxiVar;
        this.f273020c = sr4Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        xxi xxiVar = this.f273019b;
        zi10 zi10Var = this.f273018a;
        zi10.m96184b(zi10Var, xxiVar);
        sr4 sr4Var = this.f273020c;
        sr4Var.m79016f("create_bluetooth_socket");
        ((rr4) zi10Var.f283064e).m76276b(sr4Var.m79015d());
    }
}
