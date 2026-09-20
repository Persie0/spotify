package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class eyv implements fft0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64191a;

    /* JADX INFO: renamed from: b */
    public final twy f64192b;

    /* JADX INFO: renamed from: c */
    public final yho f64193c;

    /* JADX INFO: renamed from: d */
    public final zrr0 f64194d;

    /* JADX INFO: renamed from: e */
    public final Context f64195e;

    /* JADX INFO: renamed from: f */
    public final up60 f64196f;

    public eyv(twy twyVar, yho yhoVar, zrr0 zrr0Var, Context context) {
        this.f64191a = 1;
        this.f64192b = twyVar;
        this.f64193c = yhoVar;
        this.f64194d = zrr0Var;
        this.f64195e = context;
        this.f64196f = qpv0.f191387a.mo54112b(n2k0.class);
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: a */
    public final up60 mo36355a() {
        switch (this.f64191a) {
            case 0:
                break;
        }
        return this.f64196f;
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo36356b(erg1 erg1Var, l09 l09Var) {
        switch (this.f64191a) {
            case 0:
                return m40324c((k2k0) erg1Var, l09Var);
            default:
                return m40325d((n2k0) erg1Var, l09Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0100  */
    /* JADX WARN: Code duplicated, block: B:33:0x011a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0123  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0222  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0273 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0274 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public Object m40324c(k2k0 k2k0Var, ibk ibkVar) throws Throwable {
        cyv cyvVar;
        Object objM62226s;
        k2k0 k2k0Var2;
        gh00 gh00Var;
        String str;
        gh00 gh00Var2;
        gh00 gh00Var3;
        int i;
        sr4 sr4Var;
        zrr0 zrr0Var;
        sr4 sr4Var2;
        gh00 gh00Var4;
        gh00 gh00Var5;
        gh00 gh00Var6;
        k2k0 k2k0Var3;
        gh00 gh00Var7;
        gh00 gh00Var8;
        gh00 gh00Var9;
        Bitmap bitmap;
        int iM29100v;
        ShapeDrawable shapeDrawable;
        Drawable drawable;
        int i2;
        InsetDrawable insetDrawable;
        Bitmap bitmapCreateBitmap;
        k2k0 k2k0Var4;
        gh00 gh00Var10;
        Bitmap bitmap2;
        Bitmap bitmap3;
        gh00 gh00Var11;
        gh00 gh00Var12;
        String str2;
        String str3;
        k2k0 k2k0Var5;
        Drawable drawableMutate;
        sy61 ezd0Var;
        Object objM81781A;
        if (ibkVar instanceof cyv) {
            cyvVar = (cyv) ibkVar;
            int i3 = cyvVar.f43359Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cyvVar.f43359Y = i3 - Integer.MIN_VALUE;
            } else {
                cyvVar = new cyv(this, ibkVar);
            }
        } else {
            cyvVar = new cyv(this, ibkVar);
        }
        Object objM96770h = cyvVar.f43369t;
        int i4 = cyvVar.f43359Y;
        int i5 = 1;
        int i6 = 2;
        int i7 = 0;
        yuk yukVar = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(objM96770h);
                dyv dyvVar = new dyv(this, k2k0Var, i6);
                dyv dyvVar2 = new dyv(this, k2k0Var, i5);
                dyv dyvVar3 = new dyv(this, k2k0Var, i7);
                cyvVar.f43360a = k2k0Var;
                cyvVar.f43361b = dyvVar;
                cyvVar.f43362c = dyvVar2;
                cyvVar.f43363d = dyvVar3;
                cyvVar.f43364e = "image_load";
                cyvVar.f43368i = 0;
                cyvVar.f43359Y = 1;
                objM62226s = mlg1.m62226s(cyvVar);
                if (objM62226s != yukVar) {
                    k2k0Var2 = k2k0Var;
                    gh00Var = dyvVar3;
                    str = "image_load";
                    gh00Var2 = dyvVar2;
                    gh00Var3 = dyvVar;
                    i = 0;
                    sr4Var = (sr4) objM62226s;
                    zrr0Var = this.f64194d;
                    if (sr4Var == null) {
                        String str4 = k2k0Var2.f118658d;
                        cyvVar.f43360a = k2k0Var2;
                        cyvVar.f43361b = gh00Var3;
                        cyvVar.f43362c = gh00Var2;
                        cyvVar.f43363d = gh00Var;
                        cyvVar.f43364e = null;
                        cyvVar.f43365f = null;
                        cyvVar.f43368i = i;
                        cyvVar.f43359Y = 2;
                        objM96770h = zrr0Var.m96770h(str4, cyvVar);
                        if (objM96770h != yukVar) {
                            gh00Var5 = gh00Var3;
                            gh00Var6 = gh00Var2;
                            k2k0Var3 = k2k0Var2;
                            gh00 gh00Var13 = gh00Var5;
                            gh00Var7 = gh00Var;
                            gh00Var8 = gh00Var6;
                            gh00Var9 = gh00Var13;
                            k2k0Var2 = k2k0Var3;
                            bitmap = (Bitmap) objM96770h;
                            String str5 = k2k0Var2.f118659e;
                            String str6 = k2k0Var2.f118660f;
                            int color = Color.parseColor("#FFFFFF");
                            int color2 = Color.parseColor("#1ED760");
                            Context context = this.f64195e;
                            iM29100v = (int) bga.m29100v(context, 36);
                            int iM29100v2 = (int) bga.m29100v(context, 10);
                            g9k g9kVar = new g9k(context, R.style.Theme_Encore_Dark);
                            int iM86386m = vtg1.m86386m(g9kVar, R.attr.baseEssentialBase, color);
                            int iM86386m2 = vtg1.m86386m(g9kVar, R.attr.baseEssentialBrightAccent, color2);
                            shapeDrawable = new ShapeDrawable(new OvalShape());
                            shapeDrawable.setIntrinsicWidth(iM29100v);
                            shapeDrawable.setIntrinsicHeight(iM29100v);
                            shapeDrawable.getPaint().setColor(iM86386m2);
                            drawable = context.getDrawable(R.drawable.encore_icon_play_16);
                            if (drawable != null || (drawableMutate = drawable.mutate()) == null) {
                                i2 = 0;
                                insetDrawable = null;
                            } else {
                                drawableMutate.setTint(iM86386m);
                                i2 = 0;
                                drawableMutate.setBounds(0, 0, iM29100v, iM29100v);
                                insetDrawable = new InsetDrawable(drawableMutate, iM29100v2);
                            }
                            if (insetDrawable != null) {
                                Drawable[] drawableArr = new Drawable[2];
                                drawableArr[i2] = shapeDrawable;
                                drawableArr[1] = insetDrawable;
                                bitmapCreateBitmap = xtm0.m92067N(new LayerDrawable(drawableArr), i2, i2, 7);
                            } else {
                                bitmapCreateBitmap = Bitmap.createBitmap(iM29100v, iM29100v, Bitmap.Config.ARGB_8888);
                            }
                            if (bitmap != null || str5 == null || str6 == null) {
                                cyvVar.f43360a = k2k0Var2;
                                cyvVar.f43361b = gh00Var9;
                                cyvVar.f43362c = gh00Var8;
                                cyvVar.f43363d = null;
                                cyvVar.f43364e = null;
                                cyvVar.f43365f = null;
                                cyvVar.f43366g = null;
                                cyvVar.f43367h = null;
                                cyvVar.f43359Y = 5;
                                if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                    k2k0Var4 = k2k0Var2;
                                    ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                    sy61 sy61Var = ezd0Var;
                                    cyvVar.f43360a = null;
                                    cyvVar.f43361b = null;
                                    cyvVar.f43362c = null;
                                    cyvVar.f43363d = null;
                                    cyvVar.f43364e = null;
                                    cyvVar.f43365f = null;
                                    cyvVar.f43366g = null;
                                    cyvVar.f43367h = null;
                                    cyvVar.f43359Y = 6;
                                    objM81781A = this.f64192b.m81781A(sy61Var, cyvVar);
                                    if (objM81781A == yukVar) {
                                        return objM81781A;
                                    }
                                }
                            } else {
                                cyvVar.f43360a = k2k0Var2;
                                cyvVar.f43361b = gh00Var9;
                                cyvVar.f43362c = gh00Var8;
                                cyvVar.f43363d = gh00Var7;
                                cyvVar.f43364e = bitmap;
                                cyvVar.f43365f = str5;
                                cyvVar.f43366g = str6;
                                cyvVar.f43367h = bitmapCreateBitmap;
                                cyvVar.f43359Y = 4;
                                if (mlg1.m62222o("presenter_type", "media_with_action_button", cyvVar) != yukVar) {
                                    gh00Var10 = gh00Var8;
                                    bitmap2 = bitmapCreateBitmap;
                                    bitmap3 = bitmap;
                                    gh00Var11 = gh00Var9;
                                    gh00Var12 = gh00Var7;
                                    str2 = str5;
                                    str3 = str6;
                                    k2k0Var5 = k2k0Var2;
                                    ezd0Var = new ezd0(k2k0Var5.f118657c, bitmap3, str2, str3, bitmap2, gh00Var11, gh00Var10, gh00Var12, k2k0Var5.f118662h, k2k0Var5.f118661g);
                                    sy61 sy61Var2 = ezd0Var;
                                    cyvVar.f43360a = null;
                                    cyvVar.f43361b = null;
                                    cyvVar.f43362c = null;
                                    cyvVar.f43363d = null;
                                    cyvVar.f43364e = null;
                                    cyvVar.f43365f = null;
                                    cyvVar.f43366g = null;
                                    cyvVar.f43367h = null;
                                    cyvVar.f43359Y = 6;
                                    objM81781A = this.f64192b.m81781A(sy61Var2, cyvVar);
                                    if (objM81781A == yukVar) {
                                        return objM81781A;
                                    }
                                }
                            }
                        }
                    } else {
                        sr4Var.m79019k(str, null, (4 & 4) != 0);
                        try {
                            String str7 = k2k0Var2.f118658d;
                            cyvVar.f43360a = k2k0Var2;
                            cyvVar.f43361b = gh00Var3;
                            cyvVar.f43362c = gh00Var2;
                            cyvVar.f43363d = gh00Var;
                            cyvVar.f43364e = str;
                            cyvVar.f43365f = null;
                            cyvVar.f43366g = sr4Var;
                            cyvVar.f43368i = i;
                            cyvVar.f43359Y = 3;
                            objM96770h = zrr0Var.m96770h(str7, cyvVar);
                            if (objM96770h != yukVar) {
                                gh00Var4 = gh00Var3;
                                sr4Var2 = sr4Var;
                                sr4Var2.m79016f(str);
                                gh00Var7 = gh00Var;
                                gh00Var8 = gh00Var2;
                                gh00Var9 = gh00Var4;
                                bitmap = (Bitmap) objM96770h;
                                String str8 = k2k0Var2.f118659e;
                                String str9 = k2k0Var2.f118660f;
                                int color3 = Color.parseColor("#FFFFFF");
                                int color4 = Color.parseColor("#1ED760");
                                Context context2 = this.f64195e;
                                iM29100v = (int) bga.m29100v(context2, 36);
                                int iM29100v3 = (int) bga.m29100v(context2, 10);
                                g9k g9kVar2 = new g9k(context2, R.style.Theme_Encore_Dark);
                                int iM86386m3 = vtg1.m86386m(g9kVar2, R.attr.baseEssentialBase, color3);
                                int iM86386m4 = vtg1.m86386m(g9kVar2, R.attr.baseEssentialBrightAccent, color4);
                                shapeDrawable = new ShapeDrawable(new OvalShape());
                                shapeDrawable.setIntrinsicWidth(iM29100v);
                                shapeDrawable.setIntrinsicHeight(iM29100v);
                                shapeDrawable.getPaint().setColor(iM86386m4);
                                drawable = context2.getDrawable(R.drawable.encore_icon_play_16);
                                if (drawable != null) {
                                    i2 = 0;
                                    insetDrawable = null;
                                } else {
                                    i2 = 0;
                                    insetDrawable = null;
                                }
                                if (insetDrawable != null) {
                                    Drawable[] drawableArr2 = new Drawable[2];
                                    drawableArr2[i2] = shapeDrawable;
                                    drawableArr2[1] = insetDrawable;
                                    bitmapCreateBitmap = xtm0.m92067N(new LayerDrawable(drawableArr2), i2, i2, 7);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iM29100v, iM29100v, Bitmap.Config.ARGB_8888);
                                }
                                if (bitmap != null) {
                                    cyvVar.f43360a = k2k0Var2;
                                    cyvVar.f43361b = gh00Var9;
                                    cyvVar.f43362c = gh00Var8;
                                    cyvVar.f43363d = null;
                                    cyvVar.f43364e = null;
                                    cyvVar.f43365f = null;
                                    cyvVar.f43366g = null;
                                    cyvVar.f43367h = null;
                                    cyvVar.f43359Y = 5;
                                    if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                        k2k0Var4 = k2k0Var2;
                                        ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                        sy61 sy61Var3 = ezd0Var;
                                        cyvVar.f43360a = null;
                                        cyvVar.f43361b = null;
                                        cyvVar.f43362c = null;
                                        cyvVar.f43363d = null;
                                        cyvVar.f43364e = null;
                                        cyvVar.f43365f = null;
                                        cyvVar.f43366g = null;
                                        cyvVar.f43367h = null;
                                        cyvVar.f43359Y = 6;
                                        objM81781A = this.f64192b.m81781A(sy61Var3, cyvVar);
                                        if (objM81781A == yukVar) {
                                            return objM81781A;
                                        }
                                    }
                                } else {
                                    cyvVar.f43360a = k2k0Var2;
                                    cyvVar.f43361b = gh00Var9;
                                    cyvVar.f43362c = gh00Var8;
                                    cyvVar.f43363d = null;
                                    cyvVar.f43364e = null;
                                    cyvVar.f43365f = null;
                                    cyvVar.f43366g = null;
                                    cyvVar.f43367h = null;
                                    cyvVar.f43359Y = 5;
                                    if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                        k2k0Var4 = k2k0Var2;
                                        ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                        sy61 sy61Var4 = ezd0Var;
                                        cyvVar.f43360a = null;
                                        cyvVar.f43361b = null;
                                        cyvVar.f43362c = null;
                                        cyvVar.f43363d = null;
                                        cyvVar.f43364e = null;
                                        cyvVar.f43365f = null;
                                        cyvVar.f43366g = null;
                                        cyvVar.f43367h = null;
                                        cyvVar.f43359Y = 6;
                                        objM81781A = this.f64192b.m81781A(sy61Var4, cyvVar);
                                        if (objM81781A == yukVar) {
                                            return objM81781A;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            sr4Var2 = sr4Var;
                            sr4Var2.m79016f(str);
                            throw th;
                        }
                    }
                }
                return yukVar;
            case 1:
                int i8 = cyvVar.f43368i;
                String str10 = (String) cyvVar.f43364e;
                gh00 gh00Var14 = cyvVar.f43363d;
                gh00Var2 = cyvVar.f43362c;
                gh00 gh00Var15 = cyvVar.f43361b;
                k2k0Var2 = cyvVar.f43360a;
                bga.m29073P(objM96770h);
                i = i8;
                gh00Var = gh00Var14;
                str = str10;
                gh00Var3 = gh00Var15;
                objM62226s = objM96770h;
                sr4Var = (sr4) objM62226s;
                zrr0Var = this.f64194d;
                if (sr4Var == null) {
                    String str11 = k2k0Var2.f118658d;
                    cyvVar.f43360a = k2k0Var2;
                    cyvVar.f43361b = gh00Var3;
                    cyvVar.f43362c = gh00Var2;
                    cyvVar.f43363d = gh00Var;
                    cyvVar.f43364e = null;
                    cyvVar.f43365f = null;
                    cyvVar.f43368i = i;
                    cyvVar.f43359Y = 2;
                    objM96770h = zrr0Var.m96770h(str11, cyvVar);
                    if (objM96770h != yukVar) {
                        gh00Var5 = gh00Var3;
                        gh00Var6 = gh00Var2;
                        k2k0Var3 = k2k0Var2;
                        gh00 gh00Var16 = gh00Var5;
                        gh00Var7 = gh00Var;
                        gh00Var8 = gh00Var6;
                        gh00Var9 = gh00Var16;
                        k2k0Var2 = k2k0Var3;
                        bitmap = (Bitmap) objM96770h;
                        String str12 = k2k0Var2.f118659e;
                        String str13 = k2k0Var2.f118660f;
                        int color5 = Color.parseColor("#FFFFFF");
                        int color6 = Color.parseColor("#1ED760");
                        Context context3 = this.f64195e;
                        iM29100v = (int) bga.m29100v(context3, 36);
                        int iM29100v4 = (int) bga.m29100v(context3, 10);
                        g9k g9kVar3 = new g9k(context3, R.style.Theme_Encore_Dark);
                        int iM86386m5 = vtg1.m86386m(g9kVar3, R.attr.baseEssentialBase, color5);
                        int iM86386m6 = vtg1.m86386m(g9kVar3, R.attr.baseEssentialBrightAccent, color6);
                        shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.setIntrinsicWidth(iM29100v);
                        shapeDrawable.setIntrinsicHeight(iM29100v);
                        shapeDrawable.getPaint().setColor(iM86386m6);
                        drawable = context3.getDrawable(R.drawable.encore_icon_play_16);
                        if (drawable != null) {
                            i2 = 0;
                            insetDrawable = null;
                        } else {
                            i2 = 0;
                            insetDrawable = null;
                        }
                        if (insetDrawable != null) {
                            Drawable[] drawableArr3 = new Drawable[2];
                            drawableArr3[i2] = shapeDrawable;
                            drawableArr3[1] = insetDrawable;
                            bitmapCreateBitmap = xtm0.m92067N(new LayerDrawable(drawableArr3), i2, i2, 7);
                        } else {
                            bitmapCreateBitmap = Bitmap.createBitmap(iM29100v, iM29100v, Bitmap.Config.ARGB_8888);
                        }
                        if (bitmap != null) {
                            cyvVar.f43360a = k2k0Var2;
                            cyvVar.f43361b = gh00Var9;
                            cyvVar.f43362c = gh00Var8;
                            cyvVar.f43363d = null;
                            cyvVar.f43364e = null;
                            cyvVar.f43365f = null;
                            cyvVar.f43366g = null;
                            cyvVar.f43367h = null;
                            cyvVar.f43359Y = 5;
                            if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                k2k0Var4 = k2k0Var2;
                                ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                sy61 sy61Var5 = ezd0Var;
                                cyvVar.f43360a = null;
                                cyvVar.f43361b = null;
                                cyvVar.f43362c = null;
                                cyvVar.f43363d = null;
                                cyvVar.f43364e = null;
                                cyvVar.f43365f = null;
                                cyvVar.f43366g = null;
                                cyvVar.f43367h = null;
                                cyvVar.f43359Y = 6;
                                objM81781A = this.f64192b.m81781A(sy61Var5, cyvVar);
                                if (objM81781A == yukVar) {
                                    return objM81781A;
                                }
                            }
                        } else {
                            cyvVar.f43360a = k2k0Var2;
                            cyvVar.f43361b = gh00Var9;
                            cyvVar.f43362c = gh00Var8;
                            cyvVar.f43363d = null;
                            cyvVar.f43364e = null;
                            cyvVar.f43365f = null;
                            cyvVar.f43366g = null;
                            cyvVar.f43367h = null;
                            cyvVar.f43359Y = 5;
                            if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                k2k0Var4 = k2k0Var2;
                                ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                sy61 sy61Var6 = ezd0Var;
                                cyvVar.f43360a = null;
                                cyvVar.f43361b = null;
                                cyvVar.f43362c = null;
                                cyvVar.f43363d = null;
                                cyvVar.f43364e = null;
                                cyvVar.f43365f = null;
                                cyvVar.f43366g = null;
                                cyvVar.f43367h = null;
                                cyvVar.f43359Y = 6;
                                objM81781A = this.f64192b.m81781A(sy61Var6, cyvVar);
                                if (objM81781A == yukVar) {
                                    return objM81781A;
                                }
                            }
                        }
                    }
                } else {
                    sr4Var.m79019k(str, null, (4 & 4) != 0);
                    String str14 = k2k0Var2.f118658d;
                    cyvVar.f43360a = k2k0Var2;
                    cyvVar.f43361b = gh00Var3;
                    cyvVar.f43362c = gh00Var2;
                    cyvVar.f43363d = gh00Var;
                    cyvVar.f43364e = str;
                    cyvVar.f43365f = null;
                    cyvVar.f43366g = sr4Var;
                    cyvVar.f43368i = i;
                    cyvVar.f43359Y = 3;
                    objM96770h = zrr0Var.m96770h(str14, cyvVar);
                    if (objM96770h != yukVar) {
                        gh00Var4 = gh00Var3;
                        sr4Var2 = sr4Var;
                        sr4Var2.m79016f(str);
                        gh00Var7 = gh00Var;
                        gh00Var8 = gh00Var2;
                        gh00Var9 = gh00Var4;
                        bitmap = (Bitmap) objM96770h;
                        String str15 = k2k0Var2.f118659e;
                        String str16 = k2k0Var2.f118660f;
                        int color7 = Color.parseColor("#FFFFFF");
                        int color8 = Color.parseColor("#1ED760");
                        Context context4 = this.f64195e;
                        iM29100v = (int) bga.m29100v(context4, 36);
                        int iM29100v5 = (int) bga.m29100v(context4, 10);
                        g9k g9kVar4 = new g9k(context4, R.style.Theme_Encore_Dark);
                        int iM86386m7 = vtg1.m86386m(g9kVar4, R.attr.baseEssentialBase, color7);
                        int iM86386m8 = vtg1.m86386m(g9kVar4, R.attr.baseEssentialBrightAccent, color8);
                        shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.setIntrinsicWidth(iM29100v);
                        shapeDrawable.setIntrinsicHeight(iM29100v);
                        shapeDrawable.getPaint().setColor(iM86386m8);
                        drawable = context4.getDrawable(R.drawable.encore_icon_play_16);
                        if (drawable != null) {
                            i2 = 0;
                            insetDrawable = null;
                        } else {
                            i2 = 0;
                            insetDrawable = null;
                        }
                        if (insetDrawable != null) {
                            Drawable[] drawableArr4 = new Drawable[2];
                            drawableArr4[i2] = shapeDrawable;
                            drawableArr4[1] = insetDrawable;
                            bitmapCreateBitmap = xtm0.m92067N(new LayerDrawable(drawableArr4), i2, i2, 7);
                        } else {
                            bitmapCreateBitmap = Bitmap.createBitmap(iM29100v, iM29100v, Bitmap.Config.ARGB_8888);
                        }
                        if (bitmap != null) {
                            cyvVar.f43360a = k2k0Var2;
                            cyvVar.f43361b = gh00Var9;
                            cyvVar.f43362c = gh00Var8;
                            cyvVar.f43363d = null;
                            cyvVar.f43364e = null;
                            cyvVar.f43365f = null;
                            cyvVar.f43366g = null;
                            cyvVar.f43367h = null;
                            cyvVar.f43359Y = 5;
                            if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                k2k0Var4 = k2k0Var2;
                                ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                sy61 sy61Var7 = ezd0Var;
                                cyvVar.f43360a = null;
                                cyvVar.f43361b = null;
                                cyvVar.f43362c = null;
                                cyvVar.f43363d = null;
                                cyvVar.f43364e = null;
                                cyvVar.f43365f = null;
                                cyvVar.f43366g = null;
                                cyvVar.f43367h = null;
                                cyvVar.f43359Y = 6;
                                objM81781A = this.f64192b.m81781A(sy61Var7, cyvVar);
                                if (objM81781A == yukVar) {
                                    return objM81781A;
                                }
                            }
                        } else {
                            cyvVar.f43360a = k2k0Var2;
                            cyvVar.f43361b = gh00Var9;
                            cyvVar.f43362c = gh00Var8;
                            cyvVar.f43363d = null;
                            cyvVar.f43364e = null;
                            cyvVar.f43365f = null;
                            cyvVar.f43366g = null;
                            cyvVar.f43367h = null;
                            cyvVar.f43359Y = 5;
                            if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                                k2k0Var4 = k2k0Var2;
                                ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                                sy61 sy61Var8 = ezd0Var;
                                cyvVar.f43360a = null;
                                cyvVar.f43361b = null;
                                cyvVar.f43362c = null;
                                cyvVar.f43363d = null;
                                cyvVar.f43364e = null;
                                cyvVar.f43365f = null;
                                cyvVar.f43366g = null;
                                cyvVar.f43367h = null;
                                cyvVar.f43359Y = 6;
                                objM81781A = this.f64192b.m81781A(sy61Var8, cyvVar);
                                if (objM81781A == yukVar) {
                                    return objM81781A;
                                }
                            }
                        }
                    }
                }
                return yukVar;
            case 2:
                gh00Var = cyvVar.f43363d;
                gh00Var6 = cyvVar.f43362c;
                gh00Var5 = cyvVar.f43361b;
                k2k0Var3 = cyvVar.f43360a;
                bga.m29073P(objM96770h);
                gh00 gh00Var17 = gh00Var5;
                gh00Var7 = gh00Var;
                gh00Var8 = gh00Var6;
                gh00Var9 = gh00Var17;
                k2k0Var2 = k2k0Var3;
                bitmap = (Bitmap) objM96770h;
                String str17 = k2k0Var2.f118659e;
                String str18 = k2k0Var2.f118660f;
                int color9 = Color.parseColor("#FFFFFF");
                int color10 = Color.parseColor("#1ED760");
                Context context5 = this.f64195e;
                iM29100v = (int) bga.m29100v(context5, 36);
                int iM29100v6 = (int) bga.m29100v(context5, 10);
                g9k g9kVar5 = new g9k(context5, R.style.Theme_Encore_Dark);
                int iM86386m9 = vtg1.m86386m(g9kVar5, R.attr.baseEssentialBase, color9);
                int iM86386m10 = vtg1.m86386m(g9kVar5, R.attr.baseEssentialBrightAccent, color10);
                shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.setIntrinsicWidth(iM29100v);
                shapeDrawable.setIntrinsicHeight(iM29100v);
                shapeDrawable.getPaint().setColor(iM86386m10);
                drawable = context5.getDrawable(R.drawable.encore_icon_play_16);
                if (drawable != null) {
                    i2 = 0;
                    insetDrawable = null;
                } else {
                    i2 = 0;
                    insetDrawable = null;
                }
                if (insetDrawable != null) {
                    Drawable[] drawableArr5 = new Drawable[2];
                    drawableArr5[i2] = shapeDrawable;
                    drawableArr5[1] = insetDrawable;
                    bitmapCreateBitmap = xtm0.m92067N(new LayerDrawable(drawableArr5), i2, i2, 7);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(iM29100v, iM29100v, Bitmap.Config.ARGB_8888);
                }
                if (bitmap != null) {
                    cyvVar.f43360a = k2k0Var2;
                    cyvVar.f43361b = gh00Var9;
                    cyvVar.f43362c = gh00Var8;
                    cyvVar.f43363d = null;
                    cyvVar.f43364e = null;
                    cyvVar.f43365f = null;
                    cyvVar.f43366g = null;
                    cyvVar.f43367h = null;
                    cyvVar.f43359Y = 5;
                    if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                        k2k0Var4 = k2k0Var2;
                        ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                        sy61 sy61Var9 = ezd0Var;
                        cyvVar.f43360a = null;
                        cyvVar.f43361b = null;
                        cyvVar.f43362c = null;
                        cyvVar.f43363d = null;
                        cyvVar.f43364e = null;
                        cyvVar.f43365f = null;
                        cyvVar.f43366g = null;
                        cyvVar.f43367h = null;
                        cyvVar.f43359Y = 6;
                        objM81781A = this.f64192b.m81781A(sy61Var9, cyvVar);
                        if (objM81781A == yukVar) {
                            return objM81781A;
                        }
                    }
                    return yukVar;
                }
                cyvVar.f43360a = k2k0Var2;
                cyvVar.f43361b = gh00Var9;
                cyvVar.f43362c = gh00Var8;
                cyvVar.f43363d = null;
                cyvVar.f43364e = null;
                cyvVar.f43365f = null;
                cyvVar.f43366g = null;
                cyvVar.f43367h = null;
                cyvVar.f43359Y = 5;
                if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                    k2k0Var4 = k2k0Var2;
                    ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                    sy61 sy61Var10 = ezd0Var;
                    cyvVar.f43360a = null;
                    cyvVar.f43361b = null;
                    cyvVar.f43362c = null;
                    cyvVar.f43363d = null;
                    cyvVar.f43364e = null;
                    cyvVar.f43365f = null;
                    cyvVar.f43366g = null;
                    cyvVar.f43367h = null;
                    cyvVar.f43359Y = 6;
                    objM81781A = this.f64192b.m81781A(sy61Var10, cyvVar);
                    if (objM81781A == yukVar) {
                        return objM81781A;
                    }
                }
                return yukVar;
                return yukVar;
            case 3:
                sr4Var2 = (sr4) cyvVar.f43366g;
                str = (String) cyvVar.f43364e;
                gh00Var = cyvVar.f43363d;
                gh00Var2 = cyvVar.f43362c;
                gh00Var4 = cyvVar.f43361b;
                k2k0Var2 = cyvVar.f43360a;
                try {
                    bga.m29073P(objM96770h);
                    sr4Var2.m79016f(str);
                    gh00Var7 = gh00Var;
                    gh00Var8 = gh00Var2;
                    gh00Var9 = gh00Var4;
                    bitmap = (Bitmap) objM96770h;
                    String str19 = k2k0Var2.f118659e;
                    String str110 = k2k0Var2.f118660f;
                    int color11 = Color.parseColor("#FFFFFF");
                    int color12 = Color.parseColor("#1ED760");
                    Context context6 = this.f64195e;
                    iM29100v = (int) bga.m29100v(context6, 36);
                    int iM29100v7 = (int) bga.m29100v(context6, 10);
                    g9k g9kVar6 = new g9k(context6, R.style.Theme_Encore_Dark);
                    int iM86386m11 = vtg1.m86386m(g9kVar6, R.attr.baseEssentialBase, color11);
                    int iM86386m12 = vtg1.m86386m(g9kVar6, R.attr.baseEssentialBrightAccent, color12);
                    shapeDrawable = new ShapeDrawable(new OvalShape());
                    shapeDrawable.setIntrinsicWidth(iM29100v);
                    shapeDrawable.setIntrinsicHeight(iM29100v);
                    shapeDrawable.getPaint().setColor(iM86386m12);
                    drawable = context6.getDrawable(R.drawable.encore_icon_play_16);
                    if (drawable != null) {
                        i2 = 0;
                        insetDrawable = null;
                    } else {
                        i2 = 0;
                        insetDrawable = null;
                    }
                    if (insetDrawable != null) {
                        Drawable[] drawableArr6 = new Drawable[2];
                        drawableArr6[i2] = shapeDrawable;
                        drawableArr6[1] = insetDrawable;
                        bitmapCreateBitmap = xtm0.m92067N(new LayerDrawable(drawableArr6), i2, i2, 7);
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(iM29100v, iM29100v, Bitmap.Config.ARGB_8888);
                    }
                    if (bitmap != null) {
                        cyvVar.f43360a = k2k0Var2;
                        cyvVar.f43361b = gh00Var9;
                        cyvVar.f43362c = gh00Var8;
                        cyvVar.f43363d = null;
                        cyvVar.f43364e = null;
                        cyvVar.f43365f = null;
                        cyvVar.f43366g = null;
                        cyvVar.f43367h = null;
                        cyvVar.f43359Y = 5;
                        if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                            k2k0Var4 = k2k0Var2;
                            ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                            sy61 sy61Var11 = ezd0Var;
                            cyvVar.f43360a = null;
                            cyvVar.f43361b = null;
                            cyvVar.f43362c = null;
                            cyvVar.f43363d = null;
                            cyvVar.f43364e = null;
                            cyvVar.f43365f = null;
                            cyvVar.f43366g = null;
                            cyvVar.f43367h = null;
                            cyvVar.f43359Y = 6;
                            objM81781A = this.f64192b.m81781A(sy61Var11, cyvVar);
                            if (objM81781A == yukVar) {
                                return objM81781A;
                            }
                        }
                        return yukVar;
                    }
                    cyvVar.f43360a = k2k0Var2;
                    cyvVar.f43361b = gh00Var9;
                    cyvVar.f43362c = gh00Var8;
                    cyvVar.f43363d = null;
                    cyvVar.f43364e = null;
                    cyvVar.f43365f = null;
                    cyvVar.f43366g = null;
                    cyvVar.f43367h = null;
                    cyvVar.f43359Y = 5;
                    if (mlg1.m62222o("presenter_type", "simple", cyvVar) != yukVar) {
                        k2k0Var4 = k2k0Var2;
                        ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                        sy61 sy61Var12 = ezd0Var;
                        cyvVar.f43360a = null;
                        cyvVar.f43361b = null;
                        cyvVar.f43362c = null;
                        cyvVar.f43363d = null;
                        cyvVar.f43364e = null;
                        cyvVar.f43365f = null;
                        cyvVar.f43366g = null;
                        cyvVar.f43367h = null;
                        cyvVar.f43359Y = 6;
                        objM81781A = this.f64192b.m81781A(sy61Var12, cyvVar);
                        if (objM81781A == yukVar) {
                            return objM81781A;
                        }
                    }
                    return yukVar;
                    return yukVar;
                } catch (Throwable th2) {
                    th = th2;
                    sr4Var2.m79016f(str);
                    throw th;
                }
            case 4:
                Bitmap bitmap4 = cyvVar.f43367h;
                String str20 = (String) cyvVar.f43366g;
                String str21 = cyvVar.f43365f;
                Bitmap bitmap5 = (Bitmap) cyvVar.f43364e;
                gh00 gh00Var18 = cyvVar.f43363d;
                gh00 gh00Var19 = cyvVar.f43362c;
                gh00 gh00Var20 = cyvVar.f43361b;
                k2k0Var5 = cyvVar.f43360a;
                bga.m29073P(objM96770h);
                bitmap2 = bitmap4;
                str3 = str20;
                str2 = str21;
                bitmap3 = bitmap5;
                gh00Var12 = gh00Var18;
                gh00Var10 = gh00Var19;
                gh00Var11 = gh00Var20;
                ezd0Var = new ezd0(k2k0Var5.f118657c, bitmap3, str2, str3, bitmap2, gh00Var11, gh00Var10, gh00Var12, k2k0Var5.f118662h, k2k0Var5.f118661g);
                sy61 sy61Var13 = ezd0Var;
                cyvVar.f43360a = null;
                cyvVar.f43361b = null;
                cyvVar.f43362c = null;
                cyvVar.f43363d = null;
                cyvVar.f43364e = null;
                cyvVar.f43365f = null;
                cyvVar.f43366g = null;
                cyvVar.f43367h = null;
                cyvVar.f43359Y = 6;
                objM81781A = this.f64192b.m81781A(sy61Var13, cyvVar);
                if (objM81781A == yukVar) {
                    return yukVar;
                }
                return objM81781A;
            case 5:
                gh00Var8 = cyvVar.f43362c;
                gh00Var9 = cyvVar.f43361b;
                k2k0Var4 = cyvVar.f43360a;
                bga.m29073P(objM96770h);
                ezd0Var = new cd21(k2k0Var4.f118657c, gh00Var9, gh00Var8, k2k0Var4.f118662h, k2k0Var4.f118661g, 32);
                sy61 sy61Var14 = ezd0Var;
                cyvVar.f43360a = null;
                cyvVar.f43361b = null;
                cyvVar.f43362c = null;
                cyvVar.f43363d = null;
                cyvVar.f43364e = null;
                cyvVar.f43365f = null;
                cyvVar.f43366g = null;
                cyvVar.f43367h = null;
                cyvVar.f43359Y = 6;
                objM81781A = this.f64192b.m81781A(sy61Var14, cyvVar);
                if (objM81781A == yukVar) {
                    return yukVar;
                }
                return objM81781A;
            case 6:
                bga.m29073P(objM96770h);
                return objM96770h;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    /* JADX WARN: Code duplicated, block: B:39:0x0134  */
    /* JADX WARN: Code duplicated, block: B:43:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x021e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public Object m40325d(n2k0 n2k0Var, ibk ibkVar) throws Throwable {
        ysi0 ysi0Var;
        gh00 zsi0Var;
        String str;
        int i;
        gh00 gh00Var;
        sr4 sr4Var;
        zrr0 zrr0Var;
        sr4 sr4Var2;
        Object objM96770h;
        n2k0 n2k0Var2;
        gh00 gh00Var2;
        gh00 gh00Var3;
        n2k0 n2k0Var3;
        gh00 gh00Var4;
        Bitmap bitmap;
        String str2;
        yuk yukVar;
        String string;
        gh00 gh00Var5;
        String str3;
        gh00 gh00Var6;
        String str4;
        n2k0 n2k0Var4;
        String str5;
        sy61 d440Var;
        Object objM81781A;
        n2k0 n2k0Var5 = n2k0Var;
        if (ibkVar instanceof ysi0) {
            ysi0Var = (ysi0) ibkVar;
            int i2 = ysi0Var.f275792Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ysi0Var.f275792Y = i2 - Integer.MIN_VALUE;
            } else {
                ysi0Var = new ysi0(this, ibkVar);
            }
        } else {
            ysi0Var = new ysi0(this, ibkVar);
        }
        Object objM96770h2 = ysi0Var.f275802t;
        int i3 = ysi0Var.f275792Y;
        yuk yukVar2 = yuk.f276404a;
        switch (i3) {
            case 0:
                bga.m29073P(objM96770h2);
                zsi0 zsi0Var2 = new zsi0(this, n2k0Var5, 1);
                zsi0Var = new zsi0(this, n2k0Var5, 0);
                ysi0Var.f275793a = n2k0Var5;
                ysi0Var.f275794b = zsi0Var2;
                ysi0Var.f275795c = zsi0Var;
                str = "image_load";
                ysi0Var.f275796d = "image_load";
                i = 0;
                ysi0Var.f275801i = 0;
                ysi0Var.f275792Y = 1;
                sr4 sr4VarM62226s = mlg1.m62226s(ysi0Var);
                if (sr4VarM62226s != yukVar2) {
                    gh00Var = zsi0Var2;
                    objM96770h2 = sr4VarM62226s;
                    sr4Var = (sr4) objM96770h2;
                    zrr0Var = this.f64194d;
                    if (sr4Var == null) {
                        String str6 = n2k0Var5.f149777d;
                        ysi0Var.f275793a = n2k0Var5;
                        ysi0Var.f275794b = gh00Var;
                        ysi0Var.f275795c = zsi0Var;
                        ysi0Var.f275796d = null;
                        ysi0Var.f275797e = null;
                        ysi0Var.f275801i = i;
                        ysi0Var.f275792Y = 2;
                        objM96770h2 = zrr0Var.m96770h(str6, ysi0Var);
                        if (objM96770h2 != yukVar2) {
                            n2k0Var3 = n2k0Var5;
                            gh00Var2 = zsi0Var;
                            gh00Var4 = gh00Var;
                            bitmap = (Bitmap) objM96770h2;
                            str2 = n2k0Var3.f149778e;
                            String str7 = n2k0Var3.f149779f;
                            String str8 = n2k0Var3.f149780g;
                            String str9 = n2k0Var3.f149781h;
                            if (bitmap != null || str2 == null || str7 == null || str8 == null || str9 == null) {
                                yukVar = yukVar2;
                                ysi0Var.f275793a = n2k0Var3;
                                ysi0Var.f275794b = gh00Var4;
                                ysi0Var.f275795c = gh00Var2;
                                ysi0Var.f275796d = null;
                                ysi0Var.f275797e = null;
                                ysi0Var.f275798f = null;
                                ysi0Var.f275799g = null;
                                ysi0Var.f275792Y = 5;
                                if (mlg1.m62222o("presenter_type", "simple", ysi0Var) == yukVar) {
                                    return yukVar;
                                }
                                d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                                ysi0Var.f275793a = null;
                                ysi0Var.f275794b = null;
                                ysi0Var.f275795c = null;
                                ysi0Var.f275796d = null;
                                ysi0Var.f275797e = null;
                                ysi0Var.f275798f = null;
                                ysi0Var.f275799g = null;
                                ysi0Var.f275800h = null;
                                ysi0Var.f275792Y = 6;
                                objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                                if (objM81781A == yukVar) {
                                    return yukVar;
                                }
                                return objM81781A;
                            }
                            yukVar = yukVar2;
                            long j = Long.parseLong(str9) / ((long) 60000);
                            long j2 = 60;
                            long j3 = j / j2;
                            long j4 = j % j2;
                            Context context = this.f64195e;
                            if (j3 > 0) {
                                string = context.getString(R.string.image_info_duration_hours_minutes_format, Long.valueOf(j3), Long.valueOf(j4));
                                wj50.m88279p(string);
                            } else {
                                string = context.getString(R.string.image_info_duration_minutes_format, Long.valueOf(j4));
                                wj50.m88279p(string);
                            }
                            ysi0Var.f275793a = n2k0Var3;
                            ysi0Var.f275794b = gh00Var4;
                            ysi0Var.f275795c = gh00Var2;
                            ysi0Var.f275796d = bitmap;
                            ysi0Var.f275797e = str2;
                            ysi0Var.f275798f = str7;
                            ysi0Var.f275799g = str8;
                            ysi0Var.f275800h = string;
                            ysi0Var.f275792Y = 4;
                            if (mlg1.m62222o("presenter_type", "image_and_info", ysi0Var) == yukVar) {
                                return yukVar;
                            }
                            gh00Var5 = gh00Var2;
                            str3 = str7;
                            gh00Var6 = gh00Var4;
                            str4 = string;
                            n2k0Var4 = n2k0Var3;
                            str5 = str8;
                            d440Var = new d440(n2k0Var4.f149776c, bitmap, str2, str3, str5, str4, gh00Var6, gh00Var5, n2k0Var4.f149783j, n2k0Var4.f149782i);
                            ysi0Var.f275793a = null;
                            ysi0Var.f275794b = null;
                            ysi0Var.f275795c = null;
                            ysi0Var.f275796d = null;
                            ysi0Var.f275797e = null;
                            ysi0Var.f275798f = null;
                            ysi0Var.f275799g = null;
                            ysi0Var.f275800h = null;
                            ysi0Var.f275792Y = 6;
                            objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                            if (objM81781A == yukVar) {
                                return yukVar;
                            }
                            return objM81781A;
                        }
                    } else {
                        sr4Var.m79019k(str, null, (4 & 4) != 0);
                        try {
                            String str10 = n2k0Var5.f149777d;
                            ysi0Var.f275793a = n2k0Var5;
                            ysi0Var.f275794b = gh00Var;
                            ysi0Var.f275795c = zsi0Var;
                            ysi0Var.f275796d = str;
                            ysi0Var.f275797e = null;
                            ysi0Var.f275798f = sr4Var;
                            ysi0Var.f275801i = i;
                            ysi0Var.f275792Y = 3;
                            objM96770h = zrr0Var.m96770h(str10, ysi0Var);
                            if (objM96770h != yukVar2) {
                                gh00 gh00Var7 = gh00Var;
                                n2k0Var2 = n2k0Var5;
                                gh00Var2 = zsi0Var;
                                sr4Var2 = sr4Var;
                                objM96770h2 = objM96770h;
                                gh00Var3 = gh00Var7;
                                sr4Var2.m79016f(str);
                                gh00Var4 = gh00Var3;
                                n2k0Var3 = n2k0Var2;
                                bitmap = (Bitmap) objM96770h2;
                                str2 = n2k0Var3.f149778e;
                                String str11 = n2k0Var3.f149779f;
                                String str12 = n2k0Var3.f149780g;
                                String str13 = n2k0Var3.f149781h;
                                if (bitmap != null) {
                                }
                                yukVar = yukVar2;
                                ysi0Var.f275793a = n2k0Var3;
                                ysi0Var.f275794b = gh00Var4;
                                ysi0Var.f275795c = gh00Var2;
                                ysi0Var.f275796d = null;
                                ysi0Var.f275797e = null;
                                ysi0Var.f275798f = null;
                                ysi0Var.f275799g = null;
                                ysi0Var.f275792Y = 5;
                                if (mlg1.m62222o("presenter_type", "simple", ysi0Var) == yukVar) {
                                    return yukVar;
                                }
                                d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                                ysi0Var.f275793a = null;
                                ysi0Var.f275794b = null;
                                ysi0Var.f275795c = null;
                                ysi0Var.f275796d = null;
                                ysi0Var.f275797e = null;
                                ysi0Var.f275798f = null;
                                ysi0Var.f275799g = null;
                                ysi0Var.f275800h = null;
                                ysi0Var.f275792Y = 6;
                                objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                                if (objM81781A == yukVar) {
                                    return yukVar;
                                }
                                return objM81781A;
                            }
                        } catch (Throwable th) {
                            th = th;
                            sr4Var2 = sr4Var;
                            sr4Var2.m79016f(str);
                            throw th;
                        }
                    }
                }
                return yukVar2;
            case 1:
                int i4 = ysi0Var.f275801i;
                String str14 = (String) ysi0Var.f275796d;
                gh00 gh00Var8 = ysi0Var.f275795c;
                gh00 gh00Var9 = ysi0Var.f275794b;
                n2k0 n2k0Var6 = ysi0Var.f275793a;
                bga.m29073P(objM96770h2);
                i = i4;
                n2k0Var5 = n2k0Var6;
                gh00Var = gh00Var9;
                str = str14;
                zsi0Var = gh00Var8;
                sr4Var = (sr4) objM96770h2;
                zrr0Var = this.f64194d;
                if (sr4Var == null) {
                    String str15 = n2k0Var5.f149777d;
                    ysi0Var.f275793a = n2k0Var5;
                    ysi0Var.f275794b = gh00Var;
                    ysi0Var.f275795c = zsi0Var;
                    ysi0Var.f275796d = null;
                    ysi0Var.f275797e = null;
                    ysi0Var.f275801i = i;
                    ysi0Var.f275792Y = 2;
                    objM96770h2 = zrr0Var.m96770h(str15, ysi0Var);
                    if (objM96770h2 != yukVar2) {
                        n2k0Var3 = n2k0Var5;
                        gh00Var2 = zsi0Var;
                        gh00Var4 = gh00Var;
                        bitmap = (Bitmap) objM96770h2;
                        str2 = n2k0Var3.f149778e;
                        String str16 = n2k0Var3.f149779f;
                        String str17 = n2k0Var3.f149780g;
                        String str18 = n2k0Var3.f149781h;
                        if (bitmap != null) {
                        }
                        yukVar = yukVar2;
                        ysi0Var.f275793a = n2k0Var3;
                        ysi0Var.f275794b = gh00Var4;
                        ysi0Var.f275795c = gh00Var2;
                        ysi0Var.f275796d = null;
                        ysi0Var.f275797e = null;
                        ysi0Var.f275798f = null;
                        ysi0Var.f275799g = null;
                        ysi0Var.f275792Y = 5;
                        if (mlg1.m62222o("presenter_type", "simple", ysi0Var) == yukVar) {
                            return yukVar;
                        }
                        d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                        ysi0Var.f275793a = null;
                        ysi0Var.f275794b = null;
                        ysi0Var.f275795c = null;
                        ysi0Var.f275796d = null;
                        ysi0Var.f275797e = null;
                        ysi0Var.f275798f = null;
                        ysi0Var.f275799g = null;
                        ysi0Var.f275800h = null;
                        ysi0Var.f275792Y = 6;
                        objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                        if (objM81781A == yukVar) {
                            return yukVar;
                        }
                        return objM81781A;
                    }
                } else {
                    sr4Var.m79019k(str, null, (4 & 4) != 0);
                    String str19 = n2k0Var5.f149777d;
                    ysi0Var.f275793a = n2k0Var5;
                    ysi0Var.f275794b = gh00Var;
                    ysi0Var.f275795c = zsi0Var;
                    ysi0Var.f275796d = str;
                    ysi0Var.f275797e = null;
                    ysi0Var.f275798f = sr4Var;
                    ysi0Var.f275801i = i;
                    ysi0Var.f275792Y = 3;
                    objM96770h = zrr0Var.m96770h(str19, ysi0Var);
                    if (objM96770h != yukVar2) {
                        gh00 gh00Var10 = gh00Var;
                        n2k0Var2 = n2k0Var5;
                        gh00Var2 = zsi0Var;
                        sr4Var2 = sr4Var;
                        objM96770h2 = objM96770h;
                        gh00Var3 = gh00Var10;
                        sr4Var2.m79016f(str);
                        gh00Var4 = gh00Var3;
                        n2k0Var3 = n2k0Var2;
                        bitmap = (Bitmap) objM96770h2;
                        str2 = n2k0Var3.f149778e;
                        String str110 = n2k0Var3.f149779f;
                        String str111 = n2k0Var3.f149780g;
                        String str112 = n2k0Var3.f149781h;
                        if (bitmap != null) {
                        }
                        yukVar = yukVar2;
                        ysi0Var.f275793a = n2k0Var3;
                        ysi0Var.f275794b = gh00Var4;
                        ysi0Var.f275795c = gh00Var2;
                        ysi0Var.f275796d = null;
                        ysi0Var.f275797e = null;
                        ysi0Var.f275798f = null;
                        ysi0Var.f275799g = null;
                        ysi0Var.f275792Y = 5;
                        if (mlg1.m62222o("presenter_type", "simple", ysi0Var) == yukVar) {
                            return yukVar;
                        }
                        d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                        ysi0Var.f275793a = null;
                        ysi0Var.f275794b = null;
                        ysi0Var.f275795c = null;
                        ysi0Var.f275796d = null;
                        ysi0Var.f275797e = null;
                        ysi0Var.f275798f = null;
                        ysi0Var.f275799g = null;
                        ysi0Var.f275800h = null;
                        ysi0Var.f275792Y = 6;
                        objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                        if (objM81781A == yukVar) {
                            return yukVar;
                        }
                        return objM81781A;
                    }
                }
                return yukVar2;
            case 2:
                gh00Var2 = ysi0Var.f275795c;
                gh00Var4 = ysi0Var.f275794b;
                n2k0Var3 = ysi0Var.f275793a;
                bga.m29073P(objM96770h2);
                bitmap = (Bitmap) objM96770h2;
                str2 = n2k0Var3.f149778e;
                String str113 = n2k0Var3.f149779f;
                String str114 = n2k0Var3.f149780g;
                String str115 = n2k0Var3.f149781h;
                if (bitmap != null) {
                }
                yukVar = yukVar2;
                ysi0Var.f275793a = n2k0Var3;
                ysi0Var.f275794b = gh00Var4;
                ysi0Var.f275795c = gh00Var2;
                ysi0Var.f275796d = null;
                ysi0Var.f275797e = null;
                ysi0Var.f275798f = null;
                ysi0Var.f275799g = null;
                ysi0Var.f275792Y = 5;
                if (mlg1.m62222o("presenter_type", "simple", ysi0Var) == yukVar) {
                    return yukVar;
                }
                d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                ysi0Var.f275793a = null;
                ysi0Var.f275794b = null;
                ysi0Var.f275795c = null;
                ysi0Var.f275796d = null;
                ysi0Var.f275797e = null;
                ysi0Var.f275798f = null;
                ysi0Var.f275799g = null;
                ysi0Var.f275800h = null;
                ysi0Var.f275792Y = 6;
                objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                if (objM81781A == yukVar) {
                    return yukVar;
                }
                return objM81781A;
            case 3:
                sr4Var2 = (sr4) ysi0Var.f275798f;
                str = (String) ysi0Var.f275796d;
                gh00Var2 = ysi0Var.f275795c;
                gh00Var3 = ysi0Var.f275794b;
                n2k0Var2 = ysi0Var.f275793a;
                try {
                    bga.m29073P(objM96770h2);
                    sr4Var2.m79016f(str);
                    gh00Var4 = gh00Var3;
                    n2k0Var3 = n2k0Var2;
                    bitmap = (Bitmap) objM96770h2;
                    str2 = n2k0Var3.f149778e;
                    String str116 = n2k0Var3.f149779f;
                    String str117 = n2k0Var3.f149780g;
                    String str118 = n2k0Var3.f149781h;
                    if (bitmap != null) {
                    }
                    yukVar = yukVar2;
                    ysi0Var.f275793a = n2k0Var3;
                    ysi0Var.f275794b = gh00Var4;
                    ysi0Var.f275795c = gh00Var2;
                    ysi0Var.f275796d = null;
                    ysi0Var.f275797e = null;
                    ysi0Var.f275798f = null;
                    ysi0Var.f275799g = null;
                    ysi0Var.f275792Y = 5;
                    if (mlg1.m62222o("presenter_type", "simple", ysi0Var) == yukVar) {
                        return yukVar;
                    }
                    d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                    ysi0Var.f275793a = null;
                    ysi0Var.f275794b = null;
                    ysi0Var.f275795c = null;
                    ysi0Var.f275796d = null;
                    ysi0Var.f275797e = null;
                    ysi0Var.f275798f = null;
                    ysi0Var.f275799g = null;
                    ysi0Var.f275800h = null;
                    ysi0Var.f275792Y = 6;
                    objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                    if (objM81781A == yukVar) {
                        return yukVar;
                    }
                    return objM81781A;
                } catch (Throwable th2) {
                    th = th2;
                    sr4Var2.m79016f(str);
                    throw th;
                }
            case 4:
                String str20 = ysi0Var.f275800h;
                String str21 = ysi0Var.f275799g;
                String str22 = (String) ysi0Var.f275798f;
                str2 = ysi0Var.f275797e;
                bitmap = (Bitmap) ysi0Var.f275796d;
                gh00 gh00Var11 = ysi0Var.f275795c;
                gh00 gh00Var12 = ysi0Var.f275794b;
                n2k0Var4 = ysi0Var.f275793a;
                bga.m29073P(objM96770h2);
                str4 = str20;
                str5 = str21;
                yukVar = yukVar2;
                str3 = str22;
                gh00Var5 = gh00Var11;
                gh00Var6 = gh00Var12;
                d440Var = new d440(n2k0Var4.f149776c, bitmap, str2, str3, str5, str4, gh00Var6, gh00Var5, n2k0Var4.f149783j, n2k0Var4.f149782i);
                ysi0Var.f275793a = null;
                ysi0Var.f275794b = null;
                ysi0Var.f275795c = null;
                ysi0Var.f275796d = null;
                ysi0Var.f275797e = null;
                ysi0Var.f275798f = null;
                ysi0Var.f275799g = null;
                ysi0Var.f275800h = null;
                ysi0Var.f275792Y = 6;
                objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                if (objM81781A == yukVar) {
                    return yukVar;
                }
                return objM81781A;
            case 5:
                gh00Var2 = ysi0Var.f275795c;
                gh00Var4 = ysi0Var.f275794b;
                n2k0Var3 = ysi0Var.f275793a;
                bga.m29073P(objM96770h2);
                yukVar = yukVar2;
                d440Var = new cd21(n2k0Var3.f149776c, gh00Var4, gh00Var2, n2k0Var3.f149783j, n2k0Var3.f149782i, 32);
                ysi0Var.f275793a = null;
                ysi0Var.f275794b = null;
                ysi0Var.f275795c = null;
                ysi0Var.f275796d = null;
                ysi0Var.f275797e = null;
                ysi0Var.f275798f = null;
                ysi0Var.f275799g = null;
                ysi0Var.f275800h = null;
                ysi0Var.f275792Y = 6;
                objM81781A = this.f64192b.m81781A(d440Var, ysi0Var);
                if (objM81781A == yukVar) {
                    return yukVar;
                }
                return objM81781A;
            case 6:
                bga.m29073P(objM96770h2);
                return objM96770h2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public eyv(twy twyVar, yho yhoVar, zrr0 zrr0Var, Context context, og6 og6Var) {
        this.f64191a = 0;
        this.f64192b = twyVar;
        this.f64193c = yhoVar;
        this.f64194d = zrr0Var;
        this.f64195e = context;
        this.f64196f = qpv0.f191387a.mo54112b(k2k0.class);
    }
}
