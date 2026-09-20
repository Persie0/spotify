package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class emi implements Parcelable {
    public static final Parcelable.Creator<emi> CREATOR = new f2i(7);

    /* JADX INFO: renamed from: a */
    public final String f60920a;

    /* JADX INFO: renamed from: b */
    public final boolean f60921b;

    /* JADX INFO: renamed from: c */
    public final boolean f60922c;

    /* JADX INFO: renamed from: d */
    public final String f60923d;

    public emi(String str, boolean z, String str2, boolean z2) {
        this.f60920a = str;
        this.f60921b = z;
        this.f60922c = z2;
        this.f60923d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emi)) {
            return false;
        }
        emi emiVar = (emi) obj;
        return wj50.m88271j(this.f60920a, emiVar.f60920a) && this.f60921b == emiVar.f60921b && this.f60922c == emiVar.f60922c && wj50.m88271j(this.f60923d, emiVar.f60923d);
    }

    public final int hashCode() {
        return this.f60923d.hashCode() + s571.m77245d(s571.m77245d(this.f60920a.hashCode() * 31, 31, this.f60921b), 31, this.f60922c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60920a);
        parcel.writeInt(this.f60921b ? 1 : 0);
        parcel.writeInt(this.f60922c ? 1 : 0);
        parcel.writeString(this.f60923d);
    }
}
