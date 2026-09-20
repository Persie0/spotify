package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class l5u implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f130007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u5u f130008c;

    public /* synthetic */ l5u(niz nizVar, u5u u5uVar, int i) {
        this.f130006a = i;
        this.f130008c = u5uVar;
        this.f130007b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    /* JADX WARN: Code duplicated, block: B:69:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        k5u k5uVar;
        ef81 ef81Var;
        o5u o5uVar;
        boolean zM48598d;
        q5u q5uVar;
        r5u r5uVar;
        nyt nytVar;
        niz nizVar;
        qs0 qs0Var;
        int i;
        r5u r5uVar2;
        ef81 ef81Var2;
        int i2;
        int i3;
        qs0 qs0Var2;
        pqm0 pqm0Var;
        ef81 ef81Var3;
        int i4 = this.f130006a;
        int i5 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar2 = this.f130007b;
        yuk yukVar = yuk.f276404a;
        u5u u5uVar = this.f130008c;
        switch (i4) {
            case 0:
                if (fbkVar instanceof k5u) {
                    k5uVar = (k5u) fbkVar;
                    int i6 = k5uVar.f119580b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        k5uVar.f119580b = i6 - Integer.MIN_VALUE;
                    } else {
                        k5uVar = new k5u(this, fbkVar);
                    }
                } else {
                    k5uVar = new k5u(this, fbkVar);
                }
                Object obj2 = k5uVar.f119579a;
                int i7 = k5uVar.f119580b;
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                pqm0 pqm0Var2 = (pqm0) obj;
                nyt nytVar2 = (nyt) pqm0Var2.f180350a;
                PlayerState playerState = (PlayerState) pqm0Var2.f180351b;
                boolean z = nytVar2 instanceof kyt;
                qs0 qs0Var3 = qs0.NPV_PAUSE;
                if (z) {
                    if (!playerState.isPaused()) {
                        i5u i5uVar = u5uVar.f227120m;
                        u4u.m82365b(u5uVar.f227113f, 15, (i5uVar == null || !i5uVar.f99024b) ? (i5uVar == null || (ef81Var = i5uVar.f99023a) == null) ? null : ef81Var.f58981a : null, null, null, 12);
                        return w2a1Var;
                    }
                    if (((Boolean) u5uVar.f227117j.getValue()).booleanValue()) {
                        u4u.m82365b(u5uVar.f227113f, 6, null, null, null, 12);
                        pqm0 pqm0Var3 = new pqm0(nytVar2, qs0Var3);
                        k5uVar.f119580b = 2;
                        if (nizVar2.emit(pqm0Var3, k5uVar) != yukVar) {
                            return w2a1Var;
                        }
                    } else {
                        etq etqVar = u5uVar.f227114g;
                        mv0 mv0Var = mv0.f147461b;
                        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                        String strUri = contextTrack != null ? contextTrack.uri() : null;
                        List listSingletonList = Collections.singletonList("ad_active");
                        k5uVar.f119580b = 3;
                        if (etq.m39963x(etqVar, "embedded-npv", strUri, 3, 2, qs0Var3, listSingletonList, k5uVar) != yukVar) {
                            return w2a1Var;
                        }
                    }
                } else {
                    if (!playerState.isPaused()) {
                        return w2a1Var;
                    }
                    pqm0 pqm0Var4 = new pqm0(nytVar2, qs0Var3);
                    k5uVar.f119580b = 1;
                    if (nizVar2.emit(pqm0Var4, k5uVar) != yukVar) {
                        return w2a1Var;
                    }
                }
                return yukVar;
            case 1:
                if (fbkVar instanceof o5u) {
                    o5uVar = (o5u) fbkVar;
                    int i8 = o5uVar.f162095b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        o5uVar.f162095b = i8 - Integer.MIN_VALUE;
                    } else {
                        o5uVar = new o5u(this, fbkVar);
                    }
                } else {
                    o5uVar = new o5u(this, fbkVar);
                }
                Object obj3 = o5uVar.f162094a;
                int i9 = o5uVar.f162095b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                pqm0 pqm0Var5 = (pqm0) obj;
                u5uVar.getClass();
                nyt nytVar3 = (nyt) pqm0Var5.f180350a;
                qs0 qs0Var4 = (qs0) pqm0Var5.f180351b;
                if (nytVar3 instanceof kyt) {
                    hu3 hu3Var = u5uVar.f227115h;
                    int iOrdinal = qs0Var4.ordinal();
                    if (iOrdinal == 0) {
                        zM48598d = true;
                    } else if (iOrdinal == 1) {
                        zM48598d = hu3Var.m48598d();
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                        zM48598d = true;
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM48598d = hu3Var.m48597c();
                    }
                    if (zM48598d) {
                        i5 = 1;
                    }
                }
                if (i5 == 0) {
                    return w2a1Var;
                }
                o5uVar.f162095b = 1;
                return nizVar2.emit(obj, o5uVar) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof q5u) {
                    q5uVar = (q5u) fbkVar;
                    int i10 = q5uVar.f185603b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        q5uVar.f185603b = i10 - Integer.MIN_VALUE;
                    } else {
                        q5uVar = new q5u(this, fbkVar);
                    }
                } else {
                    q5uVar = new q5u(this, fbkVar);
                }
                Object objM82418b = q5uVar.f185602a;
                int i11 = q5uVar.f185603b;
                if (i11 == 0) {
                    bga.m29073P(objM82418b);
                    q5uVar.f185604c = nizVar2;
                    q5uVar.f185605d = 0;
                    q5uVar.f185603b = 1;
                    objM82418b = u5u.m82418b(u5uVar, (pqm0) obj, q5uVar);
                    if (objM82418b != yukVar) {
                    }
                    return yukVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM82418b);
                    return w2a1Var;
                }
                i5 = q5uVar.f185605d;
                nizVar2 = q5uVar.f185604c;
                bga.m29073P(objM82418b);
                q5uVar.f185604c = null;
                q5uVar.f185605d = i5;
                q5uVar.f185603b = 2;
                if (nizVar2.emit(objM82418b, q5uVar) != yukVar) {
                    return w2a1Var;
                }
                return yukVar;
            default:
                if (fbkVar instanceof r5u) {
                    r5uVar = (r5u) fbkVar;
                    int i12 = r5uVar.f196122b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        r5uVar.f196122b = i12 - Integer.MIN_VALUE;
                    } else {
                        r5uVar = new r5u(this, fbkVar);
                    }
                } else {
                    r5uVar = new r5u(this, fbkVar);
                }
                Object objM82417a = r5uVar.f196121a;
                int i13 = r5uVar.f196122b;
                if (i13 == 0) {
                    bga.m29073P(objM82417a);
                    pqm0 pqm0Var6 = (pqm0) obj;
                    nytVar = (nyt) pqm0Var6.f180350a;
                    qs0 qs0Var5 = (qs0) pqm0Var6.f180351b;
                    r5uVar.f196123c = nizVar2;
                    r5uVar.f196126f = nytVar;
                    r5uVar.f196127g = qs0Var5;
                    r5uVar.f196124d = 0;
                    r5uVar.f196129i = 0;
                    r5uVar.f196122b = 1;
                    objM82417a = u5u.m82417a(u5uVar, nytVar, qs0Var5, r5uVar);
                    if (objM82417a != yukVar) {
                        nizVar = nizVar2;
                        qs0Var = qs0Var5;
                        i = 0;
                    }
                    return yukVar;
                }
                if (i13 == 1) {
                    int i14 = r5uVar.f196129i;
                    int i15 = r5uVar.f196124d;
                    qs0Var = r5uVar.f196127g;
                    nytVar = r5uVar.f196126f;
                    nizVar = r5uVar.f196123c;
                    bga.m29073P(objM82417a);
                    i5 = i15;
                    i = i14;
                } else {
                    if (i13 == 2) {
                        int i16 = r5uVar.f196129i;
                        int i17 = r5uVar.f196124d;
                        ef81 ef81Var4 = r5uVar.f196128h;
                        qs0 qs0Var6 = r5uVar.f196127g;
                        nizVar = r5uVar.f196123c;
                        bga.m29073P(objM82417a);
                        r5uVar2 = r5uVar;
                        ef81Var2 = ef81Var4;
                        i2 = i16;
                        i3 = i17;
                        qs0Var2 = qs0Var6;
                        cw0 cw0Var = u5uVar.f227111d;
                        r5uVar2.f196123c = nizVar;
                        r5uVar2.f196126f = null;
                        r5uVar2.f196127g = qs0Var2;
                        r5uVar2.f196128h = ef81Var2;
                        r5uVar2.f196124d = i3;
                        r5uVar2.f196129i = i2;
                        r5uVar2.f196122b = 3;
                        objM82417a = ztg1.m96917h(cw0Var, r5uVar2);
                        if (objM82417a != yukVar) {
                            ef81Var3 = ef81Var2;
                        }
                        return yukVar;
                    }
                    if (i13 != 3) {
                        if (i13 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM82417a);
                        return w2a1Var;
                    }
                    i3 = r5uVar.f196124d;
                    ef81Var3 = r5uVar.f196128h;
                    qs0Var2 = r5uVar.f196127g;
                    niz nizVar3 = r5uVar.f196123c;
                    bga.m29073P(objM82417a);
                    nizVar = nizVar3;
                    r5uVar2 = r5uVar;
                }
                pqm0 pqm0Var7 = new pqm0(new ef81((fh0) objM82417a, ef81Var3.f58982b), qs0Var2);
                i5 = i3;
                pqm0Var = pqm0Var7;
                r5uVar2.f196123c = null;
                r5uVar2.f196126f = null;
                r5uVar2.f196127g = null;
                r5uVar2.f196128h = null;
                r5uVar2.f196124d = i5;
                r5uVar2.f196122b = 4;
                if (nizVar.emit(pqm0Var, r5uVar2) != yukVar) {
                    return w2a1Var;
                }
                return yukVar;
                nyt nytVar4 = nytVar;
                ef81 ef81Var5 = (ef81) objM82417a;
                if (ef81Var5.f58981a == null) {
                    pqm0Var = new pqm0(ef81Var5, qs0Var);
                    r5uVar2 = r5uVar;
                    r5uVar2.f196123c = null;
                    r5uVar2.f196126f = null;
                    r5uVar2.f196127g = null;
                    r5uVar2.f196128h = null;
                    r5uVar2.f196124d = i5;
                    r5uVar2.f196122b = 4;
                    if (nizVar.emit(pqm0Var, r5uVar2) != yukVar) {
                        return w2a1Var;
                    }
                } else {
                    r5uVar.f196123c = nizVar;
                    r5uVar.f196126f = null;
                    r5uVar.f196127g = qs0Var;
                    r5uVar.f196128h = ef81Var5;
                    r5uVar.f196124d = i5;
                    r5uVar.f196129i = i;
                    r5uVar.f196122b = 2;
                    r5u r5uVar3 = r5uVar;
                    qs0 qs0Var7 = qs0Var;
                    r5uVar2 = r5uVar3;
                    if (this.f130008c.m82419c(nytVar4, 1, qs0Var7, null, r5uVar3) != yukVar) {
                        ef81Var2 = ef81Var5;
                        i2 = i;
                        i3 = i5;
                        qs0Var2 = qs0Var7;
                        cw0 cw0Var2 = u5uVar.f227111d;
                        r5uVar2.f196123c = nizVar;
                        r5uVar2.f196126f = null;
                        r5uVar2.f196127g = qs0Var2;
                        r5uVar2.f196128h = ef81Var2;
                        r5uVar2.f196124d = i3;
                        r5uVar2.f196129i = i2;
                        r5uVar2.f196122b = 3;
                        objM82417a = ztg1.m96917h(cw0Var2, r5uVar2);
                        if (objM82417a != yukVar) {
                            ef81Var3 = ef81Var2;
                            pqm0 pqm0Var8 = new pqm0(new ef81((fh0) objM82417a, ef81Var3.f58982b), qs0Var2);
                            i5 = i3;
                            pqm0Var = pqm0Var8;
                            r5uVar2.f196123c = null;
                            r5uVar2.f196126f = null;
                            r5uVar2.f196127g = null;
                            r5uVar2.f196128h = null;
                            r5uVar2.f196124d = i5;
                            r5uVar2.f196122b = 4;
                            if (nizVar.emit(pqm0Var, r5uVar2) != yukVar) {
                                return w2a1Var;
                            }
                        }
                    }
                }
                return yukVar;
        }
    }
}
