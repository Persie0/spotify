package p204p;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class e7b implements tty {

    /* JADX INFO: renamed from: a */
    public final c7b f56888a;

    /* JADX INFO: renamed from: b */
    public final Context f56889b;

    /* JADX INFO: renamed from: c */
    public final btv0 f56890c;

    /* JADX INFO: renamed from: d */
    public final i05 f56891d;

    public e7b(c7b c7bVar, Context context, btv0 btv0Var, i05 i05Var) {
        this.f56888a = c7bVar;
        this.f56889b = context;
        this.f56890c = btv0Var;
        this.f56891d = i05Var;
    }

    @Override // p204p.tty
    /* JADX INFO: renamed from: a */
    public final Object mo25711a(fbk fbkVar) {
        Object c6x0Var;
        c7b c7bVar = this.f56888a;
        s6b s6bVar = (s6b) this.f56890c.get(c7bVar.getClass());
        if (s6bVar != null) {
            try {
                c6x0Var = s6bVar.mo77322b(c7bVar, this.f56889b);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a != null) {
                String strConcat = "fetcher:".concat(c7bVar.getClass().getSimpleName());
                String message = thM77348a.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                this.f56891d.m49295a(strConcat, message);
            }
            if (c6x0Var instanceof c6x0) {
                c6x0Var = null;
            }
            Bitmap bitmap = (Bitmap) c6x0Var;
            if (bitmap != null) {
                return new r540(new rh9(bitmap), false, 2);
            }
        }
        return null;
    }
}
