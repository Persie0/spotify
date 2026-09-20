package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class zma1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dna1 f284209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zma1(dna1 dna1Var, int i) {
        super(0);
        this.f284208a = i;
        this.f284209b = dna1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f284208a) {
            case 0:
                return new DispatcherWorker(this.f284209b.f50720c);
            default:
                return new DispatcherWorker(this.f284209b.f50721d);
        }
    }
}
