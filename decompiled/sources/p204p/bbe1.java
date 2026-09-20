package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class bbe1 implements Parcelable {
    public static final Parcelable.Creator<bbe1> CREATOR = new xed1(10);

    /* JADX INFO: renamed from: a */
    public final String f25547a;

    public bbe1(String str) {
        this.f25547a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbe1) && wj50.m88271j(this.f25547a, ((bbe1) obj).f25547a);
    }

    public final int hashCode() {
        return this.f25547a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25547a);
    }
}
