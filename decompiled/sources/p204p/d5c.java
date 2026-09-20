package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d5c extends AbstractC2206o9 {
    public static final Parcelable.Creator<d5c> CREATOR = new a5c(2);

    /* JADX INFO: renamed from: a */
    public final String f45390a;

    public d5c(String str) {
        this.f45390a = str;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5c) && wj50.m88271j(this.f45390a, ((d5c) obj).f45390a);
    }

    public final int hashCode() {
        return this.f45390a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45390a);
    }
}
