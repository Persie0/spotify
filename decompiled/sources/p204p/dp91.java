package p204p;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dp91 extends cp91 {
    @Override // p204p.cp91
    /* JADX INFO: renamed from: H1 */
    public final Font mo33551H1(o000 o000Var) {
        Font fontM88661d;
        Uri uri = o000Var.f160197a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = o000Var.f160201e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM88661d = wo91.m88661d(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontM88661d;
                }
                try {
                    return new Font.Builder(fontM88661d).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
