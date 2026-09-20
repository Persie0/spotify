package p204p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.music.R;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vip0 implements po01 {

    /* JADX INFO: renamed from: a */
    public final bzo f241758a;

    /* JADX INFO: renamed from: b */
    public final yz80 f241759b;

    /* JADX INFO: renamed from: c */
    public final azu0 f241760c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f241761d = new LinkedHashMap();

    public vip0(bzo bzoVar, yz80 yz80Var, fz3 fz3Var, azu0 azu0Var) {
        this.f241758a = bzoVar;
        this.f241759b = yz80Var;
        this.f241760c = azu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ff A[RETURN] */
    @Override // p204p.po01
    /* JADX INFO: renamed from: a */
    public final Object mo45982a(dwv dwvVar, fq01 fq01Var, List list, Uri uri, fbk fbkVar) throws Throwable {
        uip0 uip0Var;
        lu01 lu01Var;
        LinkedHashMap linkedHashMap;
        mrp0 mrp0Var;
        boolean z;
        dwv dwvVar2;
        fq01 fq01Var2;
        List list2;
        String str;
        lnn0 lnn0Var;
        Uri uri2;
        mrp0 mrp0Var2;
        boolean z2;
        lnn0 lnn0Var2;
        LinkedHashMap linkedHashMap2;
        String str2;
        Uri uri3;
        String str3;
        awv awvVar;
        icr0 icr0Var;
        gcr0 gcr0VarM27347j;
        Object objMo34037c;
        String strMo57171h;
        String strMo57170g;
        azu0 azu0Var;
        Integer numValueOf;
        int i;
        String string;
        if (fbkVar instanceof uip0) {
            uip0Var = (uip0) fbkVar;
            int i2 = uip0Var.f230780Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uip0Var.f230780Y = i2 - Integer.MIN_VALUE;
            } else {
                uip0Var = new uip0(this, (ibk) fbkVar);
            }
        } else {
            uip0Var = new uip0(this, (ibk) fbkVar);
        }
        uip0 uip0Var2 = uip0Var;
        Object obj = uip0Var2.f230790t;
        int i3 = uip0Var2.f230780Y;
        LinkedHashMap linkedHashMap3 = this.f241761d;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj);
            lu01Var = dwvVar.mo27345c().f213201a.f201918a;
            linkedHashMap = new LinkedHashMap(dwvVar.mo27345c().f213201a.f201918a.f136948c);
            dwvVar.mo27345c().f213201a.f201918a.getClass();
            mrp0Var = dwvVar instanceof awv ? ((awv) dwvVar).f20711e : ((hwv) dwvVar.mo27345c().m78984g()).f96062g;
            if (mrp0Var == null) {
                throw new IllegalArgumentException("playlistSharingConfiguration is required when providing share data for a playlist");
            }
            z = (mrp0Var instanceof krp0) && ((krp0) mrp0Var).f125705d;
            lnn0 lnn0Var3 = lnn0.f135185d;
            lnn0 lnn0Var4 = z ? lnn0.f135187f : lnn0Var3;
            lnn0 lnn0VarMo57169c = mrp0Var.mo57169c();
            if (!lnn0Var4.m59500b() || !lnn0VarMo57169c.m59500b()) {
                if (lnn0Var4 == lnn0Var3) {
                    lnn0VarMo57169c.getClass();
                    if (lnn0VarMo57169c != lnn0Var3 && !lnn0VarMo57169c.m59500b()) {
                    }
                    return yukVar;
                }
                String str4 = (String) linkedHashMap3.get(lnn0Var4);
                if (str4 == null) {
                    String str5 = lu01Var.f136946a;
                    long j = wnn0.f253226a;
                    uip0Var2.f230781a = dwvVar;
                    uip0Var2.f230782b = fq01Var;
                    uip0Var2.f230783c = list;
                    uip0Var2.f230784d = uri;
                    uip0Var2.f230785e = lu01Var;
                    uip0Var2.f230786f = linkedHashMap;
                    uip0Var2.f230787g = mrp0Var;
                    uip0Var2.f230788h = lnn0Var4;
                    uip0Var2.f230789i = z;
                    uip0Var2.f230780Y = 1;
                    n090 n090Var = (n090) this.f241759b;
                    lnn0 lnn0Var5 = lnn0Var4;
                    Object objM89557A = x0h1.m89557A(n090Var.f148946c, new d37(j, lnn0Var5, n090Var, str5, (fbk) null, 7), uip0Var2);
                    if (objM89557A != yukVar) {
                        dwvVar2 = dwvVar;
                        fq01Var2 = fq01Var;
                        mrp0Var2 = mrp0Var;
                        list2 = list;
                        uri2 = uri;
                        obj = objM89557A;
                        z2 = z;
                        lnn0Var2 = lnn0Var5;
                    }
                } else {
                    lnn0 lnn0Var6 = lnn0Var4;
                    dwvVar2 = dwvVar;
                    fq01Var2 = fq01Var;
                    list2 = list;
                    str = str4;
                    lnn0Var = lnn0Var6;
                    uri2 = uri;
                    if (str != null || str.length() == 0) {
                        throw new IllegalArgumentException("Generated permission token is null or empty");
                    }
                    linkedHashMap3.put(lnn0Var, str);
                    str2 = str;
                    linkedHashMap2 = linkedHashMap;
                    uri3 = uri2;
                    if (str2 != null) {
                        linkedHashMap2.put("pt", str2);
                    }
                    str3 = lu01Var.f136950e;
                    if (str3 == null) {
                        strMo57171h = mrp0Var.mo57171h();
                        strMo57170g = mrp0Var.mo57170g();
                        if (str2 == null) {
                            str2 = "";
                        }
                        azu0Var = this.f241760c;
                        if (((w300) ((v300) azu0Var.f21691c)).m87094a(strMo57170g) == u300.ALBUM) {
                            numValueOf = Integer.valueOf(R.string.playlist_share_message_inviting_to_album);
                        } else if (strMo57170g == null && strMo57170g.length() != 0) {
                            numValueOf = Integer.valueOf(R.string.playlist_share_message_inviting_to_spotify_playlist);
                        } else if (str2.length() > 0) {
                            if (z) {
                                i = R.string.playlist_share_message_inviting_contributor;
                            } else {
                                i = R.string.playlist_share_message_inviting_viewer;
                            }
                            numValueOf = Integer.valueOf(i);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            string = ((Activity) azu0Var.f21690b).getString(numValueOf.intValue(), strMo57171h);
                        } else {
                            string = null;
                        }
                        str3 = string;
                    }
                    lu01 lu01VarM59923c = lu01.m59923c(lu01Var, null, opo.m67547D(linkedHashMap2), str3, Error.TOO_YOUNG_FIELD_NUMBER);
                    if (dwvVar2 instanceof awv) {
                        awvVar = (awv) dwvVar2;
                    } else {
                        awvVar = null;
                    }
                    x2r x2rVarM31048c = this.f241758a.m31048c(fq01Var2, list2, new f2r(3));
                    if (awvVar != null) {
                        icr0Var = awvVar.f20712f;
                    } else {
                        icr0Var = null;
                    }
                    if (awvVar != null) {
                        gcr0VarM27347j = awvVar.m27347j();
                    } else {
                        gcr0VarM27347j = null;
                    }
                    uip0Var2.f230781a = null;
                    uip0Var2.f230782b = null;
                    uip0Var2.f230783c = null;
                    uip0Var2.f230784d = null;
                    uip0Var2.f230785e = null;
                    uip0Var2.f230786f = null;
                    uip0Var2.f230787g = null;
                    uip0Var2.f230788h = null;
                    uip0Var2.f230789i = z;
                    uip0Var2.f230780Y = 2;
                    objMo34037c = x2rVarM31048c.mo34037c(lu01VarM59923c, icr0Var, gcr0VarM27347j, uri3, uip0Var2);
                    if (objMo34037c != yukVar) {
                        return objMo34037c;
                    }
                }
                return yukVar;
            }
            fq01Var2 = fq01Var;
            list2 = list;
            dwvVar2 = dwvVar;
            linkedHashMap2 = linkedHashMap;
            str2 = null;
            uri3 = uri;
            if (str2 != null) {
                linkedHashMap2.put("pt", str2);
            }
            str3 = lu01Var.f136950e;
            if (str3 == null) {
                strMo57171h = mrp0Var.mo57171h();
                strMo57170g = mrp0Var.mo57170g();
                if (str2 == null) {
                    str2 = "";
                }
                azu0Var = this.f241760c;
                if (((w300) ((v300) azu0Var.f21691c)).m87094a(strMo57170g) == u300.ALBUM) {
                    numValueOf = Integer.valueOf(R.string.playlist_share_message_inviting_to_album);
                } else if (strMo57170g == null) {
                    if (str2.length() > 0) {
                        if (z) {
                            i = R.string.playlist_share_message_inviting_contributor;
                        } else {
                            i = R.string.playlist_share_message_inviting_viewer;
                        }
                        numValueOf = Integer.valueOf(i);
                    } else {
                        numValueOf = null;
                    }
                } else if (str2.length() > 0) {
                    if (z) {
                        i = R.string.playlist_share_message_inviting_contributor;
                    } else {
                        i = R.string.playlist_share_message_inviting_viewer;
                    }
                    numValueOf = Integer.valueOf(i);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    string = ((Activity) azu0Var.f21690b).getString(numValueOf.intValue(), strMo57171h);
                } else {
                    string = null;
                }
                str3 = string;
            }
            lu01 lu01VarM59923c2 = lu01.m59923c(lu01Var, null, opo.m67547D(linkedHashMap2), str3, Error.TOO_YOUNG_FIELD_NUMBER);
            if (dwvVar2 instanceof awv) {
                awvVar = (awv) dwvVar2;
            } else {
                awvVar = null;
            }
            x2r x2rVarM31048c2 = this.f241758a.m31048c(fq01Var2, list2, new f2r(3));
            if (awvVar != null) {
                icr0Var = awvVar.f20712f;
            } else {
                icr0Var = null;
            }
            if (awvVar != null) {
                gcr0VarM27347j = awvVar.m27347j();
            } else {
                gcr0VarM27347j = null;
            }
            uip0Var2.f230781a = null;
            uip0Var2.f230782b = null;
            uip0Var2.f230783c = null;
            uip0Var2.f230784d = null;
            uip0Var2.f230785e = null;
            uip0Var2.f230786f = null;
            uip0Var2.f230787g = null;
            uip0Var2.f230788h = null;
            uip0Var2.f230789i = z;
            uip0Var2.f230780Y = 2;
            objMo34037c = x2rVarM31048c2.mo34037c(lu01VarM59923c2, icr0Var, gcr0VarM27347j, uri3, uip0Var2);
            if (objMo34037c != yukVar) {
                return yukVar;
            }
            return objMo34037c;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        z2 = uip0Var2.f230789i;
        lnn0Var2 = uip0Var2.f230788h;
        mrp0Var2 = uip0Var2.f230787g;
        linkedHashMap = uip0Var2.f230786f;
        lu01Var = uip0Var2.f230785e;
        uri2 = uip0Var2.f230784d;
        list2 = uip0Var2.f230783c;
        fq01Var2 = uip0Var2.f230782b;
        dwvVar2 = uip0Var2.f230781a;
        bga.m29073P(obj);
        lnn0Var = lnn0Var2;
        z = z2;
        str = ((sz80) ((p2x0) obj).m68971d()).f215425a;
        mrp0Var = mrp0Var2;
        if (str != null) {
        }
        throw new IllegalArgumentException("Generated permission token is null or empty");
    }
}
