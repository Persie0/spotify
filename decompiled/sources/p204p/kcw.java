package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class kcw implements Parcelable {
    public static final Parcelable.Creator<kcw> CREATOR = new bwv(19);

    /* JADX INFO: renamed from: a */
    public final String f121555a;

    public kcw(String str) {
        this.f121555a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcw) && wj50.m88271j(this.f121555a, ((kcw) obj).f121555a);
    }

    public final String getUri() {
        return this.f121555a;
    }

    public final int hashCode() {
        return this.f121555a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121555a);
    }
}
