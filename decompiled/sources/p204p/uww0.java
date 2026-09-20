package p204p;

import com.spotify.localfiles.localfilesmonorepo.AudioMimeMatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class uww0 implements vww0 {

    /* JADX INFO: renamed from: a */
    public final o2d0 f234744a;

    public uww0(AudioMimeMatcher audioMimeMatcher) {
        this.f234744a = audioMimeMatcher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uww0) && wj50.m88271j(this.f234744a, ((uww0) obj).f234744a);
    }

    public final int hashCode() {
        return this.f234744a.hashCode() + 137387607;
    }
}
