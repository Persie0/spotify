package p204p;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ygx extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    public long f272686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zgx f272687b;

    public ygx(zgx zgxVar) {
        this.f272687b = zgxVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f272686a;
            zgx zgxVar = this.f272687b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) zgxVar.f282728a.available())) {
                    return -1;
                }
                zgxVar.m96109a(j);
                this.f272686a = j;
            }
            if (i2 > zgxVar.f282728a.available()) {
                i2 = zgxVar.f282728a.available();
            }
            int i3 = zgxVar.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f272686a += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f272686a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
