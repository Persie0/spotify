package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class jre1 implements Parcelable {
    public static final Parcelable.Creator<jre1> CREATOR = new tne1(5);

    /* JADX INFO: renamed from: a */
    public final String f115169a;

    /* JADX INFO: renamed from: b */
    public final String f115170b;

    public jre1(String str, String str2) {
        this.f115169a = str;
        this.f115170b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jre1)) {
            return false;
        }
        jre1 jre1Var = (jre1) obj;
        return wj50.m88271j(this.f115169a, jre1Var.f115169a) && wj50.m88271j(this.f115170b, jre1Var.f115170b);
    }

    public final String getUri() {
        return this.f115170b;
    }

    public final int hashCode() {
        return this.f115170b.hashCode() + (this.f115169a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115169a);
        parcel.writeString(this.f115170b);
    }
}
