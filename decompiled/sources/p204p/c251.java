package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c251 implements Parcelable {
    public static final Parcelable.Creator<c251> CREATOR = new q051(12);

    /* JADX INFO: renamed from: a */
    public final String f33300a;

    public /* synthetic */ c251(String str) {
        this.f33300a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c251) {
            return wj50.m88271j(this.f33300a, ((c251) obj).f33300a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33300a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("StepKey(value=", this.f33300a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33300a);
    }
}
