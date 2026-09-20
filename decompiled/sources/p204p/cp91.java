package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class cp91 extends AbstractC1806e9 {
    /* JADX INFO: renamed from: F1 */
    public static Font m33548F1(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? CtaType.SEE_ALL_SHOWS_FIELD_NUMBER : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM33549I1 = m33549I1(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM33549I2 = m33549I1(fontStyle, font2.getStyle());
            if (iM33549I2 < iM33549I1) {
                font = font2;
                iM33549I1 = iM33549I2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: I1 */
    public static int m33549I1(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: G1 */
    public final FontFamily m33550G1(o000[] o000VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (o000 o000Var : o000VarArr) {
            if (Objects.equals(o000Var.f160197a.getScheme(), "systemfont")) {
                fontBuild = mo33551H1(o000Var);
            } else {
                try {
                    Uri uri = o000Var.f160197a;
                    String str = o000Var.f160201e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(o000Var.f160199c).setSlant(o000Var.f160200d ? 1 : 0).setTtcIndex(o000Var.f160198b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: H1 */
    public Font mo33551H1(o000 o000Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: M0 */
    public final Typeface mo26666M0(Context context, xzz xzzVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (yzz yzzVar : xzzVar.m92522a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, yzzVar.m94993a()).setWeight(yzzVar.m94996d()).setSlant(yzzVar.m94997e() ? 1 : 0).setTtcIndex(yzzVar.m94994b()).setFontVariationSettings(yzzVar.m94995c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m33548F1(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: N0 */
    public final Typeface mo26667N0(Context context, o000[] o000VarArr, int i) {
        try {
            FontFamily fontFamilyM33550G1 = m33550G1(o000VarArr, context.getContentResolver());
            if (fontFamilyM33550G1 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM33550G1).setStyle(m33548F1(fontFamilyM33550G1, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: O0 */
    public final Typeface mo33552O0(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM33550G1 = m33550G1((o000[]) list.get(0), contentResolver);
            if (fontFamilyM33550G1 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM33550G1);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM33550G2 = m33550G1((o000[]) list.get(i2), contentResolver);
                if (fontFamilyM33550G2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM33550G2);
                }
            }
            return customFallbackBuilder.setStyle(m33548F1(fontFamilyM33550G1, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: P0 */
    public final Typeface mo33553P0(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: Q0 */
    public final Typeface mo26668Q0(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: S0 */
    public final Typeface mo26669S0(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: U0 */
    public final o000 mo33554U0(o000[] o000VarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
