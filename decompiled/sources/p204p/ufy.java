package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ufy implements Parcelable {
    public static final Parcelable.Creator<ufy> CREATOR = new p7y(4);

    /* JADX INFO: renamed from: a */
    public final String f229919a;

    /* JADX INFO: renamed from: b */
    public final String f229920b;

    /* JADX INFO: renamed from: c */
    public final boolean f229921c;

    public ufy(String str, String str2, boolean z) {
        this.f229919a = str;
        this.f229920b = str2;
        this.f229921c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufy)) {
            return false;
        }
        ufy ufyVar = (ufy) obj;
        return wj50.m88271j(this.f229919a, ufyVar.f229919a) && wj50.m88271j(this.f229920b, ufyVar.f229920b) && this.f229921c == ufyVar.f229921c;
    }

    public final String getUri() {
        return this.f229919a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229921c) + s571.m77243b(this.f229919a.hashCode() * 31, 31, this.f229920b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f229919a);
        parcel.writeString(this.f229920b);
        parcel.writeInt(this.f229921c ? 1 : 0);
    }
}
