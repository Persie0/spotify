package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rev0 implements Parcelable {
    public static final Parcelable.Creator<rev0> CREATOR = new h1v0(10);

    /* JADX INFO: renamed from: a */
    public final String f198440a;

    public rev0(String str) {
        this.f198440a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rev0) && wj50.m88271j(this.f198440a, ((rev0) obj).f198440a);
    }

    public final int hashCode() {
        return this.f198440a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198440a);
    }
}
