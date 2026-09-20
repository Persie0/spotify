package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wi11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f251486a;

    public wi11(ArrayList arrayList) {
        this.f251486a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m88182a() {
        return this.f251486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi11) && this.f251486a.equals(((wi11) obj).f251486a);
    }

    public final int hashCode() {
        return this.f251486a.hashCode();
    }
}
