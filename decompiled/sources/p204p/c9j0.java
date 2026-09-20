package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class c9j0 implements f9j0 {

    /* JADX INFO: renamed from: a */
    public final Map f35577a;

    public c9j0(Map map) {
        this.f35577a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9j0) && wj50.m88271j(this.f35577a, ((c9j0) obj).f35577a);
    }

    public final int hashCode() {
        return this.f35577a.hashCode();
    }
}
