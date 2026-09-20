package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class kgi0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f122404a;

    public kgi0(ArrayList arrayList) {
        this.f122404a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgi0) && this.f122404a.equals(((kgi0) obj).f122404a);
    }

    public final int hashCode() {
        return this.f122404a.hashCode();
    }
}
