package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class q42 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f185026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f185027b;

    public /* synthetic */ q42(kqi0 kqi0Var, int i) {
        this.f185026a = i;
        this.f185027b = kqi0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f185026a) {
            case 0:
                this.f185027b.setValue((e301) obj);
                break;
            case 1:
                this.f185027b.setValue((e301) obj);
                break;
            default:
                this.f185027b.setValue((e301) obj);
                break;
        }
    }
}
