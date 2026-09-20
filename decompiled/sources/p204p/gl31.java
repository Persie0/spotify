package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gl31 {

    /* JADX INFO: renamed from: a */
    public final String f80987a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f80988b;

    public gl31(String str, ArrayList arrayList) {
        this.f80987a = str;
        this.f80988b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl31)) {
            return false;
        }
        gl31 gl31Var = (gl31) obj;
        return wj50.m88271j(this.f80987a, gl31Var.f80987a) && this.f80988b.equals(gl31Var.f80988b);
    }

    public final int hashCode() {
        return this.f80988b.hashCode() + (this.f80987a.hashCode() * 31);
    }
}
