package p204p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h0p {

    /* JADX INFO: renamed from: a */
    public final Context f86323a;

    /* JADX INFO: renamed from: b */
    public final z4n f86324b;

    /* JADX INFO: renamed from: c */
    public final u3f f86325c;

    /* JADX INFO: renamed from: d */
    public final j8q f86326d;

    /* JADX INFO: renamed from: e */
    public final y8q f86327e;

    /* JADX INFO: renamed from: f */
    public final luk f86328f;

    /* JADX INFO: renamed from: g */
    public final wg61 f86329g = new wg61(new sho(this, 15));

    public h0p(Context context, z4n z4nVar, u3f u3fVar, j8q j8qVar, y8q y8qVar, luk lukVar) {
        this.f86323a = context;
        this.f86324b = z4nVar;
        this.f86325c = u3fVar;
        this.f86326d = j8qVar;
        this.f86327e = y8qVar;
        this.f86328f = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m46363a(String str, ibk ibkVar) {
        a0p a0pVar;
        if (ibkVar instanceof a0p) {
            a0pVar = (a0p) ibkVar;
            int i = a0pVar.f11130c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0pVar.f11130c = i - Integer.MIN_VALUE;
            } else {
                a0pVar = new a0p(this, ibkVar);
            }
        } else {
            a0pVar = new a0p(this, ibkVar);
        }
        Object objM95361v0 = a0pVar.f11128a;
        int i2 = a0pVar.f11130c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM95361v0);
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c != gn80.ARTIST) {
                    ydj.m93454m("banArtistGlobally should only be used with Artist uris ", str);
                    return w2a1Var;
                }
                z4n z4nVar = this.f86324b;
                a0pVar.f11130c = 1;
                objM95361v0 = z4nVar.m95361v0(str, a0pVar);
                yuk yukVar = yuk.f276404a;
                if (objM95361v0 == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM95361v0);
            }
        } catch (Throwable unused) {
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: b */
    public final Object m46364b(String str, String str2, boolean z, f4t0 f4t0Var, ibk ibkVar) {
        b0p b0pVar;
        f4t0 f4t0Var2;
        boolean z2;
        boolean zBooleanValue;
        String str3;
        String str4;
        boolean z3;
        f4t0 f4t0Var3;
        boolean z4;
        boolean z5;
        String str5;
        Object obj;
        boolean z6;
        String str6;
        f4t0 f4t0Var4;
        x3f x3fVar;
        js3 js3Var;
        kp1 kp1Var;
        String str7 = str;
        String str8 = str2;
        if (ibkVar instanceof b0p) {
            b0pVar = (b0p) ibkVar;
            int i = b0pVar.f22061h;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0pVar.f22061h = i - Integer.MIN_VALUE;
            } else {
                b0pVar = new b0p(this, ibkVar);
            }
        } else {
            b0pVar = new b0p(this, ibkVar);
        }
        b0p b0pVar2 = b0pVar;
        Object objM56684z = b0pVar2.f22059f;
        int i2 = b0pVar2.f22061h;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM56684z);
                if (str8.length() <= 0 || wj50.m88271j(str, str2)) {
                    na6.m63957e("banInContext should be used for banning on a given context, if you need a global ban, use banGlobally instead, itemUri " + str7 + ",contextUri: " + str8);
                    return w2a1Var;
                }
                b0pVar2.f22054a = str7;
                b0pVar2.f22055b = str8;
                f4t0Var2 = f4t0Var;
                b0pVar2.f22056c = f4t0Var2;
                z2 = z;
                b0pVar2.f22057d = z2;
                b0pVar2.f22061h = 1;
                objM56684z = kk40.m56684z(new jil(this, str7, str8, fbkVar, 11), b0pVar2);
                if (objM56684z != yukVar) {
                }
                return yukVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        bga.m29073P(objM56684z);
                        return w2a1Var;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM56684z);
                    return w2a1Var;
                }
                z3 = b0pVar2.f22058e;
                z4 = b0pVar2.f22057d;
                f4t0Var3 = b0pVar2.f22056c;
                str4 = b0pVar2.f22055b;
                str3 = b0pVar2.f22054a;
                try {
                    bga.m29073P(objM56684z);
                    obj = (dt8) objM56684z;
                    String str9 = str3;
                    z5 = z3;
                    str5 = str9;
                } catch (Throwable th) {
                    th = th;
                    Object c6x0Var = new c6x0(th);
                    String str10 = str3;
                    z5 = z3;
                    str5 = str10;
                    obj = c6x0Var;
                }
                z6 = z4;
                str6 = str4;
                f4t0Var4 = f4t0Var3;
                if (s6x0.m77348a(obj) != null) {
                    obj = bt8.f30531a;
                }
                Set set = dd41.f47702f;
                gn80 gn80Var = r46.m74726U(str5).f47709c;
                if ((((dt8) obj) instanceof ct8) && gn80Var == gn80.TRACK) {
                    if (z5) {
                        kp1Var = new kp1(8, this, str5, str6, f4t0Var4, (fbk) null);
                        b0pVar2.f22054a = null;
                        b0pVar2.f22055b = null;
                        b0pVar2.f22056c = null;
                        b0pVar2.f22057d = z6;
                        b0pVar2.f22058e = z5;
                        b0pVar2.f22061h = 3;
                        if (x0h1.m89557A(this.f86328f, kp1Var, b0pVar2) == yukVar) {
                            return yukVar;
                        }
                    } else if (z6) {
                        x3fVar = (x3f) this.f86329g.getValue();
                        js3Var = new js3(this, str5, str6, fbkVar, 6);
                        b0pVar2.f22054a = null;
                        b0pVar2.f22055b = null;
                        b0pVar2.f22056c = null;
                        b0pVar2.f22057d = z6;
                        b0pVar2.f22058e = z5;
                        b0pVar2.f22061h = 4;
                        if (x3fVar.m89793f(str6, js3Var, b0pVar2) == yukVar) {
                            return yukVar;
                        }
                    }
                }
                return w2a1Var;
            }
            boolean z7 = b0pVar2.f22057d;
            f4t0 f4t0Var5 = b0pVar2.f22056c;
            String str11 = b0pVar2.f22055b;
            String str12 = b0pVar2.f22054a;
            bga.m29073P(objM56684z);
            z2 = z7;
            f4t0Var2 = f4t0Var5;
            str8 = str11;
            str7 = str12;
            z4n z4nVar = this.f86324b;
            String value = f4t0Var2.getValue();
            b0pVar2.f22054a = str7;
            b0pVar2.f22055b = str8;
            b0pVar2.f22056c = f4t0Var2;
            b0pVar2.f22057d = z2;
            b0pVar2.f22058e = zBooleanValue;
            b0pVar2.f22061h = 2;
            objM56684z = z4nVar.m95352A0(str7, str8, value, b0pVar2);
            if (objM56684z != yukVar) {
                str3 = str7;
                str4 = str8;
                z3 = zBooleanValue;
                f4t0Var3 = f4t0Var2;
                z4 = z2;
                obj = (dt8) objM56684z;
                String str13 = str3;
                z5 = z3;
                str5 = str13;
                z6 = z4;
                str6 = str4;
                f4t0Var4 = f4t0Var3;
                if (s6x0.m77348a(obj) != null) {
                    obj = bt8.f30531a;
                }
                Set set2 = dd41.f47702f;
                gn80 gn80Var2 = r46.m74726U(str5).f47709c;
                if (((dt8) obj) instanceof ct8) {
                    if (z5) {
                        kp1Var = new kp1(8, this, str5, str6, f4t0Var4, (fbk) null);
                        b0pVar2.f22054a = null;
                        b0pVar2.f22055b = null;
                        b0pVar2.f22056c = null;
                        b0pVar2.f22057d = z6;
                        b0pVar2.f22058e = z5;
                        b0pVar2.f22061h = 3;
                        if (x0h1.m89557A(this.f86328f, kp1Var, b0pVar2) == yukVar) {
                        }
                    } else if (z6) {
                        x3fVar = (x3f) this.f86329g.getValue();
                        js3Var = new js3(this, str5, str6, fbkVar, 6);
                        b0pVar2.f22054a = null;
                        b0pVar2.f22055b = null;
                        b0pVar2.f22056c = null;
                        b0pVar2.f22057d = z6;
                        b0pVar2.f22058e = z5;
                        b0pVar2.f22061h = 4;
                        if (x3fVar.m89793f(str6, js3Var, b0pVar2) == yukVar) {
                        }
                    }
                }
                return w2a1Var;
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = str7;
            str4 = str8;
            z3 = zBooleanValue;
            f4t0Var3 = f4t0Var2;
            z4 = z2;
            Object c6x0Var2 = new c6x0(th);
            String str14 = str3;
            z5 = z3;
            str5 = str14;
            obj = c6x0Var2;
        }
        zBooleanValue = ((Boolean) objM56684z).booleanValue();
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m46365c(String str, ibk ibkVar, boolean z) {
        c0p c0pVar;
        Object c6x0Var;
        if (ibkVar instanceof c0p) {
            c0pVar = (c0p) ibkVar;
            int i = c0pVar.f32839d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0pVar.f32839d = i - Integer.MIN_VALUE;
            } else {
                c0pVar = new c0p(this, ibkVar);
            }
        } else {
            c0pVar = new c0p(this, ibkVar);
        }
        Object objM95361v0 = c0pVar.f32837b;
        int i2 = c0pVar.f32839d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM95361v0);
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c != gn80.TRACK) {
                    ydj.m93454m("banTrackGlobally should only be used with Track uris ", str);
                    return w2a1Var;
                }
                z4n z4nVar = this.f86324b;
                c0pVar.f32836a = z;
                c0pVar.f32839d = 1;
                objM95361v0 = z4nVar.m95361v0(str, c0pVar);
                if (objM95361v0 == yukVar) {
                }
                return yukVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM95361v0);
                return w2a1Var;
            }
            z = c0pVar.f32836a;
            bga.m29073P(objM95361v0);
            c6x0Var = (dt8) objM95361v0;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            c6x0Var = bt8.f30531a;
        }
        dt8 dt8Var = (dt8) c6x0Var;
        if (z && !(dt8Var instanceof bt8)) {
            CompletableSubscribeOn completableSubscribeOnM89790c = ((x3f) this.f86329g.getValue()).m89790c();
            c0pVar.f32836a = z;
            c0pVar.f32839d = 2;
            if (zn91.m96565n(completableSubscribeOnM89790c, c0pVar) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m46366d(String str, String str2, ibk ibkVar) {
        d0p d0pVar;
        h0p h0pVar;
        String str3;
        if (ibkVar instanceof d0p) {
            d0pVar = (d0p) ibkVar;
            int i = d0pVar.f44019d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0pVar.f44019d = i - Integer.MIN_VALUE;
            } else {
                d0pVar = new d0p(this, ibkVar);
            }
        } else {
            d0pVar = new d0p(this, ibkVar);
        }
        Object objM56684z = d0pVar.f44017b;
        int i2 = d0pVar.f44019d;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            d0pVar.f44016a = str;
            d0pVar.f44019d = 1;
            h0pVar = this;
            objM56684z = kk40.m56684z(new jil(h0pVar, str, str2, fbkVar, 11), d0pVar);
            if (objM56684z != yukVar) {
                str3 = str;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56684z);
            return objM56684z;
        }
        str3 = d0pVar.f44016a;
        bga.m29073P(objM56684z);
        h0pVar = this;
        if (!((Boolean) objM56684z).booleanValue()) {
            return qyg1.m74178H(false);
        }
        d0pVar.f44016a = null;
        d0pVar.f44019d = 2;
        Object objM95355P0 = h0pVar.f86324b.m95355P0(str3, d0pVar);
        return objM95355P0 == yukVar ? yukVar : objM95355P0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m46367e(String str, ibk ibkVar) {
        e0p e0pVar;
        if (ibkVar instanceof e0p) {
            e0pVar = (e0p) ibkVar;
            int i = e0pVar.f55012c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0pVar.f55012c = i - Integer.MIN_VALUE;
            } else {
                e0pVar = new e0p(this, ibkVar);
            }
        } else {
            e0pVar = new e0p(this, ibkVar);
        }
        Object objM95359Y0 = e0pVar.f55010a;
        int i2 = e0pVar.f55012c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM95359Y0);
                Set set = dd41.f47702f;
                gn80 gn80Var = r46.m74726U(str).f47709c;
                if (gn80Var != gn80.ARTIST && gn80Var != gn80.TRACK) {
                    ydj.m93454m("unBanGlobally should only be used with Artist  or Track uris ", str);
                    return w2a1Var;
                }
                z4n z4nVar = this.f86324b;
                e0pVar.f55012c = 1;
                objM95359Y0 = z4nVar.m95359Y0(str, e0pVar);
                yuk yukVar = yuk.f276404a;
                if (objM95359Y0 == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM95359Y0);
            }
        } catch (Throwable unused) {
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final Object m46368f(String str, String str2, ibk ibkVar) {
        f0p f0pVar;
        String str3;
        String str4;
        String str5;
        String str6;
        if (ibkVar instanceof f0p) {
            f0pVar = (f0p) ibkVar;
            int i = f0pVar.f64694e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0pVar.f64694e = i - Integer.MIN_VALUE;
            } else {
                f0pVar = new f0p(this, ibkVar);
            }
        } else {
            f0pVar = new f0p(this, ibkVar);
        }
        f0p f0pVar2 = f0pVar;
        Object objM56684z = f0pVar2.f64692c;
        int i2 = f0pVar2.f64694e;
        z4n z4nVar = this.f86324b;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            if (str2.length() <= 0 || wj50.m88271j(str, str2)) {
                na6.m63957e("unbanInContext should be used for unbanning on a given context, if you need a global unban, use unbanInContext instead, itemUri " + str + ",contextUri: " + str2);
                return w2a1Var;
            }
            f0pVar2.f64690a = str;
            f0pVar2.f64691b = str2;
            f0pVar2.f64694e = 1;
            if (z4nVar.m95360Z0(str, str2, f0pVar2) != yukVar) {
                str3 = str;
                str4 = str2;
            }
            return yukVar;
        }
        if (i2 == 1) {
            String str7 = f0pVar2.f64691b;
            str3 = f0pVar2.f64690a;
            bga.m29073P(objM56684z);
            str4 = str7;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56684z);
                return w2a1Var;
            }
            str5 = f0pVar2.f64690a;
            bga.m29073P(objM56684z);
            str6 = 0;
        }
        if (((Boolean) objM56684z).booleanValue()) {
            f0pVar2.f64690a = str6;
            f0pVar2.f64691b = str6;
            f0pVar2.f64694e = 3;
            if (z4nVar.m95357S0(str5, f0pVar2) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
        f0pVar2.f64690a = str3;
        f0pVar2.f64691b = null;
        f0pVar2.f64694e = 2;
        fbk fbkVar = null;
        objM56684z = kk40.m56684z(new jil(this, str3, str4, fbkVar, 11), f0pVar2);
        if (objM56684z != yukVar) {
            str5 = str3;
            str6 = fbkVar;
            if (((Boolean) objM56684z).booleanValue()) {
                f0pVar2.f64690a = str6;
                f0pVar2.f64691b = str6;
                f0pVar2.f64694e = 3;
                if (z4nVar.m95357S0(str5, f0pVar2) == yukVar) {
                }
            }
            return w2a1Var;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
    
        r0 = r13;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46369g(String str, ArrayList arrayList, ibk ibkVar) {
        g0p g0pVar;
        Iterator it;
        Set set;
        Set set2;
        String str2;
        String str3;
        String str4;
        Set set3;
        g0p g0pVar2;
        String str5;
        String str6;
        Set set4;
        Iterator it2;
        if (ibkVar instanceof g0p) {
            g0pVar = (g0p) ibkVar;
            int i = g0pVar.f75410h;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0pVar.f75410h = i - Integer.MIN_VALUE;
            } else {
                g0pVar = new g0p(this, ibkVar);
            }
        } else {
            g0pVar = new g0p(this, ibkVar);
        }
        Object objM56684z = g0pVar.f75408f;
        int i2 = g0pVar.f75410h;
        z4n z4nVar = this.f86324b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            it = arrayList.iterator();
            set = linkedHashSet;
            set2 = linkedHashSet2;
            str2 = str;
        } else {
            if (i2 == 1) {
                String str7 = g0pVar.f75407e;
                it = g0pVar.f75406d;
                Set set5 = g0pVar.f75405c;
                set = g0pVar.f75404b;
                String str8 = g0pVar.f75403a;
                bga.m29073P(objM56684z);
                g0pVar2 = g0pVar;
                str6 = str7;
                str5 = str8;
                set3 = set5;
                set4 = set;
                it2 = it;
                if (((dt8) objM56684z) instanceof ct8) {
                    set4.add(str6);
                } else {
                    set3.add(str6);
                }
                g0pVar2.f75403a = str5;
                g0pVar2.f75404b = set4;
                g0pVar2.f75405c = set3;
                g0pVar2.f75406d = it2;
                g0pVar2.f75407e = str6;
                g0pVar2.f75410h = 2;
                objM56684z = kk40.m56684z(new jil(this, str6, str5, fbkVar, 11), g0pVar2);
                if (objM56684z != yukVar) {
                    String str9 = str5;
                    str4 = str6;
                    g0pVar = g0pVar2;
                    set2 = set3;
                    str3 = str9;
                    it = it2;
                    set = set4;
                    if (((Boolean) objM56684z).booleanValue()) {
                        g0pVar.f75403a = str3;
                        g0pVar.f75404b = set;
                        g0pVar.f75405c = set2;
                        g0pVar.f75406d = it;
                        g0pVar.f75407e = null;
                        g0pVar.f75410h = 3;
                        if (z4nVar.m95357S0(str4, g0pVar) != yukVar) {
                            str2 = str3;
                        }
                    } else {
                        str2 = str3;
                    }
                }
                return yukVar;
            }
            if (i2 == 2) {
                str4 = g0pVar.f75407e;
                it = g0pVar.f75406d;
                set2 = g0pVar.f75405c;
                set = g0pVar.f75404b;
                str3 = g0pVar.f75403a;
                bga.m29073P(objM56684z);
                if (((Boolean) objM56684z).booleanValue()) {
                    g0pVar.f75403a = str3;
                    g0pVar.f75404b = set;
                    g0pVar.f75405c = set2;
                    g0pVar.f75406d = it;
                    g0pVar.f75407e = null;
                    g0pVar.f75410h = 3;
                    if (z4nVar.m95357S0(str4, g0pVar) != yukVar) {
                        str2 = str3;
                    }
                    return yukVar;
                }
                str2 = str3;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it3 = g0pVar.f75406d;
                Set set6 = g0pVar.f75405c;
                Set set7 = g0pVar.f75404b;
                String str10 = g0pVar.f75403a;
                bga.m29073P(objM56684z);
                str2 = str10;
                set = set7;
                set2 = set6;
                it = it3;
            }
        }
        while (it.hasNext()) {
            String str11 = (String) it.next();
            if (str2.length() <= 0 && !wj50.m88271j(str11, str2)) {
                g0pVar.getClass();
                g0pVar.f75403a = str2;
                g0pVar.f75404b = set;
                g0pVar.f75405c = set2;
                g0pVar.f75406d = it;
                g0pVar.f75407e = str11;
                g0pVar.f75410h = 1;
                Object objM95360Z0 = z4nVar.m95360Z0(str11, str2, g0pVar);
                if (objM95360Z0 != yukVar) {
                    str5 = str2;
                    objM56684z = objM95360Z0;
                    set3 = set2;
                    g0pVar2 = g0pVar;
                    str6 = str11;
                    set4 = set;
                    it2 = it;
                    if (((dt8) objM56684z) instanceof ct8) {
                        set4.add(str6);
                    } else {
                        set3.add(str6);
                    }
                    g0pVar2.f75403a = str5;
                    g0pVar2.f75404b = set4;
                    g0pVar2.f75405c = set3;
                    g0pVar2.f75406d = it2;
                    g0pVar2.f75407e = str6;
                    g0pVar2.f75410h = 2;
                    objM56684z = kk40.m56684z(new jil(this, str6, str5, fbkVar, 11), g0pVar2);
                    if (objM56684z != yukVar) {
                        String str12 = str5;
                        str4 = str6;
                        g0pVar = g0pVar2;
                        set2 = set3;
                        str3 = str12;
                        it = it2;
                        set = set4;
                        if (((Boolean) objM56684z).booleanValue()) {
                            g0pVar.f75403a = str3;
                            g0pVar.f75404b = set;
                            g0pVar.f75405c = set2;
                            g0pVar.f75406d = it;
                            g0pVar.f75407e = null;
                            g0pVar.f75410h = 3;
                            if (z4nVar.m95357S0(str4, g0pVar) != yukVar) {
                                str2 = str3;
                            }
                        } else {
                            str2 = str3;
                        }
                        while (it.hasNext()) {
                            String str13 = (String) it.next();
                            if (str2.length() <= 0) {
                            }
                        }
                    }
                }
                return yukVar;
            }
            na6.m63957e("unbanInContext should be used for unbanning on a given context, if you need a global unban, use unbanInContext instead, itemUri " + str13 + ",contextUri: " + str2);
            set2.add(str13);
        }
        return new lol0(set, set2);
    }
}
