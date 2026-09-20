package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eg7 implements Parcelable {
    public static final Parcelable.Creator<eg7> CREATOR = new na7(5);

    /* JADX INFO: renamed from: a */
    public final String f59234a;

    /* JADX INFO: renamed from: b */
    public final byte[] f59235b;

    public eg7(String str, byte[] bArr) {
        this.f59234a = str;
        this.f59235b = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg7)) {
            return false;
        }
        eg7 eg7Var = (eg7) obj;
        return wj50.m88271j(this.f59234a, eg7Var.f59234a) && wj50.m88271j(this.f59235b, eg7Var.f59235b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f59235b) + (this.f59234a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59234a);
        parcel.writeByteArray(this.f59235b);
    }
}
