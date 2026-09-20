package p204p;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class sa6 extends oy8 {

    /* JADX INFO: renamed from: e */
    public final AssetManager f207144e;

    /* JADX INFO: renamed from: f */
    public Uri f207145f;

    /* JADX INFO: renamed from: g */
    public InputStream f207146g;

    /* JADX INFO: renamed from: h */
    public long f207147h;

    /* JADX INFO: renamed from: i */
    public boolean f207148i;

    public sa6(Context context) {
        super(false);
        this.f207144e = context.getAssets();
    }

    @Override // p204p.uio
    public final void close() {
        this.f207145f = null;
        try {
            try {
                InputStream inputStream = this.f207146g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f207146g = null;
                if (this.f207148i) {
                    this.f207148i = false;
                    m68411f();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
            }
        } catch (Throwable th) {
            this.f207146g = null;
            if (this.f207148i) {
                this.f207148i = false;
                m68411f();
            }
            throw th;
        }
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f207145f;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSource$AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f207147h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSource$AssetDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
                }
            }
            InputStream inputStream = this.f207146g;
            String str = h0b1.f86200a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f207147h;
                if (j2 != -1) {
                    this.f207147h = j2 - ((long) i3);
                }
                m68410d(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = sjoVar.f209885a;
            long j = sjoVar.f209890f;
            this.f207145f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m68412j(sjoVar);
            InputStream inputStreamOpen = this.f207144e.open(path, 1);
            this.f207146g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j2 = sjoVar.f209891g;
            if (j2 != -1) {
                this.f207147h = j2;
            } else {
                long jAvailable = this.f207146g.available();
                this.f207147h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f207147h = -1L;
                }
            }
            this.f207148i = true;
            m68413l(sjoVar);
            return this.f207147h;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : AudioEpisode.SHOW_URI_FIELD_NUMBER, e2);
        }
    }
}
