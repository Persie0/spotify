package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dj80 implements fj80 {
    public static final Parcelable.Creator<dj80> CREATOR = new i980(6);

    /* JADX INFO: renamed from: a */
    public final String f49610a;

    public dj80(String str) {
        this.f49610a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj80) && wj50.m88271j(this.f49610a, ((dj80) obj).f49610a);
    }

    public final int hashCode() {
        return this.f49610a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49610a);
    }
}
