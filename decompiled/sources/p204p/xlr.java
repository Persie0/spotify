package p204p;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xlr implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f263227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cdn f263228c;

    public /* synthetic */ xlr(niz nizVar, cdn cdnVar, int i) {
        this.f263226a = i;
        this.f263227b = nizVar;
        this.f263228c = cdnVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        wlr wlrVar;
        zlr zlrVar;
        switch (this.f263226a) {
            case 0:
                if (fbkVar instanceof wlr) {
                    wlrVar = (wlr) fbkVar;
                    int i = wlrVar.f252603b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wlrVar.f252603b = i - Integer.MIN_VALUE;
                    } else {
                        wlrVar = new wlr(this, fbkVar);
                    }
                } else {
                    wlrVar = new wlr(this, fbkVar);
                }
                Object obj2 = wlrVar.f252602a;
                int i2 = wlrVar.f252603b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    long jMo48712g = ((hv31) obj).mo48712g((fv31) this.f263228c.f36915b, 0L);
                    Boolean boolValueOf = Boolean.valueOf(jMo48712g == 0 || System.currentTimeMillis() - jMo48712g > TimeUnit.DAYS.toMillis(30L));
                    wlrVar.f252603b = 1;
                    Object objEmit = this.f263227b.emit(boolValueOf, wlrVar);
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
                if (fbkVar instanceof zlr) {
                    zlrVar = (zlr) fbkVar;
                    int i3 = zlrVar.f284058b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zlrVar.f284058b = i3 - Integer.MIN_VALUE;
                    } else {
                        zlrVar = new zlr(this, fbkVar);
                    }
                } else {
                    zlrVar = new zlr(this, fbkVar);
                }
                Object obj3 = zlrVar.f284057a;
                int i4 = zlrVar.f284058b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    cdn cdnVar = this.f263228c;
                    hv31 hv31VarMo35842b = ((wb11) cdnVar.f36917d).mo35842b((Context) cdnVar.f36916c, ((e301) obj).f55571a);
                    zlrVar.f284058b = 1;
                    Object objEmit2 = this.f263227b.emit(hv31VarMo35842b, zlrVar);
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
