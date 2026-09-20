package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class phy extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ shy f177762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ phy(shy shyVar, int i) {
        super(0);
        this.f177761a = i;
        this.f177762b = shyVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f177761a) {
            case 0:
                return new DispatcherWorker(this.f177762b.f209289c);
            default:
                return new DispatcherWorker(this.f177762b.f209290d);
        }
    }
}
