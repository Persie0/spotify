package p204p;

import androidx.work.Worker;

/* JADX INFO: loaded from: classes3.dex */
public final class w1e1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Worker f247094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1e1(Worker worker, int i) {
        super(0);
        this.f247093a = i;
        this.f247094b = worker;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f247093a) {
            case 0:
                this.f247094b.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            default:
                return this.f247094b.mo1149f();
        }
    }
}
