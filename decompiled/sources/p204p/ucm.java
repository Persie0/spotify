package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ucm extends d6a0 implements w3x0 {

    /* JADX INFO: renamed from: d */
    public final viz f229082d;

    /* JADX INFO: renamed from: e */
    public zmz f229083e;

    public ucm(viz vizVar) {
        this.f229082d = vizVar;
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        this.f229083e = (zmz) bundle.getParcelable("customization_flow_snapshot");
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        m35107j();
        m35106i();
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        this.f229082d.m85673c();
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        zv41 zv41Var = this.f229082d.f241830e;
        Map map = ((anz) zv41Var.getValue()).f17525a;
        List list = ((anz) zv41Var.getValue()).f17526b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c251(((x151) it.next()).f257068a));
        }
        bundle.putParcelable("customization_flow_snapshot", new zmz(map, arrayList));
        return bundle;
    }
}
