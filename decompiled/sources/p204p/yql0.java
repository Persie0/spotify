package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yql0 {

    /* JADX INFO: renamed from: a */
    public final Map f275260a;

    public yql0(Map map) {
        this.f275260a = map;
    }

    /* JADX INFO: renamed from: a */
    public final Map m94389a() {
        return this.f275260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yql0) && wj50.m88271j(this.f275260a, ((yql0) obj).f275260a);
    }

    public final int hashCode() {
        return this.f275260a.hashCode();
    }
}
