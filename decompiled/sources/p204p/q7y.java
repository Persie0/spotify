package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class q7y implements Parcelable {
    public static final Parcelable.Creator<q7y> CREATOR = new wfw(27);

    /* JADX INFO: renamed from: a */
    public final String f186187a;

    /* JADX INFO: renamed from: b */
    public final String f186188b;

    /* JADX INFO: renamed from: c */
    public final String f186189c;

    public q7y(String str, String str2, String str3) {
        this.f186187a = str;
        this.f186188b = str2;
        this.f186189c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7y)) {
            return false;
        }
        q7y q7yVar = (q7y) obj;
        return wj50.m88271j(this.f186187a, q7yVar.f186187a) && wj50.m88271j(this.f186188b, q7yVar.f186188b) && wj50.m88271j(this.f186189c, q7yVar.f186189c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f186187a.hashCode() * 31, 31, this.f186188b);
        String str = this.f186189c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f186187a);
        parcel.writeString(this.f186188b);
        parcel.writeString(this.f186189c);
    }
}
