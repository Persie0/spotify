package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qmz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f190434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f190435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f190436c;

    public qmz(niz nizVar, String str, boolean z) {
        this.f190434a = nizVar;
        this.f190435b = str;
        this.f190436c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        pmz pmzVar;
        if (fbkVar instanceof pmz) {
            pmzVar = (pmz) fbkVar;
            int i = pmzVar.f179259b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmzVar.f179259b = i - Integer.MIN_VALUE;
            } else {
                pmzVar = new pmz(this, fbkVar);
            }
        } else {
            pmzVar = new pmz(this, fbkVar);
        }
        Object obj2 = pmzVar.f179258a;
        int i2 = pmzVar.f179259b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Boolean boolM74178H = qyg1.m74178H(gwg1.m45948t((String) ((Map) obj).get(this.f190435b), this.f190436c));
            pmzVar.f179259b = 1;
            Object objEmit = this.f190434a.emit(boolM74178H, pmzVar);
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
    }
}
