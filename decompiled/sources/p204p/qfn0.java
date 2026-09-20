package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qfn0 implements Parcelable {
    public static final Parcelable.Creator<qfn0> CREATOR = new n9n0(18);

    /* JADX INFO: renamed from: a */
    public final String[] f188266a;

    public qfn0(String str) {
        int i = 0;
        if (str == null || str.isEmpty()) {
            this.f188266a = new String[0];
            return;
        }
        this.f188266a = str.split(";");
        while (true) {
            String[] strArr = this.f188266a;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = strArr[i].trim();
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qfn0) {
            return Arrays.equals(this.f188266a, ((qfn0) obj).f188266a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f188266a);
    }

    public final String toString() {
        return TextUtils.join(";", this.f188266a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.f188266a);
    }

    public qfn0(Parcel parcel) {
        this.f188266a = parcel.createStringArray();
    }
}
