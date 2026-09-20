package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cc61 extends hc61 {
    public static final Parcelable.Creator<cc61> CREATOR = new e361(22);

    /* JADX INFO: renamed from: a */
    public final Uri f36331a;

    /* JADX INFO: renamed from: b */
    public final String f36332b;

    public cc61(Uri uri, String str) {
        this.f36331a = uri;
        this.f36332b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc61)) {
            return false;
        }
        cc61 cc61Var = (cc61) obj;
        return wj50.m88271j(this.f36331a, cc61Var.f36331a) && wj50.m88271j(this.f36332b, cc61Var.f36332b);
    }

    public final int hashCode() {
        return this.f36332b.hashCode() + (this.f36331a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f36331a, i);
        parcel.writeString(this.f36332b);
    }
}
