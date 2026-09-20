package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class y020 implements Parcelable {
    public static final Parcelable.Creator<y020> CREATOR = new km10(26);

    /* JADX INFO: renamed from: a */
    public final String f267872a;

    public y020(String str) {
        this.f267872a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m92523c() {
        return this.f267872a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y020) && wj50.m88271j(this.f267872a, ((y020) obj).f267872a);
    }

    public final int hashCode() {
        return this.f267872a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f267872a);
    }
}
