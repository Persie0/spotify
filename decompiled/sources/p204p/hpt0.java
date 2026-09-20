package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class hpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final Map f93848a;

    public hpt0(Map map) {
        this.f93848a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpt0) && wj50.m88271j(this.f93848a, ((hpt0) obj).f93848a);
    }

    public final int hashCode() {
        return this.f93848a.hashCode();
    }
}
