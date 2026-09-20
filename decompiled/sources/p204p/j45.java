package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j45 extends AbstractC2206o9 {
    public static final Parcelable.Creator<j45> CREATOR = n6f1.f150875b;

    /* JADX INFO: renamed from: d */
    public static final j45 f108593d;

    /* JADX INFO: renamed from: a */
    public final cvf f108594a;

    /* JADX INFO: renamed from: b */
    public final boolean f108595b;

    /* JADX INFO: renamed from: c */
    public boolean f108596c;

    static {
        int i = 3;
        f108593d = new nn40(i).m65187h();
        nn40 nn40Var = new nn40(i);
        nn40Var.m65192m();
        nn40Var.m65187h();
    }

    public j45(cvf cvfVar, boolean z) {
        this.f108594a = cvfVar;
        this.f108595b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j45)) {
            return false;
        }
        j45 j45Var = (j45) obj;
        return mvl0.m62956s(this.f108594a, j45Var.f108594a) && this.f108596c == j45Var.f108596c && this.f108595b == j45Var.f108595b;
    }

    public final int hashCode() {
        return mvl0.m62961x(this.f108594a, Boolean.valueOf(this.f108596c), Boolean.valueOf(this.f108595b));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f108594a);
        return dq60.m36618r(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f108596c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26307M(parcel, 1, this.f108594a, i);
        alf1.m26295A(parcel, 2, this.f108595b);
        alf1.m26331n(iM26329l, parcel);
    }
}
