package p204p;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sgb implements y8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f208816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f208817c;

    public /* synthetic */ sgb(int i, Object obj, Object obj2) {
        this.f208815a = i;
        this.f208816b = obj;
        this.f208817c = obj2;
    }

    @Override // p204p.y8j
    public final void accept(Object obj) {
        switch (this.f208815a) {
            case 0:
                Surface surface = (Surface) this.f208816b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f208817c;
                surface.release();
                surfaceTexture.release();
                break;
            case 1:
                cbq cbqVar = (cbq) this.f208816b;
                l861 l861Var = (l861) this.f208817c;
                l861Var.close();
                Surface surface2 = (Surface) cbqVar.f36181h.remove(l861Var);
                if (surface2 != null) {
                    sol0 sol0Var = cbqVar.f36174a;
                    fl00.m41971d((AtomicBoolean) sol0Var.f211214c, true);
                    fl00.m41970c((Thread) sol0Var.f211216e);
                    sol0Var.m78665s(surface2, true);
                }
                break;
            default:
                kjs kjsVar = (kjs) this.f208816b;
                l861 l861Var2 = (l861) this.f208817c;
                l861Var2.close();
                Surface surface3 = (Surface) kjsVar.f123418h.remove(l861Var2);
                if (surface3 != null) {
                    ijs ijsVar = kjsVar.f123411a;
                    fl00.m41971d((AtomicBoolean) ijsVar.f211214c, true);
                    fl00.m41970c((Thread) ijsVar.f211216e);
                    ijsVar.m78665s(surface3, true);
                }
                break;
        }
    }
}
