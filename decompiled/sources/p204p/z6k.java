package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z6k implements Parcelable {
    public static final Parcelable.Creator<z6k> CREATOR = new dnj(21);

    /* JADX INFO: renamed from: a */
    public final String f279940a;

    /* JADX INFO: renamed from: b */
    public final String f279941b;

    /* JADX INFO: renamed from: c */
    public final String f279942c;

    public z6k(String str, String str2, String str3) {
        this.f279940a = str;
        this.f279941b = str2;
        this.f279942c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6k)) {
            return false;
        }
        z6k z6kVar = (z6k) obj;
        return wj50.m88271j(this.f279940a, z6kVar.f279940a) && wj50.m88271j(this.f279941b, z6kVar.f279941b) && wj50.m88271j(this.f279942c, z6kVar.f279942c);
    }

    public final int hashCode() {
        int iHashCode = this.f279940a.hashCode() * 31;
        String str = this.f279941b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279942c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f279940a);
        parcel.writeString(this.f279941b);
        parcel.writeString(this.f279942c);
    }

    public /* synthetic */ z6k(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }
}
