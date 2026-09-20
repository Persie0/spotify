package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class kfn0 implements Parcelable {
    public static final Parcelable.Creator<kfn0> CREATOR = new n9n0(14);

    /* JADX INFO: renamed from: a */
    public final String f122196a;

    /* JADX INFO: renamed from: b */
    public final String f122197b;

    /* JADX INFO: renamed from: c */
    public final pfn0 f122198c;

    /* JADX INFO: renamed from: d */
    public final String f122199d;

    /* JADX INFO: renamed from: e */
    public final String f122200e;

    /* JADX INFO: renamed from: f */
    public final qf40 f122201f;

    public kfn0(String str, String str2, pfn0 pfn0Var, String str3, String str4, qf40 qf40Var) {
        this.f122196a = str;
        this.f122197b = str2;
        this.f122198c = pfn0Var;
        this.f122199d = str3;
        this.f122200e = str4;
        this.f122201f = qf40Var;
    }

    /* JADX INFO: renamed from: c */
    public static kfn0 m56301c(kfn0 kfn0Var, String str, qf40 qf40Var, int i) {
        if ((i & 1) != 0) {
            str = kfn0Var.f122196a;
        }
        String str2 = str;
        String str3 = kfn0Var.f122197b;
        pfn0 pfn0Var = kfn0Var.f122198c;
        String str4 = kfn0Var.f122199d;
        String str5 = kfn0Var.f122200e;
        if ((i & 32) != 0) {
            qf40Var = kfn0Var.f122201f;
        }
        kfn0Var.getClass();
        return new kfn0(str2, str3, pfn0Var, str4, str5, qf40Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfn0)) {
            return false;
        }
        kfn0 kfn0Var = (kfn0) obj;
        return wj50.m88271j(this.f122196a, kfn0Var.f122196a) && wj50.m88271j(this.f122197b, kfn0Var.f122197b) && wj50.m88271j(this.f122198c, kfn0Var.f122198c) && wj50.m88271j(this.f122199d, kfn0Var.f122199d) && wj50.m88271j(this.f122200e, kfn0Var.f122200e) && wj50.m88271j(this.f122201f, kfn0Var.f122201f);
    }

    /* JADX INFO: renamed from: g */
    public final n300 m56302g(String str) {
        Object next;
        Iterator<E> it = this.f122201f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((pen0) next).f176785a, str));
        pen0 pen0Var = (pen0) next;
        if (pen0Var != null) {
            return pen0Var.f176792h;
        }
        return null;
    }

    public final int hashCode() {
        return this.f122201f.hashCode() + s571.m77243b(s571.m77243b((this.f122198c.hashCode() + s571.m77243b(this.f122196a.hashCode() * 31, 31, this.f122197b)) * 31, 31, this.f122199d), 31, this.f122200e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f122196a);
        parcel.writeString(this.f122197b);
        this.f122198c.writeToParcel(parcel, i);
        parcel.writeString(this.f122199d);
        parcel.writeString(this.f122200e);
        qf40 qf40Var = this.f122201f;
        parcel.writeInt(((AbstractC2282q6) qf40Var).size());
        Iterator it = qf40Var.iterator();
        while (it.hasNext()) {
            ((pen0) it.next()).writeToParcel(parcel, i);
        }
    }
}
