package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class swn0 implements xv11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214693a;

    public /* synthetic */ swn0(int i) {
        this.f214693a = i;
    }

    @Override // p204p.xv11
    /* JADX INFO: renamed from: a */
    public final Single mo44269a(int i, xt80 xt80Var) {
        switch (this.f214693a) {
            case 0:
                uv11 uv11Var = uv11.f234311a;
                uv11 uv11Var2 = uv11.f234312b;
                if (i == 5) {
                    return Single.just(new wv11(bk5.m29624m1(new uv11[]{uv11Var, uv11Var2})));
                }
                boolean z = (xt80Var != null ? xt80Var.f265798f : 0) == 5;
                Set setM29624m1 = z ? bk5.m29624m1(new uv11[]{uv11Var, uv11Var2}) : Collections.singleton(uv11Var2);
                if (!z) {
                    uv11Var = uv11Var2;
                }
                return Single.just(new wv11(setM29624m1, uv11Var, z));
            default:
                uv11 uv11Var3 = uv11.f234312b;
                uv11 uv11Var4 = uv11.f234311a;
                if (i == 5) {
                    return Single.just(new wv11(bk5.m29624m1(new uv11[]{uv11Var4, uv11Var3})));
                }
                Set setM77306i0 = s601.m77306i0(uv11Var3);
                boolean z2 = (xt80Var != null ? xt80Var.f265798f : 0) == 5;
                if (z2) {
                    setM77306i0.add(uv11Var4);
                }
                if (z2) {
                    uv11Var3 = uv11Var4;
                }
                return Single.just(new wv11(setM77306i0, uv11Var3, z2));
        }
    }
}
