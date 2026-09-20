package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class q8i0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ljp f186327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8i0(ljp ljpVar, int i) {
        super(4);
        this.f186326a = i;
        this.f186327b = ljpVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f186326a) {
            case 0:
                ((Number) obj3).intValue();
                return (oah0) this.f186327b.f134120f;
            default:
                oah0 oah0Var = (oah0) obj;
                if (r8i0.f196799a[((k8i0) obj4).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c = oah0Var.f163330a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("explore_premium_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                ((f8i0) ((er70) this.f186327b.f134118d).get()).getClass();
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination?displayReason=multi_song_capping")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
    }
}
