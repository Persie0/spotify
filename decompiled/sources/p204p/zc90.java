package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class zc90 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bd90 f281478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc90(bd90 bd90Var, int i) {
        super(0);
        this.f281477a = i;
        this.f281478b = bd90Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f281477a) {
            case 0:
                bd90 bd90Var = this.f281478b;
                return ((ow00) bd90Var.f26051a.get()).m68149a(bd90Var.f26052b);
            default:
                return ((yfy) this.f281478b.f26053c.getValue()).m93573c(Collections.singletonList(r890.f196740a));
        }
    }
}
