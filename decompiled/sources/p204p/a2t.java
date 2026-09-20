package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class a2t implements Parcelable {
    public static final Parcelable.Creator<a2t> CREATOR = new f9s(21);

    /* JADX INFO: renamed from: a */
    public final String f11720a;

    public a2t(String str) {
        this.f11720a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2t) && wj50.m88271j(this.f11720a, ((a2t) obj).f11720a);
    }

    public final int hashCode() {
        return this.f11720a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11720a);
    }
}
