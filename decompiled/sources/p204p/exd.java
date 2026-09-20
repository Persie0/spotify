package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class exd implements hxd {

    /* JADX INFO: renamed from: a */
    public final List f63741a;

    public exd(List list) {
        this.f63741a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exd) && wj50.m88271j(this.f63741a, ((exd) obj).f63741a);
    }

    public final int hashCode() {
        return this.f63741a.hashCode();
    }
}
