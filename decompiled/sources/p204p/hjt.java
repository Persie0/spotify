package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class hjt implements umt {

    /* JADX INFO: renamed from: a */
    public final Map f92252a;

    public hjt(Map map) {
        this.f92252a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjt) && wj50.m88271j(this.f92252a, ((hjt) obj).f92252a);
    }

    public final int hashCode() {
        return this.f92252a.hashCode();
    }
}
