package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class w4c extends AbstractC2206o9 {
    public static final Parcelable.Creator<w4c> CREATOR = new jja(26);

    /* JADX INFO: renamed from: a */
    public final String f247786a;

    public w4c(String str) {
        this.f247786a = str;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4c) && wj50.m88271j(this.f247786a, ((w4c) obj).f247786a);
    }

    public final int hashCode() {
        return this.f247786a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f247786a);
    }
}
