package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bhc implements Parcelable {
    public static final Parcelable.Creator<bhc> CREATOR = new a5c(11);

    /* JADX INFO: renamed from: a */
    public final String f27134a;

    /* JADX INFO: renamed from: b */
    public final String f27135b;

    /* JADX INFO: renamed from: c */
    public final int f27136c;

    public bhc(String str, String str2, int i) {
        this.f27134a = str;
        this.f27135b = str2;
        this.f27136c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhc)) {
            return false;
        }
        bhc bhcVar = (bhc) obj;
        return wj50.m88271j(this.f27134a, bhcVar.f27134a) && wj50.m88271j(this.f27135b, bhcVar.f27135b) && this.f27136c == bhcVar.f27136c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27136c) + s571.m77243b(this.f27134a.hashCode() * 31, 31, this.f27135b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27134a);
        parcel.writeString(this.f27135b);
        parcel.writeInt(this.f27136c);
    }
}
