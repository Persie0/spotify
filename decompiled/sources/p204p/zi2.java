package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zi2 implements Parcelable {
    public static final Parcelable.Creator<zi2> CREATOR = new lb2(14);

    /* JADX INFO: renamed from: a */
    public final String f283067a;

    /* JADX INFO: renamed from: b */
    public final String f283068b;

    /* JADX INFO: renamed from: c */
    public final String f283069c;

    public zi2(String str, String str2, String str3) {
        this.f283067a = str;
        this.f283068b = str2;
        this.f283069c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m96192c() {
        return this.f283067a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi2)) {
            return false;
        }
        zi2 zi2Var = (zi2) obj;
        return wj50.m88271j(this.f283067a, zi2Var.f283067a) && wj50.m88271j(this.f283068b, zi2Var.f283068b) && wj50.m88271j(this.f283069c, zi2Var.f283069c);
    }

    public final int hashCode() {
        return this.f283069c.hashCode() + s571.m77243b(this.f283067a.hashCode() * 31, 31, this.f283068b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283067a);
        parcel.writeString(this.f283068b);
        parcel.writeString(this.f283069c);
    }
}
