package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kvf {

    /* JADX INFO: renamed from: a */
    public final rfm0 f126856a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f126857b;

    public kvf(rfm0 rfm0Var, Parcelable parcelable) {
        this.f126856a = rfm0Var;
        this.f126857b = parcelable;
    }

    /* JADX INFO: renamed from: a */
    public final rfm0 m57461a() {
        return this.f126856a;
    }

    /* JADX INFO: renamed from: b */
    public final Parcelable m57462b() {
        return this.f126857b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvf)) {
            return false;
        }
        kvf kvfVar = (kvf) obj;
        return wj50.m88271j(this.f126856a, kvfVar.f126856a) && wj50.m88271j(this.f126857b, kvfVar.f126857b);
    }

    public final int hashCode() {
        return this.f126857b.hashCode() + (this.f126856a.hashCode() * 31);
    }
}
