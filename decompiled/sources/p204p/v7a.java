package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class v7a extends dwg1 {

    /* JADX INFO: renamed from: b */
    public final ArrayList f238112b;

    public v7a(ArrayList arrayList) {
        this.f238112b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7a) && this.f238112b.equals(((v7a) obj).f238112b);
    }

    public final int hashCode() {
        return this.f238112b.hashCode();
    }
}
