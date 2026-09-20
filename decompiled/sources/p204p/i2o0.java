package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class i2o0 implements Parcelable {
    public static final Parcelable.Creator<i2o0> CREATOR = new ejn0(25);

    /* JADX INFO: renamed from: a */
    public final String f97902a;

    /* JADX INFO: renamed from: b */
    public final String f97903b;

    public i2o0(String str, String str2) {
        this.f97902a = str;
        this.f97903b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2o0)) {
            return false;
        }
        i2o0 i2o0Var = (i2o0) obj;
        return wj50.m88271j(this.f97902a, i2o0Var.f97902a) && wj50.m88271j(this.f97903b, i2o0Var.f97903b);
    }

    public final int hashCode() {
        int iHashCode = this.f97902a.hashCode() * 31;
        String str = this.f97903b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f97902a);
        parcel.writeString(this.f97903b);
    }
}
