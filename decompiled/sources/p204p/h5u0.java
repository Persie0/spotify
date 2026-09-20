package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class h5u0 implements Parcelable {
    public static final Parcelable.Creator<h5u0> CREATOR = new vit0(27);

    /* JADX INFO: renamed from: a */
    public final b450 f87906a;

    /* JADX INFO: renamed from: b */
    public final b450 f87907b;

    /* JADX INFO: renamed from: c */
    public final int f87908c;

    public h5u0(b450 b450Var, b450 b450Var2, int i) {
        this.f87906a = b450Var;
        this.f87907b = b450Var2;
        this.f87908c = i;
    }

    /* JADX INFO: renamed from: c */
    public static h5u0 m46698c(h5u0 h5u0Var, b450 b450Var, b450 b450Var2, int i, int i2) {
        if ((i2 & 1) != 0) {
            b450Var = h5u0Var.f87906a;
        }
        if ((i2 & 2) != 0) {
            b450Var2 = h5u0Var.f87907b;
        }
        if ((i2 & 4) != 0) {
            i = h5u0Var.f87908c;
        }
        h5u0Var.getClass();
        return new h5u0(b450Var, b450Var2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5u0)) {
            return false;
        }
        h5u0 h5u0Var = (h5u0) obj;
        return wj50.m88271j(this.f87906a, h5u0Var.f87906a) && wj50.m88271j(this.f87907b, h5u0Var.f87907b) && this.f87908c == h5u0Var.f87908c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87908c) + stz0.m79353g(this.f87906a.hashCode() * 31, 31, this.f87907b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b450 b450Var = this.f87906a;
        parcel.writeInt(b450Var.f278778a);
        parcel.writeInt(b450Var.f278779b);
        b450 b450Var2 = this.f87907b;
        parcel.writeInt(b450Var2.f278778a);
        parcel.writeInt(b450Var2.f278779b);
        parcel.writeInt(this.f87908c);
    }
}
