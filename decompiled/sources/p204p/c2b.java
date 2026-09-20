package p204p;

import android.net.Uri;
import com.google.protobuf.BytesValue;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$ConnectRequest;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$DeviceId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class c2b implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f33339b;

    public /* synthetic */ c2b(niz nizVar, int i) {
        this.f33338a = i;
        this.f33339b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:140:0x0200  */
    /* JADX WARN: Code duplicated, block: B:157:0x0251  */
    /* JADX WARN: Code duplicated, block: B:174:0x0298  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:210:0x0328  */
    /* JADX WARN: Code duplicated, block: B:232:0x0386  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:276:0x0442  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:301:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:329:0x0532  */
    /* JADX WARN: Code duplicated, block: B:355:0x058d  */
    /* JADX WARN: Code duplicated, block: B:372:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:393:0x0625  */
    /* JADX WARN: Code duplicated, block: B:421:0x0692  */
    /* JADX WARN: Code duplicated, block: B:442:0x06df  */
    /* JADX WARN: Code duplicated, block: B:459:0x072a  */
    /* JADX WARN: Code duplicated, block: B:476:0x0776  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:493:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:514:0x0814  */
    /* JADX WARN: Code duplicated, block: B:553:0x088a  */
    /* JADX WARN: Code duplicated, block: B:599:0x090a  */
    /* JADX WARN: Code duplicated, block: B:649:0x0987  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:674:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:700:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        b2b b2bVar;
        c6b c6bVar;
        d6b d6bVar;
        f6b f6bVarM52273k;
        rkb rkbVar;
        skb skbVar;
        j8d j8dVar;
        ykb ykbVar;
        hnb hnbVar;
        inb inbVar;
        jsb jsbVar;
        rsb rsbVar;
        uxb uxbVar;
        Object objSingletonList;
        xxb xxbVar;
        zxb zxbVar;
        byb bybVar;
        dyb dybVar;
        p2c p2cVar;
        Object y1cVar;
        e4c e4cVar;
        ibc ibcVar;
        lbc lbcVar;
        mbc mbcVar;
        pbc pbcVar;
        cic cicVar;
        klc klcVar;
        cpc cpcVar;
        jpc jpcVar;
        kpc kpcVar;
        zpc zpcVar;
        cqc cqcVar;
        dqc dqcVar;
        fqc fqcVar;
        gqc gqcVar;
        switch (this.f33338a) {
            case 0:
                if (fbkVar instanceof b2b) {
                    b2bVar = (b2b) fbkVar;
                    int i = b2bVar.f22558b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b2bVar.f22558b = i - Integer.MIN_VALUE;
                    } else {
                        b2bVar = new b2b(this, fbkVar);
                    }
                } else {
                    b2bVar = new b2b(this, fbkVar);
                }
                Object obj2 = b2bVar.f22557a;
                int i2 = b2bVar.f22558b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    v1b v1bVar = new v1b((List) obj);
                    b2bVar.f22558b = 1;
                    Object objEmit = this.f33339b.emit(v1bVar, b2bVar);
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
                if (fbkVar instanceof c6b) {
                    c6bVar = (c6b) fbkVar;
                    int i3 = c6bVar.f34475b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c6bVar.f34475b = i3 - Integer.MIN_VALUE;
                    } else {
                        c6bVar = new c6b(this, fbkVar);
                    }
                } else {
                    c6bVar = new c6b(this, fbkVar);
                }
                Object obj3 = c6bVar.f34474a;
                int i4 = c6bVar.f34475b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    p2x0 p2x0Var = (p2x0) obj;
                    boolean z = false;
                    if (p2x0Var instanceof m2x0) {
                        if (((qu80) ((m2x0) p2x0Var).f139474a).f192598d.size() >= 5) {
                            z = true;
                        }
                    } else if (!(p2x0Var instanceof k2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c6bVar.f34475b = 1;
                    Object objEmit2 = this.f33339b.emit(boolValueOf, c6bVar);
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
                if (fbkVar instanceof d6b) {
                    d6bVar = (d6b) fbkVar;
                    int i5 = d6bVar.f45641b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        d6bVar.f45641b = i5 - Integer.MIN_VALUE;
                    } else {
                        d6bVar = new d6b(this, fbkVar);
                    }
                } else {
                    d6bVar = new d6b(this, fbkVar);
                }
                Object obj4 = d6bVar.f45640a;
                int i6 = d6bVar.f45641b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    p2x0 p2x0Var2 = (p2x0) obj;
                    if (p2x0Var2 instanceof m2x0) {
                        f6bVarM52273k = j3h1.m52273k((qu80) ((m2x0) p2x0Var2).f139474a);
                    } else {
                        if (!(p2x0Var2 instanceof k2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f6bVarM52273k = f6b.f66348f;
                    }
                    d6bVar.f45641b = 1;
                    Object objEmit3 = this.f33339b.emit(f6bVarM52273k, d6bVar);
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
                if (fbkVar instanceof rkb) {
                    rkbVar = (rkb) fbkVar;
                    int i7 = rkbVar.f200043b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        rkbVar.f200043b = i7 - Integer.MIN_VALUE;
                    } else {
                        rkbVar = new rkb(this, fbkVar);
                    }
                } else {
                    rkbVar = new rkb(this, fbkVar);
                }
                Object obj5 = rkbVar.f200042a;
                int i8 = rkbVar.f200043b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    ujb ujbVar = (ujb) obj;
                    int iOrdinal = ujbVar.getStatus().ordinal();
                    Object i1dVar = null;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if ((ujbVar instanceof pjb) || (ujbVar instanceof ljb) || (ujbVar instanceof mjb) || (ujbVar instanceof ojb)) {
                                i1dVar = l1d.f128701a;
                            } else if ((ujbVar instanceof qjb) || (ujbVar instanceof tjb)) {
                                i1dVar = m1d.f138938a;
                            } else if (!(ujbVar instanceof rjb) && !(ujbVar instanceof njb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (ujbVar instanceof qjb) {
                            i1dVar = o1d.f160697a;
                        } else if (ujbVar instanceof tjb) {
                            i1dVar = r1d.f194823a;
                        } else {
                            boolean z2 = ujbVar instanceof ljb;
                            h1d h1dVar = h1d.f86568a;
                            if (z2) {
                                i1dVar = h1dVar;
                            } else if (ujbVar instanceof pjb) {
                                i1dVar = k1d.f118288a;
                            } else if (ujbVar instanceof mjb) {
                                i1dVar = h1dVar;
                            } else if (ujbVar instanceof ojb) {
                                i1dVar = j1d.f107735a;
                            } else if (ujbVar instanceof rjb) {
                                i1dVar = new i1d(((rjb) ujbVar).f199788c);
                            } else if (!(ujbVar instanceof njb)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else if (!(ujbVar instanceof rjb)) {
                        if (!(ujbVar instanceof qjb) && !(ujbVar instanceof tjb) && !(ujbVar instanceof ljb) && !(ujbVar instanceof mjb) && !(ujbVar instanceof pjb) && !(ujbVar instanceof ojb) && !(ujbVar instanceof njb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i1dVar = n1d.f149394a;
                    }
                    if (i1dVar != null) {
                        rkbVar.f200043b = 1;
                        Object objEmit4 = this.f33339b.emit(i1dVar, rkbVar);
                        yuk yukVar4 = yuk.f276404a;
                        if (objEmit4 == yukVar4) {
                            return yukVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof skb) {
                    skbVar = (skb) fbkVar;
                    int i9 = skbVar.f210072b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        skbVar.f210072b = i9 - Integer.MIN_VALUE;
                    } else {
                        skbVar = new skb(this, fbkVar);
                    }
                } else {
                    skbVar = new skb(this, fbkVar);
                }
                Object obj6 = skbVar.f210071a;
                int i10 = skbVar.f210072b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    ujb ujbVar2 = (ujb) obj;
                    if (ujbVar2 instanceof njb) {
                        j8dVar = new j8d(((njb) ujbVar2).f154538b);
                    } else {
                        if (!(ujbVar2 instanceof qjb) && !(ujbVar2 instanceof tjb) && !(ujbVar2 instanceof ljb) && !(ujbVar2 instanceof mjb) && !(ujbVar2 instanceof pjb) && !(ujbVar2 instanceof ojb) && !(ujbVar2 instanceof rjb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j8dVar = null;
                    }
                    if (j8dVar != null) {
                        skbVar.f210072b = 1;
                        Object objEmit5 = this.f33339b.emit(j8dVar, skbVar);
                        yuk yukVar5 = yuk.f276404a;
                        if (objEmit5 == yukVar5) {
                            return yukVar5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof ykb) {
                    ykbVar = (ykb) fbkVar;
                    int i11 = ykbVar.f273662b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ykbVar.f273662b = i11 - Integer.MIN_VALUE;
                    } else {
                        ykbVar = new ykb(this, fbkVar);
                    }
                } else {
                    ykbVar = new ykb(this, fbkVar);
                }
                Object obj7 = ykbVar.f273661a;
                int i12 = ykbVar.f273662b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    vkb vkbVar = (vkb) obj;
                    if (vkbVar == null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p1d p1dVar = new p1d(vkbVar.f242194b);
                    ykbVar.f273662b = 1;
                    Object objEmit6 = this.f33339b.emit(p1dVar, ykbVar);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 6:
                if (fbkVar instanceof hnb) {
                    hnbVar = (hnb) fbkVar;
                    int i13 = hnbVar.f93279b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        hnbVar.f93279b = i13 - Integer.MIN_VALUE;
                    } else {
                        hnbVar = new hnb(this, fbkVar);
                    }
                } else {
                    hnbVar = new hnb(this, fbkVar);
                }
                Object obj8 = hnbVar.f93278a;
                int i14 = hnbVar.f93279b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    Boolean boolValueOf2 = Boolean.valueOf(!((String) obj).equals("DISABLED_CANNOT_ENABLE"));
                    hnbVar.f93279b = 1;
                    Object objEmit7 = this.f33339b.emit(boolValueOf2, hnbVar);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof inb) {
                    inbVar = (inb) fbkVar;
                    int i15 = inbVar.f103938b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        inbVar.f103938b = i15 - Integer.MIN_VALUE;
                    } else {
                        inbVar = new inb(this, fbkVar);
                    }
                } else {
                    inbVar = new inb(this, fbkVar);
                }
                Object obj9 = inbVar.f103937a;
                int i16 = inbVar.f103938b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    Boolean boolValueOf3 = Boolean.valueOf(wj50.m88271j((String) obj, "ENABLED"));
                    inbVar.f103938b = 1;
                    Object objEmit8 = this.f33339b.emit(boolValueOf3, inbVar);
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
                if (fbkVar instanceof jsb) {
                    jsbVar = (jsb) fbkVar;
                    int i17 = jsbVar.f115468b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        jsbVar.f115468b = i17 - Integer.MIN_VALUE;
                    } else {
                        jsbVar = new jsb(this, fbkVar);
                    }
                } else {
                    jsbVar = new jsb(this, fbkVar);
                }
                Object obj10 = jsbVar.f115467a;
                int i18 = jsbVar.f115468b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    jsbVar.f115468b = 1;
                    Object objEmit9 = this.f33339b.emit(boolValueOf4, jsbVar);
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
                if (fbkVar instanceof rsb) {
                    rsbVar = (rsb) fbkVar;
                    int i19 = rsbVar.f202248b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        rsbVar.f202248b = i19 - Integer.MIN_VALUE;
                    } else {
                        rsbVar = new rsb(this, fbkVar);
                    }
                } else {
                    rsbVar = new rsb(this, fbkVar);
                }
                Object obj11 = rsbVar.f202247a;
                int i20 = rsbVar.f202248b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    xe50 xe50Var = ((Boolean) obj).booleanValue() ? xe50.f260638b : xe50.f260637a;
                    rsbVar.f202248b = 1;
                    Object objEmit10 = this.f33339b.emit(xe50Var, rsbVar);
                    yuk yukVar10 = yuk.f276404a;
                    if (objEmit10 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            case 10:
                if (fbkVar instanceof uxb) {
                    uxbVar = (uxb) fbkVar;
                    int i21 = uxbVar.f234882b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        uxbVar.f234882b = i21 - Integer.MIN_VALUE;
                    } else {
                        uxbVar = new uxb(this, fbkVar);
                    }
                } else {
                    uxbVar = new uxb(this, fbkVar);
                }
                Object obj12 = uxbVar.f234881a;
                int i22 = uxbVar.f234882b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    int iOrdinal2 = ((dyb) obj).ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                        objSingletonList = lau.f131415a;
                    } else {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objSingletonList = Collections.singletonList(C1742ci.m32822c(wxb.f255998a, null, null, null, null, Boolean.TRUE, null, null, 223));
                    }
                    uxbVar.f234882b = 1;
                    Object objEmit11 = this.f33339b.emit(objSingletonList, uxbVar);
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
                if (fbkVar instanceof xxb) {
                    xxbVar = (xxb) fbkVar;
                    int i23 = xxbVar.f266933b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        xxbVar.f266933b = i23 - Integer.MIN_VALUE;
                    } else {
                        xxbVar = new xxb(this, fbkVar);
                    }
                } else {
                    xxbVar = new xxb(this, fbkVar);
                }
                Object obj13 = xxbVar.f266932a;
                int i24 = xxbVar.f266933b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    Boolean boolValueOf5 = Boolean.valueOf(dyb.PROJECTED == ((dyb) obj));
                    xxbVar.f266933b = 1;
                    Object objEmit12 = this.f33339b.emit(boolValueOf5, xxbVar);
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
                if (fbkVar instanceof zxb) {
                    zxbVar = (zxb) fbkVar;
                    int i25 = zxbVar.f287266b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        zxbVar.f287266b = i25 - Integer.MIN_VALUE;
                    } else {
                        zxbVar = new zxb(this, fbkVar);
                    }
                } else {
                    zxbVar = new zxb(this, fbkVar);
                }
                Object obj14 = zxbVar.f287265a;
                int i26 = zxbVar.f287266b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    vi50 vi50Var = new vi50(((Boolean) obj).booleanValue());
                    zxbVar.f287266b = 1;
                    Object objEmit13 = this.f33339b.emit(vi50Var, zxbVar);
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
                if (fbkVar instanceof byb) {
                    bybVar = (byb) fbkVar;
                    int i27 = bybVar.f32125b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bybVar.f32125b = i27 - Integer.MIN_VALUE;
                    } else {
                        bybVar = new byb(this, fbkVar);
                    }
                } else {
                    bybVar = new byb(this, fbkVar);
                }
                Object obj15 = bybVar.f32124a;
                int i28 = bybVar.f32125b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    Integer num = (Integer) obj;
                    wj50.m88279p(num);
                    int iIntValue = num.intValue();
                    if (iIntValue == 0) {
                        dybVar = dyb.NOT_CONNECTED;
                    } else if (iIntValue != 1) {
                        dybVar = iIntValue != 2 ? dyb.UNKNOWN : dyb.PROJECTED;
                    } else {
                        dybVar = dyb.NATIVE;
                    }
                    bybVar.f32125b = 1;
                    Object objEmit14 = this.f33339b.emit(dybVar, bybVar);
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
                if (fbkVar instanceof p2c) {
                    p2cVar = (p2c) fbkVar;
                    int i29 = p2cVar.f173319b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        p2cVar.f173319b = i29 - Integer.MIN_VALUE;
                    } else {
                        p2cVar = new p2c(this, fbkVar);
                    }
                } else {
                    p2cVar = new p2c(this, fbkVar);
                }
                Object obj16 = p2cVar.f173318a;
                int i30 = p2cVar.f173319b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    n1c n1cVar = (n1c) obj;
                    if (n1cVar instanceof m2r) {
                        m2r m2rVar = (m2r) n1cVar;
                        y1cVar = new a2c(m2rVar.f139450a, m2rVar.f139451b);
                    } else if (n1cVar instanceof sf11) {
                        sf11 sf11Var = (sf11) n1cVar;
                        y1cVar = new z1c(sf11Var.f208436a, sf11Var.f208437b, sf11Var.f208438c, sf11Var.f208439d, sf11Var.f208440e);
                    } else {
                        if (!(n1cVar instanceof rf11)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y1cVar = new y1c(((rf11) n1cVar).f198484a);
                    }
                    p2cVar.f173319b = 1;
                    Object objEmit15 = this.f33339b.emit(y1cVar, p2cVar);
                    yuk yukVar15 = yuk.f276404a;
                    if (objEmit15 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1.f247311a;
            case 15:
                if (fbkVar instanceof e4c) {
                    e4cVar = (e4c) fbkVar;
                    int i31 = e4cVar.f56044b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        e4cVar.f56044b = i31 - Integer.MIN_VALUE;
                    } else {
                        e4cVar = new e4c(this, fbkVar);
                    }
                } else {
                    e4cVar = new e4c(this, fbkVar);
                }
                Object obj17 = e4cVar.f56043a;
                int i32 = e4cVar.f56044b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    qf40 qf40Var = (qf40) obj;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                    int i33 = 0;
                    for (Object obj18 : qf40Var) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        ym51 ym51Var = new ym51(obj18, i33);
                        arrayList.add(new sec1(ym51Var, ym51Var));
                        i33 = i34;
                    }
                    e4cVar.f56044b = 1;
                    Object objEmit16 = this.f33339b.emit(arrayList, e4cVar);
                    yuk yukVar16 = yuk.f276404a;
                    if (objEmit16 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1.f247311a;
            case 16:
                if (fbkVar instanceof ibc) {
                    ibcVar = (ibc) fbkVar;
                    int i35 = ibcVar.f100506b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ibcVar.f100506b = i35 - Integer.MIN_VALUE;
                    } else {
                        ibcVar = new ibc(this, fbkVar);
                    }
                } else {
                    ibcVar = new ibc(this, fbkVar);
                }
                Object obj19 = ibcVar.f100505a;
                int i36 = ibcVar.f100506b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    byte[] bArr = (byte[]) obj;
                    try {
                        CastMessages$DeviceId castMessages$DeviceIdM7292p = CastMessages$DeviceId.m7292p(bArr);
                        ibcVar.f100506b = 1;
                        Object objEmit17 = this.f33339b.emit(castMessages$DeviceIdM7292p, ibcVar);
                        yuk yukVar17 = yuk.f276404a;
                        if (objEmit17 == yukVar17) {
                            return yukVar17;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.DeviceId: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof lbc) {
                    lbcVar = (lbc) fbkVar;
                    int i37 = lbcVar.f131624b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        lbcVar.f131624b = i37 - Integer.MIN_VALUE;
                    } else {
                        lbcVar = new lbc(this, fbkVar);
                    }
                } else {
                    lbcVar = new lbc(this, fbkVar);
                }
                Object obj20 = lbcVar.f131623a;
                int i38 = lbcVar.f131624b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        CastMessages$ConnectRequest castMessages$ConnectRequestM7284o = CastMessages$ConnectRequest.m7284o(bArr2);
                        lbcVar.f131624b = 1;
                        Object objEmit18 = this.f33339b.emit(castMessages$ConnectRequestM7284o, lbcVar);
                        yuk yukVar18 = yuk.f276404a;
                        if (objEmit18 == yukVar18) {
                            return yukVar18;
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.ConnectRequest: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof mbc) {
                    mbcVar = (mbc) fbkVar;
                    int i39 = mbcVar.f141872b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        mbcVar.f141872b = i39 - Integer.MIN_VALUE;
                    } else {
                        mbcVar = new mbc(this, fbkVar);
                    }
                } else {
                    mbcVar = new mbc(this, fbkVar);
                }
                Object obj21 = mbcVar.f141871a;
                int i40 = mbcVar.f141872b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        BytesValue bytesValueM1922q = BytesValue.m1922q(bArr3);
                        mbcVar.f141872b = 1;
                        Object objEmit19 = this.f33339b.emit(bytesValueM1922q, mbcVar);
                        yuk yukVar19 = yuk.f276404a;
                        if (objEmit19 == yukVar19) {
                            return yukVar19;
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.BytesValue: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof pbc) {
                    pbcVar = (pbc) fbkVar;
                    int i41 = pbcVar.f175768b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        pbcVar.f175768b = i41 - Integer.MIN_VALUE;
                    } else {
                        pbcVar = new pbc(this, fbkVar);
                    }
                } else {
                    pbcVar = new pbc(this, fbkVar);
                }
                Object obj22 = pbcVar.f175767a;
                int i42 = pbcVar.f175768b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    if (!(((e001) obj) instanceof yzz0)) {
                        pbcVar.f175768b = 1;
                        Object objEmit20 = this.f33339b.emit(obj, pbcVar);
                        yuk yukVar20 = yuk.f276404a;
                        if (objEmit20 == yukVar20) {
                            return yukVar20;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                }
                return w2a1.f247311a;
            case 20:
                if (fbkVar instanceof cic) {
                    cicVar = (cic) fbkVar;
                    int i43 = cicVar.f38277b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        cicVar.f38277b = i43 - Integer.MIN_VALUE;
                    } else {
                        cicVar = new cic(this, fbkVar);
                    }
                } else {
                    cicVar = new cic(this, fbkVar);
                }
                Object obj23 = cicVar.f38276a;
                int i44 = cicVar.f38277b;
                if (i44 == 0) {
                    bga.m29073P(obj23);
                    yql0 yql0Var = new yql0(((aic) obj).f15933b);
                    cicVar.f38277b = 1;
                    Object objEmit21 = this.f33339b.emit(yql0Var, cicVar);
                    yuk yukVar21 = yuk.f276404a;
                    if (objEmit21 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                }
                return w2a1.f247311a;
            case 21:
                if (fbkVar instanceof klc) {
                    klcVar = (klc) fbkVar;
                    int i45 = klcVar.f123858b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        klcVar.f123858b = i45 - Integer.MIN_VALUE;
                    } else {
                        klcVar = new klc(this, fbkVar);
                    }
                } else {
                    klcVar = new klc(this, fbkVar);
                }
                Object obj24 = klcVar.f123857a;
                int i46 = klcVar.f123858b;
                if (i46 == 0) {
                    bga.m29073P(obj24);
                    hvw hvwVar = new hvw((Uri) obj);
                    klcVar.f123858b = 1;
                    Object objEmit22 = this.f33339b.emit(hvwVar, klcVar);
                    yuk yukVar22 = yuk.f276404a;
                    if (objEmit22 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                }
                return w2a1.f247311a;
            case 22:
                if (fbkVar instanceof cpc) {
                    cpcVar = (cpc) fbkVar;
                    int i47 = cpcVar.f40533b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        cpcVar.f40533b = i47 - Integer.MIN_VALUE;
                    } else {
                        cpcVar = new cpc(this, fbkVar);
                    }
                } else {
                    cpcVar = new cpc(this, fbkVar);
                }
                Object obj25 = cpcVar.f40532a;
                int i48 = cpcVar.f40533b;
                if (i48 == 0) {
                    bga.m29073P(obj25);
                    rpc rpcVar = (rpc) obj;
                    epc epcVar = new epc(rpcVar.f201516a, rpcVar.f201517b, rpcVar.f201520e, rpcVar.f201518c, rpcVar.f201519d);
                    cpcVar.f40533b = 1;
                    Object objEmit23 = this.f33339b.emit(epcVar, cpcVar);
                    yuk yukVar23 = yuk.f276404a;
                    if (objEmit23 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                }
                return w2a1.f247311a;
            case 23:
                if (fbkVar instanceof jpc) {
                    jpcVar = (jpc) fbkVar;
                    int i49 = jpcVar.f114608b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        jpcVar.f114608b = i49 - Integer.MIN_VALUE;
                    } else {
                        jpcVar = new jpc(this, fbkVar);
                    }
                } else {
                    jpcVar = new jpc(this, fbkVar);
                }
                Object obj26 = jpcVar.f114607a;
                int i50 = jpcVar.f114608b;
                if (i50 == 0) {
                    bga.m29073P(obj26);
                    if (!((Boolean) obj).booleanValue()) {
                        jpcVar.f114608b = 1;
                        Object objEmit24 = this.f33339b.emit(obj, jpcVar);
                        yuk yukVar24 = yuk.f276404a;
                        if (objEmit24 == yukVar24) {
                            return yukVar24;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                }
                return w2a1.f247311a;
            case 24:
                if (fbkVar instanceof kpc) {
                    kpcVar = (kpc) fbkVar;
                    int i51 = kpcVar.f125026b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        kpcVar.f125026b = i51 - Integer.MIN_VALUE;
                    } else {
                        kpcVar = new kpc(this, fbkVar);
                    }
                } else {
                    kpcVar = new kpc(this, fbkVar);
                }
                Object obj27 = kpcVar.f125025a;
                int i52 = kpcVar.f125026b;
                if (i52 == 0) {
                    bga.m29073P(obj27);
                    ((Boolean) obj).getClass();
                    kpcVar.f125026b = 1;
                    Object objEmit25 = this.f33339b.emit(fpc.f71794a, kpcVar);
                    yuk yukVar25 = yuk.f276404a;
                    if (objEmit25 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                }
                return w2a1.f247311a;
            case 25:
                if (fbkVar instanceof zpc) {
                    zpcVar = (zpc) fbkVar;
                    int i53 = zpcVar.f285095b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        zpcVar.f285095b = i53 - Integer.MIN_VALUE;
                    } else {
                        zpcVar = new zpc(this, fbkVar);
                    }
                } else {
                    zpcVar = new zpc(this, fbkVar);
                }
                Object obj28 = zpcVar.f285094a;
                int i54 = zpcVar.f285095b;
                if (i54 == 0) {
                    bga.m29073P(obj28);
                    if (obj instanceof oho) {
                        zpcVar.f285095b = 1;
                        Object objEmit26 = this.f33339b.emit(obj, zpcVar);
                        yuk yukVar26 = yuk.f276404a;
                        if (objEmit26 == yukVar26) {
                            return yukVar26;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                }
                return w2a1.f247311a;
            case 26:
                if (fbkVar instanceof cqc) {
                    cqcVar = (cqc) fbkVar;
                    int i55 = cqcVar.f40824b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        cqcVar.f40824b = i55 - Integer.MIN_VALUE;
                    } else {
                        cqcVar = new cqc(this, fbkVar);
                    }
                } else {
                    cqcVar = new cqc(this, fbkVar);
                }
                Object obj29 = cqcVar.f40823a;
                int i56 = cqcVar.f40824b;
                if (i56 == 0) {
                    bga.m29073P(obj29);
                    if (obj instanceof oho) {
                        cqcVar.f40824b = 1;
                        Object objEmit27 = this.f33339b.emit(obj, cqcVar);
                        yuk yukVar27 = yuk.f276404a;
                        if (objEmit27 == yukVar27) {
                            return yukVar27;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                }
                return w2a1.f247311a;
            case 27:
                if (fbkVar instanceof dqc) {
                    dqcVar = (dqc) fbkVar;
                    int i57 = dqcVar.f51955b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        dqcVar.f51955b = i57 - Integer.MIN_VALUE;
                    } else {
                        dqcVar = new dqc(this, fbkVar);
                    }
                } else {
                    dqcVar = new dqc(this, fbkVar);
                }
                Object obj30 = dqcVar.f51954a;
                int i58 = dqcVar.f51955b;
                if (i58 == 0) {
                    bga.m29073P(obj30);
                    Object obj31 = ((oho) obj).f165512a;
                    if (obj31 != null) {
                        dqcVar.f51955b = 1;
                        Object objEmit28 = this.f33339b.emit(obj31, dqcVar);
                        yuk yukVar28 = yuk.f276404a;
                        if (objEmit28 == yukVar28) {
                            return yukVar28;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                }
                return w2a1.f247311a;
            case 28:
                if (fbkVar instanceof fqc) {
                    fqcVar = (fqc) fbkVar;
                    int i59 = fqcVar.f72147b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        fqcVar.f72147b = i59 - Integer.MIN_VALUE;
                    } else {
                        fqcVar = new fqc(this, fbkVar);
                    }
                } else {
                    fqcVar = new fqc(this, fbkVar);
                }
                Object obj32 = fqcVar.f72146a;
                int i60 = fqcVar.f72147b;
                if (i60 == 0) {
                    bga.m29073P(obj32);
                    if (obj instanceof oho) {
                        fqcVar.f72147b = 1;
                        Object objEmit29 = this.f33339b.emit(obj, fqcVar);
                        yuk yukVar29 = yuk.f276404a;
                        if (objEmit29 == yukVar29) {
                            return yukVar29;
                        }
                    }
                } else {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof gqc) {
                    gqcVar = (gqc) fbkVar;
                    int i61 = gqcVar.f83432b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        gqcVar.f83432b = i61 - Integer.MIN_VALUE;
                    } else {
                        gqcVar = new gqc(this, fbkVar);
                    }
                } else {
                    gqcVar = new gqc(this, fbkVar);
                }
                Object obj33 = gqcVar.f83431a;
                int i62 = gqcVar.f83432b;
                if (i62 == 0) {
                    bga.m29073P(obj33);
                    Object obj34 = ((oho) obj).f165512a;
                    if (obj34 != null) {
                        gqcVar.f83432b = 1;
                        Object objEmit30 = this.f33339b.emit(obj34, gqcVar);
                        yuk yukVar30 = yuk.f276404a;
                        if (objEmit30 == yukVar30) {
                            return yukVar30;
                        }
                    }
                } else {
                    if (i62 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ c2b(niz nizVar, Object obj, int i) {
        this.f33338a = i;
        this.f33339b = nizVar;
    }
}
