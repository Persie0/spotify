package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class csk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fsk0 f41651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ csk0(fsk0 fsk0Var, int i) {
        super(0);
        this.f41650a = i;
        this.f41651b = fsk0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f41650a) {
            case 0:
                return new DispatcherWorker(this.f41651b.f72891e);
            case 1:
                return new DispatcherWorker(this.f41651b.f72892f);
            default:
                return new geg0(this.f41651b.f72889c);
        }
    }
}
