package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class q1a implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f184274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x1a f184275c;

    public /* synthetic */ q1a(niz nizVar, x1a x1aVar, int i) {
        this.f184273a = i;
        this.f184274b = nizVar;
        this.f184275c = x1aVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        p1a p1aVar;
        t1a t1aVar;
        w1a w1aVar;
        niz nizVar;
        int i;
        switch (this.f184273a) {
            case 0:
                if (fbkVar instanceof p1a) {
                    p1aVar = (p1a) fbkVar;
                    int i2 = p1aVar.f173012b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        p1aVar.f173012b = i2 - Integer.MIN_VALUE;
                    } else {
                        p1aVar = new p1a(this, fbkVar);
                    }
                } else {
                    p1aVar = new p1a(this, fbkVar);
                }
                Object obj2 = p1aVar.f173011a;
                int i3 = p1aVar.f173012b;
                if (i3 == 0) {
                    bga.m29073P(obj2);
                    znj0 znj0Var = (znj0) obj;
                    boolean zM88271j = wj50.m88271j(znj0Var, wnj0.f253196a);
                    ynj0 ynj0Var = ynj0.f274464a;
                    if (zM88271j) {
                        if (!((Map) this.f184275c.f257113e.getValue()).containsKey("social_radar")) {
                            znj0Var = ynj0Var;
                        }
                    } else if (!(znj0Var instanceof xnj0) && !wj50.m88271j(znj0Var, ynj0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p1aVar.f173012b = 1;
                    Object objEmit = this.f184274b.emit(znj0Var, p1aVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof t1a) {
                    t1aVar = (t1a) fbkVar;
                    int i4 = t1aVar.f216202b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        t1aVar.f216202b = i4 - Integer.MIN_VALUE;
                    } else {
                        t1aVar = new t1a(this, fbkVar);
                    }
                } else {
                    t1aVar = new t1a(this, fbkVar);
                }
                Object obj3 = t1aVar.f216201a;
                int i5 = t1aVar.f216202b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    UUID uuid = ((o1a) obj).f160679b.getUuid();
                    Set set = (Set) ((Map) this.f184275c.f257113e.getValue()).get("social_radar");
                    if (set != null) {
                        Set set2 = set;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                if (wj50.m88271j(((oc8) it.next()).getUuid(), uuid)) {
                                    t1aVar.f216202b = 1;
                                    Object objEmit2 = this.f184274b.emit(obj, t1aVar);
                                    yuk yukVar2 = yuk.f276404a;
                                    if (objEmit2 == yukVar2) {
                                        return yukVar2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof w1a) {
                    w1aVar = (w1a) fbkVar;
                    int i6 = w1aVar.f247036b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        w1aVar.f247036b = i6 - Integer.MIN_VALUE;
                    } else {
                        w1aVar = new w1a(this, fbkVar);
                    }
                } else {
                    w1aVar = new w1a(this, fbkVar);
                }
                Object objM86755t = w1aVar.f247035a;
                int i7 = w1aVar.f247036b;
                yuk yukVar3 = yuk.f276404a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        int i8 = w1aVar.f247039e;
                        nizVar = w1aVar.f247038d;
                        Object obj4 = w1aVar.f247037c;
                        bga.m29073P(objM86755t);
                        i = i8;
                        obj = obj4;
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86755t);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM86755t);
                zv41 zv41Var = this.f184275c.f257112d;
                w1aVar.f247037c = obj;
                nizVar = this.f184274b;
                w1aVar.f247038d = nizVar;
                i = 0;
                w1aVar.f247039e = 0;
                w1aVar.f247036b = 1;
                objM86755t = vyf1.m86755t(zv41Var, w1aVar);
                if (objM86755t == yukVar3) {
                    return yukVar3;
                }
                boolean zContains = ((Set) objM86755t).contains("social_radar");
                if (!zContains) {
                    na6.m63957e("Received update for social_radar which isn't enabled");
                }
                if (zContains) {
                    w1aVar.f247037c = null;
                    w1aVar.f247038d = null;
                    w1aVar.f247039e = i;
                    w1aVar.f247036b = 2;
                    if (nizVar.emit(obj, w1aVar) == yukVar3) {
                        return yukVar3;
                    }
                }
                return w2a1.f247311a;
        }
    }
}
