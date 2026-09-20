package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class oco0 implements qco0 {
    public static final Parcelable.Creator<oco0> CREATOR = new o2o0(16);

    /* JADX INFO: renamed from: a */
    public final String f163968a;

    public oco0(String str) {
        this.f163968a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oco0) && wj50.m88271j(this.f163968a, ((oco0) obj).f163968a);
    }

    public final int hashCode() {
        return this.f163968a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f163968a);
    }
}
