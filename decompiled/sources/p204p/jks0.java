package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jks0 extends lks0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f113406a;

    /* JADX INFO: renamed from: b */
    public final String f113407b;

    public jks0(ArrayList arrayList, String str) {
        this.f113406a = arrayList;
        this.f113407b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jks0)) {
            return false;
        }
        jks0 jks0Var = (jks0) obj;
        return this.f113406a.equals(jks0Var.f113406a) && wj50.m88271j(this.f113407b, jks0Var.f113407b);
    }

    public final int hashCode() {
        int iHashCode = this.f113406a.hashCode() * 31;
        String str = this.f113407b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
