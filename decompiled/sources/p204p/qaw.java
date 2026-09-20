package p204p;

import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class qaw {

    /* JADX INFO: renamed from: c */
    public static final PlaylistRequestDecorationPolicy f186944c;

    /* JADX INFO: renamed from: a */
    public final wt80 f186945a;

    /* JADX INFO: renamed from: b */
    public final aq51 f186946b;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26440v();
        top0VarM18421v.m81214v(amp0VarM18396H);
        f186944c = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public qaw(wt80 wt80Var, aq51 aq51Var) {
        this.f186945a = wt80Var;
        this.f186946b = aq51Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m72476a(String str, ibk ibkVar) {
        paw pawVar;
        Map map;
        if (ibkVar instanceof paw) {
            pawVar = (paw) ibkVar;
            int i = pawVar.f175637c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pawVar.f175637c = i - Integer.MIN_VALUE;
            } else {
                pawVar = new paw(this, ibkVar);
            }
        } else {
            pawVar = new paw(this, ibkVar);
        }
        Object objM62843h = pawVar.f175635a;
        int i2 = pawVar.f175637c;
        if (i2 == 0) {
            bga.m29073P(objM62843h);
            String strMo48710e = this.f186946b.f18088a.mo48710e(bq51.m30182a(), null);
            String strConcat = strMo48710e != null ? "spotify:show:".concat(strMo48710e) : null;
            if (strConcat != null) {
                pawVar.f175637c = 1;
                objM62843h = ((mu80) this.f186945a).m62843h(strConcat, str, f186944c, pawVar);
                yuk yukVar = yuk.f276404a;
                if (objM62843h == yukVar) {
                    return yukVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM62843h);
        p2x0 p2x0Var = (p2x0) objM62843h;
        nw80 nw80Var = p2x0Var != null ? (nw80) p2x0Var.m68970c() : null;
        if (nw80Var != null && (map = nw80Var.f159053g) != null) {
            return (String) map.get("episode_uri");
        }
        return null;
    }
}
