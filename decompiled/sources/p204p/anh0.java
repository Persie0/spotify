package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class anh0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ juk f17445b;

    public /* synthetic */ anh0(int i, juk jukVar) {
        this.f17444a = i;
        this.f17445b = jukVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        int i = this.f17444a;
        juk jukVar = this.f17445b;
        switch (i) {
            case 0:
                MobiusCoroutines.Companion companion = MobiusCoroutines.Companion.f5726a;
                break;
            default:
                MobiusCoroutines.Companion companion2 = MobiusCoroutines.Companion.f5726a;
                break;
        }
        return new DispatcherWorker(jukVar);
    }
}
