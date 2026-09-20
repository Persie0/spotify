package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class xl7 implements zl7 {
    public static final Parcelable.Creator<xl7> CREATOR = new na7(9);

    /* JADX INFO: renamed from: a */
    public final sh7 f263060a;

    public xl7(sh7 sh7Var) {
        this.f263060a = sh7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl7) && this.f263060a == ((xl7) obj).f263060a;
    }

    public final int hashCode() {
        sh7 sh7Var = this.f263060a;
        if (sh7Var == null) {
            return 0;
        }
        return sh7Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        sh7 sh7Var = this.f263060a;
        if (sh7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sh7Var.name());
        }
    }
}
