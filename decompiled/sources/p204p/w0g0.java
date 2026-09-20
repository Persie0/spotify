package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class w0g0 extends d1g0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f246733a;

    /* JADX INFO: renamed from: b */
    public final String f246734b;

    public w0g0(ArrayList arrayList, String str) {
        this.f246733a = arrayList;
        this.f246734b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0g0)) {
            return false;
        }
        w0g0 w0g0Var = (w0g0) obj;
        return this.f246733a.equals(w0g0Var.f246733a) && this.f246734b.equals(w0g0Var.f246734b);
    }

    public final int hashCode() {
        return this.f246734b.hashCode() + (this.f246733a.hashCode() * 31);
    }
}
