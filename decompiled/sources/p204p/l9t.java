package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class l9t implements n9t {

    /* JADX INFO: renamed from: a */
    public final List f131175a;

    public l9t(List list) {
        this.f131175a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9t) && wj50.m88271j(this.f131175a, ((l9t) obj).f131175a);
    }

    public final int hashCode() {
        return this.f131175a.hashCode();
    }
}
