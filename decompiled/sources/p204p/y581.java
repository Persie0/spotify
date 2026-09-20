package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class y581 {

    /* JADX INFO: renamed from: a */
    public final Object f269374a;

    public y581(List list) {
        this.f269374a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y581) && this.f269374a.equals(((y581) obj).f269374a);
    }

    public final int hashCode() {
        return this.f269374a.hashCode();
    }
}
