package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class lh40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sh40 f133362a;

    public lh40(sh40 sh40Var) {
        this.f133362a = sh40Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Iterator it = ((fh40) obj).f69573a.iterator();
        while (it.hasNext()) {
            this.f133362a.f209090e.addTemporaryFile((Uri) it.next());
        }
        return w2a1.f247311a;
    }
}
