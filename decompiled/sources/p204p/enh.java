package p204p;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes3.dex */
public final class enh extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CancellationSignal f61161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enh(CancellationSignal cancellationSignal, int i) {
        super(1);
        this.f61160a = i;
        this.f61161b = cancellationSignal;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f61160a) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.f61161b.cancel();
                }
                break;
            case 1:
                this.f61161b.cancel();
                break;
            case 2:
                this.f61161b.cancel();
                break;
            default:
                this.f61161b.cancel();
                break;
        }
        return w2a1.f247311a;
    }
}
