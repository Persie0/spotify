package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class h1u implements Parcelable {
    public static final Parcelable.Creator<h1u> CREATOR = new qct(6);

    /* JADX INFO: renamed from: a */
    public final b2u f86708a;

    /* JADX INFO: renamed from: b */
    public final boolean f86709b;

    /* JADX INFO: renamed from: c */
    public final boolean f86710c;

    /* JADX INFO: renamed from: d */
    public final boolean f86711d;

    public h1u(b2u b2uVar, boolean z, boolean z2, boolean z3) {
        this.f86708a = b2uVar;
        this.f86709b = z;
        this.f86710c = z2;
        this.f86711d = z3;
    }

    /* JADX INFO: renamed from: c */
    public static h1u m46466c(h1u h1uVar, b2u b2uVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            b2uVar = h1uVar.f86708a;
        }
        if ((i & 2) != 0) {
            z = h1uVar.f86709b;
        }
        boolean z3 = (i & 4) != 0 ? h1uVar.f86710c : true;
        if ((i & 8) != 0) {
            z2 = h1uVar.f86711d;
        }
        h1uVar.getClass();
        return new h1u(b2uVar, z, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1u)) {
            return false;
        }
        h1u h1uVar = (h1u) obj;
        return wj50.m88271j(this.f86708a, h1uVar.f86708a) && this.f86709b == h1uVar.f86709b && this.f86710c == h1uVar.f86710c && this.f86711d == h1uVar.f86711d;
    }

    /* JADX INFO: renamed from: g */
    public final String m46467g() {
        Object objInvoke;
        awt awtVar = awt.f20674R0;
        awt awtVar2 = awt.f20675S0;
        awt awtVar3 = awt.f20676T0;
        awt awtVar4 = awt.f20677U0;
        awt awtVar5 = awt.f20678V0;
        awt awtVar6 = awt.f20679W0;
        b2u b2uVar = this.f86708a;
        b2uVar.getClass();
        if (b2uVar instanceof v1u) {
            objInvoke = awtVar.invoke(b2uVar);
        } else if (b2uVar instanceof w1u) {
            objInvoke = awtVar2.invoke(b2uVar);
        } else if (b2uVar instanceof x1u) {
            objInvoke = awtVar3.invoke(b2uVar);
        } else if (b2uVar instanceof a2u) {
            objInvoke = awtVar4.invoke(b2uVar);
        } else if (b2uVar instanceof y1u) {
            objInvoke = awtVar5.invoke(b2uVar);
        } else {
            if (!(b2uVar instanceof z1u)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = awtVar6.invoke(b2uVar);
        }
        return (String) objInvoke;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86711d) + s571.m77245d(s571.m77245d(this.f86708a.hashCode() * 31, 31, this.f86709b), 31, this.f86710c);
    }

    public final String toString() {
        return "EmailModel(emailState=" + qpv0.f191387a.mo54112b(this.f86708a.getClass()).mo29111F() + ", hasConnection=" + this.f86709b + ", useHints=" + this.f86710c + ", wasAutofillUsed=" + this.f86711d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f86708a, i);
        parcel.writeInt(this.f86709b ? 1 : 0);
        parcel.writeInt(this.f86710c ? 1 : 0);
        parcel.writeInt(this.f86711d ? 1 : 0);
    }

    public /* synthetic */ h1u(x1u x1uVar, int i) {
        this((i & 1) != 0 ? v1u.f236476a : x1uVar, true, false, false);
    }
}
