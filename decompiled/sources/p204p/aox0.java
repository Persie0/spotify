package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class aox0 implements Parcelable {
    public static final Parcelable.Creator<aox0> CREATOR = new luh0(15);

    /* JADX INFO: renamed from: a */
    public final String f17787a;

    /* JADX INFO: renamed from: b */
    public final String f17788b;

    /* JADX INFO: renamed from: c */
    public final double f17789c;

    public aox0(String str, String str2, double d) {
        this.f17787a = str;
        this.f17788b = str2;
        this.f17789c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aox0)) {
            return false;
        }
        aox0 aox0Var = (aox0) obj;
        return wj50.m88271j(this.f17787a, aox0Var.f17787a) && wj50.m88271j(this.f17788b, aox0Var.f17788b) && Double.compare(this.f17789c, aox0Var.f17789c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f17789c) + s571.m77243b(this.f17787a.hashCode() * 31, 31, this.f17788b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17787a);
        parcel.writeString(this.f17788b);
        parcel.writeDouble(this.f17789c);
    }

    public /* synthetic */ aox0(String str, String str2) {
        this(str, str2, 0.0d);
    }
}
