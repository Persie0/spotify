package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class bdl implements c9y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26128a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f26129b;

    public /* synthetic */ bdl(i4t0 i4t0Var, int i) {
        this.f26128a = i;
        this.f26129b = i4t0Var;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f26128a) {
            case 0:
                return new suj((Context) ((x050) this.f26129b).f256813b, new o7d1(), new t36(29));
            default:
                String packageName = ((Context) this.f26129b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
