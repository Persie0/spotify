package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class b52 implements Parcelable {
    public static final Parcelable.Creator<b52> CREATOR = new zt1(12);

    /* JADX INFO: renamed from: a */
    public final String f23492a;

    /* JADX INFO: renamed from: b */
    public final Bundle f23493b;

    public b52(String str, Bundle bundle) {
        this.f23492a = str;
        this.f23493b = bundle;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m28138c() {
        return this.f23493b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b52)) {
            return false;
        }
        b52 b52Var = (b52) obj;
        return wj50.m88271j(this.f23492a, b52Var.f23492a) && wj50.m88271j(this.f23493b, b52Var.f23493b);
    }

    /* JADX INFO: renamed from: g */
    public final String m28139g() {
        return this.f23492a;
    }

    public final int hashCode() {
        int iHashCode = this.f23492a.hashCode() * 31;
        Bundle bundle = this.f23493b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23492a);
        parcel.writeBundle(this.f23493b);
    }
}
