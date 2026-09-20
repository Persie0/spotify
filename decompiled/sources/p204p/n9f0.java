package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class n9f0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f151790a;

    public n9f0(ArrayList arrayList) {
        this.f151790a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9f0) && this.f151790a.equals(((n9f0) obj).f151790a);
    }

    public final int hashCode() {
        return this.f151790a.hashCode();
    }
}
