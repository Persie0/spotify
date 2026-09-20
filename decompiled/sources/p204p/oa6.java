package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class oa6 implements ra6 {
    public static final Parcelable.Creator<oa6> CREATOR = new vp5(17);

    /* JADX INFO: renamed from: a */
    public final String f163242a;

    public /* synthetic */ oa6(String str) {
        this.f163242a = str;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ oa6 m66522c(String str) {
        return new oa6(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oa6) {
            return wj50.m88271j(this.f163242a, ((oa6) obj).f163242a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f163242a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("FileId(value=", this.f163242a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f163242a);
    }
}
