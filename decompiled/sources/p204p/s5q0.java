package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s5q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f205892a;

    public s5q0(ArrayList arrayList) {
        this.f205892a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5q0) && this.f205892a.equals(((s5q0) obj).f205892a);
    }

    public final int hashCode() {
        return this.f205892a.hashCode();
    }
}
