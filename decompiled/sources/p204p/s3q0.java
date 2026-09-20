package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class s3q0 implements Parcelable {
    public static final Parcelable.Creator<s3q0> CREATOR = new vnp0(9);

    /* JADX INFO: renamed from: a */
    public final String f205318a;

    /* JADX INFO: renamed from: b */
    public final String f205319b;

    public s3q0(String str, String str2) {
        this.f205318a = str;
        this.f205319b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m77141c() {
        return this.f205318a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3q0)) {
            return false;
        }
        s3q0 s3q0Var = (s3q0) obj;
        return wj50.m88271j(this.f205318a, s3q0Var.f205318a) && wj50.m88271j(this.f205319b, s3q0Var.f205319b);
    }

    public final int hashCode() {
        return this.f205319b.hashCode() + (this.f205318a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f205318a);
        parcel.writeString(this.f205319b);
    }
}
