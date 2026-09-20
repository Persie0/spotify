package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class n6i0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6i0 f150894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6i0(r6i0 r6i0Var, int i) {
        super(0);
        this.f150893a = i;
        this.f150894b = r6i0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f150893a) {
            case 0:
                break;
        }
        return new DispatcherWorker(this.f150894b.f196295e);
    }
}
