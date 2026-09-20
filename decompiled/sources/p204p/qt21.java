package p204p;

import com.spotify.ads.esperanto.proto.SubSlotRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qt21 {

    /* JADX INFO: renamed from: a */
    public final ev21 f192262a;

    /* JADX INFO: renamed from: b */
    public final zy1 f192263b;

    /* JADX INFO: renamed from: c */
    public final dw0 f192264c;

    /* JADX INFO: renamed from: d */
    public final lm0 f192265d;

    /* JADX INFO: renamed from: e */
    public final luk f192266e;

    public qt21(ev21 ev21Var, zy1 zy1Var, dw0 dw0Var, lm0 lm0Var, luk lukVar) {
        this.f192262a = ev21Var;
        this.f192263b = zy1Var;
        this.f192264c = dw0Var;
        this.f192265d = lm0Var;
        this.f192266e = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static Object m73785a(qt21 qt21Var, mv0 mv0Var, hs21 hs21Var, Map map, ibk ibkVar, int i) {
        if ((i & 4) != 0) {
            map = nau.f152117a;
        }
        return x0h1.m89557A(qt21Var.f192266e, new gjw0(hs21Var, mv0Var, qt21Var, map, (i & 8) != 0 ? "" : "sponsored_context_switch", (fbk) null), ibkVar);
    }

    /* JADX INFO: renamed from: b */
    public final xjz0 m73786b(mv0 mv0Var) {
        ir51 ir51VarM2713o = SubSlotRequest.m2713o();
        ir51VarM2713o.m51431m(mv0Var.f147472a);
        SubSlotRequest subSlotRequest = (SubSlotRequest) ir51VarM2713o.build();
        wj50.m88279p(subSlotRequest);
        return new xjz0(new be11(this.f192262a.callStream("spotify.ads.esperanto.proto.Slots", "SubSlot", subSlotRequest), 11), 10);
    }
}
