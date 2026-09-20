package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo91 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1806e9 f253411a;

    /* JADX INFO: renamed from: b */
    public static final oab0 f253412b;

    /* JADX INFO: renamed from: c */
    public static Paint f253413c;

    static {
        fn1.m42176e(k0e1.m54980O("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f253411a = new dp91(21);
        } else if (i >= 29) {
            f253411a = new cp91(21);
        } else if (i >= 28) {
            f253411a = new bp91();
        } else if (i >= 26) {
            f253411a = new ap91();
        } else if (yo91.m94276H1()) {
            f253411a = new yo91();
        } else {
            f253411a = new xo91();
        }
        f253412b = new oab0(16);
        f253413c = null;
        fn1.m42178g();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m88658a(Context context, wzz wzzVar, Resources resources, int i, String str, int i2, int i3, hv90 hv90Var, boolean z) {
        Typeface typefaceMo26666M0;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        boolean z2 = wzzVar instanceof zzz;
        oab0 oab0Var = f253412b;
        if (z2) {
            zzz zzzVar = (zzz) wzzVar;
            String strM97343c = zzzVar.m97343c();
            if (TextUtils.isEmpty(strM97343c) || (typefaceBuild = m88660c(strM97343c)) == null) {
                ArrayList arrayList = (ArrayList) zzzVar.m97342b();
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                int i5 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilderM26635d = null;
                                while (true) {
                                    if (i5 < arrayList.size()) {
                                        pzz pzzVar = (pzz) arrayList.get(i5);
                                        if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(pzzVar.f183865f)) {
                                            customFallbackBuilderM26635d.setSystemFallback(pzzVar.f183864e);
                                        } else {
                                            String str2 = pzzVar.f183864e;
                                            String str3 = pzzVar.f183865f;
                                            Font fontM88661d = m88661d(m88660c(str2));
                                            if (fontM88661d != null) {
                                                if (TextUtils.isEmpty(str3)) {
                                                    try {
                                                        ap4.m26642k();
                                                        ap4.m26643l();
                                                        fontFamilyBuild = ap4.m26636e(iwb.m51793a(fontM88661d).setFontVariationSettings(str3).build()).build();
                                                    } catch (IOException unused) {
                                                    }
                                                } else {
                                                    fontFamilyBuild = ap4.m26636e(fontM88661d).build();
                                                }
                                                if (customFallbackBuilderM26635d == null) {
                                                    customFallbackBuilderM26635d = ap4.m26635d(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderM26635d.addCustomFallback(fontFamilyBuild);
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderM26635d.build();
                                    break;
                                }
                            }
                            if (m88660c(((pzz) arrayList.get(i4)).f183864e) != null) {
                                i4++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = m88660c(((pzz) arrayList.get(0)).f183864e);
            }
            if (typefaceBuild != null) {
                if (hv90Var != null) {
                    hv90Var.m48757r(typefaceBuild);
                }
                oab0Var.m66542d(m88659b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            typefaceMo26666M0 = ncg1.m64157w(context, zzzVar.m97342b(), i3, !z ? hv90Var != null : zzzVar.m97341a() != 0, z ? zzzVar.m97344d() : -1, hv90.m48751t(), new vr11(hv90Var, 21));
        } else {
            typefaceMo26666M0 = f253411a.mo26666M0(context, (xzz) wzzVar, resources, i3);
            if (hv90Var != null) {
                if (typefaceMo26666M0 != null) {
                    hv90Var.m48757r(typefaceMo26666M0);
                } else {
                    hv90Var.m48756q(-3);
                }
            }
        }
        if (typefaceMo26666M0 != null) {
            oab0Var.m66542d(m88659b(resources, i, str, i2, i3), typefaceMo26666M0);
        }
        return typefaceMo26666M0;
    }

    /* JADX INFO: renamed from: b */
    public static String m88659b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m88660c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Font m88661d(Typeface typeface) {
        if (f253413c == null) {
            f253413c = new Paint();
        }
        f253413c.setTextSize(10.0f);
        f253413c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f253413c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
