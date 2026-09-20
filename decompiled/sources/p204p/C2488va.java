package p204p;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p.va */
/* JADX INFO: loaded from: classes5.dex */
public final class C2488va implements o7u {

    /* JADX INFO: renamed from: a */
    public final Context f239071a;

    public /* synthetic */ C2488va(Context context, boolean z) {
        this.f239071a = context;
    }

    @Override // p204p.o7u
    /* JADX INFO: renamed from: a */
    public void mo66404a(id6 id6Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ygi("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new zq4(this, id6Var, threadPoolExecutor, 17));
    }

    public C2488va(Context context, fz3 fz3Var) {
        this.f239071a = context;
    }

    public C2488va(Context context) {
        this.f239071a = context.getApplicationContext();
    }
}
