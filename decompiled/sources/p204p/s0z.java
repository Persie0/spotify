package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class s0z implements Parcelable {
    public static final Parcelable.Creator<s0z> CREATOR = new eqy(27);

    /* JADX INFO: renamed from: a */
    public final String f204559a;

    /* JADX INFO: renamed from: b */
    public final String f204560b;

    /* JADX INFO: renamed from: c */
    public final String f204561c;

    public s0z(String str, String str2, String str3) {
        this.f204559a = str;
        this.f204560b = str2;
        this.f204561c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0z)) {
            return false;
        }
        s0z s0zVar = (s0z) obj;
        return wj50.m88271j(this.f204559a, s0zVar.f204559a) && wj50.m88271j(this.f204560b, s0zVar.f204560b) && wj50.m88271j(this.f204561c, s0zVar.f204561c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f204559a.hashCode() * 31, 31, this.f204560b);
        String str = this.f204561c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f204559a);
        parcel.writeString(this.f204560b);
        parcel.writeString(this.f204561c);
    }
}
