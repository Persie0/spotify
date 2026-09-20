package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class n631 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f150676a;

    public n631(ArrayList arrayList) {
        this.f150676a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n631) && this.f150676a.equals(((n631) obj).f150676a);
    }

    public final int hashCode() {
        return this.f150676a.hashCode();
    }
}
