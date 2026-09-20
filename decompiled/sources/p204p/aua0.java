package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class aua0 implements cua0 {
    public static final Parcelable.Creator<aua0> CREATOR = new ama0(10);

    /* JADX INFO: renamed from: a */
    public final String f19900a;

    public aua0(String str) {
        this.f19900a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aua0) && wj50.m88271j(this.f19900a, ((aua0) obj).f19900a);
    }

    public final int hashCode() {
        return this.f19900a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19900a);
    }
}
