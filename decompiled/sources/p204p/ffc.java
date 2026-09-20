package p204p;

import com.spotify.notifications.models.preferences.Item$Preference;

/* JADX INFO: loaded from: classes8.dex */
public final class ffc extends jfc {

    /* JADX INFO: renamed from: a */
    public final int f68965a;

    /* JADX INFO: renamed from: b */
    public final kmc f68966b;

    /* JADX INFO: renamed from: c */
    public final boolean f68967c;

    /* JADX INFO: renamed from: d */
    public final Item$Preference f68968d;

    public ffc(int i, Item$Preference item$Preference, kmc kmcVar, boolean z) {
        this.f68965a = i;
        this.f68966b = kmcVar;
        this.f68967c = z;
        this.f68968d = item$Preference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffc)) {
            return false;
        }
        ffc ffcVar = (ffc) obj;
        return this.f68965a == ffcVar.f68965a && this.f68966b == ffcVar.f68966b && this.f68967c == ffcVar.f68967c && wj50.m88271j(this.f68968d, ffcVar.f68968d);
    }

    public final int hashCode() {
        return this.f68968d.hashCode() + s571.m77245d((this.f68966b.hashCode() + (Integer.hashCode(this.f68965a) * 31)) * 31, 31, this.f68967c);
    }
}
