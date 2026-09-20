package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class oko0 {

    /* JADX INFO: renamed from: a */
    public final uzx f166423a;

    /* JADX INFO: renamed from: b */
    public final PlayOrigin f166424b;

    /* JADX INFO: renamed from: c */
    public final int f166425c;

    /* JADX INFO: renamed from: d */
    public final e9d0 f166426d;

    /* JADX INFO: renamed from: e */
    public final myx f166427e;

    /* JADX INFO: renamed from: f */
    public final i05 f166428f;

    /* JADX INFO: renamed from: g */
    public final djs0 f166429g;

    public oko0(uzx uzxVar, PlayOrigin playOrigin, int i, e9d0 e9d0Var, myx myxVar, i05 i05Var, djs0 djs0Var) {
        this.f166423a = uzxVar;
        this.f166424b = playOrigin;
        this.f166425c = i;
        this.f166426d = e9d0Var;
        this.f166427e = myxVar;
        this.f166428f = i05Var;
        this.f166429g = djs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (p204p.zn91.m96565n(r5, r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m67256a(oko0 oko0Var, ExternalAccessoryDescription externalAccessoryDescription, ibk ibkVar) {
        mko0 mko0Var;
        oko0Var.getClass();
        if (ibkVar instanceof mko0) {
            mko0Var = (mko0) ibkVar;
            int i = mko0Var.f144619c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mko0Var.f144619c = i - Integer.MIN_VALUE;
            } else {
                mko0Var = new mko0(oko0Var, ibkVar);
            }
        } else {
            mko0Var = new mko0(oko0Var, ibkVar);
        }
        Object objM96567o = mko0Var.f144617a;
        int i2 = mko0Var.f144619c;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96567o);
        myx myxVar = oko0Var.f166427e;
        Single singleM63214p = myx.m63214p(myxVar, externalAccessoryDescription, myxVar.f148555h.m38290k());
        mko0Var.f144619c = 1;
        objM96567o = zn91.m96567o(singleM63214p, mko0Var);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        LoggingParams loggingParamsBuild = LoggingParams.builder().interactionId(((z650) objM96567o).f279709a).build();
        xzx xzxVar = oko0Var.f166423a.f235651a.f246568h;
        PlayOrigin playOrigin = oko0Var.f166424b;
        wj50.m88279p(loggingParamsBuild);
        Completable completableIgnoreElement = ((c0y) xzxVar).m31197f(playOrigin, loggingParamsBuild).ignoreElement();
        mko0Var.f144619c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0179 A[Catch: Exception -> 0x01d7, TryCatch #4 {Exception -> 0x01d7, blocks: (B:64:0x01ac, B:57:0x015f, B:59:0x0179, B:61:0x0195, B:60:0x0191), top: B:95:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0191 A[Catch: Exception -> 0x01d7, TryCatch #4 {Exception -> 0x01d7, blocks: (B:64:0x01ac, B:57:0x015f, B:59:0x0179, B:61:0x0195, B:60:0x0191), top: B:95:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a9, code lost:
    
        if (r2 == r9) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m67257b(oko0 oko0Var, String str, ExternalAccessoryDescription externalAccessoryDescription, ibk ibkVar) throws Exception {
        nko0 nko0Var;
        String str2;
        ye30 ye30Var;
        yuk yukVar;
        String str3;
        String str4;
        ye30 ye30Var2;
        ye30 ye30Var3;
        ExternalAccessoryDescription externalAccessoryDescription2;
        String str5;
        z650 z650Var;
        PlayOrigin playOriginBuild;
        wzx wzxVar;
        int i;
        c0y c0yVar;
        String strM85744y;
        Single singleM31196e;
        ExternalAccessoryDescription externalAccessoryDescription3 = externalAccessoryDescription;
        oko0Var.getClass();
        if (ibkVar instanceof nko0) {
            nko0Var = (nko0) ibkVar;
            int i2 = nko0Var.f154912h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nko0Var.f154912h = i2 - Integer.MIN_VALUE;
            } else {
                nko0Var = new nko0(oko0Var, ibkVar);
            }
        } else {
            nko0Var = new nko0(oko0Var, ibkVar);
        }
        nko0 nko0Var2 = nko0Var;
        Object objM96567o = nko0Var2.f154910f;
        ye30 ye30Var4 = nko0Var2.f154912h;
        int i3 = 2;
        yuk yukVar2 = yuk.f276404a;
        try {
            try {
                if (ye30Var4 == 0) {
                    bga.m29073P(objM96567o);
                    ye30 ye30VarM36217a = oko0Var.f166429g.m36217a();
                    String str6 = externalAccessoryDescription3.senderId;
                    int i4 = oko0Var.f166425c;
                    sr4 sr4Var = ye30VarM36217a.f271912a;
                    if (str6 == null) {
                        str6 = "unknown";
                    }
                    sr4Var.m79014b("package_name", str6);
                    sr4Var.m79019k("mbs_play_from_search", null, (4 & 4) != 0);
                    int iM38547C = edb.m38547C(i4);
                    if (iM38547C == 0) {
                        str2 = "media1";
                    } else {
                        if (iM38547C != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "media3";
                    }
                    sr4Var.m79013a("media_session_version", str2);
                    try {
                        String string = new gf41(df41.SEARCH, str, 0).toString();
                        try {
                            ye30Var = ye30VarM36217a;
                            yukVar = yukVar2;
                            try {
                                Single singleM63213e = myx.m63213e(oko0Var.f166427e, externalAccessoryDescription3, string, null, null, 28);
                                nko0Var2.f154905a = str;
                                nko0Var2.f154906b = externalAccessoryDescription3;
                                nko0Var2.f154907c = ye30Var;
                                nko0Var2.f154908d = string;
                                nko0Var2.f154912h = 1;
                                objM96567o = zn91.m96567o(singleM63213e, nko0Var2);
                                if (objM96567o != yukVar) {
                                    str3 = str;
                                    str4 = string;
                                    ye30Var2 = ye30Var;
                                }
                                return yukVar;
                            } catch (Exception e) {
                                e = e;
                                ye30Var4 = ye30Var;
                                ye30Var4.m93520a(2);
                                throw e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            ye30Var = ye30VarM36217a;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        ye30Var = ye30VarM36217a;
                    }
                } else if (ye30Var4 == 1) {
                    str4 = nko0Var2.f154908d;
                    ye30 ye30Var5 = nko0Var2.f154907c;
                    externalAccessoryDescription3 = nko0Var2.f154906b;
                    String str7 = nko0Var2.f154905a;
                    bga.m29073P(objM96567o);
                    ye30Var2 = ye30Var5;
                    yukVar = yukVar2;
                    str3 = str7;
                } else {
                    if (ye30Var4 != 2) {
                        if (ye30Var4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ye30 ye30Var6 = nko0Var2.f154907c;
                        try {
                            bga.m29073P(objM96567o);
                            ye30Var3 = ye30Var6;
                            i = 3;
                            lcf lcfVar = (lcf) objM96567o;
                            wj50.m88279p(lcfVar);
                            if (lcfVar instanceof hcf) {
                                sr4 sr4Var2 = ye30Var3.f271912a;
                                sr4Var2.m79016f("playback_command");
                                sr4Var2.m79013a("playback_outcome", mrx0.m62651e(2));
                                ye30Var3.m93520a(2);
                            } else {
                                sr4 sr4Var3 = ye30Var3.f271912a;
                                sr4Var3.m79016f("playback_command");
                                sr4Var3.m79013a("playback_outcome", mrx0.m62651e(r13));
                                ye30Var3.m93520a(1);
                            }
                            return w2a1.f247311a;
                        } catch (Exception e4) {
                            e = e4;
                            ye30Var3 = ye30Var6;
                            i = 3;
                            sr4 sr4Var4 = ye30Var3.f271912a;
                            sr4Var4.m79016f("playback_command");
                            sr4Var4.m79013a("playback_outcome", mrx0.m62651e(i));
                            throw e;
                        }
                    }
                    z650Var = nko0Var2.f154909e;
                    str5 = nko0Var2.f154908d;
                    ye30Var3 = nko0Var2.f154907c;
                    externalAccessoryDescription2 = nko0Var2.f154906b;
                    bga.m29073P(objM96567o);
                    yukVar = yukVar2;
                    axx axxVar = (axx) g6f.m43741q0((List) objM96567o);
                    playOriginBuild = oko0Var.f166424b.toBuilder().viewUri(str5).build();
                    LoggingParams loggingParamsBuild = LoggingParams.builder().interactionId(z650Var.f279709a).build();
                    String str8 = axxVar.f21021a;
                    wj50.m88279p(playOriginBuild);
                    wzxVar = new wzx(str8, null, null, null, playOriginBuild, loggingParamsBuild, 14);
                    sr4 sr4Var5 = ye30Var3.f271912a;
                    sr4Var5.getClass();
                    sr4Var5.m79019k("playback_command", null, (4 & 4) != 0);
                    try {
                        i05 i05Var = oko0Var.f166428f;
                        String str9 = externalAccessoryDescription2.integrationType;
                        String str10 = z650Var.f279709a;
                        i = 3;
                        try {
                            t0h1 t0h1Var = new t0h1(i05Var, i3, str9, str10, 2);
                            c0yVar = (c0y) oko0Var.f166423a.f235651a.f246568h;
                            c0yVar.getClass();
                            strM85744y = c0yVar.f32907d.m68667b(externalAccessoryDescription2).m85744y();
                            if (strM85744y != null) {
                                PlayOrigin playOriginBuild2 = playOriginBuild.toBuilder().restrictionIdentifier(strM85744y).build();
                                wj50.m88279p(playOriginBuild2);
                                singleM31196e = c0yVar.m31196e(wzx.m89485b(wzxVar, playOriginBuild2));
                            } else {
                                singleM31196e = c0yVar.m31196e(wzxVar);
                            }
                            Single singleM79819z = t0h1Var.m79819z(singleM31196e);
                            nko0Var2.f154905a = null;
                            nko0Var2.f154906b = null;
                            nko0Var2.f154907c = ye30Var3;
                            nko0Var2.f154908d = null;
                            nko0Var2.f154909e = null;
                            nko0Var2.f154912h = 3;
                            objM96567o = zn91.m96567o(singleM79819z, nko0Var2);
                        } catch (Exception e5) {
                            e = e5;
                            sr4 sr4Var6 = ye30Var3.f271912a;
                            sr4Var6.m79016f("playback_command");
                            sr4Var6.m79013a("playback_outcome", mrx0.m62651e(i));
                            throw e;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        i = 3;
                        sr4 sr4Var7 = ye30Var3.f271912a;
                        sr4Var7.m79016f("playback_command");
                        sr4Var7.m79013a("playback_outcome", mrx0.m62651e(i));
                        throw e;
                    }
                }
                z650 z650Var2 = (z650) objM96567o;
                String str11 = externalAccessoryDescription3.senderId;
                g9d0 g9d0Var = new g9d0(str11, str11, str3, 1, false, ye30Var2);
                ye30Var3 = ye30Var2;
                e9d0 e9d0Var = oko0Var.f166426d;
                nko0Var2.f154905a = null;
                nko0Var2.f154906b = externalAccessoryDescription3;
                nko0Var2.f154907c = ye30Var3;
                nko0Var2.f154908d = str4;
                nko0Var2.f154909e = z650Var2;
                nko0Var2.f154912h = 2;
                Object objMo38243a = e9d0Var.mo38243a(g9d0Var, nko0Var2);
                if (objMo38243a != yukVar) {
                    externalAccessoryDescription2 = externalAccessoryDescription3;
                    str5 = str4;
                    z650Var = z650Var2;
                    objM96567o = objMo38243a;
                    axx axxVar2 = (axx) g6f.m43741q0((List) objM96567o);
                    playOriginBuild = oko0Var.f166424b.toBuilder().viewUri(str5).build();
                    LoggingParams loggingParamsBuild2 = LoggingParams.builder().interactionId(z650Var.f279709a).build();
                    String str12 = axxVar2.f21021a;
                    wj50.m88279p(playOriginBuild);
                    wzxVar = new wzx(str12, null, null, null, playOriginBuild, loggingParamsBuild2, 14);
                    sr4 sr4Var8 = ye30Var3.f271912a;
                    sr4Var8.getClass();
                    sr4Var8.m79019k("playback_command", null, (4 & 4) != 0);
                    i05 i05Var2 = oko0Var.f166428f;
                    String str13 = externalAccessoryDescription2.integrationType;
                    String str14 = z650Var.f279709a;
                    i = 3;
                    t0h1 t0h1Var2 = new t0h1(i05Var2, i3, str13, str14, 2);
                    c0yVar = (c0y) oko0Var.f166423a.f235651a.f246568h;
                    c0yVar.getClass();
                    strM85744y = c0yVar.f32907d.m68667b(externalAccessoryDescription2).m85744y();
                    if (strM85744y != null) {
                        PlayOrigin playOriginBuild3 = playOriginBuild.toBuilder().restrictionIdentifier(strM85744y).build();
                        wj50.m88279p(playOriginBuild3);
                        singleM31196e = c0yVar.m31196e(wzx.m89485b(wzxVar, playOriginBuild3));
                    } else {
                        singleM31196e = c0yVar.m31196e(wzxVar);
                    }
                    Single singleM79819z2 = t0h1Var2.m79819z(singleM31196e);
                    nko0Var2.f154905a = null;
                    nko0Var2.f154906b = null;
                    nko0Var2.f154907c = ye30Var3;
                    nko0Var2.f154908d = null;
                    nko0Var2.f154909e = null;
                    nko0Var2.f154912h = 3;
                    objM96567o = zn91.m96567o(singleM79819z2, nko0Var2);
                }
                return yukVar;
            } catch (Exception e7) {
                e = e7;
                ye30Var4 = ye30Var2;
                ye30Var4.m93520a(2);
                throw e;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }
}
