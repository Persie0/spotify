package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class tc0 {
    public final boolean equals(Object obj) {
        Object objValueOf = Integer.valueOf(R.drawable.app_logo_waze);
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc0) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return ((Integer.valueOf(R.drawable.app_logo_waze).hashCode() + (Integer.hashCode(R.string.maps_back_banner_header_waze) * 961)) * 31) + 2657141;
    }
}
