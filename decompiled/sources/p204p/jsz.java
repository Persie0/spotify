package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class jsz implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ psz f115632a;

    public jsz(psz pszVar) {
        this.f115632a = pszVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f115632a.f181009c);
    }
}
