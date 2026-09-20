package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class hyh implements Parcelable {
    public static final Parcelable.Creator<hyh> CREATOR = new rae(26);

    /* JADX INFO: renamed from: a */
    public final String f96585a;

    /* JADX INFO: renamed from: b */
    public final String f96586b;

    /* JADX INFO: renamed from: c */
    public final hto f96587c;

    public hyh(String str, String str2, hto htoVar) {
        this.f96585a = str;
        this.f96586b = str2;
        this.f96587c = htoVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyh)) {
            return false;
        }
        hyh hyhVar = (hyh) obj;
        return wj50.m88271j(this.f96585a, hyhVar.f96585a) && wj50.m88271j(this.f96586b, hyhVar.f96586b) && this.f96587c == hyhVar.f96587c;
    }

    public final String getUri() {
        return this.f96586b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f96585a.hashCode() * 31, 31, this.f96586b);
        hto htoVar = this.f96587c;
        return iM77243b + (htoVar == null ? 0 : htoVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96585a);
        parcel.writeString(this.f96586b);
        hto htoVar = this.f96587c;
        if (htoVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(htoVar.name());
        }
    }
}
