package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class s5b1 extends zq50 {
    public static final Parcelable.Creator<s5b1> CREATOR = new u2a1(28);

    /* JADX INFO: renamed from: a */
    public final String f205768a;

    public s5b1(String str) {
        this.f205768a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5b1) && wj50.m88271j(this.f205768a, ((s5b1) obj).f205768a);
    }

    public final int hashCode() {
        return this.f205768a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f205768a);
    }
}
