package p204p;

import p196j$.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public final class n4h1 {

    /* JADX INFO: renamed from: a */
    public String f150342a;

    /* JADX INFO: renamed from: b */
    public Duration f150343b;

    /* JADX INFO: renamed from: c */
    public double f150344c;

    /* JADX INFO: renamed from: d */
    public int f150345d;

    /* JADX INFO: renamed from: e */
    public tve f150346e;

    /* JADX INFO: renamed from: f */
    public byte f150347f;

    /* JADX INFO: renamed from: a */
    public final t7h1 m63675a() {
        String str;
        Duration duration;
        int i;
        tve tveVar;
        if (this.f150347f == 1 && (str = this.f150342a) != null && (duration = this.f150343b) != null && (i = this.f150345d) != 0 && (tveVar = this.f150346e) != null) {
            return new t7h1(str, duration, this.f150344c, i, tveVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f150342a == null) {
            sb.append(" mediaId");
        }
        if (this.f150343b == null) {
            sb.append(" mediaPlayoutPosition");
        }
        if (this.f150347f == 0) {
            sb.append(" mediaPlayoutRate");
        }
        if (this.f150345d == 0) {
            sb.append(" playbackState");
        }
        if (this.f150346e == null) {
            sb.append(" coWatchingQueue");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m63676b(tve tveVar) {
        if (tveVar == null) {
            throw new NullPointerException("Null coWatchingQueue");
        }
        this.f150346e = tveVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m63677c(String str) {
        if (str == null) {
            throw new NullPointerException("Null mediaId");
        }
        this.f150342a = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m63678d(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null mediaPlayoutPosition");
        }
        this.f150343b = duration;
    }

    /* JADX INFO: renamed from: e */
    public final void m63679e(double d) {
        this.f150344c = d;
        this.f150347f = (byte) 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m63680f(int i) {
        if (i == 0) {
            throw new NullPointerException("Null playbackState");
        }
        this.f150345d = i;
    }
}
