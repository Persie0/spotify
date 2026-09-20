package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class kjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f123381a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f123382b;

    public kjm0(ArrayList arrayList, gkm0 gkm0Var) {
        this.f123381a = arrayList;
        this.f123382b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjm0)) {
            return false;
        }
        kjm0 kjm0Var = (kjm0) obj;
        return this.f123381a.equals(kjm0Var.f123381a) && this.f123382b.equals(kjm0Var.f123382b);
    }

    public final int hashCode() {
        return this.f123382b.hashCode() + (this.f123381a.hashCode() * 31);
    }
}
