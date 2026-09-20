package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ail implements eil {
    public static final Parcelable.Creator<ail> CREATOR = new z4l(20);

    /* JADX INFO: renamed from: a */
    public final String f16008a;

    public ail(String str) {
        this.f16008a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ail) && wj50.m88271j(this.f16008a, ((ail) obj).f16008a);
    }

    public final int hashCode() {
        return this.f16008a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16008a);
    }
}
