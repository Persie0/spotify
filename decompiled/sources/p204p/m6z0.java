package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class m6z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f140601a;

    public m6z0(ArrayList arrayList) {
        this.f140601a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6z0) && this.f140601a.equals(((m6z0) obj).f140601a);
    }

    public final int hashCode() {
        return this.f140601a.hashCode();
    }
}
