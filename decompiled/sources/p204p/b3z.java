package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class b3z implements Parcelable {
    public static final Parcelable.Creator<b3z> CREATOR = new c2z(8);

    /* JADX INFO: renamed from: a */
    public final String f23148a;

    /* JADX INFO: renamed from: b */
    public final String f23149b;

    /* JADX INFO: renamed from: c */
    public final boolean f23150c;

    public b3z(String str, String str2, boolean z) {
        this.f23148a = str;
        this.f23149b = str2;
        this.f23150c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3z)) {
            return false;
        }
        b3z b3zVar = (b3z) obj;
        return wj50.m88271j(this.f23148a, b3zVar.f23148a) && wj50.m88271j(this.f23149b, b3zVar.f23149b) && this.f23150c == b3zVar.f23150c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23150c) + s571.m77243b(this.f23148a.hashCode() * 31, 31, this.f23149b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23148a);
        parcel.writeString(this.f23149b);
        parcel.writeInt(this.f23150c ? 1 : 0);
    }
}
