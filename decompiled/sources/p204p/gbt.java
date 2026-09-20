package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class gbt {

    /* JADX INFO: renamed from: a */
    public final Object f78381a;

    public gbt(List list) {
        this.f78381a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbt) && this.f78381a.equals(((gbt) obj).f78381a);
    }

    public final int hashCode() {
        return this.f78381a.hashCode();
    }
}
