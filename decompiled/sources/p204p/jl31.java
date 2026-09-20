package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jl31 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f113477a;

    public jl31(ArrayList arrayList) {
        this.f113477a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl31) && this.f113477a.equals(((jl31) obj).f113477a);
    }

    public final int hashCode() {
        return this.f113477a.hashCode();
    }
}
