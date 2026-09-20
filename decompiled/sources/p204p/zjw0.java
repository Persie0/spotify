package p204p;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zjw0 {

    /* JADX INFO: renamed from: a */
    public RenderEffect f283559a;

    /* JADX INFO: renamed from: a */
    public final RenderEffect m96247a() {
        RenderEffect renderEffect = this.f283559a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectMo51146b = mo51146b();
        this.f283559a = renderEffectMo51146b;
        return renderEffectMo51146b;
    }

    /* JADX INFO: renamed from: b */
    public abstract RenderEffect mo51146b();
}
