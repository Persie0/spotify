package p204p;

import android.os.Bundle;
import android.util.Log;
import com.spotify.ads.esperanto.proto.DeleteRequestHeadersRequest;
import com.spotify.music.R;
import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class q2y0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184726a;

    /* JADX INFO: renamed from: b */
    public int f184727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f184728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2y0(Object obj, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f184726a = i;
        this.f184728c = obj;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f184726a) {
            case 0:
                return new q2y0((r2y0) this.f184728c, fbkVar, 0);
            case 1:
                return new q2y0((clq0) this.f184728c, fbkVar, 1);
            case 2:
                return new q2y0((m8y0) this.f184728c, fbkVar, 2);
            case 3:
                return new q2y0((hhy0) this.f184728c, fbkVar, 3);
            case 4:
                return new q2y0((qiy0) this.f184728c, fbkVar, 4);
            case 5:
                return new q2y0((C2169nm) this.f184728c, fbkVar, 5);
            case 6:
                return new q2y0((iqp0) this.f184728c, fbkVar, 6);
            case 7:
                return new q2y0((tly0) this.f184728c, fbkVar, 7);
            case 8:
                return new q2y0((rvw0) this.f184728c, fbkVar, 8);
            case 9:
                return new q2y0((jez0) this.f184728c, fbkVar, 9);
            case 10:
                return new q2y0((m8y0) this.f184728c, fbkVar, 10);
            case 11:
                return new q2y0((ljz0) this.f184728c, fbkVar, 11);
            case 12:
                return new q2y0((szz0) this.f184728c, fbkVar, 12);
            case 13:
                return new q2y0((String) this.f184728c, fbkVar, 13);
            case 14:
                return new q2y0((SetPlaylistPictureWorker) this.f184728c, fbkVar, 14);
            case 15:
                return new q2y0((j901) this.f184728c, fbkVar, 15);
            case 16:
                return new q2y0((izh) this.f184728c, fbkVar, 16);
            case 17:
                return new q2y0((wb40) this.f184728c, fbkVar, 17);
            case 18:
                return new q2y0((eu01) this.f184728c, fbkVar, 18);
            case 19:
                return new q2y0((wx01) this.f184728c, fbkVar, 19);
            case 20:
                return new q2y0((p111) this.f184728c, fbkVar, 20);
            case 21:
                return new q2y0((hg11) this.f184728c, fbkVar, 21);
            case 22:
                return new q2y0((m6a) this.f184728c, fbkVar, 22);
            case 23:
                return new q2y0((sx11) this.f184728c, fbkVar, 23);
            case 24:
                return new q2y0((ky11) this.f184728c, fbkVar, 24);
            case 25:
                return new q2y0((k021) this.f184728c, fbkVar, 25);
            case 26:
                return new q2y0((z021) this.f184728c, fbkVar, 26);
            case 27:
                return new q2y0((t621) this.f184728c, fbkVar, 27);
            case 28:
                return new q2y0((khy0) this.f184728c, fbkVar, 28);
            default:
                return new q2y0((a531) this.f184728c, fbkVar, 29);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f184726a) {
            case 0:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 1:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 2:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 3:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 4:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 5:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 6:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 7:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 8:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 9:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 10:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 11:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 12:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 13:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 14:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 15:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 16:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 17:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 18:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 19:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 20:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 21:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 22:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 23:
                ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 24:
                ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 25:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 26:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 27:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 28:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
            default:
                return ((q2y0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.util.List] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM63326w;
        Object objM62049a;
        Object objM50221b;
        switch (this.f184726a) {
            case 0:
                w2a1 w2a1Var = w2a1.f247311a;
                yuk yukVar = yuk.f276404a;
                int i = this.f184727b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                whp whpVar = ((r2y0) this.f184728c).f195256a;
                this.f184727b = 1;
                umn umnVar = (umn) whpVar.f251419b;
                Object objCollect = mvl0.m62953p(mvl0.m62953p(new nmp(8, (luk0) umnVar.f231918e, umnVar))).collect(new hop(new ncp(whpVar, 4), 12), this);
                if (objCollect != yukVar) {
                    objCollect = w2a1Var;
                }
                if (objCollect != yukVar) {
                    objCollect = w2a1Var;
                }
                return objCollect == yukVar ? yukVar : w2a1Var;
            case 1:
                w2a1 w2a1Var2 = w2a1.f247311a;
                clq0 clq0Var = (clq0) this.f184728c;
                pvf0 pvf0Var = (pvf0) clq0Var.f39343e;
                yuk yukVar2 = yuk.f276404a;
                int i2 = this.f184727b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    yz80 yz80Var = (yz80) clq0Var.f39342d;
                    String str = pvf0Var.f181735a;
                    rg61 rg61Var = rg61.f198874g;
                    this.f184727b = 1;
                    objM63326w = ((n090) yz80Var).m63326w(str, rg61Var, this);
                    if (objM63326w != yukVar2) {
                    }
                    return yukVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var2;
                }
                bga.m29073P(obj);
                objM63326w = obj;
                ((p2x0) objM63326w).m68971d();
                wt80 wt80Var = (wt80) clq0Var.f39341c;
                String str2 = pvf0Var.f181735a;
                String str3 = pvf0Var.f181736b.f17788b;
                this.f184727b = 2;
                Object objM86755t = vyf1.m86755t(new be11(((mu80) wt80Var).m62848m(str2, str3, i221.f97709a), 2), this);
                if (objM86755t != yukVar2) {
                    objM86755t = w2a1Var2;
                }
                if (objM86755t != yukVar2) {
                    return w2a1Var2;
                }
                return yukVar2;
            case 2:
                yuk yukVar3 = yuk.f276404a;
                int i3 = this.f184727b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    ykr0 ykr0Var = ((m8y0) this.f184728c).f141173c;
                    this.f184727b = 1;
                    if (ykr0Var.m94120e(true, this) == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 3:
                hhy0 hhy0Var = (hhy0) this.f184728c;
                AtomicReference atomicReference = hhy0Var.f91617d;
                yuk yukVar4 = yuk.f276404a;
                int i4 = this.f184727b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    if (atomicReference.get() != null) {
                        lsi0 lsi0Var = hhy0Var.f91618e;
                        this.f184727b = 1;
                        if (lsi0Var.mo54248a(this) == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                atomicReference.set(null);
                return w2a1.f247311a;
            case 4:
                w2a1 w2a1Var3 = w2a1.f247311a;
                qiy0 qiy0Var = (qiy0) this.f184728c;
                yuk yukVar5 = yuk.f276404a;
                int i5 = this.f184727b;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    mjy0 mjy0Var = (mjy0) qiy0Var.f189095a.get();
                    this.f184727b = 1;
                    objM62049a = mjy0Var.m62049a(this);
                    if (objM62049a != yukVar5) {
                    }
                    return yukVar5;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var3;
                }
                bga.m29073P(obj);
                objM62049a = obj;
                d850 d850Var = (d850) objM62049a;
                if (d850Var == null) {
                    z650.Companion.getClass();
                    d850Var = new d850(new z650(""), null);
                }
                hjy0 hjy0Var = (hjy0) qiy0Var.f189096b.get();
                this.f184727b = 2;
                Object objEmit = hjy0Var.f92291a.emit(d850Var, this);
                if (objEmit != yukVar5) {
                    objEmit = w2a1Var3;
                }
                if (objEmit != yukVar5) {
                    return w2a1Var3;
                }
                return yukVar5;
            case 5:
                w2a1 w2a1Var4 = w2a1.f247311a;
                yuk yukVar6 = yuk.f276404a;
                int i6 = this.f184727b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var4;
                }
                bga.m29073P(obj);
                C2169nm c2169nm = (C2169nm) this.f184728c;
                sjy0 sjy0Var = (sjy0) c2169nm.f155201g;
                fbk fbkVar = null;
                nzx0 nzx0Var = new nzx0(new ilw0(c2169nm, fbkVar, 20));
                this.f184727b = 1;
                Object objM89557A = x0h1.m89557A(sjy0Var.f209951d, new ilw0(sjy0Var, nzx0Var, Bundle.EMPTY, fbkVar, 19), this);
                if (objM89557A != yukVar6) {
                    objM89557A = w2a1Var4;
                }
                return objM89557A == yukVar6 ? yukVar6 : w2a1Var4;
            case 6:
                iqp0 iqp0Var = (iqp0) this.f184728c;
                yuk yukVar7 = yuk.f276404a;
                int i7 = this.f184727b;
                if (i7 == 0) {
                    bga.m29073P(obj);
                    nnc nncVarM92074U = xtm0.m92074U((fiz) iqp0Var.f104822c, new nto0((fbk) null, iqp0Var, 25));
                    ldp0 ldp0Var = new ldp0(iqp0Var, 25);
                    this.f184727b = 1;
                    if (nncVarM92074U.collect(ldp0Var, this) == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 7:
                yuk yukVar8 = yuk.f276404a;
                int i8 = this.f184727b;
                if (i8 == 0) {
                    bga.m29073P(obj);
                    long j = ((tly0) this.f184728c).f221541d;
                    this.f184727b = 1;
                    if (njg1.m64619l(j, this) == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                tly0 tly0Var = (tly0) this.f184728c;
                ezw0 ezw0Var = tly0Var.f221540c;
                synchronized (ezw0Var) {
                    try {
                        ezw0Var.f64487d = null;
                        Set setM77305h0 = s601.m77305h0((Set) ezw0Var.f64485b, (LinkedHashSet) ezw0Var.f64486c);
                        if (!setM77305h0.isEmpty()) {
                            Set set = setM77305h0;
                            ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new pqm0((k35) it.next(), new mjo(new jjo("Scroll card loading timed out"))));
                            }
                            ((LinkedHashSet) ezw0Var.f64486c).addAll(setM77305h0);
                            tly0Var.f221539b.invoke(arrayList);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return w2a1.f247311a;
            case 8:
                yuk yukVar9 = yuk.f276404a;
                int i9 = this.f184727b;
                if (i9 == 0) {
                    bga.m29073P(obj);
                    rvw0 rvw0Var = (rvw0) this.f184728c;
                    scz0 scz0Var = (scz0) rvw0Var.f203143e;
                    if (scz0Var != 0) {
                        ?? r1 = rvw0Var.f203146h;
                        this.f184727b = 1;
                        if (scz0Var.mo42946b(r1, this) == yukVar9) {
                            return yukVar9;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 9:
                yuk yukVar10 = yuk.f276404a;
                int i10 = this.f184727b;
                if (i10 == 0) {
                    bga.m29073P(obj);
                    jez0 jez0Var = (jez0) this.f184728c;
                    this.f184727b = 1;
                    if (jez0.m53134G1(jez0Var, this) == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 10:
                yuk yukVar11 = yuk.f276404a;
                int i11 = this.f184727b;
                if (i11 == 0) {
                    bga.m29073P(obj);
                    ykr0 ykr0Var2 = ((m8y0) this.f184728c).f141173c;
                    this.f184727b = 1;
                    if (ykr0Var2.m94121f(true, this) == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 11:
                w2a1 w2a1Var5 = w2a1.f247311a;
                ljz0 ljz0Var = (ljz0) this.f184728c;
                yuk yukVar12 = yuk.f276404a;
                int i12 = this.f184727b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var5;
                }
                bga.m29073P(obj);
                hb11 hb11Var = ljz0Var.f134186b.f196630f;
                up60 up60VarMo54112b = qpv0.f191387a.mo54112b(iwi.class);
                ldp0 ldp0Var2 = new ldp0(ljz0Var, 28);
                this.f184727b = 1;
                hb11Var.collect(new ady0(new hhq(29, ldp0Var2, up60VarMo54112b), 13), this);
                return yukVar12;
            case 12:
                yuk yukVar13 = yuk.f276404a;
                int i13 = this.f184727b;
                if (i13 == 0) {
                    bga.m29073P(obj);
                    szz0 szz0Var = (szz0) this.f184728c;
                    r1a r1aVar = szz0Var.f215704d;
                    ozz0 ozz0Var = new ozz0(szz0Var, 0);
                    this.f184727b = 1;
                    if (r1aVar.collect(ozz0Var, this) == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 13:
                yuk yukVar14 = yuk.f276404a;
                int i14 = this.f184727b;
                if (i14 == 0) {
                    bga.m29073P(obj);
                    ibz ibzVar = ibz.f100691a;
                    this.f184727b = 1;
                    objM50221b = ibzVar.m50221b(this);
                    if (objM50221b == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    objM50221b = obj;
                }
                Collection<s2l> collectionValues = ((Map) objM50221b).values();
                String str4 = (String) this.f184728c;
                for (s2l s2lVar : collectionValues) {
                    s2lVar.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    rb5 rb5Var = s2lVar.f205028b;
                    synchronized (rb5Var) {
                        if (!Objects.equals((String) rb5Var.f197473d, str4)) {
                            rb5.m75142E((twy) rb5Var.f197471b, (String) rb5Var.f197472c, str4);
                            rb5Var.f197473d = str4;
                        }
                        break;
                    }
                    m301.f139496a.toString();
                }
                return w2a1.f247311a;
            case 14:
                Integer numValueOf = Integer.valueOf(R.string.edit_playlist_change_image_failed_snackbar_text);
                yuk yukVar15 = yuk.f276404a;
                int i15 = this.f184727b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                SetPlaylistPictureWorker setPlaylistPictureWorker = (SetPlaylistPictureWorker) this.f184728c;
                this.f184727b = 1;
                hqb hqbVar = new hqb(1, seg1.m77914f(this));
                hqbVar.m48222q();
                q831 q831Var = setPlaylistPictureWorker.f6461i;
                if (q831Var == null) {
                    wj50.m88260d0("snackbarManager");
                    throw null;
                }
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                q831Var.m72305j(new g631(null, "", numValueOf, null, Integer.valueOf(R.string.edit_playlist_change_image_failed_snackbar_retry_action), new hta0(hqbVar, 28), null, null, false));
                Object objM48221p = hqbVar.m48221p();
                return objM48221p == yukVar15 ? yukVar15 : objM48221p;
            case 15:
                yuk yukVar16 = yuk.f276404a;
                int i16 = this.f184727b;
                if (i16 == 0) {
                    bga.m29073P(obj);
                    i801 i801Var = ((j901) this.f184728c).f110070a;
                    lpq lpqVarM2643p = DeleteRequestHeadersRequest.m2643p();
                    lpqVarM2643p.m59676m();
                    lpqVarM2643p.m59677q();
                    DeleteRequestHeadersRequest deleteRequestHeadersRequest = (DeleteRequestHeadersRequest) lpqVarM2643p.build();
                    this.f184727b = 1;
                    if (i801Var.m49899a(deleteRequestHeadersRequest, this) == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return fv0.f73611a;
            case 16:
                izh izhVar = (izh) this.f184728c;
                yuk yukVar17 = yuk.f276404a;
                int i17 = this.f184727b;
                if (i17 == 0) {
                    bga.m29073P(obj);
                    fiz fizVarM62953p = mvl0.m62953p(new lcw0(((fmu0) izhVar.f107231t).mo26211a(), 24));
                    go3 go3Var = new go3(izhVar, null, 15);
                    this.f184727b = 1;
                    if (wxf1.m89250g(fizVarM62953p, go3Var, this) == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 17:
                yuk yukVar18 = yuk.f276404a;
                int i18 = this.f184727b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                Single singleM60183i = ((lxe) ((wb40) this.f184728c)).m60183i();
                this.f184727b = 1;
                Object objM96567o = zn91.m96567o(singleM60183i, this);
                return objM96567o == yukVar18 ? yukVar18 : objM96567o;
            case 18:
                yuk yukVar19 = yuk.f276404a;
                int i19 = this.f184727b;
                if (i19 == 0) {
                    bga.m29073P(obj);
                    eu01 eu01Var = (eu01) this.f184728c;
                    fiz fizVar = eu01Var.f62836L0;
                    ozz0 ozz0Var2 = new ozz0(eu01Var, 1);
                    this.f184727b = 1;
                    if (fizVar.collect(ozz0Var2, this) == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 19:
                w2a1 w2a1Var6 = w2a1.f247311a;
                wx01 wx01Var = (wx01) this.f184728c;
                yuk yukVar20 = yuk.f276404a;
                int i20 = this.f184727b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var6;
                }
                bga.m29073P(obj);
                pox poxVarM76722t = ryf1.m76722t(((tq80) wx01Var.f255871b).m81306d(), 1);
                vx01 vx01Var = new vx01(wx01Var, null, 0);
                this.f184727b = 1;
                Object objCollect2 = poxVarM76722t.collect(new v1a(12, voj0.f243489a, vx01Var), this);
                if (objCollect2 != yukVar20) {
                    objCollect2 = w2a1Var6;
                }
                if (objCollect2 != yukVar20) {
                    objCollect2 = w2a1Var6;
                }
                return objCollect2 == yukVar20 ? yukVar20 : w2a1Var6;
            case 20:
                p111 p111Var = (p111) this.f184728c;
                yuk yukVar21 = yuk.f276404a;
                int i21 = this.f184727b;
                if (i21 == 0) {
                    bga.m29073P(obj);
                    fiz fizVarM60398b = p111Var.f172925i.m60398b(new k011(qpv0.f191387a.mo54112b(ccr0.class), null));
                    ozz0 ozz0Var3 = new ozz0(p111Var, 2);
                    this.f184727b = 1;
                    if (fizVarM60398b.collect(ozz0Var3, this) == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 21:
                hg11 hg11Var = (hg11) this.f184728c;
                yuk yukVar22 = yuk.f276404a;
                int i22 = this.f184727b;
                if (i22 == 0) {
                    bga.m29073P(obj);
                    gw4 gw4Var = hg11Var.f90998S0;
                    Float f = new Float(2.0f);
                    int i23 = 2;
                    im91 im91VarM53259E = jg31.m53259E(1000, 0, iqs.f104839a, 2);
                    int iM38547C = edb.m38547C(hg11Var.f90996Q0);
                    if (iM38547C == 0) {
                        i23 = 1;
                    } else if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cp40 cp40VarM53275n = jg31.m53275n(im91VarM53259E, i23, 0L, 4);
                    this.f184727b = 1;
                    if (gw4.m45909c(gw4Var, f, cp40VarM53275n, null, null, this, 12) == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 22:
                yuk yukVar23 = yuk.f276404a;
                int i24 = this.f184727b;
                if (i24 == 0) {
                    bga.m29073P(obj);
                    e3p e3pVar = (e3p) ((m6a) this.f184728c).f140439c;
                    this.f184727b = 1;
                    if (e3pVar.m37658C(this) == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 23:
                yuk yukVar24 = yuk.f276404a;
                int i25 = this.f184727b;
                if (i25 == 0) {
                    bga.m29073P(obj);
                    sx11 sx11Var = (sx11) this.f184728c;
                    nuu0 nuu0Var = sx11Var.f214777t1;
                    ozz0 ozz0Var4 = new ozz0(sx11Var, 5);
                    this.f184727b = 1;
                    if (nuu0Var.f158717a.collect(ozz0Var4, this) == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                throw new KotlinNothingValueException();
            case 24:
                yuk yukVar25 = yuk.f276404a;
                int i26 = this.f184727b;
                if (i26 == 0) {
                    bga.m29073P(obj);
                    ky11 ky11Var = (ky11) this.f184728c;
                    nuu0 nuu0Var2 = ky11Var.f127624a.f214773p1;
                    ozz0 ozz0Var5 = new ozz0(ky11Var, 6);
                    this.f184727b = 1;
                    if (nuu0Var2.f158717a.collect(ozz0Var5, this) == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                throw new KotlinNothingValueException();
            case 25:
                k021 k021Var = (k021) this.f184728c;
                yuk yukVar26 = yuk.f276404a;
                int i27 = this.f184727b;
                if (i27 == 0) {
                    bga.m29073P(obj);
                    wxm0 wxm0Var = k021Var.f117853F1;
                    if (wxm0Var == null) {
                        wj50.m88260d0("poller");
                        throw null;
                    }
                    nzx0 nzx0VarM89317a = wxm0.m89317a(wxm0Var, k021Var.m49702X0());
                    mq1 mq1Var = mq1.f146131d;
                    this.f184727b = 1;
                    if (nzx0VarM89317a.collect(mq1Var, this) == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 26:
                z021 z021Var = (z021) this.f184728c;
                yuk yukVar27 = yuk.f276404a;
                int i28 = this.f184727b;
                if (i28 == 0) {
                    bga.m29073P(obj);
                    wxm0 wxm0Var2 = z021Var.f277939C1;
                    if (wxm0Var2 == null) {
                        wj50.m88260d0("poller");
                        throw null;
                    }
                    nzx0 nzx0VarM89317a2 = wxm0.m89317a(wxm0Var2, z021Var.m49702X0());
                    mq1 mq1Var2 = mq1.f146132e;
                    this.f184727b = 1;
                    if (nzx0VarM89317a2.collect(mq1Var2, this) == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 27:
                yuk yukVar28 = yuk.f276404a;
                int i29 = this.f184727b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                ood0 ood0Var = ((t621) this.f184728c).f217430h;
                this.f184727b = 1;
                v34 v34Var = (v34) ood0Var.f167566c;
                Object objM67500w = !v34Var.m84531a() ? mh2.f143687a : ood0Var.m67500w(v34Var.m84533c(), "signup", this, false);
                return objM67500w == yukVar28 ? yukVar28 : objM67500w;
            case 28:
                w2a1 w2a1Var7 = w2a1.f247311a;
                yuk yukVar29 = yuk.f276404a;
                int i30 = this.f184727b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var7;
                }
                bga.m29073P(obj);
                khy0 khy0Var = (khy0) this.f184728c;
                this.f184727b = 1;
                fiz fizVar2 = (fiz) khy0Var.f122743c;
                Object objM56684z = kk40.m56684z(new qaf(ryf1.m76713k(fizVar2, 1), fizVar2, new ozz0(khy0Var, 7), new vak0(3, 29, (fbk) null), null), this);
                if (objM56684z != yukVar29) {
                    objM56684z = w2a1Var7;
                }
                if (objM56684z != yukVar29) {
                    objM56684z = w2a1Var7;
                }
                return objM56684z == yukVar29 ? yukVar29 : w2a1Var7;
            default:
                yuk yukVar30 = yuk.f276404a;
                int i31 = this.f184727b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                frv0 frv0Var = (frv0) ((a531) this.f184728c).f12414b;
                this.f184727b = 1;
                Object objM42512h = frv0Var.m42512h(this);
                return objM42512h == yukVar30 ? yukVar30 : objM42512h;
        }
    }
}
