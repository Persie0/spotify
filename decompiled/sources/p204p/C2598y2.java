package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.y2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2598y2 implements Parcelable {
    public static final Parcelable.Creator<C2598y2> CREATOR = new ora(6);

    /* JADX INFO: renamed from: a */
    public final String f268428a;

    /* JADX INFO: renamed from: b */
    public final String f268429b;

    public C2598y2(String str, String str2) {
        this.f268428a = str;
        this.f268429b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2598y2)) {
            return false;
        }
        C2598y2 c2598y2 = (C2598y2) obj;
        return wj50.m88271j(this.f268428a, c2598y2.f268428a) && wj50.m88271j(this.f268429b, c2598y2.f268429b);
    }

    public final String getEntityUri() {
        return this.f268429b;
    }

    public final int hashCode() {
        String str = this.f268428a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f268429b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f268428a);
        parcel.writeString(this.f268429b);
    }
}
