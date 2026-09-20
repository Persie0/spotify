package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xyt0 implements Parcelable {
    public static final Parcelable.Creator<xyt0> CREATOR = new vit0(20);

    /* JADX INFO: renamed from: a */
    public final String f267418a;

    public xyt0(String str) {
        this.f267418a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyt0) && wj50.m88271j(this.f267418a, ((xyt0) obj).f267418a);
    }

    public final int hashCode() {
        return this.f267418a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f267418a);
    }
}
