package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ewm0 implements Parcelable {
    public static final Parcelable.Creator<ewm0> CREATOR = new pum0(10);

    /* JADX INFO: renamed from: a */
    public final String f63573a;

    /* JADX INFO: renamed from: b */
    public final String f63574b;

    public ewm0(String str, String str2) {
        this.f63573a = str;
        this.f63574b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewm0)) {
            return false;
        }
        ewm0 ewm0Var = (ewm0) obj;
        return wj50.m88271j(this.f63573a, ewm0Var.f63573a) && wj50.m88271j(this.f63574b, ewm0Var.f63574b);
    }

    public final int hashCode() {
        return this.f63574b.hashCode() + (this.f63573a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63573a);
        parcel.writeString(this.f63574b);
    }
}
