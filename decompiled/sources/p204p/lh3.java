package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class lh3 implements nh3 {
    public static final Parcelable.Creator<lh3> CREATOR = new bc3(3);

    /* JADX INFO: renamed from: a */
    public final String f133354a;

    /* JADX INFO: renamed from: b */
    public final String f133355b;

    /* JADX INFO: renamed from: c */
    public final String f133356c;

    public lh3(String str, String str2, String str3) {
        this.f133354a = str;
        this.f133355b = str2;
        this.f133356c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh3)) {
            return false;
        }
        lh3 lh3Var = (lh3) obj;
        return wj50.m88271j(this.f133354a, lh3Var.f133354a) && wj50.m88271j(this.f133355b, lh3Var.f133355b) && wj50.m88271j(this.f133356c, lh3Var.f133356c);
    }

    public final int hashCode() {
        return this.f133356c.hashCode() + s571.m77243b(this.f133354a.hashCode() * 31, 31, this.f133355b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f133354a);
        parcel.writeString(this.f133355b);
        parcel.writeString(this.f133356c);
    }
}
