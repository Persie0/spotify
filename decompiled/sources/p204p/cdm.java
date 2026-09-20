package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cdm implements Parcelable {
    public static final Parcelable.Creator<cdm> CREATOR = new pkl(21);

    /* JADX INFO: renamed from: a */
    public final String f36909a;

    public cdm(String str) {
        this.f36909a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdm) && wj50.m88271j(this.f36909a, ((cdm) obj).f36909a);
    }

    public final int hashCode() {
        return this.f36909a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36909a);
    }
}
