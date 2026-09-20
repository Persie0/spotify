package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class dei implements Parcelable {
    public static final Parcelable.Creator<dei> CREATOR = new f2i(3);

    /* JADX INFO: renamed from: a */
    public final String f48093a;

    /* JADX INFO: renamed from: b */
    public final String f48094b;

    public dei(String str, String str2) {
        this.f48093a = str;
        this.f48094b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m35802c() {
        return this.f48094b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dei)) {
            return false;
        }
        dei deiVar = (dei) obj;
        return wj50.m88271j(this.f48093a, deiVar.f48093a) && wj50.m88271j(this.f48094b, deiVar.f48094b);
    }

    public final int hashCode() {
        return this.f48094b.hashCode() + (this.f48093a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f48093a);
        parcel.writeString(this.f48094b);
    }
}
