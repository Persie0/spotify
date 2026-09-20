package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yk50 implements Parcelable {
    public static final Parcelable.Creator<yk50> CREATOR = new gd50(3);

    /* JADX INFO: renamed from: a */
    public final String f273604a;

    /* JADX INFO: renamed from: b */
    public final String f273605b;

    public yk50(String str, String str2) {
        this.f273604a = str;
        this.f273605b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk50)) {
            return false;
        }
        yk50 yk50Var = (yk50) obj;
        return wj50.m88271j(this.f273604a, yk50Var.f273604a) && wj50.m88271j(this.f273605b, yk50Var.f273605b);
    }

    public final String getUri() {
        return this.f273604a;
    }

    public final int hashCode() {
        int iHashCode = this.f273604a.hashCode() * 31;
        String str = this.f273605b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f273604a);
        parcel.writeString(this.f273605b);
    }
}
