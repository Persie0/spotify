package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class v8j0 implements Parcelable {
    public static final Parcelable.Creator<v8j0> CREATOR = new rri0(13);

    /* JADX INFO: renamed from: a */
    public final String f238585a;

    /* JADX INFO: renamed from: b */
    public final Bundle f238586b;

    public v8j0(String str, Bundle bundle) {
        this.f238585a = str;
        this.f238586b = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8j0)) {
            return false;
        }
        v8j0 v8j0Var = (v8j0) obj;
        return wj50.m88271j(this.f238585a, v8j0Var.f238585a) && wj50.m88271j(this.f238586b, v8j0Var.f238586b);
    }

    public final int hashCode() {
        int iHashCode = this.f238585a.hashCode() * 31;
        Bundle bundle = this.f238586b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238585a);
        parcel.writeBundle(this.f238586b);
    }
}
