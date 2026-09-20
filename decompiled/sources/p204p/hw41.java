package p204p;

import android.graphics.Canvas;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;

/* JADX INFO: loaded from: classes2.dex */
public final class hw41 implements iw41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StateListAnimatorButton f95857a;

    public hw41(StateListAnimatorButton stateListAnimatorButton) {
        this.f95857a = stateListAnimatorButton;
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: a */
    public final void mo48915a(float f) {
        super/*android.view.View*/.setScaleX(f);
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: b */
    public final void mo48916b(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: c */
    public final float mo48917c() {
        return super/*android.view.View*/.getScaleX();
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: d */
    public final void mo48918d(float f) {
        super/*android.view.View*/.setScaleY(f);
    }

    @Override // p204p.iw41
    /* JADX INFO: renamed from: e */
    public final float mo48919e() {
        return super/*android.view.View*/.getScaleY();
    }
}
