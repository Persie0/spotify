package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tf70 implements Parcelable {
    public static final Parcelable.Creator<tf70> CREATOR = new w270(9);

    /* JADX INFO: renamed from: a */
    public final String f219874a;

    /* JADX INFO: renamed from: b */
    public final String f219875b;

    /* JADX INFO: renamed from: c */
    public final boolean f219876c;

    /* JADX INFO: renamed from: d */
    public final boolean f219877d;

    public tf70(String str, boolean z, String str2, boolean z2) {
        this.f219874a = str;
        this.f219875b = str2;
        this.f219876c = z;
        this.f219877d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf70)) {
            return false;
        }
        tf70 tf70Var = (tf70) obj;
        return wj50.m88271j(this.f219874a, tf70Var.f219874a) && wj50.m88271j(this.f219875b, tf70Var.f219875b) && this.f219876c == tf70Var.f219876c && this.f219877d == tf70Var.f219877d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219877d) + s571.m77245d(s571.m77243b(this.f219874a.hashCode() * 31, 31, this.f219875b), 31, this.f219876c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f219874a);
        parcel.writeString(this.f219875b);
        parcel.writeInt(this.f219876c ? 1 : 0);
        parcel.writeInt(this.f219877d ? 1 : 0);
    }
}
