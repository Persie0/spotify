package p204p;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class h77 {

    /* JADX INFO: renamed from: a */
    public final Object f88358a;

    /* JADX INFO: renamed from: b */
    public final Object f88359b;

    /* JADX INFO: renamed from: c */
    public final Object f88360c;

    public h77(Context context, pzs0 pzs0Var, luk lukVar) {
        this.f88358a = context;
        this.f88359b = pzs0Var;
        this.f88360c = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m46757a(h77 h77Var) {
        ((i77) h77Var.f88360c).f99441a.unregisterStreamEventCallback((g77) h77Var.f88359b);
        ((Handler) h77Var.f88358a).removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m46758b(h77 h77Var, File file, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        ContentResolver contentResolver = ((Context) h77Var.f88358a).getApplicationContext().getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            throw new IllegalStateException("Failed to create MediaStore entry for video");
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
        if (outputStreamOpenOutputStream == null) {
            throw new IllegalStateException("Failed to open output stream for video MediaStore entry");
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                kgg1.m56350m(fileInputStream, outputStreamOpenOutputStream);
                fileInputStream.close();
                outputStreamOpenOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n0e1.m63430g(outputStreamOpenOutputStream, th3);
                throw th4;
            }
        }
    }

    public h77(i77 i77Var) {
        this.f88360c = i77Var;
        Handler handlerM46330r = h0b1.m46330r(null);
        this.f88358a = handlerM46330r;
        g77 g77Var = new g77(this);
        this.f88359b = g77Var;
        i77Var.f99441a.registerStreamEventCallback(new xgi(handlerM46330r, 0), g77Var);
    }
}
