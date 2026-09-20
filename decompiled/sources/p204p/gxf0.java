package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class gxf0 {

    /* JADX INFO: renamed from: a */
    public final Map f85283a;

    public gxf0(Map map) {
        this.f85283a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxf0) && wj50.m88271j(this.f85283a, ((gxf0) obj).f85283a);
    }

    public final int hashCode() {
        return this.f85283a.hashCode();
    }
}
