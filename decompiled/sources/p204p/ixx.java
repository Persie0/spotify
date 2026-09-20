package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ixx extends kxx {

    /* JADX INFO: renamed from: a */
    public final String f106783a;

    /* JADX INFO: renamed from: b */
    public final String f106784b;

    public ixx(String str, String str2) {
        this.f106783a = str;
        this.f106784b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixx)) {
            return false;
        }
        ixx ixxVar = (ixx) obj;
        return wj50.m88271j(this.f106783a, ixxVar.f106783a) && wj50.m88271j(this.f106784b, ixxVar.f106784b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.encore_icon_play) + s571.m77243b(this.f106783a.hashCode() * 961, 31, this.f106784b);
    }
}
