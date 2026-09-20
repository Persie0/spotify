package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class s9c1 implements u9c1 {
    public static final Parcelable.Creator<s9c1> CREATOR = new c8b1(21);

    /* JADX INFO: renamed from: a */
    public final String f206926a;

    public s9c1(String str) {
        this.f206926a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9c1) && wj50.m88271j(this.f206926a, ((s9c1) obj).f206926a);
    }

    public final int hashCode() {
        return this.f206926a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f206926a);
    }
}
