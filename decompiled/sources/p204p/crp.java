package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class crp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ grp f41338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crp(grp grpVar, int i) {
        super(0);
        this.f41337a = i;
        this.f41338b = grpVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f41337a) {
            case 0:
                break;
        }
        return new DispatcherWorker((luk) this.f41338b.f83809d);
    }
}
