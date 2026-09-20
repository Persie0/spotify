package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.BiFunction;

/* JADX INFO: loaded from: classes9.dex */
public final class bqe1 implements BiFunction, nuf1, z7g1, k6f1 {

    /* JADX INFO: renamed from: a */
    public final Object f29801a;

    public /* synthetic */ bqe1(Object obj) {
        this.f29801a = obj;
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ uo80 m30253f(bqe1 bqe1Var) {
        return (uo80) bqe1Var.f29801a;
    }

    @Override // p204p.nuf1
    /* JADX INFO: renamed from: a */
    public aog1 mo30254a(String str, String str2, aef1 aef1Var, long j) {
        return new aog1(31, new pof1(this, str, aef1Var, j, (fbk) null, 3), null);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        cqe1 cqe1Var = (cqe1) this.f29801a;
        int i = (zBooleanValue && zBooleanValue2) ? 2 : 1;
        Context context = cqe1Var.f40871a;
        er70 er70Var = cqe1Var.f40874d;
        String string = context.getString(R.string.offline_playable_cache_title);
        ((ewk0) er70Var.get()).getClass();
        tc5 tc5Var = gn80.f82152a;
        String strM49351w = i091.m49351w();
        ((ewk0) er70Var.get()).getClass();
        return new ouo0(string, strM49351w, i, ewk0.m40145a());
    }

    @Override // p204p.k6f1
    /* JADX INFO: renamed from: b */
    public void mo30255b(Bitmap bitmap) {
        ura0 ura0Var = s0h1.f204393v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        ((s0h1) this.f29801a).m76875d(0, bitmap2);
    }

    /* JADX INFO: renamed from: c */
    public void m30256c(lzi lziVar) {
        ((xj10) this.f29801a).mo28089C(lziVar);
    }

    @Override // p204p.nuf1
    /* JADX INFO: renamed from: d */
    public cog1 mo30257d(String str, String str2) {
        return new cog1(new rp2(2, 1, null));
    }

    @Override // p204p.nuf1
    /* JADX INFO: renamed from: e */
    public aog1 mo30258e(long j, gef1 gef1Var) {
        return new aog1(30, new gb50(this, j, gef1Var, (fbk) null, 3), null);
    }

    @Override // p204p.z7g1
    public t9g1 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            z7g1 z7g1Var = ((z7g1[]) this.f29801a)[i];
            if (z7g1Var.zzc(cls)) {
                return z7g1Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p204p.z7g1
    public boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((z7g1[]) this.f29801a)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    public bqe1() {
        this.f29801a = pf40.m69788m();
    }
}
