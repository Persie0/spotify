package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class h2d extends i2d {
    public static final Parcelable.Creator<h2d> CREATOR = new qvc(16);

    /* JADX INFO: renamed from: a */
    public final String f86953a;

    public h2d(String str) {
        this.f86953a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2d) && wj50.m88271j(this.f86953a, ((h2d) obj).f86953a);
    }

    public final int hashCode() {
        return this.f86953a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f86953a);
    }
}
