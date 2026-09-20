package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class hpx {

    /* JADX INFO: renamed from: a */
    public final Map f93852a;

    public hpx(Map map) {
        this.f93852a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpx) && wj50.m88271j(this.f93852a, ((hpx) obj).f93852a);
    }

    public final int hashCode() {
        return this.f93852a.hashCode();
    }
}
