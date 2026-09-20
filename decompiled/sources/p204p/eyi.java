package p204p;

import android.content.res.Resources;
import android.net.Uri;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class eyi implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f64100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f64101c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f64102d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f64103e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f64104f;

    public /* synthetic */ eyi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f64099a = i;
        this.f64100b = obj;
        this.f64101c = obj2;
        this.f64102d = obj3;
        this.f64103e = obj4;
        this.f64104f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
    
        if (p204p.gyu0.m46175c(r5, r7) == r15) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0113, code lost:
    
        if (p204p.gyu0.m46175c(r5, r7) == r15) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        return r15;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m40317b(PlayerState playerState, fbk fbkVar) {
        dyu0 dyu0Var;
        qlv0 qlv0Var = (qlv0) this.f64104f;
        qlv0 qlv0Var2 = (qlv0) this.f64103e;
        qlv0 qlv0Var3 = (qlv0) this.f64102d;
        gyu0 gyu0Var = (gyu0) this.f64100b;
        xre xreVar = gyu0Var.f85749g;
        if (fbkVar instanceof dyu0) {
            dyu0Var = (dyu0) fbkVar;
            int i = dyu0Var.f54450c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyu0Var.f54450c = i - Integer.MIN_VALUE;
            } else {
                dyu0Var = new dyu0(this, fbkVar);
            }
        } else {
            dyu0Var = new dyu0(this, fbkVar);
        }
        Object obj = dyu0Var.f54448a;
        int i2 = dyu0Var.f54450c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
            String strUri = contextTrack != null ? contextTrack.uri() : null;
            boolean z = playerState.isPlaying() && !playerState.isPaused();
            rlv0 rlv0Var = (rlv0) this.f64101c;
            Object obj2 = rlv0Var.f200373a;
            if (obj2 != null) {
                boolean zM88271j = wj50.m88271j(strUri, obj2);
                yuk yukVar = yuk.f276404a;
                if (zM88271j) {
                    ((wy3) xreVar).getClass();
                    Long l = (Long) playerState.position(System.currentTimeMillis()).mo49283h();
                    long jLongValue = l != null ? l.longValue() : 0L;
                    Long l2 = (Long) playerState.duration().mo49283h();
                    long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                    qlv0Var3.f189932a = jLongValue;
                    qlv0Var2.f189932a = jLongValue2;
                    ((wy3) xreVar).getClass();
                    qlv0Var.f189932a = System.currentTimeMillis();
                    if (!z && !playerState.isPaused() && jLongValue2 > 0) {
                        dyu0Var.f54450c = 1;
                    }
                } else {
                    long j = qlv0Var3.f189932a;
                    ((wy3) xreVar).getClass();
                    long jCurrentTimeMillis = (System.currentTimeMillis() - qlv0Var.f189932a) + j;
                    long j2 = qlv0Var2.f189932a;
                    if (j2 > 0 && jCurrentTimeMillis >= j2 - 3000) {
                        dyu0Var.f54450c = 2;
                    }
                }
            } else if (z && strUri != null) {
                rlv0Var.f200373a = strUri;
                return w2a1Var;
            }
        } else {
            if (i2 == 1) {
                bga.m29073P(obj);
                di41 di41Var = gyu0Var.f85751i;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                gyu0Var.f85751i = null;
                return w2a1Var;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            di41 di41Var2 = gyu0Var.f85751i;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            gyu0Var.f85751i = null;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m40318c(String str, fbk fbkVar) {
        sru0 sru0Var;
        if (fbkVar instanceof sru0) {
            sru0Var = (sru0) fbkVar;
            int i = sru0Var.f213383c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sru0Var.f213383c = i - Integer.MIN_VALUE;
            } else {
                sru0Var = new sru0(this, fbkVar);
            }
        } else {
            sru0Var = new sru0(this, fbkVar);
        }
        Object objM65589b = sru0Var.f213381a;
        int i2 = sru0Var.f213383c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM65589b);
                nsu0 nsu0Var = (nsu0) this.f64100b;
                String str2 = (String) this.f64101c;
                sru0Var.f213383c = 1;
                objM65589b = nsu0Var.m65589b(str2, str, sru0Var);
                yuk yukVar = yuk.f276404a;
                if (objM65589b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM65589b);
            }
            kqi0 kqi0Var = (kqi0) this.f64102d;
            rsu0 rsu0Var = isu0.f105317a;
            kqi0Var.setValue((aru0) objM65589b);
            ((vum0) this.f64103e).m86438w(0);
            ((vum0) this.f64104f).m86438w(0);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if (r12 == r8) goto L51;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m40319d(i2c i2cVar, fbk fbkVar) {
        i2m i2mVar;
        z0r z0rVar;
        gh00 gh00Var;
        z0r z0rVar2;
        Uri uri;
        gh00 gh00Var2;
        Uri uri2;
        Uri uri3;
        gh00 gh00Var3;
        Object objInvoke;
        Uri uri4;
        z0r z0rVar3;
        if (fbkVar instanceof i2m) {
            i2mVar = (i2m) fbkVar;
            int i = i2mVar.f97867g;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2mVar.f97867g = i - Integer.MIN_VALUE;
            } else {
                i2mVar = new i2m(this, fbkVar);
            }
        } else {
            i2mVar = new i2m(this, fbkVar);
        }
        Object objInvoke2 = i2mVar.f97865e;
        int i2 = i2mVar.f97867g;
        w2a1 w2a1Var = w2a1.f247311a;
        Uri uri5 = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                gh00Var = (gh00) i2mVar.f97862b;
                z0rVar = i2mVar.f97861a;
                bga.m29073P(objInvoke2);
            } else {
                if (i2 == 2) {
                    gh00Var = (gh00) i2mVar.f97863c;
                    uri = (Uri) i2mVar.f97862b;
                    z0rVar2 = i2mVar.f97861a;
                    bga.m29073P(objInvoke2);
                    Uri uri6 = uri;
                    uri3 = (Uri) objInvoke2;
                    uri2 = uri6;
                    gh00Var3 = (gh00) ((kqi0) this.f64104f).getValue();
                    if (gh00Var3 != null) {
                        i2mVar.f97861a = z0rVar2;
                        i2mVar.f97862b = uri2;
                        i2mVar.f97863c = uri3;
                        i2mVar.f97864d = gh00Var;
                        i2mVar.f97867g = 3;
                        objInvoke = gh00Var3.invoke(i2mVar);
                        if (objInvoke != yukVar) {
                            z0r z0rVar4 = z0rVar2;
                            uri4 = uri2;
                            objInvoke2 = objInvoke;
                            z0rVar3 = z0rVar4;
                        }
                        return yukVar;
                    }
                    gh00Var.invoke(new g2m(uri3, uri2, uri5, z0rVar2));
                    return w2a1Var;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objInvoke2);
                    return w2a1Var;
                }
                gh00Var = i2mVar.f97864d;
                uri3 = (Uri) i2mVar.f97863c;
                uri4 = (Uri) i2mVar.f97862b;
                z0rVar3 = i2mVar.f97861a;
                bga.m29073P(objInvoke2);
            }
            uri5 = (Uri) objInvoke2;
            uri2 = uri4;
            z0rVar2 = z0rVar3;
            gh00Var.invoke(new g2m(uri3, uri2, uri5, z0rVar2));
            return w2a1Var;
        }
        bga.m29073P(objInvoke2);
        if (!(i2cVar instanceof a2c)) {
            if (i2cVar instanceof z1c) {
                m011 m011Var = (m011) ((C1790du) this.f64101c).f52928f;
                z1c z1cVar = (z1c) i2cVar;
                bcr0 bcr0Var = new bcr0(z1cVar.f278277b, z1cVar.f278278c);
                i2mVar.f97867g = 4;
                if (m011Var.m60397a(bcr0Var, i2mVar) == yukVar) {
                }
            }
            return w2a1Var;
        }
        gh00 gh00Var4 = (gh00) this.f64100b;
        z0rVar = ((a2c) i2cVar).f11621a;
        gh00 gh00Var5 = (gh00) ((kqi0) this.f64102d).getValue();
        if (gh00Var5 != null) {
            i2mVar.f97861a = z0rVar;
            i2mVar.f97862b = gh00Var4;
            i2mVar.f97867g = 1;
            Object objInvoke3 = gh00Var5.invoke(i2mVar);
            if (objInvoke3 != yukVar) {
                objInvoke2 = objInvoke3;
                gh00Var = gh00Var4;
            }
        } else {
            gh00Var = gh00Var4;
            z0rVar2 = z0rVar;
            uri = null;
            gh00Var2 = (gh00) ((kqi0) this.f64103e).getValue();
            if (gh00Var2 != null) {
                uri2 = uri;
                uri3 = null;
                gh00Var3 = (gh00) ((kqi0) this.f64104f).getValue();
                if (gh00Var3 != null) {
                    i2mVar.f97861a = z0rVar2;
                    i2mVar.f97862b = uri2;
                    i2mVar.f97863c = uri3;
                    i2mVar.f97864d = gh00Var;
                    i2mVar.f97867g = 3;
                    objInvoke = gh00Var3.invoke(i2mVar);
                    if (objInvoke != yukVar) {
                        z0r z0rVar5 = z0rVar2;
                        uri4 = uri2;
                        objInvoke2 = objInvoke;
                        z0rVar3 = z0rVar5;
                        uri5 = (Uri) objInvoke2;
                        uri2 = uri4;
                        z0rVar2 = z0rVar3;
                    }
                }
                gh00Var.invoke(new g2m(uri3, uri2, uri5, z0rVar2));
                return w2a1Var;
            }
            i2mVar.f97861a = z0rVar2;
            i2mVar.f97862b = uri;
            i2mVar.f97863c = gh00Var;
            i2mVar.f97867g = 2;
            objInvoke2 = gh00Var2.invoke(i2mVar);
        }
        return yukVar;
        z0rVar2 = z0rVar;
        uri = (Uri) objInvoke2;
        gh00Var2 = (gh00) ((kqi0) this.f64103e).getValue();
        if (gh00Var2 != null) {
            uri2 = uri;
            uri3 = null;
            gh00Var3 = (gh00) ((kqi0) this.f64104f).getValue();
            if (gh00Var3 != null) {
                i2mVar.f97861a = z0rVar2;
                i2mVar.f97862b = uri2;
                i2mVar.f97863c = uri3;
                i2mVar.f97864d = gh00Var;
                i2mVar.f97867g = 3;
                objInvoke = gh00Var3.invoke(i2mVar);
                if (objInvoke != yukVar) {
                    z0r z0rVar6 = z0rVar2;
                    uri4 = uri2;
                    objInvoke2 = objInvoke;
                    z0rVar3 = z0rVar6;
                    uri5 = (Uri) objInvoke2;
                    uri2 = uri4;
                    z0rVar2 = z0rVar3;
                }
            }
            gh00Var.invoke(new g2m(uri3, uri2, uri5, z0rVar2));
            return w2a1Var;
        }
        i2mVar.f97861a = z0rVar2;
        i2mVar.f97862b = uri;
        i2mVar.f97863c = gh00Var;
        i2mVar.f97867g = 2;
        objInvoke2 = gh00Var2.invoke(i2mVar);
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0326  */
    /* JADX WARN: Code duplicated, block: B:228:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r13v7, types: [p.eh00, p.ri00] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, p.lsi0, p.rlv0, p.sir0, p.xfi] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r6v8, types: [p.qe70, p.th00] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        dyi dyiVar;
        rlv0 rlv0Var;
        xfi xfiVar;
        rlv0 rlv0Var2;
        rlv0 rlv0Var3;
        sir0 sir0Var;
        long j;
        jsi0 jsi0Var;
        jsi0 jsi0Var2;
        int i;
        long j2;
        sir0 sir0Var2;
        jsi0 jsi0Var3;
        ?? r5;
        Object obj2;
        String quantityString;
        n7k n7kVar;
        m420 m420Var;
        lg21 lg21Var;
        yjz0 yjz0Var;
        Object obj3;
        lke1 lke1Var;
        Object obj4 = obj;
        int i2 = this.f64099a;
        boolean z = false;
        Object obj5 = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj6 = this.f64104f;
        Object obj7 = this.f64103e;
        Object obj8 = this.f64102d;
        Object obj9 = this.f64101c;
        Object obj10 = this.f64100b;
        switch (i2) {
            case 0:
                if (fbkVar instanceof dyi) {
                    dyiVar = (dyi) fbkVar;
                    int i3 = dyiVar.f54357Z;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dyiVar.f54357Z = i3 - Integer.MIN_VALUE;
                    } else {
                        dyiVar = new dyi(this, fbkVar);
                    }
                } else {
                    dyiVar = new dyi(this, fbkVar);
                }
                Object obj11 = dyiVar.f54355X;
                int i4 = dyiVar.f54357Z;
                try {
                    if (i4 == 0) {
                        bga.m29073P(obj11);
                        lsi0 lsi0Var = (lsi0) obj10;
                        rlv0Var = (rlv0) obj9;
                        xfiVar = xfi.f261020f;
                        rlv0Var2 = (rlv0) obj8;
                        rlv0Var3 = (rlv0) obj7;
                        sir0Var = (sir0) obj6;
                        dyiVar.f54358a = obj4;
                        dyiVar.f54359b = lsi0Var;
                        dyiVar.f54360c = rlv0Var;
                        dyiVar.f54361d = xfiVar;
                        dyiVar.f54362e = rlv0Var2;
                        dyiVar.f54363f = rlv0Var3;
                        dyiVar.f54364g = sir0Var;
                        dyiVar.f54365h = lsi0Var;
                        j = 1000;
                        dyiVar.f54366i = 1000L;
                        dyiVar.f54367t = 0;
                        dyiVar.f54357Z = 1;
                        if (lsi0Var.mo54248a(dyiVar) == obj5) {
                            return obj5;
                        }
                        jsi0Var = lsi0Var;
                        jsi0Var2 = jsi0Var;
                        i = 0;
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jsi0Var3 = dyiVar.f54359b;
                            try {
                                bga.m29073P(obj11);
                                jsi0Var = jsi0Var3;
                                jsi0Var.mo54249c(null);
                                return w2a1Var;
                            } catch (Throwable th) {
                                th = th;
                                obj2 = null;
                                jsi0Var3.mo54249c(obj2);
                                throw th;
                            }
                        }
                        int i5 = dyiVar.f54367t;
                        j = dyiVar.f54366i;
                        lsi0 lsi0Var2 = dyiVar.f54365h;
                        sir0Var = dyiVar.f54364g;
                        rlv0Var3 = dyiVar.f54363f;
                        rlv0Var2 = dyiVar.f54362e;
                        xfiVar = dyiVar.f54361d;
                        rlv0Var = dyiVar.f54360c;
                        jsi0Var = dyiVar.f54359b;
                        Object obj12 = dyiVar.f54358a;
                        bga.m29073P(obj11);
                        i = i5;
                        obj4 = obj12;
                        jsi0Var2 = lsi0Var2;
                    }
                    Object obj13 = rlv0Var.f200373a;
                    rlv0Var.f200373a = obj4;
                    if (obj13 == null || ((Boolean) xfiVar.invoke(obj13, obj4)).booleanValue()) {
                        tf60 tf60Var = (tf60) rlv0Var2.f200373a;
                        if (tf60Var != null) {
                            obj2 = null;
                            r5 = 0;
                            try {
                                tf60Var.mo26601e(null);
                            } catch (Throwable th2) {
                                th = th2;
                                jsi0Var3 = jsi0Var;
                                jsi0Var3.mo54249c(obj2);
                                throw th;
                            }
                        } else {
                            r5 = 0;
                        }
                        rlv0Var2.f200373a = r5;
                        rlv0Var3.f200373a = r5;
                        dyiVar.f54358a = r5;
                        dyiVar.f54359b = jsi0Var;
                        dyiVar.f54360c = r5;
                        dyiVar.f54361d = r5;
                        dyiVar.f54362e = r5;
                        dyiVar.f54363f = r5;
                        dyiVar.f54364g = r5;
                        dyiVar.f54365h = r5;
                        dyiVar.f54367t = i;
                        dyiVar.f54357Z = 2;
                        if (sir0Var2.mo30229d(obj4, dyiVar) == obj5) {
                            return obj5;
                        }
                        jsi0Var3 = jsi0Var;
                        jsi0Var = jsi0Var3;
                        break;
                    } else {
                        rlv0Var3.f200373a = obj4;
                        if (rlv0Var2.f200373a == null) {
                            rlv0Var2.f200373a = x0h1.m89578u(sir0Var2, null, 0, new cyi(j2, jsi0Var2, rlv0Var3, rlv0Var2, sir0Var2, null), 3);
                        }
                    }
                    jsi0Var.mo54249c(null);
                    return w2a1Var;
                } catch (Throwable th3) {
                    th = th3;
                    jsi0Var3 = jsi0Var;
                    obj2 = null;
                    jsi0Var3.mo54249c(obj2);
                    throw th;
                }
                j2 = j;
                sir0Var2 = sir0Var;
            case 1:
                dsj dsjVar = (dsj) obj4;
                urj urjVar = (urj) obj10;
                mj3 mj3Var = urjVar.f233385b;
                if (dsjVar instanceof yrj) {
                    yrj yrjVar = (yrj) dsjVar;
                    ((oj3) mj3Var).m67082a(new yiy0(yrjVar.f275487a, yrjVar.f275488b));
                } else if (dsjVar instanceof csj) {
                    String str = ((csj) dsjVar).f41621a;
                    MobiusLoop mobiusLoop = ((oj3) mj3Var).f165947h;
                    if (mobiusLoop != null) {
                        mobiusLoop.m15600a(new rc3(str));
                    }
                } else if (dsjVar instanceof asj) {
                    ((kqi0) obj8).setValue(new Integer(((asj) dsjVar).f19464a));
                } else if (dsjVar instanceof xrj) {
                    kqi0 kqi0Var = (kqi0) obj7;
                    Resources resources = (Resources) obj9;
                    wj50.m88279p(resources);
                    xrj xrjVar = (xrj) dsjVar;
                    int i6 = xrjVar.f265354a;
                    int i7 = xrjVar.f265355b;
                    float f = wrj.f254371a;
                    if (i7 > 0) {
                        quantityString = resources.getQuantityString(R.plurals.allboarding_selection_summary_with_requirement_content_desc, i6, Integer.valueOf(i6), Integer.valueOf(i7));
                        wj50.m88279p(quantityString);
                    } else {
                        quantityString = resources.getQuantityString(R.plurals.allboarding_selection_summary_content_desc, i6, Integer.valueOf(i6));
                        wj50.m88279p(quantityString);
                    }
                    kqi0Var.setValue(quantityString);
                } else if (dsjVar instanceof zrj) {
                    urjVar.f233391h.m80860a(j101.f107585b);
                    ((kqi0) obj6).setValue(((zrj) dsjVar).f285697a);
                } else if (!(dsjVar instanceof bsj)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1Var;
            case 2:
                if (fbkVar instanceof n7k) {
                    n7kVar = (n7k) fbkVar;
                    int i8 = n7kVar.f151181b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        n7kVar.f151181b = i8 - Integer.MIN_VALUE;
                    } else {
                        n7kVar = new n7k(this, fbkVar);
                    }
                } else {
                    n7kVar = new n7k(this, fbkVar);
                }
                Object obj14 = n7kVar.f151180a;
                int i9 = n7kVar.f151181b;
                if (i9 == 0) {
                    bga.m29073P(obj14);
                    niz nizVar = (niz) obj10;
                    s8k s8kVar = (s8k) obj4;
                    azp0 azp0Var = (azp0) obj9;
                    v5r0 v5r0Var = ((a1e0) obj8).f11394b;
                    a1e0 a1e0Var = (a1e0) obj7;
                    a1e0 a1e0Var2 = (a1e0) obj6;
                    zv41 zv41Var = (zv41) azp0Var.f21668f;
                    s8k s8kVar2 = (s8k) zv41Var.getValue();
                    zv41Var.m97090l(s8kVar);
                    k5r0 k5r0Var = v5r0Var.f237604u;
                    boolean z2 = s8kVar.f206674d;
                    boolean z3 = s8kVar.f206673c;
                    boolean z4 = z2 && z3 && ((Boolean) a1e0Var2.invoke()).booleanValue() && azp0.m27636A(s8kVar, k5r0Var);
                    lg21 lg21Var2 = (lg21) a1e0Var.invoke();
                    k5r0 k5r0Var2 = v5r0Var.f237604u;
                    if (lg21Var2 != null) {
                        cg21 cg21Var = (cg21) lg21Var2.f133060f.getValue();
                        k7i0 k7i0Var = cg21Var.f37537a;
                        ig21 ig21Var = cg21Var.f37544h;
                        z = !z2 && s8kVar2 != null && s8kVar2.f206674d && ((Boolean) a1e0Var2.invoke()).booleanValue() && azp0.m27636A(s8kVar, k5r0Var2) && (k7i0Var != null && !wj50.m88271j(ig21Var, fg21.f69183a) && !(ig21Var instanceof eg21));
                    }
                    m7k m7kVar = new m7k(z, z4, ((Boolean) a1e0Var2.invoke()).booleanValue() && z2 && z3 && !((isi0) azp0Var.f21667e).m51543a());
                    n7kVar.f151181b = 1;
                    if (nizVar.emit(m7kVar, n7kVar) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1Var;
            case 3:
                return m40319d((i2c) obj4, fbkVar);
            case 4:
                if (fbkVar instanceof m420) {
                    m420Var = (m420) fbkVar;
                    int i10 = m420Var.f139794b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        m420Var.f139794b = i10 - Integer.MIN_VALUE;
                    } else {
                        m420Var = new m420(this, fbkVar);
                    }
                } else {
                    m420Var = new m420(this, fbkVar);
                }
                Object obj15 = m420Var.f139793a;
                int i11 = m420Var.f139794b;
                if (i11 == 0) {
                    bga.m29073P(obj15);
                    niz nizVar2 = (niz) obj10;
                    api apiVar = (api) obj4;
                    List list = lau.f131415a;
                    if (apiVar != null && !apiVar.mo26697m()) {
                        c320 c320VarMo26706v = apiVar.mo26706v();
                        List list2 = c320VarMo26706v != null ? c320VarMo26706v.f33526a : null;
                        if (list2 == null) {
                            list2 = list;
                        }
                        ArrayList arrayListM43700N0 = g6f.m43700N0(((i8a) obj9).isEnabled() ? ((c320) ((ri00) obj8).invoke()).f33526a : list, list2);
                        if (!arrayListM43700N0.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj16 : arrayListM43700N0) {
                                if (((Set) obj7).contains(((j420) obj16).f108559f)) {
                                    arrayList.add(obj16);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((yqx0) ((qe70) obj6).invoke((j420) it.next(), apiVar.mo26695k()));
                            }
                            list = arrayList2;
                        }
                    }
                    m420Var.f139794b = 1;
                    if (nizVar2.emit(list, m420Var) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                }
                return w2a1Var;
            case 5:
                udd1 udd1Var = (udd1) obj4;
                kqi0 kqi0Var2 = (kqi0) obj8;
                if (!(udd1Var instanceof sdd1)) {
                    if (!wj50.m88271j(udd1Var, tdd1.f219290a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lg21 lg21Var3 = (lg21) kqi0Var2.getValue();
                    if (lg21Var3 != null) {
                        lg21.m58922g(lg21Var3, (d850) ((gh00) ((kqi0) obj7).getValue()).invoke(cv9.m34003y((aub1) obj10)), ((idd1) obj9).f101074f.f283002b, (String) ((eh00) ((kqi0) obj6).getValue()).invoke(), null, 8);
                    }
                } else if (!((sdd1) udd1Var).f207995a && (lg21Var = (lg21) kqi0Var2.getValue()) != null) {
                    lg21Var.m58926d();
                }
                return w2a1Var;
            case 6:
                return m40318c((String) obj4, fbkVar);
            case 7:
                return m40317b((PlayerState) obj4, fbkVar);
            case 8:
                long jLongValue = ((Number) obj4).longValue();
                kqi0 kqi0Var3 = (kqi0) obj8;
                float f2 = joy0.f114530a;
                if (jLongValue > ((zny0) kqi0Var3.getValue()).f284600c) {
                    kqi0Var3.setValue(((boy0) ((kqi0) obj7).getValue()).f29277a);
                    if (!joy0.m53898e((kqi0) obj6)) {
                        zny0 zny0Var = (zny0) kqi0Var3.getValue();
                        ((wy3) ((xre) obj9)).getClass();
                        ((uum0) obj10).m84032w(zny0Var.m96603c(System.currentTimeMillis()));
                    }
                }
                return w2a1Var;
            case 9:
                if (fbkVar instanceof yjz0) {
                    yjz0Var = (yjz0) fbkVar;
                    int i12 = yjz0Var.f273509b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        yjz0Var.f273509b = i12 - Integer.MIN_VALUE;
                    } else {
                        yjz0Var = new yjz0(this, fbkVar);
                    }
                } else {
                    yjz0Var = new yjz0(this, fbkVar);
                }
                Object obj17 = yjz0Var.f273508a;
                int i13 = yjz0Var.f273509b;
                if (i13 == 0) {
                    bga.m29073P(obj17);
                    niz nizVar3 = (niz) obj10;
                    pqm0 pqm0Var = (pqm0) obj4;
                    g4t0 g4t0Var = (g4t0) pqm0Var.f180350a;
                    String strMo26689e = ((api) pqm0Var.f180351b).mo26689e();
                    ((sgy0) obj9).invoke(strMo26689e);
                    if (((Boolean) ((lgc) obj8).invoke()).booleanValue()) {
                        Iterator it2 = g4t0Var.f76525a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (bm51.m29796g0(((rmx0) next).f200635a, strMo26689e, false)) {
                                    obj3 = next;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        rmx0 rmx0Var = (rmx0) obj3;
                        if (rmx0Var != null) {
                            ((lgc) obj7).invoke();
                            akz0 akz0Var = (akz0) obj6;
                            wmd0 wmd0Var = rmx0Var.f200646l;
                            if (!(wmd0Var != null ? wmd0Var.m88559f() : false)) {
                                String str2 = rmx0Var.f200635a;
                                aqp aqpVar = akz0Var.f16683a;
                                aqpVar.m26884c();
                                zmd0.m96426b();
                                if (!wj50.m88271j(str2, q191.m71888F(zmd0.m96427c().m61669h(), aqpVar.f18752f).f200635a)) {
                                    yjz0Var.f273509b = 1;
                                    if (nizVar3.emit(rmx0Var, yjz0Var) == obj5) {
                                        return obj5;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1Var;
            case 10:
                int iIntValue = ((Number) obj4).intValue();
                vum0 vum0Var = (vum0) obj7;
                Consumer consumer = (Consumer) obj9;
                if (iIntValue >= 0) {
                    zhq zhqVar = ((idd1) obj10).f101074f;
                    xre xreVar = zhqVar.f283001a;
                    zhqVar.f283002b = Long.valueOf(System.currentTimeMillis());
                    consumer.accept(new eor(iIntValue));
                    if (((wnm0) obj8).f253221e) {
                        if (iIntValue != vum0Var.m86437v()) {
                            ((eh00) ((kqi0) obj6).getValue()).invoke();
                            vum0Var.m86438w(iIntValue);
                        }
                        consumer.accept(new oor(iIntValue));
                    }
                }
                return w2a1Var;
            case 11:
                return m40320f((p2x0) obj4, fbkVar);
            default:
                if (fbkVar instanceof lke1) {
                    lke1Var = (lke1) fbkVar;
                    int i14 = lke1Var.f134340b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        lke1Var.f134340b = i14 - Integer.MIN_VALUE;
                    } else {
                        lke1Var = new lke1(this, fbkVar);
                    }
                } else {
                    lke1Var = new lke1(this, fbkVar);
                }
                Object obj18 = lke1Var.f134339a;
                int i15 = lke1Var.f134340b;
                if (i15 == 0) {
                    bga.m29073P(obj18);
                    pqm0 pqm0Var2 = (pqm0) obj4;
                    tj81 tj81Var = (tj81) obj9;
                    gke1 gke1Var = new gke1(tj81Var.f220849a, tj81Var.f220850b, tj81Var.f220852d, (String) obj8, (String) obj7, new dke1((String) pqm0Var2.f180350a, (String) pqm0Var2.f180351b), ((xje1) ((cke1) obj6)).f262120d);
                    lke1Var.f134340b = 1;
                    if (((niz) obj10).emit(gke1Var, lke1Var) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r11.mo30229d(r1, r0) == r5) goto L29;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m40320f(p2x0 p2x0Var, fbk fbkVar) {
        fyd1 fyd1Var;
        p2x0 p2x0VarM68968a;
        bqa bqaVar;
        if (fbkVar instanceof fyd1) {
            fyd1Var = (fyd1) fbkVar;
            int i = fyd1Var.f74712d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyd1Var.f74712d = i - Integer.MIN_VALUE;
            } else {
                fyd1Var = new fyd1(this, fbkVar);
            }
        } else {
            fyd1Var = new fyd1(this, fbkVar);
        }
        Object obj = fyd1Var.f74710b;
        int i2 = fyd1Var.f74712d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            nlv0 nlv0Var = (nlv0) this.f64100b;
            if (nlv0Var.f155174a) {
                bqaVar = (bqa) this.f64103e;
                fyd1Var.f74709a = null;
                fyd1Var.f74712d = 2;
                if (bqaVar.mo30229d(p2x0Var, fyd1Var) != yukVar) {
                    return w2a1Var;
                }
            } else {
                nlv0Var.f155174a = true;
                sir0 sir0Var = (sir0) this.f64104f;
                if (p2x0Var instanceof m2x0) {
                    iyd1 iyd1Var = (iyd1) this.f64101c;
                    qu80 qu80Var = (qu80) ((m2x0) p2x0Var).f139474a;
                    PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = iyd1.f106963e;
                    p2x0VarM68968a = new m2x0(iyd1Var.m51906b(qu80Var, qu80Var));
                } else {
                    p2x0VarM68968a = p2x0Var.m68968a(ngd1.f153655L0);
                }
                fyd1Var.f74709a = p2x0Var;
                fyd1Var.f74712d = 1;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        p2x0Var = fyd1Var.f74709a;
        bga.m29073P(obj);
        ((guf) this.f64102d).m38797k0(w2a1Var);
        bqaVar = (bqa) this.f64103e;
        fyd1Var.f74709a = null;
        fyd1Var.f74712d = 2;
        if (bqaVar.mo30229d(p2x0Var, fyd1Var) != yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eyi(niz nizVar, i8a i8aVar, eh00 eh00Var, Set set, th00 th00Var) {
        this.f64099a = 4;
        this.f64100b = nizVar;
        this.f64101c = i8aVar;
        this.f64102d = (ri00) eh00Var;
        this.f64103e = set;
        this.f64104f = (qe70) th00Var;
    }

    public eyi(nlv0 nlv0Var, sir0 sir0Var, iyd1 iyd1Var, guf gufVar, bqa bqaVar) {
        this.f64099a = 11;
        this.f64100b = nlv0Var;
        this.f64104f = sir0Var;
        this.f64101c = iyd1Var;
        this.f64102d = gufVar;
        this.f64103e = bqaVar;
    }

    public eyi(rlv0 rlv0Var, gyu0 gyu0Var, qlv0 qlv0Var, qlv0 qlv0Var2, qlv0 qlv0Var3) {
        this.f64099a = 7;
        this.f64101c = rlv0Var;
        this.f64100b = gyu0Var;
        this.f64102d = qlv0Var;
        this.f64103e = qlv0Var2;
        this.f64104f = qlv0Var3;
    }
}
