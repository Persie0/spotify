package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class qjb0 extends rjb0 {
    public static final Parcelable.Creator<qjb0> CREATOR = new rib0(3);

    /* JADX INFO: renamed from: a */
    public final int f189206a;

    /* JADX INFO: renamed from: b */
    public final int f189207b;

    /* JADX INFO: renamed from: c */
    public final int f189208c;

    /* JADX INFO: renamed from: d */
    public final long f189209d;

    public qjb0(long j, int i, int i2, int i3) {
        this.f189206a = i;
        this.f189207b = i2;
        this.f189208c = i3;
        this.f189209d = j;
    }

    /* JADX INFO: renamed from: c */
    public static qjb0 m72906c(qjb0 qjb0Var, int i, int i2, int i3, long j, int i4) {
        if ((i4 & 1) != 0) {
            i = qjb0Var.f189206a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            i2 = qjb0Var.f189207b;
        }
        int i6 = i2;
        if ((i4 & 4) != 0) {
            i3 = qjb0Var.f189208c;
        }
        int i7 = i3;
        if ((i4 & 8) != 0) {
            j = qjb0Var.f189209d;
        }
        qjb0Var.getClass();
        return new qjb0(j, i5, i6, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjb0)) {
            return false;
        }
        qjb0 qjb0Var = (qjb0) obj;
        return this.f189206a == qjb0Var.f189206a && this.f189207b == qjb0Var.f189207b && this.f189208c == qjb0Var.f189208c && this.f189209d == qjb0Var.f189209d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f189209d) + mt60.m62800g(this.f189208c, mt60.m62800g(this.f189207b, Integer.hashCode(this.f189206a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f189206a);
        parcel.writeInt(this.f189207b);
        parcel.writeInt(this.f189208c);
        parcel.writeLong(this.f189209d);
    }

    public /* synthetic */ qjb0() {
        this(0L, -1, -1, 0);
    }
}
