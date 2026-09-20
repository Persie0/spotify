package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class j440 implements ab6 {

    /* JADX INFO: renamed from: a */
    public final Context f108582a;

    /* JADX INFO: renamed from: b */
    public final y8t f108583b;

    /* JADX INFO: renamed from: c */
    public final uh9 f108584c;

    /* JADX INFO: renamed from: d */
    public final za6 f108585d;

    /* JADX INFO: renamed from: e */
    public final boolean f108586e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f108587f;

    /* JADX INFO: renamed from: g */
    public f0y0 f108588g;

    /* JADX INFO: renamed from: h */
    public int f108589h;

    /* JADX INFO: renamed from: i */
    public volatile int f108590i;

    public j440(Context context, y8t y8tVar, za6 za6Var, uh9 uh9Var, boolean z) {
        c95.m31855u(y8tVar.f270376d != -9223372036854775807L);
        c95.m31855u(y8tVar.f270377e != -2147483647);
        this.f108582a = context;
        this.f108583b = y8tVar;
        this.f108585d = za6Var;
        this.f108584c = uh9Var;
        this.f108586e = z;
        this.f108587f = Executors.newSingleThreadScheduledExecutor();
        this.f108589h = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m52323a(final Bitmap bitmap, final r300 r300Var) {
        try {
            f0y0 f0y0Var = this.f108588g;
            if (f0y0Var == null) {
                this.f108588g = this.f108585d.mo40843e(r300Var);
                final int i = 0;
                this.f108587f.schedule(new Runnable(this) { // from class: p.h440

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ j440 f87422b;

                    {
                        this.f87422b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f87422b.m52323a(bitmap, r300Var);
                                break;
                            default:
                                this.f87422b.m52323a(bitmap, r300Var);
                                break;
                        }
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            y8t y8tVar = this.f108583b;
            int iMo40514i = f0y0Var.mo40514i(bitmap, new h5j(y8tVar.f270376d, y8tVar.f270377e, 0));
            if (iMo40514i == 1) {
                this.f108590i = 100;
                this.f108588g.mo40512g();
            } else if (iMo40514i == 2) {
                final int i2 = 1;
                this.f108587f.schedule(new Runnable(this) { // from class: p.h440

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ j440 f87422b;

                    {
                        this.f87422b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f87422b.m52323a(bitmap, r300Var);
                                break;
                            default:
                                this.f87422b.m52323a(bitmap, r300Var);
                                break;
                        }
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                if (iMo40514i != 3) {
                    throw new IllegalStateException();
                }
                this.f108590i = 100;
            }
        } catch (ExportException e) {
            this.f108585d.mo40840b(e);
        } catch (RuntimeException e2) {
            this.f108585d.mo40840b(ExportException.m868a(1000, e2));
        }
    }

    @Override // p204p.ab6
    /* JADX INFO: renamed from: c */
    public final int mo25326c(zz11 zz11Var) {
        if (this.f108589h == 2) {
            zz11Var.f287861b = this.f108590i;
        }
        return this.f108589h;
    }

    @Override // p204p.ab6
    /* JADX INFO: renamed from: g */
    public final xf40 mo25327g() {
        return btv0.f30940g;
    }

    @Override // p204p.ab6
    public final void release() {
        this.f108589h = 0;
        this.f108587f.shutdownNow();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x002f, please report this as an issue */
    @Override // p204p.ab6
    public final void start() {
        u790 qe40Var;
        this.f108589h = 2;
        y8t y8tVar = this.f108583b;
        long j = y8tVar.f270376d;
        za6 za6Var = this.f108585d;
        za6Var.mo40844f(j);
        za6Var.mo40839a(1);
        ufd0 ufd0Var = y8tVar.f270373a;
        String strM38691v = eem.m38691v(this.f108582a, ufd0Var);
        if (strM38691v != null) {
            uh9 uh9Var = this.f108584c;
            if (uh9Var.mo60772e(strM38691v)) {
                ofd0 ofd0Var = ufd0Var.f229763b;
                ofd0Var.getClass();
                qe40Var = uh9Var.mo60774h(ofd0Var.f164727a);
            } else {
                qe40Var = new qe40(ParserException.m755d("Attempted to load a Bitmap from unsupported MIME type: " + strM38691v));
            }
        } else {
            qe40Var = new qe40(ParserException.m755d("Attempted to load a Bitmap from unsupported MIME type: " + strM38691v));
        }
        qe40Var.mo28322a(new lk00(22, qe40Var, new i440(this)), this.f108587f);
    }
}
