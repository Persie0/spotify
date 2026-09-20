package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fc61 extends hc61 {
    public static final Parcelable.Creator<fc61> CREATOR = new e361(25);

    /* JADX INFO: renamed from: a */
    public final Uri f68017a;

    /* JADX INFO: renamed from: b */
    public final String f68018b;

    public fc61(Uri uri, String str) {
        this.f68017a = uri;
        this.f68018b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc61)) {
            return false;
        }
        fc61 fc61Var = (fc61) obj;
        return wj50.m88271j(this.f68017a, fc61Var.f68017a) && wj50.m88271j(this.f68018b, fc61Var.f68018b);
    }

    public final int hashCode() {
        return this.f68018b.hashCode() + (this.f68017a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f68017a, i);
        parcel.writeString(this.f68018b);
    }
}
