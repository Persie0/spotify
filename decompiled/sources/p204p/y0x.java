package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y0x implements z0x {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f268098a;

    /* JADX INFO: renamed from: b */
    public final String f268099b;

    /* JADX INFO: renamed from: c */
    public final List f268100c;

    /* JADX INFO: renamed from: d */
    public final List f268101d;

    /* JADX INFO: renamed from: e */
    public final jk81 f268102e;

    public y0x(ContextTrack contextTrack, String str, List list, List list2, jk81 jk81Var) {
        this.f268098a = contextTrack;
        this.f268099b = str;
        this.f268100c = list;
        this.f268101d = list2;
        this.f268102e = jk81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0x)) {
            return false;
        }
        y0x y0xVar = (y0x) obj;
        return wj50.m88271j(this.f268098a, y0xVar.f268098a) && wj50.m88271j(this.f268099b, y0xVar.f268099b) && wj50.m88271j(this.f268100c, y0xVar.f268100c) && wj50.m88271j(this.f268101d, y0xVar.f268101d) && wj50.m88271j(this.f268102e, y0xVar.f268102e);
    }

    public final int hashCode() {
        int iHashCode = this.f268098a.hashCode() * 31;
        String str = this.f268099b;
        int iM77244c = s571.m77244c(s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f268100c), 31, this.f268101d);
        jk81 jk81Var = this.f268102e;
        return iM77244c + (jk81Var != null ? jk81Var.hashCode() : 0);
    }

    public /* synthetic */ y0x(ContextTrack contextTrack, List list) {
        this(contextTrack, null, list, lau.f131415a, null);
    }
}
