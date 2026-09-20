package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class yrh implements sv31, Parcelable {
    public static final Parcelable.Creator<yrh> CREATOR = new rae(22);

    /* JADX INFO: renamed from: a */
    public final String f275478a;

    /* JADX INFO: renamed from: b */
    public final String f275479b;

    /* JADX INFO: renamed from: c */
    public final String f275480c;

    /* JADX INFO: renamed from: d */
    public final avo0 f275481d;

    public yrh(String str, String str2, String str3, avo0 avo0Var) {
        this.f275478a = str;
        this.f275479b = str2;
        this.f275480c = str3;
        this.f275481d = avo0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.sv31
    public final String getKey() {
        return this.f275478a;
    }

    public final String toString() {
        String str = this.f275479b;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f275478a);
        parcel.writeString(this.f275479b);
        parcel.writeString(this.f275480c);
        parcel.writeTypedObject(this.f275481d, i);
    }
}
