package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xij0 implements Parcelable {
    public static final Parcelable.Creator<xij0> CREATOR = new fgj0(2);

    /* JADX INFO: renamed from: a */
    public final String f261884a;

    /* JADX INFO: renamed from: b */
    public final Bundle f261885b;

    public xij0(String str, Bundle bundle) {
        this.f261884a = str;
        this.f261885b = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xij0)) {
            return false;
        }
        xij0 xij0Var = (xij0) obj;
        return wj50.m88271j(this.f261884a, xij0Var.f261884a) && wj50.m88271j(this.f261885b, xij0Var.f261885b);
    }

    public final int hashCode() {
        return this.f261885b.hashCode() + (this.f261884a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f261884a);
        parcel.writeBundle(this.f261885b);
    }
}
