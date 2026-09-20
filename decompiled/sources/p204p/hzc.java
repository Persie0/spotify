package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hzc implements Parcelable {
    public static final Parcelable.Creator<hzc> CREATOR = new qvc(1);

    /* JADX INFO: renamed from: a */
    public final String f96886a;

    /* JADX INFO: renamed from: b */
    public final String f96887b;

    /* JADX INFO: renamed from: c */
    public final List f96888c;

    public hzc(String str, List list, String str2) {
        this.f96886a = str;
        this.f96887b = str2;
        this.f96888c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzc)) {
            return false;
        }
        hzc hzcVar = (hzc) obj;
        return wj50.m88271j(this.f96886a, hzcVar.f96886a) && wj50.m88271j(this.f96887b, hzcVar.f96887b) && wj50.m88271j(this.f96888c, hzcVar.f96888c);
    }

    public final int hashCode() {
        int iHashCode = this.f96886a.hashCode() * 31;
        String str = this.f96887b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f96888c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96886a);
        parcel.writeString(this.f96887b);
        parcel.writeStringList(this.f96888c);
    }
}
