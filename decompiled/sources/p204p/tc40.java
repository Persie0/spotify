package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tc40 implements uc40 {
    public static final Parcelable.Creator<tc40> CREATOR = new y240(12);

    /* JADX INFO: renamed from: a */
    public final String f219007a;

    public tc40(String str) {
        this.f219007a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc40) && wj50.m88271j(this.f219007a, ((tc40) obj).f219007a);
    }

    public final int hashCode() {
        return this.f219007a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f219007a);
    }
}
