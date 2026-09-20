package p204p;

import com.spotify.connect.smartcontrol.events.proto.ConnectSmartControlLifecycleEvent;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class y7q {

    /* JADX INFO: renamed from: a */
    public final qre0 f270122a;

    public /* synthetic */ y7q(qre0 qre0Var) {
        this.f270122a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m93005a(UUID uuid, int i, tvi tviVar, mvi mviVar) {
        String str;
        String str2;
        String str3;
        wgg0 wgg0Var;
        boolean z = tviVar instanceof svi;
        svi sviVar = z ? (svi) tviVar : null;
        uvi uviVarM7461t = ConnectSmartControlLifecycleEvent.m7461t();
        uviVarM7461t.m84062r(uuid.toString());
        if (i == 1) {
            str = "requested";
        } else if (i == 2) {
            str = "queued";
        } else if (i == 3) {
            str = "suppressed";
        } else if (i == 4) {
            str = "presented";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "dismissed";
        }
        uviVarM7461t.m84064t(str);
        if (z) {
            str2 = "simple";
        } else {
            if (!(tviVar instanceof nvi)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "custom";
        }
        uviVarM7461t.m84065u(str2);
        if (mviVar instanceof lvi) {
            str3 = "user_interaction_immediate";
        } else {
            if (!(mviVar instanceof kvi)) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "background_time_sensitive";
        }
        uviVarM7461t.m84063s(str3);
        String str4 = (sviVar == null || (wgg0Var = sviVar.f214444d) == null) ? null : wgg0Var.f251063a;
        if (str4 == null) {
            str4 = "";
        }
        uviVarM7461t.m84060m(str4);
        String str5 = sviVar != null ? sviVar.f214445e : null;
        uviVarM7461t.m84061q(str5 != null ? str5 : "");
        this.f270122a.m73616a(uviVarM7461t.build());
    }
}
