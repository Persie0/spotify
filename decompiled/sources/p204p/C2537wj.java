package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: renamed from: p.wj */
/* JADX INFO: loaded from: classes6.dex */
public final class C2537wj extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251778a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f251779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2537wj(int i) {
        super(3, null);
        this.f251778a = i;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th = (Throwable) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f251778a) {
            case 0:
                C2537wj c2537wj = new C2537wj(3, 0, fbkVar);
                c2537wj.f251779b = th;
                w2a1 w2a1Var = w2a1.f247311a;
                c2537wj.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                C2537wj c2537wj2 = new C2537wj(3, 1, fbkVar);
                c2537wj2.f251779b = th;
                w2a1 w2a1Var2 = w2a1.f247311a;
                c2537wj2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                C2537wj c2537wj3 = new C2537wj(3, 2, fbkVar);
                c2537wj3.f251779b = th;
                w2a1 w2a1Var3 = w2a1.f247311a;
                c2537wj3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                C2537wj c2537wj4 = new C2537wj(3, 3, fbkVar);
                c2537wj4.f251779b = th;
                w2a1 w2a1Var4 = w2a1.f247311a;
                c2537wj4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            case 4:
                C2537wj c2537wj5 = new C2537wj(3, 4, fbkVar);
                c2537wj5.f251779b = th;
                w2a1 w2a1Var5 = w2a1.f247311a;
                c2537wj5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
            case 5:
                C2537wj c2537wj6 = new C2537wj(3, 5, fbkVar);
                c2537wj6.f251779b = th;
                w2a1 w2a1Var6 = w2a1.f247311a;
                c2537wj6.invokeSuspend(w2a1Var6);
                return w2a1Var6;
            case 6:
                C2537wj c2537wj7 = new C2537wj(3, 6, fbkVar);
                c2537wj7.f251779b = th;
                w2a1 w2a1Var7 = w2a1.f247311a;
                c2537wj7.invokeSuspend(w2a1Var7);
                return w2a1Var7;
            case 7:
                C2537wj c2537wj8 = new C2537wj(3, 7, fbkVar);
                c2537wj8.f251779b = th;
                w2a1 w2a1Var8 = w2a1.f247311a;
                c2537wj8.invokeSuspend(w2a1Var8);
                return w2a1Var8;
            case 8:
                C2537wj c2537wj9 = new C2537wj(3, 8, fbkVar);
                c2537wj9.f251779b = th;
                w2a1 w2a1Var9 = w2a1.f247311a;
                c2537wj9.invokeSuspend(w2a1Var9);
                return w2a1Var9;
            case 9:
                C2537wj c2537wj10 = new C2537wj(3, 9, fbkVar);
                c2537wj10.f251779b = th;
                w2a1 w2a1Var10 = w2a1.f247311a;
                c2537wj10.invokeSuspend(w2a1Var10);
                return w2a1Var10;
            case 10:
                C2537wj c2537wj11 = new C2537wj(3, 10, fbkVar);
                c2537wj11.f251779b = th;
                w2a1 w2a1Var11 = w2a1.f247311a;
                c2537wj11.invokeSuspend(w2a1Var11);
                return w2a1Var11;
            case 11:
                C2537wj c2537wj12 = new C2537wj(3, 11, fbkVar);
                c2537wj12.f251779b = th;
                w2a1 w2a1Var12 = w2a1.f247311a;
                c2537wj12.invokeSuspend(w2a1Var12);
                return w2a1Var12;
            case 12:
                C2537wj c2537wj13 = new C2537wj(3, 12, fbkVar);
                c2537wj13.f251779b = th;
                w2a1 w2a1Var13 = w2a1.f247311a;
                c2537wj13.invokeSuspend(w2a1Var13);
                return w2a1Var13;
            case 13:
                C2537wj c2537wj14 = new C2537wj(3, 13, fbkVar);
                c2537wj14.f251779b = th;
                c2537wj14.invokeSuspend(w2a1.f247311a);
                throw null;
            case 14:
                C2537wj c2537wj15 = new C2537wj(3, 14, fbkVar);
                c2537wj15.f251779b = th;
                c2537wj15.invokeSuspend(w2a1.f247311a);
                throw null;
            case 15:
                C2537wj c2537wj16 = new C2537wj(3, 15, fbkVar);
                c2537wj16.f251779b = th;
                w2a1 w2a1Var14 = w2a1.f247311a;
                c2537wj16.invokeSuspend(w2a1Var14);
                return w2a1Var14;
            case 16:
                C2537wj c2537wj17 = new C2537wj(3, 16, fbkVar);
                c2537wj17.f251779b = th;
                w2a1 w2a1Var15 = w2a1.f247311a;
                c2537wj17.invokeSuspend(w2a1Var15);
                return w2a1Var15;
            case 17:
                C2537wj c2537wj18 = new C2537wj(3, 17, fbkVar);
                c2537wj18.f251779b = th;
                w2a1 w2a1Var16 = w2a1.f247311a;
                c2537wj18.invokeSuspend(w2a1Var16);
                return w2a1Var16;
            case 18:
                C2537wj c2537wj19 = new C2537wj(3, 18, fbkVar);
                c2537wj19.f251779b = th;
                w2a1 w2a1Var17 = w2a1.f247311a;
                c2537wj19.invokeSuspend(w2a1Var17);
                return w2a1Var17;
            case 19:
                C2537wj c2537wj20 = new C2537wj(3, 19, fbkVar);
                c2537wj20.f251779b = th;
                w2a1 w2a1Var18 = w2a1.f247311a;
                c2537wj20.invokeSuspend(w2a1Var18);
                return w2a1Var18;
            case 20:
                C2537wj c2537wj21 = new C2537wj(3, 20, fbkVar);
                c2537wj21.f251779b = th;
                w2a1 w2a1Var19 = w2a1.f247311a;
                c2537wj21.invokeSuspend(w2a1Var19);
                return w2a1Var19;
            case 21:
                C2537wj c2537wj22 = new C2537wj(3, 21, fbkVar);
                c2537wj22.f251779b = th;
                w2a1 w2a1Var20 = w2a1.f247311a;
                c2537wj22.invokeSuspend(w2a1Var20);
                return w2a1Var20;
            case 22:
                C2537wj c2537wj23 = new C2537wj(3, 22, fbkVar);
                c2537wj23.f251779b = th;
                w2a1 w2a1Var21 = w2a1.f247311a;
                c2537wj23.invokeSuspend(w2a1Var21);
                return w2a1Var21;
            case 23:
                C2537wj c2537wj24 = new C2537wj(3, 23, fbkVar);
                c2537wj24.f251779b = th;
                w2a1 w2a1Var22 = w2a1.f247311a;
                c2537wj24.invokeSuspend(w2a1Var22);
                return w2a1Var22;
            case 24:
                C2537wj c2537wj25 = new C2537wj(3, 24, fbkVar);
                c2537wj25.f251779b = th;
                w2a1 w2a1Var23 = w2a1.f247311a;
                c2537wj25.invokeSuspend(w2a1Var23);
                return w2a1Var23;
            case 25:
                C2537wj c2537wj26 = new C2537wj(3, 25, fbkVar);
                c2537wj26.f251779b = th;
                w2a1 w2a1Var24 = w2a1.f247311a;
                c2537wj26.invokeSuspend(w2a1Var24);
                return w2a1Var24;
            case 26:
                C2537wj c2537wj27 = new C2537wj(3, 26, fbkVar);
                c2537wj27.f251779b = th;
                w2a1 w2a1Var25 = w2a1.f247311a;
                c2537wj27.invokeSuspend(w2a1Var25);
                return w2a1Var25;
            case 27:
                C2537wj c2537wj28 = new C2537wj(3, 27, fbkVar);
                c2537wj28.f251779b = th;
                c2537wj28.invokeSuspend(w2a1.f247311a);
                throw null;
            case 28:
                C2537wj c2537wj29 = new C2537wj(3, 28, fbkVar);
                c2537wj29.f251779b = th;
                c2537wj29.invokeSuspend(w2a1.f247311a);
                throw null;
            default:
                C2537wj c2537wj30 = new C2537wj(3, 29, fbkVar);
                c2537wj30.f251779b = th;
                w2a1 w2a1Var26 = w2a1.f247311a;
                c2537wj30.invokeSuspend(w2a1Var26);
                return w2a1Var26;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f251778a) {
            case 0:
                Throwable th = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th, "Error converting accessories to AudioOutputs", new Object[0]);
                return w2a1.f247311a;
            case 1:
                Throwable th2 = this.f251779b;
                bga.m29073P(obj);
                String message = th2.getMessage();
                if (message == null) {
                    message = "Error AdCarModeObserver";
                }
                na6.m63957e(message);
                return w2a1.f247311a;
            case 2:
                Throwable th3 = this.f251779b;
                bga.m29073P(obj);
                String message2 = th3.getMessage();
                if (message2 == null) {
                    message2 = "Error AdDataSaverObserver";
                }
                na6.m63957e(message2);
                return w2a1.f247311a;
            case 3:
                Throwable th4 = this.f251779b;
                bga.m29073P(obj);
                Objects.toString(th4.getCause());
                return w2a1.f247311a;
            case 4:
                Throwable th5 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th5, "Error blocking video playback", new Object[0]);
                return w2a1.f247311a;
            case 5:
                Throwable th6 = this.f251779b;
                bga.m29073P(obj);
                if (th6 instanceof CancellationException) {
                    throw th6;
                }
                return w2a1.f247311a;
            case 6:
                Throwable th7 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3973i("Exception caught in NetworkReporter " + th7, new Object[0]);
                return w2a1.f247311a;
            case 7:
                Throwable th8 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th8, "Error while fetching bluetooth devices on foreground event", new Object[0]);
                return w2a1.f247311a;
            case 8:
                Throwable th9 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3966b("CarConnectionAccessoryProvider: Error in carConnectionObserver " + th9, new Object[0]);
                return w2a1.f247311a;
            case 9:
                Throwable th10 = this.f251779b;
                bga.m29073P(obj);
                if (th10 instanceof CancellationException) {
                    throw th10;
                }
                return w2a1.f247311a;
            case 10:
                Throwable th11 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th11, "ConditionsChangeObserver: Failed. Its OK! We will catch this error in another chain (i.e. we don't want multiple chain failures)", new Object[0]);
                return w2a1.f247311a;
            case 11:
                Throwable th12 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th12, "Error observing AvailableAudioOutputs", new Object[0]);
                return w2a1.f247311a;
            case 12:
                Throwable th13 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th13, "Error observing RecommendedLocalIdentifiers", new Object[0]);
                return w2a1.f247311a;
            case 13:
                Throwable th14 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th14, s571.m77251j("Error fetching connect state ", th14.getMessage(), " "), new Object[0]);
                throw th14;
            case 14:
                Throwable th15 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3966b(edb.m38564m("Error fetching install spotify state ", th15.getMessage()), new Object[0]);
                throw th15;
            case 15:
                Throwable th16 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th16, "ContextMenuComponentImpl failed to observe commonEventUtils.events.", new Object[0]);
                return w2a1.f247311a;
            case 16:
                Throwable th17 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th17, "There was a problem observing player commands", new Object[0]);
                return w2a1.f247311a;
            case 17:
                Throwable th18 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3974j(th18, "Failed to detect viewable impression timing.", new Object[0]);
                return w2a1.f247311a;
            case 18:
                Throwable th19 = this.f251779b;
                bga.m29073P(obj);
                na6.m63972t("SubscribeUserToCreatorTimestamp stream failed", th19);
                return w2a1.f247311a;
            case 19:
                Throwable th20 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th20, "Error in accessory flow", new Object[0]);
                return w2a1.f247311a;
            case 20:
                Throwable th21 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th21, "Error in events flow", new Object[0]);
                return w2a1.f247311a;
            case 21:
                Throwable th22 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th22, "Error in routes categorization flow", new Object[0]);
                return w2a1.f247311a;
            case 22:
                Throwable th23 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th23, "Error subscribing to player state", new Object[0]);
                return w2a1.f247311a;
            case 23:
                Throwable th24 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th24, "Something unexpected happened when listening for triggers.", new Object[0]);
                return w2a1.f247311a;
            case 24:
                Throwable th25 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th25, "Failed to observe reachability for cue-pipeline Gabito logging", new Object[0]);
                return w2a1.f247311a;
            case 25:
                Throwable th26 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3966b("GlassesConnectionAccessoryProvider: Error in glassesConnectionObserver " + th26, new Object[0]);
                return w2a1.f247311a;
            case 26:
                Throwable th27 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th27, "[CAL] Error getting queue permissions", new Object[0]);
                return w2a1.f247311a;
            case 27:
                Throwable th28 = this.f251779b;
                bga.m29073P(obj);
                if (th28 instanceof TimeoutCancellationException) {
                    throw new TimeoutException();
                }
                throw th28;
            case 28:
                Throwable th29 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3966b("EIS: Couldn't load list, error: %s", th29.getMessage());
                throw th29;
            default:
                Throwable th30 = this.f251779b;
                bga.m29073P(obj);
                Logger.m3967c(th30, "GOS->Error updating MediaRouteDescriptors", new Object[0]);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2537wj(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f251778a = i2;
    }
}
