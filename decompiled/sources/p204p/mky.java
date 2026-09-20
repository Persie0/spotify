package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mky implements Parcelable {
    public static final Parcelable.Creator<mky> CREATOR = new p7y(20);

    /* JADX INFO: renamed from: a */
    public final String f144707a;

    /* JADX INFO: renamed from: b */
    public final String f144708b;

    /* JADX INFO: renamed from: c */
    public final b791 f144709c;

    /* JADX INFO: renamed from: d */
    public final boolean f144710d;

    public mky(String str, String str2, b791 b791Var, boolean z) {
        this.f144707a = str;
        this.f144708b = str2;
        this.f144709c = b791Var;
        this.f144710d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mky)) {
            return false;
        }
        mky mkyVar = (mky) obj;
        return wj50.m88271j(this.f144707a, mkyVar.f144707a) && wj50.m88271j(this.f144708b, mkyVar.f144708b) && wj50.m88271j(this.f144709c, mkyVar.f144709c) && this.f144710d == mkyVar.f144710d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144710d) + ((this.f144709c.hashCode() + s571.m77243b(this.f144707a.hashCode() * 31, 31, this.f144708b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f144707a);
        parcel.writeString(this.f144708b);
        parcel.writeParcelable(this.f144709c, i);
        parcel.writeInt(this.f144710d ? 1 : 0);
    }
}
