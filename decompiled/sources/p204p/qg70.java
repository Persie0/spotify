package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class qg70 implements Parcelable {
    public static final Parcelable.Creator<qg70> CREATOR = new w270(12);

    /* JADX INFO: renamed from: a */
    public final String f188396a;

    public qg70(String str) {
        this.f188396a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg70) && wj50.m88271j(this.f188396a, ((qg70) obj).f188396a);
    }

    public final int hashCode() {
        return this.f188396a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f188396a);
    }
}
