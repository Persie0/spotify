package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class gbj implements ibj {
    public static final Parcelable.Creator<gbj> CREATOR = new f2i(26);

    /* JADX INFO: renamed from: a */
    public final String f78311a;

    public gbj(String str) {
        this.f78311a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbj) && wj50.m88271j(this.f78311a, ((gbj) obj).f78311a);
    }

    public final int hashCode() {
        String str = this.f78311a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f78311a);
    }
}
