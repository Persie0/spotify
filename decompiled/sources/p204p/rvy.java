package p204p;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class rvy extends oy8 {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f203156e;

    /* JADX INFO: renamed from: f */
    public Uri f203157f;

    /* JADX INFO: renamed from: g */
    public long f203158g;

    /* JADX INFO: renamed from: h */
    public boolean f203159h;

    @Override // p204p.uio
    public final void close() {
        this.f203157f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f203156e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f203156e = null;
                if (this.f203159h) {
                    this.f203159h = false;
                    m68411f();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
            }
        } catch (Throwable th) {
            this.f203156e = null;
            if (this.f203159h) {
                this.f203159h = false;
                m68411f();
            }
            throw th;
        }
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f203157f;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws FileDataSource$FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f203158g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f203156e;
            String str = h0b1.f86200a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f203158g -= (long) i3;
                m68410d(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
        }
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) throws FileDataSource$FileDataSourceException {
        Uri uri = sjoVar.f209885a;
        long j = sjoVar.f209890f;
        this.f203157f = uri;
        m68412j(sjoVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f203156e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = sjoVar.f209891g;
                if (length == -1) {
                    length = this.f203156e.length() - j;
                }
                this.f203158g = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(2008, null, null);
                }
                this.f203159h = true;
                m68413l(sjoVar);
                return this.f203158g;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM38573v = edb.m38573v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM38573v.append(fragment);
            throw new FileDataSource$FileDataSourceException(1004, e2, sbM38573v.toString());
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(2006, e3);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e4);
        }
    }
}
