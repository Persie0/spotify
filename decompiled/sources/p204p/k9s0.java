package p204p;

import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes3.dex */
public final class k9s0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public int f120684a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f120685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ juk f120686c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f120687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9s0(juk jukVar, Context context, fbk fbkVar) {
        super(2, fbkVar);
        this.f120686c = jukVar;
        this.f120687d = context;
    }

    /* JADX INFO: renamed from: f */
    public static void m55841f(VirtualDeviceManager virtualDeviceManager, j9s0 j9s0Var, DisplayManager displayManager, i9s0 i9s0Var) {
        virtualDeviceManager.unregisterVirtualDeviceListener(j9s0Var);
        displayManager.unregisterDisplayListener(i9s0Var);
    }

    /* JADX INFO: renamed from: i */
    public static final void m55842i(sir0 sir0Var, Context context) {
        sir0Var.mo30231j(Boolean.valueOf(l9s0.m58519a(context)));
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        k9s0 k9s0Var = new k9s0(this.f120686c, this.f120687d, fbkVar);
        k9s0Var.f120685b = obj;
        return k9s0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((k9s0) create((sir0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f120684a;
        if (i == 0) {
            bga.m29073P(obj);
            sir0 sir0Var = (sir0) this.f120685b;
            luk lukVar = (luk) this.f120686c.mo26595B(luk.f137098b);
            if (lukVar == null) {
                throw new IllegalArgumentException("CoroutineContext must contain a CoroutineDispatcher.");
            }
            Context context = this.f120687d;
            j9s0 j9s0Var = new j9s0(sir0Var, context);
            i9s0 i9s0Var = new i9s0(sir0Var, context);
            sir0Var.mo30231j(Boolean.valueOf(l9s0.m58519a(context)));
            VirtualDeviceManager virtualDeviceManagerM89060d = wuk0.m89060d(context.getSystemService(wuk0.m89064j()));
            virtualDeviceManagerM89060d.registerVirtualDeviceListener(z2h1.m95212s(lukVar), j9s0Var);
            DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
            displayManager.registerDisplayListener(z2h1.m95212s(lukVar), 7L, i9s0Var);
            tq00 tq00Var = new tq00(virtualDeviceManagerM89060d, j9s0Var, displayManager, i9s0Var, 3);
            this.f120684a = 1;
            Object objM45540m = grl0.m45540m(sir0Var, tq00Var, this);
            yuk yukVar = yuk.f276404a;
            if (objM45540m == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }
}
