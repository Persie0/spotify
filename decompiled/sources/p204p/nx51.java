package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nx51 {

    /* JADX INFO: renamed from: a */
    public final Object f159374a;

    public nx51(List list) {
        this.f159374a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx51) && this.f159374a.equals(((nx51) obj).f159374a);
    }

    public final int hashCode() {
        return this.f159374a.hashCode();
    }
}
