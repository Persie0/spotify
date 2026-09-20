package p204p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class etx extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ftx f62818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ etx(ftx ftxVar, int i) {
        super(0);
        this.f62817a = i;
        this.f62818b = ftxVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f62817a) {
            case 0:
                return new SchedulerWorkRunner(this.f62818b.f73334d);
            default:
                return new SchedulerWorkRunner(this.f62818b.f73335e);
        }
    }
}
