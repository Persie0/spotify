package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class g520 implements i520 {
    public static final Parcelable.Creator<g520> CREATOR = new t320(9);

    /* JADX INFO: renamed from: a */
    public final String f76567a;

    /* JADX INFO: renamed from: b */
    public final String f76568b;

    public g520(String str, String str2) {
        this.f76567a = str;
        this.f76568b = str2;
    }

    @Override // p204p.i520
    /* JADX INFO: renamed from: I1 */
    public final String mo40744I1() {
        return this.f76568b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g520)) {
            return false;
        }
        g520 g520Var = (g520) obj;
        return wj50.m88271j(this.f76567a, g520Var.f76567a) && wj50.m88271j(this.f76568b, g520Var.f76568b);
    }

    @Override // p204p.i520
    /* JADX INFO: renamed from: h0 */
    public final String mo40745h0() {
        return this.f76567a;
    }

    public final int hashCode() {
        return this.f76568b.hashCode() + (this.f76567a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f76567a);
        parcel.writeString(this.f76568b);
    }
}
