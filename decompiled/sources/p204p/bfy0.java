package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class bfy0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oyn0 f26801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfy0(oyn0 oyn0Var, int i) {
        super(0);
        this.f26800a = i;
        this.f26801b = oyn0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f26800a) {
            case 0:
                return new DispatcherWorker((luk) this.f26801b.f171809b);
            default:
                return new DispatcherWorker((luk) this.f26801b.f171810c);
        }
    }
}
