package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.AbstractC0110a;

/* JADX INFO: loaded from: classes3.dex */
public final class xjv0 extends AbstractC2202o5 {
    public static final Parcelable.Creator<xjv0> CREATOR = new fb31(13);

    /* JADX INFO: renamed from: c */
    public Parcelable f262233c;

    public xjv0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f262233c = parcel.readParcelable(classLoader == null ? AbstractC0110a.class.getClassLoader() : classLoader);
    }

    /* JADX INFO: renamed from: g */
    public final void m91252g(xjv0 xjv0Var) {
        this.f262233c = xjv0Var.f262233c;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f262233c, 0);
    }

    public xjv0(Parcelable parcelable) {
        super(parcelable);
    }
}
