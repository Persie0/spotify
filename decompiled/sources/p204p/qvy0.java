package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qvy0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f193140a;

    public qvy0(gh00 gh00Var) {
        this.f193140a = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvy0) && wj50.m88271j(this.f193140a, ((qvy0) obj).f193140a);
    }

    public final int hashCode() {
        return this.f193140a.hashCode() + (Integer.hashCode(R.string.add_friends_search_placeholder) * 31);
    }
}
