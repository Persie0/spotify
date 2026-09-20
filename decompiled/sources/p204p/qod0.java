package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qod0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f190916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f190917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f190918c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f190919d;

    public /* synthetic */ qod0(int i, Bundle bundle, String str, String str2) {
        this.f190916a = i;
        this.f190917b = str;
        this.f190918c = str2;
        this.f190919d = bundle;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f190916a) {
            case 0:
                return ((xnd0) obj).mo31399i(this.f190917b, this.f190918c, this.f190919d);
            default:
                return ((xnd0) obj).mo31397g(this.f190917b, this.f190918c, this.f190919d);
        }
    }
}
