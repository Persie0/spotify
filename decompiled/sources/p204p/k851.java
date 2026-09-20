package p204p;

import com.spotify.mobius.Connectable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class k851 implements bta0 {

    /* JADX INFO: renamed from: a */
    public final ijc1 f120250a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f120251b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f120252c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f120253d = new ArrayList();

    public k851(ijc1 ijc1Var) {
        this.f120250a = ijc1Var;
    }

    @Override // p204p.bta0
    /* JADX INFO: renamed from: a */
    public final void mo30460a(Class cls, Class cls2, Class cls3, Object obj, wsa0 wsa0Var) {
        this.f120251b.put(cls, obj);
        this.f120252c.add(new taj(cls, cls2, cls3, wsa0Var));
    }

    @Override // p204p.bta0
    /* JADX INFO: renamed from: b */
    public final void mo30461b(Class cls, Connectable connectable) {
        this.f120253d.add(new rxh0(cls, connectable));
    }
}
