package p204p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;

/* JADX INFO: loaded from: classes8.dex */
public final class ni50 {

    /* JADX INFO: renamed from: a */
    public final BitrateLevel f154176a;

    /* JADX INFO: renamed from: b */
    public final BitrateLevel f154177b;

    /* JADX INFO: renamed from: c */
    public final BitrateStrategy f154178c;

    /* JADX INFO: renamed from: d */
    public final boolean f154179d;

    /* JADX INFO: renamed from: e */
    public final boolean f154180e;

    /* JADX INFO: renamed from: f */
    public final ngj0 f154181f;

    public ni50(BitrateLevel bitrateLevel, BitrateLevel bitrateLevel2, BitrateStrategy bitrateStrategy, boolean z, boolean z2, ngj0 ngj0Var) {
        this.f154176a = bitrateLevel;
        this.f154177b = bitrateLevel2;
        this.f154178c = bitrateStrategy;
        this.f154179d = z;
        this.f154180e = z2;
        this.f154181f = ngj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni50)) {
            return false;
        }
        ni50 ni50Var = (ni50) obj;
        return this.f154176a == ni50Var.f154176a && this.f154177b == ni50Var.f154177b && this.f154178c == ni50Var.f154178c && this.f154179d == ni50Var.f154179d && this.f154180e == ni50Var.f154180e && this.f154181f == ni50Var.f154181f;
    }

    public final int hashCode() {
        return this.f154181f.hashCode() + s571.m77245d(s571.m77245d((this.f154178c.hashCode() + ((this.f154177b.hashCode() + (this.f154176a.hashCode() * 31)) * 31)) * 31, 31, this.f154179d), 31, this.f154180e);
    }
}
