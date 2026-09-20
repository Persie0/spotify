package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xs01 implements Parcelable {
    public static final Parcelable.Creator<xs01> CREATOR = new sp01(17);

    /* JADX INFO: renamed from: a */
    public final String f265445a;

    public /* synthetic */ xs01(String str) {
        this.f265445a = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m91959c(String str) {
        return s571.m77251j("ShareIntegrationId(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xs01) {
            return wj50.m88271j(this.f265445a, ((xs01) obj).f265445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f265445a.hashCode();
    }

    public final String toString() {
        return m91959c(this.f265445a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f265445a);
    }
}
