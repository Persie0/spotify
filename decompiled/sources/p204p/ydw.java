package p204p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ydw extends qfe {
    /* JADX WARN: Illegal instructions before constructor call */
    public ydw(qti0 qti0Var) {
        ehw ehwVar = ehw.f59682a;
        jfw jfwVar = ehw.f59683b;
        sma0 sma0Var = bna0.f28743e;
        List list = lau.f131415a;
        super(jfwVar, qti0Var, 3, 1, list, sma0Var);
        jfe jfeVar = new jfe(this, null, e370.f55667h, true, 1, du31.f52959o0);
        jfeVar.m53173W1(list, vxq.f245810e);
        ggw ggwVarM39005a = ehw.m39005a(9, false, (String[]) Arrays.copyOf(new String[]{jfeVar.getName().f192387a, ""}, 2));
        chw chwVar = chw.ERROR_CLASS;
        jfeVar.f177802h = new zgw(ehw.m39007c(chwVar, new String[0]), ggwVarM39005a, chwVar, list, false, new String[0]);
        m72710A0(ggwVarM39005a, Collections.singleton(jfeVar), jfeVar);
    }

    @Override // p204p.AbstractC1803e6, p204p.kxh0
    /* JADX INFO: renamed from: j */
    public final bfe0 mo30965j(mo91 mo91Var, ld70 ld70Var) {
        String[] strArr = {getName().f192387a, mo91Var.toString()};
        ehw ehwVar = ehw.f59682a;
        return ehw.m39005a(9, false, (String[]) Arrays.copyOf(strArr, 2));
    }

    @Override // p204p.qfe
    public final String toString() {
        return getName().m73844b();
    }

    @Override // p204p.AbstractC1803e6, p204p.yu51
    /* JADX INFO: renamed from: f */
    public final qqo mo29932f(oo91 oo91Var) {
        return this;
    }

    @Override // p204p.AbstractC1803e6
    /* JADX INFO: renamed from: x0 */
    public final nfe mo29932f(oo91 oo91Var) {
        return this;
    }
}
