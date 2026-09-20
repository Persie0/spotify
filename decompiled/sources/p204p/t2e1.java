package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes11.dex */
public final class t2e1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jhc1 f216511b;

    public /* synthetic */ t2e1(jhc1 jhc1Var, int i) {
        this.f216510a = i;
        this.f216511b = jhc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m79906b(Set set, fbk fbkVar) {
        s2e1 s2e1Var;
        x2e1 x2e1Var;
        switch (this.f216510a) {
            case 0:
                if (fbkVar instanceof s2e1) {
                    s2e1Var = (s2e1) fbkVar;
                    int i = s2e1Var.f204998c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        s2e1Var.f204998c = i - Integer.MIN_VALUE;
                    } else {
                        s2e1Var = new s2e1(this, fbkVar);
                    }
                } else {
                    s2e1Var = new s2e1(this, fbkVar);
                }
                Object obj = s2e1Var.f204996a;
                int i2 = s2e1Var.f204998c;
                Object obj2 = w2a1.f247311a;
                try {
                    if (i2 == 0) {
                        bga.m29073P(obj);
                        jhc1 jhc1Var = this.f216511b;
                        s2e1Var.f204998c = 1;
                        Object objM53380e = jhc1Var.m53380e("/workout_coaching", "com.spotify.wear.coaching.disabled.uris", set, s2e1Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM53380e != yukVar) {
                            objM53380e = obj2;
                        }
                        if (objM53380e == yukVar) {
                            obj2 = yukVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    Logger.m3967c(th, "Failed to publish coaching preferences to watch", new Object[0]);
                }
                return obj2;
            default:
                if (fbkVar instanceof x2e1) {
                    x2e1Var = (x2e1) fbkVar;
                    int i3 = x2e1Var.f257458c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        x2e1Var.f257458c = i3 - Integer.MIN_VALUE;
                    } else {
                        x2e1Var = new x2e1(this, fbkVar);
                    }
                } else {
                    x2e1Var = new x2e1(this, fbkVar);
                }
                Object obj3 = x2e1Var.f257456a;
                int i4 = x2e1Var.f257458c;
                Object obj4 = w2a1.f247311a;
                try {
                    if (i4 == 0) {
                        bga.m29073P(obj3);
                        jhc1 jhc1Var2 = this.f216511b;
                        x2e1Var.f257458c = 1;
                        Object objM53380e2 = jhc1Var2.m53380e("/workout_mode", "com.spotify.wear.workout.disabled.uris", set, x2e1Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objM53380e2 != yukVar2) {
                            objM53380e2 = obj4;
                        }
                        if (objM53380e2 == yukVar2) {
                            obj4 = yukVar2;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj3);
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    Logger.m3967c(th2, "Failed to publish workout preferences to watch", new Object[0]);
                }
                return obj4;
        }
    }

    @Override // p204p.niz
    public final /* bridge */ /* synthetic */ Object emit(Object obj, fbk fbkVar) {
        switch (this.f216510a) {
            case 0:
                break;
        }
        return m79906b((Set) obj, fbkVar);
    }
}
