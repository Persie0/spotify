package p204p;

import com.spotify.notifications.models.preferences.Item$Preference;

/* JADX INFO: loaded from: classes8.dex */
public final class cgc extends egc {

    /* JADX INFO: renamed from: a */
    public final Item$Preference f37636a;

    public cgc(Item$Preference item$Preference) {
        this.f37636a = item$Preference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgc) && wj50.m88271j(this.f37636a, ((cgc) obj).f37636a);
    }

    public final int hashCode() {
        return this.f37636a.hashCode();
    }
}
