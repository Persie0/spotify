package p204p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: classes6.dex */
public final class y6r0 extends c7r0 {

    /* JADX INFO: renamed from: a */
    public final PlayabilityRestriction f269893a;

    public y6r0(PlayabilityRestriction playabilityRestriction) {
        this.f269893a = playabilityRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6r0) && this.f269893a == ((y6r0) obj).f269893a;
    }

    public final int hashCode() {
        return this.f269893a.hashCode();
    }
}
