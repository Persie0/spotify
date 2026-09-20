package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rql {

    /* JADX INFO: renamed from: a */
    public final Map f201842a;

    public rql(Map map) {
        this.f201842a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rql) && wj50.m88271j(this.f201842a, ((rql) obj).f201842a);
    }

    public final int hashCode() {
        return this.f201842a.hashCode();
    }
}
