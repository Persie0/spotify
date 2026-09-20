package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class iii0 {

    /* JADX INFO: renamed from: a */
    public final String f102593a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f102594b;

    public iii0(String str, ArrayList arrayList) {
        this.f102593a = str;
        this.f102594b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iii0)) {
            return false;
        }
        iii0 iii0Var = (iii0) obj;
        return this.f102593a.equals(iii0Var.f102593a) && this.f102594b.equals(iii0Var.f102594b);
    }

    public final int hashCode() {
        return this.f102594b.hashCode() + (this.f102593a.hashCode() * 31);
    }
}
