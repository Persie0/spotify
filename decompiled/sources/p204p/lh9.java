package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.car.app.model.Alert;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class lh9 implements ero {

    /* JADX INFO: renamed from: a */
    public final vc40 f133422a;

    /* JADX INFO: renamed from: b */
    public final ivl0 f133423b;

    /* JADX INFO: renamed from: c */
    public final tpz0 f133424c;

    /* JADX INFO: renamed from: d */
    public final ghx f133425d;

    public lh9(vc40 vc40Var, ivl0 ivl0Var, tpz0 tpz0Var, ghx ghxVar) {
        this.f133422a = vc40Var;
        this.f133423b = ivl0Var;
        this.f133424c = tpz0Var;
        this.f133425d = ghxVar;
    }

    /* JADX INFO: renamed from: b */
    public static zqo m58959b(lh9 lh9Var) throws Exception {
        xgx xgxVar;
        Context context;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int iMin;
        double dMax;
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        ivl0 ivl0Var = lh9Var.f133423b;
        ih9 ih9Var = new ih9(lh9Var.f133422a.mo34165C1());
        vuu0 vuu0Var = new vuu0(ih9Var);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new uuu0(vuu0Var.peek()), null, options);
        Exception exc = ih9Var.f102213b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = hhx.f91610a;
        String str = options.outMimeType;
        lh9Var.f133425d.getClass();
        if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
            ehx ehxVar = new ehx(new fhx(new uuu0(vuu0Var.peek())));
            int iM39032i = ehxVar.m39032i(1, "Orientation");
            boolean z2 = iM39032i == 2 || iM39032i == 7 || iM39032i == 4 || iM39032i == 5;
            switch (ehxVar.m39032i(1, "Orientation")) {
                case 3:
                case 4:
                    i = 180;
                    break;
                case 5:
                case 8:
                    i = 270;
                    break;
                case 6:
                case 7:
                    i = 90;
                    break;
                default:
                    i = 0;
                    break;
            }
            xgxVar = new xgx(z2, i);
        } else {
            xgxVar = xgx.f261386c;
        }
        int i2 = xgxVar.f261388b;
        boolean z3 = xgxVar.f261387a;
        Exception exc2 = ih9Var.f102213b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && zb40.m95823b(ivl0Var) != null) {
            options.inPreferredColorSpace = (ColorSpace) zuj0.m97055r(ivl0Var, zb40.f281238c);
        }
        boolean zBooleanValue = ((Boolean) zuj0.m97055r(ivl0Var, zb40.f281239d)).booleanValue();
        Context context2 = ivl0Var.f106232a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) zuj0.m97055r(ivl0Var, zb40.f281237b);
        if ((z3 || i2 > 0) && (config == null || n0b1.m63384x(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) zuj0.m97055r(ivl0Var, zb40.f281242g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && wj50.m88271j(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i3 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            context = context2;
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i4 = b3h1.m28030m(xgxVar) ? options.outHeight : options.outWidth;
            int i5 = b3h1.m28030m(xgxVar) ? options.outWidth : options.outHeight;
            ci21 ci21Var = ivl0Var.f106233b;
            ray0 ray0Var = ivl0Var.f106234c;
            long jM85471l = vgg1.m85471l(i4, i5, ci21Var, ray0Var, (ci21) zuj0.m97055r(ivl0Var, yb40.f271072b));
            int i6 = (int) (jM85471l >> 32);
            int i7 = (int) (jM85471l & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i4 / i6);
            int iHighestOneBit2 = Integer.highestOneBit(i5 / i7);
            int iOrdinal = ray0Var.ordinal();
            if (iOrdinal == 0) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            double d = iMin;
            double d2 = ((double) i4) / d;
            double d3 = ((double) i5) / d;
            double d4 = ((double) i6) / d2;
            context = context2;
            double d5 = ((double) i7) / d3;
            int iOrdinal2 = ray0Var.ordinal();
            if (iOrdinal2 == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                dMax = Math.min(d4, d5);
            }
            if (ivl0Var.f106235d == 2 && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = q3d0.m72082M(((double) Alert.DURATION_SHOW_INDEFINITELY) / dMax);
                    options.inTargetDensity = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    options.inDensity = Alert.DURATION_SHOW_INDEFINITELY;
                    options.inTargetDensity = q3d0.m72082M(((double) Alert.DURATION_SHOW_INDEFINITELY) * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new uuu0(vuu0Var), null, options);
            vuu0Var.close();
            Exception exc3 = ih9Var.f102213b;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i2 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i2 > 0) {
                    matrix.postRotate(i2, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (b3h1.m28030m(xgxVar)) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, hhx.f91610a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new zqo(ufc1.m82967e(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(vuu0Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ero
    /* JADX INFO: renamed from: a */
    public final Object mo39812a(fbk fbkVar) throws Throwable {
        kh9 kh9Var;
        tpz0 tpz0Var;
        int i;
        opz0 opz0Var;
        Object obj;
        Throwable th;
        if (fbkVar instanceof kh9) {
            kh9Var = (kh9) fbkVar;
            int i2 = kh9Var.f122557e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kh9Var.f122557e = i2 - Integer.MIN_VALUE;
            } else {
                kh9Var = new kh9(this, (ibk) fbkVar);
            }
        } else {
            kh9Var = new kh9(this, (ibk) fbkVar);
        }
        Object obj2 = kh9Var.f122555c;
        int i3 = kh9Var.f122557e;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj2);
                tpz0Var = this.f133424c;
                kh9Var.f122553a = tpz0Var;
                i = 0;
                kh9Var.f122554b = 0;
                kh9Var.f122557e = 1;
                if (tpz0Var.m78928b(kh9Var) != yukVar) {
                }
                opz0Var = tpz0Var;
                return yukVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = kh9Var.f122553a;
                try {
                    bga.m29073P(obj2);
                    obj = obj;
                    zqo zqoVar = (zqo) obj2;
                    ((spz0) obj).m78930e();
                    return zqoVar;
                } catch (Throwable th2) {
                    th = th2;
                    ((spz0) obj).m78930e();
                    throw th;
                }
            }
            i = kh9Var.f122554b;
            opz0 opz0Var2 = kh9Var.f122553a;
            bga.m29073P(obj2);
            opz0Var = opz0Var2;
            opz0Var = tpz0Var;
            mo4 mo4Var = new mo4(this, 5);
            kh9Var.f122553a = opz0Var;
            kh9Var.f122554b = i;
            kh9Var.f122557e = 2;
            Object objM87844r = wdg1.m87844r(mo4Var, kh9Var);
            if (objM87844r != yukVar) {
                obj = opz0Var;
                obj2 = objM87844r;
                zqo zqoVar2 = (zqo) obj2;
                ((spz0) obj).m78930e();
                return zqoVar2;
            }
            opz0Var = tpz0Var;
            return yukVar;
        } catch (Throwable th3) {
            obj = opz0Var;
            th = th3;
            ((spz0) obj).m78930e();
            throw th;
        }
    }
}
