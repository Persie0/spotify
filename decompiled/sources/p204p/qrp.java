package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class qrp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vrp f191894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrp(vrp vrpVar, int i) {
        super(0);
        this.f191893a = i;
        this.f191894b = vrpVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f191893a) {
            case 0:
                break;
        }
        return new DispatcherWorker(this.f191894b.f244234a);
    }
}
