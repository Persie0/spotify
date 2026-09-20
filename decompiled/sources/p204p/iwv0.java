package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class iwv0 extends u1h1 {

    /* JADX INFO: renamed from: b */
    public final int f106519b;

    public iwv0(int i) {
        this.f106519b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwv0) && this.f106519b == ((iwv0) obj).f106519b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.dimen.tooltip_distance_from_view) + (Integer.hashCode(this.f106519b) * 31);
    }
}
