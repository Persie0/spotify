package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pd81 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f176387a;

    public pd81(ArrayList arrayList) {
        this.f176387a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd81) && this.f176387a.equals(((pd81) obj).f176387a);
    }

    public final int hashCode() {
        return this.f176387a.hashCode();
    }
}
