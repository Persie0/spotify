package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kj7 implements Parcelable {
    public static final Parcelable.Creator<kj7> CREATOR = new na7(7);

    /* JADX INFO: renamed from: a */
    public final byte[] f123256a;

    public kj7(byte[] bArr) {
        this.f123256a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return kj7.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.f123256a, ((kj7) obj).f123256a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f123256a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f123256a);
    }
}
