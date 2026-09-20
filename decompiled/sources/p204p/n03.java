package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.connectivity.reachability.esperanto.proto.EsNotReachable$LegacyForcedOffline;
import com.spotify.connectivity.reachability.esperanto.proto.EsNotReachable$LegacyNoInternet;
import com.spotify.connectivity.reachability.esperanto.proto.EsNotReachable$LegacyNotReachable;
import com.spotify.connectivity.reachability.esperanto.proto.EsReachability$LegacyReachability;
import com.spotify.connectivity.reachability.esperanto.proto.EsReachable$LegacyReachable;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class n03 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148866a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f148867b;

    public /* synthetic */ n03(niz nizVar, int i) {
        this.f148866a = i;
        this.f148867b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x018f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0295  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:199:0x0327  */
    /* JADX WARN: Code duplicated, block: B:218:0x0373  */
    /* JADX WARN: Code duplicated, block: B:235:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:269:0x0458  */
    /* JADX WARN: Code duplicated, block: B:288:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:309:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:326:0x0537  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:345:0x0583  */
    /* JADX WARN: Code duplicated, block: B:362:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:379:0x0611  */
    /* JADX WARN: Code duplicated, block: B:400:0x065c  */
    /* JADX WARN: Code duplicated, block: B:424:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:445:0x0715  */
    /* JADX WARN: Code duplicated, block: B:464:0x075e  */
    /* JADX WARN: Code duplicated, block: B:488:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:512:0x080f  */
    /* JADX WARN: Code duplicated, block: B:539:0x0874  */
    /* JADX WARN: Code duplicated, block: B:561:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:578:0x0920  */
    /* JADX WARN: Code duplicated, block: B:595:0x096c  */
    /* JADX WARN: Code duplicated, block: B:616:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:637:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:667:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v147, types: [com.google.protobuf.g, p.tnw] */
    /* JADX WARN: Type inference failed for: r1v99, types: [p.wnw] */
    /* JADX WARN: Type inference failed for: r3v32, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.ArrayList] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        m03 m03Var;
        s03 s03Var;
        t03 t03Var;
        i13 i13Var;
        j13 j13Var;
        y13 y13Var;
        m23 m23Var;
        k43 k43Var;
        r93 r93Var;
        ej3 ej3Var;
        rv3 rv3Var;
        mw3 mw3Var;
        ArrayList arrayList;
        cx3 cx3Var;
        dx3 dx3Var;
        kg4 kg4Var;
        lg4 lg4Var;
        mg4 mg4Var;
        ng4 ng4Var;
        og4 og4Var;
        pg4 pg4Var;
        String str;
        long j;
        Object objEmit;
        yuk yukVar;
        ufu ufuVar;
        ufu ufuVar2;
        qg4 qg4Var;
        rg4 rg4Var;
        xg4 xg4Var;
        zg4 zg4Var;
        mn4 mn4Var;
        ?? arrayList2;
        int number;
        ov4 ov4Var;
        h0e1 h0e1Var;
        aa5 aa5Var;
        ca5 ca5Var;
        vc5 vc5Var;
        sd5 sd5Var;
        switch (this.f148866a) {
            case 0:
                if (fbkVar instanceof m03) {
                    m03Var = (m03) fbkVar;
                    int i = m03Var.f138494b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        m03Var.f138494b = i - Integer.MIN_VALUE;
                    } else {
                        m03Var = new m03(this, fbkVar);
                    }
                } else {
                    m03Var = new m03(this, fbkVar);
                }
                Object obj2 = m03Var.f138493a;
                int i2 = m03Var.f138494b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    gi20 gi20VarM44766a = gi20.m44766a((gi20) obj, null, true, false, R.string.find_in_context_edit_text_album_hint, null, false, 117);
                    m03Var.f138494b = 1;
                    Object objEmit2 = this.f148867b.emit(gi20VarM44766a, m03Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof s03) {
                    s03Var = (s03) fbkVar;
                    int i3 = s03Var.f204290b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s03Var.f204290b = i3 - Integer.MIN_VALUE;
                    } else {
                        s03Var = new s03(this, fbkVar);
                    }
                } else {
                    s03Var = new s03(this, fbkVar);
                }
                Object obj3 = s03Var.f204289a;
                int i4 = s03Var.f204290b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    String str2 = (String) ((ty80) obj).f224877f.f271272q.get("artistUris");
                    Object objM43727j0 = str2 != null ? g6f.m43727j0(wl51.m88477a1(str2, new String[]{","}, 0, 6)) : lau.f131415a;
                    s03Var.f204290b = 1;
                    Object objEmit3 = this.f148867b.emit(objM43727j0, s03Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof t03) {
                    t03Var = (t03) fbkVar;
                    int i5 = t03Var.f215733b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        t03Var.f215733b = i5 - Integer.MIN_VALUE;
                    } else {
                        t03Var = new t03(this, fbkVar);
                    }
                } else {
                    t03Var = new t03(this, fbkVar);
                }
                Object obj4 = t03Var.f215732a;
                int i6 = t03Var.f215733b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    List<w46> list = (List) obj;
                    wj50.m88279p(list);
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
                    for (w46 w46Var : list) {
                        arrayList3.add(new p03(w46Var.f247713a, w46Var.f247714b, w46Var.f247715c.m89458a(szk.f215607b)));
                    }
                    t03Var.f215733b = 1;
                    Object objEmit4 = this.f148867b.emit(arrayList3, t03Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof i13) {
                    i13Var = (i13) fbkVar;
                    int i7 = i13Var.f97372b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        i13Var.f97372b = i7 - Integer.MIN_VALUE;
                    } else {
                        i13Var = new i13(this, fbkVar);
                    }
                } else {
                    i13Var = new i13(this, fbkVar);
                }
                Object obj5 = i13Var.f97371a;
                int i8 = i13Var.f97372b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    Boolean boolValueOf = Boolean.valueOf(((z190) obj).f278263a.m30586a());
                    i13Var.f97372b = 1;
                    Object objEmit5 = this.f148867b.emit(boolValueOf, i13Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof j13) {
                    j13Var = (j13) fbkVar;
                    int i9 = j13Var.f107631b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        j13Var.f107631b = i9 - Integer.MIN_VALUE;
                    } else {
                        j13Var = new j13(this, fbkVar);
                    }
                } else {
                    j13Var = new j13(this, fbkVar);
                }
                Object obj6 = j13Var.f107630a;
                int i10 = j13Var.f107631b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    Boolean boolValueOf2 = Boolean.valueOf(((z190) obj).f278263a.m30587b());
                    j13Var.f107631b = 1;
                    Object objEmit6 = this.f148867b.emit(boolValueOf2, j13Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof y13) {
                    y13Var = (y13) fbkVar;
                    int i11 = y13Var.f268165b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        y13Var.f268165b = i11 - Integer.MIN_VALUE;
                    } else {
                        y13Var = new y13(this, fbkVar);
                    }
                } else {
                    y13Var = new y13(this, fbkVar);
                }
                Object obj7 = y13Var.f268164a;
                int i12 = y13Var.f268165b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    String str3 = (String) ((ty80) obj).f224877f.f271272q.get("artistUris");
                    List listM88477a1 = str3 != null ? wl51.m88477a1(str3, new String[]{","}, 0, 6) : null;
                    if (listM88477a1 != null) {
                        y13Var.f268165b = 1;
                        Object objEmit7 = this.f148867b.emit(listM88477a1, y13Var);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit7 == yukVar7) {
                            return yukVar7;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof m23) {
                    m23Var = (m23) fbkVar;
                    int i13 = m23Var.f139201b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        m23Var.f139201b = i13 - Integer.MIN_VALUE;
                    } else {
                        m23Var = new m23(this, fbkVar);
                    }
                } else {
                    m23Var = new m23(this, fbkVar);
                }
                Object obj8 = m23Var.f139200a;
                int i14 = m23Var.f139201b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    qie0 qie0Var = (qie0) ((ty80) obj).f224877f.f271279x.mo30169a(qie0.class);
                    ArrayList arrayList4 = qie0Var != null ? qie0Var.f189005a : null;
                    Boolean boolValueOf3 = Boolean.valueOf(!(arrayList4 == null || arrayList4.isEmpty()));
                    m23Var.f139201b = 1;
                    Object objEmit8 = this.f148867b.emit(boolValueOf3, m23Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof k43) {
                    k43Var = (k43) fbkVar;
                    int i15 = k43Var.f119057b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        k43Var.f119057b = i15 - Integer.MIN_VALUE;
                    } else {
                        k43Var = new k43(this, fbkVar);
                    }
                } else {
                    k43Var = new k43(this, fbkVar);
                }
                Object obj9 = k43Var.f119056a;
                int i16 = k43Var.f119057b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    dgv0 dgv0Var = (dgv0) ((ty80) obj).f224877f.f271279x.mo30169a(dgv0.class);
                    Boolean boolValueOf4 = Boolean.valueOf((dgv0Var != null ? dgv0Var.f48902a : null) != null);
                    k43Var.f119057b = 1;
                    Object objEmit9 = this.f148867b.emit(boolValueOf4, k43Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof r93) {
                    r93Var = (r93) fbkVar;
                    int i17 = r93Var.f196890b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        r93Var.f196890b = i17 - Integer.MIN_VALUE;
                    } else {
                        r93Var = new r93(this, fbkVar);
                    }
                } else {
                    r93Var = new r93(this, fbkVar);
                }
                Object obj10 = r93Var.f196889a;
                int i18 = r93Var.f196890b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    i490 i490Var = ohoVar != null ? (i490) ohoVar.f165512a : null;
                    if (i490Var != null) {
                        r93Var.f196890b = 1;
                        Object objEmit10 = this.f148867b.emit(i490Var, r93Var);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit10 == yukVar10) {
                            return yukVar10;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof ej3) {
                    ej3Var = (ej3) fbkVar;
                    int i19 = ej3Var.f60115b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ej3Var.f60115b = i19 - Integer.MIN_VALUE;
                    } else {
                        ej3Var = new ej3(this, fbkVar);
                    }
                } else {
                    ej3Var = new ej3(this, fbkVar);
                }
                Object obj11 = ej3Var.f60114a;
                int i20 = ej3Var.f60115b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    if (((Boolean) obj).booleanValue()) {
                        ej3Var.f60115b = 1;
                        Object objEmit11 = this.f148867b.emit(obj, ej3Var);
                        yuk yukVar11 = yuk.f276404a;
                        if (objEmit11 == yukVar11) {
                            return yukVar11;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof rv3) {
                    rv3Var = (rv3) fbkVar;
                    int i21 = rv3Var.f202988b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        rv3Var.f202988b = i21 - Integer.MIN_VALUE;
                    } else {
                        rv3Var = new rv3(this, fbkVar);
                    }
                } else {
                    rv3Var = new rv3(this, fbkVar);
                }
                Object obj12 = rv3Var.f202987a;
                int i22 = rv3Var.f202988b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    by50 by50Var = (by50) obj;
                    String str4 = by50Var != null ? by50Var.f32082h.f287208a : null;
                    rv3Var.f202988b = 1;
                    Object objEmit12 = this.f148867b.emit(str4, rv3Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof mw3) {
                    mw3Var = (mw3) fbkVar;
                    int i23 = mw3Var.f147705b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        mw3Var.f147705b = i23 - Integer.MIN_VALUE;
                    } else {
                        mw3Var = new mw3(this, fbkVar);
                    }
                } else {
                    mw3Var = new mw3(this, fbkVar);
                }
                Object obj13 = mw3Var.f147704a;
                int i24 = mw3Var.f147705b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    by50 by50Var2 = (by50) obj;
                    if (by50Var2 != null) {
                        ArrayList<tx50> arrayList5 = by50Var2.f32077c;
                        arrayList = new ArrayList(i6f.m49804T(arrayList5, 10));
                        for (tx50 tx50Var : arrayList5) {
                            arrayList.add(new k7b(tx50Var.f224566b, tx50Var.f224569e));
                        }
                    } else {
                        arrayList = null;
                    }
                    mw3Var.f147705b = 1;
                    Object objEmit13 = this.f148867b.emit(arrayList, mw3Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof cx3) {
                    cx3Var = (cx3) fbkVar;
                    int i25 = cx3Var.f42893b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        cx3Var.f42893b = i25 - Integer.MIN_VALUE;
                    } else {
                        cx3Var = new cx3(this, fbkVar);
                    }
                } else {
                    cx3Var = new cx3(this, fbkVar);
                }
                Object obj14 = cx3Var.f42892a;
                int i26 = cx3Var.f42893b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    e301 e301Var = (e301) obj;
                    if (!e301Var.f55573c && !e301Var.f55574d) {
                        cx3Var.f42893b = 1;
                        Object objEmit14 = this.f148867b.emit(obj, cx3Var);
                        yuk yukVar14 = yuk.f276404a;
                        if (objEmit14 == yukVar14) {
                            return yukVar14;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof dx3) {
                    dx3Var = (dx3) fbkVar;
                    int i27 = dx3Var.f53835b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        dx3Var.f53835b = i27 - Integer.MIN_VALUE;
                    } else {
                        dx3Var = new dx3(this, fbkVar);
                    }
                } else {
                    dx3Var = new dx3(this, fbkVar);
                }
                Object obj15 = dx3Var.f53834a;
                int i28 = dx3Var.f53835b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    Boolean boolValueOf5 = Boolean.valueOf(((e301) obj).f55572b);
                    dx3Var.f53835b = 1;
                    Object objEmit15 = this.f148867b.emit(boolValueOf5, dx3Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof kg4) {
                    kg4Var = (kg4) fbkVar;
                    int i29 = kg4Var.f122296b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        kg4Var.f122296b = i29 - Integer.MIN_VALUE;
                    } else {
                        kg4Var = new kg4(this, fbkVar);
                    }
                } else {
                    kg4Var = new kg4(this, fbkVar);
                }
                Object obj16 = kg4Var.f122295a;
                int i30 = kg4Var.f122296b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    String strM38002e0 = e72.m38002e0((ContextTrack) obj);
                    kg4Var.f122296b = 1;
                    Object objEmit16 = this.f148867b.emit(strM38002e0, kg4Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof lg4) {
                    lg4Var = (lg4) fbkVar;
                    int i31 = lg4Var.f133067b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        lg4Var.f133067b = i31 - Integer.MIN_VALUE;
                    } else {
                        lg4Var = new lg4(this, fbkVar);
                    }
                } else {
                    lg4Var = new lg4(this, fbkVar);
                }
                Object obj17 = lg4Var.f133066a;
                int i32 = lg4Var.f133067b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    Object objMo49283h = ((PlayerState) obj).track().mo49283h();
                    if (objMo49283h != null) {
                        lg4Var.f133067b = 1;
                        Object objEmit17 = this.f148867b.emit(objMo49283h, lg4Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof mg4) {
                    mg4Var = (mg4) fbkVar;
                    int i33 = mg4Var.f143305b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        mg4Var.f143305b = i33 - Integer.MIN_VALUE;
                    } else {
                        mg4Var = new mg4(this, fbkVar);
                    }
                } else {
                    mg4Var = new mg4(this, fbkVar);
                }
                Object obj18 = mg4Var.f143304a;
                int i34 = mg4Var.f143305b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    rhj rhjVar = ((thj) obj).f220443a;
                    mg4Var.f143305b = 1;
                    Object objEmit18 = this.f148867b.emit(rhjVar, mg4Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof ng4) {
                    ng4Var = (ng4) fbkVar;
                    int i35 = ng4Var.f153547b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ng4Var.f153547b = i35 - Integer.MIN_VALUE;
                    } else {
                        ng4Var = new ng4(this, fbkVar);
                    }
                } else {
                    ng4Var = new ng4(this, fbkVar);
                }
                Object obj19 = ng4Var.f153546a;
                int i36 = ng4Var.f153547b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    ContextTrack contextTrack = (ContextTrack) obj;
                    String strM38002e1 = !e72.m37973G(contextTrack) ? e72.m38002e0(contextTrack) : "";
                    ng4Var.f153547b = 1;
                    Object objEmit19 = this.f148867b.emit(strM38002e1, ng4Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof og4) {
                    og4Var = (og4) fbkVar;
                    int i37 = og4Var.f164986b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        og4Var.f164986b = i37 - Integer.MIN_VALUE;
                    } else {
                        og4Var = new og4(this, fbkVar);
                    }
                } else {
                    og4Var = new og4(this, fbkVar);
                }
                Object obj20 = og4Var.f164985a;
                int i38 = og4Var.f164986b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    Object objMo49283h2 = ((PlayerState) obj).track().mo49283h();
                    if (objMo49283h2 != null) {
                        og4Var.f164986b = 1;
                        Object objEmit20 = this.f148867b.emit(objMo49283h2, og4Var);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit20 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof pg4) {
                    pg4Var = (pg4) fbkVar;
                    int i39 = pg4Var.f177218b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        pg4Var.f177218b = i39 - Integer.MIN_VALUE;
                    } else {
                        pg4Var = new pg4(this, fbkVar);
                    }
                } else {
                    pg4Var = new pg4(this, fbkVar);
                }
                Object obj21 = pg4Var.f177217a;
                int i40 = pg4Var.f177218b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    erc1 erc1Var = (erc1) obj;
                    w240 w240Var = erc1Var.f62082d;
                    n6f n6fVar = null;
                    n6f n6fVar2 = (w240Var == null || (ufuVar2 = w240Var.f247223b.f112823a) == null) ? null : new n6f(ufuVar2.f229876c);
                    w240 w240Var2 = erc1Var.f62079a.f139525b;
                    if (w240Var2 != null && (ufuVar = w240Var2.f247223b.f112823a) != null) {
                        n6fVar = new n6f(ufuVar.f229876c);
                    }
                    if (n6fVar2 != null) {
                        j = n6fVar2.f150873a;
                    } else {
                        if (n6fVar != null) {
                            j = n6fVar.f150873a;
                        } else {
                            str = "";
                        }
                        pg4Var.f177218b = 1;
                        objEmit = this.f148867b.emit(str, pg4Var);
                        yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                    str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(rfg1.m75429D(j) & 16777215)}, 1));
                    pg4Var.f177218b = 1;
                    objEmit = this.f148867b.emit(str, pg4Var);
                    yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof qg4) {
                    qg4Var = (qg4) fbkVar;
                    int i41 = qg4Var.f188370b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        qg4Var.f188370b = i41 - Integer.MIN_VALUE;
                    } else {
                        qg4Var = new qg4(this, fbkVar);
                    }
                } else {
                    qg4Var = new qg4(this, fbkVar);
                }
                Object obj22 = qg4Var.f188369a;
                int i42 = qg4Var.f188370b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    ContextTrack contextTrack2 = (ContextTrack) obj;
                    List listM43727j0 = g6f.m43727j0(h6f.m46715L(e72.m38002e0(contextTrack2), contextTrack2.uri()));
                    qg4Var.f188370b = 1;
                    Object objEmit21 = this.f148867b.emit(listM43727j0, qg4Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof rg4) {
                    rg4Var = (rg4) fbkVar;
                    int i43 = rg4Var.f198822b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        rg4Var.f198822b = i43 - Integer.MIN_VALUE;
                    } else {
                        rg4Var = new rg4(this, fbkVar);
                    }
                } else {
                    rg4Var = new rg4(this, fbkVar);
                }
                Object obj23 = rg4Var.f198821a;
                int i44 = rg4Var.f198822b;
                if (i44 == 0) {
                    bga.m29073P(obj23);
                    Object objMo49283h3 = ((PlayerState) obj).track().mo49283h();
                    if (objMo49283h3 != null) {
                        rg4Var.f198822b = 1;
                        Object objEmit22 = this.f148867b.emit(objMo49283h3, rg4Var);
                        yuk yukVar22 = yuk.f276404a;
                        if (objEmit22 == yukVar22) {
                            return yukVar22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof xg4) {
                    xg4Var = (xg4) fbkVar;
                    int i45 = xg4Var.f261194b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        xg4Var.f261194b = i45 - Integer.MIN_VALUE;
                    } else {
                        xg4Var = new xg4(this, fbkVar);
                    }
                } else {
                    xg4Var = new xg4(this, fbkVar);
                }
                Object obj24 = xg4Var.f261193a;
                int i46 = xg4Var.f261194b;
                if (i46 == 0) {
                    bga.m29073P(obj24);
                    String strM38002e2 = e72.m38002e0((ContextTrack) obj);
                    xg4Var.f261194b = 1;
                    Object objEmit23 = this.f148867b.emit(strM38002e2, xg4Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof zg4) {
                    zg4Var = (zg4) fbkVar;
                    int i47 = zg4Var.f282475b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        zg4Var.f282475b = i47 - Integer.MIN_VALUE;
                    } else {
                        zg4Var = new zg4(this, fbkVar);
                    }
                } else {
                    zg4Var = new zg4(this, fbkVar);
                }
                Object obj25 = zg4Var.f282474a;
                int i48 = zg4Var.f282475b;
                if (i48 == 0) {
                    bga.m29073P(obj25);
                    Object objMo49283h4 = ((PlayerState) obj).track().mo49283h();
                    if (objMo49283h4 != null) {
                        zg4Var.f282475b = 1;
                        Object objEmit24 = this.f148867b.emit(objMo49283h4, zg4Var);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof mn4) {
                    mn4Var = (mn4) fbkVar;
                    int i49 = mn4Var.f145306b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        mn4Var.f145306b = i49 - Integer.MIN_VALUE;
                    } else {
                        mn4Var = new mn4(this, fbkVar);
                    }
                } else {
                    mn4Var = new mn4(this, fbkVar);
                }
                Object obj26 = mn4Var.f145305a;
                int i50 = mn4Var.f145306b;
                if (i50 == 0) {
                    bga.m29073P(obj26);
                    acu0 acu0Var = (acu0) obj;
                    ?? M7582p = EsReachability$LegacyReachability.m7582p();
                    if (acu0Var instanceof ybu0) {
                        nqj0 nqj0Var = ((ybu0) acu0Var).f271248a;
                        ulw ulwVarM7579p = EsNotReachable$LegacyNotReachable.m7579p();
                        if (nqj0Var.equals(lqj0.f136072a)) {
                            ulwVarM7579p.m83403m(EsNotReachable$LegacyForcedOffline.m7573o());
                        } else {
                            if (!(nqj0Var instanceof mqj0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tlw tlwVarM7576p = EsNotReachable$LegacyNoInternet.m7576p();
                            mqj0 mqj0Var = (mqj0) nqj0Var;
                            tlwVarM7576p.m81077q(mqj0Var.f146302a);
                            tlwVarM7576p.m81076m(mqj0Var.f146303b);
                            ulwVarM7579p.m83404q((EsNotReachable$LegacyNoInternet) tlwVarM7576p.build());
                        }
                        M7582p.m81186m((EsNotReachable$LegacyNotReachable) ulwVarM7579p.build());
                    } else {
                        if (!(acu0Var instanceof zbu0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ?? M7596o = EsReachable$LegacyReachable.m7596o();
                        Set set = ((zbu0) acu0Var).f281395a;
                        if (set != null) {
                            Set set2 = set;
                            arrayList2 = new ArrayList(i6f.m49804T(set2, 10));
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                int iOrdinal = ((tgj0) it.next()).ordinal();
                                if (iOrdinal == 0) {
                                    number = slw.UNMETERED.getNumber();
                                } else if (iOrdinal == 1) {
                                    number = slw.CELLULAR.getNumber();
                                } else if (iOrdinal == 2) {
                                    number = slw.EXPENSIVE.getNumber();
                                } else {
                                    if (iOrdinal != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    number = slw.CONSTRAINED.getNumber();
                                }
                                arrayList2.add(new Integer(number));
                            }
                        } else {
                            arrayList2 = lau.f131415a;
                        }
                        M7596o.m88613m(arrayList2);
                        M7582p.m81187q(M7596o);
                    }
                    AbstractC0269h abstractC0269hBuild = M7582p.build();
                    mn4Var.f145306b = 1;
                    Object objEmit25 = this.f148867b.emit(abstractC0269hBuild, mn4Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof ov4) {
                    ov4Var = (ov4) fbkVar;
                    int i51 = ov4Var.f170416b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        ov4Var.f170416b = i51 - Integer.MIN_VALUE;
                    } else {
                        ov4Var = new ov4(this, fbkVar);
                    }
                } else {
                    ov4Var = new ov4(this, fbkVar);
                }
                Object obj27 = ov4Var.f170415a;
                int i52 = ov4Var.f170416b;
                if (i52 == 0) {
                    bga.m29073P(obj27);
                    i0e1 i0e1Var = (i0e1) obj;
                    if (i0e1Var != null && (h0e1Var = i0e1Var.f97219b) != null && h0e1Var.m46346a()) {
                        ov4Var.f170416b = 1;
                        Object objEmit26 = this.f148867b.emit(obj, ov4Var);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof aa5) {
                    aa5Var = (aa5) fbkVar;
                    int i53 = aa5Var.f13764b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        aa5Var.f13764b = i53 - Integer.MIN_VALUE;
                    } else {
                        aa5Var = new aa5(this, fbkVar);
                    }
                } else {
                    aa5Var = new aa5(this, fbkVar);
                }
                Object obj28 = aa5Var.f13763a;
                int i54 = aa5Var.f13764b;
                if (i54 == 0) {
                    bga.m29073P(obj28);
                    if (obj instanceof aj11) {
                        aa5Var.f13764b = 1;
                        Object objEmit27 = this.f148867b.emit(obj, aa5Var);
                        yuk yukVar27 = yuk.f276404a;
                        if (objEmit27 == yukVar27) {
                            return yukVar27;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof ca5) {
                    ca5Var = (ca5) fbkVar;
                    int i55 = ca5Var.f35727b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ca5Var.f35727b = i55 - Integer.MIN_VALUE;
                    } else {
                        ca5Var = new ca5(this, fbkVar);
                    }
                } else {
                    ca5Var = new ca5(this, fbkVar);
                }
                Object obj29 = ca5Var.f35726a;
                int i56 = ca5Var.f35727b;
                if (i56 == 0) {
                    bga.m29073P(obj29);
                    if (obj instanceof dsd1) {
                        ca5Var.f35727b = 1;
                        Object objEmit28 = this.f148867b.emit(obj, ca5Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof vc5) {
                    vc5Var = (vc5) fbkVar;
                    int i57 = vc5Var.f240051b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        vc5Var.f240051b = i57 - Integer.MIN_VALUE;
                    } else {
                        vc5Var = new vc5(this, fbkVar);
                    }
                } else {
                    vc5Var = new vc5(this, fbkVar);
                }
                Object obj30 = vc5Var.f240050a;
                int i58 = vc5Var.f240051b;
                if (i58 == 0) {
                    bga.m29073P(obj30);
                    e0l e0lVar = new e0l((String) obj);
                    vc5Var.f240051b = 1;
                    Object objEmit29 = this.f148867b.emit(e0lVar, vc5Var);
                    yuk yukVar29 = yuk.f276404a;
                    if (objEmit29 == yukVar29) {
                        return yukVar29;
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof sd5) {
                    sd5Var = (sd5) fbkVar;
                    int i59 = sd5Var.f207891b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        sd5Var.f207891b = i59 - Integer.MIN_VALUE;
                    } else {
                        sd5Var = new sd5(this, fbkVar);
                    }
                } else {
                    sd5Var = new sd5(this, fbkVar);
                }
                Object obj31 = sd5Var.f207890a;
                int i60 = sd5Var.f207891b;
                if (i60 == 0) {
                    bga.m29073P(obj31);
                    pqm0 pqm0Var = (pqm0) obj;
                    Boolean boolValueOf6 = Boolean.valueOf(((sg5) pqm0Var.f180350a) == sg5.f208721b && ((sg5) pqm0Var.f180351b) == sg5.f208720a);
                    sd5Var.f207891b = 1;
                    Object objEmit30 = this.f148867b.emit(boolValueOf6, sd5Var);
                    yuk yukVar30 = yuk.f276404a;
                    if (objEmit30 == yukVar30) {
                        return yukVar30;
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ n03(niz nizVar, nwt nwtVar, int i) {
        this.f148866a = i;
        this.f148867b = nizVar;
    }
}
