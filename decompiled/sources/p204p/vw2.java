package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vw2 {

    /* JADX INFO: renamed from: a */
    public final List f245380a;

    public vw2(List list) {
        this.f245380a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw2) && wj50.m88271j(this.f245380a, ((vw2) obj).f245380a);
    }

    public final int hashCode() {
        return this.f245380a.hashCode();
    }
}
