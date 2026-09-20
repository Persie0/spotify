package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class tqu extends wwu {
    public static final Parcelable.Creator<tqu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final tqu f222887c;

    /* JADX INFO: renamed from: d */
    public static final int f222888d;

    static {
        sd40 sd40VarM75321b = jwg1.f116643a;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.HeadphonesOptimize16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            pk31 pk31Var = new pk31(n6f.f150862b);
            sep sepVarM62656j = mrx0.m62656j(6.553f, 0.421f);
            sepVarM62656j.m77933g(8.0f, 8.0f, false, true, 2.26f, -0.09f);
            sepVarM62656j.m77933g(2.75f, 2.75f, false, false, -0.967f, 1.46f);
            sepVarM62656j.m77933g(6.5f, 6.5f, false, false, -5.938f, 4.227f);
            sepVarM62656j.m77932f(6.5f, 6.5f, false, false, 1.507f, 8.6f);
            sepVarM62656j.m77942p(1.39f);
            sepVarM62656j.m77933g(2.31f, 2.31f, false, true, 2.0f, 1.15f);
            sepVarM62656j.m77944r(1.211f, 2.09f);
            sepVarM62656j.m77933g(2.292f, 2.292f, true, true, -3.966f, 2.295f);
            sepVarM62656j.m77944r(-0.914f, -1.585f);
            sepVarM62656j.m77932f(8.004f, 8.004f, false, true, 6.553f, 0.421f);
            sepVarM62656j.m77945s(1.755f, 10.1f);
            sepVarM62656j.m77939m(0.172f, 0.594f, 0.426f, 1.151f, 0.749f, 1.662f);
            sepVarM62656j.m77944r(0.008f, 0.013f);
            sepVarM62656j.m77944r(0.93f, 1.611f);
            sepVarM62656j.m77933g(0.792f, 0.792f, false, false, 1.37f, -0.792f);
            sepVarM62656j.m77943q(3.6f, 10.503f);
            sepVarM62656j.m77933g(0.81f, 0.81f, false, false, -0.702f, -0.403f);
            sepVarM62656j.m77937k();
            sepVarM62656j.m77945s(15.872f, 6.88f);
            sepVarM62656j.m77939m(0.13f, 0.724f, 0.162f, 1.464f, 0.089f, 2.2f);
            sepVarM62656j.m77933g(8.0f, 8.0f, false, true, -1.19f, 3.472f);
            sepVarM62656j.m77944r(-0.914f, 1.583f);
            sepVarM62656j.m77933g(2.295f, 2.295f, false, true, -3.131f, 0.836f);
            sepVarM62656j.m77933g(2.293f, 2.293f, false, true, -0.836f, -3.13f);
            sepVarM62656j.m77944r(1.213f, -2.09f);
            sepVarM62656j.m77932f(2.31f, 2.31f, false, true, 13.1f, 8.6f);
            sepVarM62656j.m77942p(1.392f);
            sepVarM62656j.m77948v(0.027f, -0.582f, -0.05f, -1.155f);
            sepVarM62656j.m77948v(0.097f, -0.097f, 0.184f, -0.202f);
            sepVarM62656j.m77933g(2.7f, 2.7f, false, false, 1.246f, -0.364f);
            sepVarM62656j.m77945s(13.1f, 10.1f);
            sepVarM62656j.m77933g(0.81f, 0.81f, false, false, -0.7f, 0.404f);
            sepVarM62656j.m77944r(-1.213f, 2.09f);
            sepVarM62656j.m77933g(0.792f, 0.792f, true, false, 1.37f, 0.791f);
            sepVarM62656j.m77944r(0.93f, -1.61f);
            sepVarM62656j.m77944r(0.007f, -0.012f);
            sepVarM62656j.m77939m(0.324f, -0.51f, 0.578f, -1.07f, 0.75f, -1.663f);
            yds.m93492v(sepVarM62656j, 0.001f, 12.5f, 0.75f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            sepVarM62656j.m77927D(4.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            sepVarM62656j.m77927D(-4.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            sepVarM62656j.m77946t(-2.0f, 1.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            sepVarM62656j.m77927D(2.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            sepVarM62656j.m77927D(-2.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            sepVarM62656j.m77946t(4.0f, 0.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            sepVarM62656j.m77927D(2.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            sepVarM62656j.m77927D(-2.0f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            jwg1.f116643a = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = kwg1.f127093a;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.HeadphonesOptimize24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            pk31 pk31Var2 = new pk31(n6f.f150862b);
            sep sepVarM62656j2 = mrx0.m62656j(12.0f, 1.0f);
            sepVarM62656j2.m77939m(0.663f, 0.0f, 1.313f, 0.06f, 1.945f, 0.167f);
            sepVarM62656j2.m77933g(3.5f, 3.5f, false, false, -1.307f, 1.86f);
            sepVarM62656j2.m77933g(9.5f, 9.5f, false, false, -10.122f, 10.01f);
            sepVarM62656j2.m77943q(4.76f, 13.037f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, true, 2.595f, 1.494f);
            sepVarM62656j2.m77944r(1.831f, 3.155f);
            sepVarM62656j2.m77933g(3.234f, 3.234f, false, true, -2.362f, 4.857f);
            sepVarM62656j2.m77933g(3.235f, 3.235f, false, true, -3.232f, -1.62f);
            sepVarM62656j2.m77944r(-1.326f, -2.297f);
            sepVarM62656j2.m77932f(11.44f, 11.44f, false, true, 0.5f, 12.5f);
            sepVarM62656j2.m77938l(0.5f, 6.15f, 5.65f, 1.0f, 12.0f, 1.0f);
            sepVarM62656j2.m77945s(2.842f, 15.037f);
            sepVarM62656j2.m77939m(0.25f, 0.907f, 0.633f, 1.76f, 1.125f, 2.537f);
            sepVarM62656j2.m77944r(0.01f, 0.017f);
            sepVarM62656j2.m77944r(1.348f, 2.333f);
            sepVarM62656j2.m77933g(1.23f, 1.23f, false, false, 1.236f, 0.63f);
            sepVarM62656j2.m77933g(1.233f, 1.233f, false, false, 0.896f, -1.864f);
            sepVarM62656j2.m77944r(-1.83f, -3.155f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, false, -0.866f, -0.498f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(23.056f, 9.337f);
            sepVarM62656j2.m77932f(11.5f, 11.5f, false, true, 23.5f, 12.5f);
            sepVarM62656j2.m77933g(11.43f, 11.43f, false, true, -1.768f, 6.13f);
            sepVarM62656j2.m77944r(-1.325f, 2.294f);
            sepVarM62656j2.m77933g(3.234f, 3.234f, false, true, -5.389f, 0.37f);
            sepVarM62656j2.m77933g(3.23f, 3.23f, false, true, -0.205f, -3.608f);
            sepVarM62656j2.m77944r(1.83f, -3.155f);
            sepVarM62656j2.m77933g(3.0f, 3.0f, false, true, 2.595f, -1.494f);
            sepVarM62656j2.m77942p(2.247f);
            sepVarM62656j2.m77933g(9.5f, 9.5f, false, false, -0.172f, -2.412f);
            sepVarM62656j2.m77933g(3.5f, 3.5f, false, false, 0.852f, -1.13f);
            sepVarM62656j2.m77948v(0.466f, -0.023f, 0.89f, -0.158f);
            sepVarM62656j2.m77946t(-3.818f, 5.7f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, false, -0.864f, 0.498f);
            sepVarM62656j2.m77944r(-1.831f, 3.155f);
            sepVarM62656j2.m77933g(1.24f, 1.24f, false, false, 0.07f, 1.384f);
            sepVarM62656j2.m77933g(1.24f, 1.24f, false, false, 1.313f, 0.444f);
            sepVarM62656j2.m77933g(1.23f, 1.23f, false, false, 0.749f, -0.594f);
            sepVarM62656j2.m77944r(1.345f, -2.33f);
            sepVarM62656j2.m77944r(0.011f, -0.017f);
            sepVarM62656j2.m77933g(9.5f, 9.5f, false, false, 1.127f, -2.54f);
            sepVarM62656j2.m77937k();
            sepVarM62656j2.m77945s(19.0f, 1.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            sepVarM62656j2.m77927D(6.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            sepVarM62656j2.m77943q(18.0f, 2.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            sepVarM62656j2.m77946t(-3.0f, 2.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            sepVarM62656j2.m77927D(2.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            sepVarM62656j2.m77943q(15.0f, 4.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            sepVarM62656j2.m77946t(6.0f, 0.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            sepVarM62656j2.m77927D(2.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            sepVarM62656j2.m77943q(21.0f, 4.0f);
            sepVarM62656j2.m77933g(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            rd40.m75320a(rd40Var2, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            kwg1.f127093a = sd40VarM75321b2;
        }
        f222887c = new tqu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f222888d = 8;
        CREATOR = new opu(29);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tqu);
    }

    public final int hashCode() {
        return -71357769;
    }

    public final String toString() {
        return "HeadphonesOptimize";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
