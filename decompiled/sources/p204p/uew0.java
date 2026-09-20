package p204p;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uew0 {
    /* JADX INFO: renamed from: a */
    public static final void m82926a(RemoteViews remoteViews, int i, String str, BlendMode blendMode) {
        remoteViews.setBlendMode(i, str, blendMode);
    }

    /* JADX INFO: renamed from: b */
    public static final void m82927b(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequence(i, str, i2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m82928c(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequenceAttr(i, str, i2);
    }

    /* JADX INFO: renamed from: d */
    public static final void m82929d(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColor(i, str, i2);
    }

    /* JADX INFO: renamed from: e */
    public static final void m82930e(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorAttr(i, str, i2);
    }

    /* JADX INFO: renamed from: f */
    public static final void m82931f(RemoteViews remoteViews, int i, String str, int i2, int i3) {
        remoteViews.setColorInt(i, str, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static final void m82932g(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateList(i, str, i2);
    }

    /* JADX INFO: renamed from: h */
    public static final void m82933h(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList) {
        remoteViews.setColorStateList(i, str, colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public static final void m82934i(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList, ColorStateList colorStateList2) {
        remoteViews.setColorStateList(i, str, colorStateList, colorStateList2);
    }

    /* JADX INFO: renamed from: j */
    public static final void m82935j(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateListAttr(i, str, i2);
    }

    /* JADX INFO: renamed from: k */
    public static final void m82936k(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setFloatDimen(i, str, f, i2);
    }

    /* JADX INFO: renamed from: l */
    public static final void m82937l(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimen(i, str, i2);
    }

    /* JADX INFO: renamed from: m */
    public static final void m82938m(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimenAttr(i, str, i2);
    }

    /* JADX INFO: renamed from: n */
    public static final void m82939n(RemoteViews remoteViews, int i, String str, Icon icon, Icon icon2) {
        remoteViews.setIcon(i, str, icon, icon2);
    }

    /* JADX INFO: renamed from: o */
    public static final void m82940o(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setIntDimen(i, str, f, i2);
    }

    /* JADX INFO: renamed from: p */
    public static final void m82941p(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimen(i, str, i2);
    }

    /* JADX INFO: renamed from: q */
    public static final void m82942q(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimenAttr(i, str, i2);
    }
}
