package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class d510 implements Parcelable {
    public static final Parcelable.Creator<d510> CREATOR = new qz00(12);

    /* JADX INFO: renamed from: c */
    public static final d510 f45297c = new d510("", -1);

    /* JADX INFO: renamed from: a */
    public final String f45298a;

    /* JADX INFO: renamed from: b */
    public final int f45299b;

    public d510(String str, int i) {
        this.f45298a = str;
        this.f45299b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d510)) {
            return false;
        }
        d510 d510Var = (d510) obj;
        return wj50.m88271j(this.f45298a, d510Var.f45298a) && this.f45299b == d510Var.f45299b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45299b) + (this.f45298a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45298a);
        parcel.writeInt(this.f45299b);
    }
}
