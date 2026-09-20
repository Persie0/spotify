package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.car.app.C0023j;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class k1x0 implements j7b {

    /* JADX INFO: renamed from: a */
    public final er70 f118443a;

    /* JADX INFO: renamed from: b */
    public final i05 f118444b;

    public k1x0(er70 er70Var, i05 i05Var) {
        this.f118443a = er70Var;
        this.f118444b = i05Var;
    }

    @Override // p204p.j7b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CarIcon mo52613a(a7b a7bVar) {
        Object c6x0Var;
        int identifier;
        IconCompat iconCompatM392f;
        CarColor carColorM36971a;
        String str = a7bVar.f13012b;
        Integer num = a7bVar.f13011a;
        try {
            C0023j c0023j = (C0023j) this.f118443a.get();
            Integer num2 = num == null ? null : num;
            if (num2 != null) {
                identifier = num2.intValue();
            } else {
                wj50.m88279p(str);
                List listM88477a1 = wl51.m88477a1(str, new String[]{"/"}, 0, 6);
                identifier = c0023j.getResources().getIdentifier((String) g6f.m43687A0(listM88477a1), (String) listM88477a1.get(listM88477a1.size() - 2), c0023j.getPackageName());
            }
            Integer num3 = a7bVar.f13014d;
            if (num3 != null) {
                int iIntValue = num3.intValue();
                Drawable drawable = c0023j.getDrawable(identifier);
                wj50.m88279p(drawable);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int iApplyDimension = (int) TypedValue.applyDimension(1, iIntValue, c0023j.getResources().getDisplayMetrics());
                int i = iApplyDimension * 2;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth + i, i + intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(iApplyDimension, iApplyDimension, intrinsicWidth + iApplyDimension, intrinsicHeight + iApplyDimension);
                drawable.draw(canvas);
                iconCompatM392f = IconCompat.m390d(bitmapCreateBitmap);
            } else {
                iconCompatM392f = IconCompat.m392f(c0023j, identifier);
            }
            ckx0.f39109e.m33209g(iconCompatM392f);
            pqm0 pqm0Var = a7bVar.f13013c;
            if (pqm0Var == null || (carColorM36971a = CarColor.createCustom(((Number) pqm0Var.f180350a).intValue(), ((Number) pqm0Var.f180351b).intValue())) == null) {
                carColorM36971a = t6b.f217523i.m36971a();
            }
            txb.f224663b.m81899a(carColorM36971a);
            c6x0Var = new CarIcon(iconCompatM392f, carColorM36971a, 1);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        Object obj = str;
        if (thM77348a != null) {
            if (str == null) {
                obj = num;
            }
            String strM56833e = klh.m56833e(obj, "resource:");
            String message = thM77348a.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            this.f118444b.m49295a(strM56833e, message);
        }
        bga.m29073P(c6x0Var);
        return (CarIcon) c6x0Var;
    }
}
