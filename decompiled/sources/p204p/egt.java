package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class egt {

    /* JADX INFO: renamed from: a */
    public final ArrayList f59400a;

    public egt(ArrayList arrayList) {
        this.f59400a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egt) && this.f59400a.equals(((egt) obj).f59400a);
    }

    public final int hashCode() {
        return this.f59400a.hashCode();
    }
}
