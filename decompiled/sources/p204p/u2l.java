package p204p;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class u2l implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f226113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v2l f226114b;

    public u2l(v2l v2lVar, long j) {
        this.f226114b = v2lVar;
        this.f226113a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f226113a);
        this.f226114b.f236688k.mo31098d(bundle);
        return null;
    }
}
