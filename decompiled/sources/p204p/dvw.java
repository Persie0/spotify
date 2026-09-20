package p204p;

import com.spotify.home.evopage.mobius.Event;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dvw implements Event {

    /* JADX INFO: renamed from: a */
    public final List f53553a;

    /* JADX INFO: renamed from: b */
    public final boolean f53554b;

    /* JADX INFO: renamed from: c */
    public final i3a0 f53555c;

    /* JADX INFO: renamed from: d */
    public final String f53556d;

    public dvw(List list, boolean z, i3a0 i3a0Var, String str) {
        this.f53553a = list;
        this.f53554b = z;
        this.f53555c = i3a0Var;
        this.f53556d = str;
    }

    @Override // com.spotify.home.evopage.mobius.Event
    public final String breadcrumb() {
        return ikc0.m50939k("GotMoreHomeStructure: ", " sections, pageToken ", this.f53553a.size(), this.f53556d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvw)) {
            return false;
        }
        dvw dvwVar = (dvw) obj;
        return wj50.m88271j(this.f53553a, dvwVar.f53553a) && this.f53554b == dvwVar.f53554b && this.f53555c == dvwVar.f53555c && wj50.m88271j(this.f53556d, dvwVar.f53556d);
    }

    public final int hashCode() {
        return this.f53556d.hashCode() + ((this.f53555c.hashCode() + s571.m77245d(this.f53553a.hashCode() * 31, 31, this.f53554b)) * 31);
    }
}
