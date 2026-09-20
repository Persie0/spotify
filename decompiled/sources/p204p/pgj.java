package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pgj extends oy8 {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f177342e;

    /* JADX INFO: renamed from: f */
    public Uri f177343f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f177344g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f177345h;

    /* JADX INFO: renamed from: i */
    public long f177346i;

    /* JADX INFO: renamed from: t */
    public boolean f177347t;

    public pgj(Context context) {
        super(false);
        this.f177342e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p204p.uio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f177343f = null;
        try {
            FileInputStream fileInputStream = this.f177345h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f177345h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f177344g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f177344g = null;
                    if (this.f177347t) {
                        this.f177347t = false;
                        m68411f();
                    }
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
                }
            } catch (Throwable th) {
                this.f177344g = null;
                if (this.f177347t) {
                    this.f177347t = false;
                    m68411f();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSource$ContentDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e2);
        }
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f177343f;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSource$ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f177346i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e);
                }
            }
            FileInputStream fileInputStream = this.f177345h;
            String str = h0b1.f86200a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f177346i;
                if (j2 != -1) {
                    this.f177346i = j2 - ((long) i3);
                }
                m68410d(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) throws ContentDataSource$ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = sjoVar.f209885a;
                long j = sjoVar.f209891g;
                long j2 = sjoVar.f209890f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f177343f = uriNormalizeScheme;
                m68412j(sjoVar);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f177342e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f177344g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + uriNormalizeScheme);
                    i = AudioEpisode.SHOW_URI_FIELD_NUMBER;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, iOException);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new ContentDataSource$ContentDataSourceException(i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f177345h = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f177346i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f177346i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(2008, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f177346i = j3;
                    if (j3 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.f177346i;
                    this.f177346i = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f177347t = true;
                m68413l(sjoVar);
                return j != -1 ? j : this.f177346i;
            } catch (IOException e2) {
                e = e2;
                i = AudioEpisode.SHOW_URI_FIELD_NUMBER;
            }
        } catch (ContentDataSource$ContentDataSourceException e3) {
            throw e3;
        }
    }
}
