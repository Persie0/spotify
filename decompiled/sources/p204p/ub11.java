package p204p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final class ub11 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pzs0 f228610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fv31 f228611c;

    public /* synthetic */ ub11(pzs0 pzs0Var, fv31 fv31Var, int i) {
        this.f228609a = i;
        this.f228610b = pzs0Var;
        this.f228611c = fv31Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f228609a) {
            case 0:
                return Boolean.valueOf(((hv31) this.f228610b.f183794b).mo48713h(this.f228611c, false));
            default:
                return Boolean.valueOf(((hv31) this.f228610b.f183794b).mo48713h(this.f228611c, true));
        }
    }
}
