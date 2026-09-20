package p204p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class sdc0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ udc0 f207977a;

    public sdc0(udc0 udc0Var) {
        this.f207977a = udc0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return (Boolean) this.f207977a.f229230f.invoke();
    }
}
