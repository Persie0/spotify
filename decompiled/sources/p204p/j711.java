package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class j711 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l711 f109465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j711(l711 l711Var, int i) {
        super(0);
        this.f109464a = i;
        this.f109465b = l711Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f109464a) {
            case 0:
                return new DispatcherWorker(this.f109465b.f130545h);
            case 1:
                return new DispatcherWorker(this.f109465b.f130546i);
            default:
                this.f109465b.f130544g.getClass();
                return new svy0(vuy0.f245096a);
        }
    }
}
