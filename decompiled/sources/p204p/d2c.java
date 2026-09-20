package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class d2c implements i2c {

    /* JADX INFO: renamed from: a */
    public final Parcelable f44534a;

    public d2c(Parcelable parcelable) {
        this.f44534a = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2c) && wj50.m88271j(this.f44534a, ((d2c) obj).f44534a);
    }

    public final int hashCode() {
        return this.f44534a.hashCode();
    }
}
