package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class j520 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ shy f108843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j520(shy shyVar, int i) {
        super(0);
        this.f108842a = i;
        this.f108843b = shyVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f108842a) {
            case 0:
                return new DispatcherWorker(this.f108843b.f209289c);
            default:
                return new DispatcherWorker(this.f108843b.f209290d);
        }
    }
}
