package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gt0 {

    /* JADX INFO: renamed from: a */
    public final kx0 f84056a;

    public gt0(kx0 kx0Var) {
        this.f84056a = kx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static l1p0 m45672a(ro0 ro0Var, jx0 jx0Var) {
        mec0 mec0Var = new mec0();
        mec0Var.put(ContextTrack.Metadata.KEY_AD_ID, ro0Var.mo29280c());
        mec0Var.put(ContextTrack.Metadata.KEY_IS_ADVERTISEMENT, "true");
        String str = jx0Var.f116751b;
        if (str != null) {
        }
        Long l = jx0Var.f116752c;
        if (l != null) {
        }
        mec0Var.put("ad_playback_id", ro0Var.mo29283j());
        return new l1p0(jx0Var.f116750a, 4, mec0Var.m61540b());
    }

    /* JADX INFO: renamed from: b */
    public final l1p0 m45673b(ro0 ro0Var, List list) {
        jx0 jx0VarM57577a = this.f84056a.m57577a(list);
        if (jx0VarM57577a == null) {
            return null;
        }
        return m45672a(ro0Var, jx0VarM57577a);
    }
}
