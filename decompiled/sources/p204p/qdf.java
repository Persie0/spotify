package p204p;

import com.spotify.mobius.EventSource;

/* JADX INFO: loaded from: classes9.dex */
public final class qdf extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventSource f187556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdf(EventSource eventSource, int i) {
        super(1);
        this.f187555a = i;
        this.f187556b = eventSource;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f187555a) {
            case 0:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = b7e.f24250c1;
                qspVar.f192165d = y2e.f268578Y;
                qspVar.f192163b = this.f187556b;
                break;
            default:
                qsp qspVar2 = (qsp) ((hmh0) obj);
                qspVar2.f192162a = cqn0.f40938W0;
                qspVar2.f192163b = this.f187556b;
                qspVar2.f192165d = lin0.f133853g;
                break;
        }
        return w2a1.f247311a;
    }
}
