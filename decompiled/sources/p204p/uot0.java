package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class uot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f232519a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f232520b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f232521c;

    /* JADX INFO: renamed from: d */
    public final boolean f232522d;

    /* JADX INFO: renamed from: e */
    public final boolean f232523e;

    /* JADX INFO: renamed from: f */
    public final String f232524f;

    public uot0(ContextTrack contextTrack, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, String str) {
        this.f232519a = contextTrack;
        this.f232520b = arrayList;
        this.f232521c = arrayList2;
        this.f232522d = z;
        this.f232523e = z2;
        this.f232524f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uot0)) {
            return false;
        }
        uot0 uot0Var = (uot0) obj;
        return wj50.m88271j(this.f232519a, uot0Var.f232519a) && this.f232520b.equals(uot0Var.f232520b) && this.f232521c.equals(uot0Var.f232521c) && this.f232522d == uot0Var.f232522d && this.f232523e == uot0Var.f232523e && wj50.m88271j(this.f232524f, uot0Var.f232524f);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.f232519a;
        return this.f232524f.hashCode() + s571.m77245d(s571.m77245d(lq51.m59700f(this.f232521c, lq51.m59700f(this.f232520b, (contextTrack == null ? 0 : contextTrack.hashCode()) * 31, 31), 31), 31, this.f232522d), 31, this.f232523e);
    }
}
