package p204p;

import com.spotify.connectivity.pubsub.esperanto.proto.EsConnectionId$ConnectionID;
import com.spotify.connectivity.pubsub.esperanto.proto.EsPushedMessage$PushedMessage;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes7.dex */
public final class a4t0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f12314b;

    public /* synthetic */ a4t0(niz nizVar, int i) {
        this.f12313a = i;
        this.f12314b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01af  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:149:0x023e  */
    /* JADX WARN: Code duplicated, block: B:167:0x027c  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:204:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:220:0x033a  */
    /* JADX WARN: Code duplicated, block: B:236:0x037a  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:284:0x0432  */
    /* JADX WARN: Code duplicated, block: B:300:0x0473  */
    /* JADX WARN: Code duplicated, block: B:316:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:331:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:338:0x0509  */
    /* JADX WARN: Code duplicated, block: B:363:0x0566  */
    /* JADX WARN: Code duplicated, block: B:379:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:403:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:419:0x0633  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:448:0x0699  */
    /* JADX WARN: Code duplicated, block: B:464:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:485:0x0727  */
    /* JADX WARN: Code duplicated, block: B:506:0x0777  */
    /* JADX WARN: Code duplicated, block: B:522:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:540:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:610:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0170  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        z3t0 z3t0Var;
        u4t0 u4t0Var;
        e5t0 e5t0Var;
        h5t0 h5t0Var;
        i5t0 i5t0Var;
        l6t0 l6t0Var;
        e7t0 e7t0Var;
        f7t0 f7t0Var;
        b8t0 b8t0Var;
        mdt0 mdt0Var;
        iht0 iht0Var;
        mht0 mht0Var;
        pht0 pht0Var;
        qht0 qht0Var;
        bit0 bit0Var;
        int0 int0Var;
        jnt0 jnt0Var;
        knt0 knt0Var;
        xpt0 xpt0Var;
        pqt0 pqt0Var;
        brt0 brt0Var;
        crt0 crt0Var;
        ett0 ett0Var;
        but0 but0Var;
        t3u0 t3u0Var;
        n7u0 n7u0Var;
        bcu0 bcu0Var;
        dcu0 dcu0Var;
        ecu0 ecu0Var;
        hcu0 hcu0Var;
        int i = this.f12313a;
        qvd1 qvd1Var = qvd1.f192981b;
        int i2 = 0;
        z = false;
        boolean z = false;
        i2 = 0;
        Object obj2 = null;
        Object obj3 = w2a1.f247311a;
        niz nizVar = this.f12314b;
        Object obj4 = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof z3t0) {
                    z3t0Var = (z3t0) fbkVar;
                    int i3 = z3t0Var.f279036b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z3t0Var.f279036b = i3 - Integer.MIN_VALUE;
                    } else {
                        z3t0Var = new z3t0(this, fbkVar);
                    }
                } else {
                    z3t0Var = new z3t0(this, fbkVar);
                }
                Object obj5 = z3t0Var.f279035a;
                int i4 = z3t0Var.f279036b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return obj3;
                }
                bga.m29073P(obj5);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                obj2 = ohoVar != null ? (Boolean) ohoVar.f165512a : null;
                if (obj2 == null) {
                    return obj3;
                }
                z3t0Var.f279036b = 1;
                return nizVar.emit(obj2, z3t0Var) == obj4 ? obj4 : obj3;
            case 1:
                if (fbkVar instanceof u4t0) {
                    u4t0Var = (u4t0) fbkVar;
                    int i5 = u4t0Var.f226797b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        u4t0Var.f226797b = i5 - Integer.MIN_VALUE;
                    } else {
                        u4t0Var = new u4t0(this, fbkVar);
                    }
                } else {
                    u4t0Var = new u4t0(this, fbkVar);
                }
                Object obj6 = u4t0Var.f226796a;
                int i6 = u4t0Var.f226797b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return obj3;
                }
                bga.m29073P(obj6);
                if (!(obj instanceof chy0)) {
                    return obj3;
                }
                u4t0Var.f226797b = 1;
                return nizVar.emit(obj, u4t0Var) == obj4 ? obj4 : obj3;
            case 2:
                if (fbkVar instanceof e5t0) {
                    e5t0Var = (e5t0) fbkVar;
                    int i7 = e5t0Var.f56466b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        e5t0Var.f56466b = i7 - Integer.MIN_VALUE;
                    } else {
                        e5t0Var = new e5t0(this, fbkVar);
                    }
                } else {
                    e5t0Var = new e5t0(this, fbkVar);
                }
                Object obj7 = e5t0Var.f56465a;
                int i8 = e5t0Var.f56466b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return obj3;
                }
                bga.m29073P(obj7);
                Object id = ((EsConnectionId$ConnectionID) obj).getId();
                e5t0Var.f56466b = 1;
                return nizVar.emit(id, e5t0Var) == obj4 ? obj4 : obj3;
            case 3:
                if (fbkVar instanceof h5t0) {
                    h5t0Var = (h5t0) fbkVar;
                    int i9 = h5t0Var.f87899b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        h5t0Var.f87899b = i9 - Integer.MIN_VALUE;
                    } else {
                        h5t0Var = new h5t0(this, fbkVar);
                    }
                } else {
                    h5t0Var = new h5t0(this, fbkVar);
                }
                Object obj8 = h5t0Var.f87898a;
                int i10 = h5t0Var.f87899b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return obj3;
                }
                bga.m29073P(obj8);
                byte[] bArr = (byte[]) obj;
                try {
                    Object objM7534o = EsConnectionId$ConnectionID.m7534o(bArr);
                    h5t0Var.f87899b = 1;
                    return nizVar.emit(objM7534o, h5t0Var) == obj4 ? obj4 : obj3;
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.pubsub.esperanto.proto.EsConnectionId.ConnectionID: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 4:
                if (fbkVar instanceof i5t0) {
                    i5t0Var = (i5t0) fbkVar;
                    int i11 = i5t0Var.f99021b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        i5t0Var.f99021b = i11 - Integer.MIN_VALUE;
                    } else {
                        i5t0Var = new i5t0(this, fbkVar);
                    }
                } else {
                    i5t0Var = new i5t0(this, fbkVar);
                }
                Object obj9 = i5t0Var.f99020a;
                int i12 = i5t0Var.f99021b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return obj3;
                }
                bga.m29073P(obj9);
                byte[] bArr2 = (byte[]) obj;
                try {
                    Object objM7540r = EsPushedMessage$PushedMessage.m7540r(bArr2);
                    i5t0Var.f99021b = 1;
                    return nizVar.emit(objM7540r, i5t0Var) == obj4 ? obj4 : obj3;
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.pubsub.esperanto.proto.EsPushedMessage.PushedMessage: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 5:
                if (fbkVar instanceof l6t0) {
                    l6t0Var = (l6t0) fbkVar;
                    int i13 = l6t0Var.f130476b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        l6t0Var.f130476b = i13 - Integer.MIN_VALUE;
                    } else {
                        l6t0Var = new l6t0(this, fbkVar);
                    }
                } else {
                    l6t0Var = new l6t0(this, fbkVar);
                }
                Object obj10 = l6t0Var.f130475a;
                int i14 = l6t0Var.f130476b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return obj3;
                }
                bga.m29073P(obj10);
                Object objValueOf = Boolean.valueOf(!((pe01) obj).f176586c);
                l6t0Var.f130476b = 1;
                return nizVar.emit(objValueOf, l6t0Var) == obj4 ? obj4 : obj3;
            case 6:
                if (fbkVar instanceof e7t0) {
                    e7t0Var = (e7t0) fbkVar;
                    int i15 = e7t0Var.f57008b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        e7t0Var.f57008b = i15 - Integer.MIN_VALUE;
                    } else {
                        e7t0Var = new e7t0(this, fbkVar);
                    }
                } else {
                    e7t0Var = new e7t0(this, fbkVar);
                }
                Object obj11 = e7t0Var.f57007a;
                int i16 = e7t0Var.f57008b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return obj3;
                }
                bga.m29073P(obj11);
                ae50 ae50VarM98196n = ((YourLibraryResponse) obj).m98196n();
                if (!ae50VarM98196n.isEmpty()) {
                    Iterator<E> it = ae50VarM98196n.iterator();
                    while (it.hasNext()) {
                        if (((YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) it.next()).hasPlaylist() && (i2 = i2 + 1) < 0) {
                            h6f.m46721R();
                            throw null;
                        }
                    }
                }
                Object num = new Integer(i2);
                e7t0Var.f57008b = 1;
                return nizVar.emit(num, e7t0Var) == obj4 ? obj4 : obj3;
            case 7:
                if (fbkVar instanceof f7t0) {
                    f7t0Var = (f7t0) fbkVar;
                    int i17 = f7t0Var.f66793b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        f7t0Var.f66793b = i17 - Integer.MIN_VALUE;
                    } else {
                        f7t0Var = new f7t0(this, fbkVar);
                    }
                } else {
                    f7t0Var = new f7t0(this, fbkVar);
                }
                Object obj12 = f7t0Var.f66792a;
                int i18 = f7t0Var.f66793b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return obj3;
                }
                bga.m29073P(obj12);
                ((Number) obj).intValue();
                f7t0Var.f66793b = 1;
                return nizVar.emit(obj3, f7t0Var) == obj4 ? obj4 : obj3;
            case 8:
                if (fbkVar instanceof b8t0) {
                    b8t0Var = (b8t0) fbkVar;
                    int i19 = b8t0Var.f24657b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        b8t0Var.f24657b = i19 - Integer.MIN_VALUE;
                    } else {
                        b8t0Var = new b8t0(this, fbkVar);
                    }
                } else {
                    b8t0Var = new b8t0(this, fbkVar);
                }
                Object obj13 = b8t0Var.f24656a;
                int i20 = b8t0Var.f24657b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return obj3;
                }
                bga.m29073P(obj13);
                int iOrdinal = ((fat0) obj).f67637a.ordinal();
                tqu tquVar = (iOrdinal == 3 || iOrdinal == 6) ? tqu.f222887c : null;
                Object objM46716M = h6f.m46716M(tquVar != null ? new vav(tquVar) : null);
                b8t0Var.f24657b = 1;
                return nizVar.emit(objM46716M, b8t0Var) == obj4 ? obj4 : obj3;
            case 9:
                if (fbkVar instanceof mdt0) {
                    mdt0Var = (mdt0) fbkVar;
                    int i21 = mdt0Var.f142496b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        mdt0Var.f142496b = i21 - Integer.MIN_VALUE;
                    } else {
                        mdt0Var = new mdt0(this, fbkVar);
                    }
                } else {
                    mdt0Var = new mdt0(this, fbkVar);
                }
                Object obj14 = mdt0Var.f142495a;
                int i22 = mdt0Var.f142496b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return obj3;
                }
                bga.m29073P(obj14);
                ta0 ta0Var = (ta0) obj;
                wj50.m88279p(ta0Var);
                Object qct0Var = new qct0(ta0Var);
                mdt0Var.f142496b = 1;
                return nizVar.emit(qct0Var, mdt0Var) == obj4 ? obj4 : obj3;
            case 10:
                if (fbkVar instanceof iht0) {
                    iht0Var = (iht0) fbkVar;
                    int i23 = iht0Var.f102364b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        iht0Var.f102364b = i23 - Integer.MIN_VALUE;
                    } else {
                        iht0Var = new iht0(this, fbkVar);
                    }
                } else {
                    iht0Var = new iht0(this, fbkVar);
                }
                Object obj15 = iht0Var.f102363a;
                int i24 = iht0Var.f102364b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return obj3;
                }
                bga.m29073P(obj15);
                qui quiVar = (qui) obj;
                boolean z2 = quiVar instanceof pui;
                Object pduVar = rdu.f198207a;
                if (z2) {
                    int iM38547C = edb.m38547C(((pui) quiVar).f181459c);
                    if (iM38547C == 0) {
                        pduVar = new pdu(new Integer(R.string.settings_item_quality_device_incompatible_quality), null);
                    } else if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                iht0Var.f102364b = 1;
                return nizVar.emit(pduVar, iht0Var) == obj4 ? obj4 : obj3;
            case 11:
                if (fbkVar instanceof mht0) {
                    mht0Var = (mht0) fbkVar;
                    int i25 = mht0Var.f143869b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        mht0Var.f143869b = i25 - Integer.MIN_VALUE;
                    } else {
                        mht0Var = new mht0(this, fbkVar);
                    }
                } else {
                    mht0Var = new mht0(this, fbkVar);
                }
                Object obj16 = mht0Var.f143868a;
                int i26 = mht0Var.f143869b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return obj3;
                }
                bga.m29073P(obj16);
                String str = (String) obj;
                nzv nzvVar = jht0.f112563f;
                nzvVar.getClass();
                C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
                while (c2042k7.hasNext()) {
                    Object next = c2042k7.next();
                    if (wj50.m88271j(((jht0) next).f112564a, str)) {
                        obj2 = next;
                        mht0Var.f143869b = 1;
                        if (nizVar.emit(obj2, mht0Var) == obj4) {
                            return obj4;
                        }
                        return obj3;
                    }
                }
                mht0Var.f143869b = 1;
                if (nizVar.emit(obj2, mht0Var) == obj4) {
                    return obj4;
                }
                return obj3;
            case 12:
                if (fbkVar instanceof pht0) {
                    pht0Var = (pht0) fbkVar;
                    int i27 = pht0Var.f177723b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        pht0Var.f177723b = i27 - Integer.MIN_VALUE;
                    } else {
                        pht0Var = new pht0(this, fbkVar);
                    }
                } else {
                    pht0Var = new pht0(this, fbkVar);
                }
                Object obj17 = pht0Var.f177722a;
                int i28 = pht0Var.f177723b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return obj3;
                }
                bga.m29073P(obj17);
                Object objValueOf2 = Boolean.valueOf(dxf1.m37249y((Map) obj));
                pht0Var.f177723b = 1;
                return nizVar.emit(objValueOf2, pht0Var) == obj4 ? obj4 : obj3;
            case 13:
                if (fbkVar instanceof qht0) {
                    qht0Var = (qht0) fbkVar;
                    int i29 = qht0Var.f188852b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        qht0Var.f188852b = i29 - Integer.MIN_VALUE;
                    } else {
                        qht0Var = new qht0(this, fbkVar);
                    }
                } else {
                    qht0Var = new qht0(this, fbkVar);
                }
                Object obj18 = qht0Var.f188851a;
                int i30 = qht0Var.f188852b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return obj3;
                }
                bga.m29073P(obj18);
                Object objValueOf3 = Boolean.valueOf(wj50.m88271j((String) obj, "GBB"));
                qht0Var.f188852b = 1;
                return nizVar.emit(objValueOf3, qht0Var) == obj4 ? obj4 : obj3;
            case 14:
                if (fbkVar instanceof bit0) {
                    bit0Var = (bit0) fbkVar;
                    int i31 = bit0Var.f27547b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        bit0Var.f27547b = i31 - Integer.MIN_VALUE;
                    } else {
                        bit0Var = new bit0(this, fbkVar);
                    }
                } else {
                    bit0Var = new bit0(this, fbkVar);
                }
                Object obj19 = bit0Var.f27546a;
                int i32 = bit0Var.f27547b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return obj3;
                }
                bga.m29073P(obj19);
                Object v1lVar = new v1l(((Set) obj).toString());
                bit0Var.f27547b = 1;
                return nizVar.emit(v1lVar, bit0Var) == obj4 ? obj4 : obj3;
            case 15:
                if (fbkVar instanceof int0) {
                    int0Var = (int0) fbkVar;
                    int i33 = int0Var.f104060b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        int0Var.f104060b = i33 - Integer.MIN_VALUE;
                    } else {
                        int0Var = new int0(this, fbkVar);
                    }
                } else {
                    int0Var = new int0(this, fbkVar);
                }
                Object obj20 = int0Var.f104059a;
                int i34 = int0Var.f104060b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return obj3;
                }
                bga.m29073P(obj20);
                Object xot0Var = new xot0((gxb) obj);
                int0Var.f104060b = 1;
                return nizVar.emit(xot0Var, int0Var) == obj4 ? obj4 : obj3;
            case 16:
                if (fbkVar instanceof jnt0) {
                    jnt0Var = (jnt0) fbkVar;
                    int i35 = jnt0Var.f114198b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        jnt0Var.f114198b = i35 - Integer.MIN_VALUE;
                    } else {
                        jnt0Var = new jnt0(this, fbkVar);
                    }
                } else {
                    jnt0Var = new jnt0(this, fbkVar);
                }
                Object obj21 = jnt0Var.f114197a;
                int i36 = jnt0Var.f114198b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return obj3;
                }
                bga.m29073P(obj21);
                Object oot0Var = new oot0((String) obj);
                jnt0Var.f114198b = 1;
                return nizVar.emit(oot0Var, jnt0Var) == obj4 ? obj4 : obj3;
            case 17:
                if (fbkVar instanceof knt0) {
                    knt0Var = (knt0) fbkVar;
                    int i37 = knt0Var.f124471b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        knt0Var.f124471b = i37 - Integer.MIN_VALUE;
                    } else {
                        knt0Var = new knt0(this, fbkVar);
                    }
                } else {
                    knt0Var = new knt0(this, fbkVar);
                }
                Object obj22 = knt0Var.f124470a;
                int i38 = knt0Var.f124471b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return obj3;
                }
                bga.m29073P(obj22);
                Object upt0Var = new upt0(((Boolean) obj).booleanValue());
                knt0Var.f124471b = 1;
                return nizVar.emit(upt0Var, knt0Var) == obj4 ? obj4 : obj3;
            case 18:
                if (fbkVar instanceof xpt0) {
                    xpt0Var = (xpt0) fbkVar;
                    int i39 = xpt0Var.f264724b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        xpt0Var.f264724b = i39 - Integer.MIN_VALUE;
                    } else {
                        xpt0Var = new xpt0(this, fbkVar);
                    }
                } else {
                    xpt0Var = new xpt0(this, fbkVar);
                }
                Object obj23 = xpt0Var.f264723a;
                int i40 = xpt0Var.f264724b;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return obj3;
                }
                bga.m29073P(obj23);
                Object objValueOf4 = Boolean.valueOf(((q820) obj).f186220a);
                xpt0Var.f264724b = 1;
                return nizVar.emit(objValueOf4, xpt0Var) == obj4 ? obj4 : obj3;
            case 19:
                if (fbkVar instanceof pqt0) {
                    pqt0Var = (pqt0) fbkVar;
                    int i41 = pqt0Var.f180423b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        pqt0Var.f180423b = i41 - Integer.MIN_VALUE;
                    } else {
                        pqt0Var = new pqt0(this, fbkVar);
                    }
                } else {
                    pqt0Var = new pqt0(this, fbkVar);
                }
                Object obj24 = pqt0Var.f180422a;
                int i42 = pqt0Var.f180423b;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return obj3;
                }
                bga.m29073P(obj24);
                xxd1 xxd1Var = (xxd1) obj;
                Object objValueOf5 = Boolean.valueOf(wj50.m88271j(xxd1Var != null ? xxd1Var.f266948b : null, qvd1Var));
                pqt0Var.f180423b = 1;
                return nizVar.emit(objValueOf5, pqt0Var) == obj4 ? obj4 : obj3;
            case 20:
                if (fbkVar instanceof brt0) {
                    brt0Var = (brt0) fbkVar;
                    int i43 = brt0Var.f30168b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        brt0Var.f30168b = i43 - Integer.MIN_VALUE;
                    } else {
                        brt0Var = new brt0(this, fbkVar);
                    }
                } else {
                    brt0Var = new brt0(this, fbkVar);
                }
                Object obj25 = brt0Var.f30167a;
                int i44 = brt0Var.f30168b;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return obj3;
                }
                bga.m29073P(obj25);
                if (!((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                brt0Var.f30168b = 1;
                return nizVar.emit(obj, brt0Var) == obj4 ? obj4 : obj3;
            case 21:
                if (fbkVar instanceof crt0) {
                    crt0Var = (crt0) fbkVar;
                    int i45 = crt0Var.f41409b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        crt0Var.f41409b = i45 - Integer.MIN_VALUE;
                    } else {
                        crt0Var = new crt0(this, fbkVar);
                    }
                } else {
                    crt0Var = new crt0(this, fbkVar);
                }
                Object obj26 = crt0Var.f41408a;
                int i46 = crt0Var.f41409b;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return obj3;
                }
                bga.m29073P(obj26);
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                crt0Var.f41409b = 1;
                return nizVar.emit(obj, crt0Var) == obj4 ? obj4 : obj3;
            case 22:
                if (fbkVar instanceof ett0) {
                    ett0Var = (ett0) fbkVar;
                    int i47 = ett0Var.f62802b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ett0Var.f62802b = i47 - Integer.MIN_VALUE;
                    } else {
                        ett0Var = new ett0(this, fbkVar);
                    }
                } else {
                    ett0Var = new ett0(this, fbkVar);
                }
                Object obj27 = ett0Var.f62801a;
                int i48 = ett0Var.f62802b;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return obj3;
                }
                bga.m29073P(obj27);
                xxd1 xxd1Var2 = (xxd1) obj;
                Object objValueOf6 = Boolean.valueOf(wj50.m88271j(xxd1Var2 != null ? xxd1Var2.f266948b : null, qvd1Var));
                ett0Var.f62802b = 1;
                return nizVar.emit(objValueOf6, ett0Var) == obj4 ? obj4 : obj3;
            case 23:
                if (fbkVar instanceof but0) {
                    but0Var = (but0) fbkVar;
                    int i49 = but0Var.f31217b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        but0Var.f31217b = i49 - Integer.MIN_VALUE;
                    } else {
                        but0Var = new but0(this, fbkVar);
                    }
                } else {
                    but0Var = new but0(this, fbkVar);
                }
                Object obj28 = but0Var.f31216a;
                int i50 = but0Var.f31217b;
                if (i50 != 0) {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return obj3;
                }
                bga.m29073P(obj28);
                fv31 fv31Var = cut0.f42214c;
                String str2 = (String) ((gv31) obj).f84602a;
                Object objM88477a1 = str2 != null ? wl51.m88477a1(str2, new String[]{"\n"}, 0, 6) : cut0.f42215d;
                but0Var.f31217b = 1;
                return nizVar.emit(objM88477a1, but0Var) == obj4 ? obj4 : obj3;
            case 24:
                if (fbkVar instanceof t3u0) {
                    t3u0Var = (t3u0) fbkVar;
                    int i51 = t3u0Var.f216840b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        t3u0Var.f216840b = i51 - Integer.MIN_VALUE;
                    } else {
                        t3u0Var = new t3u0(this, fbkVar);
                    }
                } else {
                    t3u0Var = new t3u0(this, fbkVar);
                }
                Object obj29 = t3u0Var.f216839a;
                int i52 = t3u0Var.f216840b;
                if (i52 != 0) {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return obj3;
                }
                bga.m29073P(obj29);
                Object objValueOf7 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                t3u0Var.f216840b = 1;
                return nizVar.emit(objValueOf7, t3u0Var) == obj4 ? obj4 : obj3;
            case 25:
                if (fbkVar instanceof n7u0) {
                    n7u0Var = (n7u0) fbkVar;
                    int i53 = n7u0Var.f151220b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        n7u0Var.f151220b = i53 - Integer.MIN_VALUE;
                    } else {
                        n7u0Var = new n7u0(this, fbkVar);
                    }
                } else {
                    n7u0Var = new n7u0(this, fbkVar);
                }
                Object obj30 = n7u0Var.f151219a;
                int i54 = n7u0Var.f151220b;
                if (i54 != 0) {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return obj3;
                }
                bga.m29073P(obj30);
                String str3 = (String) obj;
                wj50.m88279p(str3);
                Object objValueOf8 = Boolean.valueOf(str3.equals("1"));
                n7u0Var.f151220b = 1;
                return nizVar.emit(objValueOf8, n7u0Var) == obj4 ? obj4 : obj3;
            case 26:
                if (fbkVar instanceof bcu0) {
                    bcu0Var = (bcu0) fbkVar;
                    int i55 = bcu0Var.f25945b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        bcu0Var.f25945b = i55 - Integer.MIN_VALUE;
                    } else {
                        bcu0Var = new bcu0(this, fbkVar);
                    }
                } else {
                    bcu0Var = new bcu0(this, fbkVar);
                }
                Object obj31 = bcu0Var.f25944a;
                int i56 = bcu0Var.f25945b;
                if (i56 != 0) {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return obj3;
                }
                bga.m29073P(obj31);
                Object uh40Var = new uh40(((Boolean) obj).booleanValue());
                bcu0Var.f25945b = 1;
                return nizVar.emit(uh40Var, bcu0Var) == obj4 ? obj4 : obj3;
            case 27:
                if (fbkVar instanceof dcu0) {
                    dcu0Var = (dcu0) fbkVar;
                    int i57 = dcu0Var.f47647b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        dcu0Var.f47647b = i57 - Integer.MIN_VALUE;
                    } else {
                        dcu0Var = new dcu0(this, fbkVar);
                    }
                } else {
                    dcu0Var = new dcu0(this, fbkVar);
                }
                Object obj32 = dcu0Var.f47646a;
                int i58 = dcu0Var.f47647b;
                if (i58 != 0) {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return obj3;
                }
                bga.m29073P(obj32);
                acu0 acu0Var = (acu0) obj;
                if ((acu0Var instanceof ybu0) && ((ybu0) acu0Var).f271248a.equals(lqj0.f136072a)) {
                    z = true;
                }
                Object objValueOf9 = Boolean.valueOf(z);
                dcu0Var.f47647b = 1;
                return nizVar.emit(objValueOf9, dcu0Var) == obj4 ? obj4 : obj3;
            case 28:
                if (fbkVar instanceof ecu0) {
                    ecu0Var = (ecu0) fbkVar;
                    int i59 = ecu0Var.f58390b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ecu0Var.f58390b = i59 - Integer.MIN_VALUE;
                    } else {
                        ecu0Var = new ecu0(this, fbkVar);
                    }
                } else {
                    ecu0Var = new ecu0(this, fbkVar);
                }
                Object obj33 = ecu0Var.f58389a;
                int i60 = ecu0Var.f58390b;
                if (i60 != 0) {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                    return obj3;
                }
                bga.m29073P(obj33);
                Object objValueOf10 = Boolean.valueOf(((acu0) obj) instanceof ybu0);
                ecu0Var.f58390b = 1;
                return nizVar.emit(objValueOf10, ecu0Var) == obj4 ? obj4 : obj3;
            default:
                if (fbkVar instanceof hcu0) {
                    hcu0Var = (hcu0) fbkVar;
                    int i61 = hcu0Var.f89912b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        hcu0Var.f89912b = i61 - Integer.MIN_VALUE;
                    } else {
                        hcu0Var = new hcu0(this, fbkVar);
                    }
                } else {
                    hcu0Var = new hcu0(this, fbkVar);
                }
                Object obj34 = hcu0Var.f89911a;
                int i62 = hcu0Var.f89912b;
                if (i62 != 0) {
                    if (i62 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                    return obj3;
                }
                bga.m29073P(obj34);
                Object objM61494a = mcu0.m61494a((acu0) obj);
                hcu0Var.f89912b = 1;
                return nizVar.emit(objM61494a, hcu0Var) == obj4 ? obj4 : obj3;
        }
    }

    public /* synthetic */ a4t0(niz nizVar, Object obj, int i) {
        this.f12313a = i;
        this.f12314b = nizVar;
    }
}
