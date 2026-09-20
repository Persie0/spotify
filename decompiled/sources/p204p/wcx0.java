package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class wcx0 implements Parcelable {
    public static final Parcelable.Creator<wcx0> CREATOR = new xxw0(13);

    /* JADX INFO: renamed from: a */
    public final String f250138a;

    public /* synthetic */ wcx0(String str) {
        this.f250138a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wcx0) {
            return wj50.m88271j(this.f250138a, ((wcx0) obj).f250138a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f250138a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("ReturnUrl(value=", this.f250138a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f250138a);
    }
}
