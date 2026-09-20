package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mvw extends g3x {
    public static final Parcelable.Creator<mvw> CREATOR = new wfw(5);

    /* JADX INFO: renamed from: a */
    public final z650 f147662a;

    public mvw(z650 z650Var) {
        this.f147662a = z650Var;
    }

    /* JADX INFO: renamed from: c */
    public final z650 m62970c() {
        return this.f147662a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvw) && wj50.m88271j(this.f147662a, ((mvw) obj).f147662a);
    }

    public final int hashCode() {
        return this.f147662a.f279709a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f147662a);
    }
}
