package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d810 extends f810 {

    /* JADX INFO: renamed from: a */
    public final List f46329a;

    public d810(List list) {
        this.f46329a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d810) && wj50.m88271j(this.f46329a, ((d810) obj).f46329a);
    }

    public final int hashCode() {
        return this.f46329a.hashCode();
    }
}
