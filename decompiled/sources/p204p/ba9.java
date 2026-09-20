package p204p;

import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import com.spotify.messages.BetamaxPlaybackErrorDevice;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class ba9 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final yzo0 f25110a;

    /* JADX INFO: renamed from: b */
    public final qre0 f25111b;

    /* JADX INFO: renamed from: c */
    public final String f25112c;

    /* JADX INFO: renamed from: d */
    public rx6 f25113d;

    /* JADX INFO: renamed from: e */
    public mxb1 f25114e;

    /* JADX INFO: renamed from: f */
    public boolean f25115f;

    /* JADX INFO: renamed from: g */
    public boolean f25116g;

    /* JADX INFO: renamed from: h */
    public float f25117h = -1.0f;

    /* JADX INFO: renamed from: i */
    public boolean f25118i;

    public ba9(yzo0 yzo0Var, qre0 qre0Var, String str) {
        this.f25110a = yzo0Var;
        this.f25111b = qre0Var;
        this.f25112c = str;
        String strM27405t = axf1.m27405t(yzo0Var);
        this.f25112c = strM27405t != null ? strM27405t : str;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: E */
    public final void mo28573E(float f, long j, long j2) {
        this.f25117h = f;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: H */
    public final void mo25534H(long j, long j2) {
        this.f25115f = true;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public final void mo25535I(BetamaxException betamaxException, long j, long j2) {
        m28576a(betamaxException, j);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: K */
    public final void mo28574K(long j, long j2, mxb1 mxb1Var) {
        this.f25114e = mxb1Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: L */
    public final void mo28575L(rx6 rx6Var, long j, long j2) {
        this.f25113d = rx6Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public final void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        m28576a(betamaxPlaybackException, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m28576a(BetamaxException betamaxException, long j) {
        int i = betamaxException.f3084a.f15809a;
        yzo0 yzo0Var = this.f25110a;
        BetamaxPlaybackErrorDevice betamaxPlaybackErrorDeviceM91844B = xqg1.m91844B(yzo0Var, this.f25112c, i, betamaxException);
        rx6 rx6Var = this.f25113d;
        int i2 = rx6Var != null ? rx6Var.f203509a : 0;
        mxb1 mxb1Var = this.f25114e;
        int i3 = i2 + (mxb1Var != null ? mxb1Var.f148013a : 0);
        if (i3 == 0) {
            i3 = -1;
        }
        aa9 aa9Var = (aa9) betamaxPlaybackErrorDeviceM91844B.toBuilder();
        aa9Var.m25210z(j);
        aa9Var.m25200m(this.f25116g);
        aa9Var.m25199D(this.f25118i);
        aa9Var.m25202r(this.f25115f);
        aa9Var.m25201q(i3);
        aa9Var.m25197B(this.f25117h);
        byte[] bArrM89349a = wy8.f256230b.m89349a(axf1.m27406u(yzo0Var).toUpperCase(Locale.US));
        aa9Var.m25196A(gva.m45886d(0, bArrM89349a, bArrM89349a.length));
        this.f25111b.m73616a((BetamaxPlaybackErrorDevice) aa9Var.build());
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: d */
    public final void mo28577d(long j, long j2, boolean z) {
        this.f25116g = z;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: k */
    public final void mo27128k(boolean z, boolean z2, float f, long j) {
        this.f25116g = z;
        this.f25118i = z2;
        this.f25117h = f;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: m */
    public final void mo25538m(long j, long j2) {
        this.f25115f = false;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: n */
    public final void mo28578n(long j, long j2, boolean z) {
        this.f25118i = z;
    }
}
