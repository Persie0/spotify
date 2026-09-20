package p204p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class fc01 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gc01 f67967a;

    public fc01(gc01 gc01Var) {
        this.f67967a = gc01Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        gc01 gc01Var = this.f67967a;
        gc01Var.f78453h = (MobiusLoop.Controller) obj;
        gc01Var.m35106i();
    }
}
