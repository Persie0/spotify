package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ji51 implements Comparable, Parcelable {
    public static final Parcelable.Creator<ji51> CREATOR = new nc51(7);

    /* JADX INFO: renamed from: d */
    public static final String f112665d;

    /* JADX INFO: renamed from: e */
    public static final String f112666e;

    /* JADX INFO: renamed from: f */
    public static final String f112667f;

    /* JADX INFO: renamed from: a */
    public final int f112668a;

    /* JADX INFO: renamed from: b */
    public final int f112669b;

    /* JADX INFO: renamed from: c */
    public final int f112670c;

    static {
        String str = h0b1.f86200a;
        f112665d = Integer.toString(0, 36);
        f112666e = Integer.toString(1, 36);
        f112667f = Integer.toString(2, 36);
    }

    public ji51(int i, int i2, int i3) {
        this.f112668a = i;
        this.f112669b = i2;
        this.f112670c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ji51 ji51Var = (ji51) obj;
        int i = this.f112668a - ji51Var.f112668a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f112669b - ji51Var.f112669b;
        return i2 == 0 ? this.f112670c - ji51Var.f112670c : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ji51.class == obj.getClass()) {
            ji51 ji51Var = (ji51) obj;
            if (this.f112668a == ji51Var.f112668a && this.f112669b == ji51Var.f112669b && this.f112670c == ji51Var.f112670c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f112668a * 31) + this.f112669b) * 31) + this.f112670c;
    }

    public final String toString() {
        return this.f112668a + "." + this.f112669b + "." + this.f112670c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f112668a);
        parcel.writeInt(this.f112669b);
        parcel.writeInt(this.f112670c);
    }

    public ji51(Parcel parcel) {
        this.f112668a = parcel.readInt();
        this.f112669b = parcel.readInt();
        this.f112670c = parcel.readInt();
    }
}
