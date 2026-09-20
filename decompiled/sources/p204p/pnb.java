package p204p;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class pnb implements onb, fwz0 {

    /* JADX INFO: renamed from: a */
    public final Context f179356a;

    public pnb(Context context) {
        this.f179356a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m70431a(String str) throws IOException {
        boolean zExists;
        if (Build.VERSION.SDK_INT >= 29) {
            Cursor cursorQuery = this.f179356a.getContentResolver().query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_display_name = ?", new String[]{str}, null);
            zExists = false;
            if (cursorQuery != null) {
                try {
                    zExists = cursorQuery.getCount() > 0;
                    cursorQuery.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        } else {
            zExists = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str).exists();
        }
        return Boolean.valueOf(zExists);
    }

    /* JADX INFO: renamed from: b */
    public final nnb m70432b(String str, byte[] bArr) throws IOException {
        Object c6x0Var;
        int i = Build.VERSION.SDK_INT;
        mnb mnbVar = mnb.f145381a;
        Context context = this.f179356a;
        if (i < 29) {
            if (lzj.m60353c(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                return lnb.f135127a;
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            externalStoragePublicDirectory.mkdirs();
            File file = new File(externalStoragePublicDirectory, str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, null);
                return mnbVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return new knb(new IllegalStateException(edb.m38564m("Failed to insert into MediaStore for ", str)));
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
        try {
            if (outputStreamOpenOutputStream == null) {
                context.getContentResolver().delete(uriInsert, null, null);
                return new knb(new IllegalStateException(edb.m38564m("Failed to open output stream for ", str)));
            }
            try {
                outputStreamOpenOutputStream.write(bArr);
                outputStreamOpenOutputStream.close();
                c6x0Var = w2a1.f247311a;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    n0e1.m63430g(outputStreamOpenOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            c6x0Var = new c6x0(th5);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null) {
            return mnbVar;
        }
        context.getContentResolver().delete(uriInsert, null, null);
        return new knb(thM77348a);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
