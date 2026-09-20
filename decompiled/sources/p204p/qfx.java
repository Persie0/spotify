package p204p;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.State;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class qfx implements md61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ufx f188306a;

    public qfx(ufx ufxVar) {
        this.f188306a = ufxVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX INFO: renamed from: a */
    public final void m72723a() {
        String refreshToken;
        ufx ufxVar = this.f188306a;
        SwipeRefreshLayout swipeRefreshLayout = ufxVar.f229896S0;
        jex jexVar = ufxVar.f229911c;
        jrv0 jrv0Var = ufxVar.f229905Z;
        lv31 lv31VarEdit = jrv0Var.f115316a.mo35842b(jrv0Var.f115317b, ufxVar.f229889L0).edit();
        lv31VarEdit.m60048a(krv0.f125732a, true);
        lv31VarEdit.m60054g();
        vd61 vd61Var = ufxVar.f229901X;
        String str = ufxVar.f229890M0.f151186a;
        boolean z = ufxVar.f229904Y0;
        LinkedHashMap linkedHashMap = vd61Var.f240343b;
        if (z) {
            ((wy3) vd61Var.f240342a).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object ud61Var = linkedHashMap.get(str);
            if (ud61Var == null) {
                ud61Var = new ud61(0, 0L);
                linkedHashMap.put(str, ud61Var);
            }
            ud61 ud61Var2 = (ud61) ud61Var;
            long j = ud61Var2.f229187b;
            int i = ud61Var2.f229186a;
            if (j != 0 && jCurrentTimeMillis - j >= 300000) {
                linkedHashMap.put(str, new ud61(0, jCurrentTimeMillis));
            } else if (i < 5) {
                linkedHashMap.put(str, new ud61(i + 1, jCurrentTimeMillis));
            } else {
                swipeRefreshLayout.setRefreshing(false);
            }
            jexVar.m53120l(Event.Refresh.INSTANCE);
            swipeRefreshLayout.setRefreshing(true);
        } else {
            swipeRefreshLayout.setRefreshing(false);
        }
        State state = (State) jexVar.f111687N0.mo33098e();
        if (state == null) {
            refreshToken = null;
        } else {
            State.Content content = state instanceof State.Content ? (State.Content) state : null;
            if (content != null) {
                refreshToken = content.getRefreshToken();
            } else {
                refreshToken = null;
            }
        }
        ebg0 ebg0Var = ufxVar.f229902X0;
        if (ebg0Var != null) {
            kv91 kv91Var = ufxVar.f229903Y;
            st91 st91VarMo24361d = ebg0Var.mo24361d();
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-pull-to-refresh-loader";
            yt91VarM50626j.f276052f = "2.0.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276051e = refreshToken;
            kv91Var.mo57453r(new av91("", "", new dv91("swipe", 1), new bv91("refresh_content", 1, nau.f152117a), yt91VarM50626j.m94607a(), st91VarMo24361d, System.currentTimeMillis()), null);
        }
    }
}
