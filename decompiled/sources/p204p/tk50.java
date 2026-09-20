package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.gamesservice.musicguesser.p071v1.DailyIntro;
import com.spotify.gamesservice.musicguesser.p071v1.GetDailyIntroResponse;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class tk50 {

    /* JADX INFO: renamed from: a */
    public final dhi0 f221085a;

    /* JADX INFO: renamed from: b */
    public final hrw f221086b;

    /* JADX INFO: renamed from: c */
    public final esa0 f221087c;

    /* JADX INFO: renamed from: d */
    public final zl00 f221088d;

    public tk50(dhi0 dhi0Var, hrw hrwVar, esa0 esa0Var, zl00 zl00Var) {
        this.f221085a = dhi0Var;
        this.f221086b = hrwVar;
        this.f221087c = esa0Var;
        this.f221088d = zl00Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0159 A[PHI: r4
      0x0159: PHI (r4v12 p.al50) = (r4v11 p.al50), (r4v16 p.al50) binds: [B:52:0x0156, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public static final Object m80999a(tk50 tk50Var, fbk fbkVar) {
        sk50 sk50Var;
        al50 al50Var;
        esa0 esa0Var;
        List listSingletonList;
        String str;
        zl00 zl00Var = tk50Var.f221088d;
        if (fbkVar instanceof sk50) {
            sk50Var = (sk50) fbkVar;
            int i = sk50Var.f210021e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk50Var.f210021e = i - Integer.MIN_VALUE;
            } else {
                sk50Var = new sk50(tk50Var, fbkVar);
            }
        } else {
            sk50Var = new sk50(tk50Var, fbkVar);
        }
        Object objM36046d = sk50Var.f210019c;
        int i2 = sk50Var.f210021e;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM36046d);
            dhi0 dhi0Var = tk50Var.f221085a;
            sk50Var.f210021e = 1;
            objM36046d = dhi0Var.m36046d(sk50Var);
            if (objM36046d != yukVar) {
            }
        }
        if (i2 == 1) {
            bga.m29073P(objM36046d);
        } else {
            if (i2 == 2) {
                al50Var = sk50Var.f210017a;
                bga.m29073P(objM36046d);
                esa0Var = tk50Var.f221087c;
                listSingletonList = Collections.singletonList(al50Var.f16777d.f249205f);
                sk50Var.f210017a = al50Var;
                sk50Var.f210021e = 3;
                if (njg1.m64633z(new aab0(listSingletonList, esa0Var, fbkVar2, 0), sk50Var) != yukVar) {
                    str = al50Var.f16777d.f249206g;
                    if (str.length() > 0) {
                        sk50Var.f210017a = al50Var;
                        sk50Var.f210018b = str;
                        sk50Var.f210021e = 4;
                        if (zl00Var.m96352d(str, sk50Var) != yukVar) {
                        }
                    }
                }
            }
            if (i2 == 3) {
                al50 al50Var2 = sk50Var.f210017a;
                bga.m29073P(objM36046d);
                al50Var = al50Var2;
                str = al50Var.f16777d.f249206g;
                if (str.length() > 0) {
                    sk50Var.f210017a = al50Var;
                    sk50Var.f210018b = str;
                    sk50Var.f210021e = 4;
                    if (zl00Var.m96352d(str, sk50Var) != yukVar) {
                    }
                }
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                al50 al50Var3 = sk50Var.f210017a;
                bga.m29073P(objM36046d);
                return al50Var3;
            }
            str = sk50Var.f210018b;
            al50Var = sk50Var.f210017a;
            bga.m29073P(objM36046d);
        }
        sk50Var.f210017a = al50Var;
        sk50Var.f210018b = null;
        sk50Var.f210021e = 5;
        return zl00Var.m96351c(str, sk50Var) == yukVar ? yukVar : al50Var;
        o2x0 o2x0Var = (o2x0) objM36046d;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new IllegalStateException(s571.m77246e(o2x0Var.f161171a.f149860d, "Failed to load game state: "));
        }
        GetDailyIntroResponse getDailyIntroResponse = (GetDailyIntroResponse) o2x0Var.f161172b;
        if (getDailyIntroResponse == null) {
            Logger.m3966b("MusicGuesser:Intro: Received empty response.", new Object[0]);
            throw new IllegalStateException("Empty response body");
        }
        getDailyIntroResponse.m11050p().toString();
        switch (rk50.f199991a[getDailyIntroResponse.m11050p().ordinal()]) {
            case -1:
            case 5:
            case 6:
                Logger.m3966b("MusicGuesser:Intro: Unknown game state received: " + getDailyIntroResponse.m11050p(), new Object[0]);
                throw new IllegalStateException("Unknown game state: " + getDailyIntroResponse.m11050p());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                String strM11048n = getDailyIntroResponse.m11048n();
                boolean z = getDailyIntroResponse.m11050p() == gqa1.USER_GAME_STATE_COMPLETED;
                boolean z2 = getDailyIntroResponse.m11050p() == gqa1.USER_GAME_STATE_AVAILABLE_FIRST_GAME;
                DailyIntro dailyIntroM11049o = getDailyIntroResponse.m11049o();
                al50 al50Var4 = new al50(strM11048n, z, z2, new w9m0(dailyIntroM11049o.getTitle(), dailyIntroM11049o.getSubtitle(), dailyIntroM11049o.m10995t(), dailyIntroM11049o.m10992p(), dailyIntroM11049o.m10991o(), dailyIntroM11049o.m10996u(), dailyIntroM11049o.m10990n()));
                sk50Var.f210017a = al50Var4;
                sk50Var.f210021e = 2;
                Object objM96565n = zn91.m96565n(tk50Var.f221086b.mo48412a(new v7p0(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("musicguesser").build()).build())).ignoreElement(), sk50Var);
                if (objM96565n != yukVar) {
                    objM96565n = w2a1.f247311a;
                }
                if (objM96565n != yukVar) {
                    al50Var = al50Var4;
                    esa0Var = tk50Var.f221087c;
                    listSingletonList = Collections.singletonList(al50Var.f16777d.f249205f);
                    sk50Var.f210017a = al50Var;
                    sk50Var.f210021e = 3;
                    if (njg1.m64633z(new aab0(listSingletonList, esa0Var, fbkVar2, 0), sk50Var) != yukVar) {
                        str = al50Var.f16777d.f249206g;
                        if (str.length() > 0) {
                            sk50Var.f210017a = al50Var;
                            sk50Var.f210018b = str;
                            sk50Var.f210021e = 4;
                            if (zl00Var.m96352d(str, sk50Var) != yukVar) {
                                sk50Var.f210017a = al50Var;
                                sk50Var.f210018b = null;
                                sk50Var.f210021e = 5;
                                if (zl00Var.m96351c(str, sk50Var) == yukVar) {
                                }
                            }
                        }
                    }
                }
            case 4:
                return new zk50(getDailyIntroResponse.m11049o().m10994s(), getDailyIntroResponse.m11049o().m10993r());
        }
    }

    /* JADX INFO: renamed from: b */
    public final u4a0 m81000b() {
        return new u4a0(new cv8(1, this, tk50.class, "load", "load(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 3), bk5.m29613h0(new v4a0[0]));
    }
}
