package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class gjh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f80483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hjh0 f80484b;

    public gjh0(hjh0 hjh0Var, Integer num, String str, String str2) {
        this.f80484b = hjh0Var;
        yt91 yt91VarM96903c = hjh0Var.f92052a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("watch_feed_horizontal_item", null, num, str2, str));
        yt91VarM96903c.f276056j = false;
        this.f80483a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f80483a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m44945e(Integer num) {
        dv91 dv91Var = new dv91("double_hit", 1);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), this.f80483a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final av91 m44946h(Integer num, String str) {
        dv91 dv91Var = new dv91("long_hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("currently_played_item", string);
        String strValueOf = String.valueOf(num.intValue());
        return new av91("", "", dv91Var, new bv91("set_playback_speed", 1, kkc0.m56695h0(pqm0Var, new pqm0(ContextTrack.Metadata.KEY_PLAYBACK_SPEED, strValueOf != null ? strValueOf : ""))), this.f80483a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final fjh0 m44947i(String str, String str2, String str3) {
        return new fjh0(this, str, str2, str3);
    }
}
