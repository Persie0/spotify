package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.list_collection.save_source.proto.SaveSource;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import spotify.collection.esperanto.proto.CollectionAddRemoveItem;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class o4q implements dut {

    /* JADX INFO: renamed from: L0 */
    public final cph f161717L0;

    /* JADX INFO: renamed from: X */
    public final tjo f161718X;

    /* JADX INFO: renamed from: Y */
    public final xiz f161719Y;

    /* JADX INFO: renamed from: Z */
    public final i5x f161720Z;

    /* JADX INFO: renamed from: a */
    public final yz80 f161721a;

    /* JADX INFO: renamed from: b */
    public final z6m f161722b;

    /* JADX INFO: renamed from: c */
    public final dse1 f161723c;

    /* JADX INFO: renamed from: d */
    public final pcz f161724d;

    /* JADX INFO: renamed from: e */
    public final mi80 f161725e;

    /* JADX INFO: renamed from: f */
    public final pne1 f161726f;

    /* JADX INFO: renamed from: g */
    public final z5f f161727g;

    /* JADX INFO: renamed from: h */
    public final n5f f161728h;

    /* JADX INFO: renamed from: i */
    public final pgo f161729i;

    /* JADX INFO: renamed from: t */
    public final tjo f161730t;

    public o4q(yz80 yz80Var, z6m z6mVar, dse1 dse1Var, pcz pczVar, mi80 mi80Var, pne1 pne1Var, z5f z5fVar, n5f n5fVar, pgo pgoVar) {
        this.f161721a = yz80Var;
        this.f161722b = z6mVar;
        this.f161723c = dse1Var;
        this.f161724d = pczVar;
        this.f161725e = mi80Var;
        this.f161726f = pne1Var;
        this.f161727g = z5fVar;
        this.f161728h = n5fVar;
        this.f161729i = pgoVar;
        jqv0 jqv0Var = qpv0.f191387a;
        this.f161730t = pag1.m69487w(new rko(new jqx(jqv0Var.mo54112b(n4m.class)), 1, e4q.f56162h, new pko(e4q.f56154b), e4q.f56163i), e4q.f56156c);
        this.f161718X = pag1.m69486v(new rko(new txr(jqv0Var.mo54112b(v140.class)), 1, e4q.f56164t, new pko(e4q.f56158d), e4q.f56147X), new rko(new txr(jqv0Var.mo54112b(erc1.class)), 2, e4q.f56160f, new pko(e4q.f56159e), e4q.f56161g), q6p.f185874P0);
        int i = 26;
        this.f161719Y = axf1.m27398m(new k6i(1, this, o4q.class, "getState", "getState(Lcom/spotify/alignedcuration/firstsave/page/contents/DefaultSaveDestinationElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, 0, 25), upp.f232766c1, q6p.f185873O0, null, new jhp(this, i), 8);
        this.f161720Z = mhf1.m61771p(this).m94133b(yrp.f275553Y, yrp.f275555Z);
        fyf fyfVar = new fyf(new jql(this, i), true, -1691527582);
        wpi0 wpi0Var = xwt.f266743a;
        this.f161717L0 = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: e */
    public static final void m66251e(o4q o4qVar, String str, String str2, boolean z, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        int i3;
        int i4;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1098503368);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        int i5 = i2 | 24576;
        if (xq00Var.m91752Y(i5 & 1, (i5 & 9363) != 9362)) {
            int i6 = i5 & 896;
            boolean z2 = i6 == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = z ? alz0.f17015b : alz0.f17016c;
                xq00Var.m91793t0(objM91750T);
            }
            alz0 alz0Var = (alz0) objM91750T;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I(str, mi21.m61822f(1.0f, cxh0Var));
            kyu kyuVar = new kyu(1, null, 3, zsf1.m96848h(0, 0.0f, 2), null, null, null, 0, null, 498);
            if (z) {
                i3 = -2135289987;
                i4 = R.string.f5858x775cdf47;
            } else {
                i3 = -2135128384;
                i4 = R.string.aligned_curation_first_save_default_row_add_action_description;
            }
            String strM12k = AbstractC0000a.m12k(xq00Var, i3, i4, xq00Var, false);
            boolean z3 = (i6 == 256) | ((i5 & 7168) == 2048);
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == ia7Var) {
                objM91750T2 = new r20(z, gh00Var, 9);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var = (eh00) objM91750T2;
            if (wl51.m88460J0(strM12k)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            p711.m69222a(fxh0VarM39673I, kyuVar, null, false, null, null, new peu(new t40(strM12k), eh00Var), null, null, rkk.m75772x(-1359823681, new ax5(str2, str, 3), xq00Var), null, null, rkk.m75772x(1998612161, new wqp(alz0Var, 8), xq00Var), null, null, rkk.m75772x(1358483716, new dug(str, 13), xq00Var), xq00Var, 805306432, 196992, 28092);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ms1(o4qVar, str, str2, z, gh00Var, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m66252f(o4q o4qVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1738104639);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            long j = leu.m58815a(xq00Var).f112823a.f229874a.f123094b;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b);
            cxh0 cxh0Var = cxh0.f43038a;
            p711.m69222a(epv0.m39673I("shimmer_save_row", mi21.m61822f(1.0f, cxh0Var)), new kyu(1, null, 3, zsf1.m96848h(0, 0.0f, 2), null, null, null, 0, null, 498), null, false, null, null, null, null, null, rkk.m75772x(-55057610, new xzg(j, fmx0VarM47993b, 2), xq00Var), null, null, null, null, null, rkk.m75772x(255347579, new wrf(3, j), xq00Var), xq00Var, 805306432, 196608, 32252);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvj(o4qVar, fxh0Var2, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: g */
    public static final Object m66253g(o4q o4qVar, String str, w3q w3qVar, ibk ibkVar) {
        l4q l4qVar;
        pcz pczVar = o4qVar.f161724d;
        if (ibkVar instanceof l4q) {
            l4qVar = (l4q) ibkVar;
            int i = l4qVar.f129741c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4qVar.f129741c = i - Integer.MIN_VALUE;
            } else {
                l4qVar = new l4q(o4qVar, ibkVar);
            }
        } else {
            l4qVar = new l4q(o4qVar, ibkVar);
        }
        l4q l4qVar2 = l4qVar;
        Object obj = l4qVar2.f129739a;
        int i2 = l4qVar2.f129741c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        d850 d850Var = pczVar.f176299f;
        z650 z650Var = d850Var != null ? d850Var.f46380a : null;
        qz80 qz80Var = z650Var != null ? new qz80(z650Var) : null;
        boolean z = w3qVar instanceof u3q;
        yuk yukVar = yuk.f276404a;
        if (!z) {
            if (!(w3qVar instanceof v3q)) {
                throw new NoWhenBranchMatchedException();
            }
            Single singleM63720a = o4qVar.f161728h.m63720a(m66256k(str, z650Var));
            l4qVar2.f129741c = 2;
            if (zn91.m96567o(singleM63720a, l4qVar2) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        yz80 yz80Var = o4qVar.f161721a;
        List listSingletonList = Collections.singletonList(str);
        String str2 = pczVar.f176296c;
        String str3 = ((u3q) w3qVar).f226419a;
        String str4 = pczVar.f176297d;
        l4qVar2.f129741c = 1;
        if (((n090) yz80Var).m63309f(str3, listSingletonList, str2, str4, qz80Var, l4qVar2) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m66254h(o4q o4qVar, String str, w3q w3qVar, ibk ibkVar) {
        m4q m4qVar;
        if (ibkVar instanceof m4q) {
            m4qVar = (m4q) ibkVar;
            int i = m4qVar.f140005c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4qVar.f140005c = i - Integer.MIN_VALUE;
            } else {
                m4qVar = new m4q(o4qVar, ibkVar);
            }
        } else {
            m4qVar = new m4q(o4qVar, ibkVar);
        }
        Object obj = m4qVar.f140003a;
        int i2 = m4qVar.f140005c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        d850 d850Var = o4qVar.f161724d.f176299f;
        z650 z650Var = d850Var != null ? d850Var.f46380a : null;
        boolean z = w3qVar instanceof u3q;
        yuk yukVar = yuk.f276404a;
        if (z) {
            yz80 yz80Var = o4qVar.f161721a;
            List listSingletonList = Collections.singletonList(str);
            String str2 = ((u3q) w3qVar).f226419a;
            m4qVar.f140005c = 1;
            if (((n090) yz80Var).m63317n(str2, listSingletonList, m4qVar) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        if (!(w3qVar instanceof v3q)) {
            throw new NoWhenBranchMatchedException();
        }
        Single singleM63722c = o4qVar.f161728h.m63722c(m66256k(str, z650Var));
        m4qVar.f140005c = 2;
        if (zn91.m96567o(singleM63722c, m4qVar) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: i */
    public static final Object m66255i(o4q o4qVar, String str, ibk ibkVar) throws Throwable {
        n4q n4qVar;
        pne1 pne1Var = o4qVar.f161726f;
        if (ibkVar instanceof n4q) {
            n4qVar = (n4q) ibkVar;
            int i = n4qVar.f150403d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n4qVar.f150403d = i - Integer.MIN_VALUE;
            } else {
                n4qVar = new n4q(o4qVar, ibkVar);
            }
        } else {
            n4qVar = new n4q(o4qVar, ibkVar);
        }
        Object objM66257j = n4qVar.f150401b;
        int i2 = n4qVar.f150403d;
        if (i2 == 0) {
            bga.m29073P(objM66257j);
            if (!o4qVar.f161722b.m95510a(str)) {
                return new d4q("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
            }
            n4qVar.f150400a = str;
            n4qVar.f150403d = 1;
            objM66257j = o4qVar.m66257j(str, n4qVar);
            Object obj = yuk.f276404a;
            if (objM66257j == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = n4qVar.f150400a;
            bga.m29073P(objM66257j);
        }
        n4m n4mVar = (n4m) objM66257j;
        if (n4mVar == null) {
            return new d4q("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
        }
        String str2 = n4mVar.f150383a;
        if (str2.length() != 0) {
            str = str2;
        }
        sjf1 sjf1Var = n4mVar.f150384b;
        return new d4q(sjf1Var instanceof k4m ? ((k4m) sjf1Var).f119248e : "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", str);
    }

    /* JADX INFO: renamed from: k */
    public static CollectionAddRemoveItemsRequest m66256k(String str, z650 z650Var) {
        e0f e0fVarM97432p = CollectionAddRemoveItem.m97432p();
        e0fVarM97432p.m37493q(str);
        if (z650Var != null) {
            f4f f4fVarM6822v = CollectionItemdata$ItemData.m6822v();
            f7y0 f7y0VarM12901q = SaveSource.m12901q();
            f7y0VarM12901q.m40993m(z650Var.f279709a);
            f4fVarM6822v.m40730q(f7y0VarM12901q);
            e0fVarM97432p.m37492m((CollectionItemdata$ItemData) f4fVarM6822v.build());
        }
        CollectionAddRemoveItem collectionAddRemoveItem = (CollectionAddRemoveItem) e0fVarM97432p.build();
        f0f f0fVarM97436q = CollectionAddRemoveItemsRequest.m97436q();
        f0fVarM97436q.m40474m(Collections.singletonList(collectionAddRemoveItem));
        return (CollectionAddRemoveItemsRequest) f0fVarM97436q.build();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f161720Z;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f161717L0;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f161719Y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: j */
    public final Object m66257j(String str, ibk ibkVar) throws Throwable {
        f4q f4qVar;
        Object c6x0Var;
        if (ibkVar instanceof f4q) {
            f4qVar = (f4q) ibkVar;
            int i = f4qVar.f65835d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f4qVar.f65835d = i - Integer.MIN_VALUE;
            } else {
                f4qVar = new f4q(this, ibkVar);
            }
        } else {
            f4qVar = new f4q(this, ibkVar);
        }
        Object objM76980u = f4qVar.f65833b;
        int i2 = f4qVar.f65835d;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                if (!this.f161722b.m95510a(str)) {
                    return null;
                }
                fop fopVar = new fop((Object) this, str, fbkVar, 6);
                f4qVar.f65832a = str;
                f4qVar.f65835d = 1;
                objM76980u = s1h1.m76980u(5000L, fopVar, f4qVar);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = f4qVar.f65832a;
                bga.m29073P(objM76980u);
            }
            qho qhoVar = (qho) objM76980u;
            if (qhoVar == null) {
                Logger.m3973i("DefaultSaveDestinationElement", "Timed out resolving curation trait for " + str);
            }
            oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
            c6x0Var = ohoVar != null ? (n4m) ohoVar.f165512a : null;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null) {
            return (n4m) c6x0Var;
        }
        if (thM77348a instanceof CancellationException) {
            throw thM77348a;
        }
        return null;
    }
}
