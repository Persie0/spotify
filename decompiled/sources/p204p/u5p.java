package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class u5p implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227077a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v5p f227078b;

    public /* synthetic */ u5p(v5p v5pVar, int i) {
        this.f227077a = i;
        this.f227078b = v5pVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f227077a) {
            case 0:
                this.f227078b.m84738d();
                break;
            case 1:
                this.f227078b.m84738d();
                break;
            case 2:
                ((qnx0) this.f227078b.f237548e.get()).mo36155f();
                break;
            default:
                ((qnx0) this.f227078b.f237548e.get()).mo36153d();
                break;
        }
    }
}
