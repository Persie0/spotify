package p204p;

import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class imi0 {

    /* JADX INFO: renamed from: a */
    public final String f103709a;

    /* JADX INFO: renamed from: b */
    public final fwk0 f103710b;

    /* JADX INFO: renamed from: c */
    public final Object f103711c = new Object();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f103712d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public Set f103713e = gbu.f78413a;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f103714f = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f103715g = new LinkedHashSet();

    /* JADX INFO: renamed from: h */
    public final zv41 f103716h;

    /* JADX INFO: renamed from: i */
    public final luu0 f103717i;

    /* JADX INFO: renamed from: j */
    public final fiz f103718j;

    public imi0(String str, fwk0 fwk0Var, tlp tlpVar) {
        this.f103709a = str;
        this.f103710b = fwk0Var;
        zv41 zv41VarM52819d = jag1.m52819d(wzj.f256618a);
        this.f103716h = zv41VarM52819d;
        fbk fbkVar = null;
        luu0 luu0VarM31027s = bzf1.m31027s(new r1a(new vjz(new nzx0(new rph0(this, fbkVar, 9)), new hmi0(4, 0, fbkVar)), new kb7(2, this, imi0.class, "handleContextResponse", "handleContextResponse(Lcom/spotify/offline_esperanto/proto/EsOffline$GetContextsResponse;)V", 4, 8), 8), kk40.m56661c(opo.m67570t(njg1.m64613f(), tlpVar)), new cs41(5000L, 0L), 1);
        this.f103717i = luu0VarM31027s;
        this.f103718j = mvl0.m62953p(xtm0.m92105z(zv41VarM52819d, new nzx0(new rph0(luu0VarM31027s, fbkVar, 10))));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {, blocks: (B:35:0x00ae, B:37:0x00b6), top: B:50:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m51095a(String str, ibk ibkVar) {
        dmi0 dmi0Var;
        List listM43710X0;
        String str2;
        rlv0 rlv0Var;
        if (ibkVar instanceof dmi0) {
            dmi0Var = (dmi0) ibkVar;
            int i = dmi0Var.f50540e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmi0Var.f50540e = i - Integer.MIN_VALUE;
            } else {
                dmi0Var = new dmi0(this, ibkVar);
            }
        } else {
            dmi0Var = new dmi0(this, ibkVar);
        }
        Object objM51096b = dmi0Var.f50538c;
        Object obj = yuk.f276404a;
        int i2 = dmi0Var.f50540e;
        if (i2 == 0) {
            bga.m29073P(objM51096b);
            dmi0Var.f50536a = str;
            dmi0Var.f50540e = 1;
            objM51096b = m51096b(dmi0Var);
            if (objM51096b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = dmi0Var.f50536a;
            bga.m29073P(objM51096b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rlv0Var = dmi0Var.f50537b;
            str2 = dmi0Var.f50536a;
            bga.m29073P(objM51096b);
        }
        if (!((Boolean) objM51096b).booleanValue()) {
            synchronized (this.f103711c) {
                if (this.f103714f.remove(str2)) {
                    ((zv41) m51099e(str2)).m97090l(rlv0Var.f200373a);
                }
            }
        }
        return w2a1.f247311a;
        if (!((Boolean) objM51096b).booleanValue()) {
            return w2a1.f247311a;
        }
        rlv0 rlv0Var2 = new rlv0();
        synchronized (this.f103711c) {
            this.f103714f.add(str);
            this.f103715g.remove(str);
            lqi0 lqi0VarM51099e = m51099e(str);
            rlv0Var2.f200373a = ((zv41) lqi0VarM51099e).getValue();
            ((zv41) lqi0VarM51099e).m97091m(null, mtb1.f147017b);
            listM43710X0 = g6f.m43710X0(g6f.m43712Z0(g6f.m43738o1(this.f103713e, this.f103714f), this.f103715g));
        }
        dmi0Var.f50536a = str;
        dmi0Var.f50537b = rlv0Var2;
        dmi0Var.f50540e = 2;
        Object objM51098d = m51098d(listM43710X0, dmi0Var);
        if (objM51098d != obj) {
            str2 = str;
            rlv0Var = rlv0Var2;
            objM51096b = objM51098d;
            if (!((Boolean) objM51096b).booleanValue()) {
                synchronized (this.f103711c) {
                    if (this.f103714f.remove(str2)) {
                        ((zv41) m51099e(str2)).m97090l(rlv0Var.f200373a);
                    }
                }
            }
            return w2a1.f247311a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m51096b(ibk ibkVar) {
        emi0 emi0Var;
        if (ibkVar instanceof emi0) {
            emi0Var = (emi0) ibkVar;
            int i = emi0Var.f60926c;
            if ((i & Integer.MIN_VALUE) != 0) {
                emi0Var.f60926c = i - Integer.MIN_VALUE;
            } else {
                emi0Var = new emi0(this, ibkVar);
            }
        } else {
            emi0Var = new emi0(this, ibkVar);
        }
        Object obj = emi0Var.f60924a;
        int i2 = emi0Var.f60926c;
        boolean z = true;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                l2i0 l2i0Var = new l2i0(this, null, 3);
                emi0Var.f60926c = 1;
                Object objM76978s = s1h1.m76978s(10000L, l2i0Var, emi0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (TimeoutCancellationException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {, blocks: (B:35:0x00ae, B:37:0x00b6), top: B:50:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m51097c(String str, ibk ibkVar) {
        fmi0 fmi0Var;
        List listM43710X0;
        String str2;
        rlv0 rlv0Var;
        if (ibkVar instanceof fmi0) {
            fmi0Var = (fmi0) ibkVar;
            int i = fmi0Var.f71060e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fmi0Var.f71060e = i - Integer.MIN_VALUE;
            } else {
                fmi0Var = new fmi0(this, ibkVar);
            }
        } else {
            fmi0Var = new fmi0(this, ibkVar);
        }
        Object objM51096b = fmi0Var.f71058c;
        Object obj = yuk.f276404a;
        int i2 = fmi0Var.f71060e;
        if (i2 == 0) {
            bga.m29073P(objM51096b);
            fmi0Var.f71056a = str;
            fmi0Var.f71060e = 1;
            objM51096b = m51096b(fmi0Var);
            if (objM51096b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = fmi0Var.f71056a;
            bga.m29073P(objM51096b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rlv0Var = fmi0Var.f71057b;
            str2 = fmi0Var.f71056a;
            bga.m29073P(objM51096b);
        }
        if (!((Boolean) objM51096b).booleanValue()) {
            synchronized (this.f103711c) {
                if (this.f103715g.remove(str2)) {
                    ((zv41) m51099e(str2)).m97090l(rlv0Var.f200373a);
                }
            }
        }
        return w2a1.f247311a;
        if (!((Boolean) objM51096b).booleanValue()) {
            return w2a1.f247311a;
        }
        rlv0 rlv0Var2 = new rlv0();
        synchronized (this.f103711c) {
            this.f103715g.add(str);
            this.f103714f.remove(str);
            lqi0 lqi0VarM51099e = m51099e(str);
            rlv0Var2.f200373a = ((zv41) lqi0VarM51099e).getValue();
            ((zv41) lqi0VarM51099e).m97091m(null, mtb1.f147016a);
            listM43710X0 = g6f.m43710X0(g6f.m43712Z0(g6f.m43738o1(this.f103713e, this.f103714f), this.f103715g));
        }
        fmi0Var.f71056a = str;
        fmi0Var.f71057b = rlv0Var2;
        fmi0Var.f71060e = 2;
        Object objM51098d = m51098d(listM43710X0, fmi0Var);
        if (objM51098d != obj) {
            str2 = str;
            rlv0Var = rlv0Var2;
            objM51096b = objM51098d;
            if (!((Boolean) objM51096b).booleanValue()) {
                synchronized (this.f103711c) {
                    if (this.f103715g.remove(str2)) {
                        ((zv41) m51099e(str2)).m97090l(rlv0Var.f200373a);
                    }
                }
            }
            return w2a1.f247311a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m51098d(List list, ibk ibkVar) {
        gmi0 gmi0Var;
        if (ibkVar instanceof gmi0) {
            gmi0Var = (gmi0) ibkVar;
            int i = gmi0Var.f81412c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmi0Var.f81412c = i - Integer.MIN_VALUE;
            } else {
                gmi0Var = new gmi0(this, ibkVar);
            }
        } else {
            gmi0Var = new gmi0(this, ibkVar);
        }
        Object obj = gmi0Var.f81410a;
        int i2 = gmi0Var.f81412c;
        boolean z = true;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                fwk0 fwk0Var = this.f103710b;
                amw amwVarM16125q = EsOffline$DownloadRequest.m16125q();
                amwVarM16125q.m26450r(this.f103709a);
                amwVarM16125q.m26448m(list);
                Single singleM42967a = fwk0Var.m42967a((EsOffline$DownloadRequest) amwVarM16125q.build());
                gmi0Var.f81412c = 1;
                Object objM96567o = zn91.m96567o(singleM42967a, gmi0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e */
    public final lqi0 m51099e(String str) {
        LinkedHashMap linkedHashMap = this.f103712d;
        Object objM52819d = linkedHashMap.get(str);
        if (objM52819d == null) {
            objM52819d = jag1.m52819d(mtb1.f147016a);
            linkedHashMap.put(str, objM52819d);
        }
        return (lqi0) objM52819d;
    }
}
