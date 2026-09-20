package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ksu extends wwu {
    public static final Parcelable.Creator<ksu> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final ksu f126017c;

    /* JADX INFO: renamed from: d */
    public static final int f126018d;

    static {
        sd40 sd40VarM75321b = t0j.f215897b;
        if (sd40VarM75321b == null) {
            float f = 16;
            rd40 rd40Var = new rd40("Encore.Vector.Parental16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = c5b1.f34134a;
            long j = n6f.f150862b;
            pk31 pk31Var = new pk31(j);
            sep sepVarM62656j = mrx0.m62656j(5.913f, 0.371f);
            sepVarM62656j.m77933g(4.39f, 4.39f, false, true, 5.002f, 1.052f);
            sepVarM62656j.m77939m(0.421f, 0.459f, 0.713f, 0.993f, 0.904f, 1.555f);
            sepVarM62656j.m77939m(0.143f, 0.42f, 0.263f, 1.173f, 0.22f, 1.893f);
            sepVarM62656j.m77948v(-0.015f, 0.255f, -0.054f, 0.496f);
            sepVarM62656j.m77933g(4.0f, 4.0f, false, false, -0.42f, -0.023f);
            sepVarM62656j.m77948v(-0.587f, 0.002f, -1.142f, 0.162f);
            sepVarM62656j.m77948v(0.095f, -0.348f, 0.119f, -0.724f);
            sepVarM62656j.m77939m(0.032f, -0.54f, -0.067f, -1.097f, -0.144f, -1.323f);
            sepVarM62656j.m77933g(2.85f, 2.85f, false, false, -0.587f, -1.021f);
            sepVarM62656j.m77932f(2.9f, 2.9f, false, false, 7.68f, 1.5f);
            sepVarM62656j.m77933g(2.9f, 2.9f, false, false, -2.131f, 0.938f);
            sepVarM62656j.m77933g(2.85f, 2.85f, false, false, -0.588f, 1.021f);
            sepVarM62656j.m77939m(-0.077f, 0.226f, -0.175f, 0.783f, -0.143f, 1.323f);
            sepVarM62656j.m77939m(0.054f, 0.921f, 0.44f, 1.713f, 1.051f, 2.443f);
            sepVarM62656j.m77942p(0.002f);
            sepVarM62656j.m77943q(6.0f, 7.379f);
            sepVarM62656j.m77933g(2.25f, 2.25f, false, true, 0.487f, 1.836f);
            sepVarM62656j.m77933g(2.25f, 2.25f, false, true, -1.09f, 1.555f);
            sepVarM62656j.m77944r(-2.208f, 1.274f);
            sepVarM62656j.m77932f(3.25f, 3.25f, false, false, 1.582f, 14.5f);
            sepVarM62656j.m77942p(4.169f);
            sepVarM62656j.m77948v(-0.061f, 0.371f, -0.062f, 0.75f);
            sepVarM62656j.m77926C(16.0f);
            sepVarM62656j.m77941o(0.063f);
            sepVarM62656j.m77927D(-1.142f);
            sepVarM62656j.m77933g(4.75f, 4.75f, false, true, 2.375f, -4.114f);
            sepVarM62656j.m77943q(4.646f, 9.47f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, false, 0.35f, -0.842f);
            sepVarM62656j.m77933g(0.75f, 0.75f, false, false, -0.148f, -0.288f);
            sepVarM62656j.m77944r(-0.126f, -0.151f);
            sepVarM62656j.m77939m(-0.761f, -0.908f, -1.323f, -1.995f, -1.4f, -3.317f);
            sepVarM62656j.m77939m(-0.044f, -0.72f, 0.076f, -1.472f, 0.219f, -1.893f);
            sepVarM62656j.m77933g(4.35f, 4.35f, false, true, 0.904f, -1.555f);
            sepVarM62656j.m77939m(0.411f, -0.448f, 0.91f, -0.807f, 1.468f, -1.052f);
            rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
            pk31 pk31Var2 = new pk31(j);
            sep sepVarM62656j2 = mrx0.m62656j(11.565f, 6.844f);
            sepVarM62656j2.m77933g(2.66f, 2.66f, false, true, 2.52f, 1.816f);
            sepVarM62656j2.m77939m(0.112f, 0.366f, 0.158f, 0.75f, 0.135f, 1.132f);
            sepVarM62656j2.m77933g(3.33f, 3.33f, false, true, -0.822f, 1.958f);
            sepVarM62656j2.m77933g(0.1f, 0.1f, false, false, -0.024f, 0.047f);
            sepVarM62656j2.m77933g(0.13f, 0.13f, false, false, 0.06f, 0.144f);
            sepVarM62656j2.m77944r(0.922f, 0.532f);
            sepVarM62656j2.m77927D(-0.004f);
            sepVarM62656j2.m77933g(3.2f, 3.2f, false, true, 1.584f, 2.781f);
            sepVarM62656j2.m77926C(16.0f);
            sepVarM62656j2.m77941o(7.19f);
            sepVarM62656j2.m77927D(-0.75f);
            sepVarM62656j2.m77933g(3.2f, 3.2f, false, true, 1.583f, -2.772f);
            sepVarM62656j2.m77944r(0.923f, -0.533f);
            sepVarM62656j2.m77933g(0.1f, 0.1f, false, false, 0.041f, -0.039f);
            sepVarM62656j2.m77933g(0.13f, 0.13f, false, false, -0.007f, -0.158f);
            sepVarM62656j2.m77933g(3.32f, 3.32f, false, true, -0.82f, -1.955f);
            sepVarM62656j2.m77933g(3.3f, 3.3f, false, true, 0.134f, -1.133f);
            sepVarM62656j2.m77933g(2.66f, 2.66f, false, true, 2.52f, -1.816f);
            sepVarM62656j2.m77946t(-0.003f, 1.498f);
            sepVarM62656j2.m77933g(1.2f, 1.2f, false, false, -0.472f, 0.097f);
            sepVarM62656j2.m77933g(1.12f, 1.12f, false, false, -0.627f, 0.699f);
            sepVarM62656j2.m77933g(1.8f, 1.8f, false, false, -0.057f, 0.563f);
            sepVarM62656j2.m77933g(1.8f, 1.8f, false, false, 0.474f, 1.081f);
            sepVarM62656j2.m77933g(1.63f, 1.63f, false, true, -0.436f, 2.458f);
            sepVarM62656j2.m77944r(-0.923f, 0.533f);
            sepVarM62656j2.m77939m(-0.29f, 0.168f, -0.522f, 0.42f, -0.665f, 0.723f);
            sepVarM62656j2.m77944r(5.413f, -0.003f);
            sepVarM62656j2.m77933g(1.66f, 1.66f, false, false, -0.665f, -0.723f);
            sepVarM62656j2.m77944r(-0.921f, -0.533f);
            sepVarM62656j2.m77933g(1.63f, 1.63f, false, true, -0.79f, -1.126f);
            sepVarM62656j2.m77933g(1.63f, 1.63f, false, true, 0.352f, -1.33f);
            sepVarM62656j2.m77933g(1.8f, 1.8f, false, false, 0.475f, -1.084f);
            sepVarM62656j2.m77933g(1.8f, 1.8f, false, false, -0.057f, -0.561f);
            sepVarM62656j2.m77933g(1.1f, 1.1f, false, false, -0.237f, -0.417f);
            sepVarM62656j2.m77933g(1.2f, 1.2f, false, false, -0.392f, -0.28f);
            sepVarM62656j2.m77933g(1.2f, 1.2f, false, false, -0.473f, -0.097f);
            rd40.m75320a(rd40Var, sepVarM62656j2.f208338a, pk31Var2, 1.0f, 2, 1.0f);
            sd40VarM75321b = rd40Var.m75321b();
            t0j.f215897b = sd40VarM75321b;
        }
        sd40 sd40VarM75321b2 = kfj.f122176b;
        if (sd40VarM75321b2 == null) {
            float f2 = 24;
            rd40 rd40Var2 = new rd40("Encore.Vector.Parental24", f2, f2, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = c5b1.f34134a;
            long j2 = n6f.f150862b;
            pk31 pk31Var3 = new pk31(j2);
            sep sepVarM62656j3 = mrx0.m62656j(11.273f, 2.0f);
            sepVarM62656j3.m77933g(5.5f, 5.5f, false, true, 4.05f, 1.781f);
            sepVarM62656j3.m77933g(5.4f, 5.4f, false, true, 1.13f, 1.946f);
            sepVarM62656j3.m77939m(0.143f, 0.42f, 0.265f, 1.1f, 0.283f, 1.816f);
            sepVarM62656j3.m77933g(6.3f, 6.3f, false, false, -1.903f, 0.067f);
            sepVarM62656j3.m77939m(-0.012f, -0.541f, -0.106f, -1.043f, -0.183f, -1.271f);
            sepVarM62656j3.m77933g(3.5f, 3.5f, false, false, -0.731f, -1.27f);
            sepVarM62656j3.m77933g(3.59f, 3.59f, false, false, -5.293f, 0.0f);
            sepVarM62656j3.m77933g(3.5f, 3.5f, false, false, -0.731f, 1.27f);
            sepVarM62656j3.m77939m(-0.096f, 0.28f, -0.217f, 0.972f, -0.178f, 1.644f);
            sepVarM62656j3.m77939m(0.068f, 1.146f, 0.548f, 2.129f, 1.31f, 3.039f);
            sepVarM62656j3.m77944r(0.001f, 0.001f);
            sepVarM62656j3.m77944r(0.496f, 0.597f);
            sepVarM62656j3.m77933g(2.383f, 2.383f, false, true, -0.637f, 3.587f);
            sepVarM62656j3.m77944r(-3.805f, 2.196f);
            sepVarM62656j3.m77933g(2.86f, 2.86f, false, false, -1.429f, 2.474f);
            sepVarM62656j3.m77927D(0.222f);
            sepVarM62656j3.m77942p(3.929f);
            sepVarM62656j3.m77933g(6.5f, 6.5f, false, false, -0.082f, 1.02f);
            sepVarM62656j3.m77927D(0.884f);
            sepVarM62656j3.m77941o(1.748f);
            sepVarM62656j3.m77927D(-2.127f);
            sepVarM62656j3.m77933g(4.76f, 4.76f, false, true, 2.38f, -4.123f);
            sepVarM62656j3.m77944r(3.806f, -2.196f);
            sepVarM62656j3.m77933g(0.48f, 0.48f, false, false, 0.222f, -0.536f);
            sepVarM62656j3.m77933g(0.5f, 0.5f, false, false, -0.094f, -0.182f);
            sepVarM62656j3.m77944r(-0.494f, -0.592f);
            sepVarM62656j3.m77944r(-0.002f, -0.002f);
            sepVarM62656j3.m77939m(-0.952f, -1.135f, -1.652f, -2.495f, -1.75f, -4.148f);
            sepVarM62656j3.m77939m(-0.054f, -0.902f, 0.096f, -1.844f, 0.276f, -2.372f);
            sepVarM62656j3.m77933g(5.4f, 5.4f, false, true, 1.13f, -1.944f);
            sepVarM62656j3.m77932f(5.5f, 5.5f, false, true, 11.273f, 2.0f);
            rd40.m75320a(rd40Var2, sepVarM62656j3.f208338a, pk31Var3, 1.0f, 2, 1.0f);
            pk31 pk31Var4 = new pk31(j2);
            sep sepVarM62656j4 = mrx0.m62656j(16.005f, 10.0f);
            sepVarM62656j4.m77948v(0.153f, 0.0f, 0.305f, 0.013f);
            sepVarM62656j4.m77942p(0.007f);
            sepVarM62656j4.m77933g(3.7f, 3.7f, false, true, 1.788f, 0.633f);
            sepVarM62656j4.m77933g(3.45f, 3.45f, false, true, 1.308f, 1.698f);
            sepVarM62656j4.m77939m(0.151f, 0.475f, 0.214f, 0.972f, 0.185f, 1.469f);
            sepVarM62656j4.m77933g(4.2f, 4.2f, false, true, -0.947f, 2.343f);
            sepVarM62656j4.m77933g(4.0f, 4.0f, false, true, -0.171f, 0.203f);
            sepVarM62656j4.m77933g(0.26f, 0.26f, false, false, -0.062f, 0.113f);
            sepVarM62656j4.m77933g(0.28f, 0.28f, false, false, 0.012f, 0.19f);
            sepVarM62656j4.m77948v(0.04f, 0.092f, 0.131f, 0.142f);
            sepVarM62656j4.m77944r(1.294f, 0.712f);
            sepVarM62656j4.m77948v(0.248f, 0.14f, 0.475f, 0.31f);
            sepVarM62656j4.m77939m(0.445f, 0.332f, 0.82f, 0.746f, 1.1f, 1.218f);
            sepVarM62656j4.m77939m(0.377f, 0.632f, 0.574f, 1.348f, 0.57f, 2.075f);
            sepVarM62656j4.m77926C(22.0f);
            sepVarM62656j4.m77941o(10.0f);
            sepVarM62656j4.m77927D(-0.88f);
            sepVarM62656j4.m77948v(0.0f, -0.264f, 0.032f, -0.521f);
            sepVarM62656j4.m77933g(4.0f, 4.0f, false, true, 0.541f, -1.555f);
            sepVarM62656j4.m77933g(4.26f, 4.26f, false, true, 1.581f, -1.527f);
            sepVarM62656j4.m77944r(1.292f, -0.712f);
            sepVarM62656j4.m77933g(0.29f, 0.29f, false, false, 0.145f, -0.332f);
            sepVarM62656j4.m77933g(0.3f, 0.3f, false, false, -0.062f, -0.114f);
            sepVarM62656j4.m77933g(4.22f, 4.22f, false, true, -1.117f, -2.544f);
            sepVarM62656j4.m77939m(-0.03f, -0.497f, 0.034f, -0.995f, 0.186f, -1.471f);
            sepVarM62656j4.m77933g(3.43f, 3.43f, false, true, 1.085f, -1.531f);
            sepVarM62656j4.m77944r(0.002f, -0.003f);
            sepVarM62656j4.m77948v(0.105f, -0.085f, 0.22f, -0.164f);
            sepVarM62656j4.m77944r(0.042f, -0.026f);
            sepVarM62656j4.m77948v(0.257f, -0.17f, 0.54f, -0.296f);
            sepVarM62656j4.m77939m(0.473f, -0.21f, 0.99f, -0.324f, 1.518f, -0.324f);
            sepVarM62656j4.m77946t(0.006f, 1.769f);
            sepVarM62656j4.m77939m(-0.245f, 0.0f, -0.487f, 0.048f, -0.711f, 0.141f);
            sepVarM62656j4.m77944r(-0.086f, 0.04f);
            sepVarM62656j4.m77948v(-0.287f, 0.136f, -0.502f, 0.363f);
            sepVarM62656j4.m77933g(1.6f, 1.6f, false, false, -0.361f, 0.598f);
            sepVarM62656j4.m77933g(2.3f, 2.3f, false, false, -0.018f, 1.235f);
            sepVarM62656j4.m77939m(0.106f, 0.405f, 0.32f, 0.778f, 0.622f, 1.081f);
            sepVarM62656j4.m77933g(2.04f, 2.04f, false, true, 0.43f, 0.79f);
            sepVarM62656j4.m77939m(0.08f, 0.29f, 0.094f, 0.595f, 0.039f, 0.89f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, true, -0.358f, 0.822f);
            sepVarM62656j4.m77939m(-0.18f, 0.245f, -0.416f, 0.45f, -0.688f, 0.6f);
            sepVarM62656j4.m77944r(-1.291f, 0.712f);
            sepVarM62656j4.m77939m(-0.487f, 0.27f, -0.862f, 0.693f, -1.063f, 1.195f);
            sepVarM62656j4.m77942p(7.97f);
            sepVarM62656j4.m77933g(2.3f, 2.3f, false, false, -0.297f, -0.527f);
            sepVarM62656j4.m77933g(2.4f, 2.4f, false, false, -0.763f, -0.668f);
            sepVarM62656j4.m77944r(-1.292f, -0.712f);
            sepVarM62656j4.m77933g(2.1f, 2.1f, false, true, -0.688f, -0.6f);
            sepVarM62656j4.m77933g(1.96f, 1.96f, false, true, -0.377f, -1.37f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, true, 0.132f, -0.553f);
            sepVarM62656j4.m77933g(2.0f, 2.0f, false, true, 0.356f, -0.576f);
            sepVarM62656j4.m77944r(0.05f, -0.056f);
            sepVarM62656j4.m77944r(0.099f, -0.115f);
            sepVarM62656j4.m77933g(2.5f, 2.5f, false, false, 0.544f, -1.349f);
            sepVarM62656j4.m77939m(0.015f, -0.27f, -0.014f, -0.54f, -0.087f, -0.8f);
            sepVarM62656j4.m77933g(1.6f, 1.6f, false, false, -0.361f, -0.598f);
            sepVarM62656j4.m77933g(1.7f, 1.7f, false, false, -0.588f, -0.402f);
            sepVarM62656j4.m77933g(1.9f, 1.9f, false, false, -0.711f, -0.141f);
            rd40.m75320a(rd40Var2, sepVarM62656j4.f208338a, pk31Var4, 1.0f, 2, 1.0f);
            sd40VarM75321b2 = rd40Var2.m75321b();
            kfj.f122176b = sd40VarM75321b2;
        }
        f126017c = new ksu(new suu(sd40VarM75321b, sd40VarM75321b2), null);
        f126018d = 8;
        CREATOR = new asu(9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ksu);
    }

    public final int hashCode() {
        return 273992362;
    }

    public final String toString() {
        return "Parental";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
