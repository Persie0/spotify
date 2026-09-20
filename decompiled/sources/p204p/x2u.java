package p204p;

import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeDelayErrorIterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public final class x2u implements s4u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257561a = 0;

    /* JADX INFO: renamed from: b */
    public final om0 f257562b;

    /* JADX INFO: renamed from: c */
    public final Object f257563c;

    /* JADX INFO: renamed from: d */
    public final Object f257564d;

    public x2u(kkx0 kkx0Var, om0 om0Var, hu3 hu3Var) {
        this.f257563c = kkx0Var;
        this.f257562b = om0Var;
        this.f257564d = hu3Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:2: B:57:0x00ff->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // p204p.s4u
    /* JADX INFO: renamed from: a */
    public final Object mo43764a(fh0 fh0Var, fbk fbkVar) {
        w2u w2uVar;
        Object c6x0Var;
        Iterator it;
        Object objM96565n;
        yuk yukVar;
        c6x0 c6x0Var2;
        String str;
        switch (this.f257561a) {
            case 0:
                if (fbkVar instanceof w2u) {
                    w2uVar = (w2u) fbkVar;
                    int i = w2uVar.f247428d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        w2uVar.f247428d = i - Integer.MIN_VALUE;
                    } else {
                        w2uVar = new w2u(this, (ibk) fbkVar);
                    }
                } else {
                    w2uVar = new w2u(this, (ibk) fbkVar);
                }
                Object obj = w2uVar.f247426b;
                int i2 = w2uVar.f247428d;
                Object c6x0Var3 = w2a1.f247311a;
                int i3 = 1;
                try {
                    if (i2 == 0) {
                        bga.m29073P(obj);
                        List listM42663w = ftg1.m42663w(fh0Var);
                        ArrayList arrayList = new ArrayList(i6f.m49804T(listM42663w, 10));
                        Iterator it2 = listM42663w.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new CompletableDefer(new ve0(3, this, (ci0) it2.next())));
                        }
                        if (listM42663w.isEmpty()) {
                            i3 = 6;
                        } else if (listM42663w.isEmpty()) {
                            if (!listM42663w.isEmpty()) {
                                it = listM42663w.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((ci0) it.next()).f38170d.mo29281g()) {
                                            CompletableMergeDelayErrorIterable completableMergeDelayErrorIterable = new CompletableMergeDelayErrorIterable(arrayList);
                                            w2uVar.f247425a = fh0Var;
                                            w2uVar.f247428d = 1;
                                            objM96565n = zn91.m96565n(completableMergeDelayErrorIterable, w2uVar);
                                            yukVar = yuk.f276404a;
                                            if (objM96565n == yukVar) {
                                                return yukVar;
                                            }
                                        }
                                    }
                                }
                            }
                            i3 = 7;
                        } else {
                            Iterator it3 = listM42663w.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    if (!listM42663w.isEmpty()) {
                                        it = listM42663w.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((ci0) it.next()).f38170d.mo29281g()) {
                                                    CompletableMergeDelayErrorIterable completableMergeDelayErrorIterable2 = new CompletableMergeDelayErrorIterable(arrayList);
                                                    w2uVar.f247425a = fh0Var;
                                                    w2uVar.f247428d = 1;
                                                    objM96565n = zn91.m96565n(completableMergeDelayErrorIterable2, w2uVar);
                                                    yukVar = yuk.f276404a;
                                                    if (objM96565n == yukVar) {
                                                        return yukVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = 7;
                                } else if (((ci0) it3.next()).f38167a.length() == 0) {
                                    i3 = 5;
                                }
                            }
                        }
                        if (i3 != 0) {
                            om0.m67311c(this.f257562b, qm0.ERROR, fh0Var.f69506a, null, AbstractC0000a.m7f(i3), null, null, null, 116);
                            c6x0Var3 = new c6x0(new IllegalStateException("Ad Carousel Failed to Prerender"));
                        }
                        return c6x0Var3;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fh0Var = w2uVar.f247425a;
                    bga.m29073P(obj);
                    c6x0Var = c6x0Var3;
                    break;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (!(c6x0Var instanceof c6x0)) {
                    i3 = 0;
                }
                if (i3 != 0) {
                    om0.m67311c(this.f257562b, qm0.ERROR, fh0Var.f69506a, null, AbstractC0000a.m7f(i3), null, null, null, 116);
                    c6x0Var3 = new c6x0(new IllegalStateException("Ad Carousel Failed to Prerender"));
                }
                return c6x0Var3;
            default:
                ed30 ed30Var = (ed30) g6f.m43745s0(fh0Var.f69513g.f24221c);
                if (ed30Var == null || (str = ed30Var.f58432c) == null || str.length() == 0) {
                    om0.m67310a(this.f257562b, qm0.ERROR, fh0Var.f69506a, null, "missing_creative", null, 116);
                    c6x0Var2 = new c6x0(new IllegalStateException("HTML Ad Failed to Prerender: missing creative"));
                } else {
                    if (ed30Var.f58430a > 0 && ed30Var.f58431b > 0) {
                        return w2a1.f247311a;
                    }
                    om0.m67310a(this.f257562b, qm0.ERROR, fh0Var.f69506a, null, "dimensions_error", null, 116);
                    c6x0Var2 = new c6x0(new IllegalStateException("HTML Ad Failed to Prerender: invalid dimensions"));
                }
                return c6x0Var2;
        }
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: b */
    public final vh00 mo43765b() {
        switch (this.f257561a) {
            case 0:
                return new svr(this, 15);
            default:
                return new svr(this, 17);
        }
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: c */
    public final boolean mo43766c(fh0 fh0Var) {
        switch (this.f257561a) {
            case 0:
                return wj50.m88271j(fh0Var.f69497U0, "npv_carousel");
            default:
                return ((hu3) this.f257564d).m48596b() && ((ed30) g6f.m43745s0(fh0Var.f69513g.f24221c)) != null;
        }
    }

    public x2u(e940 e940Var, z9t z9tVar, om0 om0Var) {
        this.f257563c = e940Var;
        this.f257564d = z9tVar;
        this.f257562b = om0Var;
    }
}
