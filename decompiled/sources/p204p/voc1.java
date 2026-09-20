package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class voc1 implements Parcelable {
    public static final Parcelable.Creator<voc1> CREATOR = new luh0(18);

    /* JADX INFO: renamed from: b */
    public static final wg61 f243452b = new wg61(foc1.f71502c);

    /* JADX INFO: renamed from: a */
    public final String f243453a;

    public voc1(String str) {
        this.f243453a = str;
    }

    /* JADX INFO: renamed from: c */
    public final fnm0 m86091c() {
        return new fnm0(this.f243453a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof voc1) && wj50.m88271j(this.f243453a, ((voc1) obj).f243453a);
    }

    public final int hashCode() {
        return this.f243453a.hashCode();
    }

    public final String toString() {
        return this.f243453a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f243453a);
    }
}
