package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class t9r implements Parcelable {
    public static final Parcelable.Creator<t9r> CREATOR = new o5r(7);

    /* JADX INFO: renamed from: a */
    public final String f218348a;

    /* JADX INFO: renamed from: b */
    public final boolean f218349b;

    public t9r(String str, boolean z) {
        this.f218348a = str;
        this.f218349b = z;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m80314c() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("device.picker.bottom.sheet.args", this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9r)) {
            return false;
        }
        t9r t9rVar = (t9r) obj;
        return wj50.m88271j(this.f218348a, t9rVar.f218348a) && this.f218349b == t9rVar.f218349b;
    }

    public final int hashCode() {
        String str = this.f218348a;
        return Boolean.hashCode(this.f218349b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f218348a);
        parcel.writeInt(this.f218349b ? 1 : 0);
    }
}
