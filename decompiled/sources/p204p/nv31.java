package p204p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class nv31 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f158778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wb11 f158779b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f158780c;

    public /* synthetic */ nv31(wb11 wb11Var, Context context, int i) {
        this.f158778a = i;
        this.f158779b = wb11Var;
        this.f158780c = context;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f158778a) {
            case 0:
                return this.f158779b.mo35842b(this.f158780c, (String) obj);
            default:
                return this.f158779b.mo35842b(this.f158780c, (String) obj);
        }
    }
}
