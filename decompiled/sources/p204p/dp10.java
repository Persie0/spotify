package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dp10 extends ep10 {
    public static final Parcelable.Creator<dp10> CREATOR = new km10(3);

    /* JADX INFO: renamed from: a */
    public final String f51149a;

    public dp10(String str) {
        this.f51149a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m36556c() {
        return this.f51149a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp10) && wj50.m88271j(this.f51149a, ((dp10) obj).f51149a);
    }

    public final int hashCode() {
        return this.f51149a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51149a);
    }
}
