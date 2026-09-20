package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class vgl0 extends d6a0 implements rgl0 {

    /* JADX INFO: renamed from: X */
    public static final YourLibraryRequest f241265X;

    /* JADX INFO: renamed from: Y */
    public static final st80 f241266Y;

    /* JADX INFO: renamed from: d */
    public final zre1 f241267d;

    /* JADX INFO: renamed from: e */
    public final wt80 f241268e;

    /* JADX INFO: renamed from: f */
    public final gle1 f241269f;

    /* JADX INFO: renamed from: g */
    public final luk f241270g;

    /* JADX INFO: renamed from: h */
    public final zv41 f241271h;

    /* JADX INFO: renamed from: i */
    public final kmx f241272i;

    /* JADX INFO: renamed from: t */
    public c9k f241273t;

    static {
        jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
        kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
        goe1 goe1VarM98237o = YourLibraryConfig$YourLibrarySortOrder.m98237o();
        goe1VarM98237o.m45341m(hoe1.RECENTLY_PLAYED_OR_ADDED);
        kqe1VarM98179G.m57098H((YourLibraryConfig$YourLibrarySortOrder) goe1VarM98237o.build());
        kqe1VarM98179G.m57093C(15);
        aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
        aoe1VarM98214r.m26586q(boe1.PLAYLIST);
        aoe1VarM98214r.m26586q(boe1.ALBUM);
        kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
        jqe1VarM98173q.m54086q((YourLibraryRequestHeader) kqe1VarM98179G.build());
        f241265X = (YourLibraryRequest) jqe1VarM98173q.build();
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29523i0();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        f241266Y = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, null, c5u0.f34291a, null, 0, null, 478);
    }

    public vgl0(zre1 zre1Var, wt80 wt80Var, gle1 gle1Var, luk lukVar) {
        this.f241267d = zre1Var;
        this.f241268e = wt80Var;
        this.f241269f = gle1Var;
        this.f241270g = lukVar;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f241271h = zv41VarM52819d;
        this.f241272i = new kmx(zv41VarM52819d, 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r6 == r4) goto L29;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m85488k(vgl0 vgl0Var, ibk ibkVar) {
        sgl0 sgl0Var;
        Object obj;
        if (ibkVar instanceof sgl0) {
            sgl0Var = (sgl0) ibkVar;
            int i = sgl0Var.f208891c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgl0Var.f208891c = i - Integer.MIN_VALUE;
            } else {
                sgl0Var = new sgl0(vgl0Var, ibkVar);
            }
        } else {
            sgl0Var = new sgl0(vgl0Var, ibkVar);
        }
        Object objM85490m = sgl0Var.f208889a;
        int i2 = sgl0Var.f208891c;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM85490m);
                sgl0Var.f208891c = 1;
                objM85490m = vgl0Var.m85490m(sgl0Var);
                if (objM85490m == obj2) {
                }
                return obj2;
            }
            if (i2 == 1) {
                bga.m29073P(objM85490m);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM85490m);
            }
            obj = (List) objM85490m;
            vgl0Var.f241271h.m97090l(obj);
            vgl0Var.m35106i();
            return w2a1.f247311a;
            List list = (List) objM85490m;
            if (list.isEmpty()) {
                obj = lau.f131415a;
            } else {
                sgl0Var.f208891c = 2;
                objM85490m = kk40.m56684z(new rpk0(list, vgl0Var, (fbk) null, 2), sgl0Var);
            }
            vgl0Var.f241271h.m97090l(obj);
            vgl0Var.m35106i();
        } catch (Exception e) {
            vgl0Var.m35105h(e);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    public static final Object m85489l(vgl0 vgl0Var, YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity, ibk ibkVar) {
        ugl0 ugl0Var;
        yxv yxvVar;
        yxv yxvVar2;
        int iOrdinal;
        Object objM62841f;
        yuk yukVar;
        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;
        yxv yxvVar3;
        if (ibkVar instanceof ugl0) {
            ugl0Var = (ugl0) ibkVar;
            int i = ugl0Var.f230208e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugl0Var.f230208e = i - Integer.MIN_VALUE;
            } else {
                ugl0Var = new ugl0(vgl0Var, ibkVar);
            }
        } else {
            ugl0Var = new ugl0(vgl0Var, ibkVar);
        }
        Object obj = ugl0Var.f230206c;
        int i2 = ugl0Var.f230208e;
        if (i2 == 0) {
            bga.m29073P(obj);
            YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e();
            int iOrdinal2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r().ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 2) {
                    yxvVar2 = null;
                } else {
                    yxvVar = yxv.f277329a;
                }
                if (yxvVar2 != null) {
                    iOrdinal = yxvVar2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            return new oil0(yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getName(), yxvVar2, yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.m98274q(), 0, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98259n().m98241n(), 16);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    wt80 wt80Var = vgl0Var.f241268e;
                    String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getUri();
                    ugl0Var.f230204a = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e;
                    ugl0Var.f230205b = yxvVar2;
                    ugl0Var.f230208e = 1;
                    objM62841f = ((mu80) wt80Var).m62841f(uri, f241266Y, ugl0Var);
                    yukVar = yuk.f276404a;
                    if (objM62841f == yukVar) {
                        return yukVar;
                    }
                    yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e;
                    yxvVar3 = yxvVar2;
                    obj = objM62841f;
                }
                return null;
            }
            yxvVar = yxv.f277330b;
            yxvVar2 = yxvVar;
            if (yxvVar2 != null) {
                iOrdinal = yxvVar2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return new oil0(yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getName(), yxvVar2, yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.m98274q(), 0, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98259n().m98241n(), 16);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                wt80 wt80Var2 = vgl0Var.f241268e;
                String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getUri();
                ugl0Var.f230204a = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e;
                ugl0Var.f230205b = yxvVar2;
                ugl0Var.f230208e = 1;
                objM62841f = ((mu80) wt80Var2).m62841f(uri2, f241266Y, ugl0Var);
                yukVar = yuk.f276404a;
                if (objM62841f == yukVar) {
                    return yukVar;
                }
                yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e;
                yxvVar3 = yxvVar2;
                obj = objM62841f;
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yxv yxvVar4 = ugl0Var.f230205b;
        yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = ugl0Var.f230204a;
        bga.m29073P(obj);
        yxvVar3 = yxvVar4;
        qu80 qu80Var = (qu80) ((p2x0) obj).m68970c();
        int i3 = qu80Var != null ? qu80Var.f192595a : 0;
        if (i3 != 0) {
            return new oil0(yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.getUri(), yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.getName(), yxvVar3, yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.m98274q(), i3, null, 32);
        }
        return null;
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        if (this.f241271h.getValue() != null) {
            m35106i();
            return;
        }
        m35107j();
        x461 x461VarM64613f = njg1.m64613f();
        luk lukVar = this.f241270g;
        lukVar.getClass();
        c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(lukVar, x461VarM64613f));
        this.f241273t = c9kVarM56661c;
        x0h1.m89578u(c9kVarM56661c, null, 0, new l2i0(this, null, 18), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        c9k c9kVar = this.f241273t;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f241273t = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m85490m(ibk ibkVar) {
        tgl0 tgl0Var;
        if (ibkVar instanceof tgl0) {
            tgl0Var = (tgl0) ibkVar;
            int i = tgl0Var.f220215c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgl0Var.f220215c = i - Integer.MIN_VALUE;
            } else {
                tgl0Var = new tgl0(this, ibkVar);
            }
        } else {
            tgl0Var = new tgl0(this, ibkVar);
        }
        Object objM96760a = tgl0Var.f220213a;
        int i2 = tgl0Var.f220215c;
        if (i2 == 0) {
            bga.m29073P(objM96760a);
            tgl0Var.f220215c = 1;
            objM96760a = this.f241267d.m96760a(f241265X, tgl0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96760a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96760a);
        }
        ae50 ae50VarM98196n = ((YourLibraryResponse) objM96760a).m98196n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ae50VarM98196n) {
            int iOrdinal = ((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj).m98262r().ordinal();
            if ((iOrdinal != 0 ? iOrdinal != 2 ? null : yxv.f277329a : yxv.f277330b) != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            String uri = ((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj2).mo78647e().getUri();
            this.f241269f.getClass();
            if (!uri.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
                arrayList2.add(obj2);
            }
        }
        return g6f.m43714b1(arrayList2, 15);
    }

    /* JADX INFO: renamed from: n */
    public final s4a0 m85491n() {
        return sw41.m79513e(this);
    }
}
