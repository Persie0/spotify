package p204p;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;

/* JADX INFO: loaded from: classes10.dex */
public final class ei9 {

    /* JADX INFO: renamed from: a */
    public final Context f59818a;

    /* JADX INFO: renamed from: b */
    public final ki9 f59819b;

    /* JADX INFO: renamed from: c */
    public final pzs0 f59820c;

    /* JADX INFO: renamed from: d */
    public final u7s f59821d;

    public ei9(Context context, ki9 ki9Var, pzs0 pzs0Var, u7s u7sVar) {
        this.f59818a = context;
        this.f59819b = ki9Var;
        this.f59820c = pzs0Var;
        this.f59821d = u7sVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r14 == r9) goto L38;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m39085a(Bitmap bitmap, ibk ibkVar) throws Throwable {
        ci9 ci9Var;
        ovy ovyVar;
        Object objM89557A;
        ovy ovyVar2;
        if (ibkVar instanceof ci9) {
            ci9Var = (ci9) ibkVar;
            int i = ci9Var.f38257e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ci9Var.f38257e = i - Integer.MIN_VALUE;
            } else {
                ci9Var = new ci9(this, ibkVar);
            }
        } else {
            ci9Var = new ci9(this, ibkVar);
        }
        Object objM89557A2 = ci9Var.f38255c;
        int i2 = ci9Var.f38257e;
        w2a1 w2a1Var = w2a1.f247311a;
        ki9 ki9Var = this.f59819b;
        u7s u7sVar = this.f59821d;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM89557A2);
                Uri uri = (Uri) objM89557A2;
                if (uri != null) {
                    ((v7s) u7sVar).m84897b(uri);
                }
                return w2a1Var;
            }
            if (i2 == 2) {
                bitmap = ci9Var.f38253a;
                bga.m29073P(objM89557A2);
                ovyVar = (ovy) objM89557A2;
                ci9Var.f38253a = null;
                ci9Var.f38254b = ovyVar;
                ci9Var.f38257e = 3;
                objM89557A = x0h1.m89557A((luk) ki9Var.f122888f.f120692b, new he30(((m12) ki9Var.f122884b.f14256b).mo28558h(ovyVar), bitmap, fbkVar, 1), ci9Var);
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                    ovyVar2 = ovyVar;
                }
                return yukVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ovyVar2 = ci9Var.f38254b;
            bga.m29073P(objM89557A2);
            MediaScannerConnection.scanFile(this.f59818a.getApplicationContext(), new String[]{((ewy) ovyVar2).f63623b.getAbsolutePath()}, null, new bi9(new ip7(this, 20)));
            return w2a1Var;
        }
        bga.m29073P(objM89557A2);
        ((v7s) u7sVar).m84896a();
        int i3 = Build.VERSION.SDK_INT;
        pzs0 pzs0Var = this.f59820c;
        if (i3 >= 29) {
            String strM71778p = pzs0Var.m71778p(".png");
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", strM71778p);
            contentValues.put("mime_type", "image/png");
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ci9Var.f38253a = null;
            ci9Var.f38254b = null;
            ci9Var.f38257e = 1;
            objM89557A2 = x0h1.m89557A(ki9Var.f122886d, new C1977ig(ki9Var, contentValues, bitmap, (fbk) null), ci9Var);
        } else {
            String strM71778p2 = pzs0Var.m71778p(".png");
            ci9Var.f38253a = bitmap;
            ci9Var.f38257e = 2;
            objM89557A2 = x0h1.m89557A((luk) pzs0Var.f183797e, new xay0(pzs0Var, strM71778p2, fbkVar, 29), ci9Var);
            if (objM89557A2 != yukVar) {
                ovyVar = (ovy) objM89557A2;
                ci9Var.f38253a = null;
                ci9Var.f38254b = ovyVar;
                ci9Var.f38257e = 3;
                objM89557A = x0h1.m89557A((luk) ki9Var.f122888f.f120692b, new he30(((m12) ki9Var.f122884b.f14256b).mo28558h(ovyVar), bitmap, fbkVar, 1), ci9Var);
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A != yukVar) {
                    ovyVar2 = ovyVar;
                    MediaScannerConnection.scanFile(this.f59818a.getApplicationContext(), new String[]{((ewy) ovyVar2).f63623b.getAbsolutePath()}, null, new bi9(new ip7(this, 20)));
                    return w2a1Var;
                }
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m39086b(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, ibk ibkVar) throws Throwable {
        di9 di9Var;
        Bitmap bitmap2;
        int i2;
        if (ibkVar instanceof di9) {
            di9Var = (di9) ibkVar;
            int i3 = di9Var.f49284f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                di9Var.f49284f = i3 - Integer.MIN_VALUE;
            } else {
                di9Var = new di9(this, ibkVar);
            }
        } else {
            di9Var = new di9(this, ibkVar);
        }
        Object objM71774l = di9Var.f49282d;
        int i4 = di9Var.f49284f;
        yuk yukVar = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(objM71774l);
            String str = ai9.f15915a[compressFormat.ordinal()] == 1 ? ".jpg" : ".png";
            pzs0 pzs0Var = this.f59820c;
            String strM71778p = pzs0Var.m71778p(str);
            di9Var.f49279a = bitmap;
            di9Var.f49280b = compressFormat;
            di9Var.f49281c = i;
            di9Var.f49284f = 1;
            objM71774l = pzs0Var.m71774l(strM71778p, di9Var);
            if (objM71774l != yukVar) {
                bitmap2 = bitmap;
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM71774l);
            return objM71774l;
        }
        int i5 = di9Var.f49281c;
        compressFormat = di9Var.f49280b;
        Bitmap bitmap3 = di9Var.f49279a;
        bga.m29073P(objM71774l);
        i2 = i5;
        bitmap2 = bitmap3;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        di9Var.f49279a = null;
        di9Var.f49280b = null;
        di9Var.f49281c = i2;
        di9Var.f49284f = 2;
        ki9 ki9Var = this.f59819b;
        Object objM89557A = x0h1.m89557A(ki9Var.f122886d, new C1977ig(ki9Var, (ovy) objM71774l, bitmap2, compressFormat2, i2, (fbk) null), di9Var);
        return objM89557A == yukVar ? yukVar : objM89557A;
    }
}
