package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class xfd1 {

    /* JADX INFO: renamed from: a */
    public final String f260929a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f260930b;

    public xfd1(String str, ArrayList arrayList) {
        this.f260929a = str;
        this.f260930b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfd1)) {
            return false;
        }
        xfd1 xfd1Var = (xfd1) obj;
        return wj50.m88271j(this.f260929a, xfd1Var.f260929a) && this.f260930b.equals(xfd1Var.f260930b);
    }

    public final int hashCode() {
        return this.f260930b.hashCode() + (this.f260929a.hashCode() * 31);
    }
}
