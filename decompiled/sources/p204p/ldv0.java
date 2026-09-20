package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ldv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final Map f132357a;

    public ldv0(Map map) {
        this.f132357a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldv0) && wj50.m88271j(this.f132357a, ((ldv0) obj).f132357a);
    }

    public final int hashCode() {
        return this.f132357a.hashCode();
    }
}
