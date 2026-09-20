package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class s8c1 implements Parcelable {
    public static final Parcelable.Creator<s8c1> CREATOR = new c8b1(19);

    /* JADX INFO: renamed from: a */
    public final String f206626a;

    public s8c1(String str) {
        this.f206626a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m77469c() {
        return this.f206626a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8c1) && wj50.m88271j(this.f206626a, ((s8c1) obj).f206626a);
    }

    public final int hashCode() {
        return this.f206626a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f206626a);
    }
}
