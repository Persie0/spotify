package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rnz0 implements Parcelable {
    public static final Parcelable.Creator<rnz0> CREATOR = new vcz0(6);

    /* JADX INFO: renamed from: a */
    public final String f201027a;

    public /* synthetic */ rnz0() {
        this("");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnz0) && wj50.m88271j(this.f201027a, ((rnz0) obj).f201027a);
    }

    public final int hashCode() {
        return this.f201027a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f201027a);
    }

    public rnz0(String str) {
        this.f201027a = str;
    }
}
