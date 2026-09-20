package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class an81 implements g5w0 {

    /* JADX INFO: renamed from: a */
    public final er70 f17328a;

    /* JADX INFO: renamed from: b */
    public final er70 f17329b;

    /* JADX INFO: renamed from: c */
    public final xp4 f17330c;

    /* JADX INFO: renamed from: d */
    public final s4k f17331d;

    /* JADX INFO: renamed from: e */
    public final luk f17332e;

    /* JADX INFO: renamed from: f */
    public final xso0 f17333f;

    /* JADX INFO: renamed from: g */
    public final mcu0 f17334g;

    /* JADX INFO: renamed from: h */
    public final nc2 f17335h;

    public an81(er70 er70Var, er70 er70Var2, bn81 bn81Var, xp4 xp4Var, s4k s4kVar, luk lukVar, xso0 xso0Var, mcu0 mcu0Var, nc2 nc2Var) {
        tlp tlpVar = tlp.f221498c;
        this.f17328a = er70Var;
        this.f17329b = er70Var2;
        this.f17330c = xp4Var;
        this.f17331d = s4kVar;
        this.f17332e = lukVar;
        this.f17333f = xso0Var;
        this.f17334g = mcu0Var;
        this.f17335h = nc2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Enum m26485a(String str, ibk ibkVar) {
        sm81 sm81Var;
        if (ibkVar instanceof sm81) {
            sm81Var = (sm81) ibkVar;
            int i = sm81Var.f210586c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm81Var.f210586c = i - Integer.MIN_VALUE;
            } else {
                sm81Var = new sm81(this, ibkVar);
            }
        } else {
            sm81Var = new sm81(this, ibkVar);
        }
        Object objMo71009c = sm81Var.f210584a;
        int i2 = sm81Var.f210586c;
        if (i2 == 0) {
            bga.m29073P(objMo71009c);
            sm81Var.f210586c = 1;
            objMo71009c = this.f17333f.mo71009c(str, sm81Var);
            yuk yukVar = yuk.f276404a;
            if (objMo71009c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo71009c);
        }
        Object value = ((xv41) objMo71009c).getValue();
        sto0 sto0Var = value instanceof sto0 ? (sto0) value : null;
        if (sto0Var != null) {
            return sto0Var.f213941a;
        }
        return null;
    }

    @Override // p204p.g5w0
    /* JADX INFO: renamed from: i */
    public final Object mo26032i(tu41 tu41Var, d850 d850Var, fbk fbkVar) throws Throwable {
        if ((tu41Var instanceof it41) && d850Var != null) {
            Object objM89557A = x0h1.m89557A(this.f17332e, new qw11(this, tu41Var, d850Var, null, 17), fbkVar);
            if (objM89557A == yuk.f276404a) {
                return objM89557A;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0151, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g5w0
    /* JADX INFO: renamed from: m */
    public final Object mo26036m(tu41 tu41Var, d850 d850Var, ibk ibkVar) throws Throwable {
        ym81 ym81Var;
        it41 it41Var;
        d850 d850Var2;
        Object objM89557A;
        String str;
        it41 it41Var2;
        dd41 dd41Var;
        d850 d850Var3;
        qto0 qto0Var;
        qto0 qto0Var2;
        luk lukVar;
        z650 z650Var;
        SkipToTrack skipToTrackFromUri;
        String str2;
        LoggingParams loggingParamsBuild;
        PlayCommand playCommandBuild;
        zm81 zm81Var;
        qw11 qw11Var;
        if (ibkVar instanceof ym81) {
            ym81Var = (ym81) ibkVar;
            int i = ym81Var.f274187g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ym81Var.f274187g = i - Integer.MIN_VALUE;
            } else {
                ym81Var = new ym81(this, ibkVar);
            }
        } else {
            ym81Var = new ym81(this, ibkVar);
        }
        ym81 ym81Var2 = ym81Var;
        Object obj = ym81Var2.f274185e;
        int i2 = ym81Var2.f274187g;
        int i3 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Enum r12 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            it41Var = tu41Var instanceof it41 ? (it41) tu41Var : null;
            if (it41Var != null) {
                d850Var2 = d850Var;
                ym81Var2.f274181a = d850Var2;
                ym81Var2.f274182b = it41Var;
                ym81Var2.f274187g = 1;
                objM89557A = x0h1.m89557A(tlp.f221498c, new wm81(this, objArr == true ? 1 : 0, i3), ym81Var2);
                if (objM89557A != r12) {
                }
                return r12;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            it41Var = ym81Var2.f274182b;
            d850 d850Var4 = ym81Var2.f274181a;
            bga.m29073P(obj);
            objM89557A = obj;
            d850Var2 = d850Var4;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            dd41Var = ym81Var2.f274184d;
            str = ym81Var2.f274183c;
            it41Var2 = ym81Var2.f274182b;
            d850Var3 = ym81Var2.f274181a;
            bga.m29073P(obj);
        }
        qto0Var = (qto0) obj;
        qto0Var2 = qto0.f192424b;
        lukVar = this.f17332e;
        if (qto0Var == qto0Var2) {
            qw11Var = new qw11(this, str, it41Var2, objArr3 == true ? 1 : 0, 16);
            ym81Var2.f274181a = null;
            ym81Var2.f274182b = null;
            ym81Var2.f274183c = null;
            ym81Var2.f274184d = null;
            ym81Var2.f274187g = 3;
            if (x0h1.m89557A(lukVar, qw11Var, ym81Var2) == r12) {
                return r12;
            }
            return w2a1Var;
        }
        if (qto0Var != qto0.f192423a) {
            zm81Var = new zm81(this, str, objArr2 == true ? 1 : 0, i3);
            ym81Var2.f274181a = null;
            ym81Var2.f274182b = null;
            ym81Var2.f274183c = null;
            ym81Var2.f274184d = null;
            ym81Var2.f274187g = 4;
            if (x0h1.m89557A(lukVar, zm81Var, ym81Var2) == r12) {
                return r12;
            }
            return w2a1Var;
        }
        z650Var = d850Var3 != null ? d850Var3.f46380a : null;
        skipToTrackFromUri = SkipToTrack.fromUri(str);
        LoggingParams.Builder builder = LoggingParams.builder();
        if (z650Var != null || (str2 = z650Var.f279709a) == null) {
            str2 = "";
        }
        loggingParamsBuild = builder.interactionId(str2).build();
        if (this.f17330c.m91621h0()) {
            playCommandBuild = PlayCommand.Builder.builder().context(Context.fromUri(it41Var2.f105421a.f237980b)).options(PreparePlayOptions.builder().skipTo(skipToTrackFromUri).build()).loggingParams(loggingParamsBuild).build();
        } else {
            String strConcat = "spotify:station:track:".concat(dd41Var.m35710h());
            playCommandBuild = PlayCommand.Builder.builder().context(Context.builder(strConcat).url("hm://darwin-experiments/play-context/radio/track/" + str).build()).options(PreparePlayOptions.builder().alwaysPlaySomething(true).skipTo(skipToTrackFromUri).build()).loggingParams(loggingParamsBuild).build();
        }
        CompletableOnErrorComplete completableOnErrorCompleteM23299p = ((uqw) this.f17328a.get()).m83821a(playCommandBuild).ignoreElement().m23296h(cz31.f43440Q0).m23299p(Functions.f7232h);
        Action action = Functions.f7227c;
        Consumer consumer = Functions.f7229e;
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(consumer, "onError is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        completableOnErrorCompleteM23299p.subscribe(blockingMultiObserver);
        blockingMultiObserver.m23462a(Functions.f7228d, consumer, action);
        return w2a1Var;
        if (!((Boolean) objM89557A).booleanValue()) {
            str = it41Var.f105421a.f237979a;
            Set set = dd41.f47702f;
            dd41 dd41VarM74726U = r46.m74726U(str);
            if (dd41VarM74726U.f47709c != gn80.TRACK) {
                Logger.m3966b(edb.m38564m("Unexpected uri in track row: ", str), new Object[0]);
                return w2a1Var;
            }
            ym81Var2.f274181a = d850Var2;
            ym81Var2.f274182b = it41Var;
            ym81Var2.f274183c = str;
            ym81Var2.f274184d = dd41VarM74726U;
            ym81Var2.f274187g = 2;
            Enum enumM26485a = m26485a(str, ym81Var2);
            if (enumM26485a != r12) {
                it41Var2 = it41Var;
                dd41Var = dd41VarM74726U;
                d850Var3 = d850Var2;
                obj = enumM26485a;
                qto0Var = (qto0) obj;
                qto0Var2 = qto0.f192424b;
                lukVar = this.f17332e;
                if (qto0Var == qto0Var2) {
                    qw11Var = new qw11(this, str, it41Var2, objArr3 == true ? 1 : 0, 16);
                    ym81Var2.f274181a = null;
                    ym81Var2.f274182b = null;
                    ym81Var2.f274183c = null;
                    ym81Var2.f274184d = null;
                    ym81Var2.f274187g = 3;
                    if (x0h1.m89557A(lukVar, qw11Var, ym81Var2) == r12) {
                    }
                } else {
                    if (qto0Var != qto0.f192423a) {
                        if (d850Var3 != null) {
                        }
                        skipToTrackFromUri = SkipToTrack.fromUri(str);
                        LoggingParams.Builder builder2 = LoggingParams.builder();
                        if (z650Var != null) {
                            str2 = "";
                        } else {
                            str2 = "";
                        }
                        loggingParamsBuild = builder2.interactionId(str2).build();
                        if (this.f17330c.m91621h0()) {
                            playCommandBuild = PlayCommand.Builder.builder().context(Context.fromUri(it41Var2.f105421a.f237980b)).options(PreparePlayOptions.builder().skipTo(skipToTrackFromUri).build()).loggingParams(loggingParamsBuild).build();
                        } else {
                            String strConcat2 = "spotify:station:track:".concat(dd41Var.m35710h());
                            playCommandBuild = PlayCommand.Builder.builder().context(Context.builder(strConcat2).url("hm://darwin-experiments/play-context/radio/track/" + str).build()).options(PreparePlayOptions.builder().alwaysPlaySomething(true).skipTo(skipToTrackFromUri).build()).loggingParams(loggingParamsBuild).build();
                        }
                        CompletableOnErrorComplete completableOnErrorCompleteM23299p2 = ((uqw) this.f17328a.get()).m83821a(playCommandBuild).ignoreElement().m23296h(cz31.f43440Q0).m23299p(Functions.f7232h);
                        Action action2 = Functions.f7227c;
                        Consumer consumer2 = Functions.f7229e;
                        Objects.requireNonNull(action2, "onComplete is null");
                        Objects.requireNonNull(consumer2, "onError is null");
                        BlockingMultiObserver blockingMultiObserver2 = new BlockingMultiObserver();
                        completableOnErrorCompleteM23299p2.subscribe(blockingMultiObserver2);
                        blockingMultiObserver2.m23462a(Functions.f7228d, consumer2, action2);
                        return w2a1Var;
                    }
                    zm81Var = new zm81(this, str, objArr2 == true ? 1 : 0, i3);
                    ym81Var2.f274181a = null;
                    ym81Var2.f274182b = null;
                    ym81Var2.f274183c = null;
                    ym81Var2.f274184d = null;
                    ym81Var2.f274187g = 4;
                    if (x0h1.m89557A(lukVar, zm81Var, ym81Var2) == r12) {
                    }
                }
            }
            return r12;
        }
        return w2a1Var;
    }

    @Override // p204p.g5w0
    /* JADX INFO: renamed from: r */
    public final ad61 mo26041r() {
        return null;
    }
}
