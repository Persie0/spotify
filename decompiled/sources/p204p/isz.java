package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class isz implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ psz f105364a;

    public isz(psz pszVar) {
        this.f105364a = pszVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f105364a.f181009c);
    }
}
