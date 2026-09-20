package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ws30 implements fk30 {

    /* JADX INFO: renamed from: a */
    public final Object f254499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xs30 f254500b;

    public ws30(xs30 xs30Var, fk30 fk30Var) {
        this.f254500b = xs30Var;
        this.f254499a = fk30Var;
    }

    @Override // p204p.fk30
    public final List childGroup(String str) {
        List listChildren = children();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listChildren) {
            if (wj50.m88271j(((fk30) obj).group(), "primary_buttons")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p204p.fk30
    public final List children() {
        List listChildren = ((fk30) this.f254499a).children();
        List list = Collections.EMPTY_LIST;
        if (listChildren == list) {
            return list;
        }
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        return listChildren == wsv0Var ? wsv0Var : new vs30(this.f254500b, listChildren);
    }

    @Override // p204p.fk30
    public final bk30 componentId() {
        return ((fk30) this.f254499a).componentId();
    }

    @Override // p204p.fk30
    public final wj30 custom() {
        return ((fk30) this.f254499a).custom();
    }

    @Override // p204p.fk30
    public final Map events() {
        return ((fk30) this.f254499a).events();
    }

    @Override // p204p.fk30
    public final String group() {
        return ((fk30) this.f254499a).group();
    }

    @Override // p204p.fk30
    /* JADX INFO: renamed from: id */
    public final String mo41867id() {
        return ((fk30) this.f254499a).mo41867id();
    }

    @Override // p204p.fk30
    public final dk30 images() {
        return ((fk30) this.f254499a).images();
    }

    @Override // p204p.fk30
    public final wj30 logging() {
        return ((fk30) this.f254499a).logging();
    }

    @Override // p204p.fk30
    public final wj30 metadata() {
        return ((fk30) this.f254499a).metadata();
    }

    @Override // p204p.fk30
    public final it30 target() {
        return ((fk30) this.f254499a).target();
    }

    @Override // p204p.fk30
    public final qk30 text() {
        return ((fk30) this.f254499a).text();
    }

    @Override // p204p.fk30
    public final ek30 toBuilder() {
        wr30.Companion.getClass();
        return tr30.m81340c(this).toBuilder();
    }
}
