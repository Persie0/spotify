package p204p;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.spotify.music.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class maq0 extends AbstractC2441u6 {

    /* JADX INFO: renamed from: L0 */
    public raq0 f141642L0;

    /* JADX INFO: renamed from: M0 */
    public String f141643M0;

    /* JADX INFO: renamed from: N0 */
    public final View f141644N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f141645O0;

    /* JADX INFO: renamed from: P0 */
    public final tm4 f141646P0;

    /* JADX INFO: renamed from: Q0 */
    public final WindowManager f141647Q0;

    /* JADX INFO: renamed from: R0 */
    public final WindowManager.LayoutParams f141648R0;

    /* JADX INFO: renamed from: S0 */
    public qaq0 f141649S0;

    /* JADX INFO: renamed from: T0 */
    public ko70 f141650T0;

    /* JADX INFO: renamed from: U0 */
    public final yum0 f141651U0;

    /* JADX INFO: renamed from: V0 */
    public final yum0 f141652V0;

    /* JADX INFO: renamed from: W0 */
    public c450 f141653W0;

    /* JADX INFO: renamed from: X0 */
    public final rtq f141654X0;

    /* JADX INFO: renamed from: Y0 */
    public final Rect f141655Y0;

    /* JADX INFO: renamed from: Z0 */
    public final mb31 f141656Z0;

    /* JADX INFO: renamed from: a1 */
    public x35 f141657a1;

    /* JADX INFO: renamed from: b1 */
    public final yum0 f141658b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f141659c1;

    /* JADX INFO: renamed from: d1 */
    public final int[] f141660d1;

    /* JADX INFO: renamed from: t */
    public eh00 f141661t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maq0(eh00 eh00Var, raq0 raq0Var, String str, View view, yqq yqqVar, qaq0 qaq0Var, UUID uuid, boolean z) {
        super(view.getContext(), null, 6, 0);
        int i = Build.VERSION.SDK_INT;
        tm4 oaq0Var = i >= 30 ? new oaq0(21) : i >= 29 ? new naq0(21) : new tm4(21);
        this.f141661t = eh00Var;
        this.f141642L0 = raq0Var;
        this.f141643M0 = str;
        this.f141644N0 = view;
        this.f141645O0 = z;
        this.f141646P0 = oaq0Var;
        this.f141647Q0 = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        raq0 raq0Var2 = this.f141642L0;
        boolean zM78516c = sm4.m78516c(view);
        boolean z2 = raq0Var2.f197366b;
        int i2 = raq0Var2.f197365a;
        if (z2 && zM78516c) {
            i2 |= 8192;
        } else if (z2 && !zM78516c) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.f141642L0.f197371g;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f141648R0 = layoutParams;
        this.f141649S0 = qaq0Var;
        this.f141650T0 = ko70.f124556a;
        this.f141651U0 = sam.m77645B(null);
        this.f141652V0 = sam.m77645B(null);
        this.f141654X0 = sam.m77674m(new fyo0(this, 18));
        this.f141655Y0 = new Rect();
        this.f141656Z0 = new mb31(new om4(this, 2));
        setId(android.R.id.content);
        eug1.m40073o(this, eug1.m40067h(view));
        lug1.m59989F(this, lug1.m59986C(view));
        y85.m93047D(this, y85.m93069n(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(yqqVar.mo35989Z0((float) 8));
        setOutlineProvider(new kaq0());
        this.f141658b1 = sam.m77645B(z1g.f278312a);
        this.f141660d1 = new int[2];
    }

    private final th00 getContent() {
        return (th00) this.f141658b1.getValue();
    }

    private final c450 getDisplayBounds() {
        int i = this.f141642L0.f197365a & 512;
        View view = this.f141644N0;
        tm4 tm4Var = this.f141646P0;
        Rect rect = this.f141655Y0;
        if (i == 0) {
            tm4Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            tm4Var.mo66572o(rect, view);
        }
        return new c450(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jo70 getParentLayoutCoordinates() {
        return (jo70) this.f141652V0.getValue();
    }

    private final void setContent(th00 th00Var) {
        this.f141658b1.setValue(th00Var);
    }

    private final void setParentLayoutCoordinates(jo70 jo70Var) {
        this.f141652V0.setValue(jo70Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m61324B() {
        jo70 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo30016a()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo30018b = parentLayoutCoordinates.mo30018b();
            long jMo30046x = this.f141645O0 ? parentLayoutCoordinates.mo30046x(0L) : parentLayoutCoordinates.mo30029m(0L);
            c450 c450VarM92083d = xtm0.m92083d((((long) Math.round(Float.intBitsToFloat((int) (jMo30046x >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jMo30046x & 4294967295L))))), jMo30018b);
            if (c450VarM92083d.equals(this.f141653W0)) {
                return;
            }
            this.f141653W0 = c450VarM92083d;
            m61326D();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m61325C(jo70 jo70Var) {
        setParentLayoutCoordinates(jo70Var);
        m61324B();
    }

    /* JADX INFO: renamed from: D */
    public final void m61326D() {
        g450 g450VarM98378getPopupContentSizebOM6tXw;
        c450 c450Var = this.f141653W0;
        if (c450Var == null || (g450VarM98378getPopupContentSizebOM6tXw = m98378getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = g450VarM98378getPopupContentSizebOM6tXw.f76347a;
        c450 displayBounds = getDisplayBounds();
        long jM31424b = (((long) displayBounds.m31424b()) & 4294967295L) | (((long) displayBounds.m31426d()) << 32);
        qlv0 qlv0Var = new qlv0();
        qlv0Var.f189932a = 0L;
        this.f141656Z0.m61344d(this, s9q0.f207019d, new laq0(qlv0Var, this, c450Var, jM31424b, j));
        long j2 = qlv0Var.f189932a;
        WindowManager.LayoutParams layoutParams = this.f141648R0;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.f141642L0.f197369e;
        tm4 tm4Var = this.f141646P0;
        if (z) {
            tm4Var.mo64034B(this, (int) (jM31424b >> 32), (int) (jM31424b & 4294967295L));
        }
        tm4Var.getClass();
        this.f141647Q0.updateViewLayout(this, layoutParams);
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: a */
    public final void mo301a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(-857613600);
        int i2 = (xq00Var.m91770i(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z23(this, i, 21);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f141642L0.f197367c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                eh00 eh00Var = this.f141661t;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f141654X0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f141648R0;
    }

    public final ko70 getParentLayoutDirection() {
        return this.f141650T0;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final g450 m98378getPopupContentSizebOM6tXw() {
        return (g450) this.f141651U0.getValue();
    }

    public final qaq0 getPositionProvider() {
        return this.f141649S0;
    }

    @Override // p204p.AbstractC2441u6
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f141659c1;
    }

    public final String getTestTag() {
        return this.f141643M0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: j */
    public final void mo41678j(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.mo41678j(z, i, i2, i3, i4);
        if (this.f141642L0.f197370f || (childAt = getChildAt(0)) == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f141648R0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f141646P0.getClass();
        this.f141647Q0.updateViewLayout(this, layoutParams);
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: m */
    public final void mo41679m(int i, int i2) {
        if (this.f141642L0.f197370f) {
            super.mo41679m(i, i2);
        } else {
            c450 displayBounds = getDisplayBounds();
            super.mo41679m(View.MeasureSpec.makeMeasureSpec(displayBounds.m31426d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.m31424b(), Integer.MIN_VALUE));
        }
    }

    @Override // p204p.AbstractC2441u6, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mb31 mb31Var = this.f141656Z0;
        mb31Var.f141787h = lb5.m58614m(mb31Var.f141783d);
        if (!this.f141642L0.f197367c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f141657a1 == null) {
            this.f141657a1 = new x35(this.f141661t, 0);
        }
        z35.m95264e(this, this.f141657a1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mb31 mb31Var = this.f141656Z0;
        na31 na31Var = mb31Var.f141787h;
        if (na31Var != null) {
            na31Var.m63947a();
        }
        mb31Var.m61341a();
        if (Build.VERSION.SDK_INT >= 33) {
            z35.m95265f(this, this.f141657a1);
        }
        this.f141657a1 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f141642L0.f197368d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            eh00 eh00Var = this.f141661t;
            if (eh00Var != null) {
                eh00Var.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        eh00 eh00Var2 = this.f141661t;
        if (eh00Var2 != null) {
            eh00Var2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(ko70 ko70Var) {
        this.f141650T0 = ko70Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m98379setPopupContentSizefhxjrPA(g450 g450Var) {
        this.f141651U0.setValue(g450Var);
    }

    public final void setPositionProvider(qaq0 qaq0Var) {
        this.f141649S0 = qaq0Var;
    }

    public final void setTestTag(String str) {
        this.f141643M0 = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m61327v(hsh hshVar, th00 th00Var) {
        setParentCompositionContext(hshVar);
        setContent(th00Var);
        this.f141659c1 = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m61328w(eh00 eh00Var, raq0 raq0Var, String str, ko70 ko70Var) {
        int i;
        this.f141661t = eh00Var;
        this.f141643M0 = str;
        if (!wj50.m88271j(this.f141642L0, raq0Var)) {
            boolean z = raq0Var.f197370f;
            WindowManager.LayoutParams layoutParams = this.f141648R0;
            if (z && !this.f141642L0.f197370f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f141642L0 = raq0Var;
            boolean zM78516c = sm4.m78516c(this.f141644N0);
            boolean z2 = raq0Var.f197366b;
            int i2 = raq0Var.f197365a;
            if (z2 && zM78516c) {
                i2 |= 8192;
            } else if (z2 && !zM78516c) {
                i2 &= -8193;
            }
            layoutParams.flags = i2;
            this.f141646P0.getClass();
            this.f141647Q0.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = ko70Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC2441u6 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
