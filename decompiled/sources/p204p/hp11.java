package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class hp11 extends ip11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f93677a;

    public hp11(ArrayList arrayList) {
        this.f93677a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp11) && this.f93677a.equals(((hp11) obj).f93677a);
    }

    public final int hashCode() {
        return this.f93677a.hashCode();
    }
}
