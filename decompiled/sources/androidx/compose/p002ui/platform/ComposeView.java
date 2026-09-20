package androidx.compose.p002ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.AbstractC2441u6;
import p204p.ksg;
import p204p.ms2;
import p204p.pgv0;
import p204p.sam;
import p204p.th00;
import p204p.xq00;
import p204p.yum0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m24212d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Lp/u6;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Lp/w2a1;", "content", "setContent", "(Lp/th00;)V", "", "value", "L0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class ComposeView extends AbstractC2441u6 {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ int f507M0 = 0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: t */
    public final yum0 f509t;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: a */
    public final void mo301a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(420213850);
        int i2 = (xq00Var.m91770i(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            th00 th00Var = (th00) this.f509t.getValue();
            if (th00Var == null) {
                xq00Var.m91771i0(-1238823553);
            } else {
                ms2.m62691p(xq00Var, 98585282, 0, th00Var, xq00Var);
            }
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ksg(this, i, 19);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // p204p.AbstractC2441u6
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(th00 content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.f509t.setValue(content);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m82424f();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f509t = sam.m77645B(null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
