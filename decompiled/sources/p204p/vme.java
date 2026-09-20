package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes3.dex */
public final class vme implements jn80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242793a;

    /* JADX INFO: renamed from: b */
    public final Object f242794b;

    public /* synthetic */ vme(Object obj, int i) {
        this.f242793a = i;
        this.f242794b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[PHI: r5
      0x0088: PHI (r5v2 p.s50) = (r5v0 p.s50), (r5v5 p.s50) binds: [B:26:0x0062, B:31:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    @Override // p204p.jn80
    /* JADX INFO: renamed from: a */
    public final Object mo33757a(s50 s50Var, fbk fbkVar) {
        g3m d3mVar;
        g3m g3mVar;
        j0w j0wVar;
        g3m b3mVar;
        g3m e3mVar;
        switch (this.f242793a) {
            case 0:
                ure ureVar = (ure) this.f242794b;
                if (s50Var.f205672c) {
                    g3mVar = c3m.f33702a;
                } else {
                    if (s50Var.f205673d.f67160a) {
                        ureVar.getClass();
                        d3mVar = new e3m("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
                    } else {
                        ureVar.getClass();
                        d3mVar = new d3m("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
                    }
                    g3mVar = d3mVar;
                }
                return new t50(g3mVar, s50Var.f205670a);
            case 1:
                if (fbkVar instanceof j0w) {
                    j0wVar = (j0w) fbkVar;
                    int i = j0wVar.f107570d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j0wVar.f107570d = i - Integer.MIN_VALUE;
                    } else {
                        j0wVar = new j0w(this, (ibk) fbkVar);
                    }
                } else {
                    j0wVar = new j0w(this, (ibk) fbkVar);
                }
                Object objM96567o = j0wVar.f107568b;
                int i2 = j0wVar.f107570d;
                if (i2 == 0) {
                    bga.m29073P(objM96567o);
                    if (!s50Var.f205672c) {
                        Single singleM35687a = ((dcz) this.f242794b).m35687a();
                        j0wVar.f107567a = s50Var;
                        j0wVar.f107570d = 1;
                        objM96567o = zn91.m96567o(singleM35687a, j0wVar);
                        yuk yukVar = yuk.f276404a;
                        if (objM96567o == yukVar) {
                            return yukVar;
                        }
                    } else if (s50Var.f205672c) {
                        b3mVar = c3m.f33702a;
                    } else if (s50Var.f205674e) {
                        b3mVar = y2m.f268641a;
                    } else {
                        b3mVar = x2m.f257521a;
                    }
                    return new t50(b3mVar, s50Var.f205670a);
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s50Var = j0wVar.f107567a;
                bga.m29073P(objM96567o);
                if (((Boolean) objM96567o).booleanValue()) {
                    b3mVar = new b3m(null);
                } else if (s50Var.f205672c) {
                    b3mVar = c3m.f33702a;
                } else if (s50Var.f205674e) {
                    b3mVar = y2m.f268641a;
                } else {
                    b3mVar = x2m.f257521a;
                }
                return new t50(b3mVar, s50Var.f205670a);
            default:
                if (s50Var.f205672c) {
                    e3mVar = c3m.f33702a;
                } else {
                    ((pne1) this.f242794b).getClass();
                    e3mVar = s50Var.f205674e ? new e3m("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") : new d3m("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt");
                }
                return new t50(e3mVar, s50Var.f205670a);
        }
    }
}
