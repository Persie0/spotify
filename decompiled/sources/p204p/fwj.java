package p204p;

import com.spotify.mobius.functions.Consumer;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class fwj implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74079a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f74081c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f74082d;

    public /* synthetic */ fwj(Object obj, Object obj2, Object obj3, int i) {
        this.f74079a = i;
        this.f74080b = obj;
        this.f74081c = obj2;
        this.f74082d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, p.vh00] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jxr jxrVar;
        ilz ilzVar;
        rlv0 rlv0Var;
        tmz tmzVar;
        fu80 fu80Var;
        switch (this.f74079a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                gh00 gh00Var = (gh00) this.f74081c;
                plv0 plv0Var = (plv0) this.f74080b;
                kqi0 kqi0Var = (kqi0) this.f74082d;
                if (gwj.m45957o(kqi0Var)) {
                    gwj.m45958p(kqi0Var, false);
                } else {
                    int i = plv0Var.f178796a;
                    if (iIntValue != i) {
                        if (iIntValue > i) {
                            gh00Var.invoke(fvj.f73805a);
                        } else {
                            gh00Var.invoke(gvj.f84763a);
                        }
                    }
                }
                plv0Var.f178796a = iIntValue;
                return w2a1.f247311a;
            case 1:
                w2a1 w2a1Var = w2a1.f247311a;
                rlv0 rlv0Var2 = (rlv0) this.f74081c;
                kxr kxrVar = (kxr) this.f74080b;
                if (fbkVar instanceof jxr) {
                    jxrVar = (jxr) fbkVar;
                    int i2 = jxrVar.f117208c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        jxrVar.f117208c = i2 - Integer.MIN_VALUE;
                    } else {
                        jxrVar = new jxr(this, fbkVar);
                    }
                } else {
                    jxrVar = new jxr(this, fbkVar);
                }
                Object obj2 = jxrVar.f117206a;
                yuk yukVar = yuk.f276404a;
                int i3 = jxrVar.f117208c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                Object objInvoke = kxrVar.f127581b.invoke(obj);
                Object obj3 = rlv0Var2.f200373a;
                if (obj3 != qkf1.f189548a && ((Boolean) kxrVar.f127582c.invoke(obj3, objInvoke)).booleanValue()) {
                    return w2a1Var;
                }
                rlv0Var2.f200373a = objInvoke;
                niz nizVar = (niz) this.f74082d;
                jxrVar.f117208c = 1;
                return nizVar.emit(obj, jxrVar) == yukVar ? yukVar : w2a1Var;
            case 2:
                Object obj4 = this.f74080b;
                nlv0 nlv0Var = (nlv0) this.f74081c;
                Consumer consumer = (Consumer) this.f74082d;
                synchronized (obj4) {
                    if (!nlv0Var.f155174a) {
                        consumer.accept(obj);
                    }
                    break;
                }
                return w2a1.f247311a;
            case 3:
                rlv0 rlv0Var3 = (rlv0) this.f74080b;
                if (fbkVar instanceof ilz) {
                    ilzVar = (ilz) fbkVar;
                    int i4 = ilzVar.f103557d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ilzVar.f103557d = i4 - Integer.MIN_VALUE;
                    } else {
                        ilzVar = new ilz(this, fbkVar);
                    }
                } else {
                    ilzVar = new ilz(this, fbkVar);
                }
                Object objMo24510D0 = ilzVar.f103555b;
                yuk yukVar2 = yuk.f276404a;
                int i5 = ilzVar.f103557d;
                if (i5 != 0) {
                    if (i5 == 1) {
                        rlv0Var = ilzVar.f103554a;
                        bga.m29073P(objMo24510D0);
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objMo24510D0);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objMo24510D0);
                ?? r10 = this.f74081c;
                Object obj5 = rlv0Var3.f200373a;
                ilzVar.f103554a = rlv0Var3;
                ilzVar.f103557d = 1;
                objMo24510D0 = r10.mo24510D0(obj5, obj, ilzVar);
                if (objMo24510D0 == yukVar2) {
                    return yukVar2;
                }
                rlv0Var = rlv0Var3;
                rlv0Var.f200373a = objMo24510D0;
                niz nizVar2 = (niz) this.f74082d;
                Object obj6 = rlv0Var3.f200373a;
                ilzVar.f103554a = null;
                ilzVar.f103557d = 2;
                if (nizVar2.emit(obj6, ilzVar) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof tmz) {
                    tmzVar = (tmz) fbkVar;
                    int i6 = tmzVar.f221802b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        tmzVar.f221802b = i6 - Integer.MIN_VALUE;
                    } else {
                        tmzVar = new tmz(this, fbkVar);
                    }
                } else {
                    tmzVar = new tmz(this, fbkVar);
                }
                Object obj7 = tmzVar.f221801a;
                yuk yukVar3 = yuk.f276404a;
                int i7 = tmzVar.f221802b;
                if (i7 == 0) {
                    bga.m29073P(obj7);
                    niz nizVar3 = (niz) this.f74080b;
                    String str = (String) ((Map) obj).get((String) this.f74081c);
                    if (str == null) {
                        str = (String) this.f74082d;
                    }
                    tmzVar.f221802b = 1;
                    if (nizVar3.emit(str, tmzVar) == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 5:
                yed0 yed0Var = (yed0) obj;
                qpo0 qpo0Var = (qpo0) this.f74081c;
                rb5 rb5Var = (rb5) this.f74080b;
                if (yed0Var instanceof wed0) {
                    wed0 wed0Var = (wed0) yed0Var;
                    if (wed0Var.m87874a() != 0) {
                        ((z9p) rb5Var.f197473d).m95706y(qpo0Var, wed0Var.m87874a());
                        ygs ygsVar = (ygs) this.f74082d;
                        if (ygsVar != null) {
                            ygsVar.mo24961e(3);
                        }
                    }
                } else {
                    if (!(yed0Var instanceof xed0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iM38547C = edb.m38547C(((xed0) yed0Var).m90437a());
                    if (iM38547C != 0) {
                        if (iM38547C == 1) {
                            ((z9p) rb5Var.f197473d).m95700s(qpo0Var);
                        } else {
                            if (iM38547C != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((z9p) rb5Var.f197473d).m95691E(qpo0Var);
                        }
                    }
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof fu80) {
                    fu80Var = (fu80) fbkVar;
                    int i8 = fu80Var.f73438b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        fu80Var.f73438b = i8 - Integer.MIN_VALUE;
                    } else {
                        fu80Var = new fu80(this, fbkVar);
                    }
                } else {
                    fu80Var = new fu80(this, fbkVar);
                }
                Object obj8 = fu80Var.f73437a;
                yuk yukVar4 = yuk.f276404a;
                int i9 = fu80Var.f73438b;
                if (i9 == 0) {
                    bga.m29073P(obj8);
                    niz nizVar4 = (niz) this.f74080b;
                    PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) obj;
                    p2x0 p2x0VarM74316p = qzb0.m74316p(playlistGetResponse.m97675r(), (String) this.f74081c, new bu80((mu80) this.f74082d, playlistGetResponse, 2));
                    fu80Var.f73438b = 1;
                    if (nizVar4.emit(p2x0VarM74316p, fu80Var) == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
        }
    }
}
