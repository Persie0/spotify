package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class z620 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c720 f279680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z620(c720 c720Var, int i) {
        super(0);
        this.f279679a = i;
        this.f279680b = c720Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f279679a) {
            case 0:
                return new DispatcherWorker(this.f279680b.f34716g);
            case 1:
                return new DispatcherWorker(this.f279680b.f34718i);
            default:
                return new geg0(this.f279680b.f34713d);
        }
    }
}
