package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class zk90 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f283687a;

    public zk90(ArrayList arrayList) {
        this.f283687a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk90) && this.f283687a.equals(((zk90) obj).f283687a);
    }

    public final int hashCode() {
        return this.f283687a.hashCode();
    }
}
