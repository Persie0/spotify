package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gc31 implements Parcelable {
    public static final Parcelable.Creator<gc31> CREATOR = new q321(29);

    /* JADX INFO: renamed from: a */
    public final String f78474a;

    /* JADX INFO: renamed from: b */
    public final String f78475b;

    /* JADX INFO: renamed from: c */
    public final boolean f78476c;

    public gc31(String str, String str2, boolean z) {
        this.f78474a = str;
        this.f78475b = str2;
        this.f78476c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc31)) {
            return false;
        }
        gc31 gc31Var = (gc31) obj;
        return wj50.m88271j(this.f78474a, gc31Var.f78474a) && wj50.m88271j(this.f78475b, gc31Var.f78475b) && this.f78476c == gc31Var.f78476c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78476c) + s571.m77243b(this.f78474a.hashCode() * 31, 31, this.f78475b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f78474a);
        parcel.writeString(this.f78475b);
        parcel.writeInt(this.f78476c ? 1 : 0);
    }
}
