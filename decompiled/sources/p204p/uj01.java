package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class uj01 extends ck01 {
    public static final Parcelable.Creator<uj01> CREATOR = new vcz0(29);

    /* JADX INFO: renamed from: a */
    public final float f230854a;

    /* JADX INFO: renamed from: b */
    public final float f230855b;

    /* JADX INFO: renamed from: c */
    public final float f230856c;

    public uj01(float f, float f2) {
        this.f230854a = f;
        this.f230855b = f2;
        leu.f132721a.getClass();
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalStateException("Aspect ratio width and height must be bigger than zero.");
        }
        float f3 = f / f2;
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Aspect ratio value must be bigger than zero.");
        }
        this.f230856c = f3;
    }

    @Override // p204p.ck01
    /* JADX INFO: renamed from: c */
    public final float mo26181c() {
        return this.f230856c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj01)) {
            return false;
        }
        uj01 uj01Var = (uj01) obj;
        return Float.compare(this.f230854a, uj01Var.f230854a) == 0 && Float.compare(this.f230855b, uj01Var.f230855b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f230855b) + (Float.hashCode(this.f230854a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f230854a);
        parcel.writeFloat(this.f230855b);
    }
}
