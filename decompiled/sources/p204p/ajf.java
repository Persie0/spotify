package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ajf implements Parcelable {
    public static final Parcelable.Creator<ajf> CREATOR = new rae(15);

    /* JADX INFO: renamed from: a */
    public final String f16262a;

    /* JADX INFO: renamed from: b */
    public final String f16263b;

    public ajf(String str, String str2) {
        this.f16262a = str;
        this.f16263b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajf)) {
            return false;
        }
        ajf ajfVar = (ajf) obj;
        return wj50.m88271j(this.f16262a, ajfVar.f16262a) && wj50.m88271j(this.f16263b, ajfVar.f16263b);
    }

    public final int hashCode() {
        return this.f16263b.hashCode() + (this.f16262a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16262a);
        parcel.writeString(this.f16263b);
    }
}
