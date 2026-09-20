package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class s4c implements pa90 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f205556a;

    public s4c(ArrayList arrayList) {
        this.f205556a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4c) && this.f205556a.equals(((s4c) obj).f205556a);
    }

    public final int hashCode() {
        return this.f205556a.hashCode();
    }
}
