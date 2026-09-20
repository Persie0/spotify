package p204p;

import com.spotify.homeagent.p079v1.Seed;
import com.spotify.homeagent.p079v1.UserPromptEntry;
import com.spotify.homeagent.p079v1.WorldListAttributes;
import com.spotify.homeagent.p079v1.WorldSection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class z0s0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f278163b;

    public /* synthetic */ z0s0(niz nizVar, int i) {
        this.f278162a = i;
        this.f278163b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m95083b(Object obj, fbk fbkVar) {
        qws0 qws0Var;
        String string;
        if (fbkVar instanceof qws0) {
            qws0Var = (qws0) fbkVar;
            int i = qws0Var.f193416b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qws0Var.f193416b = i - Integer.MIN_VALUE;
            } else {
                qws0Var = new qws0(this, fbkVar);
            }
        } else {
            qws0Var = new qws0(this, fbkVar);
        }
        Object obj2 = qws0Var.f193415a;
        int i2 = qws0Var.f193416b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ty80 ty80Var = (ty80) obj;
            boolean zM81955a = ty80Var.m81955a();
            Set set = rws0.f203405g;
            Map map = ty80Var.f224877f.f271272q;
            Set set2 = k590.f119450a;
            String str = (String) map.get("generation_status");
            if (str == null || (string = wl51.m88491o1(str).toString()) == null) {
                string = "";
            }
            Boolean boolValueOf = Boolean.valueOf(!zM81955a || set.contains(sam.m77680s(string)));
            qws0Var.f193416b = 1;
            Object objEmit = this.f278163b.emit(boolValueOf, qws0Var);
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
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x014f A[RETURN] */
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
    /* JADX INFO: renamed from: c */
    private final Object m95084c(Object obj, fbk fbkVar) {
        vxs0 vxs0Var;
        Object wxs0Var;
        ae50 ae50VarM11844o;
        UserPromptEntry userPromptEntryM11858o;
        String strM11842o;
        String strM11842o2;
        Object objEmit;
        yuk yukVar;
        String strM11842o3;
        if (fbkVar instanceof vxs0) {
            vxs0Var = (vxs0) fbkVar;
            int i = vxs0Var.f245826b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxs0Var.f245826b = i - Integer.MIN_VALUE;
            } else {
                vxs0Var = new vxs0(this, fbkVar);
            }
        } else {
            vxs0Var = new vxs0(this, fbkVar);
        }
        Object obj2 = vxs0Var.f245825a;
        int i2 = vxs0Var.f245826b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            qu80 qu80Var = (qu80) ((p2x0) obj).m68971d();
            ybv ybvVar = qu80Var.f192599e;
            WorldListAttributes worldListAttributes = (WorldListAttributes) ehg1.m38974n(ybvVar.f271272q, "world_attributes", uws0.f234731h);
            if (worldListAttributes == null) {
                throw new IllegalArgumentException("Missing world_attributes on list entity");
            }
            str = null;
            str = null;
            String str = null;
            yxs0Var = null;
            Object yxs0Var = null;
            str = null;
            str = null;
            String str2 = null;
            if (worldListAttributes.m11855t() && worldListAttributes.m11849n().m11846o() == uae1.GENERATION_ERROR) {
                String strM11847p = worldListAttributes.m11849n().m11847p();
                Seed seedM11853r = worldListAttributes.m11853r();
                if (seedM11853r != null && (strM11842o3 = seedM11853r.m11842o()) != null && !wl51.m88460J0(strM11842o3)) {
                    str = strM11842o3;
                }
                wxs0Var = new zxs0(strM11847p, str);
            } else {
                int i3 = sxs0.f215034a[worldListAttributes.m11854s().ordinal()];
                if (i3 == 1) {
                    List list = qu80Var.f192598d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        WorldSection worldSection = (WorldSection) ehg1.m38974n(((nw80) it.next()).f159053g, "world_section", vws0.f245550h);
                        if (worldSection == null) {
                            ae50VarM11844o = null;
                        } else {
                            if (worldSection.m11857n() != 10) {
                                worldSection = null;
                            }
                            if (worldSection == null || (userPromptEntryM11858o = worldSection.m11858o()) == null) {
                                ae50VarM11844o = null;
                            } else {
                                ae50VarM11844o = userPromptEntryM11858o.m11844o();
                            }
                        }
                        if (ae50VarM11844o != null) {
                            arrayList.add(ae50VarM11844o);
                        }
                    }
                    ArrayList arrayListM49805U = i6f.m49805U(arrayList);
                    String str3 = ybvVar.f271257b;
                    wxs0Var = new wxs0(str3.length() > 0 ? str3 : null, arrayListM49805U);
                } else if (i3 == 2) {
                    Seed seedM11853r2 = worldListAttributes.m11853r();
                    if (seedM11853r2 != null && (strM11842o = seedM11853r2.m11842o()) != null && !wl51.m88460J0(strM11842o)) {
                        str2 = strM11842o;
                    }
                    yxs0Var = new yxs0(str2);
                } else if (i3 == 3) {
                    String strM11852q = worldListAttributes.m11852q();
                    wj50.m88279p(strM11852q);
                    String str4 = strM11852q.length() > 0 ? strM11852q : null;
                    if (str4 != null) {
                        String str5 = ybvVar.f271257b;
                        String strM11851p = worldListAttributes.m11851p();
                        String strM11850o = worldListAttributes.m11850o();
                        Seed seedM11853r3 = worldListAttributes.m11853r();
                        yxs0Var = new xxs0(str5, strM11851p, strM11850o, str4, (seedM11853r3 == null || (strM11842o2 = seedM11853r3.m11842o()) == null || wl51.m88460J0(strM11842o2)) ? null : strM11842o2);
                    }
                }
                if (yxs0Var != null) {
                    vxs0Var.f245826b = 1;
                    objEmit = this.f278163b.emit(yxs0Var, vxs0Var);
                    yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                }
            }
            yxs0Var = wxs0Var;
            if (yxs0Var != null) {
                vxs0Var.f245826b = 1;
                objEmit = this.f278163b.emit(yxs0Var, vxs0Var);
                yukVar = yuk.f276404a;
                if (objEmit == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0224  */
    /* JADX WARN: Code duplicated, block: B:158:0x0260  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:209:0x0323  */
    /* JADX WARN: Code duplicated, block: B:225:0x0366  */
    /* JADX WARN: Code duplicated, block: B:245:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:272:0x0416  */
    /* JADX WARN: Code duplicated, block: B:293:0x045e  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0509  */
    /* JADX WARN: Code duplicated, block: B:362:0x0566  */
    /* JADX WARN: Code duplicated, block: B:383:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:410:0x0617  */
    /* JADX WARN: Code duplicated, block: B:426:0x0653  */
    /* JADX WARN: Code duplicated, block: B:452:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:475:0x0714  */
    /* JADX WARN: Code duplicated, block: B:498:0x075c  */
    /* JADX WARN: Code duplicated, block: B:521:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:537:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:555:0x081f  */
    /* JADX WARN: Code duplicated, block: B:588:0x0891  */
    /* JADX WARN: Code duplicated, block: B:612:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
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
        y0s0 y0s0Var;
        a1s0 a1s0Var;
        Object dzr0Var;
        b1s0 b1s0Var;
        t2s0 t2s0Var;
        u2s0 u2s0Var;
        z2s0 z2s0Var;
        c3s0 c3s0Var;
        e3s0 e3s0Var;
        b7s0 b7s0Var;
        e7s0 e7s0Var;
        d9s0 d9s0Var;
        eds0 eds0Var;
        ops0 ops0Var;
        rps0 rps0Var;
        krs0 krs0Var;
        mrs0 mrs0Var;
        ors0 ors0Var;
        String string;
        hss0 hss0Var;
        jss0 jss0Var;
        dts0 dts0Var;
        mts0 mts0Var;
        nts0 nts0Var;
        uts0 uts0Var;
        gus0 gus0Var;
        String string2;
        jus0 jus0Var;
        Boolean boolM88490n1;
        mus0 mus0Var;
        String string3;
        xus0 xus0Var;
        Boolean boolM88490n2;
        String string4;
        y3t0 y3t0Var;
        int i = this.f278162a;
        String str = "";
        boolean zBooleanValue = false;
        Object yzr0Var = null;
        str = null;
        String str2 = null;
        c4m c4mVar = null;
        Object s6x0Var = null;
        dzr0Var = null;
        Object dzr0Var2 = null;
        yzr0Var = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f278163b;
        Object obj2 = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof y0s0) {
                    y0s0Var = (y0s0) fbkVar;
                    int i2 = y0s0Var.f268052b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        y0s0Var.f268052b = i2 - Integer.MIN_VALUE;
                    } else {
                        y0s0Var = new y0s0(this, fbkVar);
                    }
                } else {
                    y0s0Var = new y0s0(this, fbkVar);
                }
                Object obj3 = y0s0Var.f268051a;
                int i3 = y0s0Var.f268052b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                sxz sxzVar = (sxz) obj;
                if (sxzVar instanceof pxz) {
                    Set set = dd41.f47702f;
                    String strM35721s = r46.m74726U(((pxz) sxzVar).f183277a).m35721s();
                    if (strM35721s != null) {
                        yzr0Var = new bzr0(true, strM35721s);
                    }
                } else if (sxzVar instanceof oxz) {
                    Set set2 = dd41.f47702f;
                    String strM35721s2 = r46.m74726U(((oxz) sxzVar).f171622a).m35721s();
                    if (strM35721s2 != null) {
                        yzr0Var = new bzr0(false, strM35721s2);
                    }
                } else if (sxzVar instanceof rxz) {
                    yzr0Var = new yzr0(true, ((rxz) sxzVar).f203767a);
                } else {
                    if (!(sxzVar instanceof qxz)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yzr0Var = new yzr0(false, ((qxz) sxzVar).f193766a);
                }
                if (yzr0Var == null) {
                    return w2a1Var;
                }
                y0s0Var.f268052b = 1;
                return nizVar.emit(yzr0Var, y0s0Var) == obj2 ? obj2 : w2a1Var;
            case 1:
                if (fbkVar instanceof a1s0) {
                    a1s0Var = (a1s0) fbkVar;
                    int i4 = a1s0Var.f11469b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        a1s0Var.f11469b = i4 - Integer.MIN_VALUE;
                    } else {
                        a1s0Var = new a1s0(this, fbkVar);
                    }
                } else {
                    a1s0Var = new a1s0(this, fbkVar);
                }
                Object obj4 = a1s0Var.f11468a;
                int i5 = a1s0Var.f11469b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                kd00 kd00Var = (kd00) obj;
                if (kd00Var instanceof id00) {
                    dzr0Var = new dzr0(((id00) kd00Var).f100911a);
                } else {
                    if (!wj50.m88271j(kd00Var, jd00.f111217a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dzr0Var = kzr0.f128184a;
                }
                a1s0Var.f11469b = 1;
                return nizVar.emit(dzr0Var, a1s0Var) == obj2 ? obj2 : w2a1Var;
            case 2:
                if (fbkVar instanceof b1s0) {
                    b1s0Var = (b1s0) fbkVar;
                    int i6 = b1s0Var.f22401b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        b1s0Var.f22401b = i6 - Integer.MIN_VALUE;
                    } else {
                        b1s0Var = new b1s0(this, fbkVar);
                    }
                } else {
                    b1s0Var = new b1s0(this, fbkVar);
                }
                Object obj5 = b1s0Var.f22400a;
                int i7 = b1s0Var.f22401b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                ie31 ie31Var = (ie31) obj;
                if (ie31Var instanceof de31) {
                    dzr0Var2 = new czr0(((de31) ie31Var).f47957a);
                } else if (ie31Var instanceof ee31) {
                    dzr0Var2 = new dzr0(((ee31) ie31Var).f58666a);
                } else if (ie31Var instanceof ge31) {
                    dzr0Var2 = new dzr0(((ge31) ie31Var).f79010a);
                } else if (!(ie31Var instanceof he31) && !(ie31Var instanceof fe31)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dzr0Var2 == null) {
                    return w2a1Var;
                }
                b1s0Var.f22401b = 1;
                return nizVar.emit(dzr0Var2, b1s0Var) == obj2 ? obj2 : w2a1Var;
            case 3:
                if (fbkVar instanceof t2s0) {
                    t2s0Var = (t2s0) fbkVar;
                    int i8 = t2s0Var.f216618b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        t2s0Var.f216618b = i8 - Integer.MIN_VALUE;
                    } else {
                        t2s0Var = new t2s0(this, fbkVar);
                    }
                } else {
                    t2s0Var = new t2s0(this, fbkVar);
                }
                Object obj6 = t2s0Var.f216617a;
                int i9 = t2s0Var.f216618b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                if (((iqx) ((gqx) obj)).f104863f) {
                    return w2a1Var;
                }
                t2s0Var.f216618b = 1;
                return nizVar.emit(obj, t2s0Var) == obj2 ? obj2 : w2a1Var;
            case 4:
                if (fbkVar instanceof u2s0) {
                    u2s0Var = (u2s0) fbkVar;
                    int i10 = u2s0Var.f226161b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        u2s0Var.f226161b = i10 - Integer.MIN_VALUE;
                    } else {
                        u2s0Var = new u2s0(this, fbkVar);
                    }
                } else {
                    u2s0Var = new u2s0(this, fbkVar);
                }
                Object obj7 = u2s0Var.f226160a;
                int i11 = u2s0Var.f226161b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                Object objMo45450b = ((gqx) obj).mo45450b(eua1.class);
                u2s0Var.f226161b = 1;
                return nizVar.emit(objMo45450b, u2s0Var) == obj2 ? obj2 : w2a1Var;
            case 5:
                if (fbkVar instanceof z2s0) {
                    z2s0Var = (z2s0) fbkVar;
                    int i12 = z2s0Var.f278661b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        z2s0Var.f278661b = i12 - Integer.MIN_VALUE;
                    } else {
                        z2s0Var = new z2s0(this, fbkVar);
                    }
                } else {
                    z2s0Var = new z2s0(this, fbkVar);
                }
                Object obj8 = z2s0Var.f278660a;
                int i13 = z2s0Var.f278661b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                qho qhoVar = (qho) obj;
                oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                Object obj9 = ohoVar != null ? (uu41) ohoVar.f165512a : null;
                if (obj9 == null) {
                    return w2a1Var;
                }
                z2s0Var.f278661b = 1;
                return nizVar.emit(obj9, z2s0Var) == obj2 ? obj2 : w2a1Var;
            case 6:
                if (fbkVar instanceof c3s0) {
                    c3s0Var = (c3s0) fbkVar;
                    int i14 = c3s0Var.f33747b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3s0Var.f33747b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3s0Var = new c3s0(this, fbkVar);
                    }
                } else {
                    c3s0Var = new c3s0(this, fbkVar);
                }
                Object obj10 = c3s0Var.f33746a;
                int i15 = c3s0Var.f33747b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                qho qhoVar2 = (qho) obj;
                oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                Object obj11 = ohoVar2 != null ? (skx0) ohoVar2.f165512a : null;
                if (obj11 == null) {
                    return w2a1Var;
                }
                c3s0Var.f33747b = 1;
                return nizVar.emit(obj11, c3s0Var) == obj2 ? obj2 : w2a1Var;
            case 7:
                if (fbkVar instanceof e3s0) {
                    e3s0Var = (e3s0) fbkVar;
                    int i16 = e3s0Var.f55879b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        e3s0Var.f55879b = i16 - Integer.MIN_VALUE;
                    } else {
                        e3s0Var = new e3s0(this, fbkVar);
                    }
                } else {
                    e3s0Var = new e3s0(this, fbkVar);
                }
                Object obj12 = e3s0Var.f55878a;
                int i17 = e3s0Var.f55879b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                qho qhoVar3 = (qho) obj;
                oho ohoVar3 = qhoVar3 instanceof oho ? (oho) qhoVar3 : null;
                Object obj13 = ohoVar3 != null ? (pqm0) ohoVar3.f165512a : null;
                if (obj13 == null) {
                    return w2a1Var;
                }
                e3s0Var.f55879b = 1;
                return nizVar.emit(obj13, e3s0Var) == obj2 ? obj2 : w2a1Var;
            case 8:
                if (fbkVar instanceof b7s0) {
                    b7s0Var = (b7s0) fbkVar;
                    int i18 = b7s0Var.f24377b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        b7s0Var.f24377b = i18 - Integer.MIN_VALUE;
                    } else {
                        b7s0Var = new b7s0(this, fbkVar);
                    }
                } else {
                    b7s0Var = new b7s0(this, fbkVar);
                }
                Object obj14 = b7s0Var.f24376a;
                int i19 = b7s0Var.f24377b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                List list = ((t5a0) obj).f217256b;
                ArrayList arrayList = new ArrayList();
                for (Object obj15 : list) {
                    if (obj15 instanceof q5a0) {
                        arrayList.add(obj15);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((q5a0) it.next()).f185488b);
                }
                Object objM43736n1 = g6f.m43736n1(arrayList2);
                b7s0Var.f24377b = 1;
                return nizVar.emit(objM43736n1, b7s0Var) == obj2 ? obj2 : w2a1Var;
            case 9:
                if (fbkVar instanceof e7s0) {
                    e7s0Var = (e7s0) fbkVar;
                    int i20 = e7s0Var.f57001b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        e7s0Var.f57001b = i20 - Integer.MIN_VALUE;
                    } else {
                        e7s0Var = new e7s0(this, fbkVar);
                    }
                } else {
                    e7s0Var = new e7s0(this, fbkVar);
                }
                Object obj16 = e7s0Var.f57000a;
                int i21 = e7s0Var.f57001b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                Object k5s0Var = new k5s0((Set) obj);
                e7s0Var.f57001b = 1;
                return nizVar.emit(k5s0Var, e7s0Var) == obj2 ? obj2 : w2a1Var;
            case 10:
                if (fbkVar instanceof d9s0) {
                    d9s0Var = (d9s0) fbkVar;
                    int i22 = d9s0Var.f46896b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        d9s0Var.f46896b = i22 - Integer.MIN_VALUE;
                    } else {
                        d9s0Var = new d9s0(this, fbkVar);
                    }
                } else {
                    d9s0Var = new d9s0(this, fbkVar);
                }
                Object obj17 = d9s0Var.f46895a;
                int i23 = d9s0Var.f46896b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                qho qhoVar4 = (qho) obj;
                if (qhoVar4 instanceof nho) {
                    s6x0Var = new s6x0(new c6x0(new IOException("Failed to load required metadata")));
                } else if (qhoVar4 instanceof oho) {
                    s6x0Var = new s6x0(w2a1Var);
                } else if (!wj50.m88271j(qhoVar4, pho.f177693a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (s6x0Var == null) {
                    return w2a1Var;
                }
                d9s0Var.f46896b = 1;
                return nizVar.emit(s6x0Var, d9s0Var) == obj2 ? obj2 : w2a1Var;
            case 11:
                if (fbkVar instanceof eds0) {
                    eds0Var = (eds0) fbkVar;
                    int i24 = eds0Var.f58587b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        eds0Var.f58587b = i24 - Integer.MIN_VALUE;
                    } else {
                        eds0Var = new eds0(this, fbkVar);
                    }
                } else {
                    eds0Var = new eds0(this, fbkVar);
                }
                Object obj18 = eds0Var.f58586a;
                int i25 = eds0Var.f58587b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                e0r0 e0r0Var = (e0r0) obj;
                if (e0r0Var != null && wj50.m88271j(e0r0Var.f55025b.f44027a, mte0.f147059a)) {
                    zBooleanValue = true;
                }
                Object objValueOf = Boolean.valueOf(zBooleanValue);
                eds0Var.f58587b = 1;
                return nizVar.emit(objValueOf, eds0Var) == obj2 ? obj2 : w2a1Var;
            case 12:
                if (fbkVar instanceof ops0) {
                    ops0Var = (ops0) fbkVar;
                    int i26 = ops0Var.f168016b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        ops0Var.f168016b = i26 - Integer.MIN_VALUE;
                    } else {
                        ops0Var = new ops0(this, fbkVar);
                    }
                } else {
                    ops0Var = new ops0(this, fbkVar);
                }
                Object obj19 = ops0Var.f168015a;
                int i27 = ops0Var.f168016b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                String str3 = (String) ((ty80) obj).f224877f.f271272q.get("refresh_cadence");
                if (wj50.m88271j(str3, "DAILY")) {
                    c4mVar = a4m.f12279a;
                } else if (wj50.m88271j(str3, "WEEKLY")) {
                    c4mVar = b4m.f23387a;
                }
                Object kps0Var = new kps0(c4mVar);
                ops0Var.f168016b = 1;
                return nizVar.emit(kps0Var, ops0Var) == obj2 ? obj2 : w2a1Var;
            case 13:
                if (fbkVar instanceof rps0) {
                    rps0Var = (rps0) fbkVar;
                    int i28 = rps0Var.f201640b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        rps0Var.f201640b = i28 - Integer.MIN_VALUE;
                    } else {
                        rps0Var = new rps0(this, fbkVar);
                    }
                } else {
                    rps0Var = new rps0(this, fbkVar);
                }
                Object obj20 = rps0Var.f201639a;
                int i29 = rps0Var.f201640b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                ty80 ty80Var = (ty80) obj;
                String str4 = (String) ty80Var.f224877f.f271272q.get("generation_status");
                Set set3 = k590.f119450a;
                k590 k590VarM77680s = sam.m77680s(str4 != null ? str4 : "");
                k590VarM77680s.getClass();
                boolean zContains = k590.f119450a.contains(k590VarM77680s);
                if (ty80Var.f224877f.f271278w.f156638b && !zContains) {
                    zBooleanValue = true;
                }
                Object objValueOf2 = Boolean.valueOf(zBooleanValue);
                rps0Var.f201640b = 1;
                return nizVar.emit(objValueOf2, rps0Var) == obj2 ? obj2 : w2a1Var;
            case 14:
                if (fbkVar instanceof krs0) {
                    krs0Var = (krs0) fbkVar;
                    int i30 = krs0Var.f125720b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        krs0Var.f125720b = i30 - Integer.MIN_VALUE;
                    } else {
                        krs0Var = new krs0(this, fbkVar);
                    }
                } else {
                    krs0Var = new krs0(this, fbkVar);
                }
                Object obj21 = krs0Var.f125719a;
                int i31 = krs0Var.f125720b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                qho qhoVar5 = (qho) obj;
                oho ohoVar4 = qhoVar5 instanceof oho ? (oho) qhoVar5 : null;
                Object obj22 = ohoVar4 != null ? (i490) ohoVar4.f165512a : null;
                if (obj22 == null) {
                    return w2a1Var;
                }
                krs0Var.f125720b = 1;
                return nizVar.emit(obj22, krs0Var) == obj2 ? obj2 : w2a1Var;
            case 15:
                if (fbkVar instanceof mrs0) {
                    mrs0Var = (mrs0) fbkVar;
                    int i32 = mrs0Var.f146599b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        mrs0Var.f146599b = i32 - Integer.MIN_VALUE;
                    } else {
                        mrs0Var = new mrs0(this, fbkVar);
                    }
                } else {
                    mrs0Var = new mrs0(this, fbkVar);
                }
                Object obj23 = mrs0Var.f146598a;
                int i33 = mrs0Var.f146599b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                ty80 ty80Var2 = (ty80) obj;
                if (ty80Var2.f224877f.f271278w.f156638b && !ty80Var2.f224879h) {
                    zBooleanValue = true;
                }
                Object objValueOf3 = Boolean.valueOf(zBooleanValue);
                mrs0Var.f146599b = 1;
                return nizVar.emit(objValueOf3, mrs0Var) == obj2 ? obj2 : w2a1Var;
            case 16:
                if (fbkVar instanceof ors0) {
                    ors0Var = (ors0) fbkVar;
                    int i34 = ors0Var.f168648b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ors0Var.f168648b = i34 - Integer.MIN_VALUE;
                    } else {
                        ors0Var = new ors0(this, fbkVar);
                    }
                } else {
                    ors0Var = new ors0(this, fbkVar);
                }
                Object obj24 = ors0Var.f168647a;
                int i35 = ors0Var.f168648b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                ty80 ty80Var3 = (ty80) obj;
                if (ty80Var3.m81955a()) {
                    Map map = ty80Var3.f224877f.f271272q;
                    Set set4 = k590.f119450a;
                    String str5 = (String) map.get("generation_status");
                    if (str5 != null && (string = wl51.m88491o1(str5).toString()) != null) {
                        str = string;
                    }
                    if (sam.m77680s(str).m55431a()) {
                        zBooleanValue = true;
                    }
                }
                Object objValueOf4 = Boolean.valueOf(zBooleanValue);
                ors0Var.f168648b = 1;
                return nizVar.emit(objValueOf4, ors0Var) == obj2 ? obj2 : w2a1Var;
            case 17:
                if (fbkVar instanceof hss0) {
                    hss0Var = (hss0) fbkVar;
                    int i36 = hss0Var.f94798b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        hss0Var.f94798b = i36 - Integer.MIN_VALUE;
                    } else {
                        hss0Var = new hss0(this, fbkVar);
                    }
                } else {
                    hss0Var = new hss0(this, fbkVar);
                }
                Object obj25 = hss0Var.f94797a;
                int i37 = hss0Var.f94798b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                mey meyVar = (mey) ((Map) obj).get(aps0.f18006a);
                if ((meyVar instanceof ley) && ((ley) meyVar).f132765b) {
                    return w2a1Var;
                }
                hss0Var.f94798b = 1;
                return nizVar.emit(obj, hss0Var) == obj2 ? obj2 : w2a1Var;
            case 18:
                if (fbkVar instanceof jss0) {
                    jss0Var = (jss0) fbkVar;
                    int i38 = jss0Var.f115549b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        jss0Var.f115549b = i38 - Integer.MIN_VALUE;
                    } else {
                        jss0Var = new jss0(this, fbkVar);
                    }
                } else {
                    jss0Var = new jss0(this, fbkVar);
                }
                Object obj26 = jss0Var.f115548a;
                int i39 = jss0Var.f115549b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                Object objValueOf5 = Boolean.valueOf(((Map) obj).get(bps0.f29602a) instanceof ley);
                jss0Var.f115549b = 1;
                return nizVar.emit(objValueOf5, jss0Var) == obj2 ? obj2 : w2a1Var;
            case 19:
                if (fbkVar instanceof dts0) {
                    dts0Var = (dts0) fbkVar;
                    int i40 = dts0Var.f52899b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        dts0Var.f52899b = i40 - Integer.MIN_VALUE;
                    } else {
                        dts0Var = new dts0(this, fbkVar);
                    }
                } else {
                    dts0Var = new dts0(this, fbkVar);
                }
                Object obj27 = dts0Var.f52898a;
                int i41 = dts0Var.f52899b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Object sss0Var = new sss0(((Boolean) obj).booleanValue());
                dts0Var.f52899b = 1;
                return nizVar.emit(sss0Var, dts0Var) == obj2 ? obj2 : w2a1Var;
            case 20:
                if (fbkVar instanceof mts0) {
                    mts0Var = (mts0) fbkVar;
                    int i42 = mts0Var.f147152b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        mts0Var.f147152b = i42 - Integer.MIN_VALUE;
                    } else {
                        mts0Var = new mts0(this, fbkVar);
                    }
                } else {
                    mts0Var = new mts0(this, fbkVar);
                }
                Object obj28 = mts0Var.f147151a;
                int i43 = mts0Var.f147152b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                Object objM64417b = ((gi20) obj).f80018e.m64417b();
                mts0Var.f147152b = 1;
                return nizVar.emit(objM64417b, mts0Var) == obj2 ? obj2 : w2a1Var;
            case 21:
                if (fbkVar instanceof nts0) {
                    nts0Var = (nts0) fbkVar;
                    int i44 = nts0Var.f158145b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        nts0Var.f158145b = i44 - Integer.MIN_VALUE;
                    } else {
                        nts0Var = new nts0(this, fbkVar);
                    }
                } else {
                    nts0Var = new nts0(this, fbkVar);
                }
                Object obj29 = nts0Var.f158144a;
                int i45 = nts0Var.f158145b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                Integer num = (Integer) obj;
                Object n6fVar = num != null ? new n6f(rfg1.m75432b(num.intValue())) : null;
                nts0Var.f158145b = 1;
                return nizVar.emit(n6fVar, nts0Var) == obj2 ? obj2 : w2a1Var;
            case 22:
                if (fbkVar instanceof uts0) {
                    uts0Var = (uts0) fbkVar;
                    int i46 = uts0Var.f233987b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        uts0Var.f233987b = i46 - Integer.MIN_VALUE;
                    } else {
                        uts0Var = new uts0(this, fbkVar);
                    }
                } else {
                    uts0Var = new uts0(this, fbkVar);
                }
                Object obj30 = uts0Var.f233986a;
                int i47 = uts0Var.f233987b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                Object sts0Var = new sts0((kts0) obj);
                uts0Var.f233987b = 1;
                return nizVar.emit(sts0Var, uts0Var) == obj2 ? obj2 : w2a1Var;
            case 23:
                if (fbkVar instanceof gus0) {
                    gus0Var = (gus0) fbkVar;
                    int i48 = gus0Var.f84539b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        gus0Var.f84539b = i48 - Integer.MIN_VALUE;
                    } else {
                        gus0Var = new gus0(this, fbkVar);
                    }
                } else {
                    gus0Var = new gus0(this, fbkVar);
                }
                Object obj31 = gus0Var.f84538a;
                int i49 = gus0Var.f84539b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                Map map2 = ((ty80) obj).f224877f.f271272q;
                Set set5 = k590.f119450a;
                String str6 = (String) map2.get("generation_status");
                if (str6 != null && (string2 = wl51.m88491o1(str6).toString()) != null) {
                    str = string2;
                }
                k590 k590VarM77680s2 = sam.m77680s(str);
                k590VarM77680s2.getClass();
                if (!k590.f119450a.contains(k590VarM77680s2)) {
                    return w2a1Var;
                }
                gus0Var.f84539b = 1;
                return nizVar.emit(obj, gus0Var) == obj2 ? obj2 : w2a1Var;
            case 24:
                if (fbkVar instanceof jus0) {
                    jus0Var = (jus0) fbkVar;
                    int i50 = jus0Var.f116152b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        jus0Var.f116152b = i50 - Integer.MIN_VALUE;
                    } else {
                        jus0Var = new jus0(this, fbkVar);
                    }
                } else {
                    jus0Var = new jus0(this, fbkVar);
                }
                Object obj32 = jus0Var.f116151a;
                int i51 = jus0Var.f116152b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                String str7 = (String) ((ty80) obj).f224877f.f271272q.get("is_overdue_for_scheduled_update");
                if (str7 != null && (boolM88490n1 = wl51.m88490n1(str7)) != null) {
                    zBooleanValue = boolM88490n1.booleanValue();
                }
                if (!zBooleanValue) {
                    return w2a1Var;
                }
                jus0Var.f116152b = 1;
                return nizVar.emit(obj, jus0Var) == obj2 ? obj2 : w2a1Var;
            case 25:
                if (fbkVar instanceof mus0) {
                    mus0Var = (mus0) fbkVar;
                    int i52 = mus0Var.f147433b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        mus0Var.f147433b = i52 - Integer.MIN_VALUE;
                    } else {
                        mus0Var = new mus0(this, fbkVar);
                    }
                } else {
                    mus0Var = new mus0(this, fbkVar);
                }
                Object obj33 = mus0Var.f147432a;
                int i53 = mus0Var.f147433b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                    return w2a1Var;
                }
                bga.m29073P(obj33);
                ty80 ty80Var4 = (ty80) obj;
                boolean zM81955a = ty80Var4.m81955a();
                Set set6 = nus0.f158707h;
                Map map3 = ty80Var4.f224877f.f271272q;
                Set set7 = k590.f119450a;
                String str8 = (String) map3.get("generation_status");
                if (str8 != null && (string3 = wl51.m88491o1(str8).toString()) != null) {
                    str = string3;
                }
                Object objValueOf6 = Boolean.valueOf(!zM81955a || set6.contains(sam.m77680s(str)));
                mus0Var.f147433b = 1;
                return nizVar.emit(objValueOf6, mus0Var) == obj2 ? obj2 : w2a1Var;
            case 26:
                if (fbkVar instanceof xus0) {
                    xus0Var = (xus0) fbkVar;
                    int i54 = xus0Var.f266170b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        xus0Var.f266170b = i54 - Integer.MIN_VALUE;
                    } else {
                        xus0Var = new xus0(this, fbkVar);
                    }
                } else {
                    xus0Var = new xus0(this, fbkVar);
                }
                Object obj34 = xus0Var.f266169a;
                int i55 = xus0Var.f266170b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                    return w2a1Var;
                }
                bga.m29073P(obj34);
                ybv ybvVar = ((ty80) obj).f224877f;
                Map map4 = ybvVar.f271272q;
                Set set8 = k590.f119450a;
                String str9 = (String) map4.get("generation_status");
                if (str9 != null && (string4 = wl51.m88491o1(str9).toString()) != null) {
                    str = string4;
                }
                boolean zM55432b = sam.m77680s(str).m55432b();
                Set set9 = yus0.f276463g;
                String str10 = (String) map4.get("spotbot_assistant_name");
                if (str10 != null && !wl51.m88460J0(str10)) {
                    str2 = str10;
                }
                boolean zM43725i0 = g6f.m43725i0(set9, str2);
                if (ybvVar.f271278w.f156638b && zM55432b && zM43725i0) {
                    String str11 = (String) map4.get("allow_refinement");
                    if ((str11 == null || (boolM88490n2 = wl51.m88490n1(str11)) == null) ? false : boolM88490n2.booleanValue()) {
                        zBooleanValue = true;
                    }
                }
                Object objValueOf7 = Boolean.valueOf(zBooleanValue);
                xus0Var.f266170b = 1;
                return nizVar.emit(objValueOf7, xus0Var) == obj2 ? obj2 : w2a1Var;
            case 27:
                return m95083b(obj, fbkVar);
            case 28:
                return m95084c(obj, fbkVar);
            default:
                if (fbkVar instanceof y3t0) {
                    y3t0Var = (y3t0) fbkVar;
                    int i56 = y3t0Var.f268985b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        y3t0Var.f268985b = i56 - Integer.MIN_VALUE;
                    } else {
                        y3t0Var = new y3t0(this, fbkVar);
                    }
                } else {
                    y3t0Var = new y3t0(this, fbkVar);
                }
                Object obj35 = y3t0Var.f268984a;
                int i57 = y3t0Var.f268985b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj35);
                    return w2a1Var;
                }
                bga.m29073P(obj35);
                if (!((Boolean) obj).booleanValue()) {
                    return w2a1Var;
                }
                y3t0Var.f268985b = 1;
                return nizVar.emit(obj, y3t0Var) == obj2 ? obj2 : w2a1Var;
        }
    }

    public /* synthetic */ z0s0(niz nizVar, Object obj, int i) {
        this.f278162a = i;
        this.f278163b = nizVar;
    }
}
