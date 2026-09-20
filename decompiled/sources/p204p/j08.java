package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j08 extends b4l {

    /* JADX INFO: renamed from: a */
    public final List f107381a;

    public j08(List list) {
        this.f107381a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b4l)) {
            return false;
        }
        return this.f107381a.equals(((j08) ((b4l) obj)).f107381a);
    }

    public final int hashCode() {
        return this.f107381a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f107381a + "}";
    }
}
