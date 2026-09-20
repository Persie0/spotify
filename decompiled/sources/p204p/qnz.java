package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class qnz extends ov50 {

    /* JADX INFO: renamed from: e */
    public final String f190719e;

    public qnz(String str) {
        super(R.string.fma_upsell_primary_cta_learn_more, 2);
        this.f190719e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnz) && wj50.m88271j(this.f190719e, ((qnz) obj).f190719e);
    }

    public final int hashCode() {
        return this.f190719e.hashCode();
    }
}
