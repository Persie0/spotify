package p204p;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b45 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntConsumer f23224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f23225c;

    public /* synthetic */ b45(IntConsumer intConsumer, int i, int i2) {
        this.f23223a = i2;
        this.f23224b = intConsumer;
        this.f23225c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23223a) {
            case 0:
                this.f23224b.accept(this.f23225c);
                break;
            default:
                this.f23224b.accept(this.f23225c);
                break;
        }
    }
}
