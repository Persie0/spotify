package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hjz implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f92293a;

    /* JADX INFO: renamed from: b */
    public static final wp6 f92292b = new wp6(gjz.f80651h);
    public static final Parcelable.Creator<hjz> CREATOR = new ygz(2);

    public /* synthetic */ hjz(String str) {
        this.f92293a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hjz) {
            return wj50.m88271j(this.f92293a, ((hjz) obj).f92293a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92293a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("FlowId(value=", this.f92293a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92293a);
    }
}
