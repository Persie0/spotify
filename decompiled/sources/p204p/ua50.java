package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes2.dex */
public final class ua50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wa50 f228386a;

    public ua50(wa50 wa50Var) {
        this.f228386a = wa50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ta50 ta50Var;
        if (ibkVar instanceof ta50) {
            ta50Var = (ta50) ibkVar;
            int i = ta50Var.f218457b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta50Var.f218457b = i - Integer.MIN_VALUE;
            } else {
                ta50Var = new ta50(this, ibkVar);
            }
        } else {
            ta50Var = new ta50(this, ibkVar);
        }
        Object obj2 = ta50Var.f218456a;
        int i2 = ta50Var.f218457b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ba50 ba50Var = (ba50) obj;
                aj2 aj2Var = this.f228386a.f249400t;
                String str = ba50Var.f25092a;
                qvw0 qvw0Var = new qvw0(null, "home_dj", new j741(ba50Var.f25093b, ba50Var.f25094c), (String) null, WidgetInteraction.Background.DESTINATION_HOME, 25);
                ta50Var.f218459d = ba50Var;
                ta50Var.f218457b = 1;
                obj = ((ck2) aj2Var).m33056M(str, qvw0Var, ta50Var);
                yuk yukVar = yuk.f276404a;
                if (obj == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = ta50Var.f218459d;
                bga.m29073P(obj2);
            }
        } catch (Exception e) {
            na6.m63972t("Effect handling failed for " + obj, e);
        }
        return w2a1.f247311a;
    }
}
