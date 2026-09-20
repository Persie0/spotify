package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class da51 {

    /* JADX INFO: renamed from: a */
    public final Object f46980a;

    public da51(List list) {
        this.f46980a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da51) && wj50.m88271j(this.f46980a, ((da51) obj).f46980a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.f46980a.hashCode() * 31);
    }
}
