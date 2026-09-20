package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class c0d0 implements d0d0 {
    public static final Parcelable.Creator<c0d0> CREATOR = new f4c0(20);

    /* JADX INFO: renamed from: a */
    public final String f32747a;

    public c0d0(String str) {
        this.f32747a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0d0) && wj50.m88271j(this.f32747a, ((c0d0) obj).f32747a);
    }

    public final int hashCode() {
        String str = this.f32747a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32747a);
    }
}
