package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t7y implements Parcelable {
    public static final Parcelable.Creator<t7y> CREATOR = new p7y(0);

    /* JADX INFO: renamed from: a */
    public final String f217927a;

    /* JADX INFO: renamed from: b */
    public final String f217928b;

    /* JADX INFO: renamed from: c */
    public final String f217929c;

    public t7y(String str, String str2, String str3) {
        this.f217927a = str;
        this.f217928b = str2;
        this.f217929c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7y)) {
            return false;
        }
        t7y t7yVar = (t7y) obj;
        return wj50.m88271j(this.f217927a, t7yVar.f217927a) && wj50.m88271j(this.f217928b, t7yVar.f217928b) && wj50.m88271j(this.f217929c, t7yVar.f217929c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f217927a.hashCode() * 31, 31, this.f217928b);
        String str = this.f217929c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f217927a);
        parcel.writeString(this.f217928b);
        parcel.writeString(this.f217929c);
    }
}
