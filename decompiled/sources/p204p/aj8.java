package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class aj8 implements inx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v550 f16184b;

    public /* synthetic */ aj8(v550 v550Var, int i) {
        this.f16183a = i;
        this.f16184b = v550Var;
    }

    @Override // p204p.inx0
    /* JADX INFO: renamed from: a */
    public final void mo26144a(Intent intent, e301 e301Var) {
        switch (this.f16183a) {
            case 0:
                cj8.m32929b((cj8) this.f16184b).mo28380b();
                break;
            default:
                j330 j330Var = (j330) this.f16184b;
                Intent intentM52248b = j330Var.m52248b(intent);
                if (intentM52248b != null) {
                    j330Var.f108277b.mo35747a(intentM52248b);
                }
                break;
        }
    }
}
