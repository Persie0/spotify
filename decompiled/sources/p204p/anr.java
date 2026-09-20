package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class anr extends pnr {

    /* JADX INFO: renamed from: a */
    public final Object f17485a;

    public anr(List list) {
        this.f17485a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anr) && this.f17485a.equals(((anr) obj).f17485a);
    }

    public final int hashCode() {
        return this.f17485a.hashCode();
    }
}
