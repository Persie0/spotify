package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class h7e implements Parcelable {
    public static final Parcelable.Creator<h7e> CREATOR = new n6e(1);

    /* JADX INFO: renamed from: a */
    public final e1e f88441a;

    /* JADX INFO: renamed from: b */
    public final String f88442b;

    /* JADX INFO: renamed from: c */
    public final String f88443c;

    public h7e(e1e e1eVar, String str, String str2) {
        this.f88441a = e1eVar;
        this.f88442b = str;
        this.f88443c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7e)) {
            return false;
        }
        h7e h7eVar = (h7e) obj;
        return wj50.m88271j(this.f88441a, h7eVar.f88441a) && wj50.m88271j(this.f88442b, h7eVar.f88442b) && wj50.m88271j(this.f88443c, h7eVar.f88443c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f88441a.hashCode() * 31, 31, this.f88442b);
        String str = this.f88443c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f88441a, i);
        parcel.writeString(this.f88442b);
        parcel.writeString(this.f88443c);
    }
}
