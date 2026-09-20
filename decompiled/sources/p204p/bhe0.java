package p204p;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final class bhe0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, gie0 {

    /* JADX INFO: renamed from: a */
    public gr51 f27165a;

    /* JADX INFO: renamed from: b */
    public s73 f27166b;

    /* JADX INFO: renamed from: c */
    public ry80 f27167c;

    @Override // p204p.gie0
    /* JADX INFO: renamed from: b */
    public final void mo29244b(zge0 zge0Var, boolean z) {
        s73 s73Var;
        if ((z || zge0Var == this.f27165a) && (s73Var = this.f27166b) != null) {
            s73Var.dismiss();
        }
    }

    @Override // p204p.gie0
    /* JADX INFO: renamed from: f */
    public final boolean mo29245f(zge0 zge0Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f27165a.m96071s(this.f27167c.m76695a().getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f27167c.mo28112b(this.f27165a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        gr51 gr51Var = this.f27165a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f27166b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f27166b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                gr51Var.m96064d(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return gr51Var.performShortcut(i, keyEvent, 0);
    }
}
