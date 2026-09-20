package p204p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes4.dex */
public final class yr1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f275354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Scheduler f275355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr1(Scheduler scheduler, int i) {
        super(0);
        this.f275354a = i;
        this.f275355b = scheduler;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f275354a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return new SchedulerWorkRunner(this.f275355b);
    }
}
