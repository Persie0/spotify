package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class wgz extends ViewGroup.MarginLayoutParams implements qgz {
    public static final Parcelable.Creator<wgz> CREATOR = new c2z(29);

    /* JADX INFO: renamed from: a */
    public int f251201a;

    /* JADX INFO: renamed from: b */
    public float f251202b;

    /* JADX INFO: renamed from: c */
    public float f251203c;

    /* JADX INFO: renamed from: d */
    public int f251204d;

    /* JADX INFO: renamed from: e */
    public float f251205e;

    /* JADX INFO: renamed from: f */
    public int f251206f;

    /* JADX INFO: renamed from: g */
    public int f251207g;

    /* JADX INFO: renamed from: h */
    public int f251208h;

    /* JADX INFO: renamed from: i */
    public int f251209i;

    /* JADX INFO: renamed from: t */
    public boolean f251210t;

    @Override // p204p.qgz
    /* JADX INFO: renamed from: B1 */
    public final int mo72763B1() {
        return this.f251209i;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: D0 */
    public final int mo72764D0() {
        return this.f251208h;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: L */
    public final int mo72765L() {
        return this.f251204d;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: N */
    public final float mo72766N() {
        return this.f251203c;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: Q */
    public final int mo72767Q() {
        return this.f251206f;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: X0 */
    public final void mo72768X0(int i) {
        this.f251206f = i;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: Y0 */
    public final int mo72769Y0() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: Z0 */
    public final int mo72770Z0() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: b */
    public final int mo72771b() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: c0 */
    public final int mo72772c0() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: d */
    public final int mo72773d() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.qgz
    public final int getOrder() {
        return this.f251201a;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: i0 */
    public final void mo72774i0(int i) {
        this.f251207g = i;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: k0 */
    public final float mo72775k0() {
        return this.f251202b;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: l0 */
    public final float mo72776l0() {
        return this.f251205e;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: u1 */
    public final int mo72777u1() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: v1 */
    public final int mo72778v1() {
        return this.f251207g;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: w0 */
    public final boolean mo72779w0() {
        return this.f251210t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f251201a);
        parcel.writeFloat(this.f251202b);
        parcel.writeFloat(this.f251203c);
        parcel.writeInt(this.f251204d);
        parcel.writeFloat(this.f251205e);
        parcel.writeInt(this.f251206f);
        parcel.writeInt(this.f251207g);
        parcel.writeInt(this.f251208h);
        parcel.writeInt(this.f251209i);
        parcel.writeByte(this.f251210t ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
