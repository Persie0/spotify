package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class u00 extends e10 {
    public static final Parcelable.Creator<u00> CREATOR = new C2267ps(14);

    /* JADX INFO: renamed from: a */
    public final String f225339a;

    public u00(String str) {
        super(str);
        this.f225339a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u00) && wj50.m88271j(this.f225339a, ((u00) obj).f225339a);
    }

    public final int hashCode() {
        return this.f225339a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f225339a);
    }
}
