package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes10.dex */
public final class nfr0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ofr0 f153422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfr0(ofr0 ofr0Var, int i) {
        super(0);
        this.f153421a = i;
        this.f153422b = ofr0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f153421a) {
            case 0:
                return new DispatcherWorker(this.f153422b.f164897c);
            default:
                return new DispatcherWorker(this.f153422b.f164896b);
        }
    }
}
