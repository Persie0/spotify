package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fje0 {

    /* JADX INFO: renamed from: a */
    public final Object f70207a;

    public fje0(List list) {
        this.f70207a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fje0) && this.f70207a.equals(((fje0) obj).f70207a);
    }

    public final int hashCode() {
        return this.f70207a.hashCode();
    }
}
