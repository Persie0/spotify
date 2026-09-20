package p204p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class wu2 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f255062b;

    public /* synthetic */ wu2(String str, int i) {
        this.f255061a = i;
        this.f255062b = str;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        switch (this.f255061a) {
            case 0:
                break;
        }
        return Single.just(this.f255062b);
    }
}
