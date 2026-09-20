package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class jhn0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f112535a;

    /* JADX INFO: renamed from: b */
    public final int f112536b;

    public jhn0(int i, ArrayList arrayList) {
        this.f112535a = arrayList;
        this.f112536b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhn0)) {
            return false;
        }
        jhn0 jhn0Var = (jhn0) obj;
        return this.f112535a.equals(jhn0Var.f112535a) && this.f112536b == jhn0Var.f112536b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f112536b) + (this.f112535a.hashCode() * 31);
    }
}
