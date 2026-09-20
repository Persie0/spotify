package p204p;

import android.content.Context;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.notifications.models.preferences.ShowOptInMetadata;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class gzj0 implements ryj0 {

    /* JADX INFO: renamed from: r */
    public static final String f85958r = xoc1.f263971Q4.f243453a;

    /* JADX INFO: renamed from: s */
    public static final String f85959s = xoc1.f263963P4.f243453a;

    /* JADX INFO: renamed from: a */
    public final er70 f85960a;

    /* JADX INFO: renamed from: b */
    public final er70 f85961b;

    /* JADX INFO: renamed from: c */
    public final ynb f85962c;

    /* JADX INFO: renamed from: d */
    public final er70 f85963d;

    /* JADX INFO: renamed from: e */
    public final m500 f85964e;

    /* JADX INFO: renamed from: f */
    public final er70 f85965f;

    /* JADX INFO: renamed from: g */
    public final er70 f85966g;

    /* JADX INFO: renamed from: h */
    public final luk f85967h;

    /* JADX INFO: renamed from: i */
    public final luk f85968i;

    /* JADX INFO: renamed from: j */
    public final er70 f85969j;

    /* JADX INFO: renamed from: k */
    public final er70 f85970k;

    /* JADX INFO: renamed from: l */
    public final er70 f85971l;

    /* JADX INFO: renamed from: m */
    public final er70 f85972m;

    /* JADX INFO: renamed from: n */
    public final k44 f85973n;

    /* JADX INFO: renamed from: o */
    public final hb11 f85974o;

    /* JADX INFO: renamed from: p */
    public final zv41 f85975p;

    /* JADX INFO: renamed from: q */
    public luu0 f85976q;

    public gzj0(er70 er70Var, er70 er70Var2, ynb ynbVar, er70 er70Var3, m500 m500Var, er70 er70Var4, er70 er70Var5, luk lukVar, luk lukVar2, er70 er70Var6, er70 er70Var7, er70 er70Var8, er70 er70Var9, k44 k44Var) {
        this.f85960a = er70Var;
        this.f85961b = er70Var2;
        this.f85962c = ynbVar;
        this.f85963d = er70Var3;
        this.f85964e = m500Var;
        this.f85965f = er70Var4;
        this.f85966g = er70Var5;
        this.f85967h = lukVar;
        this.f85968i = lukVar2;
        this.f85969j = er70Var6;
        this.f85970k = er70Var7;
        this.f85971l = er70Var8;
        this.f85972m = er70Var9;
        this.f85973n = k44Var;
        hb11 hb11VarM52092t = j0g1.m52092t(1, 0, 2, 2);
        hb11VarM52092t.mo46962a(w2a1.f247311a);
        this.f85974o = hb11VarM52092t;
        this.f85975p = jag1.m52819d(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m46204a(gzj0 gzj0Var, boolean z, ibk ibkVar) {
        syj0 syj0Var;
        gzj0Var.getClass();
        if (ibkVar instanceof syj0) {
            syj0Var = (syj0) ibkVar;
            int i = syj0Var.f215267d;
            if ((i & Integer.MIN_VALUE) != 0) {
                syj0Var.f215267d = i - Integer.MIN_VALUE;
            } else {
                syj0Var = new syj0(gzj0Var, ibkVar);
            }
        } else {
            syj0Var = new syj0(gzj0Var, ibkVar);
        }
        Object objM46212i = syj0Var.f215265b;
        int i2 = syj0Var.f215267d;
        if (i2 == 0) {
            bga.m29073P(objM46212i);
            syj0Var.f215264a = z;
            syj0Var.f215267d = 1;
            objM46212i = gzj0Var.m46212i(syj0Var);
            Object obj = yuk.f276404a;
            if (objM46212i == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = syj0Var.f215264a;
            bga.m29073P(objM46212i);
        }
        return qyg1.m74178H((((Boolean) objM46212i).booleanValue() || ((Boolean) gzj0Var.f85975p.getValue()).booleanValue() || !gzj0Var.f85962c.f274426a.m58075h() || !z || gzj0Var.m46208e() == 4 || gzj0Var.m46213j()) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (p204p.kk40.m56684z(r6, r0) == r5) goto L31;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m46205b(gzj0 gzj0Var, ibk ibkVar) {
        tyj0 tyj0Var;
        Object c6x0Var;
        Throwable thM77348a;
        Object obj;
        int i;
        if (ibkVar instanceof tyj0) {
            tyj0Var = (tyj0) ibkVar;
            int i2 = tyj0Var.f224989e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tyj0Var.f224989e = i2 - Integer.MIN_VALUE;
            } else {
                tyj0Var = new tyj0(gzj0Var, ibkVar);
            }
        } else {
            tyj0Var = new tyj0(gzj0Var, ibkVar);
        }
        Object obj2 = tyj0Var.f224987c;
        int i3 = tyj0Var.f224989e;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj2);
                Single<Map<String, List<ShowOptInMetadata>>> singleM67050a = ((oij0) gzj0Var.f85972m.get()).m67050a();
                tyj0Var.f224985a = gzj0Var;
                tyj0Var.f224986b = 0;
                tyj0Var.f224989e = 1;
                Object objM96567o = zn91.m96567o(singleM67050a, tyj0Var);
                if (objM96567o != yukVar) {
                    obj = objM96567o;
                    i = 0;
                }
                return yukVar;
            }
            if (i3 == 1) {
                int i4 = tyj0Var.f224986b;
                gzj0 gzj0Var2 = tyj0Var.f224985a;
                bga.m29073P(obj2);
                i = i4;
                gzj0Var = gzj0Var2;
                obj = obj2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            c6x0Var = w2a1.f247311a;
            thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a != null) {
                if (!(thM77348a instanceof CancellationException)) {
                    throw thM77348a;
                }
                Logger.m3967c(thM77348a, "Failed to disable new episode push notifications", new Object[0]);
            }
            return qyg1.m74178H(!(c6x0Var instanceof c6x0));
            List list = (List) ((Map) obj).get("followedShows");
            if (list != null) {
                tpf0 tpf0Var = new tpf0(list, gzj0Var, (fbk) null, 26);
                tyj0Var.f224985a = null;
                tyj0Var.f224986b = i;
                tyj0Var.f224989e = 2;
            }
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            if (!(thM77348a instanceof CancellationException)) {
                throw thM77348a;
            }
            Logger.m3967c(thM77348a, "Failed to disable new episode push notifications", new Object[0]);
        }
        return qyg1.m74178H(!(c6x0Var instanceof c6x0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m46206c(gzj0 gzj0Var, String str, ibk ibkVar) {
        uyj0 uyj0Var;
        Object c6x0Var;
        if (ibkVar instanceof uyj0) {
            uyj0Var = (uyj0) ibkVar;
            int i = uyj0Var.f235297c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uyj0Var.f235297c = i - Integer.MIN_VALUE;
            } else {
                uyj0Var = new uyj0(gzj0Var, ibkVar);
            }
        } else {
            uyj0Var = new uyj0(gzj0Var, ibkVar);
        }
        Object obj = uyj0Var.f235295a;
        int i2 = uyj0Var.f235297c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                nzv nzvVar = srl0.f213342Q0;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : nzvVar) {
                    srl0 srl0Var = (srl0) obj2;
                    if (srl0Var != srl0.MESSAGES && srl0Var != srl0.JAM) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new yrl0(lmc.f134854b, (srl0) it.next(), false));
                }
                xgq0 xgq0Var = (xgq0) gzj0Var.f85965f.get();
                yrl0[] yrl0VarArr = (yrl0[]) arrayList2.toArray(new yrl0[0]);
                Completable completableM90935d = xgq0Var.m90935d((yrl0[]) Arrays.copyOf(yrl0VarArr, yrl0VarArr.length), 5, str);
                uyj0Var.f235297c = 1;
                Object objM96565n = zn91.m96565n(completableM90935d, uyj0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            if (thM77348a instanceof CancellationException) {
                throw thM77348a;
            }
            Logger.m3967c(thM77348a, "Failed to disable non-essential push", new Object[0]);
        }
        return qyg1.m74178H(!(c6x0Var instanceof c6x0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Serializable m46207d(gzj0 gzj0Var, String str, ibk ibkVar) {
        vyj0 vyj0Var;
        Serializable c6x0Var;
        if (ibkVar instanceof vyj0) {
            vyj0Var = (vyj0) ibkVar;
            int i = vyj0Var.f246160c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyj0Var.f246160c = i - Integer.MIN_VALUE;
            } else {
                vyj0Var = new vyj0(gzj0Var, ibkVar);
            }
        } else {
            vyj0Var = new vyj0(gzj0Var, ibkVar);
        }
        Object objM96567o = vyj0Var.f246158a;
        int i2 = vyj0Var.f246160c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM90934c = ((xgq0) gzj0Var.f85965f.get()).m90934c(srl0.MESSAGES, 5, str);
                vyj0Var.f246160c = 1;
                objM96567o = zn91.m96567o(singleM90934c, vyj0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            c6x0Var = qyg1.m74178H(((xrl0) objM96567o).m91939a());
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            if (thM77348a instanceof CancellationException) {
                throw thM77348a;
            }
            Logger.m3967c(thM77348a, "Failed to get messages push opt-in state", new Object[0]);
        }
        return c6x0Var instanceof c6x0 ? qyg1.m74178H(false) : c6x0Var;
    }

    /* JADX INFO: renamed from: e */
    public final int m46208e() {
        int iOrdinal = this.f85973n.m55339j().ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m46209f(ibk ibkVar) {
        azj0 azj0Var;
        if (ibkVar instanceof azj0) {
            azj0Var = (azj0) ibkVar;
            int i = azj0Var.f21632c;
            if ((i & Integer.MIN_VALUE) != 0) {
                azj0Var.f21632c = i - Integer.MIN_VALUE;
            } else {
                azj0Var = new azj0(this, ibkVar);
            }
        } else {
            azj0Var = new azj0(this, ibkVar);
        }
        Object obj = azj0Var.f21630a;
        int i2 = azj0Var.f21632c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            jxj0 jxj0Var = (jxj0) this.f85963d.get();
            azj0Var.f21632c = 1;
            if (((wxj0) jxj0Var).m89313i(azj0Var) != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        azj0Var.f21632c = 2;
        Boolean boolM74178H = qyg1.m74178H(true);
        zv41 zv41Var = this.f85975p;
        zv41Var.getClass();
        zv41Var.m97091m(null, boolM74178H);
        return w2a1Var == yukVar ? yukVar : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (p204p.x0h1.m89557A(r12.f85968i, r0, r6) == r8) goto L29;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46210g(String str, String str2, d850 d850Var, ibk ibkVar) {
        bzj0 bzj0Var;
        Object obj;
        d850 d850Var2;
        int i;
        String str3;
        jxj0 jxj0Var;
        d850 d850Var3;
        String str4;
        if (ibkVar instanceof bzj0) {
            bzj0Var = (bzj0) ibkVar;
            int i2 = bzj0Var.f32521h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bzj0Var.f32521h = i2 - Integer.MIN_VALUE;
            } else {
                bzj0Var = new bzj0(this, ibkVar);
            }
        } else {
            bzj0Var = new bzj0(this, ibkVar);
        }
        bzj0 bzj0Var2 = bzj0Var;
        Object obj2 = bzj0Var2.f32519f;
        int i3 = bzj0Var2.f32521h;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj2);
            obj = this.f85963d.get();
            jxj0 jxj0Var2 = (jxj0) obj;
            bzj0Var2.f32514a = str2;
            d850Var2 = d850Var;
            bzj0Var2.f32515b = d850Var2;
            bzj0Var2.f32516c = obj;
            bzj0Var2.f32517d = jxj0Var2;
            bzj0Var2.f32518e = 0;
            bzj0Var2.f32521h = 1;
            wxj0 wxj0Var = (wxj0) jxj0Var2;
            if (wxj0Var.m89316l(str, bzj0Var2) != yukVar) {
                i = 0;
                str3 = str2;
                jxj0Var = wxj0Var;
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = bzj0Var2.f32518e;
            jxj0 jxj0Var3 = bzj0Var2.f32517d;
            obj = bzj0Var2.f32516c;
            d850Var2 = bzj0Var2.f32515b;
            str3 = bzj0Var2.f32514a;
            bga.m29073P(obj2);
            jxj0Var = jxj0Var3;
        } else if (i3 == 2) {
            d850Var3 = bzj0Var2.f32515b;
            str4 = bzj0Var2.f32514a;
            bga.m29073P(obj2);
            rzb0 rzb0Var = new rzb0((Object) this, (Parcelable) d850Var3, str4, fbkVar, 15);
            bzj0Var2.f32514a = null;
            bzj0Var2.f32515b = null;
            bzj0Var2.f32516c = null;
            bzj0Var2.f32517d = null;
            bzj0Var2.f32521h = 3;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        bzj0Var2.f32514a = str3;
        bzj0Var2.f32515b = d850Var2;
        bzj0Var2.f32516c = obj;
        bzj0Var2.f32517d = null;
        bzj0Var2.f32518e = i;
        bzj0Var2.f32521h = 2;
        if (((wxj0) jxj0Var).m89314j(bzj0Var2) != yukVar) {
            d850Var3 = d850Var2;
            str4 = str3;
            rzb0 rzb0Var2 = new rzb0((Object) this, (Parcelable) d850Var3, str4, fbkVar, 15);
            bzj0Var2.f32514a = null;
            bzj0Var2.f32515b = null;
            bzj0Var2.f32516c = null;
            bzj0Var2.f32517d = null;
            bzj0Var2.f32521h = 3;
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m46211h() {
        if (!this.f85962c.f274426a.m58075h() || m46208e() == 4) {
            return false;
        }
        k44 k44Var = this.f85973n;
        return k44Var.m55335f() || k44Var.m55336g() || k44Var.m55334e();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (((java.lang.Number) r8).intValue() >= r4.m55337h()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r8 == r6) goto L28;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46212i(ibk ibkVar) {
        czj0 czj0Var;
        if (ibkVar instanceof czj0) {
            czj0Var = (czj0) ibkVar;
            int i = czj0Var.f43576c;
            if ((i & Integer.MIN_VALUE) != 0) {
                czj0Var.f43576c = i - Integer.MIN_VALUE;
            } else {
                czj0Var = new czj0(this, ibkVar);
            }
        } else {
            czj0Var = new czj0(this, ibkVar);
        }
        Object objM89309e = czj0Var.f43574a;
        int i2 = czj0Var.f43576c;
        er70 er70Var = this.f85963d;
        k44 k44Var = this.f85973n;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM89309e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89309e);
            }
            if (((Number) objM89309e).intValue() < k44Var.m55338i()) {
                z = false;
            }
            return qyg1.m74178H(z);
        }
        bga.m29073P(objM89309e);
        if (k44Var.m55337h() <= 0) {
            if (k44Var.m55338i() > 0) {
                jxj0 jxj0Var = (jxj0) er70Var.get();
                czj0Var.f43576c = 2;
                objM89309e = ((wxj0) jxj0Var).m89311g(czj0Var);
            } else {
                z = false;
            }
            return qyg1.m74178H(z);
        }
        jxj0 jxj0Var2 = (jxj0) er70Var.get();
        czj0Var.f43576c = 1;
        objM89309e = ((wxj0) jxj0Var2).m89309e(czj0Var);
        return yukVar;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m46213j() {
        v1k0 v1k0Var = (v1k0) this.f85969j.get();
        return v1k0Var.f236405a.m57999d((Context) this.f85961b.get());
    }

    /* JADX INFO: renamed from: k */
    public final fiz m46214k(String str, gh00 gh00Var) {
        return cyf1.m34374j(oyf1.m68486s(mvl0.m62953p(xtm0.m92074U(this.f85975p, new x13((fbk) null, this, str, gh00Var))), new th80(12)), this.f85967h);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    public final Object m46215l(ibk ibkVar) {
        ezj0 ezj0Var;
        long jLongValue;
        long j;
        long j2;
        String str;
        jxj0 jxj0Var;
        String str2;
        if (ibkVar instanceof ezj0) {
            ezj0Var = (ezj0) ibkVar;
            int i = ezj0Var.f64405f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ezj0Var.f64405f = i - Integer.MIN_VALUE;
            } else {
                ezj0Var = new ezj0(this, ibkVar);
            }
        } else {
            ezj0Var = new ezj0(this, ibkVar);
        }
        Object objM89312h = ezj0Var.f64403d;
        int i2 = ezj0Var.f64405f;
        w2a1 w2a1Var = w2a1.f247311a;
        er70 er70Var = this.f85963d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89312h);
            jxj0 jxj0Var2 = (jxj0) er70Var.get();
            ezj0Var.f64405f = 1;
            objM89312h = ((wxj0) jxj0Var2).m89312h(ezj0Var);
            if (objM89312h != yukVar) {
            }
        }
        if (i2 == 1) {
            bga.m29073P(objM89312h);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM89312h);
                return w2a1Var;
            }
            if (i2 == 3) {
                long j3 = ezj0Var.f64401b;
                jLongValue = ezj0Var.f64400a;
                bga.m29073P(objM89312h);
                j = j3;
                j2 = jLongValue;
                str = (String) objM89312h;
                jxj0Var = (jxj0) er70Var.get();
                ezj0Var.f64402c = str;
                ezj0Var.f64400a = j2;
                ezj0Var.f64401b = j;
                ezj0Var.f64405f = 4;
                if (((wxj0) jxj0Var).m89305a(ezj0Var) != yukVar) {
                    str2 = str;
                }
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89312h);
                return w2a1Var;
            }
            j = ezj0Var.f64401b;
            j2 = ezj0Var.f64400a;
            str2 = ezj0Var.f64402c;
            bga.m29073P(objM89312h);
        }
        qff0 qff0Var = new qff0(this, str2, null, 15);
        ezj0Var.f64402c = null;
        ezj0Var.f64400a = j2;
        ezj0Var.f64401b = j;
        ezj0Var.f64405f = 5;
        return x0h1.m89557A(this.f85968i, qff0Var, ezj0Var) == yukVar ? yukVar : w2a1Var;
        jLongValue = ((Number) objM89312h).longValue();
        if (jLongValue != 0) {
            long jM42463g = fr0.m42463g((wy3) ((xre) this.f85960a.get()), jLongValue);
            if (jM42463g >= this.f85973n.m55330a()) {
                jxj0 jxj0Var3 = (jxj0) er70Var.get();
                ezj0Var.f64400a = jLongValue;
                ezj0Var.f64401b = jM42463g;
                ezj0Var.f64405f = 2;
                if (((wxj0) jxj0Var3).m89307c(ezj0Var) == yukVar) {
                }
            } else {
                jxj0 jxj0Var4 = (jxj0) er70Var.get();
                ezj0Var.f64400a = jLongValue;
                ezj0Var.f64401b = jM42463g;
                ezj0Var.f64405f = 3;
                objM89312h = ((wxj0) jxj0Var4).m89310f(ezj0Var);
                if (objM89312h != yukVar) {
                    j = jM42463g;
                    j2 = jLongValue;
                    str = (String) objM89312h;
                    jxj0Var = (jxj0) er70Var.get();
                    ezj0Var.f64402c = str;
                    ezj0Var.f64400a = j2;
                    ezj0Var.f64401b = j;
                    ezj0Var.f64405f = 4;
                    if (((wxj0) jxj0Var).m89305a(ezj0Var) != yukVar) {
                        str2 = str;
                        qff0 qff0Var2 = new qff0(this, str2, null, 15);
                        ezj0Var.f64402c = null;
                        ezj0Var.f64400a = j2;
                        ezj0Var.f64401b = j;
                        ezj0Var.f64405f = 5;
                        if (x0h1.m89557A(this.f85968i, qff0Var2, ezj0Var) == yukVar) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m46216m(ibk ibkVar) {
        fzj0 fzj0Var;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        jxj0 jxj0Var;
        boolean z;
        boolean z2;
        if (ibkVar instanceof fzj0) {
            fzj0Var = (fzj0) ibkVar;
            int i = fzj0Var.f75036e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzj0Var.f75036e = i - Integer.MIN_VALUE;
            } else {
                fzj0Var = new fzj0(this, ibkVar);
            }
        } else {
            fzj0Var = new fzj0(this, ibkVar);
        }
        Object objM89308d = fzj0Var.f75034c;
        int i2 = fzj0Var.f75036e;
        er70 er70Var = this.f85963d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89308d);
            jxj0 jxj0Var2 = (jxj0) er70Var.get();
            fzj0Var.f75036e = 1;
            objM89308d = ((wxj0) jxj0Var2).m89308d(fzj0Var);
            if (objM89308d != obj) {
            }
        }
        if (i2 == 1) {
            bga.m29073P(objM89308d);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM89308d);
                return w2a1Var;
            }
            if (i2 == 3) {
                bga.m29073P(objM89308d);
                pqm0 pqm0Var = (pqm0) objM89308d;
                zBooleanValue = ((Boolean) pqm0Var.f180350a).booleanValue();
                zBooleanValue2 = ((Boolean) pqm0Var.f180351b).booleanValue();
                if (zBooleanValue || zBooleanValue2) {
                    ((hdc) this.f85970k.get()).m47184a();
                }
                if (zBooleanValue && zBooleanValue2) {
                    jxj0Var = (jxj0) er70Var.get();
                    fzj0Var.f75032a = zBooleanValue;
                    fzj0Var.f75033b = zBooleanValue2;
                    fzj0Var.f75036e = 4;
                    if (((wxj0) jxj0Var).m89306b(fzj0Var) != obj) {
                        z = zBooleanValue;
                        z2 = zBooleanValue2;
                    }
                }
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89308d);
                return w2a1Var;
            }
            z2 = fzj0Var.f75033b;
            z = fzj0Var.f75032a;
            bga.m29073P(objM89308d);
        }
        fzj0Var.f75032a = z;
        fzj0Var.f75033b = z2;
        fzj0Var.f75036e = 5;
        return m46215l(fzj0Var) == obj ? obj : w2a1Var;
        String str = (String) objM89308d;
        if (str != null) {
            if (m46213j()) {
                uyf0 uyf0Var = new uyf0(this, str, (fbk) null, 7);
                fzj0Var.f75036e = 3;
                objM89308d = kk40.m56684z(uyf0Var, fzj0Var);
                if (objM89308d != obj) {
                    pqm0 pqm0Var2 = (pqm0) objM89308d;
                    zBooleanValue = ((Boolean) pqm0Var2.f180350a).booleanValue();
                    zBooleanValue2 = ((Boolean) pqm0Var2.f180351b).booleanValue();
                    if (zBooleanValue) {
                        ((hdc) this.f85970k.get()).m47184a();
                    } else {
                        ((hdc) this.f85970k.get()).m47184a();
                    }
                    if (zBooleanValue) {
                        jxj0Var = (jxj0) er70Var.get();
                        fzj0Var.f75032a = zBooleanValue;
                        fzj0Var.f75033b = zBooleanValue2;
                        fzj0Var.f75036e = 4;
                        if (((wxj0) jxj0Var).m89306b(fzj0Var) != obj) {
                            z = zBooleanValue;
                            z2 = zBooleanValue2;
                            fzj0Var.f75032a = z;
                            fzj0Var.f75033b = z2;
                            fzj0Var.f75036e = 5;
                            if (m46215l(fzj0Var) == obj) {
                            }
                        }
                    }
                }
            } else {
                jxj0 jxj0Var3 = (jxj0) er70Var.get();
                fzj0Var.f75036e = 2;
                if (((wxj0) jxj0Var3).m89306b(fzj0Var) == obj) {
                }
            }
        }
    }
}
