package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class krt0 implements Parcelable {
    public static final Parcelable.Creator<krt0> CREATOR = new vit0(11);

    /* JADX INFO: renamed from: a */
    public final int f125726a;

    public krt0(int i) {
        this.f125726a = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m57172c() {
        return this.f125726a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krt0) && this.f125726a == ((krt0) obj).f125726a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f125726a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f125726a;
        if (i2 == 1) {
            str = "STANDARD";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "ADD_CONFIRMATION_PEEK";
        }
        parcel.writeString(str);
    }
}
