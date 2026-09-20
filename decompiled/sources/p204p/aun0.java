package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class aun0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cun0 f19988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ExternalAccessoryDescription f19989c;

    public /* synthetic */ aun0(cun0 cun0Var, ExternalAccessoryDescription externalAccessoryDescription, int i) {
        this.f19987a = i;
        this.f19988b = cun0Var;
        this.f19989c = externalAccessoryDescription;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f19987a) {
            case 0:
                this.f19988b.f42171j.put(this.f19989c, (oyx) obj);
                break;
            default:
                this.f19988b.f42171j.put(this.f19989c, (oyx) ((pqm0) obj).f180350a);
                break;
        }
    }
}
