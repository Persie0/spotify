package p204p;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ComposeShader;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ap4 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BlendModeColorFilter m26632a(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ComposeShader m26633b(Shader shader, Shader shader2, BlendMode blendMode) {
        return new ComposeShader(shader, shader2, blendMode);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ RenderNode m26634c() {
        return new RenderNode("graphicsLayer");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Typeface.CustomFallbackBuilder m26635d(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ FontFamily.Builder m26636e(Font font) {
        return new FontFamily.Builder(font);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ MediaSession m26637f(Context context, Bundle bundle, String str) {
        return new MediaSession(context, str, bundle);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ MediaSession m26638g(Context context, String str) {
        return new MediaSession(context, str, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ LineHeightSpan.Standard m26639h(int i) {
        return new LineHeightSpan.Standard(i);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m26640i() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ RenderNode m26641j() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m26642k() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m26643l() {
    }
}
