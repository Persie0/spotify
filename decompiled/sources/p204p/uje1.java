package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class uje1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ shy f230984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uje1(shy shyVar, int i) {
        super(0);
        this.f230983a = i;
        this.f230984b = shyVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f230983a) {
            case 0:
                return new DispatcherWorker(this.f230984b.f209289c);
            default:
                return new DispatcherWorker(this.f230984b.f209290d);
        }
    }
}
