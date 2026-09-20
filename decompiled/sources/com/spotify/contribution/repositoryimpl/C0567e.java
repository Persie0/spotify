package com.spotify.contribution.repositoryimpl;

import com.spotify.contribution.model.ContributionPartialCreateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p204p.bga;
import p204p.c6x0;
import p204p.efk;
import p204p.eik;
import p204p.ffk;
import p204p.g6f;
import p204p.geg1;
import p204p.gfk;
import p204p.hra;
import p204p.i6f;
import p204p.ibk;
import p204p.ifk;
import p204p.jik;
import p204p.k49;
import p204p.kik;
import p204p.lau;
import p204p.lik;
import p204p.mnq;
import p204p.ock;
import p204p.pqm0;
import p204p.pwb;
import p204p.s5l;
import p204p.s6x0;
import p204p.t9a1;
import p204p.u5l;
import p204p.w2a1;
import p204p.xhk;
import p204p.yuk;

/* JADX INFO: renamed from: com.spotify.contribution.repositoryimpl.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0567e implements eik {

    /* JADX INFO: renamed from: a */
    public final C0563a f3470a;

    /* JADX INFO: renamed from: b */
    public final ifk f3471b;

    public C0567e(C0563a c0563a, ifk ifkVar) {
        this.f3470a = c0563a;
        this.f3471b = ifkVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:47:0x00fc->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r10 == r4) goto L51;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8034a(List list, ibk ibkVar) {
        jik jikVar;
        Iterator it;
        int i;
        List list2;
        int i2;
        efk efkVar;
        if (ibkVar instanceof jik) {
            jikVar = (jik) ibkVar;
            int i3 = jikVar.f112784h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jikVar.f112784h = i3 - Integer.MIN_VALUE;
            } else {
                jikVar = new jik(this, ibkVar);
            }
        } else {
            jikVar = new jik(this, ibkVar);
        }
        Object objM8028a = jikVar.f112782f;
        int i4 = jikVar.f112784h;
        Object obj = yuk.f276404a;
        if (i4 != 0) {
            if (i4 == 1) {
                list = jikVar.f112777a;
                bga.m29073P(objM8028a);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = jikVar.f112781e;
                i2 = jikVar.f112780d;
                it = jikVar.f112779c;
                list2 = jikVar.f112778b;
                bga.m29073P(objM8028a);
            }
            while (it.hasNext()) {
                s5l s5lVar = (s5l) it.next();
                efkVar = new efk(s5lVar.m77282b(), s5lVar.m77281a());
                jikVar.f112777a = null;
                jikVar.f112778b = list2;
                jikVar.f112779c = it;
                jikVar.f112780d = i2;
                jikVar.f112781e = i;
                jikVar.f112784h = 2;
                if (this.f3471b.mo39393b(efkVar, jikVar) == obj) {
                    return obj;
                }
            }
            return list2;
        }
        bga.m29073P(objM8028a);
        if (list.isEmpty()) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            s5l s5lVar2 = (s5l) it2.next();
            arrayList.add(new u5l(s5lVar2.m77282b(), s5lVar2.m77281a()));
        }
        jikVar.f112777a = list;
        jikVar.f112784h = 1;
        objM8028a = this.f3470a.m8028a(arrayList, jikVar);
        List list3 = (List) objM8028a;
        if (list3.size() != list.size()) {
            throw ContributionApiError.EmptyResponse.f3454a;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (pqm0 pqm0Var : g6f.m43746s1(list, list3)) {
            s5l s5lVar3 = (s5l) pqm0Var.f180350a;
            Object objM55358a = ((k49) pqm0Var.f180351b).m55358a();
            if (!(objM55358a instanceof c6x0)) {
                arrayList2.add((ock) objM55358a);
            }
            Throwable thM77348a = s6x0.m77348a(objM55358a);
            if (thM77348a != null) {
                arrayList3.add(new xhk(s5lVar3, thM77348a));
            }
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList2.isEmpty()) {
                throw ((xhk) g6f.m43741q0(arrayList3)).m91063a();
            }
            throw new ContributionPartialCreateException(arrayList2, arrayList3);
        }
        it = list.iterator();
        i = 0;
        list2 = arrayList2;
        i2 = 0;
        while (it.hasNext()) {
            s5l s5lVar4 = (s5l) it.next();
            efkVar = new efk(s5lVar4.m77282b(), s5lVar4.m77281a());
            jikVar.f112777a = null;
            jikVar.f112778b = list2;
            jikVar.f112779c = it;
            jikVar.f112780d = i2;
            jikVar.f112781e = i;
            jikVar.f112784h = 2;
            if (this.f3471b.mo39393b(efkVar, jikVar) == obj) {
                return obj;
            }
        }
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r5.f3471b.mo39393b(r8, r0) == r4) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8035b(String str, pwb pwbVar, ibk ibkVar) throws ContributionApiError.EmptyResponse {
        kik kikVar;
        if (ibkVar instanceof kik) {
            kikVar = (kik) ibkVar;
            int i = kikVar.f123003e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kikVar.f123003e = i - Integer.MIN_VALUE;
            } else {
                kikVar = new kik(this, ibkVar);
            }
        } else {
            kikVar = new kik(this, ibkVar);
        }
        Object objM8029b = kikVar.f123001c;
        int i2 = kikVar.f123003e;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                pwbVar = kikVar.f123000b;
                str = kikVar.f122999a;
                bga.m29073P(objM8029b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM8029b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM8029b);
        List listM44518y = geg1.m44518y(new mnq(str));
        kikVar.f122999a = str;
        kikVar.f123000b = pwbVar;
        kikVar.f123003e = 1;
        objM8029b = this.f3470a.m8029b(listM44518y, kikVar);
        if (objM8029b != obj) {
        }
        return obj;
        k49 k49Var = (k49) g6f.m43745s0((List) objM8029b);
        if (k49Var == null) {
            throw ContributionApiError.EmptyResponse.f3454a;
        }
        bga.m29073P(k49Var.m55358a());
        ffk ffkVar = new ffk(pwbVar, str);
        kikVar.f122999a = null;
        kikVar.f123000b = null;
        kikVar.f123003e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m8036c(String str, pwb pwbVar, hra hraVar, ibk ibkVar) {
        lik likVar;
        if (ibkVar instanceof lik) {
            likVar = (lik) ibkVar;
            int i = likVar.f133815g;
            if ((i & Integer.MIN_VALUE) != 0) {
                likVar.f133815g = i - Integer.MIN_VALUE;
            } else {
                likVar = new lik(this, ibkVar);
            }
        } else {
            likVar = new lik(this, ibkVar);
        }
        Object objM8032e = likVar.f133813e;
        int i2 = likVar.f133815g;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM8032e);
            List listM44518y = geg1.m44518y(new t9a1(str, hraVar));
            likVar.f133809a = str;
            likVar.f133810b = pwbVar;
            likVar.f133811c = hraVar;
            likVar.f133815g = 1;
            objM8032e = this.f3470a.m8032e(listM44518y, likVar);
            if (objM8032e != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ock ockVar = likVar.f133812d;
            bga.m29073P(objM8032e);
            return ockVar;
        }
        hraVar = likVar.f133811c;
        pwbVar = likVar.f133810b;
        str = likVar.f133809a;
        bga.m29073P(objM8032e);
        k49 k49Var = (k49) g6f.m43745s0((List) objM8032e);
        if (k49Var != null) {
            Object objM55358a = k49Var.m55358a();
            bga.m29073P(objM55358a);
            ock ockVar2 = (ock) objM55358a;
            if (ockVar2 != null) {
                gfk gfkVar = new gfk(pwbVar, str, hraVar);
                likVar.f133809a = null;
                likVar.f133810b = null;
                likVar.f133811c = null;
                likVar.f133812d = ockVar2;
                likVar.f133815g = 2;
                return this.f3471b.mo39393b(gfkVar, likVar) == obj ? obj : ockVar2;
            }
        }
        throw ContributionApiError.EmptyResponse.f3454a;
    }
}
