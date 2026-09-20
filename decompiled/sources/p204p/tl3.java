package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: classes3.dex */
public final class tl3 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ul3 f221312a;

    public tl3(ul3 ul3Var) {
        this.f221312a = ul3Var;
    }

    @Override // com.spotify.mobius.functions.Function
    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        ql3 ql3Var = new ql3();
        ul3 ul3Var = this.f221312a;
        ic3 ic3Var = ul3Var.f231419c;
        wj50.m88279p(consumer);
        return edb.m38558g(Mobius.m15582d(ql3Var, RxConnectables.m15653a(ic3Var.m50225a(consumer)))).mo15592d(new rl3(ul3Var)).mo15590b(new sl3(ul3Var));
    }
}
