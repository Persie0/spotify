package p204p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class aod0 implements Function, v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f17661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f17662c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f17663d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f17664e;

    public /* synthetic */ aod0(int i, Bundle bundle, String str, String str2) {
        this.f17660a = 1;
        this.f17661b = str;
        this.f17663d = str2;
        this.f17662c = i;
        this.f17664e = bundle;
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        zk1 zk1Var = (zk1) this.f17663d;
        ((ctd0) obj).mo33835B(zk1Var.f283580c, (vsd0) zk1Var.f283581d, (o0a0) this.f17661b, (lhd0) this.f17664e, this.f17662c);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f17660a) {
            case 0:
                cod0 cod0Var = (cod0) this.f17663d;
                String str = (String) this.f17661b;
                wfq0 wfq0Var = (wfq0) this.f17664e;
                Logger.m3970f((Throwable) obj, "Resolving with the session-less callback instead.", new Object[0]);
                return cod0Var.m33500d(str, wfq0Var, this.f17662c);
            default:
                String str2 = (String) this.f17661b;
                String str3 = (String) this.f17663d;
                return ((xnd0) obj).mo31408r(this.f17662c, (Bundle) this.f17664e, str2, str3);
        }
    }

    public /* synthetic */ aod0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f17660a = i2;
        this.f17663d = obj;
        this.f17661b = obj2;
        this.f17664e = obj3;
        this.f17662c = i;
    }
}
