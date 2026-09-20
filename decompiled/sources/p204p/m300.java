package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class m300 implements Parcelable {
    public static final Parcelable.Creator<m300> CREATOR = new ygz(24);

    /* JADX INFO: renamed from: a */
    public final String f139495a;

    public /* synthetic */ m300(String str) {
        this.f139495a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m300) {
            return wj50.m88271j(this.f139495a, ((m300) obj).f139495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f139495a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("FormId(value=", this.f139495a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f139495a);
    }
}
