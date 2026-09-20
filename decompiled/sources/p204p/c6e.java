package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c6e implements Parcelable {
    public static final Parcelable.Creator<c6e> CREATOR = new j0e(28);

    /* JADX INFO: renamed from: a */
    public final String f34518a;

    /* JADX INFO: renamed from: b */
    public final String f34519b;

    public c6e(String str, String str2) {
        this.f34518a = str;
        this.f34519b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6e)) {
            return false;
        }
        c6e c6eVar = (c6e) obj;
        return wj50.m88271j(this.f34518a, c6eVar.f34518a) && wj50.m88271j(this.f34519b, c6eVar.f34519b);
    }

    public final int hashCode() {
        return this.f34519b.hashCode() + (this.f34518a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34518a);
        parcel.writeString(this.f34519b);
    }
}
