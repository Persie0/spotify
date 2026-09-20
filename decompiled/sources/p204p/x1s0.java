package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: classes10.dex */
public final class x1s0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z1s0 f257267b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletableSubject f257268c;

    public /* synthetic */ x1s0(z1s0 z1s0Var, CompletableSubject completableSubject, int i) {
        this.f257266a = i;
        this.f257267b = z1s0Var;
        this.f257268c = completableSubject;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f257266a) {
            case 0:
                this.f257267b.f278411i.onNext(new v1s0(obj));
                this.f257268c.onComplete();
                break;
            default:
                Throwable th = (Throwable) obj;
                this.f257267b.f278411i.onNext(new u1s0(th));
                this.f257268c.onError(th);
                break;
        }
    }
}
