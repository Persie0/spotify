package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xp6 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f264512a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f264511b = new wp6(vp6.f243601h);
    public static final Parcelable.Creator<xp6> CREATOR = new fi6(12);

    public /* synthetic */ xp6(String str) {
        this.f264512a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xp6) {
            return wj50.m88271j(this.f264512a, ((xp6) obj).f264512a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f264512a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("AttemptId(value=", this.f264512a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f264512a);
    }
}
