package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class fxw0 {

    /* JADX INFO: renamed from: f */
    public static final xr01 f74473f;

    /* JADX INFO: renamed from: a */
    public final Context f74474a;

    /* JADX INFO: renamed from: b */
    public final abs0 f74475b;

    /* JADX INFO: renamed from: c */
    public final e940 f74476c;

    /* JADX INFO: renamed from: d */
    public final okj0 f74477d;

    /* JADX INFO: renamed from: e */
    public final ei9 f74478e;

    static {
        Set set = dd41.f47702f;
        f74473f = new xr01(r46.m74726U("spotify:shareformat:reserved"));
    }

    public fxw0(Context context, abs0 abs0Var, e940 e940Var, okj0 okj0Var, ei9 ei9Var) {
        this.f74474a = context;
        this.f74475b = abs0Var;
        this.f74476c = e940Var;
        this.f74477d = okj0Var;
        this.f74478e = ei9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m43026a(fxw0 fxw0Var, String str, int i, ibk ibkVar) {
        dxw0 dxw0Var;
        if (ibkVar instanceof dxw0) {
            dxw0Var = (dxw0) ibkVar;
            int i2 = dxw0Var.f54112c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dxw0Var.f54112c = i2 - Integer.MIN_VALUE;
            } else {
                dxw0Var = new dxw0(fxw0Var, ibkVar);
            }
        } else {
            dxw0Var = new dxw0(fxw0Var, ibkVar);
        }
        Object objM96567o = dxw0Var.f54110a;
        int i3 = dxw0Var.f54112c;
        try {
            if (i3 == 0) {
                bga.m29073P(objM96567o);
                lxe lxeVarMo24613j = fxw0Var.f74476c.mo24613j(str);
                lxeVarMo24613j.m60190p(i, i, 1);
                lxeVarMo24613j.m60178d();
                lxeVarMo24613j.f137801g = false;
                Single singleM60183i = lxeVarMo24613j.m60183i();
                dxw0Var.f54112c = 1;
                objM96567o = zn91.m96567o(singleM60183i, dxw0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return (Bitmap) objM96567o;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x0266 A[LOOP:0: B:40:0x0262->B:42:0x0266, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0425  */
    /* JADX WARN: Code duplicated, block: B:59:0x042b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0431  */
    /* JADX WARN: Code duplicated, block: B:65:0x0437  */
    /* JADX WARN: Code duplicated, block: B:68:0x043e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0444  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r4v16, types: [p.ao8, p.gcr0] */
    /* JADX INFO: renamed from: b */
    public final Object m43027b(lu01 lu01Var, ibk ibkVar) throws Throwable {
        cxw0 cxw0Var;
        lxw0 lxw0Var;
        Bitmap bitmap;
        Bitmap bitmap2;
        okj0 okj0Var;
        Context context;
        int i;
        kxw0 kxw0Var;
        boolean z;
        pqm0 pqm0Var;
        Canvas canvas;
        lu01 lu01Var2;
        lxw0 lxw0Var2;
        Paint paint;
        int i2;
        Uri uri;
        ro8 ro8Var;
        String str;
        k1b1 k1b1Var;
        String str2;
        String str3;
        lu01 lu01Var3 = lu01Var;
        if (ibkVar instanceof cxw0) {
            cxw0Var = (cxw0) ibkVar;
            int i3 = cxw0Var.f43113e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cxw0Var.f43113e = i3 - Integer.MIN_VALUE;
            } else {
                cxw0Var = new cxw0(this, ibkVar);
            }
        } else {
            cxw0Var = new cxw0(this, ibkVar);
        }
        Object objM76980u = cxw0Var.f43111c;
        int i4 = cxw0Var.f43113e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(objM76980u);
            String str4 = lu01Var3.f136946a;
            cxw0Var.f43109a = lu01Var3;
            cxw0Var.f43113e = 1;
            objM76980u = s1h1.m76980u(3000L, new nm0(this.f74475b, str4, fbkVar, 24), cxw0Var);
            if (objM76980u != yukVar) {
            }
            return yukVar;
        }
        if (i4 == 1) {
            lu01Var3 = cxw0Var.f43109a;
            bga.m29073P(objM76980u);
        } else {
            if (i4 == 2) {
                lxw0 lxw0Var3 = cxw0Var.f43110b;
                lu01 lu01Var4 = cxw0Var.f43109a;
                bga.m29073P(objM76980u);
                lxw0Var = lxw0Var3;
                lu01Var3 = lu01Var4;
                pqm0 pqm0Var2 = (pqm0) objM76980u;
                bitmap = (Bitmap) pqm0Var2.f180350a;
                bitmap2 = (Bitmap) pqm0Var2.f180351b;
                if (bitmap != null) {
                    okj0Var = this.f74477d;
                    context = (Context) okj0Var.f166380a;
                    i = lxw0Var.f137906h;
                    kxw0Var = lxw0Var.f137899a;
                    z = kxw0Var instanceof jxw0;
                    if (z) {
                        pqm0Var = new pqm0(380, 675);
                    } else {
                        if (kxw0Var instanceof ixw0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pqm0Var = new pqm0(396, Integer.valueOf(CtaType.SEE_ALL_SHOWS_FIELD_NUMBER));
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Number) pqm0Var.f180350a).intValue() * 2, ((Number) pqm0Var.f180351b).intValue() * 2, Bitmap.Config.ARGB_8888);
                    canvas = new Canvas(bitmapCreateBitmap);
                    canvas.scale(2.0f, 2.0f);
                    if (z) {
                        jxw0 jxw0Var = (jxw0) kxw0Var;
                        RectF rectF = new RectF(0.0f, 0.0f, 380.0f, 675.0f);
                        float fSqrt = (float) Math.sqrt(672.0f);
                        float fAtan2 = (float) (((double) (((float) Math.atan2(fSqrt, 2.0f)) * 180.0f)) / 3.141592653589793d);
                        Path path = new Path();
                        path.moveTo(rectF.left + 16.0f, rectF.top);
                        path.lineTo(rectF.right - 16.0f, rectF.top);
                        okj0.m67216t(path, rectF.right - 16.0f, rectF.top + 16.0f, 16.0f, -90.0f, 90.0f);
                        float f = 453.0f - fSqrt;
                        path.lineTo(rectF.right, f);
                        okj0.m67216t(path, rectF.right - 2.0f, f, 2.0f, 0.0f, fAtan2);
                        float f2 = fAtan2 * (-2.0f);
                        okj0.m67216t(path, rectF.right, 453.0f, 24.0f, fAtan2 - 180.0f, f2);
                        float f3 = 453.0f + fSqrt;
                        okj0.m67216t(path, rectF.right - 2.0f, f3, 2.0f, -fAtan2, fAtan2);
                        path.lineTo(rectF.right, rectF.bottom - 16.0f);
                        okj0.m67216t(path, rectF.right - 16.0f, rectF.bottom - 16.0f, 16.0f, 0.0f, 90.0f);
                        path.lineTo(rectF.left + 16.0f, rectF.bottom);
                        okj0.m67216t(path, rectF.left + 16.0f, rectF.bottom - 16.0f, 16.0f, 90.0f, 90.0f);
                        path.lineTo(rectF.left, f3);
                        okj0.m67216t(path, rectF.left + 2.0f, f3, 2.0f, 180.0f, fAtan2);
                        okj0.m67216t(path, rectF.left, 453.0f, 24.0f, fAtan2, f2);
                        okj0.m67216t(path, rectF.left + 2.0f, f, 2.0f, 180.0f - fAtan2, fAtan2);
                        path.lineTo(rectF.left, rectF.top + 16.0f);
                        okj0.m67216t(path, rectF.left + 16.0f, rectF.top + 16.0f, 16.0f, 180.0f, 90.0f);
                        path.close();
                        okj0.m67203A(canvas, path, i);
                        canvas.save();
                        canvas.clipPath(path);
                        canvas.drawColor(i);
                        lxw0Var = lxw0Var;
                        okj0Var.m67222F(canvas, lxw0Var, bitmap, context.getString(R.string.reserved_share_reserved_headline), 92.0f, 0.3f);
                        int i5 = lxw0Var.f137907i;
                        paint = new Paint(1);
                        paint.setColor(okj0.m67212i0(0.1f, i5));
                        i2 = 0;
                        while (i2 < 30) {
                            float f4 = (i2 * 11.0f) + 26.4707f;
                            canvas.drawRoundRect(new RectF(f4, 452.0f, 7.0f + f4, 455.0f), 1.5f, 1.5f, paint);
                            i2++;
                            lxw0Var = lxw0Var;
                        }
                        okj0Var.m67220C(canvas, lxw0Var, bitmap2, context.getString(R.string.reserved_share_issued_date_label), okj0Var.m67225J(0, jxw0Var.f117239a), null, 483.0f);
                        okj0Var.m67221E(canvas, lxw0Var, context.getString(R.string.reserved_share_early_access_status), 177.0f, 180.0f, 594.0f, -3.14f);
                        canvas.restore();
                        okj0.m67209Z(canvas, path, Color.argb(26, 255, 255, 255), 1.0f);
                    } else {
                        if (kxw0Var instanceof ixw0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ixw0 ixw0Var = (ixw0) kxw0Var;
                        canvas.save();
                        canvas.translate(200.0f, 228.5f);
                        canvas.rotate(-0.97f);
                        canvas.translate(-190.0f, -226.5f);
                        Path pathM67208X = okj0.m67208X(new RectF(0.0f, 0.0f, 380.0f, 453.0f), false);
                        okj0.m67203A(canvas, pathM67208X, i);
                        canvas.save();
                        canvas.clipPath(pathM67208X);
                        canvas.drawColor(i);
                        okj0Var.m67222F(canvas, lxw0Var, bitmap, context.getString(R.string.reserved_share_purchased_headline), 71.0f, 0.2f);
                        canvas.restore();
                        okj0.m67209Z(canvas, pathM67208X, Color.argb(26, 255, 255, 255), 2.0f);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(198.0f, 579.0f);
                        canvas.rotate(3.0f);
                        canvas.translate(-190.0f, -111.0f);
                        Path pathM67208X2 = okj0.m67208X(new RectF(0.0f, 0.0f, 380.0f, 222.0f), true);
                        okj0.m67203A(canvas, pathM67208X2, i);
                        canvas.save();
                        canvas.clipPath(pathM67208X2);
                        canvas.drawColor(i);
                        okj0Var.m67220C(canvas, lxw0Var, bitmap2, context.getString(R.string.reserved_share_date_label), okj0Var.m67225J(ixw0Var.f106781b, ixw0Var.f106780a), ixw0Var.f106782c, 25.0f);
                        okj0Var.m67221E(canvas, lxw0Var, context.getString(R.string.reserved_share_going_status), 136.0f, 194.0f, 135.0f, -0.19f);
                        canvas.restore();
                        okj0.m67209Z(canvas, pathM67208X2, Color.argb(26, 255, 255, 255), 2.0f);
                        canvas.restore();
                    }
                    cxw0Var.f43109a = lu01Var3;
                    cxw0Var.f43110b = lxw0Var;
                    cxw0Var.f43113e = 3;
                    objM76980u = this.f74478e.m39086b(bitmapCreateBitmap, Bitmap.CompressFormat.PNG, 100, cxw0Var);
                    if (objM76980u == yukVar) {
                        return yukVar;
                    }
                    lu01Var2 = lu01Var3;
                    lxw0Var2 = lxw0Var;
                }
                return null;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lxw0Var2 = cxw0Var.f43110b;
            lu01Var2 = cxw0Var.f43109a;
            bga.m29073P(objM76980u);
            fbkVar = null;
        }
        uri = (Uri) objM76980u;
        if (uri == null) {
            return fbkVar;
        }
        gcr0 gcr0Var = new gcr0(uri, klh.m56834f(this.f74474a.getString(R.string.reserved_share_accessibility_title, lxw0Var2.f137900b), "\n", lxw0Var2.f137901c));
        int i6 = lxw0Var2.f137907i;
        ro8Var = new ro8();
        ro8Var.f201160a = lu01Var2.f136946a;
        List listM46715L = h6f.m46715L(new fcr0(i6, i6, ""), new fcr0(i6, -16777216, ""));
        ArrayList arrayList = ro8Var.f201161b;
        arrayList.clear();
        arrayList.addAll(listM46715L);
        ro8Var.f201163d = gcr0Var;
        ?? r4 = fbkVar;
        ro8Var.f201169j = new zn8(gcr0Var, r4);
        ro8Var.f201162c = f74473f;
        ro8Var.f201168i = r4;
        ro8Var.f201174o = true;
        ro8Var.f201175p = bk01.f27801a;
        ro8Var.f201170k.putAll(lu01Var2.f136948c);
        str = lu01Var2.f136947b;
        if (str != null) {
            ro8Var.f201166g = str;
        }
        k1b1Var = lu01Var2.f136949d;
        if (k1b1Var != null) {
            ro8Var.f201167h = k1b1Var;
        }
        str2 = lu01Var2.f136950e;
        if (str2 != null) {
            ro8Var.f201164e = str2;
        }
        str3 = lu01Var2.f136951f;
        if (str3 != null) {
            ro8Var.f201165f = str3;
        }
        return ro8Var.m76021b();
        lxw0 lxw0Var4 = (lxw0) objM76980u;
        if (lxw0Var4 != null) {
            cxw0Var.f43109a = lu01Var3;
            cxw0Var.f43110b = lxw0Var4;
            cxw0Var.f43113e = 2;
            Object objM56684z = kk40.m56684z(new gjw0(this, lxw0Var4, (fbk) null), cxw0Var);
            if (objM56684z != yukVar) {
                lxw0Var = lxw0Var4;
                objM76980u = objM56684z;
                pqm0 pqm0Var3 = (pqm0) objM76980u;
                bitmap = (Bitmap) pqm0Var3.f180350a;
                bitmap2 = (Bitmap) pqm0Var3.f180351b;
                if (bitmap != null) {
                    okj0Var = this.f74477d;
                    context = (Context) okj0Var.f166380a;
                    i = lxw0Var.f137906h;
                    kxw0Var = lxw0Var.f137899a;
                    z = kxw0Var instanceof jxw0;
                    if (z) {
                        pqm0Var = new pqm0(380, 675);
                    } else {
                        if (kxw0Var instanceof ixw0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pqm0Var = new pqm0(396, Integer.valueOf(CtaType.SEE_ALL_SHOWS_FIELD_NUMBER));
                    }
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(((Number) pqm0Var.f180350a).intValue() * 2, ((Number) pqm0Var.f180351b).intValue() * 2, Bitmap.Config.ARGB_8888);
                    canvas = new Canvas(bitmapCreateBitmap2);
                    canvas.scale(2.0f, 2.0f);
                    if (z) {
                        jxw0 jxw0Var2 = (jxw0) kxw0Var;
                        RectF rectF2 = new RectF(0.0f, 0.0f, 380.0f, 675.0f);
                        float fSqrt2 = (float) Math.sqrt(672.0f);
                        float fAtan3 = (float) (((double) (((float) Math.atan2(fSqrt2, 2.0f)) * 180.0f)) / 3.141592653589793d);
                        Path path2 = new Path();
                        path2.moveTo(rectF2.left + 16.0f, rectF2.top);
                        path2.lineTo(rectF2.right - 16.0f, rectF2.top);
                        okj0.m67216t(path2, rectF2.right - 16.0f, rectF2.top + 16.0f, 16.0f, -90.0f, 90.0f);
                        float f5 = 453.0f - fSqrt2;
                        path2.lineTo(rectF2.right, f5);
                        okj0.m67216t(path2, rectF2.right - 2.0f, f5, 2.0f, 0.0f, fAtan3);
                        float f6 = fAtan3 * (-2.0f);
                        okj0.m67216t(path2, rectF2.right, 453.0f, 24.0f, fAtan3 - 180.0f, f6);
                        float f7 = 453.0f + fSqrt2;
                        okj0.m67216t(path2, rectF2.right - 2.0f, f7, 2.0f, -fAtan3, fAtan3);
                        path2.lineTo(rectF2.right, rectF2.bottom - 16.0f);
                        okj0.m67216t(path2, rectF2.right - 16.0f, rectF2.bottom - 16.0f, 16.0f, 0.0f, 90.0f);
                        path2.lineTo(rectF2.left + 16.0f, rectF2.bottom);
                        okj0.m67216t(path2, rectF2.left + 16.0f, rectF2.bottom - 16.0f, 16.0f, 90.0f, 90.0f);
                        path2.lineTo(rectF2.left, f7);
                        okj0.m67216t(path2, rectF2.left + 2.0f, f7, 2.0f, 180.0f, fAtan3);
                        okj0.m67216t(path2, rectF2.left, 453.0f, 24.0f, fAtan3, f6);
                        okj0.m67216t(path2, rectF2.left + 2.0f, f5, 2.0f, 180.0f - fAtan3, fAtan3);
                        path2.lineTo(rectF2.left, rectF2.top + 16.0f);
                        okj0.m67216t(path2, rectF2.left + 16.0f, rectF2.top + 16.0f, 16.0f, 180.0f, 90.0f);
                        path2.close();
                        okj0.m67203A(canvas, path2, i);
                        canvas.save();
                        canvas.clipPath(path2);
                        canvas.drawColor(i);
                        lxw0Var = lxw0Var;
                        okj0Var.m67222F(canvas, lxw0Var, bitmap, context.getString(R.string.reserved_share_reserved_headline), 92.0f, 0.3f);
                        int i7 = lxw0Var.f137907i;
                        paint = new Paint(1);
                        paint.setColor(okj0.m67212i0(0.1f, i7));
                        i2 = 0;
                        while (i2 < 30) {
                            float f8 = (i2 * 11.0f) + 26.4707f;
                            canvas.drawRoundRect(new RectF(f8, 452.0f, 7.0f + f8, 455.0f), 1.5f, 1.5f, paint);
                            i2++;
                            lxw0Var = lxw0Var;
                        }
                        okj0Var.m67220C(canvas, lxw0Var, bitmap2, context.getString(R.string.reserved_share_issued_date_label), okj0Var.m67225J(0, jxw0Var2.f117239a), null, 483.0f);
                        okj0Var.m67221E(canvas, lxw0Var, context.getString(R.string.reserved_share_early_access_status), 177.0f, 180.0f, 594.0f, -3.14f);
                        canvas.restore();
                        okj0.m67209Z(canvas, path2, Color.argb(26, 255, 255, 255), 1.0f);
                    } else {
                        if (kxw0Var instanceof ixw0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ixw0 ixw0Var2 = (ixw0) kxw0Var;
                        canvas.save();
                        canvas.translate(200.0f, 228.5f);
                        canvas.rotate(-0.97f);
                        canvas.translate(-190.0f, -226.5f);
                        Path pathM67208X3 = okj0.m67208X(new RectF(0.0f, 0.0f, 380.0f, 453.0f), false);
                        okj0.m67203A(canvas, pathM67208X3, i);
                        canvas.save();
                        canvas.clipPath(pathM67208X3);
                        canvas.drawColor(i);
                        okj0Var.m67222F(canvas, lxw0Var, bitmap, context.getString(R.string.reserved_share_purchased_headline), 71.0f, 0.2f);
                        canvas.restore();
                        okj0.m67209Z(canvas, pathM67208X3, Color.argb(26, 255, 255, 255), 2.0f);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(198.0f, 579.0f);
                        canvas.rotate(3.0f);
                        canvas.translate(-190.0f, -111.0f);
                        Path pathM67208X4 = okj0.m67208X(new RectF(0.0f, 0.0f, 380.0f, 222.0f), true);
                        okj0.m67203A(canvas, pathM67208X4, i);
                        canvas.save();
                        canvas.clipPath(pathM67208X4);
                        canvas.drawColor(i);
                        okj0Var.m67220C(canvas, lxw0Var, bitmap2, context.getString(R.string.reserved_share_date_label), okj0Var.m67225J(ixw0Var2.f106781b, ixw0Var2.f106780a), ixw0Var2.f106782c, 25.0f);
                        okj0Var.m67221E(canvas, lxw0Var, context.getString(R.string.reserved_share_going_status), 136.0f, 194.0f, 135.0f, -0.19f);
                        canvas.restore();
                        okj0.m67209Z(canvas, pathM67208X4, Color.argb(26, 255, 255, 255), 2.0f);
                        canvas.restore();
                    }
                    cxw0Var.f43109a = lu01Var3;
                    cxw0Var.f43110b = lxw0Var;
                    cxw0Var.f43113e = 3;
                    objM76980u = this.f74478e.m39086b(bitmapCreateBitmap2, Bitmap.CompressFormat.PNG, 100, cxw0Var);
                    if (objM76980u == yukVar) {
                        return yukVar;
                    }
                    lu01Var2 = lu01Var3;
                    lxw0Var2 = lxw0Var;
                    uri = (Uri) objM76980u;
                    if (uri == null) {
                        return fbkVar;
                    }
                    gcr0 gcr0Var2 = new gcr0(uri, klh.m56834f(this.f74474a.getString(R.string.reserved_share_accessibility_title, lxw0Var2.f137900b), "\n", lxw0Var2.f137901c));
                    int i8 = lxw0Var2.f137907i;
                    ro8Var = new ro8();
                    ro8Var.f201160a = lu01Var2.f136946a;
                    List listM46715L2 = h6f.m46715L(new fcr0(i8, i8, ""), new fcr0(i8, -16777216, ""));
                    ArrayList arrayList2 = ro8Var.f201161b;
                    arrayList2.clear();
                    arrayList2.addAll(listM46715L2);
                    ro8Var.f201163d = gcr0Var2;
                    ?? r5 = fbkVar;
                    ro8Var.f201169j = new zn8(gcr0Var2, r5);
                    ro8Var.f201162c = f74473f;
                    ro8Var.f201168i = r5;
                    ro8Var.f201174o = true;
                    ro8Var.f201175p = bk01.f27801a;
                    ro8Var.f201170k.putAll(lu01Var2.f136948c);
                    str = lu01Var2.f136947b;
                    if (str != null) {
                        ro8Var.f201166g = str;
                    }
                    k1b1Var = lu01Var2.f136949d;
                    if (k1b1Var != null) {
                        ro8Var.f201167h = k1b1Var;
                    }
                    str2 = lu01Var2.f136950e;
                    if (str2 != null) {
                        ro8Var.f201164e = str2;
                    }
                    str3 = lu01Var2.f136951f;
                    if (str3 != null) {
                        ro8Var.f201165f = str3;
                    }
                    return ro8Var.m76021b();
                }
            }
            return yukVar;
        }
        return null;
    }
}
