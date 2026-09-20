package p204p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class xp31 implements t27 {

    /* JADX INFO: renamed from: b */
    public final boolean f264418b;

    /* JADX INFO: renamed from: c */
    public int f264419c;

    /* JADX INFO: renamed from: d */
    public float f264420d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f264421e = 1.0f;

    /* JADX INFO: renamed from: f */
    public q27 f264422f;

    /* JADX INFO: renamed from: g */
    public q27 f264423g;

    /* JADX INFO: renamed from: h */
    public q27 f264424h;

    /* JADX INFO: renamed from: i */
    public q27 f264425i;

    /* JADX INFO: renamed from: j */
    public boolean f264426j;

    /* JADX INFO: renamed from: k */
    public wp31 f264427k;

    /* JADX INFO: renamed from: l */
    public ByteBuffer f264428l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f264429m;

    /* JADX INFO: renamed from: n */
    public long f264430n;

    /* JADX INFO: renamed from: o */
    public long f264431o;

    /* JADX INFO: renamed from: p */
    public boolean f264432p;

    public xp31(boolean z) {
        q27 q27Var = q27.f184525e;
        this.f264422f = q27Var;
        this.f264423g = q27Var;
        this.f264424h = q27Var;
        this.f264425i = q27Var;
        ByteBuffer byteBuffer = t27.f216437a;
        this.f264428l = byteBuffer;
        this.f264429m = byteBuffer;
        this.f264419c = -1;
        this.f264418b = z;
    }

    /* JADX INFO: renamed from: a */
    public final long m91579a(long j) {
        if (this.f264431o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / ((double) this.f264420d));
        }
        long j2 = this.f264430n;
        wp31 wp31Var = this.f264427k;
        wp31Var.getClass();
        long jMo69626p = j2 - ((long) (wp31Var.f253657i.mo69626p() * (wp31Var.f253658j * wp31Var.f253650b)));
        int i = this.f264425i.f184526a;
        int i2 = this.f264424h.f184526a;
        return i == i2 ? h0b1.m46312g0(j, this.f264431o, jMo69626p, RoundingMode.DOWN) : h0b1.m46312g0(j, this.f264431o * ((long) i2), jMo69626p * ((long) i), RoundingMode.DOWN);
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: d */
    public final boolean mo31666d() {
        if (this.f264432p) {
            wp31 wp31Var = this.f264427k;
            if (wp31Var != null) {
                c95.m31855u(wp31Var.f253659k >= 0);
                if (wp31Var.f253657i.mo69626p() * wp31Var.f253659k * wp31Var.f253650b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: e */
    public final ByteBuffer mo31667e() {
        wp31 wp31Var = this.f264427k;
        if (wp31Var != null) {
            vp31 vp31Var = wp31Var.f253657i;
            int i = wp31Var.f253650b;
            c95.m31855u(wp31Var.f253659k >= 0);
            int iMo69626p = vp31Var.mo69626p() * wp31Var.f253659k * i;
            if (iMo69626p > 0) {
                if (this.f264428l.capacity() < iMo69626p) {
                    this.f264428l = ByteBuffer.allocateDirect(iMo69626p).order(ByteOrder.nativeOrder());
                } else {
                    this.f264428l.clear();
                }
                ByteBuffer byteBuffer = this.f264428l;
                c95.m31855u(wp31Var.f253659k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (vp31Var.mo69626p() * i), wp31Var.f253659k);
                vp31Var.mo69627q(byteBuffer, iMin);
                wp31Var.f253659k -= iMin;
                System.arraycopy(vp31Var.mo69622l(), iMin * i, vp31Var.mo69622l(), 0, wp31Var.f253659k * i);
                this.f264428l.flip();
                this.f264431o += (long) iMo69626p;
                this.f264429m = this.f264428l;
            }
        }
        ByteBuffer byteBuffer2 = this.f264429m;
        this.f264429m = t27.f216437a;
        return byteBuffer2;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: f */
    public final q27 mo31668f(q27 q27Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = q27Var.f184528c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(q27Var);
        }
        int i2 = this.f264419c;
        if (i2 == -1) {
            i2 = q27Var.f184526a;
        }
        this.f264422f = q27Var;
        q27 q27Var2 = new q27(i2, q27Var.f184527b, i);
        this.f264423g = q27Var2;
        this.f264426j = true;
        return q27Var2;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: g */
    public final void mo31669g(s27 s27Var) {
        if (isActive()) {
            q27 q27Var = this.f264422f;
            this.f264424h = q27Var;
            q27 q27Var2 = this.f264423g;
            this.f264425i = q27Var2;
            if (this.f264426j) {
                this.f264427k = new wp31(q27Var.f184526a, q27Var.f184527b, this.f264420d, this.f264421e, q27Var2.f184526a, q27Var.f184528c == 4);
            } else {
                wp31 wp31Var = this.f264427k;
                if (wp31Var != null) {
                    wp31Var.f253658j = 0;
                    wp31Var.f253659k = 0;
                    wp31Var.f253660l = 0;
                    wp31Var.f253661m = 0;
                    wp31Var.f253662n = 0;
                    wp31Var.f253663o = 0;
                    wp31Var.f253664p = 0;
                    wp31Var.f253665q = 0.0d;
                    wp31Var.f253657i.flush();
                }
            }
        }
        this.f264429m = t27.f216437a;
        this.f264430n = 0L;
        this.f264431o = 0L;
        this.f264432p = false;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: h */
    public final void mo31670h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            wp31 wp31Var = this.f264427k;
            wp31Var.getClass();
            this.f264430n += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = wp31Var.f253650b;
            vp31 vp31Var = wp31Var.f253657i;
            int iMo69626p = iRemaining / (vp31Var.mo69626p() * i);
            vp31Var.mo69618h(iMo69626p);
            vp31Var.mo69624n(byteBuffer, iRemaining);
            wp31Var.f253658j += iMo69626p;
            wp31Var.m88675b();
        }
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: i */
    public final void mo31671i() {
        wp31 wp31Var = this.f264427k;
        if (wp31Var != null) {
            int i = wp31Var.f253658j;
            float f = wp31Var.f253651c;
            float f2 = wp31Var.f253652d;
            double d = f / f2;
            double d2 = wp31Var.f253653e * f2;
            int i2 = wp31Var.f253663o;
            int i3 = wp31Var.f253659k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + wp31Var.f253665q) + ((double) wp31Var.f253660l)) / d2) + 0.5d));
            wp31Var.f253665q = 0.0d;
            vp31 vp31Var = wp31Var.f253657i;
            int i4 = wp31Var.f253656h * 2;
            vp31Var.mo69618h(i4 + i);
            vp31Var.mo69611a(i * wp31Var.f253650b, i4);
            wp31Var.f253658j = i4 + wp31Var.f253658j;
            wp31Var.m88675b();
            if (wp31Var.f253659k > i3) {
                wp31Var.f253659k = Math.max(i3, 0);
            }
            wp31Var.f253658j = 0;
            wp31Var.f253663o = 0;
            wp31Var.f253660l = 0;
        }
        this.f264432p = true;
    }

    @Override // p204p.t27
    public final boolean isActive() {
        if (this.f264423g.f184526a != -1) {
            return this.f264418b || Math.abs(this.f264420d - 1.0f) >= 1.0E-4f || Math.abs(this.f264421e - 1.0f) >= 1.0E-4f || this.f264423g.f184526a != this.f264422f.f184526a;
        }
        return false;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: j */
    public final long mo40331j(long j) {
        return m91579a(j);
    }

    @Override // p204p.t27
    public final void reset() {
        this.f264420d = 1.0f;
        this.f264421e = 1.0f;
        q27 q27Var = q27.f184525e;
        this.f264422f = q27Var;
        this.f264423g = q27Var;
        this.f264424h = q27Var;
        this.f264425i = q27Var;
        ByteBuffer byteBuffer = t27.f216437a;
        this.f264428l = byteBuffer;
        this.f264429m = byteBuffer;
        this.f264419c = -1;
        this.f264426j = false;
        this.f264427k = null;
        this.f264430n = 0L;
        this.f264431o = 0L;
        this.f264432p = false;
    }
}
