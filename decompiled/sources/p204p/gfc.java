package p204p;

import com.spotify.notifications.models.preferences.Item$Preference;

/* JADX INFO: loaded from: classes8.dex */
public final class gfc extends ifc {

    /* JADX INFO: renamed from: a */
    public final kmc f79324a;

    /* JADX INFO: renamed from: b */
    public final boolean f79325b;

    /* JADX INFO: renamed from: c */
    public final Item$Preference f79326c;

    public gfc(kmc kmcVar, boolean z, Item$Preference item$Preference) {
        this.f79324a = kmcVar;
        this.f79325b = z;
        this.f79326c = item$Preference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfc)) {
            return false;
        }
        gfc gfcVar = (gfc) obj;
        return this.f79324a == gfcVar.f79324a && this.f79325b == gfcVar.f79325b && wj50.m88271j(this.f79326c, gfcVar.f79326c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f79324a.hashCode() * 31, 31, this.f79325b);
        Item$Preference item$Preference = this.f79326c;
        return iM77245d + (item$Preference == null ? 0 : item$Preference.hashCode());
    }
}
