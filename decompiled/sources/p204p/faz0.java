package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class faz0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f67675a;

    /* JADX INFO: renamed from: b */
    public final String f67676b;

    public faz0(ArrayList arrayList, String str) {
        this.f67675a = arrayList;
        this.f67676b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faz0)) {
            return false;
        }
        faz0 faz0Var = (faz0) obj;
        return this.f67675a.equals(faz0Var.f67675a) && this.f67676b.equals(faz0Var.f67676b);
    }

    public final int hashCode() {
        return this.f67676b.hashCode() + (this.f67675a.hashCode() * 31);
    }
}
