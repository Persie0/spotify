package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ed90 implements fd90 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f58490a;

    public ed90(ArrayList arrayList) {
        this.f58490a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed90) && this.f58490a.equals(((ed90) obj).f58490a);
    }

    public final int hashCode() {
        return this.f58490a.hashCode();
    }
}
