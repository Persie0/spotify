package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ker implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f121935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ddr f121936c;

    public /* synthetic */ ker(niz nizVar, uer uerVar, ddr ddrVar, int i) {
        this.f121934a = i;
        this.f121935b = nizVar;
        this.f121936c = ddrVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jer jerVar;
        mer merVar;
        per perVar;
        qer qerVar;
        switch (this.f121934a) {
            case 0:
                if (fbkVar instanceof jer) {
                    jerVar = (jer) fbkVar;
                    int i = jerVar.f111647b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jerVar.f111647b = i - Integer.MIN_VALUE;
                    } else {
                        jerVar = new jer(this, fbkVar);
                    }
                } else {
                    jerVar = new jer(this, fbkVar);
                }
                Object obj2 = jerVar.f111646a;
                int i2 = jerVar.f111647b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    dfr dfrVarM82911i = uer.m82911i((ifr) obj, this.f121936c);
                    qcr qcrVarM35903c = dfrVarM82911i != null ? dfrVarM82911i.m35903c() : null;
                    jerVar.f111647b = 1;
                    Object objEmit = this.f121935b.emit(qcrVarM35903c, jerVar);
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
            case 1:
                if (fbkVar instanceof mer) {
                    merVar = (mer) fbkVar;
                    int i3 = merVar.f142828b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        merVar.f142828b = i3 - Integer.MIN_VALUE;
                    } else {
                        merVar = new mer(this, fbkVar);
                    }
                } else {
                    merVar = new mer(this, fbkVar);
                }
                Object obj3 = merVar.f142827a;
                int i4 = merVar.f142828b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    dfr dfrVarM82911i2 = uer.m82911i((ifr) obj, this.f121936c);
                    qcr qcrVarM35903c2 = dfrVarM82911i2 != null ? dfrVarM82911i2.m35903c() : null;
                    merVar.f142828b = 1;
                    Object objEmit2 = this.f121935b.emit(qcrVarM35903c2, merVar);
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
            case 2:
                if (fbkVar instanceof per) {
                    perVar = (per) fbkVar;
                    int i5 = perVar.f176835b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        perVar.f176835b = i5 - Integer.MIN_VALUE;
                    } else {
                        perVar = new per(this, fbkVar);
                    }
                } else {
                    perVar = new per(this, fbkVar);
                }
                Object obj4 = perVar.f176834a;
                int i6 = perVar.f176835b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    dfr dfrVarM82911i3 = uer.m82911i((ifr) obj, this.f121936c);
                    qcr qcrVarM35903c3 = dfrVarM82911i3 != null ? dfrVarM82911i3.m35903c() : null;
                    perVar.f176835b = 1;
                    Object objEmit3 = this.f121935b.emit(qcrVarM35903c3, perVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof qer) {
                    qerVar = (qer) fbkVar;
                    int i7 = qerVar.f188009b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qerVar.f188009b = i7 - Integer.MIN_VALUE;
                    } else {
                        qerVar = new qer(this, fbkVar);
                    }
                } else {
                    qerVar = new qer(this, fbkVar);
                }
                Object obj5 = qerVar.f188008a;
                int i8 = qerVar.f188009b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    dfr dfrVarM82911i4 = uer.m82911i((ifr) obj, this.f121936c);
                    qerVar.f188009b = 1;
                    Object objEmit4 = this.f121935b.emit(dfrVarM82911i4, qerVar);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
        }
    }
}
