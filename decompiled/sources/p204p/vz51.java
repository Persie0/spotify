package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vz51 implements xz51 {

    /* JADX INFO: renamed from: a */
    public final List f246398a;

    public vz51(List list) {
        this.f246398a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz51) && wj50.m88271j(this.f246398a, ((vz51) obj).f246398a);
    }

    public final int hashCode() {
        return this.f246398a.hashCode();
    }
}
