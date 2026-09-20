package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class lim0 extends mim0 {

    /* JADX INFO: renamed from: b */
    public final ArrayList f133822b;

    public lim0(ArrayList arrayList) {
        super(arrayList);
        this.f133822b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lim0) && this.f133822b.equals(((lim0) obj).f133822b);
    }

    @Override // p204p.i040
    public final /* bridge */ /* synthetic */ String getId() {
        return "FindInShowPlaceholders";
    }

    public final int hashCode() {
        return this.f133822b.hashCode();
    }
}
