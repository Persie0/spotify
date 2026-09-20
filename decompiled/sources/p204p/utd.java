package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class utd extends vtd {
    public static final Parcelable.Creator<utd> CREATOR = new fjd(18);

    /* JADX INFO: renamed from: a */
    public final String f233894a;

    public utd(String str) {
        this.f233894a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utd) && wj50.m88271j(this.f233894a, ((utd) obj).f233894a);
    }

    public final int hashCode() {
        return this.f233894a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f233894a);
    }
}
