package p204p;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sa40 implements l400 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ua40 f207139b;

    public /* synthetic */ sa40(ua40 ua40Var, ua40 ua40Var2, int i) {
        this.f207138a = i;
        this.f207139b = ua40Var2;
    }

    @Override // p204p.l400
    /* JADX INFO: renamed from: c */
    public final void mo24662c(m400 m400Var) throws Exception {
        int i = this.f207138a;
        ua40 ua40Var = this.f207139b;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.f393a;
                if (ua40Var != null) {
                    ua40Var.close();
                }
                break;
            default:
                int i3 = ImageProcessingUtil.f393a;
                ua40Var.close();
                break;
        }
    }
}
