package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class j120 implements Parcelable {
    public static final Parcelable.Creator<j120> CREATOR = new km10(27);

    /* JADX INFO: renamed from: a */
    public final String f107598a;

    public j120(String str) {
        this.f107598a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m52109c() {
        return this.f107598a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j120) && wj50.m88271j(this.f107598a, ((j120) obj).f107598a);
    }

    public final int hashCode() {
        return this.f107598a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f107598a);
    }
}
