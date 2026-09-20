package p204p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionAddRemoveItem;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class ud80 {

    /* JADX INFO: renamed from: a */
    public final Context f229196a;

    /* JADX INFO: renamed from: b */
    public final yz80 f229197b;

    /* JADX INFO: renamed from: c */
    public final mi80 f229198c;

    /* JADX INFO: renamed from: d */
    public final n5f f229199d;

    /* JADX INFO: renamed from: e */
    public final luk f229200e;

    /* JADX INFO: renamed from: f */
    public final xul0 f229201f;

    /* JADX INFO: renamed from: g */
    public final wg61 f229202g = new wg61(new ag70(this, 18));

    /* JADX INFO: renamed from: h */
    public final wg61 f229203h = new wg61(C2087le.f132393W0);

    public ud80(Context context, yz80 yz80Var, mi80 mi80Var, n5f n5fVar, luk lukVar, xul0 xul0Var) {
        this.f229196a = context;
        this.f229197b = yz80Var;
        this.f229198c = mi80Var;
        this.f229199d = n5fVar;
        this.f229200e = lukVar;
        this.f229201f = xul0Var;
    }

    /* JADX INFO: renamed from: b */
    public static Object m82840b(ud80 ud80Var, String str, boolean z, fbk fbkVar, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        ud80Var.getClass();
        Object objM82843a = ud80Var.m82843a(geg1.m44518y(str), fbkVar, z);
        return objM82843a == yuk.f276404a ? objM82843a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m82841d(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            e0f e0fVarM97432p = CollectionAddRemoveItem.m97432p();
            e0fVarM97432p.m37493q(str);
            arrayList.add((CollectionAddRemoveItem) e0fVarM97432p.build());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static Object m82842g(ud80 ud80Var, String str, boolean z, fbk fbkVar, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        ud80Var.getClass();
        Object objM82846f = ud80Var.m82846f(geg1.m44518y(str), fbkVar, z);
        return objM82846f == yuk.f276404a ? objM82846f : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m82843a(List list, fbk fbkVar, boolean z) throws Throwable {
        od80 od80Var;
        List list2;
        boolean z2;
        List list3;
        nd80 nd80Var;
        List list4;
        Enum enumM82845e;
        nd80 nd80Var2;
        List list5;
        boolean z3;
        nd80 nd80Var3;
        gn80 gn80Var;
        gn80 gn80Var2;
        wg61 wg61Var;
        x3f x3fVar;
        CompletableSubscribeOn completableSubscribeOnM89789b;
        x3f x3fVar2;
        if (fbkVar instanceof od80) {
            od80Var = (od80) fbkVar;
            int i = od80Var.f164129g;
            if ((i & Integer.MIN_VALUE) != 0) {
                od80Var.f164129g = i - Integer.MIN_VALUE;
            } else {
                od80Var = new od80(this, fbkVar);
            }
        } else {
            od80Var = new od80(this, fbkVar);
        }
        Object objM82844c = od80Var.f164127e;
        int i2 = od80Var.f164129g;
        nd80 nd80Var4 = nd80.f152702a;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar2 = null;
        Enum r10 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = od80Var.f164126d;
                List list6 = od80Var.f164124b;
                list2 = od80Var.f164123a;
                bga.m29073P(objM82844c);
                z2 = z4;
                list3 = list6;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM82844c);
                    return w2a1Var;
                }
                z3 = od80Var.f164126d;
                nd80Var2 = od80Var.f164125c;
                list5 = od80Var.f164123a;
                bga.m29073P(objM82844c);
            }
            nd80Var3 = (nd80) objM82844c;
            z2 = z3;
            list2 = list5;
            if (nd80Var3 == nd80Var4 && nd80Var2 == nd80Var4 && z2) {
                Set set = dd41.f47702f;
                gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                gn80Var2 = gn80.TRACK;
                wg61Var = this.f229202g;
                if (gn80Var == gn80Var2) {
                    x3fVar2 = (x3f) wg61Var.getValue();
                    if (x3fVar2 != null) {
                        completableSubscribeOnM89789b = x3fVar2.m89788a();
                    } else {
                        completableSubscribeOnM89789b = null;
                    }
                } else {
                    x3fVar = (x3f) wg61Var.getValue();
                    if (x3fVar != null) {
                        completableSubscribeOnM89789b = x3fVar.m89789b();
                    } else {
                        completableSubscribeOnM89789b = null;
                    }
                }
                if (completableSubscribeOnM89789b != null) {
                    od80Var.f164123a = null;
                    od80Var.f164124b = null;
                    od80Var.f164125c = null;
                    od80Var.f164126d = z2;
                    od80Var.f164129g = 3;
                    if (zn91.m96565n(completableSubscribeOnM89789b, od80Var) == r10) {
                        return r10;
                    }
                }
            }
            return w2a1Var;
        }
        bga.m29073P(objM82844c);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                List list7 = (List) this.f229203h.getValue();
                Set set2 = dd41.f47702f;
                if (!list7.contains(r46.m74726U((String) obj).f47709c)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ydj.m93454m("Add does not support the following uris ", g6f.m43753y0(arrayList, null, null, null, null, 63));
                return w2a1Var;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Set set3 = dd41.f47702f;
                if (r46.m74726U((String) obj2).f47709c == gn80.TRACK) {
                    arrayList2.add(obj2);
                } else {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                list2 = list;
                z2 = z;
                nd80Var = nd80Var4;
                list4 = arrayList3;
                if (list4.isEmpty()) {
                    nd80Var2 = nd80Var;
                    nd80Var3 = nd80Var4;
                    if (nd80Var3 == nd80Var4) {
                        Set set4 = dd41.f47702f;
                        gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                        gn80Var2 = gn80.TRACK;
                        wg61Var = this.f229202g;
                        if (gn80Var == gn80Var2) {
                            x3fVar2 = (x3f) wg61Var.getValue();
                            if (x3fVar2 != null) {
                                completableSubscribeOnM89789b = x3fVar2.m89788a();
                            } else {
                                completableSubscribeOnM89789b = null;
                            }
                        } else {
                            x3fVar = (x3f) wg61Var.getValue();
                            if (x3fVar != null) {
                                completableSubscribeOnM89789b = x3fVar.m89789b();
                            } else {
                                completableSubscribeOnM89789b = null;
                            }
                        }
                        if (completableSubscribeOnM89789b != null) {
                            od80Var.f164123a = null;
                            od80Var.f164124b = null;
                            od80Var.f164125c = null;
                            od80Var.f164126d = z2;
                            od80Var.f164129g = 3;
                            if (zn91.m96565n(completableSubscribeOnM89789b, od80Var) == r10) {
                            }
                        }
                    }
                } else {
                    gh00 pd80Var = new pd80(this, list4, fbkVar2, 0);
                    od80Var.f164123a = list2;
                    od80Var.f164124b = null;
                    od80Var.f164125c = nd80Var;
                    od80Var.f164126d = z2;
                    od80Var.f164129g = 2;
                    enumM82845e = m82845e(pd80Var, od80Var);
                    if (enumM82845e != r10) {
                        nd80Var2 = nd80Var;
                        objM82844c = enumM82845e;
                        list5 = list2;
                        z3 = z2;
                        nd80Var3 = (nd80) objM82844c;
                        z2 = z3;
                        list2 = list5;
                        if (nd80Var3 == nd80Var4) {
                            Set set5 = dd41.f47702f;
                            gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                            gn80Var2 = gn80.TRACK;
                            wg61Var = this.f229202g;
                            if (gn80Var == gn80Var2) {
                                x3fVar2 = (x3f) wg61Var.getValue();
                                if (x3fVar2 != null) {
                                    completableSubscribeOnM89789b = x3fVar2.m89788a();
                                } else {
                                    completableSubscribeOnM89789b = null;
                                }
                            } else {
                                x3fVar = (x3f) wg61Var.getValue();
                                if (x3fVar != null) {
                                    completableSubscribeOnM89789b = x3fVar.m89789b();
                                } else {
                                    completableSubscribeOnM89789b = null;
                                }
                            }
                            if (completableSubscribeOnM89789b != null) {
                                od80Var.f164123a = null;
                                od80Var.f164124b = null;
                                od80Var.f164125c = null;
                                od80Var.f164126d = z2;
                                od80Var.f164129g = 3;
                                if (zn91.m96565n(completableSubscribeOnM89789b, od80Var) == r10) {
                                }
                            }
                        }
                    }
                }
            } else {
                list2 = list;
                od80Var.f164123a = list2;
                od80Var.f164124b = arrayList3;
                z2 = z;
                od80Var.f164126d = z2;
                od80Var.f164129g = 1;
                objM82844c = m82844c(arrayList2, od80Var);
                if (objM82844c != r10) {
                    list3 = arrayList3;
                }
            }
            return r10;
        }
        return w2a1Var;
        nd80Var = (nd80) objM82844c;
        list4 = list3;
        if (list4.isEmpty()) {
            nd80Var2 = nd80Var;
            nd80Var3 = nd80Var4;
            if (nd80Var3 == nd80Var4) {
                Set set6 = dd41.f47702f;
                gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                gn80Var2 = gn80.TRACK;
                wg61Var = this.f229202g;
                if (gn80Var == gn80Var2) {
                    x3fVar2 = (x3f) wg61Var.getValue();
                    if (x3fVar2 != null) {
                        completableSubscribeOnM89789b = x3fVar2.m89788a();
                    } else {
                        completableSubscribeOnM89789b = null;
                    }
                } else {
                    x3fVar = (x3f) wg61Var.getValue();
                    if (x3fVar != null) {
                        completableSubscribeOnM89789b = x3fVar.m89789b();
                    } else {
                        completableSubscribeOnM89789b = null;
                    }
                }
                if (completableSubscribeOnM89789b != null) {
                    od80Var.f164123a = null;
                    od80Var.f164124b = null;
                    od80Var.f164125c = null;
                    od80Var.f164126d = z2;
                    od80Var.f164129g = 3;
                    if (zn91.m96565n(completableSubscribeOnM89789b, od80Var) == r10) {
                    }
                }
            }
            return w2a1Var;
        }
        gh00 pd80Var2 = new pd80(this, list4, fbkVar2, 0);
        od80Var.f164123a = list2;
        od80Var.f164124b = null;
        od80Var.f164125c = nd80Var;
        od80Var.f164126d = z2;
        od80Var.f164129g = 2;
        enumM82845e = m82845e(pd80Var2, od80Var);
        if (enumM82845e != r10) {
            nd80Var2 = nd80Var;
            objM82844c = enumM82845e;
            list5 = list2;
            z3 = z2;
            nd80Var3 = (nd80) objM82844c;
            z2 = z3;
            list2 = list5;
            if (nd80Var3 == nd80Var4) {
                Set set7 = dd41.f47702f;
                gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                gn80Var2 = gn80.TRACK;
                wg61Var = this.f229202g;
                if (gn80Var == gn80Var2) {
                    x3fVar2 = (x3f) wg61Var.getValue();
                    if (x3fVar2 != null) {
                        completableSubscribeOnM89789b = x3fVar2.m89788a();
                    } else {
                        completableSubscribeOnM89789b = null;
                    }
                } else {
                    x3fVar = (x3f) wg61Var.getValue();
                    if (x3fVar != null) {
                        completableSubscribeOnM89789b = x3fVar.m89789b();
                    } else {
                        completableSubscribeOnM89789b = null;
                    }
                }
                if (completableSubscribeOnM89789b != null) {
                    od80Var.f164123a = null;
                    od80Var.f164124b = null;
                    od80Var.f164125c = null;
                    od80Var.f164126d = z2;
                    od80Var.f164129g = 3;
                    if (zn91.m96565n(completableSubscribeOnM89789b, od80Var) == r10) {
                    }
                }
            }
            return w2a1Var;
        }
        return r10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Enum m82844c(List list, ibk ibkVar) {
        qd80 qd80Var;
        Object c6x0Var;
        if (ibkVar instanceof qd80) {
            qd80Var = (qd80) ibkVar;
            int i = qd80Var.f187508c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qd80Var.f187508c = i - Integer.MIN_VALUE;
            } else {
                qd80Var = new qd80(this, ibkVar);
            }
        } else {
            qd80Var = new qd80(this, ibkVar);
        }
        qd80 qd80Var2 = qd80Var;
        Object objM63309f = qd80Var2.f187506a;
        int i2 = qd80Var2.f187508c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM63309f);
                this.f229198c.getClass();
                yz80 yz80Var = this.f229197b;
                qd80Var2.f187508c = 1;
                objM63309f = ((n090) yz80Var).m63309f("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", list, "", "", null, qd80Var2);
                yuk yukVar = yuk.f276404a;
                if (objM63309f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63309f);
            }
            c6x0Var = (p2x0) objM63309f;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        nd80 nd80Var = nd80.f152703b;
        if (thM77348a != null) {
            return nd80Var;
        }
        p2x0 p2x0Var = (p2x0) c6x0Var;
        s380 s380Var = s380.f205212T0;
        p2x0Var.getClass();
        if (p2x0Var instanceof k2x0) {
            return nd80Var;
        }
        if (!(p2x0Var instanceof m2x0)) {
            throw new NoWhenBranchMatchedException();
        }
        s380Var.invoke(((m2x0) p2x0Var).f139474a);
        return nd80.f152702a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Enum m82845e(gh00 gh00Var, ibk ibkVar) throws Throwable {
        rd80 rd80Var;
        if (ibkVar instanceof rd80) {
            rd80Var = (rd80) ibkVar;
            int i = rd80Var.f198063c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd80Var.f198063c = i - Integer.MIN_VALUE;
            } else {
                rd80Var = new rd80(this, ibkVar);
            }
        } else {
            rd80Var = new rd80(this, ibkVar);
        }
        Object objM89557A = rd80Var.f198061a;
        int i2 = rd80Var.f198063c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            lem lemVar = new lem(gh00Var, (fbk) null, 2);
            rd80Var.f198063c = 1;
            objM89557A = x0h1.m89557A(this.f229200e, lemVar, rd80Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        Object obj = ((s6x0) objM89557A).f206218a;
        if (s6x0.m77348a(obj) == null) {
            b450 b450VarM85217a = vd80.m85217a();
            int i3 = b450VarM85217a.f278778a;
            int i4 = b450VarM85217a.f278779b;
            int iM97550o = ((CollectionAddRemoveItemsResponse) obj).m97438n().m97550o();
            if (i3 <= iM97550o && iM97550o <= i4) {
                return nd80.f152702a;
            }
        }
        return nd80.f152703b;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m82846f(List list, fbk fbkVar, boolean z) throws Throwable {
        sd80 sd80Var;
        List list2;
        boolean z2;
        nd80 nd80Var;
        List list3;
        Enum enumM82845e;
        nd80 nd80Var2;
        List list4;
        nd80 nd80Var3;
        List list5;
        gn80 gn80Var;
        gn80 gn80Var2;
        wg61 wg61Var;
        x3f x3fVar;
        CompletableSubscribeOn completableSubscribeOnM89792e;
        x3f x3fVar2;
        if (fbkVar instanceof sd80) {
            sd80Var = (sd80) fbkVar;
            int i = sd80Var.f207948g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sd80Var.f207948g = i - Integer.MIN_VALUE;
            } else {
                sd80Var = new sd80(this, fbkVar);
            }
        } else {
            sd80Var = new sd80(this, fbkVar);
        }
        Object objM82847h = sd80Var.f207946e;
        int i2 = sd80Var.f207948g;
        int i3 = 1;
        nd80 nd80Var4 = nd80.f152702a;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar2 = null;
        Enum r10 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = sd80Var.f207945d;
                List list6 = sd80Var.f207943b;
                list2 = sd80Var.f207942a;
                bga.m29073P(objM82847h);
                list5 = list6;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM82847h);
                    return w2a1Var;
                }
                z2 = sd80Var.f207945d;
                nd80Var2 = sd80Var.f207944c;
                list4 = sd80Var.f207942a;
                bga.m29073P(objM82847h);
            }
            nd80Var3 = (nd80) objM82847h;
            list2 = list4;
            if (nd80Var3 == nd80Var4 && nd80Var2 == nd80Var4 && z2) {
                Set set = dd41.f47702f;
                gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                gn80Var2 = gn80.TRACK;
                wg61Var = this.f229202g;
                if (gn80Var == gn80Var2) {
                    x3fVar2 = (x3f) wg61Var.getValue();
                    if (x3fVar2 != null) {
                        completableSubscribeOnM89792e = x3fVar2.m89791d();
                    } else {
                        completableSubscribeOnM89792e = null;
                    }
                } else {
                    x3fVar = (x3f) wg61Var.getValue();
                    if (x3fVar != null) {
                        completableSubscribeOnM89792e = x3fVar.m89792e();
                    } else {
                        completableSubscribeOnM89792e = null;
                    }
                }
                if (completableSubscribeOnM89792e != null) {
                    sd80Var.f207942a = null;
                    sd80Var.f207943b = null;
                    sd80Var.f207944c = null;
                    sd80Var.f207945d = z2;
                    sd80Var.f207948g = 3;
                    if (zn91.m96565n(completableSubscribeOnM89792e, sd80Var) == r10) {
                        return r10;
                    }
                }
            }
            return w2a1Var;
        }
        bga.m29073P(objM82847h);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                List list7 = (List) this.f229203h.getValue();
                Set set2 = dd41.f47702f;
                if (!list7.contains(r46.m74726U((String) obj).f47709c)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ydj.m93454m("Remove does not support the following uris ", g6f.m43753y0(arrayList, null, null, null, null, 63));
                return w2a1Var;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Set set3 = dd41.f47702f;
                if (r46.m74726U((String) obj2).f47709c == gn80.TRACK) {
                    arrayList2.add(obj2);
                } else {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                list2 = list;
                z2 = z;
                nd80Var = nd80Var4;
                list3 = arrayList3;
                if (list3.isEmpty()) {
                    nd80Var2 = nd80Var;
                    nd80Var3 = nd80Var4;
                    if (nd80Var3 == nd80Var4) {
                        Set set4 = dd41.f47702f;
                        gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                        gn80Var2 = gn80.TRACK;
                        wg61Var = this.f229202g;
                        if (gn80Var == gn80Var2) {
                            x3fVar2 = (x3f) wg61Var.getValue();
                            if (x3fVar2 != null) {
                                completableSubscribeOnM89792e = x3fVar2.m89791d();
                            } else {
                                completableSubscribeOnM89792e = null;
                            }
                        } else {
                            x3fVar = (x3f) wg61Var.getValue();
                            if (x3fVar != null) {
                                completableSubscribeOnM89792e = x3fVar.m89792e();
                            } else {
                                completableSubscribeOnM89792e = null;
                            }
                        }
                        if (completableSubscribeOnM89792e != null) {
                            sd80Var.f207942a = null;
                            sd80Var.f207943b = null;
                            sd80Var.f207944c = null;
                            sd80Var.f207945d = z2;
                            sd80Var.f207948g = 3;
                            if (zn91.m96565n(completableSubscribeOnM89792e, sd80Var) == r10) {
                            }
                        }
                    }
                } else {
                    gh00 pd80Var = new pd80(this, list3, fbkVar2, i3);
                    sd80Var.f207942a = list2;
                    sd80Var.f207943b = null;
                    sd80Var.f207944c = nd80Var;
                    sd80Var.f207945d = z2;
                    sd80Var.f207948g = 2;
                    enumM82845e = m82845e(pd80Var, sd80Var);
                    if (enumM82845e != r10) {
                        nd80Var2 = nd80Var;
                        objM82847h = enumM82845e;
                        list4 = list2;
                        nd80Var3 = (nd80) objM82847h;
                        list2 = list4;
                        if (nd80Var3 == nd80Var4) {
                            Set set5 = dd41.f47702f;
                            gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                            gn80Var2 = gn80.TRACK;
                            wg61Var = this.f229202g;
                            if (gn80Var == gn80Var2) {
                                x3fVar2 = (x3f) wg61Var.getValue();
                                if (x3fVar2 != null) {
                                    completableSubscribeOnM89792e = x3fVar2.m89791d();
                                } else {
                                    completableSubscribeOnM89792e = null;
                                }
                            } else {
                                x3fVar = (x3f) wg61Var.getValue();
                                if (x3fVar != null) {
                                    completableSubscribeOnM89792e = x3fVar.m89792e();
                                } else {
                                    completableSubscribeOnM89792e = null;
                                }
                            }
                            if (completableSubscribeOnM89792e != null) {
                                sd80Var.f207942a = null;
                                sd80Var.f207943b = null;
                                sd80Var.f207944c = null;
                                sd80Var.f207945d = z2;
                                sd80Var.f207948g = 3;
                                if (zn91.m96565n(completableSubscribeOnM89792e, sd80Var) == r10) {
                                }
                            }
                        }
                    }
                }
            } else {
                sd80Var.f207942a = list;
                sd80Var.f207943b = arrayList3;
                sd80Var.f207945d = z;
                sd80Var.f207948g = 1;
                objM82847h = m82847h(arrayList2, sd80Var);
                if (objM82847h != r10) {
                    list2 = list;
                    z2 = z;
                    list5 = arrayList3;
                }
            }
            return r10;
        }
        return w2a1Var;
        nd80Var = (nd80) objM82847h;
        list3 = list5;
        if (list3.isEmpty()) {
            nd80Var2 = nd80Var;
            nd80Var3 = nd80Var4;
            if (nd80Var3 == nd80Var4) {
                Set set6 = dd41.f47702f;
                gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                gn80Var2 = gn80.TRACK;
                wg61Var = this.f229202g;
                if (gn80Var == gn80Var2) {
                    x3fVar2 = (x3f) wg61Var.getValue();
                    if (x3fVar2 != null) {
                        completableSubscribeOnM89792e = x3fVar2.m89791d();
                    } else {
                        completableSubscribeOnM89792e = null;
                    }
                } else {
                    x3fVar = (x3f) wg61Var.getValue();
                    if (x3fVar != null) {
                        completableSubscribeOnM89792e = x3fVar.m89792e();
                    } else {
                        completableSubscribeOnM89792e = null;
                    }
                }
                if (completableSubscribeOnM89792e != null) {
                    sd80Var.f207942a = null;
                    sd80Var.f207943b = null;
                    sd80Var.f207944c = null;
                    sd80Var.f207945d = z2;
                    sd80Var.f207948g = 3;
                    if (zn91.m96565n(completableSubscribeOnM89792e, sd80Var) == r10) {
                    }
                }
            }
            return w2a1Var;
        }
        gh00 pd80Var2 = new pd80(this, list3, fbkVar2, i3);
        sd80Var.f207942a = list2;
        sd80Var.f207943b = null;
        sd80Var.f207944c = nd80Var;
        sd80Var.f207945d = z2;
        sd80Var.f207948g = 2;
        enumM82845e = m82845e(pd80Var2, sd80Var);
        if (enumM82845e != r10) {
            nd80Var2 = nd80Var;
            objM82847h = enumM82845e;
            list4 = list2;
            nd80Var3 = (nd80) objM82847h;
            list2 = list4;
            if (nd80Var3 == nd80Var4) {
                Set set7 = dd41.f47702f;
                gn80Var = r46.m74726U((String) g6f.m43741q0(list2)).f47709c;
                gn80Var2 = gn80.TRACK;
                wg61Var = this.f229202g;
                if (gn80Var == gn80Var2) {
                    x3fVar2 = (x3f) wg61Var.getValue();
                    if (x3fVar2 != null) {
                        completableSubscribeOnM89792e = x3fVar2.m89791d();
                    } else {
                        completableSubscribeOnM89792e = null;
                    }
                } else {
                    x3fVar = (x3f) wg61Var.getValue();
                    if (x3fVar != null) {
                        completableSubscribeOnM89792e = x3fVar.m89792e();
                    } else {
                        completableSubscribeOnM89792e = null;
                    }
                }
                if (completableSubscribeOnM89792e != null) {
                    sd80Var.f207942a = null;
                    sd80Var.f207943b = null;
                    sd80Var.f207944c = null;
                    sd80Var.f207945d = z2;
                    sd80Var.f207948g = 3;
                    if (zn91.m96565n(completableSubscribeOnM89792e, sd80Var) == r10) {
                    }
                }
            }
            return w2a1Var;
        }
        return r10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Enum m82847h(List list, ibk ibkVar) {
        td80 td80Var;
        Object c6x0Var;
        if (ibkVar instanceof td80) {
            td80Var = (td80) ibkVar;
            int i = td80Var.f219263c;
            if ((i & Integer.MIN_VALUE) != 0) {
                td80Var.f219263c = i - Integer.MIN_VALUE;
            } else {
                td80Var = new td80(this, ibkVar);
            }
        } else {
            td80Var = new td80(this, ibkVar);
        }
        Object objM63317n = td80Var.f219261a;
        int i2 = td80Var.f219263c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM63317n);
                yz80 yz80Var = this.f229197b;
                this.f229198c.getClass();
                td80Var.f219263c = 1;
                objM63317n = ((n090) yz80Var).m63317n("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", list, td80Var);
                yuk yukVar = yuk.f276404a;
                if (objM63317n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63317n);
            }
            c6x0Var = (p2x0) objM63317n;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        nd80 nd80Var = nd80.f152703b;
        if (thM77348a != null) {
            return nd80Var;
        }
        p2x0 p2x0Var = (p2x0) c6x0Var;
        s380 s380Var = s380.f205213U0;
        p2x0Var.getClass();
        if (p2x0Var instanceof k2x0) {
            return nd80Var;
        }
        if (!(p2x0Var instanceof m2x0)) {
            throw new NoWhenBranchMatchedException();
        }
        s380Var.invoke(((m2x0) p2x0Var).f139474a);
        return nd80.f152702a;
    }
}
