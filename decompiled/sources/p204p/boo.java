package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class boo implements Parcelable {
    public static final Parcelable.Creator<boo> CREATOR = new pkl(28);

    /* JADX INFO: renamed from: a */
    public final long f29213a;

    public boo(long j) {
        this.f29213a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boo) && this.f29213a == ((boo) obj).f29213a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29213a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29213a);
    }
}
