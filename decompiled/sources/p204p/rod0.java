package p204p;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class rod0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f201230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f201231c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f201232d;

    public /* synthetic */ rod0(String str, Uri uri, Bundle bundle, int i) {
        this.f201229a = i;
        this.f201230b = str;
        this.f201231c = uri;
        this.f201232d = bundle;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f201229a) {
            case 0:
                return ((xnd0) obj).mo31392b(this.f201230b, this.f201231c, this.f201232d);
            default:
                return ((xnd0) obj).mo31407q(this.f201230b, this.f201231c, this.f201232d);
        }
    }
}
