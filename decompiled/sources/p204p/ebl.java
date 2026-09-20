package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ebl implements Parcelable {
    public static final Parcelable.Creator<ebl> CREATOR = new z4l(6);

    /* JADX INFO: renamed from: a */
    public final String f57959a;

    /* JADX INFO: renamed from: b */
    public final String f57960b;

    /* JADX INFO: renamed from: c */
    public final boolean f57961c;

    public ebl(String str, String str2, boolean z) {
        this.f57959a = str;
        this.f57960b = str2;
        this.f57961c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebl)) {
            return false;
        }
        ebl eblVar = (ebl) obj;
        return wj50.m88271j(this.f57959a, eblVar.f57959a) && wj50.m88271j(this.f57960b, eblVar.f57960b) && this.f57961c == eblVar.f57961c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57961c) + s571.m77243b(this.f57959a.hashCode() * 31, 31, this.f57960b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57959a);
        parcel.writeString(this.f57960b);
        parcel.writeInt(this.f57961c ? 1 : 0);
    }
}
