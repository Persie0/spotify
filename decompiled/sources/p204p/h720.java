package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class h720 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i720 f88321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h720(i720 i720Var, int i) {
        super(4);
        this.f88320a = i;
        this.f88321b = i720Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f88320a) {
            case 0:
                ((Number) obj3).intValue();
                return new bug0(new hog0(14, edb.m38564m("spotify:chat:", this.f88321b.f99409b), (st91) obj4));
            default:
                bug0 bug0Var = (bug0) obj;
                if (!((g720) obj4).equals(g720.f77159a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM38564m = edb.m38564m("spotify:listening-activity:group-audience-selection:", this.f88321b.f99409b);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM38564m != null ? strM38564m.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), bug0Var.f31133a, bug0Var.f31134b.f93537b, System.currentTimeMillis());
        }
    }
}
