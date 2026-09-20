package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cpk implements m8z0 {
    public static final Parcelable.Creator<cpk> CREATOR = new kck(17);

    /* JADX INFO: renamed from: a */
    public final String f40570a;

    /* JADX INFO: renamed from: b */
    public final String f40571b;

    /* JADX INFO: renamed from: c */
    public final String f40572c;

    public cpk(String str, String str2, String str3) {
        this.f40570a = str;
        this.f40571b = str2;
        this.f40572c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpk)) {
            return false;
        }
        cpk cpkVar = (cpk) obj;
        return wj50.m88271j(this.f40570a, cpkVar.f40570a) && wj50.m88271j(this.f40571b, cpkVar.f40571b) && wj50.m88271j(this.f40572c, cpkVar.f40572c);
    }

    public final int hashCode() {
        int iHashCode = this.f40570a.hashCode() * 31;
        String str = this.f40571b;
        return this.f40572c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40570a);
        parcel.writeString(this.f40571b);
        parcel.writeString(this.f40572c);
    }
}
