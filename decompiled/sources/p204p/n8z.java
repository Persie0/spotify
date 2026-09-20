package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class n8z extends t8z {

    /* JADX INFO: renamed from: a */
    public final Map f151664a;

    public n8z(Map map) {
        this.f151664a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8z) && wj50.m88271j(this.f151664a, ((n8z) obj).f151664a);
    }

    public final int hashCode() {
        return this.f151664a.hashCode();
    }
}
