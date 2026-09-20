package p204p;

import android.os.Bundle;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes11.dex */
public final class e4o0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f56119a;

    /* JADX INFO: renamed from: b */
    public final Bundle f56120b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f56121c;

    public e4o0(Bundle bundle, Bundle bundle2, SparseArray sparseArray) {
        this.f56119a = bundle;
        this.f56120b = bundle2;
        this.f56121c = sparseArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4o0)) {
            return false;
        }
        e4o0 e4o0Var = (e4o0) obj;
        return wj50.m88271j(this.f56119a, e4o0Var.f56119a) && wj50.m88271j(this.f56120b, e4o0Var.f56120b) && wj50.m88271j(this.f56121c, e4o0Var.f56121c);
    }

    public final int hashCode() {
        Bundle bundle = this.f56119a;
        int iHashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        Bundle bundle2 = this.f56120b;
        int iHashCode2 = (iHashCode + (bundle2 == null ? 0 : bundle2.hashCode())) * 31;
        SparseArray sparseArray = this.f56121c;
        return iHashCode2 + (sparseArray != null ? sparseArray.hashCode() : 0);
    }
}
