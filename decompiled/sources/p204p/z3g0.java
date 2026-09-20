package p204p;

import com.spotify.playlistmixing.proto.SetMixState;
import com.spotify.playlistmixing.proto.SignalData;
import com.spotify.playlistmixing.utils.MixingStateError;
import io.reactivex.rxjava3.core.Completable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class z3g0 implements s3g0 {

    /* JADX INFO: renamed from: a */
    public final yz80 f278919a;

    /* JADX INFO: renamed from: b */
    public final vpx f278920b;

    /* JADX INFO: renamed from: c */
    public final j3g0 f278921c;

    /* JADX INFO: renamed from: d */
    public final q490 f278922d;

    /* JADX INFO: renamed from: e */
    public final fiz f278923e;

    /* JADX INFO: renamed from: f */
    public u490 f278924f;

    public z3g0(yz80 yz80Var, vpx vpxVar, j3g0 j3g0Var, q490 q490Var, fiz fizVar) {
        this.f278919a = yz80Var;
        this.f278920b = vpxVar;
        this.f278921c = j3g0Var;
        this.f278922d = q490Var;
        this.f278923e = fizVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (m95278c(r10, r6) == r8) goto L39;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m95276a(String str, rz80 rz80Var, List list, boolean z, ibk ibkVar) {
        t3g0 t3g0Var;
        boolean z2;
        String str2;
        p2x0 p2x0Var;
        if (ibkVar instanceof t3g0) {
            t3g0Var = (t3g0) ibkVar;
            int i = t3g0Var.f216778e;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3g0Var.f216778e = i - Integer.MIN_VALUE;
            } else {
                t3g0Var = new t3g0(this, ibkVar);
            }
        } else {
            t3g0Var = new t3g0(this, ibkVar);
        }
        t3g0 t3g0Var2 = t3g0Var;
        Object objM63324u = t3g0Var2.f216776c;
        int i2 = t3g0Var2.f216778e;
        yz80 yz80Var = this.f278919a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM63324u);
            List listSingletonList = Collections.singletonList(rz80Var);
            t3g0Var2.f216774a = str;
            t3g0Var2.f216775b = z;
            t3g0Var2.f216778e = 1;
            objM63324u = ((n090) yz80Var).m63324u(str, listSingletonList, list, t3g0Var2);
            if (objM63324u != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = t3g0Var2.f216775b;
            str = t3g0Var2.f216774a;
            bga.m29073P(objM63324u);
        } else if (i2 == 2) {
            z2 = t3g0Var2.f216775b;
            str2 = t3g0Var2.f216774a;
            bga.m29073P(objM63324u);
            p2x0Var = (p2x0) objM63324u;
            if (!(p2x0Var instanceof m2x0)) {
                return new c6x0(new MixingStateError.LensOperationFailed(((k2x0) p2x0Var).f118699a.mo27977b()));
            }
            z = z2;
            str = str2;
            t3g0Var2.f216774a = null;
            t3g0Var2.f216775b = z;
            t3g0Var2.f216778e = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM63324u);
        }
        return w2a1.f247311a;
        p2x0 p2x0Var2 = (p2x0) objM63324u;
        if (!(p2x0Var2 instanceof m2x0)) {
            return new c6x0(new MixingStateError.SignalFailed(((k2x0) p2x0Var2).f118699a.mo27977b()));
        }
        if (z) {
            t3g0Var2.f216774a = str;
            t3g0Var2.f216775b = z;
            t3g0Var2.f216778e = 2;
            String str3 = str;
            objM63324u = ((n090) yz80Var).m63321r(str3, "mix", false, false, t3g0Var2);
            if (objM63324u != obj) {
                z2 = z;
                str2 = str3;
                p2x0Var = (p2x0) objM63324u;
                if (!(p2x0Var instanceof m2x0)) {
                    return new c6x0(new MixingStateError.LensOperationFailed(((k2x0) p2x0Var).f118699a.mo27977b()));
                }
                z = z2;
                str = str2;
                t3g0Var2.f216774a = null;
                t3g0Var2.f216775b = z;
                t3g0Var2.f216778e = 3;
            }
        } else {
            t3g0Var2.f216774a = null;
            t3g0Var2.f216775b = z;
            t3g0Var2.f216778e = 3;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m95277b(ibk ibkVar) {
        u3g0 u3g0Var;
        if (ibkVar instanceof u3g0) {
            u3g0Var = (u3g0) ibkVar;
            int i = u3g0Var.f226379c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u3g0Var.f226379c = i - Integer.MIN_VALUE;
            } else {
                u3g0Var = new u3g0(this, ibkVar);
            }
        } else {
            u3g0Var = new u3g0(this, ibkVar);
        }
        Object objM86755t = u3g0Var.f226377a;
        int i2 = u3g0Var.f226379c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            u490 u490Var = this.f278924f;
            if (u490Var != null) {
                return u490Var;
            }
            u3g0Var.f226379c = 1;
            objM86755t = vyf1.m86755t(this.f278923e, u3g0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        u490 u490VarMo44949a = this.f278922d.mo44949a((String) objM86755t);
        this.f278924f = u490VarMo44949a;
        return u490VarMo44949a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (p204p.zn91.m96565n(r7, r0) == r5) goto L25;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m95278c(String str, ibk ibkVar) {
        v3g0 v3g0Var;
        if (ibkVar instanceof v3g0) {
            v3g0Var = (v3g0) ibkVar;
            int i = v3g0Var.f236882d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3g0Var.f236882d = i - Integer.MIN_VALUE;
            } else {
                v3g0Var = new v3g0(this, ibkVar);
            }
        } else {
            v3g0Var = new v3g0(this, ibkVar);
        }
        Object obj = v3g0Var.f236880b;
        int i2 = v3g0Var.f236882d;
        vpx vpxVar = this.f278920b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM86176a = vpxVar.m86176a(Collections.singletonList(str), vu7.class);
                v3g0Var.f236879a = str;
                v3g0Var.f236882d = 1;
                if (zn91.m96565n(completableM86176a, v3g0Var) == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                str = v3g0Var.f236879a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
            Completable completableM86176a2 = vpxVar.m86176a(Collections.singletonList(str), uff0.class);
            v3g0Var.f236879a = null;
            v3g0Var.f236882d = 2;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        if (m95281f(r3, r5) == r13) goto L55;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m95279d(String str, ibk ibkVar, boolean z) {
        w3g0 w3g0Var;
        String str2;
        Object obj;
        boolean z2;
        String str3;
        Object obj2;
        if (ibkVar instanceof w3g0) {
            w3g0Var = (w3g0) ibkVar;
            int i = w3g0Var.f247589f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w3g0Var.f247589f = i - Integer.MIN_VALUE;
            } else {
                w3g0Var = new w3g0(this, ibkVar);
            }
        } else {
            w3g0Var = new w3g0(this, ibkVar);
        }
        w3g0 w3g0Var2 = w3g0Var;
        Object obj3 = w3g0Var2.f247587d;
        int i2 = w3g0Var2.f247589f;
        j3g0 j3g0Var = this.f278921c;
        Object obj4 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj3);
            String str4 = z ? "mix-auto-toggle-on" : "mix-auto-toggle-off";
            u121 u121VarM19433o = SignalData.m19433o();
            u121VarM19433o.m82191m();
            rz80 rz80Var = new rz80(str4, ((SignalData) u121VarM19433o.build()).toByteString(), (gva) null, z);
            List listSingletonList = z ? Collections.singletonList("mix") : lau.f131415a;
            w3g0Var2.f247584a = str;
            w3g0Var2.f247586c = z;
            w3g0Var2.f247589f = 1;
            Object objM95276a = m95276a(str, rz80Var, listSingletonList, !z, w3g0Var2);
            if (objM95276a != obj4) {
                str2 = str;
                obj = objM95276a;
                z2 = z;
            }
            return obj4;
        }
        if (i2 == 1) {
            z2 = w3g0Var2.f247586c;
            str2 = w3g0Var2.f247584a;
            bga.m29073P(obj3);
            obj = ((s6x0) obj3).f206218a;
        } else {
            if (i2 == 2) {
                z2 = w3g0Var2.f247586c;
                obj2 = w3g0Var2.f247585b;
                str3 = w3g0Var2.f247584a;
                bga.m29073P(obj3);
                if (z2) {
                    w3g0Var2.f247584a = str3;
                    w3g0Var2.f247585b = obj2;
                    w3g0Var2.f247586c = z2;
                    w3g0Var2.f247589f = 3;
                    if (j3g0Var.m52257a(str3, w3g0Var2) != obj4) {
                    }
                } else {
                    w3g0Var2.f247584a = null;
                    w3g0Var2.f247585b = obj2;
                    w3g0Var2.f247586c = z2;
                    w3g0Var2.f247589f = 5;
                    if (j3g0Var.m52260d(str3, w3g0Var2) == obj4) {
                        return obj2;
                    }
                }
                return obj4;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    Object obj5 = w3g0Var2.f247585b;
                    bga.m29073P(obj3);
                    Object obj6 = ((s6x0) obj3).f206218a;
                    return obj5;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj7 = w3g0Var2.f247585b;
                bga.m29073P(obj3);
                return obj7;
            }
            z2 = w3g0Var2.f247586c;
            obj2 = w3g0Var2.f247585b;
            str3 = w3g0Var2.f247584a;
            bga.m29073P(obj3);
        }
        w3g0Var2.f247584a = null;
        w3g0Var2.f247585b = obj2;
        w3g0Var2.f247586c = z2;
        w3g0Var2.f247589f = 4;
        if (j3g0Var.m52261e(str3, w3g0Var2) != obj4) {
            return obj4;
        }
        return obj2;
        if (obj instanceof c6x0) {
            return obj;
        }
        if (z2) {
            w3g0Var2.f247584a = str2;
            w3g0Var2.f247585b = obj;
            w3g0Var2.f247586c = z2;
            w3g0Var2.f247589f = 2;
        }
        str3 = str2;
        obj2 = obj;
        if (z2) {
            w3g0Var2.f247584a = str3;
            w3g0Var2.f247585b = obj2;
            w3g0Var2.f247586c = z2;
            w3g0Var2.f247589f = 3;
            if (j3g0Var.m52257a(str3, w3g0Var2) != obj4) {
                w3g0Var2.f247584a = null;
                w3g0Var2.f247585b = obj2;
                w3g0Var2.f247586c = z2;
                w3g0Var2.f247589f = 4;
                if (j3g0Var.m52261e(str3, w3g0Var2) != obj4) {
                    return obj2;
                }
            }
        } else {
            w3g0Var2.f247584a = null;
            w3g0Var2.f247585b = obj2;
            w3g0Var2.f247586c = z2;
            w3g0Var2.f247589f = 5;
            if (j3g0Var.m52260d(str3, w3g0Var2) == obj4) {
                return obj2;
            }
        }
        return obj4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m95280e(String str, ibk ibkVar, boolean z) {
        x3g0 x3g0Var;
        if (ibkVar instanceof x3g0) {
            x3g0Var = (x3g0) ibkVar;
            int i = x3g0Var.f257810c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x3g0Var.f257810c = i - Integer.MIN_VALUE;
            } else {
                x3g0Var = new x3g0(this, ibkVar);
            }
        } else {
            x3g0Var = new x3g0(this, ibkVar);
        }
        x3g0 x3g0Var2 = x3g0Var;
        Object obj = x3g0Var2.f257808a;
        int i2 = x3g0Var2.f257810c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((s6x0) obj).f206218a;
        }
        bga.m29073P(obj);
        u121 u121VarM19433o = SignalData.m19433o();
        u121VarM19433o.m82191m();
        gva byteString = ((SignalData) u121VarM19433o.build()).toByteString();
        p501 p501VarM19426o = SetMixState.m19426o();
        p501VarM19426o.m69160m(z);
        rz80 rz80Var = new rz80("mix-state", byteString, ((SetMixState) p501VarM19426o.build()).toByteString(), z);
        List listSingletonList = z ? Collections.singletonList("mix") : lau.f131415a;
        x3g0Var2.f257810c = 1;
        Object objM95276a = m95276a(str, rz80Var, listSingletonList, !z, x3g0Var2);
        Object obj2 = yuk.f276404a;
        return objM95276a == obj2 ? obj2 : objM95276a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m95281f(String str, ibk ibkVar) {
        y3g0 y3g0Var;
        String str2;
        u490 u490Var;
        if (ibkVar instanceof y3g0) {
            y3g0Var = (y3g0) ibkVar;
            int i = y3g0Var.f268917e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y3g0Var.f268917e = i - Integer.MIN_VALUE;
            } else {
                y3g0Var = new y3g0(this, ibkVar);
            }
        } else {
            y3g0Var = new y3g0(this, ibkVar);
        }
        Object objM95277b = y3g0Var.f268915c;
        int i2 = y3g0Var.f268917e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM95277b);
            y3g0Var.f268913a = str;
            y3g0Var.f268917e = 1;
            objM95277b = m95277b(y3g0Var);
            if (objM95277b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = y3g0Var.f268913a;
            bga.m29073P(objM95277b);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM95277b);
                return w2a1Var;
            }
            u490Var = y3g0Var.f268914b;
            str2 = y3g0Var.f268913a;
            bga.m29073P(objM95277b);
        }
        if (!(((i490) objM95277b) instanceof v390)) {
            y3g0Var.f268913a = null;
            y3g0Var.f268914b = null;
            y3g0Var.f268917e = 3;
            if (u490Var.m82319d(str2, v390.f236813a, y3g0Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
        u490 u490Var2 = (u490) objM95277b;
        y3g0Var.f268913a = str;
        y3g0Var.f268914b = u490Var2;
        y3g0Var.f268917e = 2;
        Object objM82316a = u490Var2.m82316a(str, y3g0Var);
        if (objM82316a != obj) {
            str2 = str;
            u490Var = u490Var2;
            objM95277b = objM82316a;
            if (!(((i490) objM95277b) instanceof v390)) {
                y3g0Var.f268913a = null;
                y3g0Var.f268914b = null;
                y3g0Var.f268917e = 3;
                if (u490Var.m82319d(str2, v390.f236813a, y3g0Var) == obj) {
                }
            }
            return w2a1Var;
        }
        return obj;
    }
}
