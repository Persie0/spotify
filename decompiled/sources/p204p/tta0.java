package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tta0 implements xta0 {
    public static final Parcelable.Creator<tta0> CREATOR = new ama0(4);

    /* JADX INFO: renamed from: a */
    public final String f223565a;

    public tta0(String str) {
        this.f223565a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tta0) && wj50.m88271j(this.f223565a, ((tta0) obj).f223565a);
    }

    public final int hashCode() {
        return this.f223565a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f223565a);
    }
}
