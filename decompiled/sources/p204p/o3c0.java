package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class o3c0 implements Parcelable {
    public static final Parcelable.Creator<o3c0> CREATOR = new apb0(28);

    /* JADX INFO: renamed from: a */
    public final String f161339a;

    public o3c0(String str) {
        this.f161339a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m66189c() {
        return this.f161339a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3c0) && wj50.m88271j(this.f161339a, ((o3c0) obj).f161339a);
    }

    public final int hashCode() {
        return this.f161339a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161339a);
    }
}
