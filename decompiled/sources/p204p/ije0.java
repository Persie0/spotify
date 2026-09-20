package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ije0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f102797a;

    public ije0(ArrayList arrayList) {
        this.f102797a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ije0) && this.f102797a.equals(((ije0) obj).f102797a);
    }

    public final int hashCode() {
        return this.f102797a.hashCode();
    }
}
