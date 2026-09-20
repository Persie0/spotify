package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zyy implements Parcelable {
    public static final Parcelable.Creator<zyy> CREATOR = new eqy(22);

    /* JADX INFO: renamed from: a */
    public final lyy f287724a;

    public zyy(lyy lyyVar) {
        this.f287724a = lyyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyy) && wj50.m88271j(this.f287724a, ((zyy) obj).f287724a);
    }

    public final int hashCode() {
        return this.f287724a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f287724a.writeToParcel(parcel, i);
    }
}
