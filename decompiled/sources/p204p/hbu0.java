package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hbu0 extends oy8 {

    /* JADX INFO: renamed from: e */
    public final Context f89608e;

    /* JADX INFO: renamed from: f */
    public sjo f89609f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f89610g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f89611h;

    /* JADX INFO: renamed from: i */
    public long f89612i;

    /* JADX INFO: renamed from: t */
    public boolean f89613t;

    public hbu0(Context context) {
        super(false);
        this.f89608e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p204p.uio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f89609f = null;
        try {
            FileInputStream fileInputStream = this.f89611h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f89611h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f89610g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f89610g = null;
                    if (this.f89613t) {
                        this.f89613t = false;
                        m68411f();
                    }
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e, null);
                }
            } catch (Throwable th) {
                this.f89610g = null;
                if (this.f89613t) {
                    this.f89613t = false;
                    m68411f();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e2, null);
        }
    }

    @Override // p204p.uio
    public final Uri getUri() {
        sjo sjoVar = this.f89609f;
        if (sjoVar != null) {
            return sjoVar.f209885a;
        }
        return null;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f89612i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e, null);
                }
            }
            FileInputStream fileInputStream = this.f89611h;
            String str = h0b1.f86200a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.f89612i;
                if (j2 != -1) {
                    this.f89612i = j2 - ((long) i3);
                }
                m68410d(i3);
                return i3;
            }
            if (this.f89612i != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) throws RawResourceDataSource$RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f89609f = sjoVar;
        m68412j(sjoVar);
        Uri uri = sjoVar.f209885a;
        long j = sjoVar.f209891g;
        long j2 = sjoVar.f209890f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f89608e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException(1004, null, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.");
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2005, e, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(klh.m56834f(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2005, null, "Resource not found.");
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, null, "Resource is compressed: " + uriNormalizeScheme);
            }
            this.f89610g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f89610g.getFileDescriptor());
            this.f89611h = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                }
                long startOffset = this.f89610g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f89612i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f89612i = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(2008, null, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f89612i = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f89612i;
                    this.f89612i = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f89613t = true;
                m68413l(sjoVar);
                return j != -1 ? j : this.f89612i;
            } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSource$RawResourceDataSourceException(AudioEpisode.SHOW_URI_FIELD_NUMBER, e3, null);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSource$RawResourceDataSourceException(2005, e4, null);
        }
    }
}
