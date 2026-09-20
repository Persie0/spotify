package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ty51 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f224844a;

    public ty51(ArrayList arrayList) {
        this.f224844a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m81947a() {
        return this.f224844a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty51) && this.f224844a.equals(((ty51) obj).f224844a);
    }

    public final int hashCode() {
        return this.f224844a.hashCode();
    }
}
