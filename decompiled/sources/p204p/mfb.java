package p204p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class mfb {

    /* JADX INFO: renamed from: a */
    public final Context f143007a;

    /* JADX INFO: renamed from: b */
    public final cwf f143008b;

    /* JADX INFO: renamed from: c */
    public qe70 f143009c;

    /* JADX INFO: renamed from: d */
    public Uri f143010d;

    /* JADX INFO: renamed from: e */
    public File f143011e;

    /* JADX INFO: renamed from: f */
    public int f143012f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f143013g;

    /* JADX INFO: renamed from: h */
    public final og0 f143014h;

    /* JADX INFO: renamed from: i */
    public final og0 f143015i;

    /* JADX INFO: renamed from: j */
    public final og0 f143016j;

    public mfb(Context context, Activity activity) {
        this.f143007a = context;
        cwf cwfVar = (cwf) activity;
        this.f143008b = cwfVar;
        zvf zvfVar = cwfVar.f42745i;
        this.f143013g = new ConcurrentHashMap();
        this.f143014h = zvfVar.m69854h("camera_capture", new jfb(7), new kfb(this, 0));
        this.f143015i = zvfVar.m69854h("video_capture", new o5m0(8), new kfb(this, 2));
        this.f143016j = zvfVar.m69854h("camera_permission", new o5m0(4), new kfb(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m61620a(gh00 gh00Var) throws Exception {
        this.f143009c = (qe70) gh00Var;
        this.f143012f = 1;
        if (lzj.m60353c(this.f143007a, "android.permission.CAMERA") == 0) {
            m61621b();
        } else {
            this.f143016j.mo24737a("android.permission.CAMERA");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m61621b() {
        pqm0 pqm0VarM61623d = m61623d(".jpg");
        if (pqm0VarM61623d == null) {
            m61625f(dwb.f53662a);
            return;
        }
        File file = (File) pqm0VarM61623d.f180350a;
        Uri uri = (Uri) pqm0VarM61623d.f180351b;
        this.f143011e = file;
        this.f143010d = uri;
        this.f143014h.mo24737a(uri);
    }

    /* JADX INFO: renamed from: c */
    public final void m61622c() {
        pqm0 pqm0VarM61623d = m61623d(".mp4");
        if (pqm0VarM61623d == null) {
            m61625f(dwb.f53662a);
            return;
        }
        File file = (File) pqm0VarM61623d.f180350a;
        Uri uri = (Uri) pqm0VarM61623d.f180351b;
        this.f143011e = file;
        this.f143010d = uri;
        this.f143015i.mo24737a(uri);
    }

    /* JADX INFO: renamed from: d */
    public final pqm0 m61623d(String str) {
        Context context = this.f143007a;
        try {
            File file = new File(context.getCacheDir(), "camera");
            file.mkdirs();
            File fileCreateTempFile = File.createTempFile("camera_", str, file);
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".share", fileCreateTempFile);
            this.f143013g.put(uriForFile, fileCreateTempFile);
            return new pqm0(fileCreateTempFile, uriForFile);
        } catch (Exception e) {
            Logger.m3967c(e, "MediaPicker: Failed to create camera output file", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61624e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) this.f143013g.remove(Uri.parse((String) it.next()));
            if (file != null) {
                try {
                    if (!file.delete()) {
                        Logger.m3973i("MediaPicker: Failed to delete temp camera file: %s", file.getName());
                    }
                } catch (SecurityException e) {
                    Logger.m3967c(e, "MediaPicker: Failed to delete temp camera file: %s", file.getName());
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: f */
    public final void m61625f(hwb hwbVar) {
        ?? r0 = this.f143009c;
        this.f143009c = null;
        if (r0 != 0) {
            r0.invoke(hwbVar);
        }
    }
}
