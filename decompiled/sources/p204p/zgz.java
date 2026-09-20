package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class zgz extends ojv0 implements qgz {
    public static final Parcelable.Creator<zgz> CREATOR = new ygz(0);

    /* JADX INFO: renamed from: X */
    public int f282739X;

    /* JADX INFO: renamed from: Y */
    public int f282740Y;

    /* JADX INFO: renamed from: Z */
    public boolean f282741Z;

    /* JADX INFO: renamed from: e */
    public float f282742e;

    /* JADX INFO: renamed from: f */
    public float f282743f;

    /* JADX INFO: renamed from: g */
    public int f282744g;

    /* JADX INFO: renamed from: h */
    public float f282745h;

    /* JADX INFO: renamed from: i */
    public int f282746i;

    /* JADX INFO: renamed from: t */
    public int f282747t;

    @Override // p204p.qgz
    /* JADX INFO: renamed from: B1 */
    public final int mo72763B1() {
        return this.f282740Y;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: D0 */
    public final int mo72764D0() {
        return this.f282739X;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: L */
    public final int mo72765L() {
        return this.f282744g;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: N */
    public final float mo72766N() {
        return this.f282743f;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: Q */
    public final int mo72767Q() {
        return this.f282746i;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: X0 */
    public final void mo72768X0(int i) {
        this.f282746i = i;
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
        return 1;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: i0 */
    public final void mo72774i0(int i) {
        this.f282747t = i;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: k0 */
    public final float mo72775k0() {
        return this.f282742e;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: l0 */
    public final float mo72776l0() {
        return this.f282745h;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: u1 */
    public final int mo72777u1() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: v1 */
    public final int mo72778v1() {
        return this.f282747t;
    }

    @Override // p204p.qgz
    /* JADX INFO: renamed from: w0 */
    public final boolean mo72779w0() {
        return this.f282741Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f282742e);
        parcel.writeFloat(this.f282743f);
        parcel.writeInt(this.f282744g);
        parcel.writeFloat(this.f282745h);
        parcel.writeInt(this.f282746i);
        parcel.writeInt(this.f282747t);
        parcel.writeInt(this.f282739X);
        parcel.writeInt(this.f282740Y);
        parcel.writeByte(this.f282741Z ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
