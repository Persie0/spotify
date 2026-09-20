package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class l8x0 implements Parcelable {
    public static final Parcelable.Creator<l8x0> CREATOR = new xxw0(12);

    /* JADX INFO: renamed from: a */
    public final String f130956a;

    /* JADX INFO: renamed from: b */
    public final String f130957b;

    /* JADX INFO: renamed from: c */
    public final String f130958c;

    /* JADX INFO: renamed from: d */
    public final byte[] f130959d;

    public l8x0(String str, String str2, byte[] bArr, String str3) {
        this.f130956a = str;
        this.f130957b = str2;
        this.f130958c = str3;
        this.f130959d = bArr;
    }

    /* JADX INFO: renamed from: c */
    public final String m58489c() {
        return this.f130957b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getUri() {
        return this.f130956a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130956a);
        parcel.writeString(this.f130957b);
        parcel.writeString(this.f130958c);
        parcel.writeByteArray(this.f130959d);
    }
}
