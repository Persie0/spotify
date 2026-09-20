package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hw4 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f95855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw4(int i, List list) {
        super(list, 3);
        this.f95855c = i;
    }

    /* JADX INFO: renamed from: F1 */
    public nh01 m48913F1() {
        return new nh01((List) this.f57320b);
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: j0 */
    public final mz8 mo48914j0() {
        switch (this.f95855c) {
            case 0:
                return new q7f(0, (List) this.f57320b);
            case 1:
                return new mq10(0, (List) this.f57320b);
            case 2:
                return new q7f(1, (List) this.f57320b);
            case 3:
                return new d6q0((List) this.f57320b);
            case 4:
                return new mq10(1, (List) this.f57320b);
            default:
                return m48913F1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw4(List list, boolean z) {
        super(list, 3);
        this.f95855c = 2;
    }
}
