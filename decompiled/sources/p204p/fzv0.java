package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class fzv0 {

    /* JADX INFO: renamed from: a */
    public final String f75187a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f75188b;

    public fzv0(String str, ArrayList arrayList) {
        this.f75187a = str;
        this.f75188b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzv0)) {
            return false;
        }
        fzv0 fzv0Var = (fzv0) obj;
        return wj50.m88271j(this.f75187a, fzv0Var.f75187a) && this.f75188b.equals(fzv0Var.f75188b);
    }

    public final int hashCode() {
        return this.f75188b.hashCode() + (this.f75187a.hashCode() * 31);
    }
}
