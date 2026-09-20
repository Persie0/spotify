package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class s990 implements v990 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f206888a;

    public s990(ArrayList arrayList) {
        this.f206888a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s990) && this.f206888a.equals(((s990) obj).f206888a);
    }

    public final int hashCode() {
        return this.f206888a.hashCode();
    }
}
