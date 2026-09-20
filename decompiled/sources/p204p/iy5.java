package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class iy5 implements Parcelable {
    public static final Parcelable.Creator<iy5> CREATOR = new vp5(12);

    /* JADX INFO: renamed from: a */
    public final String f106848a;

    /* JADX INFO: renamed from: b */
    public final String f106849b;

    public iy5(String str, String str2) {
        this.f106848a = str;
        this.f106849b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy5)) {
            return false;
        }
        iy5 iy5Var = (iy5) obj;
        return wj50.m88271j(this.f106848a, iy5Var.f106848a) && wj50.m88271j(this.f106849b, iy5Var.f106849b);
    }

    public final int hashCode() {
        return this.f106849b.hashCode() + (this.f106848a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106848a);
        parcel.writeString(this.f106849b);
    }
}
