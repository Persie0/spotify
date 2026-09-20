package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class cd71 {

    /* JADX INFO: renamed from: a */
    public final cw40 f36824a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f36825b;

    public cd71(cw40 cw40Var, ArrayList arrayList) {
        this.f36824a = cw40Var;
        this.f36825b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd71)) {
            return false;
        }
        cd71 cd71Var = (cd71) obj;
        return this.f36824a.equals(cd71Var.f36824a) && this.f36825b.equals(cd71Var.f36825b);
    }

    public final int hashCode() {
        return this.f36825b.hashCode() + (this.f36824a.hashCode() * 31);
    }
}
