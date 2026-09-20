package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class mh1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nh1 f143684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh1(nh1 nh1Var, int i) {
        super(0);
        this.f143683a = i;
        this.f143684b = nh1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f143683a) {
            case 0:
                return new DispatcherWorker(this.f143684b.f153838g);
            case 1:
                return new DispatcherWorker(this.f143684b.f153839h);
            case 2:
                this.f143684b.f153835d.getClass();
                return new svy0(tuy0.f223978a);
            default:
                nh1 nh1Var = this.f143684b;
                return nh1Var.f153836e.m78503a(nh1Var.f153840i, new kh1(nh1Var, 3));
        }
    }
}
