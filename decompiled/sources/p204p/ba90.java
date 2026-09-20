package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class ba90 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ca90 f25120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba90(ca90 ca90Var, int i) {
        super(0);
        this.f25119a = i;
        this.f25120b = ca90Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f25119a) {
            case 0:
                return new DispatcherWorker(this.f25120b.f35781b);
            default:
                return new DispatcherWorker(this.f25120b.f35782c);
        }
    }
}
