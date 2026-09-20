package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hnd implements ind {
    public static final Parcelable.Creator<hnd> CREATOR = new fjd(8);

    /* JADX INFO: renamed from: a */
    public final List f93299a;

    /* JADX INFO: renamed from: b */
    public final String f93300b;

    /* JADX INFO: renamed from: c */
    public final String f93301c;

    /* JADX INFO: renamed from: d */
    public final String f93302d;

    public hnd(String str, List list, String str2, String str3) {
        this.f93299a = list;
        this.f93300b = str;
        this.f93301c = str2;
        this.f93302d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnd)) {
            return false;
        }
        hnd hndVar = (hnd) obj;
        return wj50.m88271j(this.f93299a, hndVar.f93299a) && wj50.m88271j(this.f93300b, hndVar.f93300b) && wj50.m88271j(this.f93301c, hndVar.f93301c) && wj50.m88271j(this.f93302d, hndVar.f93302d);
    }

    public final int hashCode() {
        int iHashCode = this.f93299a.hashCode() * 31;
        String str = this.f93300b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93301c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93302d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f93299a);
        parcel.writeString(this.f93300b);
        parcel.writeString(this.f93301c);
        parcel.writeString(this.f93302d);
    }
}
