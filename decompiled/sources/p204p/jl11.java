package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jl11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f113461a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f113462b;

    public jl11(ArrayList arrayList, ArrayList arrayList2) {
        this.f113461a = arrayList;
        this.f113462b = arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final List m53645a() {
        return this.f113462b;
    }

    /* JADX INFO: renamed from: b */
    public final List m53646b() {
        return this.f113461a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl11)) {
            return false;
        }
        jl11 jl11Var = (jl11) obj;
        return this.f113461a.equals(jl11Var.f113461a) && this.f113462b.equals(jl11Var.f113462b);
    }

    public final int hashCode() {
        return this.f113462b.hashCode() + (this.f113461a.hashCode() * 31);
    }
}
