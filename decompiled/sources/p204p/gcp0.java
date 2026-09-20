package p204p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import com.spotify.player.model.HiFiStatus;

/* JADX INFO: loaded from: classes8.dex */
public final class gcp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f78633a;

    /* JADX INFO: renamed from: b */
    public final BitrateLevel f78634b;

    /* JADX INFO: renamed from: c */
    public final BitrateLevel f78635c;

    /* JADX INFO: renamed from: d */
    public final boolean f78636d;

    /* JADX INFO: renamed from: e */
    public final BitrateStrategy f78637e;

    /* JADX INFO: renamed from: f */
    public final HiFiStatus f78638f;

    public gcp0(boolean z, BitrateLevel bitrateLevel, BitrateLevel bitrateLevel2, boolean z2, BitrateStrategy bitrateStrategy, HiFiStatus hiFiStatus) {
        this.f78633a = z;
        this.f78634b = bitrateLevel;
        this.f78635c = bitrateLevel2;
        this.f78636d = z2;
        this.f78637e = bitrateStrategy;
        this.f78638f = hiFiStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcp0)) {
            return false;
        }
        gcp0 gcp0Var = (gcp0) obj;
        return this.f78633a == gcp0Var.f78633a && this.f78634b == gcp0Var.f78634b && this.f78635c == gcp0Var.f78635c && this.f78636d == gcp0Var.f78636d && this.f78637e == gcp0Var.f78637e && this.f78638f == gcp0Var.f78638f;
    }

    public final int hashCode() {
        return this.f78638f.hashCode() + ((this.f78637e.hashCode() + s571.m77245d((this.f78635c.hashCode() + ((this.f78634b.hashCode() + (Boolean.hashCode(this.f78633a) * 31)) * 31)) * 31, 31, this.f78636d)) * 31);
    }
}
