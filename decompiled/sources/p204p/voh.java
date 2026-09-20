package p204p;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.ComposeView;

/* JADX INFO: loaded from: classes8.dex */
public final class voh extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243484a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f243485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f243486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voh(View view, boolean z, fbk fbkVar) {
        super(2, fbkVar);
        this.f243486c = view;
        this.f243485b = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f243484a) {
            case 0:
                return new voh(this.f243486c, this.f243485b, fbkVar);
            default:
                return new voh(this.f243485b, this.f243486c, fbkVar);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f243484a) {
            case 0:
                voh vohVar = (voh) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                vohVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                voh vohVar2 = (voh) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                vohVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f243484a) {
            case 0:
                bga.m29073P(obj);
                ViewParent parent = this.f243486c.getParent();
                while (parent != null && !(parent instanceof ComposeView)) {
                    parent = parent.getParent();
                }
                ComposeView composeView = (ComposeView) parent;
                if (composeView != null) {
                    composeView.setVisibility(this.f243485b ? 0 : 8);
                }
                break;
            default:
                bga.m29073P(obj);
                if (this.f243485b) {
                    this.f243486c.performHapticFeedback(27);
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voh(boolean z, View view, fbk fbkVar) {
        super(2, fbkVar);
        this.f243485b = z;
        this.f243486c = view;
    }
}
