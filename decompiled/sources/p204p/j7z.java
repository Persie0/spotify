package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class j7z implements Parcelable {
    public static final Parcelable.Creator<j7z> CREATOR = new c2z(15);

    /* JADX INFO: renamed from: a */
    public final String f109741a;

    /* JADX INFO: renamed from: b */
    public final String f109742b;

    public j7z(String str, String str2) {
        this.f109741a = str;
        this.f109742b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7z)) {
            return false;
        }
        j7z j7zVar = (j7z) obj;
        return wj50.m88271j(this.f109741a, j7zVar.f109741a) && wj50.m88271j(this.f109742b, j7zVar.f109742b);
    }

    public final int hashCode() {
        return this.f109742b.hashCode() + (this.f109741a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109741a);
        parcel.writeString(this.f109742b);
    }
}
