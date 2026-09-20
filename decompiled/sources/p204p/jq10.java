package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class jq10 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f114764a;

    public jq10(ArrayList arrayList) {
        this.f114764a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq10) && this.f114764a.equals(((jq10) obj).f114764a);
    }

    public final int hashCode() {
        return this.f114764a.hashCode();
    }
}
