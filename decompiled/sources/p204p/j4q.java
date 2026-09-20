package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j4q implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f108759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o4q f108760c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f108761d;

    public /* synthetic */ j4q(niz nizVar, o4q o4qVar, String str, int i) {
        this.f108758a = i;
        this.f108759b = nizVar;
        this.f108760c = o4qVar;
        this.f108761d = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        i4q i4qVar;
        c4q c4qVar;
        k4q k4qVar;
        switch (this.f108758a) {
            case 0:
                if (fbkVar instanceof i4q) {
                    i4qVar = (i4q) fbkVar;
                    int i = i4qVar.f98572b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i4qVar.f98572b = i - Integer.MIN_VALUE;
                    } else {
                        i4qVar = new i4q(this, fbkVar);
                    }
                } else {
                    i4qVar = new i4q(this, fbkVar);
                }
                Object obj2 = i4qVar.f98571a;
                int i2 = i4qVar.f98572b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    qho qhoVar = (qho) obj;
                    if (qhoVar instanceof oho) {
                        c4qVar = (c4q) ((oho) qhoVar).f165512a;
                    } else {
                        c4q c4qVar2 = null;
                        if (qhoVar instanceof nho) {
                            dse1 dse1Var = this.f108760c.f161723c;
                            String str = this.f108761d;
                            if (wj50.m88271j(str, "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ")) {
                                c4qVar2 = new c4q(dse1Var.m36761c(), "https://misc.scdn.co/liked-songs/liked-songs-300.png");
                            } else if (pne1.m70445a(str)) {
                                c4qVar2 = new c4q(dse1Var.m36767i(), "https://misc.spotifycdn.com/your-episodes/SE-300.png");
                            } else {
                                c4qVar = new c4q("", null);
                            }
                            c4qVar = c4qVar2;
                        } else {
                            c4qVar = c4qVar2;
                        }
                    }
                    if (c4qVar != null) {
                        i4qVar.f98572b = 1;
                        Object objEmit = this.f108759b.emit(c4qVar, i4qVar);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof k4q) {
                    k4qVar = (k4q) fbkVar;
                    int i3 = k4qVar.f119294b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k4qVar.f119294b = i3 - Integer.MIN_VALUE;
                    } else {
                        k4qVar = new k4q(this, fbkVar);
                    }
                } else {
                    k4qVar = new k4q(this, fbkVar);
                }
                Object obj3 = k4qVar.f119293a;
                int i4 = k4qVar.f119294b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    z3q z3qVar = new z3q(this.f108760c.f161723c.m36768j(), ((Boolean) obj).booleanValue(), this.f108761d, null, v3q.f236924a);
                    k4qVar.f119294b = 1;
                    Object objEmit2 = this.f108759b.emit(z3qVar, k4qVar);
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
