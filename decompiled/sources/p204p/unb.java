package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class unb {

    /* JADX INFO: renamed from: a */
    public final bho0 f232121a;

    /* JADX INFO: renamed from: b */
    public final scn f232122b;

    /* JADX INFO: renamed from: c */
    public final wt80 f232123c;

    /* JADX INFO: renamed from: d */
    public final wg61 f232124d = new wg61(new bj9(this, 28));

    public unb(bho0 bho0Var, scn scnVar, wt80 wt80Var) {
        this.f232121a = bho0Var;
        this.f232122b = scnVar;
        this.f232123c = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83538a(String str, String str2, ibk ibkVar) throws Throwable {
        rnb rnbVar;
        boolean zBooleanValue;
        if (ibkVar instanceof rnb) {
            rnbVar = (rnb) ibkVar;
            int i = rnbVar.f200864c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnbVar.f200864c = i - Integer.MIN_VALUE;
            } else {
                rnbVar = new rnb(this, ibkVar);
            }
        } else {
            rnbVar = new rnb(this, ibkVar);
        }
        Object objM89557A = rnbVar.f200862a;
        int i2 = rnbVar.f200864c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            rnbVar.f200864c = 1;
            mu80 mu80Var = (mu80) this.f232123c;
            objM89557A = x0h1.m89557A(mu80Var.f147269c, new zt80(mu80Var, str2, str, null, 0), rnbVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        p2x0 p2x0Var = (p2x0) objM89557A;
        if (p2x0Var instanceof m2x0) {
            zBooleanValue = ((Boolean) ((m2x0) p2x0Var).f139474a).booleanValue();
        } else {
            if (!(p2x0Var instanceof k2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: b */
    public final Object m83539b(String str, yp6 yp6Var) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U(str).m35694A();
        if (strM35694A == null) {
            return Boolean.FALSE;
        }
        String strM35716n = r46.m74726U(str).m35716n("context");
        if (hyv.m49203c(str)) {
            return m83540c(Context.fromUri(strM35694A), null, PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(strM35694A).build()).build(), yp6Var);
        }
        return hyv.m49207g(str) ? m83541d(strM35694A, strM35716n, yp6Var) : Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m83540c(Context context, d850 d850Var, PreparePlayOptions preparePlayOptions, ibk ibkVar) {
        snb snbVar;
        z650 z650Var;
        if (ibkVar instanceof snb) {
            snbVar = (snb) ibkVar;
            int i = snbVar.f210873c;
            if ((i & Integer.MIN_VALUE) != 0) {
                snbVar.f210873c = i - Integer.MIN_VALUE;
            } else {
                snbVar = new snb(this, ibkVar);
            }
        } else {
            snbVar = new snb(this, ibkVar);
        }
        Object objM96567o = snbVar.f210871a;
        int i2 = snbVar.f210873c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            uqw uqwVar = (uqw) this.f232124d.getValue();
            PlayCommand.Builder builder = PlayCommand.builder(context, this.f232121a.f27222a);
            LoggingParams.Builder builder2 = LoggingParams.builder();
            String str = (d850Var == null || (z650Var = d850Var.f46380a) == null) ? null : z650Var.f279709a;
            if (str == null) {
                str = "";
            }
            Single singleOnErrorReturn = uqwVar.m83821a(builder.loggingParams(builder2.interactionId(str).commandInitiatedTime(0L).build()).options(preparePlayOptions).build()).onErrorReturn(new qq8(this, 9));
            snbVar.f210873c = 1;
            objM96567o = zn91.m96567o(singleOnErrorReturn, snbVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return Boolean.valueOf(wj50.m88271j(objM96567o, new icf()));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c A[PHI: r6
      0x006c: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v8 java.lang.String) binds: [B:22:0x004a, B:24:0x0050, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r8 == r4) goto L34;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83541d(String str, String str2, ibk ibkVar) throws Throwable {
        tnb tnbVar;
        Context contextFromUri;
        Object objM83540c;
        if (ibkVar instanceof tnb) {
            tnbVar = (tnb) ibkVar;
            int i = tnbVar.f221928e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnbVar.f221928e = i - Integer.MIN_VALUE;
            } else {
                tnbVar = new tnb(this, ibkVar);
            }
        } else {
            tnbVar = new tnb(this, ibkVar);
        }
        Object objM83538a = tnbVar.f221926c;
        int i2 = tnbVar.f221928e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM83538a);
            if (str2 != null && hyv.m49201a(str2)) {
                contextFromUri = Context.fromUri(str2);
                wj50.m88279p(contextFromUri);
                PreparePlayOptions preparePlayOptionsBuild = PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str).build()).build();
                tnbVar.f221924a = null;
                tnbVar.f221925b = null;
                tnbVar.f221928e = 2;
                objM83540c = m83540c(contextFromUri, null, preparePlayOptionsBuild, tnbVar);
                if (objM83540c == obj) {
                    return objM83540c;
                }
            } else if (str2 == null || !hyv.m49204d(str2)) {
                contextFromUri = Context.builder(str).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder(str).build())).build())).build();
                wj50.m88279p(contextFromUri);
                PreparePlayOptions preparePlayOptionsBuild2 = PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str).build()).build();
                tnbVar.f221924a = null;
                tnbVar.f221925b = null;
                tnbVar.f221928e = 2;
                objM83540c = m83540c(contextFromUri, null, preparePlayOptionsBuild2, tnbVar);
                if (objM83540c == obj) {
                    return objM83540c;
                }
            } else {
                tnbVar.f221924a = str;
                tnbVar.f221925b = str2;
                tnbVar.f221928e = 1;
                objM83538a = m83538a(str, str2, tnbVar);
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM83538a);
            return objM83538a;
        }
        str2 = tnbVar.f221925b;
        str = tnbVar.f221924a;
        bga.m29073P(objM83538a);
        if (((Boolean) objM83538a).booleanValue()) {
            contextFromUri = Context.fromUri(str2);
        } else {
            contextFromUri = Context.builder(str).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder(str).build())).build())).build();
        }
        wj50.m88279p(contextFromUri);
        PreparePlayOptions preparePlayOptionsBuild3 = PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str).build()).build();
        tnbVar.f221924a = null;
        tnbVar.f221925b = null;
        tnbVar.f221928e = 2;
        objM83540c = m83540c(contextFromUri, null, preparePlayOptionsBuild3, tnbVar);
        if (objM83540c == obj) {
            return obj;
        }
        return objM83540c;
    }
}
