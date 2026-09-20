package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class akl0 implements Parcelable {
    public static final Parcelable.Creator<akl0> CREATOR = new hbl0(22);

    /* JADX INFO: renamed from: a */
    public final String f16601a;

    public akl0(String str) {
        this.f16601a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akl0) && wj50.m88271j(this.f16601a, ((akl0) obj).f16601a);
    }

    public final int hashCode() {
        return this.f16601a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16601a);
    }
}
