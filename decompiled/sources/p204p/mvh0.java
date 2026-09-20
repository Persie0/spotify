package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mvh0 implements Parcelable {
    public static final Parcelable.Creator<mvh0> CREATOR = new xuf0(24);

    /* JADX INFO: renamed from: a */
    public final cy91 f147585a;

    /* JADX INFO: renamed from: b */
    public final boolean f147586b;

    /* JADX INFO: renamed from: c */
    public final String f147587c;

    /* JADX INFO: renamed from: d */
    public final boolean f147588d;

    public mvh0(cy91 cy91Var, boolean z, String str, boolean z2) {
        this.f147585a = cy91Var;
        this.f147586b = z;
        this.f147587c = str;
        this.f147588d = z2;
    }

    /* JADX INFO: renamed from: c */
    public static mvh0 m62932c(mvh0 mvh0Var, boolean z) {
        cy91 cy91Var = mvh0Var.f147585a;
        String str = mvh0Var.f147587c;
        boolean z2 = mvh0Var.f147588d;
        mvh0Var.getClass();
        return new mvh0(cy91Var, z, str, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvh0)) {
            return false;
        }
        mvh0 mvh0Var = (mvh0) obj;
        return wj50.m88271j(this.f147585a, mvh0Var.f147585a) && this.f147586b == mvh0Var.f147586b && wj50.m88271j(this.f147587c, mvh0Var.f147587c) && this.f147588d == mvh0Var.f147588d;
    }

    public final int hashCode() {
        this.f147585a.getClass();
        return Boolean.hashCode(this.f147588d) + s571.m77243b(s571.m77245d(-925021861, 31, this.f147586b), 31, this.f147587c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f147585a, i);
        parcel.writeInt(this.f147586b ? 1 : 0);
        parcel.writeString(this.f147587c);
        parcel.writeInt(this.f147588d ? 1 : 0);
    }
}
