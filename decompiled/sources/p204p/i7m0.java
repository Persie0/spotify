package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i7m0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f99590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vdm f99591c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f99592d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f99593e;

    public i7m0(niz nizVar, vdm vdmVar, int i, String str) {
        this.f99589a = 5;
        this.f99590b = nizVar;
        this.f99591c = vdmVar;
        this.f99593e = i;
        this.f99592d = str;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x023c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0288  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:182:0x0320  */
    /* JADX WARN: Code duplicated, block: B:199:0x036c  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:233:0x0404  */
    /* JADX WARN: Code duplicated, block: B:250:0x0450  */
    /* JADX WARN: Code duplicated, block: B:267:0x049c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:301:0x0534  */
    /* JADX WARN: Code duplicated, block: B:318:0x0580  */
    /* JADX WARN: Code duplicated, block: B:335:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:352:0x0618  */
    /* JADX WARN: Code duplicated, block: B:370:0x0675  */
    /* JADX WARN: Code duplicated, block: B:401:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        h7m0 h7m0Var;
        k7m0 k7m0Var;
        List listM43697K0;
        List list;
        cbf0 cbf0VarM35556a;
        v140 v140Var;
        cbf0 cbf0VarM35556a2;
        r7m0 r7m0Var;
        t7m0 t7m0Var;
        v7m0 v7m0Var;
        y7m0 y7m0Var;
        b8m0 b8m0Var;
        c8m0 c8m0Var;
        e8m0 e8m0Var;
        g8m0 g8m0Var;
        i8m0 i8m0Var;
        k8m0 k8m0Var;
        m8m0 m8m0Var;
        n8m0 n8m0Var;
        o8m0 o8m0Var;
        p8m0 p8m0Var;
        s8m0 s8m0Var;
        t8m0 t8m0Var;
        Object objSingletonList;
        cbf0 cbf0VarM35556a3;
        y8m0 y8m0Var;
        z8m0 z8m0Var;
        a9m0 a9m0Var;
        switch (this.f99589a) {
            case 0:
                if (fbkVar instanceof h7m0) {
                    h7m0Var = (h7m0) fbkVar;
                    int i = h7m0Var.f88491b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h7m0Var.f88491b = i - Integer.MIN_VALUE;
                    } else {
                        h7m0Var = new h7m0(this, fbkVar);
                    }
                } else {
                    h7m0Var = new h7m0(this, fbkVar);
                }
                Object obj2 = h7m0Var.f88490a;
                int i2 = h7m0Var.f88491b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    List listM85235a = vdm.m85235a(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    h7m0Var.f88491b = 1;
                    Object objEmit = this.f99590b.emit(listM85235a, h7m0Var);
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
                if (fbkVar instanceof k7m0) {
                    k7m0Var = (k7m0) fbkVar;
                    int i3 = k7m0Var.f120163b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k7m0Var.f120163b = i3 - Integer.MIN_VALUE;
                    } else {
                        k7m0Var = new k7m0(this, fbkVar);
                    }
                } else {
                    k7m0Var = new k7m0(this, fbkVar);
                }
                Object obj3 = k7m0Var.f120162a;
                int i4 = k7m0Var.f120163b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    ebf0 ebf0Var = (ebf0) obj;
                    vdm vdmVar = this.f99591c;
                    s44 s44Var = (s44) vdmVar.f240427i;
                    String str = this.f99592d;
                    dbf0 dbf0VarM38368c = ebf0Var.m38368c(n3a1.class, str);
                    String str2 = null;
                    n3a1 n3a1Var = (dbf0VarM38368c == null || (cbf0VarM35556a2 = dbf0VarM38368c.m35556a()) == null) ? null : (n3a1) cbf0VarM35556a2.f36107a;
                    boolean zM77174p = s44Var.m77174p();
                    List listSingletonList = lau.f131415a;
                    if (zM77174p) {
                        if (n3a1Var != null) {
                            listM43697K0 = g6f.m43697K0(g6f.m43700N0(n3a1Var.f149986a, n3a1Var.f149988c), g6f.m43736n1(n3a1Var.f149987b));
                            list = listM43697K0;
                        } else {
                            list = listSingletonList;
                        }
                    } else if (n3a1Var != null) {
                        listM43697K0 = g6f.m43697K0(n3a1Var.f149986a, n3a1Var.f149987b);
                        list = listM43697K0;
                    } else {
                        list = listSingletonList;
                    }
                    if (s44Var.m77171m() && n3a1Var != null && !list.isEmpty()) {
                        dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(v140.class, str);
                        if (dbf0VarM38368c2 != null && (cbf0VarM35556a = dbf0VarM38368c2.m35556a()) != null && (v140Var = (v140) cbf0VarM35556a.f36107a) != null) {
                            str2 = v140Var.f236243a;
                        }
                        listSingletonList = Collections.singletonList(vdmVar.m85259y(this.f99593e, "unmapped-video-preview-artist-page", str, ((Context) vdmVar.f240421c).getString(R.string.unmapped_music_videos_section_title, str2), "spotify:list:artist-music-videos:unmapped-".concat(wl51.m88482f1(':', str, str)), list, list.size() >= 10));
                    }
                    k7m0Var.f120163b = 1;
                    Object objEmit2 = this.f99590b.emit(listSingletonList, k7m0Var);
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
                if (fbkVar instanceof r7m0) {
                    r7m0Var = (r7m0) fbkVar;
                    int i5 = r7m0Var.f196609b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        r7m0Var.f196609b = i5 - Integer.MIN_VALUE;
                    } else {
                        r7m0Var = new r7m0(this, fbkVar);
                    }
                } else {
                    r7m0Var = new r7m0(this, fbkVar);
                }
                Object obj4 = r7m0Var.f196608a;
                int i6 = r7m0Var.f196609b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    List listM85248n = vdm.m85248n(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    r7m0Var.f196609b = 1;
                    Object objEmit3 = this.f99590b.emit(listM85248n, r7m0Var);
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
                if (fbkVar instanceof t7m0) {
                    t7m0Var = (t7m0) fbkVar;
                    int i7 = t7m0Var.f217854b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        t7m0Var.f217854b = i7 - Integer.MIN_VALUE;
                    } else {
                        t7m0Var = new t7m0(this, fbkVar);
                    }
                } else {
                    t7m0Var = new t7m0(this, fbkVar);
                }
                Object obj5 = t7m0Var.f217853a;
                int i8 = t7m0Var.f217854b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    List listM85250p = vdm.m85250p(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    t7m0Var.f217854b = 1;
                    Object objEmit4 = this.f99590b.emit(listM85250p, t7m0Var);
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
                if (fbkVar instanceof v7m0) {
                    v7m0Var = (v7m0) fbkVar;
                    int i9 = v7m0Var.f238281b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        v7m0Var.f238281b = i9 - Integer.MIN_VALUE;
                    } else {
                        v7m0Var = new v7m0(this, fbkVar);
                    }
                } else {
                    v7m0Var = new v7m0(this, fbkVar);
                }
                Object obj6 = v7m0Var.f238280a;
                int i10 = v7m0Var.f238281b;
                if (i10 == 0) {
                    bga.m29073P(obj6);
                    List listM85236b = vdm.m85236b(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    v7m0Var.f238281b = 1;
                    Object objEmit5 = this.f99590b.emit(listM85236b, v7m0Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof y7m0) {
                    y7m0Var = (y7m0) fbkVar;
                    int i11 = y7m0Var.f270111b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        y7m0Var.f270111b = i11 - Integer.MIN_VALUE;
                    } else {
                        y7m0Var = new y7m0(this, fbkVar);
                    }
                } else {
                    y7m0Var = new y7m0(this, fbkVar);
                }
                Object obj7 = y7m0Var.f270110a;
                int i12 = y7m0Var.f270111b;
                if (i12 == 0) {
                    bga.m29073P(obj7);
                    List listM85242h = vdm.m85242h(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    y7m0Var.f270111b = 1;
                    Object objEmit6 = this.f99590b.emit(listM85242h, y7m0Var);
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
                if (fbkVar instanceof b8m0) {
                    b8m0Var = (b8m0) fbkVar;
                    int i13 = b8m0Var.f24621b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        b8m0Var.f24621b = i13 - Integer.MIN_VALUE;
                    } else {
                        b8m0Var = new b8m0(this, fbkVar);
                    }
                } else {
                    b8m0Var = new b8m0(this, fbkVar);
                }
                Object obj8 = b8m0Var.f24620a;
                int i14 = b8m0Var.f24621b;
                if (i14 == 0) {
                    bga.m29073P(obj8);
                    List listM85253s = vdm.m85253s(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    b8m0Var.f24621b = 1;
                    Object objEmit7 = this.f99590b.emit(listM85253s, b8m0Var);
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
                if (fbkVar instanceof c8m0) {
                    c8m0Var = (c8m0) fbkVar;
                    int i15 = c8m0Var.f35277b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c8m0Var.f35277b = i15 - Integer.MIN_VALUE;
                    } else {
                        c8m0Var = new c8m0(this, fbkVar);
                    }
                } else {
                    c8m0Var = new c8m0(this, fbkVar);
                }
                Object obj9 = c8m0Var.f35276a;
                int i16 = c8m0Var.f35277b;
                if (i16 == 0) {
                    bga.m29073P(obj9);
                    List listM85241g = vdm.m85241g(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    c8m0Var.f35277b = 1;
                    Object objEmit8 = this.f99590b.emit(listM85241g, c8m0Var);
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
                if (fbkVar instanceof e8m0) {
                    e8m0Var = (e8m0) fbkVar;
                    int i17 = e8m0Var.f57230b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        e8m0Var.f57230b = i17 - Integer.MIN_VALUE;
                    } else {
                        e8m0Var = new e8m0(this, fbkVar);
                    }
                } else {
                    e8m0Var = new e8m0(this, fbkVar);
                }
                Object obj10 = e8m0Var.f57229a;
                int i18 = e8m0Var.f57230b;
                if (i18 == 0) {
                    bga.m29073P(obj10);
                    List listM85240f = vdm.m85240f(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    e8m0Var.f57230b = 1;
                    Object objEmit9 = this.f99590b.emit(listM85240f, e8m0Var);
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
                if (fbkVar instanceof g8m0) {
                    g8m0Var = (g8m0) fbkVar;
                    int i19 = g8m0Var.f77556b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        g8m0Var.f77556b = i19 - Integer.MIN_VALUE;
                    } else {
                        g8m0Var = new g8m0(this, fbkVar);
                    }
                } else {
                    g8m0Var = new g8m0(this, fbkVar);
                }
                Object obj11 = g8m0Var.f77555a;
                int i20 = g8m0Var.f77556b;
                if (i20 == 0) {
                    bga.m29073P(obj11);
                    List listM85243i = vdm.m85243i(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    g8m0Var.f77556b = 1;
                    Object objEmit10 = this.f99590b.emit(listM85243i, g8m0Var);
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
                if (fbkVar instanceof i8m0) {
                    i8m0Var = (i8m0) fbkVar;
                    int i21 = i8m0Var.f99810b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        i8m0Var.f99810b = i21 - Integer.MIN_VALUE;
                    } else {
                        i8m0Var = new i8m0(this, fbkVar);
                    }
                } else {
                    i8m0Var = new i8m0(this, fbkVar);
                }
                Object obj12 = i8m0Var.f99809a;
                int i22 = i8m0Var.f99810b;
                if (i22 == 0) {
                    bga.m29073P(obj12);
                    List listM85255u = vdm.m85255u(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    i8m0Var.f99810b = 1;
                    Object objEmit11 = this.f99590b.emit(listM85255u, i8m0Var);
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
                if (fbkVar instanceof k8m0) {
                    k8m0Var = (k8m0) fbkVar;
                    int i23 = k8m0Var.f120390b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        k8m0Var.f120390b = i23 - Integer.MIN_VALUE;
                    } else {
                        k8m0Var = new k8m0(this, fbkVar);
                    }
                } else {
                    k8m0Var = new k8m0(this, fbkVar);
                }
                Object obj13 = k8m0Var.f120389a;
                int i24 = k8m0Var.f120390b;
                if (i24 == 0) {
                    bga.m29073P(obj13);
                    List listM85254t = vdm.m85254t(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    k8m0Var.f120390b = 1;
                    Object objEmit12 = this.f99590b.emit(listM85254t, k8m0Var);
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
                if (fbkVar instanceof m8m0) {
                    m8m0Var = (m8m0) fbkVar;
                    int i25 = m8m0Var.f141095b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        m8m0Var.f141095b = i25 - Integer.MIN_VALUE;
                    } else {
                        m8m0Var = new m8m0(this, fbkVar);
                    }
                } else {
                    m8m0Var = new m8m0(this, fbkVar);
                }
                Object obj14 = m8m0Var.f141094a;
                int i26 = m8m0Var.f141095b;
                if (i26 == 0) {
                    bga.m29073P(obj14);
                    List listM85246l = vdm.m85246l(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    m8m0Var.f141095b = 1;
                    Object objEmit13 = this.f99590b.emit(listM85246l, m8m0Var);
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
                if (fbkVar instanceof n8m0) {
                    n8m0Var = (n8m0) fbkVar;
                    int i27 = n8m0Var.f151564b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        n8m0Var.f151564b = i27 - Integer.MIN_VALUE;
                    } else {
                        n8m0Var = new n8m0(this, fbkVar);
                    }
                } else {
                    n8m0Var = new n8m0(this, fbkVar);
                }
                Object obj15 = n8m0Var.f151563a;
                int i28 = n8m0Var.f151564b;
                if (i28 == 0) {
                    bga.m29073P(obj15);
                    List listM85247m = vdm.m85247m(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    n8m0Var.f151564b = 1;
                    Object objEmit14 = this.f99590b.emit(listM85247m, n8m0Var);
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
                if (fbkVar instanceof o8m0) {
                    o8m0Var = (o8m0) fbkVar;
                    int i29 = o8m0Var.f162833b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        o8m0Var.f162833b = i29 - Integer.MIN_VALUE;
                    } else {
                        o8m0Var = new o8m0(this, fbkVar);
                    }
                } else {
                    o8m0Var = new o8m0(this, fbkVar);
                }
                Object obj16 = o8m0Var.f162832a;
                int i30 = o8m0Var.f162833b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    List listM85251q = vdm.m85251q(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    o8m0Var.f162833b = 1;
                    Object objEmit15 = this.f99590b.emit(listM85251q, o8m0Var);
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
                if (fbkVar instanceof p8m0) {
                    p8m0Var = (p8m0) fbkVar;
                    int i31 = p8m0Var.f175004b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        p8m0Var.f175004b = i31 - Integer.MIN_VALUE;
                    } else {
                        p8m0Var = new p8m0(this, fbkVar);
                    }
                } else {
                    p8m0Var = new p8m0(this, fbkVar);
                }
                Object obj17 = p8m0Var.f175003a;
                int i32 = p8m0Var.f175004b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    List listM85252r = vdm.m85252r(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    p8m0Var.f175004b = 1;
                    Object objEmit16 = this.f99590b.emit(listM85252r, p8m0Var);
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
                if (fbkVar instanceof s8m0) {
                    s8m0Var = (s8m0) fbkVar;
                    int i33 = s8m0Var.f206683b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        s8m0Var.f206683b = i33 - Integer.MIN_VALUE;
                    } else {
                        s8m0Var = new s8m0(this, fbkVar);
                    }
                } else {
                    s8m0Var = new s8m0(this, fbkVar);
                }
                Object obj18 = s8m0Var.f206682a;
                int i34 = s8m0Var.f206683b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    List listM85245k = vdm.m85245k(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    s8m0Var.f206683b = 1;
                    Object objEmit17 = this.f99590b.emit(listM85245k, s8m0Var);
                    yuk yukVar17 = yuk.f276404a;
                    if (objEmit17 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1.f247311a;
            case 17:
                if (fbkVar instanceof t8m0) {
                    t8m0Var = (t8m0) fbkVar;
                    int i35 = t8m0Var.f218110b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        t8m0Var.f218110b = i35 - Integer.MIN_VALUE;
                    } else {
                        t8m0Var = new t8m0(this, fbkVar);
                    }
                } else {
                    t8m0Var = new t8m0(this, fbkVar);
                }
                Object obj19 = t8m0Var.f218109a;
                int i36 = t8m0Var.f218110b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    String str3 = this.f99592d;
                    dbf0 dbf0VarM38368c3 = ((ebf0) obj).m38368c(v06.class, str3);
                    v06 v06Var = (dbf0VarM38368c3 == null || (cbf0VarM35556a3 = dbf0VarM38368c3.m35556a()) == null) ? null : (v06) cbf0VarM35556a3.f36107a;
                    if (v06Var != null) {
                        List list2 = v06Var.f235924a;
                        if (list2.isEmpty()) {
                            objSingletonList = lau.f131415a;
                        } else {
                            objSingletonList = Collections.singletonList(new cjm0(str3, ((Context) this.f99591c.f240421c).getString(R.string.music_videos_section_title), list2.size() >= 10 ? "spotify:list:artist-music-videos:".concat(wl51.m88482f1(':', str3, str3)) : null, v06Var.f235924a, new gkm0(Integer.valueOf(this.f99593e), null, 2)));
                        }
                    } else {
                        objSingletonList = lau.f131415a;
                    }
                    t8m0Var.f218110b = 1;
                    Object objEmit18 = this.f99590b.emit(objSingletonList, t8m0Var);
                    yuk yukVar18 = yuk.f276404a;
                    if (objEmit18 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1.f247311a;
            case 18:
                if (fbkVar instanceof y8m0) {
                    y8m0Var = (y8m0) fbkVar;
                    int i37 = y8m0Var.f270318b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        y8m0Var.f270318b = i37 - Integer.MIN_VALUE;
                    } else {
                        y8m0Var = new y8m0(this, fbkVar);
                    }
                } else {
                    y8m0Var = new y8m0(this, fbkVar);
                }
                Object obj20 = y8m0Var.f270317a;
                int i38 = y8m0Var.f270318b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    List listM85237c = vdm.m85237c(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    y8m0Var.f270318b = 1;
                    Object objEmit19 = this.f99590b.emit(listM85237c, y8m0Var);
                    yuk yukVar19 = yuk.f276404a;
                    if (objEmit19 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1.f247311a;
            case 19:
                if (fbkVar instanceof z8m0) {
                    z8m0Var = (z8m0) fbkVar;
                    int i39 = z8m0Var.f280499b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        z8m0Var.f280499b = i39 - Integer.MIN_VALUE;
                    } else {
                        z8m0Var = new z8m0(this, fbkVar);
                    }
                } else {
                    z8m0Var = new z8m0(this, fbkVar);
                }
                Object obj21 = z8m0Var.f280498a;
                int i40 = z8m0Var.f280499b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    List listM85238d = vdm.m85238d(this.f99593e, this.f99592d, this.f99591c, (ebf0) obj);
                    z8m0Var.f280499b = 1;
                    Object objEmit20 = this.f99590b.emit(listM85238d, z8m0Var);
                    yuk yukVar20 = yuk.f276404a;
                    if (objEmit20 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof a9m0) {
                    a9m0Var = (a9m0) fbkVar;
                    int i41 = a9m0Var.f13601b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        a9m0Var.f13601b = i41 - Integer.MIN_VALUE;
                    } else {
                        a9m0Var = new a9m0(this, fbkVar);
                    }
                } else {
                    a9m0Var = new a9m0(this, fbkVar);
                }
                Object obj22 = a9m0Var.f13600a;
                int i42 = a9m0Var.f13601b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    List listM85258x = this.f99591c.m85258x(this.f99592d, (e7m0) obj, this.f99593e);
                    a9m0Var.f13601b = 1;
                    Object objEmit21 = this.f99590b.emit(listM85258x, a9m0Var);
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
        }
    }

    public /* synthetic */ i7m0(niz nizVar, vdm vdmVar, String str, int i, int i2) {
        this.f99589a = i2;
        this.f99590b = nizVar;
        this.f99591c = vdmVar;
        this.f99592d = str;
        this.f99593e = i;
    }
}
