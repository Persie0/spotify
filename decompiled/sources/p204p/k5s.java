package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class k5s implements iet0 {
    public static final Parcelable.Creator<k5s> CREATOR = new o5r(27);

    /* JADX INFO: renamed from: a */
    public final int f119572a;

    /* JADX INFO: renamed from: b */
    public final String f119573b;

    /* JADX INFO: renamed from: c */
    public final String f119574c;

    /* JADX INFO: renamed from: d */
    public final String f119575d;

    /* JADX INFO: renamed from: e */
    public final String f119576e;

    public k5s(int i, String str, String str2, String str3, String str4) {
        this.f119572a = i;
        this.f119573b = str;
        this.f119574c = str2;
        this.f119575d = str3;
        this.f119576e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f119572a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5s)) {
            return false;
        }
        k5s k5sVar = (k5s) obj;
        return this.f119572a == k5sVar.f119572a && wj50.m88271j(this.f119573b, k5sVar.f119573b) && wj50.m88271j(this.f119574c, k5sVar.f119574c) && wj50.m88271j(this.f119575d, k5sVar.f119575d) && wj50.m88271j(this.f119576e, k5sVar.f119576e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f119572a) * 31, 31, this.f119573b), 31, this.f119574c), 31, this.f119575d);
        String str = this.f119576e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f119572a);
        parcel.writeString(this.f119573b);
        parcel.writeString(this.f119574c);
        parcel.writeString(this.f119575d);
        parcel.writeString(this.f119576e);
    }
}
