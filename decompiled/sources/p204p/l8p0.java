package p204p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class l8p0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hun0 f130920b;

    public /* synthetic */ l8p0(hun0 hun0Var, int i) {
        this.f130919a = i;
        this.f130920b = hun0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f130919a) {
            case 0:
                ((AtomicBoolean) this.f130920b.f95433d).set(true);
                break;
            default:
                ((AtomicBoolean) this.f130920b.f95433d).set(false);
                break;
        }
    }
}
