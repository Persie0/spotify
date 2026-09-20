package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class he7 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f90337a;

    public he7(ArrayList arrayList) {
        this.f90337a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he7) && this.f90337a.equals(((he7) obj).f90337a);
    }

    public final int hashCode() {
        return this.f90337a.hashCode();
    }
}
