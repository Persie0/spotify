package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wi7 implements Parcelable {
    public static final Parcelable.Creator<wi7> CREATOR = new na7(6);

    /* JADX INFO: renamed from: a */
    public final String f251542a;

    /* JADX INFO: renamed from: b */
    public final C1856fd f251543b;

    /* JADX INFO: renamed from: c */
    public final eg7 f251544c;

    static {
        "".getBytes(vuc.f244913a);
    }

    public wi7(String str, C1856fd c1856fd, eg7 eg7Var) {
        this.f251542a = str;
        this.f251543b = c1856fd;
        this.f251544c = eg7Var;
    }

    /* JADX INFO: renamed from: c */
    public static wi7 m88190c(wi7 wi7Var, C1856fd c1856fd) {
        String str = wi7Var.f251542a;
        eg7 eg7Var = wi7Var.f251544c;
        wi7Var.getClass();
        return new wi7(str, c1856fd, eg7Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi7)) {
            return false;
        }
        wi7 wi7Var = (wi7) obj;
        return wj50.m88271j(this.f251542a, wi7Var.f251542a) && wj50.m88271j(this.f251543b, wi7Var.f251543b) && wj50.m88271j(this.f251544c, wi7Var.f251544c);
    }

    public final int hashCode() {
        int iHashCode = this.f251542a.hashCode() * 31;
        C1856fd c1856fd = this.f251543b;
        return this.f251544c.hashCode() + ((iHashCode + (c1856fd == null ? 0 : c1856fd.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f251542a);
        C1856fd c1856fd = this.f251543b;
        if (c1856fd == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c1856fd.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f251544c, i);
    }
}
