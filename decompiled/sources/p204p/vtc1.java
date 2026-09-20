package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class vtc1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ juc1 f244610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vtc1(juc1 juc1Var, int i) {
        super(0);
        this.f244609a = i;
        this.f244610b = juc1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f244609a) {
            case 0:
                break;
        }
        return new DispatcherWorker(this.f244610b.f116088e);
    }
}
