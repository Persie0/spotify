package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ze71 extends bf71 {
    public static final Parcelable.Creator<ze71> CREATOR = new c071(10);

    /* JADX INFO: renamed from: a */
    public final String f281899a;

    public ze71(String str) {
        this.f281899a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze71) && wj50.m88271j(this.f281899a, ((ze71) obj).f281899a);
    }

    public final int hashCode() {
        return this.f281899a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f281899a);
    }
}
