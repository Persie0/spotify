package p204p;

import android.net.Uri;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class i981 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j981 f99929b;

    public /* synthetic */ i981(j981 j981Var, int i) {
        this.f99928a = i;
        this.f99929b = j981Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f99928a) {
            case 0:
                this.f99929b.f110122d.onNext(new m981((Uri) obj));
                break;
            default:
                this.f99929b.f110122d.onNext(new m981(k981.f120537a));
                break;
        }
    }
}
