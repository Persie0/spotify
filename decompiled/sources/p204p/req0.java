package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class req0 {

    /* JADX INFO: renamed from: a */
    public final Map f198415a;

    public req0(Map map) {
        this.f198415a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof req0) && wj50.m88271j(this.f198415a, ((req0) obj).f198415a);
    }

    public final int hashCode() {
        return this.f198415a.hashCode();
    }
}
