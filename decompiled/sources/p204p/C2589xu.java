package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.xu */
/* JADX INFO: loaded from: classes4.dex */
public final class C2589xu implements InterfaceC2626yu {
    public static final Parcelable.Creator<C2589xu> CREATOR = new C2267ps(5);

    /* JADX INFO: renamed from: a */
    public final String f265962a;

    public C2589xu(String str) {
        this.f265962a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2589xu) && wj50.m88271j(this.f265962a, ((C2589xu) obj).f265962a);
    }

    public final int hashCode() {
        return this.f265962a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f265962a);
    }
}
