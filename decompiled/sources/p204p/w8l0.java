package p204p;

import com.spotify.on_demand_set.proto.ResponseStatus;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: classes7.dex */
public final class w8l0 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x8l0 f248951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ResponseStatus f248952c;

    public /* synthetic */ w8l0(x8l0 x8l0Var, ResponseStatus responseStatus, int i) {
        this.f248950a = i;
        this.f248951b = x8l0Var;
        this.f248952c = responseStatus;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        switch (this.f248950a) {
            case 0:
                return x8l0.m90213a(this.f248951b, "Set", this.f248952c.m16225o());
            default:
                return x8l0.m90213a(this.f248951b, "Temporary", this.f248952c.m16225o());
        }
    }
}
