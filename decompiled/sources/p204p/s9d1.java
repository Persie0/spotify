package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class s9d1 {

    /* JADX INFO: renamed from: a */
    public final String f206929a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f206930b;

    /* JADX INFO: renamed from: c */
    public final rzd1 f206931c;

    public s9d1(String str, ArrayList arrayList, rzd1 rzd1Var) {
        this.f206929a = str;
        this.f206930b = arrayList;
        this.f206931c = rzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9d1)) {
            return false;
        }
        s9d1 s9d1Var = (s9d1) obj;
        return wj50.m88271j(this.f206929a, s9d1Var.f206929a) && this.f206930b.equals(s9d1Var.f206930b) && this.f206931c.equals(s9d1Var.f206931c);
    }

    public final int hashCode() {
        return this.f206931c.hashCode() + lq51.m59700f(this.f206930b, this.f206929a.hashCode() * 31, 31);
    }
}
