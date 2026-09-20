package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class w7f implements Parcelable {
    public static final Parcelable.Creator<w7f> CREATOR = new rae(12);

    /* JADX INFO: renamed from: a */
    public final long f248662a;

    /* JADX INFO: renamed from: b */
    public final long f248663b;

    /* JADX INFO: renamed from: c */
    public final long f248664c;

    /* JADX INFO: renamed from: d */
    public final long f248665d;

    /* JADX INFO: renamed from: e */
    public final long f248666e;

    public w7f(long j, long j2, long j3, long j4, long j5) {
        this.f248662a = j;
        this.f248663b = j2;
        this.f248664c = j3;
        this.f248665d = j4;
        this.f248666e = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7f)) {
            return false;
        }
        w7f w7fVar = (w7f) obj;
        long j = w7fVar.f248662a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f248662a, j) && as91.m27074b(this.f248663b, w7fVar.f248663b) && as91.m27074b(this.f248664c, w7fVar.f248664c) && as91.m27074b(this.f248665d, w7fVar.f248665d) && as91.m27074b(this.f248666e, w7fVar.f248666e);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f248666e) + dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f248662a) * 31, this.f248663b, 31), this.f248664c, 31), this.f248665d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(rfg1.m75429D(this.f248662a));
        parcel.writeInt(rfg1.m75429D(this.f248663b));
        parcel.writeInt(rfg1.m75429D(this.f248664c));
        parcel.writeInt(rfg1.m75429D(this.f248665d));
        parcel.writeInt(rfg1.m75429D(this.f248666e));
    }
}
