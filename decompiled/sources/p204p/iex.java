package p204p;

import com.spotify.home.evopage.mobius.State;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class iex implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jex f101569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PublishSubject f101570b;

    public iex(jex jexVar, PublishSubject publishSubject) {
        this.f101569a = jexVar;
        this.f101570b = publishSubject;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        State state = (State) obj;
        jex jexVar = this.f101569a;
        xoi0 xoi0Var = jexVar.f111686M0;
        q530 q530Var = jexVar.f111703g;
        xoi0Var.m33101j(state);
        if (state instanceof State.Error) {
            jexVar.m35105h(((State.Error) state).getError());
            q530Var.mo40812p(h630.f87988i);
            q530Var.mo40809m(2, jexVar.f111700d);
            return;
        }
        if (!(state instanceof State.Content)) {
            if (!(state instanceof State.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        a630 a630VarMo40804h = q530Var.mo40804h();
        if (a630VarMo40804h != null) {
            jexVar.f111696W0 = a630VarMo40804h;
        }
        State.Content content = (State.Content) state;
        this.f101570b.onNext(content.getModel());
        zfx zfxVar = jexVar.f111702f;
        if (zfxVar.f282446g) {
            return;
        }
        try {
            Set set = zfxVar.f282444e;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                xir xirVarMo25749b = ((p450) it.next()).mo25749b(content.getModel());
                if (xirVarMo25749b != null) {
                    arrayList.add(xirVarMo25749b);
                }
            }
            xir.m91156b(arrayList).m91159e(content.getModel());
        } catch (IllegalStateException e) {
            na6.m63972t("EvoServiceOrchestrator.onContentChanged IllegalStateException", e);
        }
    }
}
