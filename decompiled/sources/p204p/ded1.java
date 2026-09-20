package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ded1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f48058a;

    public ded1(ArrayList arrayList) {
        this.f48058a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ded1) && this.f48058a.equals(((ded1) obj).f48058a);
    }

    public final int hashCode() {
        return this.f48058a.hashCode();
    }
}
