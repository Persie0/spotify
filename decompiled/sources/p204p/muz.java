package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class muz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f147457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ buz f147458c;

    public /* synthetic */ muz(niz nizVar, buz buzVar, int i) {
        this.f147456a = i;
        this.f147457b = nizVar;
        this.f147458c = buzVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        luz luzVar;
        nuz nuzVar;
        switch (this.f147456a) {
            case 0:
                if (fbkVar instanceof luz) {
                    luzVar = (luz) fbkVar;
                    int i = luzVar.f137176b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        luzVar.f137176b = i - Integer.MIN_VALUE;
                    } else {
                        luzVar = new luz(this, fbkVar);
                    }
                } else {
                    luzVar = new luz(this, fbkVar);
                }
                Object obj2 = luzVar.f137175a;
                int i2 = luzVar.f137176b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    y5f y5fVar = (y5f) ((Map) obj).get(this.f147458c.f31242a);
                    Boolean boolValueOf = Boolean.valueOf(y5fVar != null ? y5fVar.f269418b : false);
                    luzVar.f137176b = 1;
                    Object objEmit = this.f147457b.emit(boolValueOf, luzVar);
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
                if (fbkVar instanceof nuz) {
                    nuzVar = (nuz) fbkVar;
                    int i3 = nuzVar.f158742b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nuzVar.f158742b = i3 - Integer.MIN_VALUE;
                    } else {
                        nuzVar = new nuz(this, fbkVar);
                    }
                } else {
                    nuzVar = new nuz(this, fbkVar);
                }
                Object obj3 = nuzVar.f158741a;
                int i4 = nuzVar.f158742b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(((z4m) obj).f279296a.contains(this.f147458c.f31242a));
                    nuzVar.f158742b = 1;
                    Object objEmit2 = this.f147457b.emit(boolValueOf2, nuzVar);
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
