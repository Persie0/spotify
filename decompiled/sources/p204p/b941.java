package p204p;

import android.graphics.Color;
import com.spotify.base.java.logging.Logger;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class b941 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f24769b;

    public /* synthetic */ b941(niz nizVar, int i) {
        this.f24768a = i;
        this.f24769b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x0206  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:193:0x030d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0352  */
    /* JADX WARN: Code duplicated, block: B:227:0x0399  */
    /* JADX WARN: Code duplicated, block: B:244:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:261:0x043f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0499  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:310:0x0519  */
    /* JADX WARN: Code duplicated, block: B:331:0x0569  */
    /* JADX WARN: Code duplicated, block: B:361:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:378:0x0633  */
    /* JADX WARN: Code duplicated, block: B:395:0x0679  */
    /* JADX WARN: Code duplicated, block: B:412:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:429:0x0711  */
    /* JADX WARN: Code duplicated, block: B:453:0x0765  */
    /* JADX WARN: Code duplicated, block: B:470:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:491:0x0800  */
    /* JADX WARN: Code duplicated, block: B:510:0x0844  */
    /* JADX WARN: Code duplicated, block: B:529:0x088d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:550:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:567:0x0932  */
    /* JADX WARN: Code duplicated, block: B:584:0x097a  */
    /* JADX WARN: Code duplicated, block: B:607:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0179  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v82, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r13v85, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        a941 a941Var;
        g941 g941Var;
        j941 j941Var;
        l941 l941Var;
        s941 s941Var;
        int color;
        ga41 ga41Var;
        ab41 ab41Var;
        ej41 ej41Var;
        ak41 ak41Var;
        ck41 ck41Var;
        gk41 gk41Var;
        hk41 hk41Var;
        yo41 yo41Var;
        mk51 mk51Var;
        yn51 yn51Var;
        Object arrayList;
        List<dx80> list;
        zp51 zp51Var;
        ys51 ys51Var;
        zs51 zs51Var;
        z161 z161Var;
        a361 a361Var;
        eg61 eg61Var;
        ao61 ao61Var;
        sp61 sp61Var;
        pro0 pro0Var;
        up61 up61Var;
        List listSingletonList;
        eq61 eq61Var;
        kq61 kq61Var;
        dw61 dw61Var;
        Object jw61Var;
        qy61 qy61Var;
        t971 t971Var;
        kb71 kb71Var;
        switch (this.f24768a) {
            case 0:
                if (fbkVar instanceof a941) {
                    a941Var = (a941) fbkVar;
                    int i = a941Var.f13469b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        a941Var.f13469b = i - Integer.MIN_VALUE;
                    } else {
                        a941Var = new a941(this, fbkVar);
                    }
                } else {
                    a941Var = new a941(this, fbkVar);
                }
                Object obj2 = a941Var.f13468a;
                int i2 = a941Var.f13469b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    PlayerState playerState = (PlayerState) obj;
                    Boolean boolValueOf = Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
                    a941Var.f13469b = 1;
                    Object objEmit = this.f24769b.emit(boolValueOf, a941Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof g941) {
                    g941Var = (g941) fbkVar;
                    int i3 = g941Var.f77672b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        g941Var.f77672b = i3 - Integer.MIN_VALUE;
                    } else {
                        g941Var = new g941(this, fbkVar);
                    }
                } else {
                    g941Var = new g941(this, fbkVar);
                }
                Object obj3 = g941Var.f77671a;
                int i4 = g941Var.f77672b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    PlayerState playerState2 = (PlayerState) obj;
                    Boolean boolValueOf2 = Boolean.valueOf(playerState2.isPlaying() && !playerState2.isPaused());
                    g941Var.f77672b = 1;
                    Object objEmit2 = this.f24769b.emit(boolValueOf2, g941Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof j941) {
                    j941Var = (j941) fbkVar;
                    int i5 = j941Var.f110091b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j941Var.f110091b = i5 - Integer.MIN_VALUE;
                    } else {
                        j941Var = new j941(this, fbkVar);
                    }
                } else {
                    j941Var = new j941(this, fbkVar);
                }
                Object obj4 = j941Var.f110090a;
                int i6 = j941Var.f110091b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    Boolean boolValueOf3 = Boolean.valueOf(((sv0) obj) instanceof pv0);
                    j941Var.f110091b = 1;
                    Object objEmit3 = this.f24769b.emit(boolValueOf3, j941Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof l941) {
                    l941Var = (l941) fbkVar;
                    int i7 = l941Var.f131003b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        l941Var.f131003b = i7 - Integer.MIN_VALUE;
                    } else {
                        l941Var = new l941(this, fbkVar);
                    }
                } else {
                    l941Var = new l941(this, fbkVar);
                }
                Object obj5 = l941Var.f131002a;
                int i8 = l941Var.f131003b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    Boolean boolValueOf4 = Boolean.valueOf(((fb80) obj).m41223a(fb80.f67754e));
                    l941Var.f131003b = 1;
                    Object objEmit4 = this.f24769b.emit(boolValueOf4, l941Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof s941) {
                    s941Var = (s941) fbkVar;
                    int i9 = s941Var.f206851b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        s941Var.f206851b = i9 - Integer.MIN_VALUE;
                    } else {
                        s941Var = new s941(this, fbkVar);
                    }
                } else {
                    s941Var = new s941(this, fbkVar);
                }
                Object obj6 = s941Var.f206850a;
                int i10 = s941Var.f206851b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    ContextTrack contextTrack = (ContextTrack) obj;
                    wj50.m88279p(contextTrack);
                    try {
                        color = Color.parseColor(e72.m37971E(contextTrack));
                    } catch (Exception unused) {
                        color = v941.f238841a;
                    }
                    Integer num = new Integer(mgg1.m61717l(color));
                    s941Var.f206851b = 1;
                    Object objEmit5 = this.f24769b.emit(num, s941Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                    break;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof ga41) {
                    ga41Var = (ga41) fbkVar;
                    int i11 = ga41Var.f77974b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ga41Var.f77974b = i11 - Integer.MIN_VALUE;
                    } else {
                        ga41Var = new ga41(this, fbkVar);
                    }
                } else {
                    ga41Var = new ga41(this, fbkVar);
                }
                Object obj7 = ga41Var.f77973a;
                int i12 = ga41Var.f77974b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        ga41Var.f77974b = 1;
                        Object objEmit6 = this.f24769b.emit(obj, ga41Var);
                        yuk yukVar6 = yuk.f276404a;
                        if (objEmit6 == yukVar6) {
                            return yukVar6;
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
                if (fbkVar instanceof ab41) {
                    ab41Var = (ab41) fbkVar;
                    int i13 = ab41Var.f13998b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ab41Var.f13998b = i13 - Integer.MIN_VALUE;
                    } else {
                        ab41Var = new ab41(this, fbkVar);
                    }
                } else {
                    ab41Var = new ab41(this, fbkVar);
                }
                Object obj8 = ab41Var.f13997a;
                int i14 = ab41Var.f13998b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    if (obj instanceof chy0) {
                        ab41Var.f13998b = 1;
                        Object objEmit7 = this.f24769b.emit(obj, ab41Var);
                        yuk yukVar7 = yuk.f276404a;
                        if (objEmit7 == yukVar7) {
                            return yukVar7;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof ej41) {
                    ej41Var = (ej41) fbkVar;
                    int i15 = ej41Var.f60130b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ej41Var.f60130b = i15 - Integer.MIN_VALUE;
                    } else {
                        ej41Var = new ej41(this, fbkVar);
                    }
                } else {
                    ej41Var = new ej41(this, fbkVar);
                }
                Object obj9 = ej41Var.f60129a;
                int i16 = ej41Var.f60130b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    Boolean boolValueOf5 = Boolean.valueOf(((gi20) obj).f80014a == di20.f49215c);
                    ej41Var.f60130b = 1;
                    Object objEmit8 = this.f24769b.emit(boolValueOf5, ej41Var);
                    yuk yukVar8 = yuk.f276404a;
                    if (objEmit8 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1.f247311a;
            case 8:
                if (fbkVar instanceof ak41) {
                    ak41Var = (ak41) fbkVar;
                    int i17 = ak41Var.f16435b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ak41Var.f16435b = i17 - Integer.MIN_VALUE;
                    } else {
                        ak41Var = new ak41(this, fbkVar);
                    }
                } else {
                    ak41Var = new ak41(this, fbkVar);
                }
                Object obj10 = ak41Var.f16434a;
                int i18 = ak41Var.f16435b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    Integer num2 = new Integer(-((Number) obj).intValue());
                    ak41Var.f16435b = 1;
                    Object objEmit9 = this.f24769b.emit(num2, ak41Var);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit9 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 9:
                if (fbkVar instanceof ck41) {
                    ck41Var = (ck41) fbkVar;
                    int i19 = ck41Var.f38815b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ck41Var.f38815b = i19 - Integer.MIN_VALUE;
                    } else {
                        ck41Var = new ck41(this, fbkVar);
                    }
                } else {
                    ck41Var = new ck41(this, fbkVar);
                }
                Object obj11 = ck41Var.f38814a;
                int i20 = ck41Var.f38815b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    Set set = ohoVar != null ? (Set) ohoVar.f165512a : null;
                    if (set != null) {
                        ck41Var.f38815b = 1;
                        Object objEmit10 = this.f24769b.emit(set, ck41Var);
                        yuk yukVar10 = yuk.f276404a;
                        if (objEmit10 == yukVar10) {
                            return yukVar10;
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
                if (fbkVar instanceof gk41) {
                    gk41Var = (gk41) fbkVar;
                    int i21 = gk41Var.f80730b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        gk41Var.f80730b = i21 - Integer.MIN_VALUE;
                    } else {
                        gk41Var = new gk41(this, fbkVar);
                    }
                } else {
                    gk41Var = new gk41(this, fbkVar);
                }
                Object obj12 = gk41Var.f80729a;
                int i22 = gk41Var.f80730b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    Boolean boolValueOf6 = Boolean.valueOf(((z190) obj).f278263a.m30586a());
                    gk41Var.f80730b = 1;
                    Object objEmit11 = this.f24769b.emit(boolValueOf6, gk41Var);
                    yuk yukVar11 = yuk.f276404a;
                    if (objEmit11 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1.f247311a;
            case 11:
                if (fbkVar instanceof hk41) {
                    hk41Var = (hk41) fbkVar;
                    int i23 = hk41Var.f92348b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        hk41Var.f92348b = i23 - Integer.MIN_VALUE;
                    } else {
                        hk41Var = new hk41(this, fbkVar);
                    }
                } else {
                    hk41Var = new hk41(this, fbkVar);
                }
                Object obj13 = hk41Var.f92347a;
                int i24 = hk41Var.f92348b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    Boolean boolValueOf7 = Boolean.valueOf(((z190) obj).f278263a.m30587b());
                    hk41Var.f92348b = 1;
                    Object objEmit12 = this.f24769b.emit(boolValueOf7, hk41Var);
                    yuk yukVar12 = yuk.f276404a;
                    if (objEmit12 == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
            case 12:
                if (fbkVar instanceof yo41) {
                    yo41Var = (yo41) fbkVar;
                    int i25 = yo41Var.f274557b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        yo41Var.f274557b = i25 - Integer.MIN_VALUE;
                    } else {
                        yo41Var = new yo41(this, fbkVar);
                    }
                } else {
                    yo41Var = new yo41(this, fbkVar);
                }
                Object obj14 = yo41Var.f274556a;
                int i26 = yo41Var.f274557b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    Object objMo49283h = ((xul0) obj).mo49283h();
                    yo41Var.f274557b = 1;
                    Object objEmit13 = this.f24769b.emit(objMo49283h, yo41Var);
                    yuk yukVar13 = yuk.f276404a;
                    if (objEmit13 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1.f247311a;
            case 13:
                if (fbkVar instanceof mk51) {
                    mk51Var = (mk51) fbkVar;
                    int i27 = mk51Var.f144501b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        mk51Var.f144501b = i27 - Integer.MIN_VALUE;
                    } else {
                        mk51Var = new mk51(this, fbkVar);
                    }
                } else {
                    mk51Var = new mk51(this, fbkVar);
                }
                Object obj15 = mk51Var.f144500a;
                int i28 = mk51Var.f144501b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    List listM46716M = h6f.m46716M((xav) obj);
                    mk51Var.f144501b = 1;
                    Object objEmit14 = this.f24769b.emit(listM46716M, mk51Var);
                    yuk yukVar14 = yuk.f276404a;
                    if (objEmit14 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1.f247311a;
            case 14:
                if (fbkVar instanceof yn51) {
                    yn51Var = (yn51) fbkVar;
                    int i29 = yn51Var.f274398b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        yn51Var.f274398b = i29 - Integer.MIN_VALUE;
                    } else {
                        yn51Var = new yn51(this, fbkVar);
                    }
                } else {
                    yn51Var = new yn51(this, fbkVar);
                }
                Object obj16 = yn51Var.f274397a;
                int i30 = yn51Var.f274398b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    p2x0 p2x0Var = (p2x0) obj;
                    m2x0 m2x0Var = p2x0Var instanceof m2x0 ? (m2x0) p2x0Var : null;
                    if (m2x0Var == null || (list = (List) m2x0Var.f139474a) == null) {
                        arrayList = lau.f131415a;
                    } else {
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        for (dx80 dx80Var : list) {
                            arrayList.add(new v6w0(dx80Var.f53899c, "spotify:local-files", null, dx80Var.f53897a, null, null, 52));
                        }
                    }
                    yn51Var.f274398b = 1;
                    Object objEmit15 = this.f24769b.emit(arrayList, yn51Var);
                    Object obj17 = yuk.f276404a;
                    if (objEmit15 == obj17) {
                        return obj17;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof zp51) {
                    zp51Var = (zp51) fbkVar;
                    int i31 = zp51Var.f284938b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        zp51Var.f284938b = i31 - Integer.MIN_VALUE;
                    } else {
                        zp51Var = new zp51(this, fbkVar);
                    }
                } else {
                    zp51Var = new zp51(this, fbkVar);
                }
                Object obj18 = zp51Var.f284937a;
                int i32 = zp51Var.f284938b;
                if (i32 == 0) {
                    bga.m29073P(obj18);
                    String str = (String) ((gv31) obj).f84602a;
                    String strConcat = str != null ? "spotify:show:".concat(str) : null;
                    zp51Var.f284938b = 1;
                    Object objEmit16 = this.f24769b.emit(strConcat, zp51Var);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit16 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ys51) {
                    ys51Var = (ys51) fbkVar;
                    int i33 = ys51Var.f275695b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ys51Var.f275695b = i33 - Integer.MIN_VALUE;
                    } else {
                        ys51Var = new ys51(this, fbkVar);
                    }
                } else {
                    ys51Var = new ys51(this, fbkVar);
                }
                Object obj19 = ys51Var.f275694a;
                int i34 = ys51Var.f275695b;
                if (i34 == 0) {
                    bga.m29073P(obj19);
                    List<nb90> list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    for (nb90 nb90Var : list2) {
                        String str2 = nb90Var.f152220a;
                        mb90 mb90Var = nb90Var.f152221b;
                        arrayList2.add(new z990(str2, mb90Var != null ? new h990(mb90Var.f141841d, mb90Var.f141838a, mb90Var.f141839b, mb90Var.f141840c) : null));
                    }
                    s990 s990Var = new s990(arrayList2);
                    ys51Var.f275695b = 1;
                    Object objEmit17 = this.f24769b.emit(s990Var, ys51Var);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit17 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof zs51) {
                    zs51Var = (zs51) fbkVar;
                    int i35 = zs51Var.f285847b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        zs51Var.f285847b = i35 - Integer.MIN_VALUE;
                    } else {
                        zs51Var = new zs51(this, fbkVar);
                    }
                } else {
                    zs51Var = new zs51(this, fbkVar);
                }
                Object obj20 = zs51Var.f285846a;
                int i36 = zs51Var.f285847b;
                if (i36 == 0) {
                    bga.m29073P(obj20);
                    Object obj21 = ((s6x0) obj).f206218a;
                    Throwable thM77348a = s6x0.m77348a(obj21);
                    if (thM77348a != null) {
                        Logger.m3966b("BUZZ: ListeningActivityButton subscribe failed", thM77348a);
                    }
                    if (obj21 instanceof c6x0) {
                        obj21 = null;
                    }
                    if (obj21 != null) {
                        zs51Var.f285847b = 1;
                        Object objEmit18 = this.f24769b.emit(obj21, zs51Var);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit18 == yukVar17) {
                            return yukVar17;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof z161) {
                    z161Var = (z161) fbkVar;
                    int i37 = z161Var.f278245b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        z161Var.f278245b = i37 - Integer.MIN_VALUE;
                    } else {
                        z161Var = new z161(this, fbkVar);
                    }
                } else {
                    z161Var = new z161(this, fbkVar);
                }
                Object obj22 = z161Var.f278244a;
                int i38 = z161Var.f278245b;
                if (i38 == 0) {
                    bga.m29073P(obj22);
                    PlayerState playerState3 = (PlayerState) obj;
                    wj50.m88279p(playerState3);
                    pqm0 pqm0Var = new pqm0(Boolean.valueOf(hdi.m47214F(playerState3)), Boolean.valueOf(hdi.m47223O(playerState3)));
                    z161Var.f278245b = 1;
                    Object objEmit19 = this.f24769b.emit(pqm0Var, z161Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit19 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof a361) {
                    a361Var = (a361) fbkVar;
                    int i39 = a361Var.f11885b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        a361Var.f11885b = i39 - Integer.MIN_VALUE;
                    } else {
                        a361Var = new a361(this, fbkVar);
                    }
                } else {
                    a361Var = new a361(this, fbkVar);
                }
                Object obj23 = a361Var.f11884a;
                int i40 = a361Var.f11885b;
                if (i40 == 0) {
                    bga.m29073P(obj23);
                    Boolean boolValueOf8 = Boolean.valueOf(wj50.m88271j((String) obj, "ENABLED"));
                    a361Var.f11885b = 1;
                    Object objEmit20 = this.f24769b.emit(boolValueOf8, a361Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit20 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof eg61) {
                    eg61Var = (eg61) fbkVar;
                    int i41 = eg61Var.f59232b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        eg61Var.f59232b = i41 - Integer.MIN_VALUE;
                    } else {
                        eg61Var = new eg61(this, fbkVar);
                    }
                } else {
                    eg61Var = new eg61(this, fbkVar);
                }
                Object obj24 = eg61Var.f59231a;
                int i42 = eg61Var.f59232b;
                if (i42 == 0) {
                    bga.m29073P(obj24);
                    dg61 dg61Var = new dg61((sg40) obj);
                    eg61Var.f59232b = 1;
                    Object objEmit21 = this.f24769b.emit(dg61Var, eg61Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit21 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof ao61) {
                    ao61Var = (ao61) fbkVar;
                    int i43 = ao61Var.f17587b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ao61Var.f17587b = i43 - Integer.MIN_VALUE;
                    } else {
                        ao61Var = new ao61(this, fbkVar);
                    }
                } else {
                    ao61Var = new ao61(this, fbkVar);
                }
                Object obj25 = ao61Var.f17586a;
                int i44 = ao61Var.f17587b;
                if (i44 == 0) {
                    bga.m29073P(obj25);
                    zu31 zu31Var = new zu31(obj);
                    ao61Var.f17587b = 1;
                    Object objEmit22 = this.f24769b.emit(zu31Var, ao61Var);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit22 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof sp61) {
                    sp61Var = (sp61) fbkVar;
                    int i45 = sp61Var.f212752b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        sp61Var.f212752b = i45 - Integer.MIN_VALUE;
                    } else {
                        sp61Var = new sp61(this, fbkVar);
                    }
                } else {
                    sp61Var = new sp61(this, fbkVar);
                }
                Object obj26 = sp61Var.f212751a;
                int i46 = sp61Var.f212752b;
                if (i46 == 0) {
                    bga.m29073P(obj26);
                    int iOrdinal = ((wro0) obj).ordinal();
                    if (iOrdinal == 0) {
                        pro0Var = pro0.f180653a;
                    } else if (iOrdinal == 1) {
                        pro0Var = pro0.f180654b;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pro0Var = pro0.f180655c;
                    }
                    sp61Var.f212752b = 1;
                    Object objEmit23 = this.f24769b.emit(pro0Var, sp61Var);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit23 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof up61) {
                    up61Var = (up61) fbkVar;
                    int i47 = up61Var.f232585b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        up61Var.f232585b = i47 - Integer.MIN_VALUE;
                    } else {
                        up61Var = new up61(this, fbkVar);
                    }
                } else {
                    up61Var = new up61(this, fbkVar);
                }
                Object obj27 = up61Var.f232584a;
                int i48 = up61Var.f232585b;
                if (i48 == 0) {
                    bga.m29073P(obj27);
                    rzh0 rzh0Var = (rzh0) obj;
                    if (rzh0Var instanceof pzh0) {
                        ArrayList<kzh0> arrayList3 = ((pzh0) rzh0Var).f183712a;
                        if (arrayList3.isEmpty()) {
                            ym61 ym61Var = ym61.f274166a;
                            listSingletonList = Collections.singletonList(new sec1(ym61Var, ym61Var));
                        } else {
                            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                            for (kzh0 kzh0Var : arrayList3) {
                                hn61 hn61Var = new hn61(kzh0Var.f128123a, kzh0Var.f128124b);
                                arrayList4.add(new sec1(hn61Var, hn61Var));
                            }
                            listSingletonList = arrayList4;
                        }
                    } else if (rzh0Var instanceof ozh0) {
                        vm61 vm61Var = vm61.f242714a;
                        listSingletonList = Collections.singletonList(new sec1(vm61Var, vm61Var));
                    } else {
                        if (!wj50.m88271j(rzh0Var, qzh0.f194208a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listSingletonList = lau.f131415a;
                    }
                    up61Var.f232585b = 1;
                    Object objEmit24 = this.f24769b.emit(listSingletonList, up61Var);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit24 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof eq61) {
                    eq61Var = (eq61) fbkVar;
                    int i49 = eq61Var.f61797b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        eq61Var.f61797b = i49 - Integer.MIN_VALUE;
                    } else {
                        eq61Var = new eq61(this, fbkVar);
                    }
                } else {
                    eq61Var = new eq61(this, fbkVar);
                }
                Object obj28 = eq61Var.f61796a;
                int i50 = eq61Var.f61797b;
                if (i50 == 0) {
                    bga.m29073P(obj28);
                    s6x0 s6x0Var = new s6x0(obj);
                    eq61Var.f61797b = 1;
                    Object objEmit25 = this.f24769b.emit(s6x0Var, eq61Var);
                    yuk yukVar24 = yuk.f276404a;
                    if (objEmit25 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof kq61) {
                    kq61Var = (kq61) fbkVar;
                    int i51 = kq61Var.f125227b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        kq61Var.f125227b = i51 - Integer.MIN_VALUE;
                    } else {
                        kq61Var = new kq61(this, fbkVar);
                    }
                } else {
                    kq61Var = new kq61(this, fbkVar);
                }
                Object obj29 = kq61Var.f125226a;
                int i52 = kq61Var.f125227b;
                if (i52 == 0) {
                    bga.m29073P(obj29);
                    d320 d320Var = new d320((List) obj, null);
                    kq61Var.f125227b = 1;
                    Object objEmit26 = this.f24769b.emit(d320Var, kq61Var);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit26 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof dw61) {
                    dw61Var = (dw61) fbkVar;
                    int i53 = dw61Var.f53628b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        dw61Var.f53628b = i53 - Integer.MIN_VALUE;
                    } else {
                        dw61Var = new dw61(this, fbkVar);
                    }
                } else {
                    dw61Var = new dw61(this, fbkVar);
                }
                Object obj30 = dw61Var.f53627a;
                int i54 = dw61Var.f53628b;
                if (i54 == 0) {
                    bga.m29073P(obj30);
                    epy epyVar = (epy) obj;
                    if (epyVar instanceof bpy) {
                        bpy bpyVar = (bpy) epyVar;
                        jw61Var = new iw61(bpyVar.f29622a, bpyVar.f29623b);
                    } else if (epyVar instanceof dpy) {
                        dpy dpyVar = (dpy) epyVar;
                        jw61Var = new kw61(dpyVar.f51762a, dpyVar.f51763b, dpyVar.f51764c, dpyVar.f51765d);
                    } else {
                        if (!(epyVar instanceof cpy)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jw61Var = new jw61(((cpy) epyVar).f40678a);
                    }
                    dw61Var.f53628b = 1;
                    Object objEmit27 = this.f24769b.emit(jw61Var, dw61Var);
                    yuk yukVar26 = yuk.f276404a;
                    if (objEmit27 == yukVar26) {
                        return yukVar26;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof qy61) {
                    qy61Var = (qy61) fbkVar;
                    int i55 = qy61Var.f193838b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        qy61Var.f193838b = i55 - Integer.MIN_VALUE;
                    } else {
                        qy61Var = new qy61(this, fbkVar);
                    }
                } else {
                    qy61Var = new qy61(this, fbkVar);
                }
                Object obj31 = qy61Var.f193837a;
                int i56 = qy61Var.f193838b;
                if (i56 == 0) {
                    bga.m29073P(obj31);
                    Event.TempDismissedEntitiesChanged tempDismissedEntitiesChanged = new Event.TempDismissedEntitiesChanged((Set) obj);
                    qy61Var.f193838b = 1;
                    Object objEmit28 = this.f24769b.emit(tempDismissedEntitiesChanged, qy61Var);
                    yuk yukVar27 = yuk.f276404a;
                    if (objEmit28 == yukVar27) {
                        return yukVar27;
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof t971) {
                    t971Var = (t971) fbkVar;
                    int i57 = t971Var.f218202b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        t971Var.f218202b = i57 - Integer.MIN_VALUE;
                    } else {
                        t971Var = new t971(this, fbkVar);
                    }
                } else {
                    t971Var = new t971(this, fbkVar);
                }
                Object obj32 = t971Var.f218201a;
                int i58 = t971Var.f218202b;
                if (i58 == 0) {
                    bga.m29073P(obj32);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    Set set2 = ohoVar2 != null ? (Set) ohoVar2.f165512a : null;
                    if (set2 != null) {
                        t971Var.f218202b = 1;
                        Object objEmit29 = this.f24769b.emit(set2, t971Var);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit29 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof kb71) {
                    kb71Var = (kb71) fbkVar;
                    int i59 = kb71Var.f121105b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        kb71Var.f121105b = i59 - Integer.MIN_VALUE;
                    } else {
                        kb71Var = new kb71(this, fbkVar);
                    }
                } else {
                    kb71Var = new kb71(this, fbkVar);
                }
                Object obj33 = kb71Var.f121104a;
                int i60 = kb71Var.f121105b;
                if (i60 == 0) {
                    bga.m29073P(obj33);
                    if (((ob71) obj).f163557a.size() >= 5) {
                        kb71Var.f121105b = 1;
                        Object objEmit30 = this.f24769b.emit(obj, kb71Var);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit30 == yukVar29) {
                            return yukVar29;
                        }
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ b941(niz nizVar, Object obj, int i) {
        this.f24768a = i;
        this.f24769b = nizVar;
    }
}
