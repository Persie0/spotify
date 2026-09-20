package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lob implements Parcelable {
    public static final Parcelable.Creator<lob> CREATOR = new jja(11);

    /* JADX INFO: renamed from: a */
    public final String f135368a;

    /* JADX INFO: renamed from: b */
    public final boolean f135369b;

    /* JADX INFO: renamed from: c */
    public final String f135370c;

    public lob(String str, String str2, boolean z) {
        this.f135368a = str;
        this.f135369b = z;
        this.f135370c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob)) {
            return false;
        }
        lob lobVar = (lob) obj;
        return wj50.m88271j(this.f135368a, lobVar.f135368a) && this.f135369b == lobVar.f135369b && wj50.m88271j(this.f135370c, lobVar.f135370c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f135368a.hashCode() * 31, 31, this.f135369b);
        String str = this.f135370c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f135368a);
        parcel.writeInt(this.f135369b ? 1 : 0);
        parcel.writeString(this.f135370c);
    }
}
