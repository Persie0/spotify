package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mdc1 implements Parcelable {
    public static final Parcelable.Creator<mdc1> CREATOR = new c8b1(28);

    /* JADX INFO: renamed from: a */
    public final String f142375a;

    public mdc1(String str) {
        this.f142375a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdc1) && wj50.m88271j(this.f142375a, ((mdc1) obj).f142375a);
    }

    public final int hashCode() {
        return this.f142375a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f142375a);
    }
}
