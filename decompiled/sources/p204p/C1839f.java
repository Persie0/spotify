package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1839f implements Parcelable {
    public static final Parcelable.Creator<C1839f> CREATOR = new ora(3);

    /* JADX INFO: renamed from: a */
    public final String f64506a;

    /* JADX INFO: renamed from: b */
    public final String f64507b;

    public C1839f(String str, String str2) {
        this.f64506a = str;
        this.f64507b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1839f)) {
            return false;
        }
        C1839f c1839f = (C1839f) obj;
        return wj50.m88271j(this.f64506a, c1839f.f64506a) && wj50.m88271j(this.f64507b, c1839f.f64507b);
    }

    public final int hashCode() {
        return this.f64507b.hashCode() + (this.f64506a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f64506a);
        parcel.writeString(this.f64507b);
    }
}
