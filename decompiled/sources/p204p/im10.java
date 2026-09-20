package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class im10 extends mm10 {
    public static final Parcelable.Creator<im10> CREATOR = new qz00(28);

    /* JADX INFO: renamed from: a */
    public final String f103573a;

    public im10(String str) {
        this.f103573a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im10) && wj50.m88271j(this.f103573a, ((im10) obj).f103573a);
    }

    public final int hashCode() {
        return this.f103573a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f103573a);
    }
}
