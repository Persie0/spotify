package p204p;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class uvy extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final String f234517a;

    /* JADX INFO: renamed from: b */
    public final File f234518b;

    /* JADX INFO: renamed from: c */
    public final tvy f234519c;

    public uvy(String str, File file, tvy tvyVar) {
        this.f234517a = str;
        this.f234518b = file;
        this.f234519c = tvyVar;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m84071a() {
        try {
            if (p2l.f173365a.contains(this)) {
                return null;
            }
            try {
                URL url = new URL(this.f234517a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f234518b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            return m84071a();
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!set.contains(this) && zBooleanValue) {
                try {
                    this.f234519c.mo81624b(this.f234518b);
                } catch (Throwable th) {
                    p2l.m68953a(this, th);
                }
            }
        } catch (Throwable th2) {
            p2l.m68953a(this, th2);
        }
    }
}
