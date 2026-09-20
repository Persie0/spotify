package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qmc1 implements tmc1 {
    public static final Parcelable.Creator<qmc1> CREATOR = new nlc1(25);

    /* JADX INFO: renamed from: a */
    public final String f190199a;

    public qmc1(String str) {
        this.f190199a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmc1) && wj50.m88271j(this.f190199a, ((qmc1) obj).f190199a);
    }

    public final int hashCode() {
        return this.f190199a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f190199a);
    }
}
