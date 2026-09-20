package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mg71 {

    /* JADX INFO: renamed from: a */
    public final List f143359a;

    public mg71(List list) {
        this.f143359a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg71) && wj50.m88271j(this.f143359a, ((mg71) obj).f143359a);
    }

    public final int hashCode() {
        return this.f143359a.hashCode();
    }
}
