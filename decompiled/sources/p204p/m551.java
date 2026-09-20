package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m551 {

    /* JADX INFO: renamed from: a */
    public final List f140147a;

    public m551(List list) {
        this.f140147a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m551) && wj50.m88271j(this.f140147a, ((m551) obj).f140147a);
    }

    public final int hashCode() {
        return this.f140147a.hashCode();
    }
}
