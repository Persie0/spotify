package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class km61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f124065a;

    public km61(ArrayList arrayList) {
        this.f124065a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km61) && this.f124065a.equals(((km61) obj).f124065a);
    }

    public final int hashCode() {
        return this.f124065a.hashCode();
    }
}
