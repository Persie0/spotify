package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class f92 implements g92 {
    public static final Parcelable.Creator<f92> CREATOR = new zt1(22);

    /* JADX INFO: renamed from: a */
    public final String f67153a;

    /* JADX INFO: renamed from: b */
    public final Bundle f67154b;

    public f92(String str, Bundle bundle) {
        this.f67153a = str;
        this.f67154b = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f92)) {
            return false;
        }
        f92 f92Var = (f92) obj;
        return wj50.m88271j(this.f67153a, f92Var.f67153a) && wj50.m88271j(this.f67154b, f92Var.f67154b);
    }

    public final int hashCode() {
        int iHashCode = this.f67153a.hashCode() * 31;
        Bundle bundle = this.f67154b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f67153a);
        parcel.writeBundle(this.f67154b);
    }
}
