package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class rkd1 extends ptc {

    /* JADX INFO: renamed from: c */
    public final String f200056c;

    public rkd1(String str) {
        super(str.concat("_first_time"), R.string.wear_onboarding_notification_remind);
        this.f200056c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkd1) && wj50.m88271j(this.f200056c, ((rkd1) obj).f200056c);
    }

    public final int hashCode() {
        return this.f200056c.hashCode();
    }
}
