package p204p;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zx61 implements uio {

    /* JADX INFO: renamed from: a */
    public final uio f287224a;

    /* JADX INFO: renamed from: b */
    public final c3b f287225b;

    /* JADX INFO: renamed from: c */
    public boolean f287226c;

    /* JADX INFO: renamed from: d */
    public long f287227d;

    public zx61(uio uioVar, c3b c3bVar) {
        uioVar.getClass();
        this.f287224a = uioVar;
        c3bVar.getClass();
        this.f287225b = c3bVar;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: a */
    public final void mo29278a(x491 x491Var) {
        x491Var.getClass();
        this.f287224a.mo29278a(x491Var);
    }

    @Override // p204p.uio
    public final void close() throws CacheDataSink$CacheDataSinkException {
        c3b c3bVar = this.f287225b;
        try {
            this.f287224a.close();
            if (this.f287226c) {
                this.f287226c = false;
                if (c3bVar.f33628d == null) {
                    return;
                }
                try {
                    c3bVar.m31374a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.f287226c) {
                this.f287226c = false;
                if (c3bVar.f33628d != null) {
                    try {
                        c3bVar.m31374a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: e */
    public final Map mo28172e() {
        return this.f287224a.mo28172e();
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f287224a.getUri();
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws CacheDataSink$CacheDataSinkException {
        if (this.f287227d == 0) {
            return -1;
        }
        int i3 = this.f287224a.read(bArr, i, i2);
        if (i3 > 0) {
            c3b c3bVar = this.f287225b;
            sjo sjoVar = c3bVar.f33628d;
            if (sjoVar != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (c3bVar.f33632h == c3bVar.f33629e) {
                            c3bVar.m31374a();
                            c3bVar.m31375b(sjoVar);
                        }
                        int iMin = (int) Math.min(i3 - i4, c3bVar.f33629e - c3bVar.f33632h);
                        OutputStream outputStream = c3bVar.f33631g;
                        String str = h0b1.f86200a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        c3bVar.f33632h += j;
                        c3bVar.f33633i += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.f287227d;
            if (j2 != -1) {
                this.f287227d = j2 - ((long) i3);
            }
        }
        return i3;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) throws CacheDataSink$CacheDataSinkException {
        long jMo28175u = this.f287224a.mo28175u(sjoVar);
        this.f287227d = jMo28175u;
        if (jMo28175u == 0) {
            return 0L;
        }
        if (sjoVar.f209891g == -1 && jMo28175u != -1) {
            sjoVar = sjoVar.m78351e(0L, jMo28175u);
        }
        this.f287226c = true;
        c3b c3bVar = this.f287225b;
        c3bVar.getClass();
        sjoVar.f209892h.getClass();
        if (sjoVar.f209891g == -1 && sjoVar.m78349c(2)) {
            c3bVar.f33628d = null;
        } else {
            c3bVar.f33628d = sjoVar;
            c3bVar.f33629e = sjoVar.m78349c(4) ? c3bVar.f33626b : Long.MAX_VALUE;
            c3bVar.f33633i = 0L;
            try {
                c3bVar.m31375b(sjoVar);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.f287227d;
    }
}
