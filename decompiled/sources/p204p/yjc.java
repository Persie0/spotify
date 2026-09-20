package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class yjc implements Parcelable {
    public static final Parcelable.Creator<yjc> CREATOR = new a5c(13);

    /* JADX INFO: renamed from: a */
    public final String f273340a;

    /* JADX INFO: renamed from: b */
    public final String f273341b;

    /* JADX INFO: renamed from: c */
    public final owk f273342c;

    public yjc(String str, String str2, owk owkVar) {
        this.f273340a = str;
        this.f273341b = str2;
        this.f273342c = owkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjc)) {
            return false;
        }
        yjc yjcVar = (yjc) obj;
        return wj50.m88271j(this.f273340a, yjcVar.f273340a) && wj50.m88271j(this.f273341b, yjcVar.f273341b) && wj50.m88271j(this.f273342c, yjcVar.f273342c);
    }

    public final int hashCode() {
        return this.f273342c.hashCode() + s571.m77243b(this.f273340a.hashCode() * 31, 31, this.f273341b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f273340a);
        parcel.writeString(this.f273341b);
        this.f273342c.writeToParcel(parcel, i);
    }
}
