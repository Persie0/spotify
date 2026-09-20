package p204p;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.media3.transformer.ExportException;
import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: classes3.dex */
public final class i440 implements fk00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j440 f98427a;

    public i440(j440 j440Var) {
        this.f98427a = j440Var;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        this.f98427a.f108585d.mo40840b(ExportException.m868a(AudioEpisode.SHOW_URI_FIELD_NUMBER, th));
    }

    @Override // p204p.fk00
    public final void onSuccess(Object obj) {
        r300 r300Var;
        Bitmap bitmap = (Bitmap) obj;
        this.f98427a.f108590i = 50;
        p300 p300Var = new p300();
        p300Var.f173535w = bitmap.getHeight();
        p300Var.f173534v = bitmap.getWidth();
        p300Var.f173527o = def0.m35799p("image/raw");
        p300Var.f173500G = p7f.f174668i;
        r300 r300Var2 = new r300(p300Var);
        if (this.f98427a.f108586e && Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
            p300 p300VarM74564a = r300Var2.m74564a();
            p300VarM74564a.f173527o = def0.m35799p("image/jpeg_r");
            r300Var = new r300(p300VarM74564a);
        } else {
            r300Var = r300Var2;
        }
        try {
            this.f98427a.f108585d.mo40842d(2, r300Var2);
            this.f98427a.f108587f.submit(new zq4(this, bitmap, r300Var, 20));
        } catch (RuntimeException e) {
            this.f98427a.f108585d.mo40840b(ExportException.m868a(1000, e));
        }
    }
}
