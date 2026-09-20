package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class p580 implements Parcelable {
    public static final Parcelable.Creator<p580> CREATOR = new o580(0);

    /* JADX INFO: renamed from: a */
    public final boolean f174105a;

    /* JADX INFO: renamed from: b */
    public final ern0 f174106b;

    public p580(boolean z, ern0 ern0Var) {
        this.f174105a = z;
        this.f174106b = ern0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p580)) {
            return false;
        }
        p580 p580Var = (p580) obj;
        return this.f174105a == p580Var.f174105a && wj50.m88271j(this.f174106b, p580Var.f174106b);
    }

    public final int hashCode() {
        return this.f174106b.hashCode() + (Boolean.hashCode(this.f174105a) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f174105a ? 1 : 0);
        AbstractC2328r7 abstractC2328r7 = (AbstractC2328r7) this.f174106b;
        parcel.writeInt(abstractC2328r7.mo36659c());
        for (Map.Entry entry : (ig40) abstractC2328r7.mo36657a()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }
}
