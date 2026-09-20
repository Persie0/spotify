package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class u46 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f226602a;

    public u46(ArrayList arrayList) {
        this.f226602a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u46) && this.f226602a.equals(((u46) obj).f226602a);
    }

    public final int hashCode() {
        return this.f226602a.hashCode();
    }
}
