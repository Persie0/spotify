package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ktp {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f126371a;

    /* JADX INFO: renamed from: b */
    public final ae50 f126372b;

    public ktp(LinkedHashMap linkedHashMap, ae50 ae50Var) {
        this.f126371a = linkedHashMap;
        this.f126372b = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktp)) {
            return false;
        }
        ktp ktpVar = (ktp) obj;
        return this.f126371a.equals(ktpVar.f126371a) && this.f126372b.equals(ktpVar.f126372b);
    }

    public final int hashCode() {
        return this.f126372b.hashCode() + (this.f126371a.hashCode() * 31);
    }
}
