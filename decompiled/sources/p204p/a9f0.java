package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a9f0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13562a;

    public a9f0(ArrayList arrayList) {
        this.f13562a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9f0) && this.f13562a.equals(((a9f0) obj).f13562a);
    }

    public final int hashCode() {
        return this.f13562a.hashCode();
    }
}
