package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bj00 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f27582a;

    public bj00(ArrayList arrayList) {
        this.f27582a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj00) && this.f27582a.equals(((bj00) obj).f27582a);
    }

    public final int hashCode() {
        return this.f27582a.hashCode();
    }

    public final String toString() {
        return this.f27582a.toString();
    }
}
