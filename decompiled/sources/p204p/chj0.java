package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.spotifyuserprofile.p159v0.CreateNoteRequest;
import com.spotify.spotifyuserprofile.p159v0.CreateNoteResponse;
import com.spotify.spotifyuserprofile.p159v0.DeleteNoteResponse;
import com.spotify.spotifyuserprofile.p159v0.EditNoteResponse;
import com.spotify.spotifyuserprofile.p159v0.Note;
import com.spotify.spotifyuserprofile.p159v0.UpdateNoteRequest;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
public final class chj0 {

    /* JADX INFO: renamed from: a */
    public final grj0 f38027a;

    /* JADX INFO: renamed from: b */
    public final hb11 f38028b;

    /* JADX INFO: renamed from: c */
    public final luu0 f38029c;

    public chj0(grj0 grj0Var, xre xreVar) {
        this.f38027a = grj0Var;
        hb11 hb11VarM52092t = j0g1.m52092t(0, 1, 0, 5);
        this.f38028b = hb11VarM52092t;
        this.f38029c = bzf1.m31020l(hb11VarM52092t);
    }

    /* JADX INFO: renamed from: c */
    public static fpy m32793c(Exception exc, gh00 gh00Var) {
        if ((exc instanceof UnknownHostException) || (exc instanceof SocketTimeoutException) || (exc instanceof SocketException) || (exc instanceof IOException)) {
            return new fpy(null, 2);
        }
        return new fpy(exc instanceof HttpException ? (String) gh00Var.invoke(exc) : null, 1);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public final Object m32794a(String str, String str2, ibk ibkVar) {
        zgj0 zgj0Var;
        String str3;
        int i;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (ibkVar instanceof zgj0) {
            zgj0Var = (zgj0) ibkVar;
            int i2 = zgj0Var.f282658h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zgj0Var.f282658h = i2 - Integer.MIN_VALUE;
            } else {
                zgj0Var = new zgj0(this, ibkVar);
            }
        } else {
            zgj0Var = new zgj0(this, ibkVar);
        }
        Object objM45508b = zgj0Var.f282656f;
        int i3 = zgj0Var.f282658h;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i3 == 0) {
                    bga.m29073P(objM45508b);
                    u9l u9lVarM21540p = CreateNoteRequest.m21540p();
                    u9lVarM21540p.m82642q(str5);
                    u9lVarM21540p.m82641m(str6);
                    CreateNoteRequest createNoteRequest = (CreateNoteRequest) u9lVarM21540p.build();
                    grj0 grj0Var = this.f38027a;
                    wj50.m88279p(createNoteRequest);
                    zgj0Var.f282651a = str5;
                    zgj0Var.f282652b = str6;
                    zgj0Var.f282658h = 1;
                    objM45508b = grj0Var.m45508b(createNoteRequest, zgj0Var);
                    if (objM45508b == yukVar) {
                    }
                    return yukVar;
                }
                if (i3 == 1) {
                    str6 = zgj0Var.f282652b;
                    str5 = zgj0Var.f282651a;
                    bga.m29073P(objM45508b);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = zgj0Var.f282655e;
                    String str7 = zgj0Var.f282654d;
                    str4 = zgj0Var.f282653c;
                    String str8 = zgj0Var.f282651a;
                    try {
                        bga.m29073P(objM45508b);
                        str3 = str7;
                        str5 = str8;
                    } catch (Exception e) {
                        e = e;
                        str5 = str8;
                        Logger.m3967c(e, edb.m38564m("Failed to add note for section: ", str5), new Object[0]);
                        return m32793c(e, new e9f0(this, 17));
                    }
                }
                wj50.m88279p(str4);
                if (i != 0) {
                    z = false;
                }
                return new gpy(new apy(str4, z), str3);
                String str9 = str6;
                CreateNoteResponse createNoteResponse = (CreateNoteResponse) objM45508b;
                String strM21544p = createNoteResponse.m21544p();
                String strM21545q = createNoteResponse.m21545q();
                wj50.m88279p(strM21545q);
                if (strM21545q.length() <= 0) {
                    strM21545q = null;
                }
                Note noteM21543o = createNoteResponse.m21543o();
                long jM21564s = noteM21543o.m21564s() > 0 ? noteM21543o.m21564s() / ((long) 1000) : System.currentTimeMillis() / ((long) 1000);
                boolean z2 = noteM21543o.m21560n() == EnumC2288qc.ACCEPTED;
                wj50.m88279p(strM21544p);
                rly rlyVar = new rly(strM21544p, str9, jM21564s, noteM21543o.m21563r() == lir0.PROCESSING, z2);
                boolean z3 = z2;
                hb11 hb11Var = this.f38028b;
                bpy bpyVar = new bpy(str5, rlyVar);
                zgj0Var.f282651a = str5;
                zgj0Var.f282652b = null;
                zgj0Var.f282653c = strM21544p;
                zgj0Var.f282654d = strM21545q;
                zgj0Var.f282655e = z3 ? 1 : 0;
                zgj0Var.f282658h = 2;
                if (hb11Var.emit(bpyVar, zgj0Var) != yukVar) {
                    str3 = strM21545q;
                    i = z3 ? 1 : 0;
                    str4 = strM21544p;
                    wj50.m88279p(str4);
                    if (i != 0) {
                        z = false;
                    }
                    return new gpy(new apy(str4, z), str3);
                }
                return yukVar;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m32795b(String str, ibk ibkVar) {
        ahj0 ahj0Var;
        String str2;
        Exception e;
        String str3;
        if (ibkVar instanceof ahj0) {
            ahj0Var = (ahj0) ibkVar;
            int i = ahj0Var.f15707e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahj0Var.f15707e = i - Integer.MIN_VALUE;
            } else {
                ahj0Var = new ahj0(this, ibkVar);
            }
        } else {
            ahj0Var = new ahj0(this, ibkVar);
        }
        Object objM45509c = ahj0Var.f15705c;
        int i2 = ahj0Var.f15707e;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM45509c);
                    grj0 grj0Var = this.f38027a;
                    ahj0Var.f15703a = str;
                    ahj0Var.f15707e = 1;
                    objM45509c = grj0Var.m45509c(str, ahj0Var);
                    if (objM45509c == yukVar) {
                    }
                    return yukVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = ahj0Var.f15704b;
                    str2 = ahj0Var.f15703a;
                    try {
                        bga.m29073P(objM45509c);
                        return new gpy(w2a1.f247311a, str3);
                    } catch (Exception e2) {
                        e = e2;
                        Logger.m3967c(e, edb.m38564m("Failed to delete note: ", str2), new Object[0]);
                        return m32793c(e, new e9f0(this, 18));
                    }
                }
                str = ahj0Var.f15703a;
                bga.m29073P(objM45509c);
                String strM21549o = ((DeleteNoteResponse) objM45509c).m21549o();
                wj50.m88279p(strM21549o);
                if (strM21549o.length() <= 0) {
                    strM21549o = null;
                }
                hb11 hb11Var = this.f38028b;
                cpy cpyVar = new cpy(str);
                ahj0Var.f15703a = str;
                ahj0Var.f15704b = strM21549o;
                ahj0Var.f15707e = 2;
                if (hb11Var.emit(cpyVar, ahj0Var) != yukVar) {
                    str2 = str;
                    str3 = strM21549o;
                    return new gpy(w2a1.f247311a, str3);
                }
                return yukVar;
            } catch (Exception e3) {
                str2 = str;
                e = e3;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: d */
    public final Object m32796d(String str, String str2, ibk ibkVar) {
        bhj0 bhj0Var;
        String str3;
        String str4;
        String strM21554p;
        String str5 = str;
        String str6 = str2;
        if (ibkVar instanceof bhj0) {
            bhj0Var = (bhj0) ibkVar;
            int i = bhj0Var.f27203f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bhj0Var.f27203f = i - Integer.MIN_VALUE;
            } else {
                bhj0Var = new bhj0(this, ibkVar);
            }
        } else {
            bhj0Var = new bhj0(this, ibkVar);
        }
        Object objM45507a = bhj0Var.f27201d;
        int i2 = bhj0Var.f27203f;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            str6 = bhj0Var.f27199b;
                            str5 = bhj0Var.f27198a;
                            bga.m29073P(objM45507a);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            strM21554p = bhj0Var.f27200c;
                            str5 = bhj0Var.f27198a;
                            bga.m29073P(objM45507a);
                        }
                        return new gpy(w2a1.f247311a, strM21554p);
                    }
                    bga.m29073P(objM45507a);
                    xba1 xba1VarM21580o = UpdateNoteRequest.m21580o();
                    xba1VarM21580o.m90312m(str6);
                    UpdateNoteRequest updateNoteRequest = (UpdateNoteRequest) xba1VarM21580o.build();
                    grj0 grj0Var = this.f38027a;
                    wj50.m88279p(updateNoteRequest);
                    bhj0Var.f27198a = str5;
                    bhj0Var.f27199b = str6;
                    bhj0Var.f27203f = 1;
                    objM45507a = grj0Var.m45507a(str5, updateNoteRequest, bhj0Var);
                    if (objM45507a == yukVar) {
                        return yukVar;
                    }
                    EditNoteResponse editNoteResponse = (EditNoteResponse) objM45507a;
                    strM21554p = editNoteResponse.m21554p();
                    wj50.m88279p(strM21554p);
                    if (strM21554p.length() <= 0) {
                        strM21554p = null;
                    }
                    Note noteM21553o = editNoteResponse.m21553o();
                    long jM21564s = noteM21553o.m21564s() > 0 ? noteM21553o.m21564s() / ((long) 1000) : System.currentTimeMillis() / ((long) 1000);
                    boolean z = noteM21553o.m21563r() == lir0.PROCESSING;
                    hb11 hb11Var = this.f38028b;
                    dpy dpyVar = new dpy(str3, str4, jM21564s, z);
                    bhj0Var.f27198a = str3;
                    bhj0Var.f27199b = null;
                    bhj0Var.f27200c = strM21554p;
                    bhj0Var.f27203f = 2;
                    if (hb11Var.emit(dpyVar, bhj0Var) == yukVar) {
                        return yukVar;
                    }
                    str5 = str3;
                    return new gpy(w2a1.f247311a, strM21554p);
                } catch (Exception e) {
                    e = e;
                    Logger.m3967c(e, edb.m38564m("Failed to update note: ", str3), new Object[0]);
                    return m32793c(e, new e9f0(this, 19));
                }
                str4 = str6;
                str3 = str5;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str5;
        }
    }
}
