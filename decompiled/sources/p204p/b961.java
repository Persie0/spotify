package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b961 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f24784a;

    /* JADX INFO: renamed from: b */
    public final fb61 f24785b;

    public b961(ArrayList arrayList, fb61 fb61Var) {
        this.f24784a = arrayList;
        this.f24785b = fb61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b961)) {
            return false;
        }
        b961 b961Var = (b961) obj;
        return this.f24784a.equals(b961Var.f24784a) && this.f24785b.equals(b961Var.f24785b);
    }

    public final int hashCode() {
        return this.f24785b.hashCode() + (this.f24784a.hashCode() * 31);
    }
}
