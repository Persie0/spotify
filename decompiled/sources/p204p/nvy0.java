package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nvy0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f158980a;

    public nvy0(gh00 gh00Var) {
        this.f158980a = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvy0) && wj50.m88271j(this.f158980a, ((nvy0) obj).f158980a);
    }

    public final int hashCode() {
        return this.f158980a.hashCode() + (Integer.hashCode(R.string.chat_share_with_search_input_placeholder) * 31);
    }
}
