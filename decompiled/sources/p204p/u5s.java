package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u5s implements v5s {

    /* JADX INFO: renamed from: a */
    public final Map f227102a;

    public u5s(Map map) {
        this.f227102a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5s) && wj50.m88271j(this.f227102a, ((u5s) obj).f227102a);
    }

    public final int hashCode() {
        return this.f227102a.hashCode();
    }
}
