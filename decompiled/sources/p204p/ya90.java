package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class ya90 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bb90 f270846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya90(bb90 bb90Var, int i) {
        super(0);
        this.f270845a = i;
        this.f270846b = bb90Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f270845a) {
            case 0:
                return new DispatcherWorker(this.f270846b.f25485f);
            default:
                return new DispatcherWorker(this.f270846b.f25486g);
        }
    }
}
