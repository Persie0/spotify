package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f3z0 extends AbstractC2202o5 {
    public static final Parcelable.Creator<f3z0> CREATOR = new fb31(14);

    /* JADX INFO: renamed from: c */
    public boolean f65616c;

    public f3z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f65616c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return edb.m38570s(sb, this.f65616c, "}");
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f65616c));
    }
}
