package p204p;

import com.spotify.promptedplaylists.artifactpage.playlistconfig.PlaylistGenerationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class okp0 implements lk5, j9a1 {

    /* JADX INFO: renamed from: a */
    public final rqs0 f166432a;

    /* JADX INFO: renamed from: b */
    public final yts0 f166433b;

    /* JADX INFO: renamed from: c */
    public final x4j0 f166434c;

    /* JADX INFO: renamed from: d */
    public final oga0 f166435d;

    /* JADX INFO: renamed from: e */
    public final jts0 f166436e;

    public okp0(rqs0 rqs0Var, yts0 yts0Var, x4j0 x4j0Var, oga0 oga0Var, jts0 jts0Var) {
        this.f166432a = rqs0Var;
        this.f166433b = yts0Var;
        this.f166434c = x4j0Var;
        this.f166435d = oga0Var;
        this.f166436e = jts0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: Exception -> 0x0040, CancellationException -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0043, Exception -> 0x0040, blocks: (B:15:0x003b, B:43:0x00e1), top: B:70:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (r11.m66876b(r0, r2, r12, r10) == r14) goto L45;
     */
    @Override // p204p.lk5
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo59216a(y210 y210Var, ibk ibkVar) {
        lkp0 lkp0Var;
        kkp0 kkp0Var;
        zus0 zus0Var;
        String str;
        String str2;
        String str3;
        boolean z;
        rqs0 rqs0Var;
        kkp0 kkp0Var2;
        dvs0 dvs0Var;
        ArrayList arrayList;
        String str4;
        if (ibkVar instanceof lkp0) {
            lkp0Var = (lkp0) ibkVar;
            int i = lkp0Var.f134432t;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkp0Var.f134432t = i - Integer.MIN_VALUE;
            } else {
                lkp0Var = new lkp0(this, ibkVar);
            }
        } else {
            lkp0Var = new lkp0(this, ibkVar);
        }
        lkp0 lkp0Var2 = lkp0Var;
        Object objM76264c = lkp0Var2.f134430h;
        int i2 = lkp0Var2.f134432t;
        oga0 oga0Var = this.f166435d;
        rqs0 rqs0Var2 = this.f166432a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76264c);
                kkp0Var = (kkp0) y210Var;
                String str5 = kkp0Var.f123679a;
                String str6 = kkp0Var.f123681c;
                zus0 zus0Var2 = kkp0Var.f123685g;
                boolean z2 = kkp0Var.f123684f;
                String str7 = kkp0Var.f123683e;
                if (str7 == null) {
                    str7 = "";
                }
                lkp0Var2.f134423a = kkp0Var;
                lkp0Var2.f134424b = rqs0Var2;
                lkp0Var2.f134425c = str5;
                lkp0Var2.f134426d = str6;
                lkp0Var2.f134427e = zus0Var2;
                lkp0Var2.f134428f = str7;
                lkp0Var2.f134429g = z2;
                lkp0Var2.f134432t = 1;
                Object objM66877c = oga0Var.m66877c(lkp0Var2);
                if (objM66877c != yukVar) {
                    zus0Var = zus0Var2;
                    str = str6;
                    str2 = str7;
                    objM76264c = objM66877c;
                    str3 = str5;
                    z = z2;
                    rqs0Var = rqs0Var2;
                }
                return yukVar;
            }
            if (i2 == 1) {
                boolean z3 = lkp0Var2.f134429g;
                String str8 = lkp0Var2.f134428f;
                zus0 zus0Var3 = lkp0Var2.f134427e;
                String str9 = lkp0Var2.f134426d;
                String str10 = lkp0Var2.f134425c;
                rqs0 rqs0Var3 = (rqs0) lkp0Var2.f134424b;
                kkp0Var = lkp0Var2.f134423a;
                bga.m29073P(objM76264c);
                z = z3;
                rqs0Var = rqs0Var3;
                str2 = str8;
                str3 = str10;
                zus0Var = zus0Var3;
                str = str9;
            } else if (i2 == 2) {
                kkp0 kkp0Var3 = lkp0Var2.f134423a;
                bga.m29073P(objM76264c);
                kkp0Var2 = kkp0Var3;
                dvs0Var = (dvs0) objM76264c;
                if (dvs0Var instanceof cvs0) {
                    if (dvs0Var instanceof bvs0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = ((bvs0) dvs0Var).f31426a;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof trs0) {
                            arrayList.add(obj);
                        }
                    }
                    trs0 trs0Var = (trs0) g6f.m43745s0(arrayList);
                    return trs0Var != null ? new mk5(new PlaylistGenerationException(Collections.singletonList(trs0Var))) : new mk5(new PlaylistGenerationException(list));
                }
                str4 = ((cvs0) dvs0Var).f42536b;
                if (str4 == null) {
                    return new mk5(new IllegalStateException("No URI returned for playlist generation"));
                }
                boolean z4 = ((cvs0) dvs0Var).f42537c;
                lkp0Var2.f134423a = kkp0Var2;
                lkp0Var2.f134424b = dvs0Var;
                lkp0Var2.f134425c = str4;
                lkp0Var2.f134432t = 3;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = lkp0Var2.f134425c;
                dvs0Var = (dvs0) lkp0Var2.f134424b;
                kkp0Var2 = lkp0Var2.f134423a;
                bga.m29073P(objM76264c);
            }
            if (!((cvs0) dvs0Var).f42537c) {
                this.f166436e.f115963g.m54306a(str4);
            }
            return new ok5(new s7j0(str4, 6), kkp0Var2.f123680b);
            kkp0 kkp0Var4 = kkp0Var;
            boolean zBooleanValue = ((Boolean) objM76264c).booleanValue();
            lkp0Var2.f134423a = kkp0Var4;
            lkp0Var2.f134424b = null;
            lkp0Var2.f134425c = null;
            lkp0Var2.f134426d = null;
            lkp0Var2.f134427e = null;
            lkp0Var2.f134428f = null;
            lkp0Var2.f134432t = 2;
            objM76264c = rqs0Var.m76264c(str3, str, zus0Var, z, str2, zBooleanValue, lkp0Var2);
            if (objM76264c != yukVar) {
                kkp0Var2 = kkp0Var4;
                dvs0Var = (dvs0) objM76264c;
                if (dvs0Var instanceof cvs0) {
                    if (dvs0Var instanceof bvs0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = ((bvs0) dvs0Var).f31426a;
                    arrayList = new ArrayList();
                    while (r3.hasNext()) {
                        if (obj instanceof trs0) {
                            arrayList.add(obj);
                        }
                    }
                    trs0 trs0Var2 = (trs0) g6f.m43745s0(arrayList);
                    if (trs0Var2 != null) {
                    }
                }
                str4 = ((cvs0) dvs0Var).f42536b;
                if (str4 == null) {
                    return new mk5(new IllegalStateException("No URI returned for playlist generation"));
                }
                boolean z5 = ((cvs0) dvs0Var).f42537c;
                lkp0Var2.f134423a = kkp0Var2;
                lkp0Var2.f134424b = dvs0Var;
                lkp0Var2.f134425c = str4;
                lkp0Var2.f134432t = 3;
            }
            return yukVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new mk5(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0121  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16, types: [p.hts0] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.j9a1
    /* JADX INFO: renamed from: b */
    public final Object mo52739b(y210 y210Var, ibk ibkVar) {
        nkp0 nkp0Var;
        kkp0 kkp0Var;
        String str;
        hts0 hts0Var;
        String str2;
        String str3;
        rqs0 rqs0Var;
        String str4;
        kkp0 kkp0Var2;
        k7t k7tVar;
        boolean z;
        String str5;
        kkp0 kkp0Var3;
        if (ibkVar instanceof nkp0) {
            nkp0Var = (nkp0) ibkVar;
            int i = nkp0Var.f154923i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkp0Var.f154923i = i - Integer.MIN_VALUE;
            } else {
                nkp0Var = new nkp0(this, ibkVar);
            }
        } else {
            nkp0Var = new nkp0(this, ibkVar);
        }
        Object objM76263a = nkp0Var.f154921g;
        int i2 = nkp0Var.f154923i;
        oga0 oga0Var = this.f166435d;
        rqs0 rqs0Var2 = this.f166432a;
        jts0 jts0Var = this.f166436e;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM76263a);
                    kkp0Var = (kkp0) y210Var;
                    str = kkp0Var.f123682d;
                    if (str == null) {
                        return new mk5(new IllegalStateException("No URI provided for playlist update"));
                    }
                    hts0 hts0VarM54306a = jts0Var.f115963g.m54306a(str);
                    String str6 = kkp0Var.f123679a;
                    nkp0Var.f154915a = kkp0Var;
                    nkp0Var.f154916b = str;
                    nkp0Var.f154917c = hts0VarM54306a;
                    nkp0Var.f154918d = rqs0Var2;
                    nkp0Var.f154919e = str;
                    nkp0Var.f154920f = str6;
                    nkp0Var.f154923i = 1;
                    Object objM66877c = oga0Var.m66877c(nkp0Var);
                    if (objM66877c != yukVar) {
                        hts0Var = hts0VarM54306a;
                        str2 = str6;
                        str3 = str;
                        objM76263a = objM66877c;
                        rqs0Var = rqs0Var2;
                    }
                    return yukVar;
                }
                if (i2 == 1) {
                    str2 = nkp0Var.f154920f;
                    str = nkp0Var.f154919e;
                    rqs0Var = nkp0Var.f154918d;
                    hts0Var = nkp0Var.f154917c;
                    str3 = nkp0Var.f154916b;
                    kkp0Var = nkp0Var.f154915a;
                    try {
                        bga.m29073P(objM76263a);
                    } catch (CancellationException e) {
                        e = e;
                        y210Var = hts0Var;
                        jts0Var.f115963g.m54307b(y210Var);
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        y210Var = hts0Var;
                        jts0Var.f115963g.m54307b(y210Var);
                        return new mk5(e);
                    }
                } else {
                    if (i2 == 2) {
                        hts0 hts0Var2 = nkp0Var.f154917c;
                        str4 = nkp0Var.f154916b;
                        kkp0Var2 = nkp0Var.f154915a;
                        bga.m29073P(objM76263a);
                        y210Var = hts0Var2;
                        k7tVar = (k7t) objM76263a;
                        if (k7tVar instanceof j7t) {
                            if (k7tVar instanceof i7t) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jts0Var.f115963g.m54307b(y210Var);
                            return new mk5(new PlaylistGenerationException(((i7t) k7tVar).f99630a));
                        }
                        if (((j7t) k7tVar).f109663b) {
                            jts0Var.f115963g.m54307b(y210Var);
                        }
                        z = ((j7t) k7tVar).f109663b;
                        nkp0Var.f154915a = kkp0Var2;
                        nkp0Var.f154916b = str4;
                        nkp0Var.f154917c = null;
                        nkp0Var.f154918d = null;
                        nkp0Var.f154923i = 3;
                        if (oga0Var.m66876b(z, str4, rqs0Var2, nkp0Var) != yukVar) {
                            str5 = str4;
                            kkp0Var3 = kkp0Var2;
                        }
                        return yukVar;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = nkp0Var.f154916b;
                    kkp0Var3 = nkp0Var.f154915a;
                    bga.m29073P(objM76263a);
                }
                return new ok5(new s7j0(str5, 6), kkp0Var3.f123680b);
                boolean zBooleanValue = ((Boolean) objM76263a).booleanValue();
                nkp0Var.f154915a = kkp0Var;
                nkp0Var.f154916b = str3;
                nkp0Var.f154917c = hts0Var;
                nkp0Var.f154918d = null;
                nkp0Var.f154919e = null;
                nkp0Var.f154920f = null;
                nkp0Var.f154923i = 2;
                objM76263a = rqs0Var.m76263a(str, str2, nkp0Var, zBooleanValue);
                if (objM76263a != yukVar) {
                    y210Var = hts0Var;
                    str4 = str3;
                    kkp0Var2 = kkp0Var;
                    k7tVar = (k7t) objM76263a;
                    if (k7tVar instanceof j7t) {
                        if (k7tVar instanceof i7t) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jts0Var.f115963g.m54307b(y210Var);
                        return new mk5(new PlaylistGenerationException(((i7t) k7tVar).f99630a));
                    }
                    if (((j7t) k7tVar).f109663b) {
                        jts0Var.f115963g.m54307b(y210Var);
                    }
                    z = ((j7t) k7tVar).f109663b;
                    nkp0Var.f154915a = kkp0Var2;
                    nkp0Var.f154916b = str4;
                    nkp0Var.f154917c = null;
                    nkp0Var.f154918d = null;
                    nkp0Var.f154923i = 3;
                    if (oga0Var.m66876b(z, str4, rqs0Var2, nkp0Var) != yukVar) {
                        str5 = str4;
                        kkp0Var3 = kkp0Var2;
                        return new ok5(new s7j0(str5, 6), kkp0Var3.f123680b);
                    }
                }
                return yukVar;
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                return new mk5(e4);
            }
        } catch (CancellationException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[Catch: Exception -> 0x0035, CancellationException -> 0x0038, TryCatch #3 {CancellationException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x002c, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00ba, B:56:0x00be, B:58:0x00d2, B:59:0x00d7, B:60:0x00d8, B:44:0x0091), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00af A[Catch: Exception -> 0x0035, CancellationException -> 0x0038, TryCatch #3 {CancellationException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x002c, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00ba, B:56:0x00be, B:58:0x00d2, B:59:0x00d7, B:60:0x00d8, B:44:0x0091), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[Catch: Exception -> 0x0035, CancellationException -> 0x0038, TryCatch #3 {CancellationException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x002c, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00ba, B:56:0x00be, B:58:0x00d2, B:59:0x00d7, B:60:0x00d8, B:44:0x0091), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00be A[Catch: Exception -> 0x0035, CancellationException -> 0x0038, TryCatch #3 {CancellationException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x002c, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00ba, B:56:0x00be, B:58:0x00d2, B:59:0x00d7, B:60:0x00d8, B:44:0x0091), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2 A[Catch: Exception -> 0x0035, CancellationException -> 0x0038, TryCatch #3 {CancellationException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x002c, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00ba, B:56:0x00be, B:58:0x00d2, B:59:0x00d7, B:60:0x00d8, B:44:0x0091), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8 A[Catch: Exception -> 0x0035, CancellationException -> 0x0038, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x002c, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00ba, B:56:0x00be, B:58:0x00d2, B:59:0x00d7, B:60:0x00d8, B:44:0x0091), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final Object m67258c(y210 y210Var, ibk ibkVar) {
        mkp0 mkp0Var;
        hts0 hts0VarM54306a;
        String str;
        Object obj;
        String str2;
        Throwable thM77348a;
        nrv0 nrv0Var;
        if (ibkVar instanceof mkp0) {
            mkp0Var = (mkp0) ibkVar;
            int i = mkp0Var.f144627e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkp0Var.f144627e = i - Integer.MIN_VALUE;
            } else {
                mkp0Var = new mkp0(this, ibkVar);
            }
        } else {
            mkp0Var = new mkp0(this, ibkVar);
        }
        Object obj2 = mkp0Var.f144625c;
        int i2 = mkp0Var.f144627e;
        int i3 = 6;
        jts0 jts0Var = this.f166436e;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        str2 = mkp0Var.f144623a;
                        bga.m29073P(obj2);
                        return new ok5(new s7j0(str2, i3), null);
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hts0VarM54306a = mkp0Var.f144624b;
                    str = mkp0Var.f144623a;
                    bga.m29073P(obj2);
                    obj = ((s6x0) obj2).f206218a;
                    thM77348a = s6x0.m77348a(obj);
                    if (thM77348a == null) {
                        jts0Var.f115963g.m54307b(hts0VarM54306a);
                        return new mk5(thM77348a);
                    }
                    nrv0Var = (nrv0) obj;
                    if (nrv0Var instanceof mrv0) {
                        return new ok5(new s7j0(str, i3), null);
                    }
                    if (nrv0Var instanceof lrv0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jts0Var.f115963g.m54307b(hts0VarM54306a);
                    return new mk5(new PlaylistGenerationException(((lrv0) nrv0Var).f136363a));
                }
                bga.m29073P(obj2);
                kkp0 kkp0Var = (kkp0) y210Var;
                String str3 = kkp0Var.f123682d;
                if (str3 == null) {
                    return new mk5(new IllegalStateException("No URI provided for template generation"));
                }
                boolean z = kkp0Var.f123686h;
                rqs0 rqs0Var = this.f166432a;
                yuk yukVar = yuk.f276404a;
                if (z) {
                    oga0 oga0Var = this.f166435d;
                    mkp0Var.f144623a = str3;
                    mkp0Var.f144627e = 1;
                    if (oga0Var.m66876b(true, str3, rqs0Var, mkp0Var) != yukVar) {
                        str2 = str3;
                        return new ok5(new s7j0(str2, i3), null);
                    }
                } else {
                    hts0VarM54306a = jts0Var.f115963g.m54306a(str3);
                    avs0 avs0Var = avs0.f20255a;
                    mkp0Var.f144623a = str3;
                    mkp0Var.f144624b = hts0VarM54306a;
                    mkp0Var.f144627e = 2;
                    Object objM76266e = rqs0Var.m76266e(str3, avs0Var, mkp0Var);
                    if (objM76266e != yukVar) {
                        str = str3;
                        obj = objM76266e;
                        thM77348a = s6x0.m77348a(obj);
                        if (thM77348a == null) {
                            jts0Var.f115963g.m54307b(hts0VarM54306a);
                            return new mk5(thM77348a);
                        }
                        nrv0Var = (nrv0) obj;
                        if (nrv0Var instanceof mrv0) {
                            return new ok5(new s7j0(str, i3), null);
                        }
                        if (nrv0Var instanceof lrv0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jts0Var.f115963g.m54307b(hts0VarM54306a);
                        return new mk5(new PlaylistGenerationException(((lrv0) nrv0Var).f136363a));
                    }
                }
                return yukVar;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new mk5(e2);
            }
        } catch (CancellationException e3) {
            jts0Var.f115963g.m54307b(y210Var);
            throw e3;
        } catch (Exception e4) {
            jts0Var.f115963g.m54307b(y210Var);
            return new mk5(e4);
        }
    }
}
