package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class das {

    /* JADX INFO: renamed from: a */
    public final boolean f47098a;

    /* JADX INFO: renamed from: b */
    public final boolean f47099b;

    /* JADX INFO: renamed from: c */
    public final List f47100c;

    public das(List list, boolean z, boolean z2) {
        this.f47098a = z;
        this.f47099b = z2;
        this.f47100c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof das)) {
            return false;
        }
        das dasVar = (das) obj;
        return this.f47098a == dasVar.f47098a && this.f47099b == dasVar.f47099b && wj50.m88271j(this.f47100c, dasVar.f47100c);
    }

    public final int hashCode() {
        return this.f47100c.hashCode() + s571.m77245d(Boolean.hashCode(this.f47098a) * 31, 31, this.f47099b);
    }
}
