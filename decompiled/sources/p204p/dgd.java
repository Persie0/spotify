package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class dgd implements ggd {

    /* JADX INFO: renamed from: a */
    public final ArrayList f48780a;

    public dgd(ArrayList arrayList) {
        this.f48780a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgd) && this.f48780a.equals(((dgd) obj).f48780a);
    }

    public final int hashCode() {
        return this.f48780a.hashCode();
    }
}
