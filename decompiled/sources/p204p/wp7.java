package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wp7 {

    /* JADX INFO: renamed from: a */
    public final String f253691a;

    public wp7(String str) {
        this.f253691a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp7) && wj50.m88271j(this.f253691a, ((wp7) obj).f253691a);
    }

    public final int hashCode() {
        return this.f253691a.hashCode() + mt60.m62800g(R.string.applink_offline_error_description, zew.f282137f.hashCode() * 31, 31);
    }
}
