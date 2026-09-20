package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class p930 implements t160 {

    /* JADX INFO: renamed from: a */
    public final er70 f175137a;

    /* JADX INFO: renamed from: b */
    public final q4x f175138b;

    /* JADX INFO: renamed from: c */
    public final wg61 f175139c = new wg61(new si20(this, 10));

    /* JADX INFO: renamed from: d */
    public final iwr f175140d = new iwr();

    /* JADX INFO: renamed from: e */
    public final zv41 f175141e = jag1.m52819d(null);

    public p930(er70 er70Var, q4x q4xVar) {
        this.f175137a = er70Var;
        this.f175138b = q4xVar;
    }

    @Override // p204p.t160
    public final void start() {
        y930 y930Var = (y930) ((w930) this.f175139c.getValue());
        this.f175140d.m51848b(Observable.never().compose(RxMobius.m15657b(edb.m38558g(Mobius.m15582d(new x930(), RxConnectables.m15653a(r830.m74972c(y930Var.f270479b, y930Var.f270483f, y930Var.f270488k, y930Var.f270484g, y930Var.f270485h, y930Var.f270486i, y930Var.f270487j, y930Var.f270490m, y930Var.f270489l, y930Var.f270491n))).mo15596h(o930.m66442a(k0e1.m54985d(y930Var.f270478a.m72181a()), y930Var.f270480c, y930Var.f270481d, y930Var.f270482e))), new z930(null))).subscribe(new p8v(this, 28)));
    }

    @Override // p204p.t160
    public final void stop() {
        this.f175140d.m51847a();
    }
}
