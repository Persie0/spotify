package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ng80 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pg80 f153583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng80(pg80 pg80Var, int i) {
        super(0);
        this.f153582a = i;
        this.f153583b = pg80Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f153582a) {
            case 0:
                return Boolean.valueOf(((AtomicBoolean) this.f153583b.f177249d).get());
            default:
                return new cjc0((dut) ((e0n) this.f153583b.f177248c).get(), lg80.f133133c);
        }
    }
}
