package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class efr {

    /* JADX INFO: renamed from: a */
    public final Map f59095a;

    public efr(Map map) {
        this.f59095a = map;
    }

    /* JADX INFO: renamed from: a */
    public final Map m38746a() {
        return this.f59095a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efr) && wj50.m88271j(this.f59095a, ((efr) obj).f59095a);
    }

    public final int hashCode() {
        return this.f59095a.hashCode();
    }
}
