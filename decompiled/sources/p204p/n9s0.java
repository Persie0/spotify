package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class n9s0 implements gge1 {

    /* JADX INFO: renamed from: a */
    public final Context f151856a;

    /* JADX INFO: renamed from: b */
    public final juk f151857b;

    public n9s0(Context context, juk jukVar) {
        this.f151856a = context;
        this.f151857b = jukVar;
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return new x9s0(this, this.f151856a, this.f151857b);
    }
}
