package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class ls6 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ns6 f136452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls6(ns6 ns6Var, int i) {
        super(0);
        this.f136451a = i;
        this.f136452b = ns6Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f136451a) {
            case 0:
                return new DispatcherWorker(this.f136452b.f157692a);
            default:
                return new DispatcherWorker(this.f136452b.f157693b);
        }
    }
}
