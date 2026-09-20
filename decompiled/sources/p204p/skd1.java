package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class skd1 extends ptc {

    /* JADX INFO: renamed from: c */
    public final String f210080c;

    public skd1(String str) {
        super(str.concat("_reminder"), R.string.wear_onboarding_notification_forget);
        this.f210080c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skd1) && wj50.m88271j(this.f210080c, ((skd1) obj).f210080c);
    }

    public final int hashCode() {
        return this.f210080c.hashCode();
    }
}
