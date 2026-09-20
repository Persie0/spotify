package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f5c extends AbstractC2206o9 {
    public static final Parcelable.Creator<f5c> CREATOR = new a5c(4);

    /* JADX INFO: renamed from: a */
    public final String f66021a;

    public f5c(String str) {
        this.f66021a = str;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5c) && wj50.m88271j(this.f66021a, ((f5c) obj).f66021a);
    }

    public final int hashCode() {
        return this.f66021a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66021a);
    }
}
