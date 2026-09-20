package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ip31 implements jp31 {
    public static final Parcelable.Creator<ip31> CREATOR = new ln31(3);

    /* JADX INFO: renamed from: a */
    public final String f104376a;

    public ip31(String str) {
        this.f104376a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip31) && wj50.m88271j(this.f104376a, ((ip31) obj).f104376a);
    }

    public final int hashCode() {
        return this.f104376a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f104376a);
    }
}
