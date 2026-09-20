package com.spotify.encoreconsumermobile.elementscompose.jamlistenalongbadge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.AbstractC2441u6;
import p204p.c6x0;
import p204p.fkr0;
import p204p.pgv0;
import p204p.rkk;
import p204p.sam;
import p204p.u160;
import p204p.xq00;
import p204p.y0v;
import p204p.yum0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elementscompose/jamlistenalongbadge/JamListenAlongBadgeView;", "Lp/u6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "t", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "<set-?>", "M0", "Lp/kqi0;", "getShouldAnimate", "setShouldAnimate", "(Z)V", "shouldAnimate", "src_main_java_com_spotify_encoreconsumermobile_elementscompose_jamlistenalongbadge-jamlistenalongbadge"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JamListenAlongBadgeView extends AbstractC2441u6 {

    /* JADX INFO: renamed from: L0 */
    public boolean f3775L0;

    /* JADX INFO: renamed from: M0 */
    public final yum0 f3776M0;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public JamListenAlongBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    private final void setShouldAnimate(boolean z) {
        this.f3776M0.setValue(Boolean.valueOf(z));
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: a */
    public final void mo301a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1811044336);
        int i2 = (xq00Var.m91770i(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            y0v.m92603a(0, rkk.m75772x(-927203204, new u160(this), xq00Var), xq00Var, 384, 3);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new u160(this, i);
        }
    }

    public final boolean getShouldAnimate() {
        return ((Boolean) this.f3776M0.getValue()).booleanValue();
    }

    @Override // p204p.AbstractC2441u6
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // p204p.AbstractC2441u6, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean hasComposition = getHasComposition();
        super.onAttachedToWindow();
        if (!hasComposition && getHasComposition()) {
            m9665u();
        }
        m9667w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (getShouldAnimate()) {
            setShouldAnimate(false);
            "animation=".concat("stopped");
            m9665u();
        }
        if (getHasComposition()) {
            m82425g();
            m9665u();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (isAttachedToWindow()) {
            m9667w();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9665u() {
        Object c6x0Var;
        Object tag = getTag();
        if ((tag == null || tag.toString() == null) && getId() != -1) {
            try {
                c6x0Var = getResources().getResourceEntryName(getId());
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            Object objValueOf = String.valueOf(getId());
            if (c6x0Var instanceof c6x0) {
                c6x0Var = objValueOf;
            }
        }
        Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: v */
    public final void m9666v(boolean z) {
        this.f3775L0 = z;
        this.shouldCreateCompositionOnAttachedToWindow = z;
        setVisibility(z ? 0 : 8);
        m9667w();
        if (z && isAttachedToWindow() && !getHasComposition()) {
            m82424f();
            m9665u();
        } else {
            if (z || !getHasComposition()) {
                return;
            }
            m82425g();
            m9665u();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9667w() {
        boolean z = this.f3775L0 && isShown();
        if (getShouldAnimate() == z) {
            return;
        }
        setShouldAnimate(z);
        "animation=".concat(z ? "started" : "stopped");
        m9665u();
    }

    public JamListenAlongBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public JamListenAlongBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImportantForAccessibility(2);
        setViewCompositionStrategy(fkr0.f70595U0);
        this.f3776M0 = sam.m77645B(Boolean.FALSE);
    }

    public /* synthetic */ JamListenAlongBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
