package p204p;

import com.spotify.notifications.models.preferences.Item$Group;

/* JADX INFO: loaded from: classes8.dex */
public final class bgc extends egc {

    /* JADX INFO: renamed from: a */
    public final Item$Group f26905a;

    public bgc(Item$Group item$Group) {
        this.f26905a = item$Group;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgc) && wj50.m88271j(this.f26905a, ((bgc) obj).f26905a);
    }

    public final int hashCode() {
        return this.f26905a.hashCode();
    }
}
