package p204p;

import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents$TrafficEvent;
import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes10.dex */
public final class ud71 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f229193b;

    public /* synthetic */ ud71(niz nizVar, int i) {
        this.f229192a = i;
        this.f229193b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0184 A[PHI: r6
      0x0184: PHI (r6v18 int) = (r6v17 int), (r6v19 int) binds: [B:111:0x018e, B:105:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0187  */
    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:110:0x018d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0191  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x0208  */
    /* JADX WARN: Code duplicated, block: B:164:0x0259  */
    /* JADX WARN: Code duplicated, block: B:180:0x0297  */
    /* JADX WARN: Code duplicated, block: B:196:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:214:0x030b  */
    /* JADX WARN: Code duplicated, block: B:235:0x035f  */
    /* JADX WARN: Code duplicated, block: B:253:0x039e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:285:0x0423  */
    /* JADX WARN: Code duplicated, block: B:301:0x0463  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:333:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:351:0x0531  */
    /* JADX WARN: Code duplicated, block: B:362:0x0560  */
    /* JADX WARN: Code duplicated, block: B:391:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:407:0x0604  */
    /* JADX WARN: Code duplicated, block: B:423:0x0642  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:443:0x0688  */
    /* JADX WARN: Code duplicated, block: B:459:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:483:0x0711  */
    /* JADX WARN: Code duplicated, block: B:499:0x074d  */
    /* JADX WARN: Code duplicated, block: B:515:0x078c  */
    /* JADX WARN: Code duplicated, block: B:536:0x07de  */
    /* JADX WARN: Code duplicated, block: B:552:0x0818  */
    /* JADX WARN: Code duplicated, block: B:575:0x0863  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        td71 td71Var;
        si71 si71Var;
        yp71 yp71Var;
        mr71 mr71Var;
        k181 k181Var;
        m181 m181Var;
        o181 o181Var;
        r181 r181Var;
        d381 d381Var;
        ee81 ee81Var;
        tf81 tf81Var;
        aj81 aj81Var;
        boolean z;
        boolean z2;
        String string;
        String string2;
        String string3;
        jj81 jj81Var;
        kj81 kj81Var;
        lj81 lj81Var;
        mj81 mj81Var;
        ek81 ek81Var;
        kk81 kk81Var;
        du81 du81Var;
        qw81 qw81Var;
        rw81 rw81Var;
        b191 b191Var;
        c191 c191Var;
        b691 b691Var;
        ec91 ec91Var;
        int i;
        int i2;
        fc91 fc91Var;
        gc91 gc91Var;
        kc91 kc91Var;
        mc91 mc91Var;
        nc91 nc91Var;
        int i3 = this.f229192a;
        boolean z3 = false;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f229193b;
        yuk yukVar = yuk.f276404a;
        switch (i3) {
            case 0:
                if (fbkVar instanceof td71) {
                    td71Var = (td71) fbkVar;
                    int i4 = td71Var.f219257b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        td71Var.f219257b = i4 - Integer.MIN_VALUE;
                    } else {
                        td71Var = new td71(this, fbkVar);
                    }
                } else {
                    td71Var = new td71(this, fbkVar);
                }
                Object obj2 = td71Var.f219256a;
                int i5 = td71Var.f219257b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                zlz0 zlz0Var = new zlz0(((Number) obj).intValue());
                td71Var.f219257b = 1;
                return nizVar.emit(zlz0Var, td71Var) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof si71) {
                    si71Var = (si71) fbkVar;
                    int i6 = si71Var.f209372b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        si71Var.f209372b = i6 - Integer.MIN_VALUE;
                    } else {
                        si71Var = new si71(this, fbkVar);
                    }
                } else {
                    si71Var = new si71(this, fbkVar);
                }
                Object obj3 = si71Var.f209371a;
                int i7 = si71Var.f209372b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.isPaused() && playerState.isPlaying()) {
                    z3 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                si71Var.f209372b = 1;
                return nizVar.emit(boolValueOf, si71Var) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof yp71) {
                    yp71Var = (yp71) fbkVar;
                    int i8 = yp71Var.f274869b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        yp71Var.f274869b = i8 - Integer.MIN_VALUE;
                    } else {
                        yp71Var = new yp71(this, fbkVar);
                    }
                } else {
                    yp71Var = new yp71(this, fbkVar);
                }
                Object obj4 = yp71Var.f274868a;
                int i9 = yp71Var.f274869b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                List list = ((wp71) obj).f253695b;
                yp71Var.f274869b = 1;
                return nizVar.emit(list, yp71Var) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof mr71) {
                    mr71Var = (mr71) fbkVar;
                    int i10 = mr71Var.f146444b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        mr71Var.f146444b = i10 - Integer.MIN_VALUE;
                    } else {
                        mr71Var = new mr71(this, fbkVar);
                    }
                } else {
                    mr71Var = new mr71(this, fbkVar);
                }
                Object obj5 = mr71Var.f146443a;
                int i11 = mr71Var.f146444b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                pqm0 pqm0Var = (pqm0) obj;
                int iIntValue = ((Number) pqm0Var.f180350a).intValue();
                int iIntValue2 = ((Number) pqm0Var.f180351b).intValue();
                if (iIntValue2 <= 0 || iIntValue < iIntValue2 - 3) {
                    return w2a1Var;
                }
                mr71Var.f146444b = 1;
                return nizVar.emit(obj, mr71Var) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof k181) {
                    k181Var = (k181) fbkVar;
                    int i12 = k181Var.f118253b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        k181Var.f118253b = i12 - Integer.MIN_VALUE;
                    } else {
                        k181Var = new k181(this, fbkVar);
                    }
                } else {
                    k181Var = new k181(this, fbkVar);
                }
                Object obj6 = k181Var.f118252a;
                int i13 = k181Var.f118253b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                Integer num = new Integer(((el20) obj).f60570a);
                k181Var.f118253b = 1;
                return nizVar.emit(num, k181Var) == yukVar ? yukVar : w2a1Var;
            case 5:
                if (fbkVar instanceof m181) {
                    m181Var = (m181) fbkVar;
                    int i14 = m181Var.f138873b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        m181Var.f138873b = i14 - Integer.MIN_VALUE;
                    } else {
                        m181Var = new m181(this, fbkVar);
                    }
                } else {
                    m181Var = new m181(this, fbkVar);
                }
                Object obj7 = m181Var.f138872a;
                int i15 = m181Var.f138873b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                String str = ((ty80) obj).f224877f.f271257b;
                m181Var.f138873b = 1;
                return nizVar.emit(str, m181Var) == yukVar ? yukVar : w2a1Var;
            case 6:
                if (fbkVar instanceof o181) {
                    o181Var = (o181) fbkVar;
                    int i16 = o181Var.f160648b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        o181Var.f160648b = i16 - Integer.MIN_VALUE;
                    } else {
                        o181Var = new o181(this, fbkVar);
                    }
                } else {
                    o181Var = new o181(this, fbkVar);
                }
                Object obj8 = o181Var.f160647a;
                int i17 = o181Var.f160648b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                Boolean bool = ohoVar != null ? (Boolean) ohoVar.f165512a : null;
                if (bool == null) {
                    return w2a1Var;
                }
                o181Var.f160648b = 1;
                return nizVar.emit(bool, o181Var) == yukVar ? yukVar : w2a1Var;
            case 7:
                if (fbkVar instanceof r181) {
                    r181Var = (r181) fbkVar;
                    int i18 = r181Var.f194803b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        r181Var.f194803b = i18 - Integer.MIN_VALUE;
                    } else {
                        r181Var = new r181(this, fbkVar);
                    }
                } else {
                    r181Var = new r181(this, fbkVar);
                }
                Object obj9 = r181Var.f194802a;
                int i19 = r181Var.f194803b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                nh20 nh20VarM64417b = ((gi20) obj).f80018e.m64417b();
                r181Var.f194803b = 1;
                return nizVar.emit(nh20VarM64417b, r181Var) == yukVar ? yukVar : w2a1Var;
            case 8:
                if (fbkVar instanceof d381) {
                    d381Var = (d381) fbkVar;
                    int i20 = d381Var.f44810b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        d381Var.f44810b = i20 - Integer.MIN_VALUE;
                    } else {
                        d381Var = new d381(this, fbkVar);
                    }
                } else {
                    d381Var = new d381(this, fbkVar);
                }
                Object obj10 = d381Var.f44809a;
                int i21 = d381Var.f44810b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                d0r0 d0r0Var = (d0r0) obj;
                ro80 ro80VarM44508o = geg1.m44508o();
                if (d0r0Var != null) {
                    ro80VarM44508o.add(d0r0Var);
                }
                ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                d381Var.f44810b = 1;
                return nizVar.emit(ro80VarM44506m, d381Var) == yukVar ? yukVar : w2a1Var;
            case 9:
                if (fbkVar instanceof ee81) {
                    ee81Var = (ee81) fbkVar;
                    int i22 = ee81Var.f58713b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        ee81Var.f58713b = i22 - Integer.MIN_VALUE;
                    } else {
                        ee81Var = new ee81(this, fbkVar);
                    }
                } else {
                    ee81Var = new ee81(this, fbkVar);
                }
                Object obj11 = ee81Var.f58712a;
                int i23 = ee81Var.f58713b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                Boolean boolValueOf2 = Boolean.valueOf(((ho50) obj).f93460a);
                ee81Var.f58713b = 1;
                return nizVar.emit(boolValueOf2, ee81Var) == yukVar ? yukVar : w2a1Var;
            case 10:
                if (fbkVar instanceof tf81) {
                    tf81Var = (tf81) fbkVar;
                    int i24 = tf81Var.f219882b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        tf81Var.f219882b = i24 - Integer.MIN_VALUE;
                    } else {
                        tf81Var = new tf81(this, fbkVar);
                    }
                } else {
                    tf81Var = new tf81(this, fbkVar);
                }
                Object obj12 = tf81Var.f219881a;
                int i25 = tf81Var.f219882b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                Boolean boolValueOf3 = Boolean.valueOf(((z190) obj).f278263a.m30587b());
                tf81Var.f219882b = 1;
                return nizVar.emit(boolValueOf3, tf81Var) == yukVar ? yukVar : w2a1Var;
            case 11:
                if (fbkVar instanceof aj81) {
                    aj81Var = (aj81) fbkVar;
                    int i26 = aj81Var.f16195b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        aj81Var.f16195b = i26 - Integer.MIN_VALUE;
                    } else {
                        aj81Var = new aj81(this, fbkVar);
                    }
                } else {
                    aj81Var = new aj81(this, fbkVar);
                }
                Object obj13 = aj81Var.f16194a;
                int i27 = aj81Var.f16195b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                ty80 ty80Var = (ty80) obj;
                boolean zM81955a = ty80Var.m81955a();
                ybv ybvVar = ty80Var.f224877f;
                String str2 = "";
                if (zM81955a) {
                    Map map = ybvVar.f271272q;
                    Set set = k590.f119450a;
                    String str3 = (String) map.get("generation_status");
                    if (str3 == null || (string3 = wl51.m88491o1(str3).toString()) == null) {
                        string3 = "";
                    }
                    if (sam.m77680s(string3).m55432b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (ty80Var.m81955a()) {
                    Map map2 = ybvVar.f271272q;
                    Set set2 = k590.f119450a;
                    String str4 = (String) map2.get("generation_status");
                    if (str4 == null || (string2 = wl51.m88491o1(str4).toString()) == null) {
                        string2 = "";
                    }
                    k590 k590VarM77680s = sam.m77680s(string2);
                    k590VarM77680s.getClass();
                    if (k590.f119450a.contains(k590VarM77680s)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                String str5 = (String) ybvVar.f271272q.get("tracklist_summary");
                if (str5 == null) {
                    str5 = "";
                }
                boolean zM88460J0 = wl51.m88460J0(str5);
                Map map3 = ybvVar.f271272q;
                Set set3 = k590.f119450a;
                String str6 = (String) map3.get("generation_status");
                if (str6 != null && (string = wl51.m88491o1(str6).toString()) != null) {
                    str2 = string;
                }
                k590 k590VarM77680s2 = sam.m77680s(str2);
                k590VarM77680s2.getClass();
                if (k590VarM77680s2 == k590.f119457h || k590VarM77680s2 == k590.f119455f || (!z && !zM88460J0 && !z2)) {
                    z3 = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z3);
                aj81Var.f16195b = 1;
                return nizVar.emit(boolValueOf4, aj81Var) == yukVar ? yukVar : w2a1Var;
            case 12:
                if (fbkVar instanceof jj81) {
                    jj81Var = (jj81) fbkVar;
                    int i28 = jj81Var.f112953b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        jj81Var.f112953b = i28 - Integer.MIN_VALUE;
                    } else {
                        jj81Var = new jj81(this, fbkVar);
                    }
                } else {
                    jj81Var = new jj81(this, fbkVar);
                }
                Object obj14 = jj81Var.f112952a;
                int i29 = jj81Var.f112953b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                Boolean boolValueOf5 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                jj81Var.f112953b = 1;
                return nizVar.emit(boolValueOf5, jj81Var) == yukVar ? yukVar : w2a1Var;
            case 13:
                if (fbkVar instanceof kj81) {
                    kj81Var = (kj81) fbkVar;
                    int i30 = kj81Var.f123266b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        kj81Var.f123266b = i30 - Integer.MIN_VALUE;
                    } else {
                        kj81Var = new kj81(this, fbkVar);
                    }
                } else {
                    kj81Var = new kj81(this, fbkVar);
                }
                Object obj15 = kj81Var.f123265a;
                int i31 = kj81Var.f123266b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                Boolean boolValueOf6 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                kj81Var.f123266b = 1;
                return nizVar.emit(boolValueOf6, kj81Var) == yukVar ? yukVar : w2a1Var;
            case 14:
                if (fbkVar instanceof lj81) {
                    lj81Var = (lj81) fbkVar;
                    int i32 = lj81Var.f134010b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        lj81Var.f134010b = i32 - Integer.MIN_VALUE;
                    } else {
                        lj81Var = new lj81(this, fbkVar);
                    }
                } else {
                    lj81Var = new lj81(this, fbkVar);
                }
                Object obj16 = lj81Var.f134009a;
                int i33 = lj81Var.f134010b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                Boolean boolValueOf7 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                lj81Var.f134010b = 1;
                return nizVar.emit(boolValueOf7, lj81Var) == yukVar ? yukVar : w2a1Var;
            case 15:
                if (fbkVar instanceof mj81) {
                    mj81Var = (mj81) fbkVar;
                    int i34 = mj81Var.f144189b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        mj81Var.f144189b = i34 - Integer.MIN_VALUE;
                    } else {
                        mj81Var = new mj81(this, fbkVar);
                    }
                } else {
                    mj81Var = new mj81(this, fbkVar);
                }
                Object obj17 = mj81Var.f144188a;
                int i35 = mj81Var.f144189b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                Boolean boolValueOf8 = Boolean.valueOf(!((u341) obj).equals(t341.f216707a));
                mj81Var.f144189b = 1;
                return nizVar.emit(boolValueOf8, mj81Var) == yukVar ? yukVar : w2a1Var;
            case 16:
                if (fbkVar instanceof ek81) {
                    ek81Var = (ek81) fbkVar;
                    int i36 = ek81Var.f60410b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ek81Var.f60410b = i36 - Integer.MIN_VALUE;
                    } else {
                        ek81Var = new ek81(this, fbkVar);
                    }
                } else {
                    ek81Var = new ek81(this, fbkVar);
                }
                Object obj18 = ek81Var.f60409a;
                int i37 = ek81Var.f60410b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                Boolean boolValueOf9 = Boolean.valueOf(((z190) obj).f278263a.m30587b());
                ek81Var.f60410b = 1;
                return nizVar.emit(boolValueOf9, ek81Var) == yukVar ? yukVar : w2a1Var;
            case 17:
                if (fbkVar instanceof kk81) {
                    kk81Var = (kk81) fbkVar;
                    int i38 = kk81Var.f123537b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        kk81Var.f123537b = i38 - Integer.MIN_VALUE;
                    } else {
                        kk81Var = new kk81(this, fbkVar);
                    }
                } else {
                    kk81Var = new kk81(this, fbkVar);
                }
                Object obj19 = kk81Var.f123536a;
                int i39 = kk81Var.f123537b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                if (((String) obj).length() <= 0) {
                    return w2a1Var;
                }
                kk81Var.f123537b = 1;
                return nizVar.emit(obj, kk81Var) == yukVar ? yukVar : w2a1Var;
            case 18:
                if (fbkVar instanceof du81) {
                    du81Var = (du81) fbkVar;
                    int i40 = du81Var.f53012b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        du81Var.f53012b = i40 - Integer.MIN_VALUE;
                    } else {
                        du81Var = new du81(this, fbkVar);
                    }
                } else {
                    du81Var = new du81(this, fbkVar);
                }
                Object obj20 = du81Var.f53011a;
                int i41 = du81Var.f53012b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                byte[] bArr = (byte[]) obj;
                try {
                    EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEventM7655F = EsTrafficEvents$TrafficEvent.m7655F(bArr);
                    du81Var.f53012b = 1;
                    return nizVar.emit(esTrafficEvents$TrafficEventM7655F, du81Var) == yukVar ? yukVar : w2a1Var;
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents.TrafficEvent: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 19:
                if (fbkVar instanceof qw81) {
                    qw81Var = (qw81) fbkVar;
                    int i42 = qw81Var.f193213b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        qw81Var.f193213b = i42 - Integer.MIN_VALUE;
                    } else {
                        qw81Var = new qw81(this, fbkVar);
                    }
                } else {
                    qw81Var = new qw81(this, fbkVar);
                }
                Object obj21 = qw81Var.f193212a;
                int i43 = qw81Var.f193213b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                qw81Var.f193213b = 1;
                return nizVar.emit(obj, qw81Var) == yukVar ? yukVar : w2a1Var;
            case 20:
                if (fbkVar instanceof rw81) {
                    rw81Var = (rw81) fbkVar;
                    int i44 = rw81Var.f203305b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        rw81Var.f203305b = i44 - Integer.MIN_VALUE;
                    } else {
                        rw81Var = new rw81(this, fbkVar);
                    }
                } else {
                    rw81Var = new rw81(this, fbkVar);
                }
                Object obj22 = rw81Var.f203304a;
                int i45 = rw81Var.f203305b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                Object obj23 = ((oho) obj).f165512a;
                rw81Var.f203305b = 1;
                return nizVar.emit(obj23, rw81Var) == yukVar ? yukVar : w2a1Var;
            case 21:
                if (fbkVar instanceof b191) {
                    b191Var = (b191) fbkVar;
                    int i46 = b191Var.f22268b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        b191Var.f22268b = i46 - Integer.MIN_VALUE;
                    } else {
                        b191Var = new b191(this, fbkVar);
                    }
                } else {
                    b191Var = new b191(this, fbkVar);
                }
                Object obj24 = b191Var.f22267a;
                int i47 = b191Var.f22268b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                Boolean boolValueOf10 = Boolean.valueOf(((pe01) obj).f176585b);
                b191Var.f22268b = 1;
                return nizVar.emit(boolValueOf10, b191Var) == yukVar ? yukVar : w2a1Var;
            case 22:
                if (fbkVar instanceof c191) {
                    c191Var = (c191) fbkVar;
                    int i48 = c191Var.f33030b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        c191Var.f33030b = i48 - Integer.MIN_VALUE;
                    } else {
                        c191Var = new c191(this, fbkVar);
                    }
                } else {
                    c191Var = new c191(this, fbkVar);
                }
                Object obj25 = c191Var.f33029a;
                int i49 = c191Var.f33030b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                List list2 = (List) obj;
                wj50.m88279p(list2);
                pob pobVar = (pob) g6f.m43745s0(list2);
                Boolean boolValueOf11 = Boolean.valueOf((pobVar != null ? pobVar.f179665c : 0) == 3);
                c191Var.f33030b = 1;
                return nizVar.emit(boolValueOf11, c191Var) == yukVar ? yukVar : w2a1Var;
            case 23:
                if (fbkVar instanceof b691) {
                    b691Var = (b691) fbkVar;
                    int i50 = b691Var.f23886b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        b691Var.f23886b = i50 - Integer.MIN_VALUE;
                    } else {
                        b691Var = new b691(this, fbkVar);
                    }
                } else {
                    b691Var = new b691(this, fbkVar);
                }
                Object obj26 = b691Var.f23885a;
                int i51 = b691Var.f23886b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                ty80 ty80Var2 = (ty80) obj;
                ybv ybvVar2 = ty80Var2.f224877f;
                ilv0 ilv0Var = new ilv0(ybvVar2.f271265j, ty80Var2.f224876e, ybvVar2.f271272q, ybvVar2.f271279x);
                b691Var.f23886b = 1;
                return nizVar.emit(ilv0Var, b691Var) == yukVar ? yukVar : w2a1Var;
            case 24:
                if (fbkVar instanceof ec91) {
                    ec91Var = (ec91) fbkVar;
                    int i52 = ec91Var.f58274b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ec91Var.f58274b = i52 - Integer.MIN_VALUE;
                    } else {
                        ec91Var = new ec91(this, fbkVar);
                    }
                } else {
                    ec91Var = new ec91(this, fbkVar);
                }
                Object obj27 = ec91Var.f58273a;
                int i53 = ec91Var.f58274b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                vy81 vy81Var = (vy81) obj;
                String str7 = vy81Var.f246010b;
                int i54 = vy81Var.f246006X;
                String str8 = vy81Var.f246013e;
                int i55 = vy81Var.f246014f;
                int i56 = vy81Var.f246015g;
                int i57 = vy81Var.f246016h;
                List list3 = vy81Var.f246017i;
                boolean z4 = vy81Var.f246018t;
                if (vy81Var.f246007Y) {
                    i = 2;
                    if (i54 == 2) {
                        i2 = i;
                    } else if (i54 == 3) {
                        i2 = 1;
                    } else {
                        i = 4;
                        if (i54 == 4) {
                            i2 = i;
                        } else {
                            i2 = 3;
                        }
                    }
                } else if (i54 == 3) {
                    i2 = 1;
                } else {
                    i = 4;
                    if (i54 == 4) {
                        i2 = i;
                    } else {
                        i2 = 3;
                    }
                }
                rou0 rou0Var = new rou0(str7, str8, i55, i56, i57, list3, z4, i2, vy81Var.f246008Z);
                ec91Var.f58274b = 1;
                return nizVar.emit(rou0Var, ec91Var) == yukVar ? yukVar : w2a1Var;
            case 25:
                if (fbkVar instanceof fc91) {
                    fc91Var = (fc91) fbkVar;
                    int i58 = fc91Var.f68039b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        fc91Var.f68039b = i58 - Integer.MIN_VALUE;
                    } else {
                        fc91Var = new fc91(this, fbkVar);
                    }
                } else {
                    fc91Var = new fc91(this, fbkVar);
                }
                Object obj28 = fc91Var.f68038a;
                int i59 = fc91Var.f68039b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                qho qhoVar2 = (qho) obj;
                qhoVar2.getClass();
                if (qhoVar2 instanceof pho) {
                    return w2a1Var;
                }
                fc91Var.f68039b = 1;
                return nizVar.emit(obj, fc91Var) == yukVar ? yukVar : w2a1Var;
            case 26:
                if (fbkVar instanceof gc91) {
                    gc91Var = (gc91) fbkVar;
                    int i60 = gc91Var.f78523b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        gc91Var.f78523b = i60 - Integer.MIN_VALUE;
                    } else {
                        gc91Var = new gc91(this, fbkVar);
                    }
                } else {
                    gc91Var = new gc91(this, fbkVar);
                }
                Object obj29 = gc91Var.f78522a;
                int i61 = gc91Var.f78523b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                Object objM85619a = vie1.m85619a((qho) obj);
                gc91Var.f78523b = 1;
                return nizVar.emit(objM85619a, gc91Var) == yukVar ? yukVar : w2a1Var;
            case 27:
                if (fbkVar instanceof kc91) {
                    kc91Var = (kc91) fbkVar;
                    int i62 = kc91Var.f121415b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        kc91Var.f121415b = i62 - Integer.MIN_VALUE;
                    } else {
                        kc91Var = new kc91(this, fbkVar);
                    }
                } else {
                    kc91Var = new kc91(this, fbkVar);
                }
                Object obj30 = kc91Var.f121414a;
                int i63 = kc91Var.f121415b;
                if (i63 != 0) {
                    if (i63 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                if (!(obj instanceof chy0)) {
                    return w2a1Var;
                }
                kc91Var.f121415b = 1;
                return nizVar.emit(obj, kc91Var) == yukVar ? yukVar : w2a1Var;
            case 28:
                if (fbkVar instanceof mc91) {
                    mc91Var = (mc91) fbkVar;
                    int i64 = mc91Var.f142109b;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        mc91Var.f142109b = i64 - Integer.MIN_VALUE;
                    } else {
                        mc91Var = new mc91(this, fbkVar);
                    }
                } else {
                    mc91Var = new mc91(this, fbkVar);
                }
                Object obj31 = mc91Var.f142108a;
                int i65 = mc91Var.f142109b;
                if (i65 != 0) {
                    if (i65 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                if (!(obj instanceof ic91)) {
                    return w2a1Var;
                }
                mc91Var.f142109b = 1;
                return nizVar.emit(obj, mc91Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof nc91) {
                    nc91Var = (nc91) fbkVar;
                    int i66 = nc91Var.f152479b;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        nc91Var.f152479b = i66 - Integer.MIN_VALUE;
                    } else {
                        nc91Var = new nc91(this, fbkVar);
                    }
                } else {
                    nc91Var = new nc91(this, fbkVar);
                }
                Object obj32 = nc91Var.f152478a;
                int i67 = nc91Var.f152479b;
                if (i67 != 0) {
                    if (i67 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                String str9 = ((ic91) obj).f100763a;
                nc91Var.f152479b = 1;
                return nizVar.emit(str9, nc91Var) == yukVar ? yukVar : w2a1Var;
        }
    }

    public ud71(niz nizVar, hc91 hc91Var) {
        this.f229192a = 24;
        this.f229193b = nizVar;
    }
}
