package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class hd21 {

    /* JADX INFO: renamed from: a */
    public final vc41 f89973a;

    public hd21(vc41 vc41Var) {
        this.f89973a = vc41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd21) && this.f89973a == ((hd21) obj).f89973a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.light_mutedaccent_essential_subdued) + (this.f89973a.hashCode() * 31);
    }
}
