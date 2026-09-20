package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zds extends bes {
    public static final Parcelable.Creator<zds> CREATOR = new f9s(3);

    /* JADX INFO: renamed from: a */
    public final uk91 f281786a;

    public zds(uk91 uk91Var) {
        this.f281786a = uk91Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zds) && wj50.m88271j(this.f281786a, ((zds) obj).f281786a);
    }

    public final int hashCode() {
        return this.f281786a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f281786a.writeToParcel(parcel, i);
    }
}
