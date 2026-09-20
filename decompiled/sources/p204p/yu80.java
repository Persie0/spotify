package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class yu80 extends av80 {

    /* JADX INFO: renamed from: a */
    public final List f276287a;

    public yu80(List list) {
        this.f276287a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu80) && wj50.m88271j(this.f276287a, ((yu80) obj).f276287a);
    }

    public final int hashCode() {
        return this.f276287a.hashCode();
    }
}
