package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class un61 {

    /* JADX INFO: renamed from: a */
    public int f232070a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f232071b;

    /* JADX INFO: renamed from: c */
    public int f232072c;

    /* JADX INFO: renamed from: d */
    public int f232073d;

    public un61() {
        a0b1.m24338a();
    }

    /* JADX INFO: renamed from: a */
    public final int m83534a(int i) {
        if (i < this.f232073d) {
            return this.f232071b.getShort(this.f232072c + i);
        }
        return 0;
    }
}
