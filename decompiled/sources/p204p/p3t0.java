package p204p;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class p3t0 implements m3b1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173719a;

    /* JADX INFO: renamed from: b */
    public boolean f173720b = false;

    /* JADX INFO: renamed from: c */
    public boolean f173721c = false;

    /* JADX INFO: renamed from: d */
    public guy f173722d;

    /* JADX INFO: renamed from: e */
    public final bmk0 f173723e;

    public /* synthetic */ p3t0(bmk0 bmk0Var, int i) {
        this.f173719a = i;
        this.f173723e = bmk0Var;
    }

    @Override // p204p.m3b1
    /* JADX INFO: renamed from: f */
    public final m3b1 mo60660f(String str) {
        switch (this.f173719a) {
            case 0:
                if (this.f173720b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f173720b = true;
                ((l3t0) this.f173723e).m58024h(this.f173722d, str, this.f173721c);
                return this;
            case 1:
                if (this.f173720b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f173720b = true;
                ((xdf1) this.f173723e).m90414g(this.f173722d, str, this.f173721c);
                return this;
            default:
                if (this.f173720b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f173720b = true;
                ((erf1) this.f173723e).m39777g(this.f173722d, str, this.f173721c);
                return this;
        }
    }

    @Override // p204p.m3b1
    /* JADX INFO: renamed from: g */
    public final m3b1 mo60661g(boolean z) {
        switch (this.f173719a) {
            case 0:
                if (this.f173720b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f173720b = true;
                ((l3t0) this.f173723e).m58023g(this.f173722d, z ? 1 : 0, this.f173721c);
                return this;
            case 1:
                if (this.f173720b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f173720b = true;
                ((xdf1) this.f173723e).m90415h(this.f173722d, z ? 1 : 0, this.f173721c);
                return this;
            default:
                if (this.f173720b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f173720b = true;
                ((erf1) this.f173723e).m39778h(this.f173722d, z ? 1 : 0, this.f173721c);
                return this;
        }
    }
}
