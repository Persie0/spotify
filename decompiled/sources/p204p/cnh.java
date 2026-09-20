package p204p;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class cnh implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final cpz0 f40021a;

    /* JADX INFO: renamed from: b */
    public final c450 f40022b;

    /* JADX INFO: renamed from: c */
    public final t1j f40023c;

    /* JADX INFO: renamed from: d */
    public final oz3 f40024d;

    /* JADX INFO: renamed from: e */
    public final c9k f40025e;

    /* JADX INFO: renamed from: f */
    public final ww8 f40026f;

    public cnh(cpz0 cpz0Var, c450 c450Var, c9k c9kVar, t1j t1jVar, oz3 oz3Var) {
        this.f40021a = cpz0Var;
        this.f40022b = c450Var;
        this.f40023c = t1jVar;
        this.f40024d = oz3Var;
        this.f40025e = new c9k(c9kVar.f35578a.mo26608y(pkr.f178513b));
        this.f40026f = new ww8(c450Var.m31424b(), new zs71(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m33453a(cnh cnhVar, ScrollCaptureSession scrollCaptureSession, c450 c450Var, ibk ibkVar) {
        bnh bnhVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        c450 c450Var2;
        int i4;
        int iM63437n;
        int iM63437n2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (ibkVar instanceof bnh) {
            bnhVar = (bnh) ibkVar;
            int i7 = bnhVar.f28834g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bnhVar.f28834g = i7 - Integer.MIN_VALUE;
            } else {
                bnhVar = new bnh(cnhVar, ibkVar);
            }
        } else {
            bnhVar = new bnh(cnhVar, ibkVar);
        }
        Object obj = bnhVar.f28832e;
        int i8 = bnhVar.f28834g;
        yuk yukVar = yuk.f276404a;
        if (i8 == 0) {
            bga.m29073P(obj);
            i = c450Var.f33849b;
            i2 = c450Var.f33851d;
            ww8 ww8Var = cnhVar.f40026f;
            bnhVar.f28828a = scrollCaptureSession;
            bnhVar.f28829b = c450Var;
            bnhVar.f28830c = i;
            bnhVar.f28831d = i2;
            bnhVar.f28834g = 1;
            int i9 = ww8Var.f255726a;
            if (i > i2) {
                throw new IllegalArgumentException(s571.m77247f(i, "Expected min=", i2, " ≤ max=").toString());
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                throw new IllegalArgumentException(s571.m77247f(i10, "Expected range (", i9, ") to be ≤ viewportSize=").toString());
            }
            float f = i;
            float f2 = ww8Var.f255727b;
            Object obj2 = w2a1.f247311a;
            if (f < f2 || i2 > i9 + f2) {
                Object objM89176c = ww8Var.m89176c((((i10 / 2) + i) - (i9 / 2)) - f2, bnhVar);
                if (objM89176c != yukVar) {
                    objM89176c = obj2;
                }
                if (objM89176c == yukVar) {
                    obj2 = objM89176c;
                }
            }
            if (obj2 != yukVar) {
            }
            return yukVar;
        }
        if (i8 == 1) {
            int i11 = bnhVar.f28831d;
            int i12 = bnhVar.f28830c;
            c450 c450Var3 = bnhVar.f28829b;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) bnhVar.f28828a;
            bga.m29073P(obj);
            i = i12;
            c450Var = c450Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = bnhVar.f28831d;
            i4 = bnhVar.f28830c;
            c450Var2 = bnhVar.f28829b;
            scrollCaptureSession2 = (ScrollCaptureSession) bnhVar.f28828a;
            bga.m29073P(obj);
        }
        ww8 ww8Var2 = cnhVar.f40026f;
        iM63437n = n0e1.m63437n(i4 - q3d0.m72083N(ww8Var2.f255727b), 0, ww8Var2.f255726a);
        ww8 ww8Var3 = cnhVar.f40026f;
        iM63437n2 = n0e1.m63437n(i3 - q3d0.m72083N(ww8Var3.f255727b), 0, ww8Var3.f255726a);
        i5 = c450Var2.f33848a;
        i6 = c450Var2.f33850c;
        if (iM63437n == iM63437n2) {
            return c450.f33847e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM63437n);
            c450 c450Var4 = cnhVar.f40022b;
            canvasLockHardwareCanvas.translate(-c450Var4.f33848a, -c450Var4.f33849b);
            cnhVar.f40024d.getRootView().draw(canvasLockHardwareCanvas);
            int iM72083N = q3d0.m72083N(cnhVar.f40026f.f255727b);
            return new c450(i5, iM63437n + iM72083N, i6, iM63437n2 + iM72083N);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        vlh vlhVar = vlh.f242520f;
        bnhVar.f28828a = scrollCaptureSession;
        bnhVar.f28829b = c450Var;
        bnhVar.f28830c = i;
        bnhVar.f28831d = i2;
        bnhVar.f28834g = 2;
        if (cvf1.m34049l(bnhVar.getContext()).mo30456K(bnhVar, vlhVar) != yukVar) {
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = i2;
            c450Var2 = c450Var;
            i4 = i;
            ww8 ww8Var4 = cnhVar.f40026f;
            iM63437n = n0e1.m63437n(i4 - q3d0.m72083N(ww8Var4.f255727b), 0, ww8Var4.f255726a);
            ww8 ww8Var5 = cnhVar.f40026f;
            iM63437n2 = n0e1.m63437n(i3 - q3d0.m72083N(ww8Var5.f255727b), 0, ww8Var5.f255726a);
            i5 = c450Var2.f33848a;
            i6 = c450Var2.f33850c;
            if (iM63437n == iM63437n2) {
                return c450.f33847e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM63437n);
            c450 c450Var5 = cnhVar.f40022b;
            canvasLockHardwareCanvas.translate(-c450Var5.f33848a, -c450Var5.f33849b);
            cnhVar.f40024d.getRootView().draw(canvasLockHardwareCanvas);
            int iM72083N2 = q3d0.m72083N(cnhVar.f40026f.f255727b);
            return new c450(i5, iM63437n + iM72083N2, i6, iM63437n2 + iM72083N2);
        }
        return yukVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        x0h1.m89578u(this.f40025e, rnj0.f200934b, 0, new wbe(this, runnable, (fbk) null, 18), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        di41 di41VarM89578u = x0h1.m89578u(this.f40025e, null, 0, new j6a(16, this, scrollCaptureSession, rect, consumer, (fbk) null), 3);
        di41VarM89578u.mo26599N(new enh(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new dnh(di41VarM89578u, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(yyg1.m94895F(this.f40022b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f40026f.f255727b = 0.0f;
        ((yum0) this.f40023c.f216285b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
