package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class kim0 extends mim0 {

    /* JADX INFO: renamed from: b */
    public final ArrayList f123017b;

    public kim0(ArrayList arrayList) {
        super(arrayList);
        this.f123017b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kim0) && this.f123017b.equals(((kim0) obj).f123017b);
    }

    @Override // p204p.i040
    public final /* bridge */ /* synthetic */ String getId() {
        return "FindInShowLoadedItems";
    }

    public final int hashCode() {
        return this.f123017b.hashCode();
    }
}
