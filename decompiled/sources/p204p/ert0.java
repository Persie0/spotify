package p204p;

import com.spotify.player.model.PlayerQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class ert0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f62205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w0p0 f62206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f62207d;

    public /* synthetic */ ert0(niz nizVar, w0p0 w0p0Var, String str, int i) {
        this.f62204a = i;
        this.f62205b = nizVar;
        this.f62206c = w0p0Var;
        this.f62207d = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        drt0 drt0Var;
        grt0 grt0Var;
        switch (this.f62204a) {
            case 0:
                if (fbkVar instanceof drt0) {
                    drt0Var = (drt0) fbkVar;
                    int i = drt0Var.f52387b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        drt0Var.f52387b = i - Integer.MIN_VALUE;
                    } else {
                        drt0Var = new drt0(this, fbkVar);
                    }
                } else {
                    drt0Var = new drt0(this, fbkVar);
                }
                Object obj2 = drt0Var.f52386a;
                int i2 = drt0Var.f52387b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(w0p0.m86957a(this.f62206c, this.f62207d, (PlayerQueue) obj));
                    drt0Var.f52387b = 1;
                    Object objEmit = this.f62205b.emit(boolValueOf, drt0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof grt0) {
                    grt0Var = (grt0) fbkVar;
                    int i3 = grt0Var.f83829b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        grt0Var.f83829b = i3 - Integer.MIN_VALUE;
                    } else {
                        grt0Var = new grt0(this, fbkVar);
                    }
                } else {
                    grt0Var = new grt0(this, fbkVar);
                }
                Object obj3 = grt0Var.f83828a;
                int i4 = grt0Var.f83829b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(w0p0.m86957a(this.f62206c, this.f62207d, (PlayerQueue) obj));
                    grt0Var.f83829b = 1;
                    Object objEmit2 = this.f62205b.emit(boolValueOf2, grt0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
