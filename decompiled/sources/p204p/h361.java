package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class h361 implements Parcelable {
    public static final Parcelable.Creator<h361> CREATOR = new e361(2);

    /* JADX INFO: renamed from: a */
    public final g361 f87151a;

    /* JADX INFO: renamed from: b */
    public final boolean f87152b;

    public h361(g361 g361Var, boolean z) {
        this.f87151a = g361Var;
        this.f87152b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h361)) {
            return false;
        }
        h361 h361Var = (h361) obj;
        return wj50.m88271j(this.f87151a, h361Var.f87151a) && this.f87152b == h361Var.f87152b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87152b) + (this.f87151a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f87151a.writeToParcel(parcel, i);
        parcel.writeInt(this.f87152b ? 1 : 0);
    }
}
