package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rgl implements chl {

    /* JADX INFO: renamed from: a */
    public final Map f198973a;

    public rgl(Map map) {
        this.f198973a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgl) && wj50.m88271j(this.f198973a, ((rgl) obj).f198973a);
    }

    public final int hashCode() {
        return this.f198973a.hashCode();
    }
}
