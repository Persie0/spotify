package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ka51 implements la51 {
    public static final Parcelable.Creator<ka51> CREATOR = new q051(27);

    /* JADX INFO: renamed from: a */
    public final int f120801a;

    /* JADX INFO: renamed from: b */
    public final int f120802b;

    public ka51(int i, int i2) {
        this.f120801a = i;
        this.f120802b = i2;
    }

    @Override // p204p.la51
    /* JADX INFO: renamed from: G */
    public final int mo55868G() {
        return this.f120802b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka51)) {
            return false;
        }
        ka51 ka51Var = (ka51) obj;
        return this.f120801a == ka51Var.f120801a && this.f120802b == ka51Var.f120802b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120802b) + (Integer.hashCode(this.f120801a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120801a);
        parcel.writeInt(this.f120802b);
    }
}
