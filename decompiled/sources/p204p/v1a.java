package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p000.C0112c;

/* JADX INFO: loaded from: classes.dex */
public final class v1a implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f236302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f236303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f236304c;

    public /* synthetic */ v1a(int i, Object obj, Object obj2) {
        this.f236302a = i;
        this.f236303b = obj;
        this.f236304c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m84455b(int i, fbk fbkVar) {
        as41 as41Var;
        if (fbkVar instanceof as41) {
            as41Var = (as41) fbkVar;
            int i2 = as41Var.f19297c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                as41Var.f19297c = i2 - Integer.MIN_VALUE;
            } else {
                as41Var = new as41(this, fbkVar);
            }
        } else {
            as41Var = new as41(this, fbkVar);
        }
        Object obj = as41Var.f19295a;
        int i3 = as41Var.f19297c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        if (i > 0) {
            nlv0 nlv0Var = (nlv0) this.f236304c;
            if (!nlv0Var.f155174a) {
                nlv0Var.f155174a = true;
                niz nizVar = (niz) this.f236303b;
                as41Var.f19297c = 1;
                Object objEmit = nizVar.emit(ff11.f68880a, as41Var);
                yuk yukVar = yuk.f276404a;
                if (objEmit == yukVar) {
                    return yukVar;
                }
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m84456c(xx11 xx11Var, fbk fbkVar) {
        kx11 kx11Var;
        if (fbkVar instanceof kx11) {
            kx11Var = (kx11) fbkVar;
            int i = kx11Var.f127311d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kx11Var.f127311d = i - Integer.MIN_VALUE;
            } else {
                kx11Var = new kx11(this, fbkVar);
            }
        } else {
            kx11Var = new kx11(this, fbkVar);
        }
        Object obj = kx11Var.f127309b;
        int i2 = kx11Var.f127311d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            di41 di41Var = (di41) this.f236303b;
            kx11Var.f127308a = xx11Var;
            kx11Var.f127311d = 1;
            if (qlg1.m73213r(di41Var, kx11Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            xx11Var = kx11Var.f127308a;
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        sir0 sir0Var = (sir0) this.f236304c;
        kx11Var.f127308a = null;
        kx11Var.f127311d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (r15 == r10) goto L26;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m84457d(ob71 ob71Var, fbk fbkVar) {
        ndy0 ndy0Var;
        plv0 plv0Var = (plv0) this.f236304c;
        ody0 ody0Var = (ody0) this.f236303b;
        if (fbkVar instanceof ndy0) {
            ndy0Var = (ndy0) fbkVar;
            int i = ndy0Var.f152870d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndy0Var.f152870d = i - Integer.MIN_VALUE;
            } else {
                ndy0Var = new ndy0(this, fbkVar);
            }
        } else {
            ndy0Var = new ndy0(this, fbkVar);
        }
        ndy0 ndy0Var2 = ndy0Var;
        Object objM74869b = ndy0Var2.f152868b;
        int i2 = ndy0Var2.f152870d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM74869b);
            zv41 zv41Var = ody0Var.f164281j;
            zv41Var.getClass();
            zv41Var.m97091m(null, jdy0.f111410a);
            long j = ((long) plv0Var.f178796a) * 200;
            ndy0Var2.f152867a = ob71Var;
            ndy0Var2.f152870d = 1;
            if (njg1.m64619l(j, ndy0Var2) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            ob71Var = ndy0Var2.f152867a;
            bga.m29073P(objM74869b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ob71Var = ndy0Var2.f152867a;
            bga.m29073P(objM74869b);
        }
        t391 t391Var = (t391) objM74869b;
        if (t391Var instanceof r391) {
            zv41 zv41Var2 = ody0Var.f164281j;
            kdy0 kdy0Var = new kdy0((r391) t391Var, ob71Var);
            zv41Var2.getClass();
            zv41Var2.m97091m(null, kdy0Var);
            plv0Var.f178796a = 0;
        } else {
            if (!(t391Var instanceof p391)) {
                throw new NoWhenBranchMatchedException();
            }
            zv41 zv41Var3 = ody0Var.f164281j;
            zv41Var3.getClass();
            zv41Var3.m97091m(null, idy0.f101273a);
        }
        return w2a1.f247311a;
        plv0Var.f178796a++;
        List listM66625a = ob71Var.m66625a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM66625a, 10));
        Iterator it = ((ArrayList) listM66625a).iterator();
        while (it.hasNext()) {
            arrayList.add(((ib71) it.next()).m50170a());
        }
        r6q r6qVar = ody0Var.f164274c;
        String str = ody0Var.f164275d;
        Long l = ody0Var.f164276e;
        n391 n391Var = ody0Var.f164277f;
        ndy0Var2.f152867a = ob71Var;
        ndy0Var2.f152870d = 2;
        objM74869b = r6qVar.m74869b(arrayList, str, l, n391Var, ndy0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:146:0x033a  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:213:0x044a  */
    /* JADX WARN: Code duplicated, block: B:275:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:295:0x0606  */
    /* JADX WARN: Code duplicated, block: B:318:0x0670  */
    /* JADX WARN: Code duplicated, block: B:346:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:374:0x077c  */
    /* JADX WARN: Code duplicated, block: B:376:0x0786  */
    /* JADX WARN: Code duplicated, block: B:377:0x0788 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x078a  */
    /* JADX WARN: Code duplicated, block: B:380:0x0796  */
    /* JADX WARN: Code duplicated, block: B:381:0x0798  */
    /* JADX WARN: Code duplicated, block: B:390:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, p.th00] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        u1a u1aVar;
        niz nizVar;
        Set setM32321t;
        Set set;
        int i;
        int iOrdinal;
        y4j y4jVar;
        q5m q5mVar;
        zuo zuoVar;
        niz nizVar2;
        int i2;
        p2p p2pVar;
        vkx vkxVar;
        akz akzVar;
        ukz ukzVar;
        glz glzVar;
        niz nizVar3;
        int i3;
        llz llzVar;
        qyk0 qyk0Var;
        o1w0 o1w0Var;
        Object v1w0Var;
        loe1 loe1Var;
        Object obj2 = obj;
        switch (this.f236302a) {
            case 0:
                if (fbkVar instanceof u1a) {
                    u1aVar = (u1a) fbkVar;
                    int i4 = u1aVar.f225731b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        u1aVar.f225731b = i4 - Integer.MIN_VALUE;
                    } else {
                        u1aVar = new u1a(this, fbkVar);
                    }
                } else {
                    u1aVar = new u1a(this, fbkVar);
                }
                Object objM86755t = u1aVar.f225730a;
                int i5 = u1aVar.f225731b;
                yuk yukVar = yuk.f276404a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i = u1aVar.f225733d;
                        setM32321t = u1aVar.f225736g;
                        set = u1aVar.f225735f;
                        nizVar = u1aVar.f225732c;
                        bga.m29073P(objM86755t);
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86755t);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM86755t);
                nizVar = (niz) this.f236303b;
                pqm0 pqm0Var = (pqm0) obj2;
                Map map = (Map) pqm0Var.f180350a;
                Map map2 = (Map) pqm0Var.f180351b;
                setM32321t = cct.m32321t(map);
                Set setM32321t2 = cct.m32321t(map2);
                zv41 zv41Var = ((x1a) this.f236304c).f257114f;
                u1aVar.f225732c = nizVar;
                u1aVar.f225735f = setM32321t2;
                u1aVar.f225736g = setM32321t;
                u1aVar.f225733d = 0;
                u1aVar.f225731b = 1;
                objM86755t = vyf1.m86755t(zv41Var, u1aVar);
                if (objM86755t == yukVar) {
                    return yukVar;
                }
                set = setM32321t2;
                i = 0;
                yk91 yk91Var = new yk91(setM32321t, set, objM86755t);
                u1aVar.f225732c = null;
                u1aVar.f225735f = null;
                u1aVar.f225736g = null;
                u1aVar.f225733d = i;
                u1aVar.f225731b = 2;
                if (nizVar.emit(yk91Var, u1aVar) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            case 1:
                pqm0 pqm0Var2 = (pqm0) obj2;
                q7b q7bVar = (q7b) this.f236303b;
                Context context = q7bVar.f186061b;
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = (ComponentName) this.f236304c;
                fv31 fv31Var = q7b.f186059e;
                i4t0 i4t0Var = q7bVar.f186062c;
                int i6 = 2;
                try {
                    if (context.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionCode >= ((Number) pqm0Var2.f180351b).intValue()) {
                        iOrdinal = ((cy3) pqm0Var2.f180350a).ordinal();
                        if (iOrdinal == 0) {
                            i6 = 1;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((hv31) i4t0Var.get()).mo48713h(fv31Var, false)) {
                                i6 = 1;
                            }
                        }
                    } else if (((hv31) i4t0Var.get()).mo48713h(fv31Var, false)) {
                        iOrdinal = ((cy3) pqm0Var2.f180350a).ordinal();
                        if (iOrdinal == 0) {
                            i6 = 1;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((hv31) i4t0Var.get()).mo48713h(fv31Var, false)) {
                                i6 = 1;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                packageManager.setComponentEnabledSetting(componentName, i6, 1);
                return w2a1.f247311a;
            case 2:
                ((Boolean) obj2).getClass();
                ((eri0) this.f236303b).m39809a((String) this.f236304c);
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof y4j) {
                    y4jVar = (y4j) fbkVar;
                    int i7 = y4jVar.f269155b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        y4jVar.f269155b = i7 - Integer.MIN_VALUE;
                    } else {
                        y4jVar = new y4j(this, fbkVar);
                    }
                } else {
                    y4jVar = new y4j(this, fbkVar);
                }
                Object obj3 = y4jVar.f269154a;
                int i8 = y4jVar.f269155b;
                if (i8 == 0) {
                    bga.m29073P(obj3);
                    niz nizVar4 = (niz) this.f236303b;
                    Boolean boolM74178H = qyg1.m74178H(((zmn0) this.f236304c).f284322b && ((a5j) obj2) != a5j.f12524a);
                    y4jVar.f269155b = 1;
                    Object objEmit = nizVar4.emit(boolM74178H, y4jVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof q5m) {
                    q5mVar = (q5m) fbkVar;
                    int i9 = q5mVar.f185565b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        q5mVar.f185565b = i9 - Integer.MIN_VALUE;
                    } else {
                        q5mVar = new q5m(this, fbkVar);
                    }
                } else {
                    q5mVar = new q5m(this, fbkVar);
                }
                Object obj4 = q5mVar.f185564a;
                int i10 = q5mVar.f185565b;
                if (i10 == 0) {
                    bga.m29073P(obj4);
                    niz nizVar5 = (niz) this.f236303b;
                    Set set2 = ((z4m) obj2).f279296a;
                    boolean z = false;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (wj50.m88271j((String) it.next(), ((j5m) this.f236304c).f109004c)) {
                                z = true;
                            }
                        }
                    }
                    Boolean boolM74178H2 = qyg1.m74178H(z);
                    q5mVar.f185565b = 1;
                    Object objEmit2 = nizVar5.emit(boolM74178H2, q5mVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit2 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof zuo) {
                    zuoVar = (zuo) fbkVar;
                    int i11 = zuoVar.f286478b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        zuoVar.f286478b = i11 - Integer.MIN_VALUE;
                    } else {
                        zuoVar = new zuo(this, fbkVar);
                    }
                } else {
                    zuoVar = new zuo(this, fbkVar);
                }
                Object objM86441c = zuoVar.f286477a;
                int i12 = zuoVar.f286478b;
                yuk yukVar4 = yuk.f276404a;
                if (i12 != 0) {
                    if (i12 == 1) {
                        i2 = zuoVar.f286480d;
                        nizVar2 = zuoVar.f286479c;
                        bga.m29073P(objM86441c);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86441c);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM86441c);
                nizVar2 = (niz) this.f236303b;
                vuo vuoVar = ((avo) this.f236304c).f20226c;
                zuoVar.f286479c = nizVar2;
                zuoVar.f286480d = 0;
                zuoVar.f286478b = 1;
                objM86441c = vuoVar.m86441c((List) obj2, zuoVar);
                if (objM86441c == yukVar4) {
                    return yukVar4;
                }
                i2 = 0;
                zuoVar.f286479c = null;
                zuoVar.f286480d = i2;
                zuoVar.f286478b = 2;
                if (nizVar2.emit(objM86441c, zuoVar) == yukVar4) {
                    return yukVar4;
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof p2p) {
                    p2pVar = (p2p) fbkVar;
                    int i13 = p2pVar.f173375b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        p2pVar.f173375b = i13 - Integer.MIN_VALUE;
                    } else {
                        p2pVar = new p2p(this, fbkVar);
                    }
                } else {
                    p2pVar = new p2p(this, fbkVar);
                }
                Object obj5 = p2pVar.f173374a;
                int i14 = p2pVar.f173375b;
                if (i14 == 0) {
                    bga.m29073P(obj5);
                    niz nizVar6 = (niz) this.f236303b;
                    Object objM37689x = ((s6x0) obj2).f206218a;
                    if (!(objM37689x instanceof c6x0)) {
                        e3p e3pVar = (e3p) this.f236304c;
                        objM37689x = e3pVar.m37689x(e3pVar.m37669c((rvc) objM37689x));
                    }
                    s6x0 s6x0Var = new s6x0(objM37689x);
                    p2pVar.f173375b = 1;
                    Object objEmit3 = nizVar6.emit(s6x0Var, p2pVar);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit3 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 7:
                ((Number) obj2).doubleValue();
                axi axiVar = (axi) this.f236304c;
                lhq lhqVar = (lhq) this.f236303b;
                x7p x7pVar = lhqVar.f133624e;
                List list = (List) x7pVar.f258964i.f158717a.getValue();
                if (list.isEmpty() || g6f.m43741q0(list) != axiVar) {
                    Object objM43745s0 = g6f.m43745s0(list);
                    Objects.toString(axiVar);
                    Objects.toString(objM43745s0);
                } else if (((Boolean) x7pVar.f258963h.f158717a.getValue()).booleanValue()) {
                    x7q x7qVar = lhqVar.f133629j;
                    if (x7qVar != null) {
                        x7qVar.m90160a();
                    }
                    lhqVar.f133629j = null;
                } else {
                    x7q x7qVar2 = lhqVar.f133629j;
                    if (x7qVar2 == null || x7qVar2.m90163d()) {
                        api apiVarM77296c = ((s5p) ((voi) lhqVar.f133620a.get())).m77296c();
                        if (apiVarM77296c != null) {
                            lhqVar.f133629j = ((h7p) lhqVar.f133621b.get()).m46778d(new nvi(new g2q(3, lhqVar, apiVarM77296c)), new lvi(), Long.valueOf(lhqVar.f133625f.m31321a()));
                        }
                    } else {
                        x7q x7qVar3 = lhqVar.f133629j;
                        if (x7qVar3 != null) {
                            x7qVar3.m90167h();
                        }
                    }
                }
                return w2a1.f247311a;
            case 8:
                b650 b650Var = (b650) obj2;
                ArrayList arrayList = (ArrayList) this.f236303b;
                if (b650Var instanceof wds) {
                    arrayList.add(b650Var);
                } else if (b650Var instanceof xds) {
                    arrayList.remove(((xds) b650Var).m90429a());
                } else if (b650Var instanceof vds) {
                    arrayList.remove(((vds) b650Var).m85268a());
                }
                ((kqi0) this.f236304c).setValue(qyg1.m74178H(!arrayList.isEmpty()));
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof vkx) {
                    vkxVar = (vkx) fbkVar;
                    int i15 = vkxVar.f242307b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        vkxVar.f242307b = i15 - Integer.MIN_VALUE;
                    } else {
                        vkxVar = new vkx(this, fbkVar);
                    }
                } else {
                    vkxVar = new vkx(this, fbkVar);
                }
                Object obj6 = vkxVar.f242306a;
                int i16 = vkxVar.f242307b;
                if (i16 == 0) {
                    bga.m29073P(obj6);
                    niz nizVar7 = (niz) this.f236303b;
                    Map map3 = (Map) obj2;
                    Set set3 = (Set) this.f236304c;
                    int iM31820L = c95.m31820L(i6f.m49804T(set3, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (Object obj7 : set3) {
                        Boolean bool = (Boolean) map3.get((String) obj7);
                        linkedHashMap.put(obj7, new ojo(qyg1.m74178H(bool != null ? bool.booleanValue() : false)));
                    }
                    vkxVar.f242307b = 1;
                    Object objEmit4 = nizVar7.emit(linkedHashMap, vkxVar);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit4 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof akz) {
                    akzVar = (akz) fbkVar;
                    int i17 = akzVar.f16682c;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        akzVar.f16682c = i17 - Integer.MIN_VALUE;
                    } else {
                        akzVar = new akz(this, fbkVar);
                    }
                } else {
                    akzVar = new akz(this, fbkVar);
                }
                Object obj8 = akzVar.f16680a;
                int i18 = akzVar.f16682c;
                try {
                    if (i18 == 0) {
                        bga.m29073P(obj8);
                        niz nizVar8 = (niz) this.f236303b;
                        akzVar.f16682c = 1;
                        Object objEmit5 = nizVar8.emit(obj2, akzVar);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit5 == yukVar7) {
                            return yukVar7;
                        }
                    } else {
                        if (i18 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj8);
                    }
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    ((rlv0) this.f236304c).f200373a = th;
                    throw th;
                }
            case 11:
                if (fbkVar instanceof ukz) {
                    ukzVar = (ukz) fbkVar;
                    int i19 = ukzVar.f231393b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ukzVar.f231393b = i19 - Integer.MIN_VALUE;
                    } else {
                        ukzVar = new ukz(this, fbkVar);
                    }
                } else {
                    ukzVar = new ukz(this, fbkVar);
                }
                Object objInvoke = ukzVar.f231392a;
                int i20 = ukzVar.f231393b;
                if (i20 == 0) {
                    bga.m29073P(objInvoke);
                    th00 th00Var = (th00) this.f236303b;
                    ukzVar.f231395d = obj2;
                    ukzVar.f231393b = 1;
                    objInvoke = th00Var.invoke(obj2, ukzVar);
                    yuk yukVar8 = yuk.f276404a;
                    if (objInvoke == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = ukzVar.f231395d;
                    bga.m29073P(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return w2a1.f247311a;
                }
                ((rlv0) this.f236304c).f200373a = obj2;
                throw new AbortFlowException(this);
            case 12:
                if (fbkVar instanceof glz) {
                    glzVar = (glz) fbkVar;
                    int i21 = glzVar.f81228b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        glzVar.f81228b = i21 - Integer.MIN_VALUE;
                    } else {
                        glzVar = new glz(this, fbkVar);
                    }
                } else {
                    glzVar = new glz(this, fbkVar);
                }
                Object obj9 = glzVar.f81227a;
                int i22 = glzVar.f81228b;
                yuk yukVar9 = yuk.f276404a;
                if (i22 != 0) {
                    if (i22 == 1) {
                        int i23 = glzVar.f81232f;
                        nizVar3 = glzVar.f81231e;
                        Object obj10 = glzVar.f81230d;
                        bga.m29073P(obj9);
                        i3 = i23;
                        obj2 = obj10;
                    } else {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj9);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj9);
                nizVar3 = (niz) this.f236303b;
                glzVar.f81230d = obj2;
                glzVar.f81231e = nizVar3;
                i3 = 0;
                glzVar.f81232f = 0;
                glzVar.f81228b = 1;
                if (this.f236304c.invoke(obj2, glzVar) == yukVar9) {
                    return yukVar9;
                }
                glzVar.f81230d = null;
                glzVar.f81231e = null;
                glzVar.f81232f = i3;
                glzVar.f81228b = 2;
                if (nizVar3.emit(obj2, glzVar) == yukVar9) {
                    return yukVar9;
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof llz) {
                    llzVar = (llz) fbkVar;
                    int i24 = llzVar.f134724c;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        llzVar.f134724c = i24 - Integer.MIN_VALUE;
                    } else {
                        llzVar = new llz(this, fbkVar);
                    }
                } else {
                    llzVar = new llz(this, fbkVar);
                }
                Object obj11 = llzVar.f134722a;
                int i25 = llzVar.f134724c;
                if (i25 == 0) {
                    bga.m29073P(obj11);
                    niz nizVar9 = (niz) this.f236303b;
                    plv0 plv0Var = (plv0) this.f236304c;
                    int i26 = plv0Var.f178796a;
                    plv0Var.f178796a = i26 + 1;
                    if (i26 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    bo40 bo40Var = new bo40(i26, obj2);
                    llzVar.f134724c = 1;
                    Object objEmit6 = nizVar9.emit(bo40Var, llzVar);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit6 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 14:
                i420 i420Var = (i420) obj2;
                if (!(i420Var instanceof g420)) {
                    if (i420Var instanceof f420) {
                        ((zv41) this.f236303b).m97090l(opo.m67574x(((f420) i420Var).m40704a()));
                    } else if (i420Var instanceof h420) {
                        a420 a420Var = (a420) this.f236304c;
                        fbk fbkVar2 = null;
                        x0h1.m89578u(n5h1.m63737m(a420Var.f12121f.f47583d.f68149c), null, 0, new dbz(((h420) i420Var).m46617a(), a420Var, fbkVar2, fbkVar2, 21), 3);
                    } else if (!(i420Var instanceof e420)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return w2a1.f247311a;
            case 15:
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                ((kqi0) this.f236303b).setValue(bool2);
                ((kqi0) this.f236304c).setValue(Boolean.TRUE);
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof qyk0) {
                    qyk0Var = (qyk0) fbkVar;
                    int i27 = qyk0Var.f193920b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        qyk0Var.f193920b = i27 - Integer.MIN_VALUE;
                    } else {
                        qyk0Var = new qyk0(this, fbkVar);
                    }
                } else {
                    qyk0Var = new qyk0(this, fbkVar);
                }
                Object obj12 = qyk0Var.f193919a;
                int i28 = qyk0Var.f193920b;
                if (i28 == 0) {
                    bga.m29073P(obj12);
                    niz nizVar10 = (niz) this.f236303b;
                    r1l0 r1l0Var = (r1l0) obj2;
                    wj50.m88279p(r1l0Var);
                    List listM46716M = h6f.m46716M(uqe1.m83777p(r1l0Var, ((tyk0) this.f236304c).f224998c));
                    qyk0Var.f193920b = 1;
                    Object objEmit7 = nizVar10.emit(listM46716M, qyk0Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit7 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 17:
                xre xreVar = (xre) this.f236304c;
                if (fbkVar instanceof o1w0) {
                    o1w0Var = (o1w0) fbkVar;
                    int i29 = o1w0Var.f160871b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        o1w0Var.f160871b = i29 - Integer.MIN_VALUE;
                    } else {
                        o1w0Var = new o1w0(this, fbkVar);
                    }
                } else {
                    o1w0Var = new o1w0(this, fbkVar);
                }
                Object obj13 = o1w0Var.f160870a;
                int i30 = o1w0Var.f160871b;
                if (i30 == 0) {
                    bga.m29073P(obj13);
                    niz nizVar11 = (niz) this.f236303b;
                    PlayerState playerState = (PlayerState) obj2;
                    if (!playerState.track().mo49279c()) {
                        v1w0Var = new v1w0(playerState.contextUri());
                    } else if (!playerState.isPlaying() || playerState.isPaused()) {
                        String strContextUri = playerState.contextUri();
                        String strUri = ((ContextTrack) playerState.track().mo49278b()).uri();
                        ((wy3) xreVar).getClass();
                        v1w0Var = new w1w0(strContextUri, ((Number) playerState.position(System.currentTimeMillis()).mo49280e(qyg1.m74181K(0L))).longValue(), ((Number) playerState.duration().mo49280e(qyg1.m74181K(0L))).longValue(), strUri);
                    } else {
                        String strContextUri2 = playerState.contextUri();
                        String strUri2 = ((ContextTrack) playerState.track().mo49278b()).uri();
                        ((wy3) xreVar).getClass();
                        v1w0Var = new x1w0(strContextUri2, ((Number) playerState.position(System.currentTimeMillis()).mo49280e(qyg1.m74181K(0L))).longValue(), ((Number) playerState.duration().mo49280e(qyg1.m74181K(0L))).longValue(), strUri2);
                    }
                    o1w0Var.f160871b = 1;
                    Object objEmit8 = nizVar11.emit(v1w0Var, o1w0Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit8 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 18:
                return m84457d((ob71) obj2, fbkVar);
            case 19:
                return m84456c((xx11) obj2, fbkVar);
            case 20:
                return m84455b(((Number) obj2).intValue(), fbkVar);
            case 21:
                xuk xukVar = (xuk) this.f236303b;
                b650 b650Var2 = (b650) obj2;
                gw4 gw4Var = (gw4) this.f236304c;
                fbk fbkVar3 = null;
                if (b650Var2 instanceof gpz) {
                    x0h1.m89578u(xukVar, null, 4, new C0112c(gw4Var, fbkVar3, 24), 1);
                } else if (b650Var2 instanceof hpz) {
                    x0h1.m89578u(xukVar, null, 4, new C0112c(gw4Var, fbkVar3, 25), 1);
                }
                return w2a1.f247311a;
            case 22:
                b650 b650Var3 = (b650) obj2;
                wh71 wh71Var = (wh71) this.f236304c;
                plv0 plv0Var2 = (plv0) this.f236303b;
                if (b650Var3 instanceof m3r0) {
                    plv0Var2.f178796a++;
                } else if ((b650Var3 instanceof n3r0) || (b650Var3 instanceof l3r0)) {
                    plv0Var2.f178796a--;
                }
                boolean z2 = plv0Var2.f178796a > 0;
                if (wh71Var.f251277P0 != z2) {
                    wh71Var.f251277P0 = z2;
                    bxg1.m30835l(wh71Var);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof loe1) {
                    loe1Var = (loe1) fbkVar;
                    int i31 = loe1Var.f135419b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        loe1Var.f135419b = i31 - Integer.MIN_VALUE;
                    } else {
                        loe1Var = new loe1(this, fbkVar);
                    }
                } else {
                    loe1Var = new loe1(this, fbkVar);
                }
                Object obj14 = loe1Var.f135418a;
                int i32 = loe1Var.f135419b;
                if (i32 == 0) {
                    bga.m29073P(obj14);
                    niz nizVar12 = (niz) this.f236303b;
                    ArrayList<pqm0> arrayListM43746s1 = g6f.m43746s1((ArrayList) this.f236304c, ((CollectionPlatformEsperantoContainsResponse) obj2).m6873o().m6864p());
                    int iM31820L2 = c95.m31820L(i6f.m49804T(arrayListM43746s1, 10));
                    if (iM31820L2 < 16) {
                        iM31820L2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2);
                    for (pqm0 pqm0Var3 : arrayListM43746s1) {
                        pqm0 pqm0VarM69840u = pft0.m69840u(pqm0Var3.f180350a, pqm0Var3.f180351b);
                        linkedHashMap2.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
                    }
                    loe1Var.f135419b = 1;
                    Object objEmit9 = nizVar12.emit(linkedHashMap2, loe1Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit9 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
        }
    }

    public v1a(nlv0 nlv0Var, niz nizVar) {
        this.f236302a = 20;
        this.f236304c = nlv0Var;
        this.f236303b = nizVar;
    }
}
