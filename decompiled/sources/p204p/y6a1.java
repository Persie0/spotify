package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class y6a1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f269716a;

    public y6a1(ArrayList arrayList) {
        this.f269716a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m92952a() {
        return this.f269716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6a1) && this.f269716a.equals(((y6a1) obj).f269716a);
    }

    public final int hashCode() {
        return this.f269716a.hashCode();
    }
}
