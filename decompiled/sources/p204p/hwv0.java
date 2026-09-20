package p204p;

import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class hwv0 {

    /* JADX INFO: renamed from: a */
    public final View f96063a;

    public hwv0(View view) {
        this.f96063a = view;
    }

    /* JADX INFO: renamed from: a */
    public final View m48950a() {
        return this.f96063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwv0) && wj50.m88271j(this.f96063a, ((hwv0) obj).f96063a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.dimen.tooltip_distance_from_view) + (this.f96063a.hashCode() * 31);
    }
}
