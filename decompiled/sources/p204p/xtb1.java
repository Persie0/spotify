package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xtb1 {

    /* JADX INFO: renamed from: h */
    public static final xtb1 f265825h = new xtb1(-1, -1, -1, 1.0f, -1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f265826a;

    /* JADX INFO: renamed from: b */
    public final int f265827b;

    /* JADX INFO: renamed from: c */
    public final int f265828c;

    /* JADX INFO: renamed from: d */
    public final float f265829d;

    /* JADX INFO: renamed from: e */
    public final int f265830e;

    /* JADX INFO: renamed from: f */
    public final int f265831f;

    /* JADX INFO: renamed from: g */
    public final int f265832g;

    public xtb1(int i, int i2, int i3, float f, int i4, int i5, int i6) {
        this.f265826a = i;
        this.f265827b = i2;
        this.f265828c = i3;
        this.f265829d = f;
        this.f265830e = i4;
        this.f265831f = i5;
        this.f265832g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtb1)) {
            return false;
        }
        xtb1 xtb1Var = (xtb1) obj;
        return this.f265826a == xtb1Var.f265826a && this.f265827b == xtb1Var.f265827b && this.f265828c == xtb1Var.f265828c && this.f265829d == xtb1Var.f265829d && this.f265830e == xtb1Var.f265830e && this.f265831f == xtb1Var.f265831f && this.f265832g == xtb1Var.f265832g;
    }

    public final int hashCode() {
        return ((((((((((((Float.floatToIntBits(this.f265829d) + ((((((((217 + this.f265826a) * 31) + 1) * 31) + this.f265827b) * 31) + this.f265828c) * 31)) * 31) - 1) * 31) - 1) * 31) + ((int) (-4294967296L))) * 31) + this.f265830e) * 31) + this.f265831f) * 31) + this.f265832g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderSettings{bitrate=");
        sb.append(this.f265826a);
        sb.append(", bitrateMode=1, profile=");
        sb.append(this.f265827b);
        sb.append(", level=");
        sb.append(this.f265828c);
        sb.append(", iFrameIntervalSeconds=");
        sb.append(this.f265829d);
        sb.append(", operatingRate=-1, priority=-1, repeatPreviousFrameIntervalUs=-1, maxBFrames=");
        sb.append(this.f265830e);
        sb.append(", numNonBidirectionalTemporalLayers=");
        sb.append(this.f265831f);
        sb.append(", numBidirectionalTemporalLayers=");
        return edb.m38567p(sb, this.f265832g, '}');
    }
}
