package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class uzw implements s2x {

    /* JADX INFO: renamed from: a */
    public final int f235648a;

    /* JADX INFO: renamed from: b */
    public final List f235649b;

    public uzw(int i, List list) {
        this.f235648a = i;
        this.f235649b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzw)) {
            return false;
        }
        uzw uzwVar = (uzw) obj;
        return this.f235648a == uzwVar.f235648a && wj50.m88271j(this.f235649b, uzwVar.f235649b);
    }

    public final int hashCode() {
        return this.f235649b.hashCode() + (Integer.hashCode(this.f235648a) * 31);
    }
}
