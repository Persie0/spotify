package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class jq01 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f114763a;

    public jq01(ArrayList arrayList) {
        this.f114763a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq01) && this.f114763a.equals(((jq01) obj).f114763a);
    }

    public final int hashCode() {
        return this.f114763a.hashCode();
    }
}
