package p204p;

import com.google.common.collect.BiMap;

/* JADX INFO: loaded from: classes4.dex */
public final class vsv0 extends ze40 {

    /* JADX INFO: renamed from: i */
    public static final vsv0 f244500i = new vsv0();

    /* JADX INFO: renamed from: d */
    public final transient Object f244501d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f244502e;

    /* JADX INFO: renamed from: f */
    public final transient int f244503f;

    /* JADX INFO: renamed from: g */
    public final transient int f244504g;

    /* JADX INFO: renamed from: h */
    public final transient vsv0 f244505h;

    public vsv0() {
        this.f244501d = null;
        this.f244502e = new Object[0];
        this.f244503f = 0;
        this.f244504g = 0;
        this.f244505h = this;
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: d */
    public final hg40 mo30472d() {
        return new ysv0(this, this.f244502e, this.f244503f, this.f244504g);
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: e */
    public final hg40 mo30473e() {
        return new zsv0(this, new atv0(this.f244503f, this.f244504g, this.f244502e));
    }

    @Override // p204p.xf40, java.util.Map
    public final Object get(Object obj) {
        Object objM30471s = btv0.m30471s(this.f244504g, this.f244503f, this.f244501d, obj, this.f244502e);
        if (objM30471s == null) {
            return null;
        }
        return objM30471s;
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // com.google.common.collect.BiMap
    public final BiMap inverse() {
        return this.f244505h;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f244504g;
    }

    @Override // p204p.ze40, p204p.xf40
    public Object writeReplace() {
        return super.writeReplace();
    }

    public vsv0(int i, Object[] objArr) {
        this.f244502e = objArr;
        this.f244504g = i;
        this.f244503f = 0;
        int iM47403m = i >= 2 ? hg40.m47403m(i) : 0;
        Object objM30470r = btv0.m30470r(objArr, i, iM47403m, 0);
        if (!(objM30470r instanceof Object[])) {
            this.f244501d = objM30470r;
            Object objM30470r2 = btv0.m30470r(objArr, i, iM47403m, 1);
            if (!(objM30470r2 instanceof Object[])) {
                this.f244505h = new vsv0(objM30470r2, objArr, i, this);
                return;
            }
            throw ((uf40) ((Object[]) objM30470r2)[2]).m82952a();
        }
        throw ((uf40) ((Object[]) objM30470r)[2]).m82952a();
    }

    public vsv0(Object obj, Object[] objArr, int i, vsv0 vsv0Var) {
        this.f244501d = obj;
        this.f244502e = objArr;
        this.f244503f = 1;
        this.f244504g = i;
        this.f244505h = vsv0Var;
    }
}
