package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class qk80 implements Parcelable {
    public static final Parcelable.Creator<qk80> CREATOR = new i980(15);

    /* JADX INFO: renamed from: a */
    public final String f189495a;

    public /* synthetic */ qk80(String str) {
        this.f189495a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qk80) {
            return wj50.m88271j(this.f189495a, ((qk80) obj).f189495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f189495a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("LineText(value=", this.f189495a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f189495a);
    }
}
