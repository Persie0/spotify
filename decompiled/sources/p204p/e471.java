package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class e471 extends g471 {
    public static final Parcelable.Creator<e471> CREATOR = new c071(2);

    /* JADX INFO: renamed from: a */
    public final String f56024a;

    public e471(String str) {
        this.f56024a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e471) && wj50.m88271j(this.f56024a, ((e471) obj).f56024a);
    }

    public final int hashCode() {
        return this.f56024a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56024a);
    }
}
