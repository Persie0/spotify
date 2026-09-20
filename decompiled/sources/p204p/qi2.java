package p204p;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class qi2 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188900a;

    /* JADX INFO: renamed from: b */
    public int f188901b;

    /* JADX INFO: renamed from: c */
    public Object f188902c;

    /* JADX INFO: renamed from: d */
    public Object f188903d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f188904e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f188905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi2(int i, Object obj, Object obj2, Object obj3, Object obj4, fbk fbkVar) {
        super(1, fbkVar);
        this.f188900a = i;
        this.f188902c = obj;
        this.f188903d = obj2;
        this.f188904e = obj3;
        this.f188905f = obj4;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f188900a) {
            case 0:
                return new qi2(0, (mdf0) this.f188902c, (luk) this.f188903d, (hg5) this.f188904e, (Context) this.f188905f, fbkVar);
            case 1:
                return new qi2((mo8) this.f188904e, (qnd) this.f188905f, fbkVar);
            case 2:
                return new qi2((go9) this.f188903d, (String) this.f188904e, (xms0) this.f188905f, fbkVar, 2);
            case 3:
                return new qi2(3, (AtomicBoolean) this.f188902c, (y0a) this.f188903d, (fuf) this.f188904e, (x0a) this.f188905f, fbkVar);
            case 4:
                return new qi2(4, (yho) this.f188902c, (String) this.f188903d, (String) this.f188904e, (hz80) this.f188905f, fbkVar);
            case 5:
                return new qi2(5, (List) this.f188902c, (xuk) this.f188903d, (m690) this.f188904e, (sr4) this.f188905f, fbkVar);
            case 6:
                return new qi2(6, (nod) this.f188902c, (rmm0) this.f188903d, (String) this.f188904e, (String) this.f188905f, fbkVar);
            case 7:
                return new qi2(7, (dl21) this.f188902c, (String) this.f188903d, (String) this.f188904e, (gh00) this.f188905f, fbkVar);
            default:
                return new qi2((Uri) this.f188903d, (sr31) this.f188904e, (i471) this.f188905f, fbkVar, 8);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f188900a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((qi2) create(fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        icr0 icr0Var;
        gcr0 gcr0Var;
        mnd mndVar;
        und undVar;
        mnd mndVar2;
        String str;
        qi2 qi2Var;
        i471 i471Var;
        switch (this.f188900a) {
            case 0:
                mdf0 mdf0Var = (mdf0) this.f188902c;
                int i = this.f188901b;
                fbk fbkVar = null;
                yuk yukVar = yuk.f276404a;
                if (i != 0) {
                    if (i == 1) {
                        bga.m29073P(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return Boolean.valueOf(((ldf0) obj).f132157a);
                }
                bga.m29073P(obj);
                mdf0Var.m61519a();
                luk lukVar = (luk) this.f188903d;
                C2241p2 c2241p2 = new C2241p2((hg5) this.f188904e, (Context) this.f188905f, fbkVar, 17);
                this.f188901b = 1;
                if (x0h1.m89557A(lukVar, c2241p2, this) == yukVar) {
                    return yukVar;
                }
                mdf0Var.getClass();
                nzx0 nzx0Var = new nzx0(new sqc0(mdf0Var, fbkVar, 21));
                this.f188901b = 2;
                obj = vyf1.m86755t(nzx0Var, this);
                if (obj == yukVar) {
                    return yukVar;
                }
                return Boolean.valueOf(((ldf0) obj).f132157a);
            case 1:
                mo8 mo8Var = (mo8) this.f188904e;
                int i2 = this.f188901b;
                yuk yukVar2 = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        gcr0Var = (gcr0) this.f188902c;
                        bga.m29073P(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mndVar2 = (mnd) this.f188903d;
                        bga.m29073P(obj);
                    }
                    undVar = (und) obj;
                    mndVar = mndVar2;
                    return new lnd(mndVar, undVar, new pr01(mo8Var.f145608O0));
                }
                bga.m29073P(obj);
                zn8 zn8Var = mo8Var.f145620g;
                if (zn8Var == null || (icr0Var = zn8Var.f284431a) == null) {
                    icr0Var = (icr0) mo8Var.f145616c.get(mo8Var.f145615b);
                }
                gcr0 gcr0Var2 = zn8Var == null ? mo8Var.f145617d : zn8Var.f284432b;
                ipg1 ipg1VarM53939u = jpg1.m53939u(icr0Var);
                ck01 ck01Var = mo8Var.f145621h;
                this.f188902c = gcr0Var2;
                this.f188901b = 1;
                mnd mndVarM73344a = qnd.m73344a(ipg1VarM53939u, ck01Var);
                if (mndVarM73344a == yukVar2) {
                    return yukVar2;
                }
                gcr0Var = gcr0Var2;
                obj = mndVarM73344a;
                mndVar = (mnd) obj;
                undVar = null;
                if (gcr0Var != null) {
                    Uri uri = Uri.parse(gcr0Var.f78646a);
                    this.f188902c = null;
                    this.f188903d = mndVar;
                    this.f188901b = 2;
                    und undVar2 = new und(uri);
                    if (undVar2 == yukVar2) {
                        return yukVar2;
                    }
                    mndVar2 = mndVar;
                    obj = undVar2;
                    undVar = (und) obj;
                    mndVar = mndVar2;
                }
                return new lnd(mndVar, undVar, new pr01(mo8Var.f145608O0));
            case 2:
                go9 go9Var = (go9) this.f188903d;
                int i3 = this.f188901b;
                yuk yukVar3 = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        bga.m29073P(obj);
                    } else if (i3 == 2) {
                        str = (String) this.f188902c;
                        bga.m29073P(obj);
                        this.f188902c = null;
                        this.f188901b = 3;
                        if (go9.m45327b(go9Var, str, this) == yukVar3) {
                            return yukVar3;
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                zv41 zv41Var = go9Var.f82913h;
                zv41Var.getClass();
                zv41Var.m97091m(null, qv41.f192870c);
                a99 a99Var = go9Var.f82907b;
                String str2 = go9Var.f82910e;
                String str3 = (String) this.f188904e;
                xms0 xms0Var = (xms0) this.f188905f;
                this.f188901b = 1;
                obj = a99Var.m25092k(str2, str3, xms0Var, this);
                if (obj == yukVar3) {
                    return yukVar3;
                }
                str = (String) obj;
                this.f188902c = str;
                this.f188901b = 2;
                if (go9.m45326a(go9Var, str, this) == yukVar3) {
                    return yukVar3;
                }
                this.f188902c = null;
                this.f188901b = 3;
                if (go9.m45327b(go9Var, str, this) == yukVar3) {
                    return yukVar3;
                }
                return w2a1.f247311a;
            case 3:
                x0a x0aVar = (x0a) this.f188905f;
                y0a y0aVar = (y0a) this.f188903d;
                Context context = y0aVar.f267939a;
                int i4 = this.f188901b;
                try {
                    if (i4 == 0) {
                        bga.m29073P(obj);
                        ((AtomicBoolean) this.f188902c).set(true);
                        ((pz6) y0aVar.f267940b).f183611a.stopBluetoothSco();
                        s47 s47Var = new s47((fuf) this.f188904e, null, 2);
                        this.f188901b = 1;
                        Object objM76978s = s1h1.m76978s(2000L, s47Var, this);
                        yuk yukVar4 = yuk.f276404a;
                        if (objM76978s == yukVar4) {
                            return yukVar4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    try {
                        context.unregisterReceiver(x0aVar);
                        break;
                    } catch (Throwable unused) {
                    }
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    try {
                        context.unregisterReceiver(x0aVar);
                        throw th;
                    } catch (Throwable unused2) {
                        throw th;
                    }
                }
            case 4:
                int i5 = this.f188901b;
                try {
                    if (i5 == 0) {
                        bga.m29073P(obj);
                        m180 m180Var = new m180((yho) this.f188902c, (String) this.f188903d, (String) this.f188904e, (hz80) this.f188905f, null, 0);
                        this.f188901b = 1;
                        Object objM76978s2 = s1h1.m76978s(5000L, m180Var, this);
                        yuk yukVar5 = yuk.f276404a;
                        if (objM76978s2 == yukVar5) {
                            return yukVar5;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused3) {
                    return null;
                }
            case 5:
                int i6 = this.f188901b;
                if (i6 == 0) {
                    bga.m29073P(obj);
                    List list = (List) this.f188902c;
                    xuk xukVar = (xuk) this.f188903d;
                    m690 m690Var = (m690) this.f188904e;
                    sr4 sr4Var = (sr4) this.f188905f;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(x0h1.m89574q(xukVar, null, 0, new gnq(m690Var, (j690) it.next(), sr4Var, (fbk) null, 18), 3));
                    }
                    this.f188901b = 1;
                    Object objM78216m = sig1.m78216m(arrayList, this);
                    yuk yukVar6 = yuk.f276404a;
                    if (objM78216m == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 6:
                nod nodVar = (nod) this.f188902c;
                int i7 = this.f188901b;
                yuk yukVar7 = yuk.f276404a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        bga.m29073P(obj);
                        qi2Var = this;
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return (ata1) obj;
                }
                bga.m29073P(obj);
                ia70 ia70Var = (ia70) nodVar.f156662f;
                u7x0 u7x0VarMo29877i = ((rmm0) this.f188903d).mo29877i();
                String str4 = ((zla0) nodVar.f156660d).f283965a;
                String str5 = (String) this.f188904e;
                String str6 = (String) this.f188905f;
                this.f188901b = 1;
                qi2Var = this;
                obj = ia70Var.m50033a(u7x0VarMo29877i, str4, str5, str6, qi2Var);
                if (obj == yukVar7) {
                    return yukVar7;
                }
                if (obj == null) {
                    return null;
                }
                rga0 rga0Var = (rga0) nodVar.f156661e;
                qi2Var.f188901b = 2;
                obj = rga0Var.m75472k(this);
                if (obj == yukVar7) {
                    return yukVar7;
                }
                return (ata1) obj;
            case 7:
                int i8 = this.f188901b;
                yuk yukVar8 = yuk.f276404a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        bga.m29073P(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                dl21 dl21Var = (dl21) ((dl21) this.f188902c).f50106b;
                String str7 = (String) this.f188903d;
                String str8 = (String) this.f188904e;
                this.f188901b = 1;
                if (dl21Var.mo34953c(str7, str8, null, this) == yukVar8) {
                    return yukVar8;
                }
                gh00 gh00Var = (gh00) this.f188905f;
                if (gh00Var != null) {
                    this.f188901b = 2;
                    if (gh00Var.invoke(this) == yukVar8) {
                        return yukVar8;
                    }
                }
                return w2a1.f247311a;
            default:
                int i9 = this.f188901b;
                if (i9 == 0) {
                    bga.m29073P(obj);
                    Uri uri2 = (Uri) this.f188903d;
                    if (uri2 == null) {
                        return null;
                    }
                    i471Var = (i471) this.f188905f;
                    d3r d3rVar = new d3r(uri2);
                    ck01 ck01Var2 = i471Var.f98452a.f213202b.f154746c;
                    this.f188902c = i471Var;
                    this.f188901b = 1;
                    obj = qnd.m73344a(d3rVar, ck01Var2);
                    yuk yukVar9 = yuk.f276404a;
                    if (obj == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i471Var = (i471) this.f188902c;
                    bga.m29073P(obj);
                }
                return new lnd((mnd) obj, null, new pr01(i471Var.f98452a.f213201a.f201919b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi2(Object obj, Object obj2, Object obj3, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f188900a = i;
        this.f188903d = obj;
        this.f188904e = obj2;
        this.f188905f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi2(mo8 mo8Var, qnd qndVar, fbk fbkVar) {
        super(1, fbkVar);
        this.f188900a = 1;
        this.f188904e = mo8Var;
        this.f188905f = qndVar;
    }
}
